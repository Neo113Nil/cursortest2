package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4200xz implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35287a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f35288b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f35289c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f35290d;

    /* renamed from: e, reason: collision with root package name */
    public final C4117wN f35291e;

    public /* synthetic */ C4200xz(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4117wN c4117wN, int i) {
        this.f35287a = i;
        this.f35288b = c4009uN;
        this.f35289c = c4009uN2;
        this.f35290d = c4009uN3;
        this.f35291e = c4117wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f35287a) {
            case 0:
                InterfaceC3901sN b9 = C4009uN.b(this.f35288b);
                InterfaceC3901sN b10 = C4009uN.b(this.f35289c);
                InterfaceC3901sN b11 = C4009uN.b(this.f35290d);
                C3066cy c3066cy = (C3066cy) this.f35291e.f34977a;
                return new C4146wz(b9, b10, b11, c3066cy.X().A(), c3066cy.X().D());
            default:
                InterfaceC3901sN b12 = C4009uN.b(this.f35288b);
                C4158xA c4158xA = (C4158xA) this.f35289c.d();
                return new C3511lA(b12, c4158xA, ((C3066cy) this.f35291e.f34977a).X().B());
        }
    }
}
