package androidx.work.impl.background.greedy;

import androidx.work.Logger$LogcatLogger;
import androidx.work.SystemClock;
import coil3.memory.MemoryCacheService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class DelayedWorkTracker {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("DelayedWorkTracker");
    public final SystemClock mClock;
    public final GreedyScheduler mImmediateScheduler;
    public final MemoryCacheService mRunnableScheduler;
    public final HashMap mRunnables = new HashMap();

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, MemoryCacheService memoryCacheService, SystemClock systemClock) {
        this.mImmediateScheduler = greedyScheduler;
        this.mRunnableScheduler = memoryCacheService;
        this.mClock = systemClock;
    }
}
