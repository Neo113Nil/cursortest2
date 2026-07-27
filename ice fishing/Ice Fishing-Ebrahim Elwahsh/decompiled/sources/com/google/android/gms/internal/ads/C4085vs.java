package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4085vs implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34881a;

    /* renamed from: b, reason: collision with root package name */
    public final C2877Yh f34882b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f34883c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f34884d;

    public /* synthetic */ C4085vs(C2877Yh c2877Yh, C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f34881a = i;
        this.f34882b = c2877Yh;
        this.f34883c = c4009uN;
        this.f34884d = c4009uN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f34881a) {
            case 0:
                Or or = new Or(0, this.f34882b.f28846b.a());
                S2.a aVar = (S2.a) this.f34883c.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3869rs(or, 2147483647L, aVar, c3157eg, (C3165eo) this.f34884d.d());
            default:
                Rs or2 = new Or(0, this.f34882b.f28846b.a());
                Rs rs = (C3869rs) this.f34883c.d();
                if (true == ((List) this.f34884d.d()).contains("2")) {
                    or2 = rs;
                }
                AbstractC3137eE.h(or2);
                return or2;
        }
    }
}
