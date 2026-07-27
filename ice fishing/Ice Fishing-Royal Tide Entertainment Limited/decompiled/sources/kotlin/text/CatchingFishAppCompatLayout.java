package kotlin.text;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatLayout {
    public final CatchingFishKtorAsyncTask CatchingFishCoroutine;
    public final Context CatchingFishParcelableFAB;
    public final CatchingFishOkHttpFirebase CatchingFishSnackbar;

    public CatchingFishAppCompatLayout(Context context, CatchingFishOkHttpFirebase catchingFishOkHttpFirebase, CatchingFishKtorAsyncTask catchingFishKtorAsyncTask) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishOkHttpFirebase;
        this.CatchingFishCoroutine = catchingFishKtorAsyncTask;
    }

    public final void CatchingFishParcelableFAB(CatchingFishBundleMVIHilt catchingFishBundleMVIHilt, int i, boolean z) {
        Context context = this.CatchingFishParcelableFAB;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        String str = catchingFishBundleMVIHilt.CatchingFishParcelableFAB;
        String str2 = catchingFishBundleMVIHilt.CatchingFishParcelableFAB;
        adler32.update(str.getBytes(Charset.forName(Constants.ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        CatchingFishContextMVI catchingFishContextMVI = catchingFishBundleMVIHilt.CatchingFishCoroutine;
        adler32.update(allocate.putInt(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishContextMVI)).array());
        byte[] bArr = catchingFishBundleMVIHilt.CatchingFishSnackbar;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        CatchingFishToastHiltBundle.CatchingFishNavigation("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", catchingFishBundleMVIHilt);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((CatchingFishMVIView) this.CatchingFishSnackbar).CatchingFishSnackbar().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishContextMVI))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            CatchingFishKtorAsyncTask catchingFishKtorAsyncTask = this.CatchingFishCoroutine;
            builder.setMinimumLatency(catchingFishKtorAsyncTask.CatchingFishParcelableFAB(catchingFishContextMVI, longValue, i));
            Set set = ((CatchingFishWorkManagerView) catchingFishKtorAsyncTask.CatchingFishSnackbar.get(catchingFishContextMVI)).CatchingFishCoroutine;
            if (set.contains(CatchingFishPicassoGraphQL.CatchingFishReduxKtor)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(CatchingFishPicassoGraphQL.CatchingFishWorkManager)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(CatchingFishPicassoGraphQL.CatchingFishDaggerWebsocket)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", CatchingFishRoomGlide.CatchingFishParcelableFAB(catchingFishContextMVI));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {catchingFishBundleMVIHilt, Integer.valueOf(value), Long.valueOf(catchingFishKtorAsyncTask.CatchingFishParcelableFAB(catchingFishContextMVI, longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable(CatchingFishToastHiltBundle.CatchingFishSpannableWidget("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
