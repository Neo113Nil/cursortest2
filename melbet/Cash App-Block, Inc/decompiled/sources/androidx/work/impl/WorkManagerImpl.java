package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.camera.video.VideoEncoderSession;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionExecutor;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.SystemClock;
import androidx.work.WorkManager;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$6$1;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$1;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class WorkManagerImpl extends WorkManager {
    public static WorkManagerImpl sDefaultInstance;
    public static WorkManagerImpl sDelegatedInstance;
    public static final Object sLock;
    public final Configuration mConfiguration;
    public final Context mContext;
    public boolean mForceStopRunnableCompleted = false;
    public final MemoryCacheService mPreferenceUtils;
    public final Processor mProcessor;
    public BroadcastReceiver.PendingResult mRescheduleReceiverResult;
    public final List mSchedulers;
    public final Trackers mTrackers;
    public final WorkDatabase mWorkDatabase;
    public final TaskExecutor mWorkTaskExecutor;

    static {
        Logger$LogcatLogger.tagWithPrefix("WorkManagerImpl");
        sDelegatedInstance = null;
        sDefaultInstance = null;
        sLock = new Object();
    }

    public WorkManagerImpl(Context context, final Configuration configuration, TaskExecutor taskExecutor, final WorkDatabase workDatabase, final List list, Processor processor, Trackers trackers) {
        int i = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        Logger$LogcatLogger logger$LogcatLogger = new Logger$LogcatLogger(configuration.minimumLoggingLevel);
        synchronized (Logger$LogcatLogger.sLock) {
            try {
                if (Logger$LogcatLogger.sLogger == null) {
                    Logger$LogcatLogger.sLogger = logger$LogcatLogger;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mContext = applicationContext;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mProcessor = processor;
        this.mTrackers = trackers;
        this.mConfiguration = configuration;
        this.mSchedulers = list;
        WorkManagerTaskExecutor workManagerTaskExecutor = (WorkManagerTaskExecutor) taskExecutor;
        CoroutineDispatcher coroutineDispatcher = workManagerTaskExecutor.mTaskDispatcher;
        coroutineDispatcher.getClass();
        ContextScope CoroutineScope = JobKt.CoroutineScope(coroutineDispatcher);
        this.mPreferenceUtils = new MemoryCacheService(workDatabase, 21);
        final TransactionExecutor transactionExecutor = workManagerTaskExecutor.mBackgroundExecutor;
        String str = Schedulers.TAG;
        processor.addExecutionListener(new ExecutionListener() { // from class: androidx.work.impl.Schedulers$$ExternalSyntheticLambda0
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
                transactionExecutor.execute(new Schedulers$$ExternalSyntheticLambda1(list, workGenerationalId, configuration, workDatabase, 0));
            }
        });
        workManagerTaskExecutor.mBackgroundExecutor.execute(new ForceStopRunnable(applicationContext, this));
        String str2 = UnfinishedWorkListenerKt.TAG;
        if (ProcessUtils.isDefaultProcess(applicationContext, configuration)) {
            RoomDatabase roomDatabase = workDatabase.workSpecDao().__db;
            int i2 = 22;
            TransactorKt$$ExternalSyntheticLambda0 transactorKt$$ExternalSyntheticLambda0 = new TransactorKt$$ExternalSyntheticLambda0(i2);
            InvalidationTracker invalidationTracker = roomDatabase.getInvalidationTracker();
            int i3 = 1;
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            invalidationTracker.getClass();
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.implementation;
            Pair validateTableNames$room_runtime_release = triggerBasedInvalidationTracker.validateTableNames$room_runtime_release(strArr);
            String[] strArr2 = (String[]) validateTableNames$room_runtime_release.first;
            int[] iArr = (int[]) validateTableNames$room_runtime_release.second;
            strArr2.getClass();
            iArr.getClass();
            Continuation continuation = null;
            Flow safeFlow = new SafeFlow(new FlowQuery$asFlow$1(triggerBasedInvalidationTracker, iArr, strArr2, continuation, 4));
            VideoEncoderSession videoEncoderSession = invalidationTracker.multiInstanceInvalidationClient;
            AndroidPermissionChecker$granted$$inlined$map$1 createFlow = videoEncoderSession != null ? videoEncoderSession.createFlow(strArr2) : null;
            FlowKt.launchIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(FlowKt.buffer$default(new FinishSetupTileBadgeCounter(i2, new FlowUtil$createFlow$$inlined$map$1(FlowKt.buffer$default(createFlow != null ? FlowKt.merge(safeFlow, createFlow) : safeFlow, -1, 2), roomDatabase, transactorKt$$ExternalSyntheticLambda0, i), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, null)), -1, 2)), new BetterNavigator$6$1(applicationContext, continuation, i3), 3), CoroutineScope);
        }
    }

    public static WorkManagerImpl getInstance() {
        synchronized (sLock) {
            try {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                if (workManagerImpl != null) {
                    return workManagerImpl;
                }
                return sDefaultInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static WorkManagerImpl getInstance$1(Context context) {
        WorkManagerImpl workManagerImpl;
        synchronized (sLock) {
            try {
                workManagerImpl = getInstance();
                if (workManagerImpl == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return workManagerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.WorkManagerImpl.sDefaultInstance != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDefaultInstance = androidx.tracing.Trace.createWorkManager(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        androidx.work.impl.WorkManagerImpl.sDelegatedInstance = androidx.work.impl.WorkManagerImpl.sDefaultInstance;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void initialize(Context context, Configuration configuration) {
        synchronized (sLock) {
            try {
                WorkManagerImpl workManagerImpl = sDelegatedInstance;
                if (workManagerImpl != null && sDefaultInstance != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void onForceStopRunnableCompleted() {
        synchronized (sLock) {
            try {
                this.mForceStopRunnableCompleted = true;
                BroadcastReceiver.PendingResult pendingResult = this.mRescheduleReceiverResult;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.mRescheduleReceiverResult = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void rescheduleEligibleWork() {
        SystemClock systemClock = this.mConfiguration.tracer;
        ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1 = new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 21);
        systemClock.getClass();
        boolean isEnabled = Trace.isEnabled();
        if (isEnabled) {
            try {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("ReschedulingWork"));
            } finally {
                if (isEnabled) {
                    Trace.endSection();
                }
            }
        }
        imageLoader$Builder$$ExternalSyntheticLambda1.invoke();
    }
}
