package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4146wp implements InterfaceC4200xp {

    /* renamed from: a, reason: collision with root package name */
    public final Map f35662a;

    /* renamed from: b, reason: collision with root package name */
    public final C3383ig f35663b;

    /* renamed from: c, reason: collision with root package name */
    public final C2959al f35664c;

    public C4146wp(Map map, C3383ig c3383ig, C2959al c2959al) {
        this.f35662a = map;
        this.f35663b = c3383ig;
        this.f35664c = c2959al;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4200xp
    public final P3.a d(C2759Qe c2759Qe) {
        this.f35664c.i(c2759Qe);
        P3.a k9 = QC.k(new C3231fp(3));
        for (String str : ((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.s9)).split(",")) {
            InterfaceC3534lN interfaceC3534lN = (InterfaceC3534lN) this.f35662a.get(str.trim());
            if (interfaceC3534lN != null) {
                k9 = QC.r(k9, C3231fp.class, new E2.r(8, interfaceC3534lN, c2759Qe), this.f35663b);
            }
        }
        k9.a(new LD(0, k9, new C3680o7(this)), AbstractC3436jg.f32062h);
        return k9;
    }
}
