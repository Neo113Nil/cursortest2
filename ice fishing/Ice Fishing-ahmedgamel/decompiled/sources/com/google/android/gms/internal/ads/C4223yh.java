package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4223yh implements t2.l {

    /* renamed from: n, reason: collision with root package name */
    public final C2555Fh f35194n;

    /* renamed from: u, reason: collision with root package name */
    public final t2.l f35195u;

    public C4223yh(C2555Fh c2555Fh, t2.l lVar) {
        this.f35194n = c2555Fh;
        this.f35195u = lVar;
    }

    @Override // t2.l
    public final void H3(int i) {
        t2.l lVar = this.f35195u;
        if (lVar != null) {
            lVar.H3(i);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2572Gh viewTreeObserverOnGlobalLayoutListenerC2572Gh = this.f35194n.f24817n;
        AbstractC2968bG.j((C3785qa) viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25088u0.f2798v, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25085s0, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put(com.anythink.expressad.foundation.g.a.i, viewTreeObserverOnGlobalLayoutListenerC2572Gh.f25093x.f41391n);
        viewTreeObserverOnGlobalLayoutListenerC2572Gh.d("onhide", hashMap);
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
        t2.l lVar = this.f35195u;
        if (lVar != null) {
            lVar.Q2();
        }
    }

    @Override // t2.l
    public final void R1() {
        t2.l lVar = this.f35195u;
        if (lVar != null) {
            lVar.R1();
        }
    }

    @Override // t2.l
    public final void S1() {
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
        t2.l lVar = this.f35195u;
        if (lVar != null) {
            lVar.g();
        }
        this.f35194n.k0();
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // t2.l
    public final void w0() {
    }
}
