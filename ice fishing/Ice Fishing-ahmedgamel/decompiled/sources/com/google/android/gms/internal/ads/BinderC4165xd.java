package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4165xd extends AbstractBinderC4918y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35030n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile q2.C0 f35031u;

    @Override // q2.A0
    public final void d() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void e() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void e2(q2.C0 c02) {
        synchronized (this.f35030n) {
            this.f35031u = c02;
        }
    }

    @Override // q2.A0
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float j() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float k() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void l0(boolean z3) {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void m() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final int n() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean p() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float q() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final q2.C0 s() {
        q2.C0 c02;
        synchronized (this.f35030n) {
            c02 = this.f35031u;
        }
        return c02;
    }
}
