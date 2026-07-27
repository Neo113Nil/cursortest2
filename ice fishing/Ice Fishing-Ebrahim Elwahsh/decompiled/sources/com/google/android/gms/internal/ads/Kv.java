package com.google.android.gms.internal.ads;

import q2.AbstractBinderC4926z;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class Kv extends AbstractBinderC4926z {

    /* renamed from: n, reason: collision with root package name */
    public Ir f26064n;

    /* renamed from: u, reason: collision with root package name */
    public C2593Hm f26065u;

    /* renamed from: v, reason: collision with root package name */
    public String f26066v;

    @Override // q2.InterfaceC4873A
    public final void U(C4927z0 c4927z0) {
        C2593Hm c2593Hm = this.f26065u;
        if (this.f26064n == null || c2593Hm == null) {
            return;
        }
        String c4643n = c4927z0.b().toString();
        String str = this.f26066v;
        StringBuilder sb = new StringBuilder(c4643n.length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(c4643n);
        sb.append(" for ad unit: ");
        sb.append(str);
        u2.i.f(sb.toString());
        ((Hv) c2593Hm.f25416u).c(c4927z0);
        this.f26064n = null;
        this.f26065u = null;
        this.f26066v = null;
    }

    @Override // q2.InterfaceC4873A
    public final void z() {
        C2593Hm c2593Hm = this.f26065u;
        Ir ir = this.f26064n;
        if (ir == null || c2593Hm == null) {
            return;
        }
        ((ZD) c2593Hm.f25417v).d(ir);
        this.f26064n = null;
        this.f26065u = null;
        this.f26066v = null;
    }
}
