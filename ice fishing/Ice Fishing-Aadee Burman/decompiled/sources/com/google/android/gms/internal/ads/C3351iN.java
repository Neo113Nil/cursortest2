package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3351iN implements InterfaceC3297hN, InterfaceC3135eN {

    /* renamed from: b, reason: collision with root package name */
    public static final C3351iN f31038b = new C3351iN(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f31039a;

    public C3351iN(Object obj) {
        this.f31039a = obj;
    }

    public static C3351iN a(Object obj) {
        AbstractC3341iD.f(obj, "instance cannot be null");
        return new C3351iN(obj);
    }

    public static C3351iN b(Object obj) {
        return obj == null ? f31038b : new C3351iN(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        return this.f31039a;
    }
}
