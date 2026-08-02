package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3642nN implements InterfaceC3534lN {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f33501c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC3320hN f33502a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f33503b;

    public static InterfaceC3534lN a(InterfaceC3320hN interfaceC3320hN) {
        if ((interfaceC3320hN instanceof C3642nN) || (interfaceC3320hN instanceof C3266gN)) {
            return interfaceC3320hN;
        }
        C3642nN c3642nN = new C3642nN();
        c3642nN.f33503b = f33501c;
        c3642nN.f33502a = interfaceC3320hN;
        return c3642nN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        Object obj = this.f33503b;
        if (obj != f33501c) {
            return obj;
        }
        InterfaceC3320hN interfaceC3320hN = this.f33502a;
        if (interfaceC3320hN == null) {
            return this.f33503b;
        }
        Object f2 = interfaceC3320hN.f();
        this.f33503b = f2;
        this.f33502a = null;
        return f2;
    }
}
