package com.google.android.gms.internal.ads;

import q2.AbstractBinderC4919z;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Iv extends AbstractBinderC4919z {

    /* renamed from: n, reason: collision with root package name */
    public Gr f25616n;

    /* renamed from: u, reason: collision with root package name */
    public S0.l f25617u;

    /* renamed from: v, reason: collision with root package name */
    public String f25618v;

    @Override // q2.InterfaceC4868A
    public final void P1(C4920z0 c4920z0) {
        S0.l lVar = this.f25617u;
        if (this.f25616n == null || lVar == null) {
            return;
        }
        String nVar = c4920z0.b().toString();
        String str = this.f25618v;
        StringBuilder sb = new StringBuilder(nVar.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(nVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        v2.i.f(sb.toString());
        ((Fv) lVar.f2798v).c(c4920z0);
        this.f25616n = null;
        this.f25617u = null;
        this.f25618v = null;
    }

    @Override // q2.InterfaceC4868A
    public final void t() {
        S0.l lVar = this.f25617u;
        Gr gr = this.f25616n;
        if (gr == null || lVar == null) {
            return;
        }
        ((XD) lVar.f2797u).d(gr);
        this.f25616n = null;
        this.f25617u = null;
        this.f25618v = null;
    }
}
