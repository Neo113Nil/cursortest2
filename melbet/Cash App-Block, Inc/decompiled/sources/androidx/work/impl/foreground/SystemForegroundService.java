package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.room.TransactionExecutor;
import androidx.work.Logger$LogcatLogger;
import androidx.work.SystemClock;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.bugsnag.android.Client;
import java.util.UUID;

/* loaded from: classes3.dex */
public class SystemForegroundService extends Service implements LifecycleOwner {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("SystemFgService");
    public final Recorder.AnonymousClass3 dispatcher = new Recorder.AnonymousClass3(this);
    public SystemForegroundDispatcher mDispatcher;
    public boolean mIsShutdown;
    public NotificationManager mNotificationManager;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (LifecycleRegistry) this.dispatcher.val$completer;
    }

    public final void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        if (systemForegroundDispatcher.mCallback != null) {
            Logger$LogcatLogger.get().error(SystemForegroundDispatcher.TAG, "A callback already exists.");
        } else {
            systemForegroundDispatcher.mCallback = this;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        Recorder.AnonymousClass3 anonymousClass3 = this.dispatcher;
        anonymousClass3.getClass();
        anonymousClass3.postDispatchRunnable(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        onCreate$androidx$lifecycle$LifecycleService();
        initializeDispatcher();
    }

    public final void onCreate$androidx$lifecycle$LifecycleService() {
        Recorder.AnonymousClass3 anonymousClass3 = this.dispatcher;
        anonymousClass3.getClass();
        anonymousClass3.postDispatchRunnable(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        onDestroy$androidx$lifecycle$LifecycleService();
        this.mDispatcher.onDestroy();
    }

    public final void onDestroy$androidx$lifecycle$LifecycleService() {
        Recorder.AnonymousClass3 anonymousClass3 = this.dispatcher;
        anonymousClass3.getClass();
        anonymousClass3.postDispatchRunnable(Lifecycle.Event.ON_STOP);
        anonymousClass3.postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        Recorder.AnonymousClass3 anonymousClass3 = this.dispatcher;
        anonymousClass3.getClass();
        anonymousClass3.postDispatchRunnable(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.mIsShutdown;
        String str = TAG;
        if (z) {
            Logger$LogcatLogger.get().info(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        SystemForegroundDispatcher systemForegroundDispatcher = this.mDispatcher;
        systemForegroundDispatcher.getClass();
        String str2 = SystemForegroundDispatcher.TAG;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            Logger$LogcatLogger.get().info(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            TaskExecutor taskExecutor = systemForegroundDispatcher.mTaskExecutor;
            Client.AnonymousClass4 anonymousClass4 = new Client.AnonymousClass4(systemForegroundDispatcher, stringExtra, false, 9);
            taskExecutor.getClass();
            ((WorkManagerTaskExecutor) taskExecutor).mBackgroundExecutor.execute(anonymousClass4);
            systemForegroundDispatcher.handleNotify(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            systemForegroundDispatcher.handleNotify(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            Logger$LogcatLogger.get().info(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = systemForegroundDispatcher.mCallback;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.mIsShutdown = true;
            Logger$LogcatLogger.get().debug(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        Logger$LogcatLogger.get().info(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        WorkManagerImpl workManagerImpl = systemForegroundDispatcher.mWorkManagerImpl;
        UUID fromString = UUID.fromString(stringExtra2);
        workManagerImpl.getClass();
        fromString.getClass();
        SystemClock systemClock = workManagerImpl.mConfiguration.tracer;
        TransactionExecutor transactionExecutor = ((WorkManagerTaskExecutor) workManagerImpl.mWorkTaskExecutor).mBackgroundExecutor;
        transactionExecutor.getClass();
        BundleKt.launchOperation(systemClock, "CancelWorkById", transactionExecutor, new StatusRunnable$$ExternalSyntheticLambda1(1, workManagerImpl, fromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.onTimeout(i, 2048);
    }

    public final void startForeground(int i, int i2, Notification notification) {
        String str = TAG;
        if (Build.VERSION.SDK_INT < 31) {
            startForeground(i, notification, i2);
            return;
        }
        try {
            startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            if (Logger$LogcatLogger.get().mLoggingLevel <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            if (Logger$LogcatLogger.get().mLoggingLevel <= 5) {
                Log.w(str, "Unable to start foreground service", e2);
            }
        }
    }

    public final void onTimeout(int i, int i2) {
        this.mDispatcher.onTimeout(i, i2);
    }
}
