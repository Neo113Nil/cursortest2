package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import p2.C4835j;
import q2.C4901p0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4914w0;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Ot extends AbstractBinderC3306hf {

    /* renamed from: A, reason: collision with root package name */
    public final C3441k7 f26668A;

    /* renamed from: B, reason: collision with root package name */
    public final C3153eo f26669B;

    /* renamed from: C, reason: collision with root package name */
    public C2476An f26670C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f26671D;

    /* renamed from: u, reason: collision with root package name */
    public final Mt f26672u;

    /* renamed from: v, reason: collision with root package name */
    public final Jt f26673v;

    /* renamed from: w, reason: collision with root package name */
    public final String f26674w;

    /* renamed from: x, reason: collision with root package name */
    public final Zt f26675x;

    /* renamed from: y, reason: collision with root package name */
    public final Context f26676y;

    /* renamed from: z, reason: collision with root package name */
    public final C5110a f26677z;

    public Ot(String str, Mt mt, Context context, Jt jt, Zt zt, C5110a c5110a, C3441k7 c3441k7, C3153eo c3153eo) {
        this.f26674w = str;
        this.f26672u = mt;
        this.f26673v = jt;
        this.f26675x = zt;
        this.f26676y = context;
        this.f26677z = c5110a;
        C3301ha c3301ha = AbstractC3569ma.f32307m1;
        q2.r rVar = q2.r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f26671D = ((Boolean) rVar.f40210c.a(AbstractC3569ma.f32298l1)).booleanValue();
        } else {
            this.f26671D = true;
        }
        this.f26668A = c3441k7;
        this.f26669B = c3153eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void I1(q2.c1 c1Var, InterfaceC3790qf interfaceC3790qf) {
        U3(c1Var, interfaceC3790qf, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void K1(InterfaceC4904r0 interfaceC4904r0) {
        P2.w.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4904r0.e()) {
                this.f26669B.b();
            }
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
        }
        this.f26673v.f25777A.set(interfaceC4904r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void T0(C3843rf c3843rf) {
        P2.w.d("#008 Must be called on the main UI thread.");
        this.f26673v.f25785y.set(c3843rf);
    }

    public final synchronized void U3(q2.c1 c1Var, InterfaceC3790qf interfaceC3790qf, int i) {
        try {
            if (!c1Var.b()) {
                boolean z3 = false;
                if (((Boolean) AbstractC2684Na.f26502k.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Cc)).booleanValue()) {
                        z3 = true;
                    }
                }
                if (this.f26677z.f41393v < ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Dc)).intValue() || !z3) {
                    P2.w.d("#008 Must be called on the main UI thread.");
                }
            }
            Jt jt = this.f26673v;
            jt.f25782v.set(interfaceC3790qf);
            u2.D d2 = C4835j.f39733C.f39738c;
            if (u2.D.h(this.f26676y) && c1Var.f40107L == null) {
                int i6 = u2.z.f41322b;
                v2.i.c("Failed to load the ad because app ID is missing.");
                jt.v(SK.F(4, null, null));
            } else {
                if (this.f26670C != null) {
                    return;
                }
                Kt kt = new Kt(23);
                Mt mt = this.f26672u;
                mt.f26369h.f29356o.f1974u = i;
                mt.a(c1Var, this.f26674w, kt, new C3694or(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void X(long j6) {
        C3364ik c3364ik;
        C2476An c2476An = this.f26670C;
        if (c2476An == null || (c3364ik = c2476An.f24841j) == null) {
            return;
        }
        c3364ik.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void X1(W2.a aVar) {
        m1(aVar, this.f26671D);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void Z1(InterfaceC3574mf interfaceC3574mf) {
        P2.w.d("#008 Must be called on the main UI thread.");
        this.f26673v.f25783w.set(interfaceC3574mf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final Bundle e() {
        Bundle bundle;
        P2.w.d("#008 Must be called on the main UI thread.");
        C2476An c2476An = this.f26670C;
        if (c2476An == null) {
            return new Bundle();
        }
        C2694Nk c2694Nk = c2476An.f23738q;
        synchronized (c2694Nk) {
            bundle = new Bundle(c2694Nk.f26521v);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final boolean g() {
        P2.w.d("#008 Must be called on the main UI thread.");
        C2476An c2476An = this.f26670C;
        return (c2476An == null || c2476An.f23744w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void i3(C4005uf c4005uf) {
        P2.w.d("#008 Must be called on the main UI thread.");
        Zt zt = this.f26675x;
        zt.f28973a = c4005uf.f34555n;
        zt.f28974b = c4005uf.f34556u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final InterfaceC3198ff k() {
        P2.w.d("#008 Must be called on the main UI thread.");
        C2476An c2476An = this.f26670C;
        if (c2476An != null) {
            return c2476An.f23740s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void k1(q2.c1 c1Var, InterfaceC3790qf interfaceC3790qf) {
        U3(c1Var, interfaceC3790qf, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final InterfaceC4914w0 l() {
        C2476An c2476An;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32021F7)).booleanValue() && (c2476An = this.f26670C) != null) {
            return c2476An.f24838f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void m1(W2.a aVar, boolean z3) {
        P2.w.d("#008 Must be called on the main UI thread.");
        if (this.f26670C == null) {
            int i = u2.z.f41322b;
            v2.i.f("Rewarded can not be shown before loaded");
            this.f26673v.b(SK.F(9, null, null));
        } else {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31991C3)).booleanValue()) {
                this.f26668A.f31381b.e(new Throwable().getStackTrace());
            }
            this.f26670C.c((Activity) W2.b.F0(aVar), z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized String n() {
        BinderC3848rk binderC3848rk;
        C2476An c2476An = this.f26670C;
        if (c2476An == null || (binderC3848rk = c2476An.f24838f) == null) {
            return null;
        }
        return binderC3848rk.f33698n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final String q() {
        return this.f26674w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized long r() {
        C3364ik c3364ik;
        C2476An c2476An = this.f26670C;
        if (c2476An == null || (c3364ik = c2476An.f24841j) == null) {
            return 0L;
        }
        return c3364ik.f31114a.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final synchronized void u3(boolean z3) {
        P2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f26671D = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3412jf
    public final void y0(C4901p0 c4901p0) {
        Jt jt = this.f26673v;
        if (c4901p0 == null) {
            jt.f25781u.set(null);
        } else {
            jt.f25781u.set(new Nt(this, c4901p0));
        }
    }
}
