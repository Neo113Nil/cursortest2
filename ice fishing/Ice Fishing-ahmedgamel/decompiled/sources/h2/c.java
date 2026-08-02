package h2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import i2.InterfaceC4590d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38086a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4590d f38087b;

    /* renamed from: c, reason: collision with root package name */
    public final C4572a f38088c;

    public c(Context context, InterfaceC4590d interfaceC4590d, C4572a c4572a) {
        this.f38086a = context;
        this.f38087b = interfaceC4590d;
        this.f38088c = c4572a;
    }

    public final void a(b2.i iVar, int i, boolean z6) {
        Context context = this.f38086a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f5537a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        Y1.d dVar = iVar.f5539c;
        adler32.update(allocate.putInt(l2.a.a(dVar)).array());
        byte[] bArr = iVar.f5538b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z6) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 >= i) {
                        Z2.d.i("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase b9 = ((i2.h) this.f38087b).b();
        String valueOf = String.valueOf(l2.a.a(dVar));
        String str = iVar.f5537a;
        Cursor rawQuery = b9.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C4572a c4572a = this.f38088c;
            builder.setMinimumLatency(c4572a.a(dVar, longValue, i));
            Set set = ((C4573b) c4572a.f38082b.get(dVar)).f38085c;
            if (set.contains(d.f38089n)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.f38091v)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f38090u)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", l2.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(c4572a.a(dVar, longValue, i)), valueOf2, Integer.valueOf(i)};
            String l9 = Z2.d.l("JobInfoScheduler");
            if (Log.isLoggable(l9, 3)) {
                Log.d(l9, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
