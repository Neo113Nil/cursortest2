package com.google.android.gms.internal.ads;

import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Sv extends AbstractBinderC3736pf {

    /* renamed from: n, reason: collision with root package name */
    public Ot f27656n;

    /* renamed from: u, reason: collision with root package name */
    public S0.l f27657u;

    /* renamed from: v, reason: collision with root package name */
    public String f27658v;

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void a(C4920z0 c4920z0) {
        S0.l lVar = this.f27657u;
        if (this.f27656n == null || lVar == null) {
            return;
        }
        String nVar = c4920z0.b().toString();
        String str = this.f27658v;
        StringBuilder sb = new StringBuilder(String.valueOf(nVar).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(nVar);
        sb.append(", adUnitId: ");
        sb.append(str);
        v2.i.f(sb.toString());
        ((Fv) lVar.f2798v).c(c4920z0);
        this.f27656n = null;
        this.f27657u = null;
        this.f27658v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void d() {
        S0.l lVar = this.f27657u;
        Ot ot = this.f27656n;
        if (ot == null || lVar == null) {
            return;
        }
        ((XD) lVar.f2797u).d(ot);
        this.f27656n = null;
        this.f27657u = null;
        this.f27658v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void v(int i) {
        this.f27656n = null;
        this.f27657u = null;
        this.f27658v = null;
    }
}
