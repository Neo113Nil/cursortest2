package androidx.camera.camera2.pipe.core;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlinx.atomicfu.AtomicFU;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class AndroidThreads {
    public static final int[] NICE_VALUES = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    public static final ThreadFactory factory;

    static {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        defaultThreadFactory.getClass();
        factory = defaultThreadFactory;
    }

    public static ScheduledExecutorService asScheduledThreadPool(AndroidThreads$$ExternalSyntheticLambda0 androidThreads$$ExternalSyntheticLambda0, int i) {
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Threads (", ") must be > 0"));
            return null;
        }
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(i, androidThreads$$ExternalSyntheticLambda0);
        newScheduledThreadPool.getClass();
        return newScheduledThreadPool;
    }

    public static AndroidThreads$$ExternalSyntheticLambda1 withPrefix(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new AndroidThreads$$ExternalSyntheticLambda1(threadFactory, str, AtomicFU.atomic(0));
    }
}
