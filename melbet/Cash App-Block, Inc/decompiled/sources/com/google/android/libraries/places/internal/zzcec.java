package com.google.android.libraries.places.internal;

import java.lang.Thread;

/* loaded from: classes4.dex */
public final class zzcec implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new zzbua(zzbtx.zzb(th).zze("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
