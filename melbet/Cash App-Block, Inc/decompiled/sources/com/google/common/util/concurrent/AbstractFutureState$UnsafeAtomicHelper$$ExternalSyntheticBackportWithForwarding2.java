package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFutureState;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding2 {
    public static /* synthetic */ boolean m(Unsafe unsafe, AbstractFutureState abstractFutureState, long j, AbstractFutureState.Waiter waiter, AbstractFutureState.Waiter waiter2) {
        while (!unsafe.compareAndSwapObject(abstractFutureState, j, waiter, waiter2)) {
            if (unsafe.getObject(abstractFutureState, j) != waiter) {
                return false;
            }
        }
        return true;
    }
}
