package com.google.android.gms.internal.ads;

import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Sv extends AbstractBinderC3759pf {

    /* renamed from: n, reason: collision with root package name */
    public Ot f28439n;

    /* renamed from: u, reason: collision with root package name */
    public S0.l f28440u;

    /* renamed from: v, reason: collision with root package name */
    public String f28441v;

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void a(C4969z0 c4969z0) {
        S0.l lVar = this.f28440u;
        if (this.f28439n == null || lVar == null) {
            return;
        }
        String nVar = c4969z0.b().toString();
        String str = this.f28441v;
        StringBuilder sb = new StringBuilder(String.valueOf(nVar).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(nVar);
        sb.append(", adUnitId: ");
        sb.append(str);
        x2.i.f(sb.toString());
        ((Fv) lVar.f2927v).c(c4969z0);
        this.f28439n = null;
        this.f28440u = null;
        this.f28441v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void d() {
        S0.l lVar = this.f28440u;
        Ot ot = this.f28439n;
        if (ot == null || lVar == null) {
            return;
        }
        ((XD) lVar.f2926u).d(ot);
        this.f28439n = null;
        this.f28440u = null;
        this.f28441v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void v(int i) {
        this.f28439n = null;
        this.f28440u = null;
        this.f28441v = null;
    }
}
