package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4916u;
import q2.InterfaceC4921w0;
import q2.InterfaceC4922x;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Ir extends q2.J {

    /* renamed from: A, reason: collision with root package name */
    public final C3348i7 f25632A;

    /* renamed from: B, reason: collision with root package name */
    public final C3165eo f25633B;

    /* renamed from: C, reason: collision with root package name */
    public C2660Ll f25634C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25635D;

    /* renamed from: n, reason: collision with root package name */
    public final q2.g1 f25636n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f25637u;

    /* renamed from: v, reason: collision with root package name */
    public final Gt f25638v;

    /* renamed from: w, reason: collision with root package name */
    public final String f25639w;

    /* renamed from: x, reason: collision with root package name */
    public final C5107a f25640x;

    /* renamed from: y, reason: collision with root package name */
    public final Fr f25641y;

    /* renamed from: z, reason: collision with root package name */
    public final Jt f25642z;

    public Ir(Context context, q2.g1 g1Var, String str, Gt gt, Fr fr, Jt jt, C5107a c5107a, C3348i7 c3348i7, C3165eo c3165eo) {
        this.f25636n = g1Var;
        this.f25639w = str;
        this.f25637u = context;
        this.f25638v = gt;
        this.f25641y = fr;
        this.f25642z = jt;
        this.f25640x = c5107a;
        C3151ea c3151ea = AbstractC3368ia.f31726m1;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.f25635D = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31717l1)).booleanValue();
        } else {
            this.f25635D = true;
        }
        this.f25632A = c3348i7;
        this.f25633B = c3165eo;
    }

    @Override // q2.K
    public final q2.A0 B() {
        return null;
    }

    @Override // q2.K
    public final void B0(InterfaceC4878a0 interfaceC4878a0) {
        this.f25641y.f25041x.set(interfaceC4878a0);
    }

    @Override // q2.K
    public final void C2(q2.d1 d1Var, InterfaceC4873A interfaceC4873A) {
        this.f25641y.f25040w.set(interfaceC4873A);
        f0(d1Var);
    }

    public final synchronized boolean G3() {
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll != null) {
            if (!c2660Ll.f26205p.f26595u.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // q2.K
    public final synchronized boolean H() {
        return this.f25638v.b();
    }

    @Override // q2.K
    public final synchronized void I1(C3744pa c3744pa) {
        O2.w.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f25638v.f25239f = c3744pa;
    }

    @Override // q2.K
    public final void I2(String str) {
    }

    @Override // q2.K
    public final synchronized boolean L() {
        return false;
    }

    @Override // q2.K
    public final synchronized InterfaceC4921w0 M() {
        C2660Ll c2660Ll;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31441F7)).booleanValue() && (c2660Ll = this.f25634C) != null) {
            return c2660Ll.f24808f;
        }
        return null;
    }

    @Override // q2.K
    public final synchronized void P0(long j9) {
        C3270gk c3270gk;
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll == null || (c3270gk = c2660Ll.f24811j) == null) {
            return;
        }
        c3270gk.a(j9);
    }

    @Override // q2.K
    public final synchronized void Q0(boolean z8) {
        O2.w.d("setImmersiveMode must be called on the main UI thread.");
        this.f25635D = z8;
    }

    @Override // q2.K
    public final synchronized void T2(V2.a aVar) {
        if (this.f25634C == null) {
            int i = t2.C.f40822b;
            u2.i.f("Interstitial can not be shown before loaded.");
            this.f25641y.b(AbstractC3217fl.M(9, null, null));
        } else {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31412C3)).booleanValue()) {
                this.f25632A.f31319b.e(new Throwable().getStackTrace());
            }
            this.f25634C.c((Activity) V2.b.A0(aVar), this.f25635D);
        }
    }

    @Override // q2.K
    public final void W1(M8 m8) {
    }

    @Override // q2.K
    public final InterfaceC4922x X() {
        return this.f25641y.d();
    }

    @Override // q2.K
    public final synchronized long Z() {
        C3270gk c3270gk;
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll == null || (c3270gk = c2660Ll.f24811j) == null) {
            return 0L;
        }
        return c3270gk.f31098a.get();
    }

    @Override // q2.K
    public final V2.a d() {
        return null;
    }

    @Override // q2.K
    public final synchronized void e() {
        O2.w.d("resume must be called on the main UI thread.");
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll != null) {
            C2540Ek c2540Ek = c2660Ll.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C2602Ie(null, 1));
        }
    }

    @Override // q2.K
    public final synchronized void f() {
        O2.w.d("pause must be called on the main UI thread.");
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll != null) {
            C2540Ek c2540Ek = c2660Ll.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C3314ha(null, 1));
        }
    }

    @Override // q2.K
    public final synchronized boolean f0(q2.d1 d1Var) {
        boolean z8;
        try {
            if (!d1Var.b()) {
                if (((Boolean) AbstractC2598Ia.i.r()).booleanValue()) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                        z8 = true;
                        if (this.f25640x.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue() || !z8) {
                            O2.w.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z8 = false;
                if (this.f25640x.f41219v >= ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dc)).intValue()) {
                }
                O2.w.d("loadAd must be called on the main UI thread.");
            }
            t2.G g9 = p2.j.f39798C.f39803c;
            Context context = this.f25637u;
            if (t2.G.h(context) && d1Var.f40018L == null) {
                int i = t2.C.f40822b;
                u2.i.c("Failed to load the ad because app ID is missing.");
                Fr fr = this.f25641y;
                if (fr != null) {
                    fr.v(AbstractC3217fl.M(4, null, null));
                }
            } else if (!G3()) {
                AbstractC2655Lg.o(context, d1Var.f40034y);
                this.f25634C = null;
                return this.f25638v.a(d1Var, this.f25639w, new Dt(this.f25636n), new C3562m7(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // q2.K
    public final Bundle j() {
        O2.w.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // q2.K
    public final synchronized void k() {
        O2.w.d("showInterstitial must be called on the main UI thread.");
        if (this.f25634C == null) {
            int i = t2.C.f40822b;
            u2.i.f("Interstitial can not be shown before loaded.");
            this.f25641y.b(AbstractC3217fl.M(9, null, null));
        } else {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31412C3)).booleanValue()) {
                this.f25632A.f31319b.e(new Throwable().getStackTrace());
            }
            this.f25634C.c(null, this.f25635D);
        }
    }

    @Override // q2.K
    public final void m() {
    }

    @Override // q2.K
    public final synchronized boolean o() {
        O2.w.d("isLoaded must be called on the main UI thread.");
        return G3();
    }

    @Override // q2.K
    public final q2.g1 p() {
        return null;
    }

    @Override // q2.K
    public final void p3(InterfaceC4911r0 interfaceC4911r0) {
        O2.w.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC4911r0.f()) {
                this.f25633B.b();
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.b("Error in making CSI ping for reporting paid event callback", e6);
        }
        this.f25641y.f25039v.set(interfaceC4911r0);
    }

    @Override // q2.K
    public final void r0(InterfaceC4922x interfaceC4922x) {
        O2.w.d("setAdListener must be called on the main UI thread.");
        this.f25641y.f25037n.set(interfaceC4922x);
    }

    @Override // q2.K
    public final void s1() {
        O2.w.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // q2.K
    public final synchronized String t() {
        BinderC3754pk binderC3754pk;
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll == null || (binderC3754pk = c2660Ll.f24808f) == null) {
            return null;
        }
        return binderC3754pk.f33484n;
    }

    @Override // q2.K
    public final synchronized String u() {
        return this.f25639w;
    }

    @Override // q2.K
    public final void u2(boolean z8) {
    }

    @Override // q2.K
    public final q2.V v() {
        q2.V v6;
        Fr fr = this.f25641y;
        synchronized (fr) {
            v6 = (q2.V) fr.f25038u.get();
        }
        return v6;
    }

    @Override // q2.K
    public final synchronized String w() {
        BinderC3754pk binderC3754pk;
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll == null || (binderC3754pk = c2660Ll.f24808f) == null) {
            return null;
        }
        return binderC3754pk.f33484n;
    }

    @Override // q2.K
    public final void w1(q2.V v6) {
        O2.w.d("setAppEventListener must be called on the main UI thread.");
        this.f25641y.o(v6);
    }

    @Override // q2.K
    public final synchronized void x() {
        O2.w.d("destroy must be called on the main UI thread.");
        C2660Ll c2660Ll = this.f25634C;
        if (c2660Ll != null) {
            C2540Ek c2540Ek = c2660Ll.f24805c;
            c2540Ek.getClass();
            c2540Ek.u1(new C3042ca(null, false));
        }
    }

    @Override // q2.K
    public final void x1(C2823Ve c2823Ve) {
        this.f25642z.f25844x.set(c2823Ve);
    }

    @Override // q2.K
    public final void K() {
    }

    @Override // q2.K
    public final void b0() {
    }

    @Override // q2.K
    public final void n() {
    }

    @Override // q2.K
    public final void r() {
    }

    @Override // q2.K
    public final void D1(q2.g1 g1Var) {
    }

    @Override // q2.K
    public final void D2(q2.Y y6) {
    }

    @Override // q2.K
    public final void X2(InterfaceC4916u interfaceC4916u) {
    }

    @Override // q2.K
    public final void t2(q2.j1 j1Var) {
    }

    @Override // q2.K
    public final void x0(q2.a1 a1Var) {
    }
}
