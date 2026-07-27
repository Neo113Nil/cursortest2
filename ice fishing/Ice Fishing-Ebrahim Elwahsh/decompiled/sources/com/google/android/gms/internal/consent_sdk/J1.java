package com.google.android.gms.internal.consent_sdk;

import android.util.Log;

/* loaded from: classes2.dex */
public final class J1 implements A2, a3, I3.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35716n;

    /* renamed from: u, reason: collision with root package name */
    public static final J1 f35710u = new J1(0);

    /* renamed from: v, reason: collision with root package name */
    public static final J1 f35711v = new J1(1);

    /* renamed from: w, reason: collision with root package name */
    public static final J1 f35712w = new J1(2);

    /* renamed from: x, reason: collision with root package name */
    public static final J1 f35713x = new J1(3);

    /* renamed from: y, reason: collision with root package name */
    public static final J1 f35714y = new J1(4);

    /* renamed from: z, reason: collision with root package name */
    public static final J1 f35715z = new J1(5);

    /* renamed from: A, reason: collision with root package name */
    public static final J1 f35696A = new J1(6);

    /* renamed from: B, reason: collision with root package name */
    public static final J1 f35697B = new J1(7);

    /* renamed from: C, reason: collision with root package name */
    public static final J1 f35698C = new J1(8);

    /* renamed from: D, reason: collision with root package name */
    public static final J1 f35699D = new J1(9);

    /* renamed from: E, reason: collision with root package name */
    public static final J1 f35700E = new J1(10);

    /* renamed from: F, reason: collision with root package name */
    public static final J1 f35701F = new J1(11);

    /* renamed from: G, reason: collision with root package name */
    public static final J1 f35702G = new J1(12);

    /* renamed from: H, reason: collision with root package name */
    public static final J1 f35703H = new J1(13);

    /* renamed from: I, reason: collision with root package name */
    public static final J1 f35704I = new J1(14);
    public static final J1 J = new J1(15);

    /* renamed from: K, reason: collision with root package name */
    public static final J1 f35705K = new J1(16);

    /* renamed from: L, reason: collision with root package name */
    public static final J1 f35706L = new J1(17);

    /* renamed from: M, reason: collision with root package name */
    public static final J1 f35707M = new J1(18);

    /* renamed from: N, reason: collision with root package name */
    public static final J1 f35708N = new J1(19);

    /* renamed from: O, reason: collision with root package name */
    public static final J1 f35709O = new J1(20);

    public /* synthetic */ J1(int i) {
        this.f35716n = i;
    }

    @Override // I3.g
    public void b(I3.f fVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(fVar.f1259b)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public H2 c(Class cls) {
        switch (this.f35716n) {
            case 20:
                if (!AbstractC4368o2.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (H2) AbstractC4368o2.h(cls.asSubclass(AbstractC4368o2.class)).f(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object d() {
        switch (this.f35716n) {
            case 21:
                return new C4309a();
            default:
                B b9 = C.f35656b;
                E.c(b9);
                return new O(b9);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.A2
    public boolean e(Class cls) {
        switch (this.f35716n) {
            case 20:
                return AbstractC4368o2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
