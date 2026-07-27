package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2559Fm implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25013a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f25014b;

    /* renamed from: c, reason: collision with root package name */
    public final C3218fm f25015c;

    public C2559Fm(C3218fm c3218fm, C4009uN c4009uN) {
        this.f25015c = c3218fm;
        this.f25014b = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f25013a) {
            case 0:
                C4026un c4026un = (C4026un) this.f25015c.f30881b.f24454v;
                AbstractC3137eE.h(c4026un);
                return new ViewOnClickListenerC2542Em(c4026un, (S2.a) this.f25014b.d());
            default:
                C2628Jn c2628Jn = (C2628Jn) this.f25014b.d();
                C4026un c4026un2 = (C4026un) this.f25015c.f30881b.f24454v;
                AbstractC3137eE.h(c4026un2);
                return new C2661Lm(c2628Jn, c4026un2);
        }
    }

    public C2559Fm(C4009uN c4009uN, C3218fm c3218fm) {
        this.f25014b = c4009uN;
        this.f25015c = c3218fm;
    }
}
