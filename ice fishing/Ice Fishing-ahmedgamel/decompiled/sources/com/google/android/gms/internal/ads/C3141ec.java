package com.google.android.gms.internal.ads;

import q2.C4900p;

/* renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3141ec implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2692Ni f29947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29948c;

    public /* synthetic */ C3141ec(C2692Ni c2692Ni, String str, int i) {
        this.f29946a = i;
        this.f29947b = c2692Ni;
        this.f29948c = str;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        String str = this.f29948c;
        C2692Ni c2692Ni = this.f29947b;
        switch (this.f29946a) {
            case 0:
                String str2 = (String) obj;
                C2927ac c2927ac = AbstractC3195fc.f30252a;
                return (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.vb)).booleanValue() && c2692Ni != null && C2692Ni.b(str)) ? c2692Ni.a(str2, C4900p.f40199g.f40204e) : QC.c(str2);
            default:
                c2692Ni.getClass();
                c2692Ni.f26515e.a(new RunnableC2658Li(c2692Ni, (Throwable) obj, 1));
                return QC.c(str);
        }
    }
}
