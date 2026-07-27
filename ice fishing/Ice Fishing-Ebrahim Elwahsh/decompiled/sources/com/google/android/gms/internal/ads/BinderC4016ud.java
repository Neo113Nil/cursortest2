package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.ud, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4016ud extends AbstractBinderC4925y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f34624n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile q2.C0 f34625u;

    @Override // q2.A0
    public final void c() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void d2(q2.C0 c02) {
        synchronized (this.f34624n) {
            this.f34625u = c02;
        }
    }

    @Override // q2.A0
    public final void f() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float h() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float j() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final int l() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float m() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void o0(boolean z8) {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final boolean p() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final q2.C0 q() {
        q2.C0 c02;
        synchronized (this.f34624n) {
            c02 = this.f34625u;
        }
        return c02;
    }

    @Override // q2.A0
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final void y() {
        throw new RemoteException();
    }
}
