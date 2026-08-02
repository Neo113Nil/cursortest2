package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkManagerImpl;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger$LogcatLogger.get().debug(TAG, "Received intent " + intent);
        try {
            WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (WorkManagerImpl.sLock) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = instance$1.mRescheduleReceiverResult;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    instance$1.mRescheduleReceiverResult = goAsync;
                    if (instance$1.mForceStopRunnableCompleted) {
                        goAsync.finish();
                        instance$1.mRescheduleReceiverResult = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            Logger$LogcatLogger.get().error(TAG, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
