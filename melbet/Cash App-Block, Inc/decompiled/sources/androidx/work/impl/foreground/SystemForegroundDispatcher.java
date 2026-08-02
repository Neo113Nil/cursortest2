package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.room.Room;
import androidx.work.ForegroundInfo;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.Job;
import okhttp3.Headers;

/* loaded from: classes3.dex */
public final class SystemForegroundDispatcher implements OnConstraintsStateChangedListener, ExecutionListener {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("SystemFgDispatcher");
    public SystemForegroundService mCallback;
    public final Headers.Builder mConstraintsTracker;
    public WorkGenerationalId mCurrentForegroundId;
    public final LinkedHashMap mForegroundInfoById;
    public final Object mLock = new Object();
    public final TaskExecutor mTaskExecutor;
    public final HashMap mTrackedWorkSpecs;
    public final WorkManagerImpl mWorkManagerImpl;
    public final HashMap mWorkSpecById;

    public SystemForegroundDispatcher(Context context) {
        WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
        this.mWorkManagerImpl = instance$1;
        this.mTaskExecutor = instance$1.mWorkTaskExecutor;
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = new Headers.Builder(instance$1.mTrackers);
        instance$1.mProcessor.addExecutionListener(this);
    }

    public static Intent createStartForegroundIntent(Context context, WorkGenerationalId workGenerationalId, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.workSpecId);
        intent.putExtra("KEY_GENERATION", workGenerationalId.generation);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.mNotificationId);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.mForegroundServiceType);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.mNotification);
        return intent;
    }

    public static Intent createStopForegroundIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public final void handleNotify(Intent intent) {
        if (this.mCallback == null) {
            a$$ExternalSyntheticBUOutline0.m$1("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Notifying with (id:", intExtra, ", workSpecId: ", stringExtra, ", notificationType :");
        m.append(intExtra2);
        m.append(")");
        logger$LogcatLogger.debug(TAG, m.toString());
        if (notification == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Notification passed in the intent was null.");
            return;
        }
        ForegroundInfo foregroundInfo = new ForegroundInfo(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.mForegroundInfoById;
        linkedHashMap.put(workGenerationalId, foregroundInfo);
        ForegroundInfo foregroundInfo2 = (ForegroundInfo) linkedHashMap.get(this.mCurrentForegroundId);
        if (foregroundInfo2 == null) {
            this.mCurrentForegroundId = workGenerationalId;
        } else {
            this.mCallback.mNotificationManager.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).mForegroundServiceType;
            }
            foregroundInfo = new ForegroundInfo(foregroundInfo2.mNotificationId, i, foregroundInfo2.mNotification);
        }
        this.mCallback.startForeground(foregroundInfo.mNotificationId, foregroundInfo.mForegroundServiceType, foregroundInfo.mNotification);
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.id;
            Logger$LogcatLogger.get().debug(TAG, "Constraints unmet for WorkSpec " + str);
            WorkGenerationalId generationalId = Room.generationalId(workSpec);
            int i = ((ConstraintsState.ConstraintsNotMet) constraintsState).reason;
            WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
            TaskExecutor taskExecutor = workManagerImpl.mWorkTaskExecutor;
            StopWorkRunnable stopWorkRunnable = new StopWorkRunnable(workManagerImpl.mProcessor, new StartStopToken(generationalId), true, i);
            taskExecutor.getClass();
            ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor.execute(stopWorkRunnable);
        }
    }

    public final void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            try {
                Iterator it = this.mTrackedWorkSpecs.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Processor processor = this.mWorkManagerImpl.mProcessor;
        synchronized (processor.mLock) {
            processor.mOuterListeners.remove(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        Map.Entry entry;
        synchronized (this.mLock) {
            try {
                Job job = ((WorkSpec) this.mWorkSpecById.remove(workGenerationalId)) != null ? (Job) this.mTrackedWorkSpecs.remove(workGenerationalId) : null;
                if (job != null) {
                    job.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.mForegroundInfoById.remove(workGenerationalId);
        if (workGenerationalId.equals(this.mCurrentForegroundId)) {
            if (this.mForegroundInfoById.size() > 0) {
                Iterator it = this.mForegroundInfoById.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.mCurrentForegroundId = (WorkGenerationalId) entry.getKey();
                if (this.mCallback != null) {
                    ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                    this.mCallback.startForeground(foregroundInfo2.mNotificationId, foregroundInfo2.mForegroundServiceType, foregroundInfo2.mNotification);
                    this.mCallback.mNotificationManager.cancel(foregroundInfo2.mNotificationId);
                }
            } else {
                this.mCurrentForegroundId = null;
            }
        }
        SystemForegroundService systemForegroundService = this.mCallback;
        if (foregroundInfo == null || systemForegroundService == null) {
            return;
        }
        Logger$LogcatLogger.get().debug(TAG, "Removing Notification (id: " + foregroundInfo.mNotificationId + ", workSpecId: " + workGenerationalId + ", notificationType: " + foregroundInfo.mForegroundServiceType);
        systemForegroundService.mNotificationManager.cancel(foregroundInfo.mNotificationId);
    }

    public final void onTimeout(int i, int i2) {
        Logger$LogcatLogger.get().info(TAG, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.mForegroundInfoById.entrySet()) {
            if (((ForegroundInfo) entry.getValue()).mForegroundServiceType == i2) {
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) entry.getKey();
                WorkManagerImpl workManagerImpl = this.mWorkManagerImpl;
                TaskExecutor taskExecutor = workManagerImpl.mWorkTaskExecutor;
                StopWorkRunnable stopWorkRunnable = new StopWorkRunnable(workManagerImpl.mProcessor, new StartStopToken(workGenerationalId), true, -128);
                taskExecutor.getClass();
                ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor.execute(stopWorkRunnable);
            }
        }
        SystemForegroundService systemForegroundService = this.mCallback;
        if (systemForegroundService != null) {
            systemForegroundService.mIsShutdown = true;
            Logger$LogcatLogger.get().debug(SystemForegroundService.TAG, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
