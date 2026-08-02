package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes2.dex */
public final class OD extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final PD f27372n;

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f27372n.toString();
    }
}
