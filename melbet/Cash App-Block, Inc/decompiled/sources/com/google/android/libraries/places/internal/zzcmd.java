package com.google.android.libraries.places.internal;

import java.io.InterruptedIOException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class zzcmd {
    public static final ReentrantLock zza;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        zza = reentrantLock;
        reentrantLock.newCondition().getClass();
    }

    public static final void zza() {
        ReentrantLock reentrantLock = zza;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    public void zzb() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
