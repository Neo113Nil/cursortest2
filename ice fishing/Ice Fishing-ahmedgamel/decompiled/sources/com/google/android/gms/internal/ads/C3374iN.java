package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3374iN implements InterfaceC3320hN, InterfaceC3158eN {

    /* renamed from: b, reason: collision with root package name */
    public static final C3374iN f31811b = new C3374iN(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f31812a;

    public C3374iN(Object obj) {
        this.f31812a = obj;
    }

    public static C3374iN a(Object obj) {
        AbstractC3364iD.f(obj, "instance cannot be null");
        return new C3374iN(obj);
    }

    public static C3374iN b(Object obj) {
        return obj == null ? f31811b : new C3374iN(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        return this.f31812a;
    }
}
