package com.google.android.gms.internal.ads;

import s2.C4949p;

/* renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3164ec implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2712Ni f30738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30739c;

    public /* synthetic */ C3164ec(C2712Ni c2712Ni, String str, int i) {
        this.f30737a = i;
        this.f30738b = c2712Ni;
        this.f30739c = str;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        String str = this.f30739c;
        C2712Ni c2712Ni = this.f30738b;
        switch (this.f30737a) {
            case 0:
                String str2 = (String) obj;
                C2950ac c2950ac = AbstractC3218fc.f31040a;
                return (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.vb)).booleanValue() && c2712Ni != null && C2712Ni.b(str)) ? c2712Ni.a(str2, C4949p.f40498g.f40503e) : QC.c(str2);
            default:
                c2712Ni.getClass();
                c2712Ni.f27298e.a(new RunnableC2678Li(c2712Ni, (Throwable) obj, 1));
                return QC.c(str);
        }
    }
}
