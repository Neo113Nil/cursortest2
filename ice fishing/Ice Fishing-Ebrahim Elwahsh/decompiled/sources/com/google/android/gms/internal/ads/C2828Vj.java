package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2828Vj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28289a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3700ok f28290b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f28291c;

    public C2828Vj(C3700ok c3700ok, C4009uN c4009uN) {
        this.f28290b = c3700ok;
        this.f28291c = c4009uN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f28289a) {
            case 0:
                return new C2811Uj((C2862Xj) this.f28291c.d(), this.f28290b.a());
            default:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                C3226fu a9 = this.f28290b.a();
                return new Ur(c3157eg, a9, 0);
        }
    }

    public C2828Vj(C4009uN c4009uN, C3700ok c3700ok) {
        this.f28291c = c4009uN;
        this.f28290b = c3700ok;
    }
}
