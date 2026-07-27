package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import q2.AbstractBinderC4875C;
import q2.InterfaceC4922x;

/* loaded from: classes2.dex */
public final class Br extends AbstractBinderC4875C {

    /* renamed from: n, reason: collision with root package name */
    public final C4017ue f24099n;

    public Br(Context context, C3214fi c3214fi, C3171eu c3171eu, C4133wm c4133wm, InterfaceC4922x interfaceC4922x) {
        C3602mu c3602mu = new C3602mu(c4133wm, (C3165eo) c3214fi.f30819o.d());
        ((Fr) c3602mu.f32775v).f25037n.set(interfaceC4922x);
        Q8 q82 = new Q8();
        q82.f27120u = c3214fi;
        q82.f27123x = context;
        q82.f27121v = c3602mu;
        q82.f27119n = c3171eu;
        q82.f27122w = c3214fi.c();
        c3171eu.f30546r = (Fr) c3602mu.f32775v;
        this.f24099n = new C4017ue(q82, c3171eu.f30532c);
    }

    @Override // q2.InterfaceC4876D
    public final synchronized void b1(q2.d1 d1Var, int i) {
        this.f24099n.r(d1Var, i);
    }

    @Override // q2.InterfaceC4876D
    public final synchronized boolean e() {
        boolean z8;
        C4017ue c4017ue = this.f24099n;
        synchronized (c4017ue) {
            try {
                C2658Lj c2658Lj = (C2658Lj) ((Q8) c4017ue.f34630u).f27124y;
                if (c2658Lj != null) {
                    z8 = c2658Lj.f26199c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    @Override // q2.InterfaceC4876D
    public final synchronized String f() {
        String str;
        C4017ue c4017ue = this.f24099n;
        synchronized (c4017ue) {
            try {
                BinderC3754pk binderC3754pk = (BinderC3754pk) c4017ue.f34632w;
                str = binderC3754pk != null ? binderC3754pk.f33484n : null;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
        return str;
    }

    @Override // q2.InterfaceC4876D
    public final void f0(q2.d1 d1Var) {
        this.f24099n.r(d1Var, 1);
    }

    @Override // q2.InterfaceC4876D
    public final synchronized String g() {
        String str;
        C4017ue c4017ue = this.f24099n;
        synchronized (c4017ue) {
            try {
                BinderC3754pk binderC3754pk = (BinderC3754pk) c4017ue.f34632w;
                str = binderC3754pk != null ? binderC3754pk.f33484n : null;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
        return str;
    }
}
