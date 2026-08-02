package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4246yh implements v2.l {

    /* renamed from: n, reason: collision with root package name */
    public final C2575Fh f35984n;

    /* renamed from: u, reason: collision with root package name */
    public final v2.l f35985u;

    public C4246yh(C2575Fh c2575Fh, v2.l lVar) {
        this.f35984n = c2575Fh;
        this.f35985u = lVar;
    }

    @Override // v2.l
    public final void C3(int i) {
        v2.l lVar = this.f35985u;
        if (lVar != null) {
            lVar.C3(i);
        }
        ViewTreeObserverOnGlobalLayoutListenerC2592Gh viewTreeObserverOnGlobalLayoutListenerC2592Gh = this.f35984n.f25606n;
        AbstractC2991bG.j((C3808qa) viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25869p0.f2927v, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25867n0, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put(com.anythink.expressad.foundation.g.a.i, viewTreeObserverOnGlobalLayoutListenerC2592Gh.f25880x.f41845n);
        viewTreeObserverOnGlobalLayoutListenerC2592Gh.d("onhide", hashMap);
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // v2.l
    public final void N2() {
        v2.l lVar = this.f35985u;
        if (lVar != null) {
            lVar.N2();
        }
    }

    @Override // v2.l
    public final void Q1() {
        v2.l lVar = this.f35985u;
        if (lVar != null) {
            lVar.Q1();
        }
    }

    @Override // v2.l
    public final void S1() {
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final void g() {
        v2.l lVar = this.f35985u;
        if (lVar != null) {
            lVar.g();
        }
        this.f35984n.k0();
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }
}
