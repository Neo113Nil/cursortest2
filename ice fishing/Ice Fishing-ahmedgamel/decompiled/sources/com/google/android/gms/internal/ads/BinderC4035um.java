package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4035um extends AbstractBinderC4967y0 {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35336n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final s2.A0 f35337u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4134wd f35338v;

    public BinderC4035um(s2.A0 a02, InterfaceC4134wd interfaceC4134wd) {
        this.f35337u = a02;
        this.f35338v = interfaceC4134wd;
    }

    @Override // s2.A0
    public final void Y1(s2.C0 c02) {
        synchronized (this.f35336n) {
            try {
                s2.A0 a02 = this.f35337u;
                if (a02 != null) {
                    a02.Y1(c02);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        InterfaceC4134wd interfaceC4134wd = this.f35338v;
        if (interfaceC4134wd != null) {
            return interfaceC4134wd.L();
        }
        return 0.0f;
    }

    @Override // s2.A0
    public final float k() {
        InterfaceC4134wd interfaceC4134wd = this.f35338v;
        if (interfaceC4134wd != null) {
            return interfaceC4134wd.c0();
        }
        return 0.0f;
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
        synchronized (this.f35336n) {
            try {
                s2.A0 a02 = this.f35337u;
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
