package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.datastore.core.SimpleActor;
import androidx.room.Room;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger$LogcatLogger;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokensImpl;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.tasks.zzi;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class GreedyScheduler implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("GreedyScheduler");
    public final Configuration mConfiguration;
    public final Headers.Builder mConstraintsTracker;
    public final Context mContext;
    public final DelayedWorkTracker mDelayedWorkTracker;
    public Boolean mInDefaultProcess;
    public final Processor mProcessor;
    public boolean mRegisteredExecutionListener;
    public final TaskExecutor mTaskExecutor;
    public final SimpleActor mTimeLimiter;
    public final WorkLauncherImpl mWorkLauncher;
    public final HashMap mConstrainedWorkSpecs = new HashMap();
    public final Object mLock = new Object();
    public final WorkLauncherImpl mStartStopTokens = new WorkLauncherImpl(new StartStopTokensImpl(0));
    public final HashMap mFirstRunAttempts = new HashMap();

    public final class AttemptData {
        public final int mRunAttemptCount;
        public final long mTimeStamp;

        public AttemptData(int i, long j) {
            this.mRunAttemptCount = i;
            this.mTimeStamp = j;
        }
    }

    public GreedyScheduler(Context context, Configuration configuration, Trackers trackers, Processor processor, WorkLauncherImpl workLauncherImpl, TaskExecutor taskExecutor) {
        this.mContext = context;
        MemoryCacheService memoryCacheService = configuration.runnableScheduler;
        this.mDelayedWorkTracker = new DelayedWorkTracker(this, memoryCacheService, configuration.clock);
        this.mTimeLimiter = new SimpleActor(memoryCacheService, workLauncherImpl);
        this.mTaskExecutor = taskExecutor;
        this.mConstraintsTracker = new Headers.Builder(trackers);
        this.mConfiguration = configuration;
        this.mProcessor = processor;
        this.mWorkLauncher = workLauncherImpl;
    }

    @Override // androidx.work.impl.Scheduler
    public final void cancel(String str) {
        List<StartStopToken> remove;
        Runnable runnable;
        String str2 = TAG;
        if (this.mInDefaultProcess == null) {
            this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, this.mConfiguration));
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger$LogcatLogger.get().info(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.mRegisteredExecutionListener) {
            this.mProcessor.addExecutionListener(this);
            this.mRegisteredExecutionListener = true;
        }
        Logger$LogcatLogger.get().debug(str2, "Cancelling work ID " + str);
        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null && (runnable = (Runnable) delayedWorkTracker.mRunnables.remove(str)) != null) {
            ((Handler) delayedWorkTracker.mRunnableScheduler.imageLoader).removeCallbacks(runnable);
        }
        WorkLauncherImpl workLauncherImpl = this.mStartStopTokens;
        workLauncherImpl.getClass();
        str.getClass();
        synchronized (workLauncherImpl.workTaskExecutor) {
            remove = ((StartStopTokensImpl) workLauncherImpl.processor).remove(str);
        }
        for (StartStopToken startStopToken : remove) {
            this.mTimeLimiter.cancel(startStopToken);
            WorkLauncherImpl workLauncherImpl2 = this.mWorkLauncher;
            workLauncherImpl2.getClass();
            workLauncherImpl2.stopWork(startStopToken, -512);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void onConstraintsStateChanged(WorkSpec workSpec, ConstraintsState constraintsState) {
        WorkGenerationalId generationalId = Room.generationalId(workSpec);
        boolean z = constraintsState instanceof ConstraintsState.ConstraintsMet;
        WorkLauncherImpl workLauncherImpl = this.mWorkLauncher;
        SimpleActor simpleActor = this.mTimeLimiter;
        String str = TAG;
        WorkLauncherImpl workLauncherImpl2 = this.mStartStopTokens;
        if (z) {
            if (workLauncherImpl2.contains(generationalId)) {
                return;
            }
            Logger$LogcatLogger.get().debug(str, "Constraints met: Scheduling work ID " + generationalId);
            StartStopToken startStopToken = workLauncherImpl2.tokenFor(generationalId);
            simpleActor.track(startStopToken);
            workLauncherImpl.getClass();
            workLauncherImpl.startWork(startStopToken, null);
            return;
        }
        Logger$LogcatLogger.get().debug(str, "Constraints not met: Cancelling work ID " + generationalId);
        StartStopToken remove = workLauncherImpl2.remove(generationalId);
        if (remove != null) {
            simpleActor.cancel(remove);
            int reason = ((ConstraintsState.ConstraintsNotMet) constraintsState).getReason();
            workLauncherImpl.getClass();
            workLauncherImpl.stopWork(remove, reason);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
        Job job;
        StartStopToken remove = this.mStartStopTokens.remove(workGenerationalId);
        if (remove != null) {
            this.mTimeLimiter.cancel(remove);
        }
        synchronized (this.mLock) {
            job = (Job) this.mConstrainedWorkSpecs.remove(workGenerationalId);
        }
        if (job != null) {
            Logger$LogcatLogger.get().debug(TAG, "Stopping tracking for " + workGenerationalId);
            job.cancel(null);
        }
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            this.mFirstRunAttempts.remove(workGenerationalId);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void schedule(WorkSpec... workSpecArr) {
        long max;
        if (this.mInDefaultProcess == null) {
            this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, this.mConfiguration));
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger$LogcatLogger.get().info(TAG, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.mRegisteredExecutionListener) {
            this.mProcessor.addExecutionListener(this);
            this.mRegisteredExecutionListener = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.mStartStopTokens.contains(Room.generationalId(workSpec))) {
                synchronized (this.mLock) {
                    try {
                        WorkGenerationalId generationalId = Room.generationalId(workSpec);
                        AttemptData attemptData = (AttemptData) this.mFirstRunAttempts.get(generationalId);
                        if (attemptData == null) {
                            int i = workSpec.runAttemptCount;
                            this.mConfiguration.clock.getClass();
                            attemptData = new AttemptData(i, System.currentTimeMillis());
                            this.mFirstRunAttempts.put(generationalId, attemptData);
                        }
                        max = (Math.max((workSpec.runAttemptCount - attemptData.mRunAttemptCount) - 5, 0) * 30000) + attemptData.mTimeStamp;
                    } finally {
                    }
                }
                long max2 = Math.max(workSpec.calculateNextRunTime(), max);
                this.mConfiguration.clock.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                        if (delayedWorkTracker != null) {
                            MemoryCacheService memoryCacheService = delayedWorkTracker.mRunnableScheduler;
                            HashMap hashMap = delayedWorkTracker.mRunnables;
                            Runnable runnable = (Runnable) hashMap.remove(workSpec.id);
                            if (runnable != null) {
                                ((Handler) memoryCacheService.imageLoader).removeCallbacks(runnable);
                            }
                            zzi zziVar = new zzi(2, delayedWorkTracker, workSpec);
                            hashMap.put(workSpec.id, zziVar);
                            delayedWorkTracker.mClock.getClass();
                            ((Handler) memoryCacheService.imageLoader).postDelayed(zziVar, max2 - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.areEqual(Constraints.NONE, workSpec.constraints)) {
                        Constraints constraints = workSpec.constraints;
                        if (constraints.requiresDeviceIdle) {
                            Logger$LogcatLogger.get().debug(TAG, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (constraints.contentUriTriggers.isEmpty()) {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        } else {
                            Logger$LogcatLogger.get().debug(TAG, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.mStartStopTokens.contains(Room.generationalId(workSpec))) {
                        Logger$LogcatLogger.get().debug(TAG, "Starting work for " + workSpec.id);
                        WorkLauncherImpl workLauncherImpl = this.mStartStopTokens;
                        workLauncherImpl.getClass();
                        StartStopToken startStopToken = workLauncherImpl.tokenFor(Room.generationalId(workSpec));
                        this.mTimeLimiter.track(startStopToken);
                        WorkLauncherImpl workLauncherImpl2 = this.mWorkLauncher;
                        workLauncherImpl2.getClass();
                        workLauncherImpl2.startWork(startStopToken, null);
                    }
                }
            }
        }
        synchronized (this.mLock) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger$LogcatLogger.get().debug(TAG, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WorkSpec workSpec2 = (WorkSpec) it.next();
                        WorkGenerationalId generationalId2 = Room.generationalId(workSpec2);
                        if (!this.mConstrainedWorkSpecs.containsKey(generationalId2)) {
                            this.mConstrainedWorkSpecs.put(generationalId2, WorkConstraintsTrackerKt.listen(this.mConstraintsTracker, workSpec2, ((WorkManagerTaskExecutor) this.mTaskExecutor).mTaskDispatcher, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
