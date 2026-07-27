package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4123wp implements InterfaceC4177xp {

    /* renamed from: a, reason: collision with root package name */
    public final Map f34881a;

    /* renamed from: b, reason: collision with root package name */
    public final C3360ig f34882b;

    /* renamed from: c, reason: collision with root package name */
    public final C2936al f34883c;

    public C4123wp(Map map, C3360ig c3360ig, C2936al c2936al) {
        this.f34881a = map;
        this.f34882b = c3360ig;
        this.f34883c = c2936al;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4177xp
    public final N3.a d(C2739Qe c2739Qe) {
        this.f34883c.i(c2739Qe);
        AbstractC3771qD k9 = QC.k(new C3208fp(3));
        for (String str : ((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.s9)).split(",")) {
            InterfaceC3511lN interfaceC3511lN = (InterfaceC3511lN) this.f34881a.get(str.trim());
            if (interfaceC3511lN != null) {
                k9 = QC.r(k9, C3208fp.class, new C2.s(8, interfaceC3511lN, c2739Qe), this.f34882b);
            }
        }
        k9.a(new LD(0, k9, new C3657o7(this)), AbstractC3413jg.f31275h);
        return k9;
    }
}
