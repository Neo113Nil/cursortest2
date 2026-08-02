package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import kotlin.collections.SlidingWindowKt;

/* loaded from: classes4.dex */
public abstract class AggregateFutureState extends AbstractFuture.TrustedFuture {
    public static final SlidingWindowKt ATOMIC_HELPER;
    public static final LazyLogger log = new LazyLogger(AggregateFutureState.class);
    public volatile int remainingField;
    public volatile Set seenExceptionsField;

    public final class SafeAtomicHelper extends SlidingWindowKt {
        public static final AtomicReferenceFieldUpdater seenExceptionsUpdater = AtomicReferenceFieldUpdater.newUpdater(AggregateFutureState.class, Set.class, "seenExceptionsField");
        public static final AtomicIntegerFieldUpdater remainingCountUpdater = AtomicIntegerFieldUpdater.newUpdater(AggregateFutureState.class, "remainingField");

        @Override // kotlin.collections.SlidingWindowKt
        public final void compareAndSetSeenExceptions(CombinedFuture combinedFuture, Set set) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = seenExceptionsUpdater;
                if (atomicReferenceFieldUpdater.compareAndSet(combinedFuture, null, set)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(combinedFuture) == null);
        }

        @Override // kotlin.collections.SlidingWindowKt
        public final int decrementAndGetRemainingCount(CombinedFuture combinedFuture) {
            return remainingCountUpdater.decrementAndGet(combinedFuture);
        }
    }

    public final class SynchronizedAtomicHelper extends SlidingWindowKt {
        @Override // kotlin.collections.SlidingWindowKt
        public final void compareAndSetSeenExceptions(CombinedFuture combinedFuture, Set set) {
            synchronized (combinedFuture) {
                try {
                    if (combinedFuture.seenExceptionsField == null) {
                        combinedFuture.seenExceptionsField = set;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlin.collections.SlidingWindowKt
        public final int decrementAndGetRemainingCount(CombinedFuture combinedFuture) {
            int i;
            synchronized (combinedFuture) {
                i = combinedFuture.remainingField - 1;
                combinedFuture.remainingField = i;
            }
            return i;
        }
    }

    static {
        Throwable th;
        SlidingWindowKt synchronizedAtomicHelper;
        try {
            synchronizedAtomicHelper = new SafeAtomicHelper();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            synchronizedAtomicHelper = new SynchronizedAtomicHelper();
        }
        ATOMIC_HELPER = synchronizedAtomicHelper;
        if (th != null) {
            log.get().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
