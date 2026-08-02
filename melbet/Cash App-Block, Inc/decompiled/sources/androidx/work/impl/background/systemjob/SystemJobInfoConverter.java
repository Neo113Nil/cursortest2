package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Logger$LogcatLogger;
import androidx.work.NetworkType;
import androidx.work.SystemClock;
import androidx.work.impl.model.WorkSpec;
import com.squareup.cash.video.views.ExoPlayerExtensionsKt;
import java.util.Set;

/* loaded from: classes.dex */
public final class SystemJobInfoConverter {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("SystemJobInfoConverter");
    public final SystemClock mClock;
    public final boolean mMarkImportantWhileForeground;
    public final ComponentName mWorkServiceComponent;

    public SystemJobInfoConverter(Context context, SystemClock systemClock, boolean z) {
        this.mClock = systemClock;
        this.mWorkServiceComponent = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.mMarkImportantWhileForeground = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo convert(WorkSpec workSpec, int i) {
        int i2;
        String str;
        Constraints constraints = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.generation);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.mWorkServiceComponent);
        boolean z = constraints.requiresCharging;
        Set<Constraints.ContentUriTrigger> set = constraints.contentUriTriggers;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = constraints.requiresDeviceIdle;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest requiredNetworkRequest = constraints.getRequiredNetworkRequest();
        if (requiredNetworkRequest != null) {
            ExoPlayerExtensionsKt.setRequiredNetworkRequest(extras, requiredNetworkRequest);
        } else {
            NetworkType networkType = constraints.requiredNetworkType;
            if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
                int ordinal = networkType.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4) {
                                    Logger$LogcatLogger.get().debug(TAG, "API version too low. Cannot convert network type value " + networkType);
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z2) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long calculateNextRunTime = workSpec.calculateNextRunTime();
        this.mClock.getClass();
        long max = Math.max(calculateNextRunTime - System.currentTimeMillis(), 0L);
        if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited && this.mMarkImportantWhileForeground) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (Constraints.ContentUriTrigger contentUriTrigger : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(contentUriTrigger.getUri(), contentUriTrigger.isTriggeredForDescendants() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(constraints.contentTriggerUpdateDelayMillis);
            extras.setTriggerContentMaxDelay(constraints.contentTriggerMaxDelayMillis);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(constraints.requiresBatteryNotLow);
        extras.setRequiresStorageNotLow(constraints.requiresStorageNotLow);
        Object[] objArr = workSpec.runAttemptCount > 0;
        boolean z3 = max > 0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && workSpec.expedited && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i3 >= 35 && (str = workSpec.traceTag) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
