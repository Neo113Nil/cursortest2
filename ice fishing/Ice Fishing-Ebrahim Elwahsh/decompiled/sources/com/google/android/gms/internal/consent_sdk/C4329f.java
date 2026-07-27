package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4329f implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35831n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Z2 f35832u;

    /* renamed from: v, reason: collision with root package name */
    public final C4399w2 f35833v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2 f35834w;

    public C4329f(C4399w2 c4399w2, Z2 z22, Z2 z23) {
        this.f35833v = c4399w2;
        this.f35832u = z22;
        this.f35834w = z23;
    }

    public S0.i a() {
        Application application = (Application) this.f35833v.f35944u;
        C4333g c4333g = (C4333g) this.f35832u.d();
        C4375q1 c4375q1 = (C4375q1) this.f35834w.d();
        B b9 = C.f35656b;
        E.c(b9);
        return new S0.i(application, c4333g, c4375q1, b9, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object d() {
        switch (this.f35831n) {
            case 0:
                return a();
            default:
                Application application = (Application) this.f35833v.f35944u;
                B b9 = C.f35656b;
                E.c(b9);
                return new C4400x(application, b9, (C4396w) this.f35834w.d(), false);
        }
    }

    public C4329f(Z2 z22, C4399w2 c4399w2, Z2 z23) {
        this.f35832u = z22;
        this.f35833v = c4399w2;
        this.f35834w = z23;
    }
}
