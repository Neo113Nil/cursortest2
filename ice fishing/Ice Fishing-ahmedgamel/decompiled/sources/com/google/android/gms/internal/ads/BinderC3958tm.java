package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3958tm extends AbstractBinderC4918y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f34383n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final q2.A0 f34384u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4111wd f34385v;

    public BinderC3958tm(q2.A0 a02, InterfaceC4111wd interfaceC4111wd) {
        this.f34384u = a02;
        this.f34385v = interfaceC4111wd;
    }

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
        synchronized (this.f34383n) {
            try {
                q2.A0 a02 = this.f34384u;
                if (a02 != null) {
                    a02.e2(c02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q2.A0
    public final boolean g() {
        throw new RemoteException();
    }

    @Override // q2.A0
    public final float j() {
        InterfaceC4111wd interfaceC4111wd = this.f34385v;
        if (interfaceC4111wd != null) {
            return interfaceC4111wd.M();
        }
        return 0.0f;
    }

    @Override // q2.A0
    public final float k() {
        InterfaceC4111wd interfaceC4111wd = this.f34385v;
        if (interfaceC4111wd != null) {
            return interfaceC4111wd.c0();
        }
        return 0.0f;
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
        synchronized (this.f34383n) {
            try {
                q2.A0 a02 = this.f34384u;
                if (a02 == null) {
                    return null;
                }
                return a02.s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
