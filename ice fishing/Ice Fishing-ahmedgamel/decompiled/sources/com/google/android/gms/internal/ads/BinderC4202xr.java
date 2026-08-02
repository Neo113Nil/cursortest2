package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import r2.C4906k;
import s2.InterfaceC4917A;
import s2.InterfaceC4920a0;
import s2.InterfaceC4953r0;
import s2.InterfaceC4958u;
import s2.InterfaceC4963w0;
import s2.InterfaceC4964x;

/* renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4202xr extends s2.J {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35842n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4964x f35843u;

    /* renamed from: v, reason: collision with root package name */
    public final C3075cu f35844v;

    /* renamed from: w, reason: collision with root package name */
    public final C3547lj f35845w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f35846x;

    /* renamed from: y, reason: collision with root package name */
    public final C3230fo f35847y;

    public BinderC4202xr(Context context, InterfaceC4964x interfaceC4964x, C3075cu c3075cu, C3547lj c3547lj, C3230fo c3230fo) {
        this.f35842n = context;
        this.f35843u = interfaceC4964x;
        this.f35844v = c3075cu;
        this.f35845w = c3547lj;
        this.f35847y = c3230fo;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        w2.D d9 = C4906k.f40186C.f40191c;
        frameLayout.addView(c3547lj.f32605m, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(q().f40443v);
        frameLayout.setMinimumWidth(q().f40446y);
        this.f35846x = frameLayout;
    }

    @Override // s2.K
    public final void A() {
        R2.w.d("destroy must be called on the main UI thread.");
        C2578Fk c2578Fk = this.f35845w.f25624c;
        c2578Fk.getClass();
        c2578Fk.M1(new C3216fa(null, false));
    }

    @Override // s2.K
    public final InterfaceC4964x B() {
        return this.f35843u;
    }

    @Override // s2.K
    public final void B0(s2.Y y7) {
        int i = w2.z.f41712b;
        x2.i.e("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final InterfaceC4963w0 C() {
        return this.f35845w.f25627f;
    }

    @Override // s2.K
    public final boolean D3(s2.c1 c1Var) {
        int i = w2.z.f41712b;
        x2.i.e("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // s2.K
    public final void F2(s2.f1 f1Var) {
        FrameLayout frameLayout;
        InterfaceC4084vh interfaceC4084vh;
        R2.w.d("setAdSize must be called on the main UI thread.");
        C3547lj c3547lj = this.f35845w;
        if (c3547lj == null || (frameLayout = this.f35846x) == null || (interfaceC4084vh = c3547lj.f32606n) == null) {
            return;
        }
        interfaceC4084vh.f1(A3.r.a(f1Var));
        frameLayout.setMinimumHeight(f1Var.f40443v);
        frameLayout.setMinimumWidth(f1Var.f40446y);
        c3547lj.f32613u = f1Var;
    }

    @Override // s2.K
    public final void H1(InterfaceC4964x interfaceC4964x) {
        int i = w2.z.f41712b;
        x2.i.e("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final boolean L() {
        return false;
    }

    @Override // s2.K
    public final void M2(String str) {
    }

    @Override // s2.K
    public final void M3(InterfaceC4953r0 interfaceC4953r0) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Yc)).booleanValue()) {
            int i = w2.z.f41712b;
            x2.i.e("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        Dr dr = this.f35844v.f30392c;
        if (dr != null) {
            try {
                if (!interfaceC4953r0.e()) {
                    this.f35847y.b();
                }
            } catch (RemoteException e9) {
                int i4 = w2.z.f41712b;
                x2.i.b("Error in making CSI ping for reporting paid event callback", e9);
            }
            dr.f25239v.set(interfaceC4953r0);
        }
    }

    @Override // s2.K
    public final String N() {
        return this.f35844v.f30396g;
    }

    @Override // s2.K
    public final void P3(P8 p82) {
    }

    @Override // s2.K
    public final s2.A0 V() {
        C3547lj c3547lj = this.f35845w;
        c3547lj.getClass();
        try {
            return c3547lj.f32608p.mo12c();
        } catch (C3290gu unused) {
            return null;
        }
    }

    @Override // s2.K
    public final Y2.a c() {
        return new Y2.b(this.f35846x);
    }

    @Override // s2.K
    public final void c2(boolean z6) {
        int i = w2.z.f41712b;
        x2.i.e("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final void d() {
        R2.w.d("destroy must be called on the main UI thread.");
        C2578Fk c2578Fk = this.f35845w.f25624c;
        c2578Fk.getClass();
        c2578Fk.M1(new C3538la(null, 1));
    }

    @Override // s2.K
    public final void d2() {
        int i = w2.z.f41712b;
        x2.i.e("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final void e() {
        R2.w.d("destroy must be called on the main UI thread.");
        C2578Fk c2578Fk = this.f35845w.f25624c;
        c2578Fk.getClass();
        c2578Fk.M1(new C2572Fe(null, 1));
    }

    @Override // s2.K
    public final long g0() {
        C3387ik c3387ik;
        C3547lj c3547lj = this.f35845w;
        if (c3547lj == null || (c3387ik = c3547lj.f25630j) == null) {
            return 0L;
        }
        return c3387ik.f31884a.get();
    }

    @Override // s2.K
    public final boolean i() {
        return false;
    }

    @Override // s2.K
    public final Bundle j() {
        int i = w2.z.f41712b;
        x2.i.e("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // s2.K
    public final void k() {
    }

    @Override // s2.K
    public final void l() {
        C2596Gl c2596Gl = this.f35845w.f32610r;
        synchronized (c2596Gl) {
            c2596Gl.M1(C3495kl.f32384F);
        }
    }

    @Override // s2.K
    public final String m() {
        BinderC3871rk binderC3871rk = this.f35845w.f25627f;
        if (binderC3871rk != null) {
            return binderC3871rk.f34470n;
        }
        return null;
    }

    @Override // s2.K
    public final void m2(C3915sa c3915sa) {
        int i = w2.z.f41712b;
        x2.i.e("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final void n0(boolean z6) {
    }

    @Override // s2.K
    public final void o0(s2.V v9) {
        Dr dr = this.f35844v.f30392c;
        if (dr != null) {
            dr.n(v9);
        }
    }

    @Override // s2.K
    public final void o2(s2.Z0 z02) {
        int i = w2.z.f41712b;
        x2.i.e("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final void p3(InterfaceC4958u interfaceC4958u) {
        int i = w2.z.f41712b;
        x2.i.e("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // s2.K
    public final s2.f1 q() {
        R2.w.d("getAdSize must be called on the main UI thread.");
        return AbstractC3066cl.k(this.f35842n, Collections.singletonList(this.f35845w.c()));
    }

    @Override // s2.K
    public final boolean u() {
        C3547lj c3547lj = this.f35845w;
        return c3547lj != null && c3547lj.f25623b.f28420q0;
    }

    @Override // s2.K
    public final String w() {
        BinderC3871rk binderC3871rk = this.f35845w.f25627f;
        if (binderC3871rk != null) {
            return binderC3871rk.f34470n;
        }
        return null;
    }

    @Override // s2.K
    public final void w0(long j6) {
        C3387ik c3387ik = this.f35845w.f25630j;
        if (c3387ik != null) {
            c3387ik.a(j6);
        }
    }

    @Override // s2.K
    public final s2.V y() {
        return this.f35844v.f30403o;
    }

    @Override // s2.K
    public final void J() {
    }

    @Override // s2.K
    public final void c1() {
    }

    @Override // s2.K
    public final void r() {
    }

    @Override // s2.K
    public final void s() {
    }

    @Override // s2.K
    public final void C0(C2892Ye c2892Ye) {
    }

    @Override // s2.K
    public final void E3(InterfaceC4920a0 interfaceC4920a0) {
    }

    @Override // s2.K
    public final void F3(s2.i1 i1Var) {
    }

    @Override // s2.K
    public final void x0(Y2.a aVar) {
    }

    @Override // s2.K
    public final void I3(s2.c1 c1Var, InterfaceC4917A interfaceC4917A) {
    }
}
