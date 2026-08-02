package com.google.android.gms.internal.ads;

import s2.AbstractBinderC4968z;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Iv extends AbstractBinderC4968z {

    /* renamed from: n, reason: collision with root package name */
    public Gr f26369n;

    /* renamed from: u, reason: collision with root package name */
    public S0.l f26370u;

    /* renamed from: v, reason: collision with root package name */
    public String f26371v;

    @Override // s2.InterfaceC4917A
    public final void r2(C4969z0 c4969z0) {
        S0.l lVar = this.f26370u;
        if (this.f26369n == null || lVar == null) {
            return;
        }
        String nVar = c4969z0.b().toString();
        String str = this.f26371v;
        StringBuilder sb = new StringBuilder(nVar.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(nVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        x2.i.f(sb.toString());
        ((Fv) lVar.f2927v).c(c4969z0);
        this.f26369n = null;
        this.f26370u = null;
        this.f26371v = null;
    }

    @Override // s2.InterfaceC4917A
    public final void t() {
        S0.l lVar = this.f26370u;
        Gr gr = this.f26369n;
        if (gr == null || lVar == null) {
            return;
        }
        ((XD) lVar.f2926u).d(gr);
        this.f26369n = null;
        this.f26370u = null;
        this.f26371v = null;
    }
}
