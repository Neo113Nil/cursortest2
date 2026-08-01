package f2;

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
import g2.InterfaceC4527d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37462a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4527d f37463b;

    /* renamed from: c, reason: collision with root package name */
    public final C4507a f37464c;

    public c(Context context, InterfaceC4527d interfaceC4527d, C4507a c4507a) {
        this.f37462a = context;
        this.f37463b = interfaceC4527d;
        this.f37464c = c4507a;
    }

    public final void a(Z1.i iVar, int i, boolean z3) {
        Context context = this.f37462a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(iVar.f4148a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        W1.d dVar = iVar.f4150c;
        adler32.update(allocate.putInt(j2.a.a(dVar)).array());
        byte[] bArr = iVar.f4149b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i6 >= i) {
                        O3.b.i("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase b9 = ((g2.h) this.f37463b).b();
        String valueOf = String.valueOf(j2.a.a(dVar));
        String str = iVar.f4148a;
        Cursor rawQuery = b9.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C4507a c4507a = this.f37464c;
            builder.setMinimumLatency(c4507a.a(dVar, longValue, i));
            Set set = ((C4508b) c4507a.f37458b.get(dVar)).f37461c;
            if (set.contains(d.f37465n)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(d.f37467v)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(d.f37466u)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", j2.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(c4507a.a(dVar, longValue, i)), valueOf2, Integer.valueOf(i)};
            String w6 = O3.b.w("JobInfoScheduler");
            if (Log.isLoggable(w6, 3)) {
                Log.d(w6, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
