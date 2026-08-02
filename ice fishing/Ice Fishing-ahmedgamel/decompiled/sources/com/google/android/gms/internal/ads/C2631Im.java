package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2631Im implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26317a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f26318b;

    /* renamed from: c, reason: collision with root package name */
    public final C3389im f26319c;

    public C2631Im(C3389im c3389im, C3266gN c3266gN) {
        this.f26319c = c3389im;
        this.f26318b = c3266gN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f26317a) {
            case 0:
                C4036un c4036un = (C4036un) this.f26319c.f31886b.f25831v;
                AbstractC3364iD.j(c4036un);
                return new ViewOnClickListenerC2614Hm(c4036un, (V2.a) this.f26318b.f());
            default:
                C2649Jn c2649Jn = (C2649Jn) this.f26318b.f();
                C4036un c4036un2 = (C4036un) this.f26319c.f31886b.f25831v;
                AbstractC3364iD.j(c4036un2);
                return new C2733Om(c2649Jn, c4036un2);
        }
    }

    public C2631Im(C3266gN c3266gN, C3389im c3389im) {
        this.f26318b = c3266gN;
        this.f26319c = c3389im;
    }
}
