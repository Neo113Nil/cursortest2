package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding1 {
    public static /* synthetic */ boolean m(Unsafe unsafe, AbstractFutureState abstractFutureState, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFutureState, j, obj, obj2)) {
            if (unsafe.getObject(abstractFutureState, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
