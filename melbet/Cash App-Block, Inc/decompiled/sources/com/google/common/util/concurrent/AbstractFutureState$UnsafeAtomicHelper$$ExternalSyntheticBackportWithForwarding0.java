package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractFutureState$UnsafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, AbstractFuture abstractFuture, long j, AbstractFuture.Listener listener, AbstractFuture.Listener listener2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, listener, listener2)) {
            if (unsafe.getObject(abstractFuture, j) != listener) {
                return false;
            }
        }
        return true;
    }
}
