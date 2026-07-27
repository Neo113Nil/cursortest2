package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import q2.C4908p0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4921w0;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Rt extends AbstractBinderC3156ef {

    /* renamed from: A, reason: collision with root package name */
    public final C3348i7 f27433A;

    /* renamed from: B, reason: collision with root package name */
    public final C3165eo f27434B;

    /* renamed from: C, reason: collision with root package name */
    public C2492Bn f27435C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f27436D;

    /* renamed from: u, reason: collision with root package name */
    public final Pt f27437u;

    /* renamed from: v, reason: collision with root package name */
    public final Jt f27438v;

    /* renamed from: w, reason: collision with root package name */
    public final String f27439w;

    /* renamed from: x, reason: collision with root package name */
    public final C3008bu f27440x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f27441y;

    /* renamed from: z, reason: collision with root package name */
    public final C5107a f27442z;

    public Rt(String str, Pt pt, Context context, Jt jt, C3008bu c3008bu, C5107a c5107a, C3348i7 c3348i7, C3165eo c3165eo) {
        this.f27439w = str;
        this.f27437u = pt;
        this.f27438v = jt;
        this.f27440x = c3008bu;
        this.f27441y = context;
        this.f27442z = c5107a;
        C3151ea c3151ea = AbstractC3368ia.f31726m1;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f27436D = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31717l1)).booleanValue();
        } else {
            this.f27436D = true;
        }
        this.f27433A = c3348i7;
        this.f27434B = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void C3(boolean z8) {
        O2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f27436D = z8;
    }

    public final synchronized void G3(q2.d1 d1Var, InterfaceC3587mf interfaceC3587mf, int i) {
        try {
            if (!d1Var.b()) {
                boolean z8 = false;
                if (((Boolean) AbstractC2598Ia.f25575k.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                        z8 = true;
                    }
                }
                if (this.f27442z.f41219v < ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue() || !z8) {
                    O2.w.d("#008 Must be called on the main UI thread.");
                }
            }
            Jt jt = this.f27438v;
            jt.f25842v.set(interfaceC3587mf);
            t2.G g9 = p2.j.f39798C.f39803c;
            if (t2.G.h(this.f27441y) && d1Var.f40018L == null) {
                int i4 = t2.C.f40822b;
                u2.i.c("Failed to load the ad because app ID is missing.");
                jt.v(AbstractC3217fl.M(4, null, null));
            } else {
                if (this.f27435C != null) {
                    return;
                }
                Lt lt = new Lt(22);
                Pt pt = this.f27437u;
                pt.f27077h.f30543o.f1421u = i;
                pt.a(d1Var, this.f27439w, lt, new C3761pr(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void H2(q2.d1 d1Var, InterfaceC3587mf interfaceC3587mf) {
        G3(d1Var, interfaceC3587mf, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void I0(C4908p0 c4908p0) {
        Jt jt = this.f27438v;
        if (c4908p0 == null) {
            jt.f25841u.set(null);
        } else {
            jt.f25841u.set(new Qt(this, c4908p0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void M1(V2.a aVar, boolean z8) {
        O2.w.d("#008 Must be called on the main UI thread.");
        if (this.f27435C == null) {
            int i = t2.C.f40822b;
            u2.i.f("Rewarded can not be shown before loaded");
            this.f27438v.b(AbstractC3217fl.M(9, null, null));
        } else {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31412C3)).booleanValue()) {
                this.f27433A.f31319b.e(new Throwable().getStackTrace());
            }
            this.f27435C.c((Activity) V2.b.A0(aVar), z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final Bundle e() {
        Bundle bundle;
        O2.w.d("#008 Must be called on the main UI thread.");
        C2492Bn c2492Bn = this.f27435C;
        if (c2492Bn == null) {
            return new Bundle();
        }
        C2659Lk c2659Lk = c2492Bn.f24082q;
        synchronized (c2659Lk) {
            bundle = new Bundle(c2659Lk.f26200v);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void f2(q2.d1 d1Var, InterfaceC3587mf interfaceC3587mf) {
        G3(d1Var, interfaceC3587mf, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized String h() {
        BinderC3754pk binderC3754pk;
        C2492Bn c2492Bn = this.f27435C;
        if (c2492Bn == null || (binderC3754pk = c2492Bn.f24808f) == null) {
            return null;
        }
        return binderC3754pk.f33484n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void h1(Cif cif) {
        O2.w.d("#008 Must be called on the main UI thread.");
        this.f27438v.f25843w.set(cif);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void i3(V2.a aVar) {
        M1(aVar, this.f27436D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final InterfaceC3047cf k() {
        O2.w.d("#008 Must be called on the main UI thread.");
        C2492Bn c2492Bn = this.f27435C;
        if (c2492Bn != null) {
            return c2492Bn.f24084s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final boolean l() {
        O2.w.d("#008 Must be called on the main UI thread.");
        C2492Bn c2492Bn = this.f27435C;
        return (c2492Bn == null || c2492Bn.f24088w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final InterfaceC4921w0 m() {
        C2492Bn c2492Bn;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue() && (c2492Bn = this.f27435C) != null) {
            return c2492Bn.f24808f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized long n() {
        C3270gk c3270gk;
        C2492Bn c2492Bn = this.f27435C;
        if (c2492Bn == null || (c3270gk = c2492Bn.f24811j) == null) {
            return 0L;
        }
        return c3270gk.f31098a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void n3(C3641nf c3641nf) {
        O2.w.d("#008 Must be called on the main UI thread.");
        this.f27438v.f25845y.set(c3641nf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void o3(C3856rf c3856rf) {
        O2.w.d("#008 Must be called on the main UI thread.");
        C3008bu c3008bu = this.f27440x;
        c3008bu.f29601a = c3856rf.f34047n;
        c3008bu.f29602b = c3856rf.f34048u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final String p() {
        return this.f27439w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final void p1(InterfaceC4911r0 interfaceC4911r0) {
        O2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4911r0.f()) {
                this.f27434B.b();
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f27438v.f25837A.set(interfaceC4911r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3211ff
    public final synchronized void v2(long j9) {
        C3270gk c3270gk;
        C2492Bn c2492Bn = this.f27435C;
        if (c2492Bn == null || (c3270gk = c2492Bn.f24811j) == null) {
            return;
        }
        c3270gk.a(j9);
    }
}
