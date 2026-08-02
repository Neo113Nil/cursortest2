package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4188xd extends AbstractBinderC4967y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35809n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile s2.C0 f35810u;

    @Override // s2.A0
    public final void Y1(s2.C0 c02) {
        synchronized (this.f35809n) {
            this.f35810u = c02;
        }
    }

    @Override // s2.A0
    public final void d() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final void e() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final float j() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final float k() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final void l0(boolean z6) {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final void m() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final int n() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final boolean p() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final float q() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // s2.A0
    public final s2.C0 s() {
        s2.C0 c02;
        synchronized (this.f35809n) {
            c02 = this.f35810u;
        }
        return c02;
    }
}
