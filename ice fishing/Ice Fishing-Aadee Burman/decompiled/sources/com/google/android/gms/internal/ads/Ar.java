package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import q2.InterfaceC4915x;

/* loaded from: classes2.dex */
public final class Ar extends q2.C {

    /* renamed from: n, reason: collision with root package name */
    public final C4274ze f23756n;

    public Ar(Context context, C3309hi c3309hi, C2999bu c2999bu, C4282zm c4282zm, InterfaceC4915x interfaceC4915x) {
        C3481ku c3481ku = new C3481ku(c4282zm, (C3153eo) c3309hi.f30898o.f());
        ((Dr) c3481ku.f31664v).f24476n.set(interfaceC4915x);
        T8 t82 = new T8();
        t82.f27696u = c3309hi;
        t82.f27699x = context;
        t82.f27697v = c3481ku;
        t82.f27695n = c2999bu;
        t82.f27698w = c3309hi.c();
        c2999bu.f29359r = (Dr) c3481ku.f31664v;
        this.f23756n = new C4274ze(t82, c2999bu.f29345c);
    }

    @Override // q2.D
    public final synchronized void c1(q2.c1 c1Var, int i) {
        this.f23756n.q(c1Var, i);
    }

    @Override // q2.D
    public final synchronized String e() {
        String str;
        C4274ze c4274ze = this.f23756n;
        synchronized (c4274ze) {
            try {
                BinderC3848rk binderC3848rk = (BinderC3848rk) c4274ze.f35362w;
                str = binderC3848rk != null ? binderC3848rk.f33698n : null;
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return str;
    }

    @Override // q2.D
    public final synchronized String g() {
        String str;
        C4274ze c4274ze = this.f23756n;
        synchronized (c4274ze) {
            try {
                BinderC3848rk binderC3848rk = (BinderC3848rk) c4274ze.f35362w;
                str = binderC3848rk != null ? binderC3848rk.f33698n : null;
            } catch (RemoteException e9) {
                int i = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
            }
        }
        return str;
    }

    @Override // q2.D
    public final synchronized boolean h() {
        boolean z3;
        C4274ze c4274ze = this.f23756n;
        synchronized (c4274ze) {
            try {
                C2659Lj c2659Lj = (C2659Lj) ((T8) c4274ze.f35360u).f27700y;
                if (c2659Lj != null) {
                    z3 = c2659Lj.f26165c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // q2.D
    public final void y2(q2.c1 c1Var) {
        this.f23756n.q(c1Var, 1);
    }
}
