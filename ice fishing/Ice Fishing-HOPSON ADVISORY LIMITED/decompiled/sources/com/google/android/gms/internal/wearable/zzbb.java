package com.google.android.gms.internal.wearable;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbb extends AbstractOwnableSynchronizer implements Runnable {
    private final zzbd zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    final /* synthetic */ void zza(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
