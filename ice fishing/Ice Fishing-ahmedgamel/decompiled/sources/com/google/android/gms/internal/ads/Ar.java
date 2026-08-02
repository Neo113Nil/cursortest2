package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import s2.InterfaceC4964x;

/* loaded from: classes2.dex */
public final class Ar extends s2.C {

    /* renamed from: n, reason: collision with root package name */
    public final C4297ze f24528n;

    public Ar(Context context, C3332hi c3332hi, C3022bu c3022bu, C2495Am c2495Am, InterfaceC4964x interfaceC4964x) {
        C3504ku c3504ku = new C3504ku(c2495Am, (C3230fo) c3332hi.f31659o.f());
        ((Dr) c3504ku.f32446v).f25237n.set(interfaceC4964x);
        T8 t82 = new T8();
        t82.f28479u = c3332hi;
        t82.f28482x = context;
        t82.f28480v = c3504ku;
        t82.f28478n = c3022bu;
        t82.f28481w = c3332hi.c();
        c3022bu.f30147r = (Dr) c3504ku.f32446v;
        this.f24528n = new C4297ze(t82, c3022bu.f30133c);
    }

    @Override // s2.D
    public final synchronized void A3(s2.c1 c1Var, int i) {
        this.f24528n.q(c1Var, i);
    }

    @Override // s2.D
    public final synchronized String e() {
        String str;
        C4297ze c4297ze = this.f24528n;
        synchronized (c4297ze) {
            try {
                BinderC3871rk binderC3871rk = (BinderC3871rk) c4297ze.f36135w;
                str = binderC3871rk != null ? binderC3871rk.f34470n : null;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return str;
    }

    @Override // s2.D
    public final synchronized String g() {
        String str;
        C4297ze c4297ze = this.f24528n;
        synchronized (c4297ze) {
            try {
                BinderC3871rk binderC3871rk = (BinderC3871rk) c4297ze.f36135w;
                str = binderC3871rk != null ? binderC3871rk.f34470n : null;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return str;
    }

    @Override // s2.D
    public final synchronized boolean h() {
        boolean z6;
        C4297ze c4297ze = this.f24528n;
        synchronized (c4297ze) {
            try {
                C2679Lj c2679Lj = (C2679Lj) ((T8) c4297ze.f36133u).f28483y;
                if (c2679Lj != null) {
                    z6 = c2679Lj.f26962c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    @Override // s2.D
    public final void j3(s2.c1 c1Var) {
        this.f24528n.q(c1Var, 1);
    }
}
