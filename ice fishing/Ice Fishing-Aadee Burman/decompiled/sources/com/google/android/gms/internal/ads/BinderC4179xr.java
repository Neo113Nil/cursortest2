package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import p2.C4835j;
import q2.InterfaceC4868A;
import q2.InterfaceC4871a0;
import q2.InterfaceC4904r0;
import q2.InterfaceC4909u;
import q2.InterfaceC4914w0;
import q2.InterfaceC4915x;

/* renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4179xr extends q2.J {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35056n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4915x f35057u;

    /* renamed from: v, reason: collision with root package name */
    public final C3052cu f35058v;

    /* renamed from: w, reason: collision with root package name */
    public final C3524lj f35059w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f35060x;

    /* renamed from: y, reason: collision with root package name */
    public final C3153eo f35061y;

    public BinderC4179xr(Context context, InterfaceC4915x interfaceC4915x, C3052cu c3052cu, C3524lj c3524lj, C3153eo c3153eo) {
        this.f35056n = context;
        this.f35057u = interfaceC4915x;
        this.f35058v = c3052cu;
        this.f35059w = c3524lj;
        this.f35061y = c3153eo;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        u2.D d2 = C4835j.f39730C.f39735c;
        frameLayout.addView(c3524lj.f31827m, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(q().f40141v);
        frameLayout.setMinimumWidth(q().f40144y);
        this.f35060x = frameLayout;
    }

    @Override // q2.K
    public final void A() {
        P2.w.d("destroy must be called on the main UI thread.");
        C2558Fk c2558Fk = this.f35059w.f24835c;
        c2558Fk.getClass();
        c2558Fk.M1(new C3193fa(null, false));
    }

    @Override // q2.K
    public final void A0(long j6) {
        C3364ik c3364ik = this.f35059w.f24841j;
        if (c3364ik != null) {
            c3364ik.a(j6);
        }
    }

    @Override // q2.K
    public final InterfaceC4915x B() {
        return this.f35057u;
    }

    @Override // q2.K
    public final void B3(InterfaceC4909u interfaceC4909u) {
        int i = u2.z.f41319b;
        v2.i.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final InterfaceC4914w0 C() {
        return this.f35059w.f24838f;
    }

    @Override // q2.K
    public final boolean M() {
        return false;
    }

    @Override // q2.K
    public final String N() {
        return this.f35058v.f29626g;
    }

    @Override // q2.K
    public final void O2(String str) {
    }

    @Override // q2.K
    public final void P3(P8 p82) {
    }

    @Override // q2.K
    public final void U0(q2.Z0 z02) {
        int i = u2.z.f41319b;
        v2.i.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void U1(q2.f1 f1Var) {
        FrameLayout frameLayout;
        InterfaceC4061vh interfaceC4061vh;
        P2.w.d("setAdSize must be called on the main UI thread.");
        C3524lj c3524lj = this.f35059w;
        if (c3524lj == null || (frameLayout = this.f35060x) == null || (interfaceC4061vh = c3524lj.f31828n) == null) {
            return;
        }
        interfaceC4061vh.o0(X2.b.a(f1Var));
        frameLayout.setMinimumHeight(f1Var.f40141v);
        frameLayout.setMinimumWidth(f1Var.f40144y);
        c3524lj.f31835u = f1Var;
    }

    @Override // q2.K
    public final q2.A0 V() {
        C3524lj c3524lj = this.f35059w;
        c3524lj.getClass();
        try {
            return c3524lj.f31830p.mo13c();
        } catch (C3267gu unused) {
            return null;
        }
    }

    @Override // q2.K
    public final void Z2(InterfaceC4915x interfaceC4915x) {
        int i = u2.z.f41319b;
        v2.i.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final W2.a c() {
        return new W2.b(this.f35060x);
    }

    @Override // q2.K
    public final void d() {
        P2.w.d("destroy must be called on the main UI thread.");
        C2558Fk c2558Fk = this.f35059w.f24835c;
        c2558Fk.getClass();
        c2558Fk.M1(new C3515la(null, 1));
    }

    @Override // q2.K
    public final boolean d3(q2.c1 c1Var) {
        int i = u2.z.f41319b;
        v2.i.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // q2.K
    public final void e() {
        P2.w.d("destroy must be called on the main UI thread.");
        C2558Fk c2558Fk = this.f35059w.f24835c;
        c2558Fk.getClass();
        c2558Fk.M1(new C2552Fe(null, 1));
    }

    @Override // q2.K
    public final long f0() {
        C3364ik c3364ik;
        C3524lj c3524lj = this.f35059w;
        if (c3524lj == null || (c3364ik = c3524lj.f24841j) == null) {
            return 0L;
        }
        return c3364ik.f31114a.get();
    }

    @Override // q2.K
    public final void f2(boolean z3) {
        int i = u2.z.f41319b;
        v2.i.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final boolean i() {
        return false;
    }

    @Override // q2.K
    public final Bundle j() {
        int i = u2.z.f41319b;
        v2.i.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // q2.K
    public final void k() {
    }

    @Override // q2.K
    public final void k2() {
        int i = u2.z.f41319b;
        v2.i.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void l() {
        C2559Fl c2559Fl = this.f35059w.f31832r;
        synchronized (c2559Fl) {
            c2559Fl.M1(C3472kl.f31607F);
        }
    }

    @Override // q2.K
    public final String m() {
        BinderC3848rk binderC3848rk = this.f35059w.f24838f;
        if (binderC3848rk != null) {
            return binderC3848rk.f33698n;
        }
        return null;
    }

    @Override // q2.K
    public final void o0(boolean z3) {
    }

    @Override // q2.K
    public final q2.f1 q() {
        P2.w.d("getAdSize must be called on the main UI thread.");
        return AbstractC3043cl.k(this.f35056n, Collections.singletonList(this.f35059w.c()));
    }

    @Override // q2.K
    public final void r2(C3892sa c3892sa) {
        int i = u2.z.f41319b;
        v2.i.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void r3(q2.Y y7) {
        int i = u2.z.f41319b;
        v2.i.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // q2.K
    public final void s0(InterfaceC4904r0 interfaceC4904r0) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Yc)).booleanValue()) {
            int i = u2.z.f41319b;
            v2.i.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        Dr dr = this.f35058v.f29622c;
        if (dr != null) {
            try {
                if (!interfaceC4904r0.e()) {
                    this.f35061y.b();
                }
            } catch (RemoteException e9) {
                int i6 = u2.z.f41319b;
                v2.i.b("Error in making CSI ping for reporting paid event callback", e9);
            }
            dr.f24478v.set(interfaceC4904r0);
        }
    }

    @Override // q2.K
    public final boolean u() {
        C3524lj c3524lj = this.f35059w;
        return c3524lj != null && c3524lj.f24834b.f27637q0;
    }

    @Override // q2.K
    public final String w() {
        BinderC3848rk binderC3848rk = this.f35059w.f24838f;
        if (binderC3848rk != null) {
            return binderC3848rk.f33698n;
        }
        return null;
    }

    @Override // q2.K
    public final void x1(q2.V v9) {
        Dr dr = this.f35058v.f29622c;
        if (dr != null) {
            dr.n(v9);
        }
    }

    @Override // q2.K
    public final q2.V y() {
        return this.f35058v.f29633o;
    }

    @Override // q2.K
    public final void K() {
    }

    @Override // q2.K
    public final void e1() {
    }

    @Override // q2.K
    public final void r() {
    }

    @Override // q2.K
    public final void s() {
    }

    @Override // q2.K
    public final void C1(W2.a aVar) {
    }

    @Override // q2.K
    public final void E0(C2869Ye c2869Ye) {
    }

    @Override // q2.K
    public final void X0(InterfaceC4871a0 interfaceC4871a0) {
    }

    @Override // q2.K
    public final void Y2(q2.i1 i1Var) {
    }

    @Override // q2.K
    public final void m2(q2.c1 c1Var, InterfaceC4868A interfaceC4868A) {
    }
}
