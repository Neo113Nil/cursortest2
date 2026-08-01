package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4316f implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35668n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Z2 f35669u;

    /* renamed from: v, reason: collision with root package name */
    public final C4386w2 f35670v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2 f35671w;

    public C4316f(C4386w2 c4386w2, Z2 z22, Z2 z23) {
        this.f35670v = c4386w2;
        this.f35669u = z22;
        this.f35671w = z23;
    }

    public S0.n a() {
        Application application = (Application) this.f35670v.f35781u;
        C4320g c4320g = (C4320g) this.f35669u.f();
        C4362q1 c4362q1 = (C4362q1) this.f35671w.f();
        B b9 = C.f35493b;
        E.c(b9);
        return new S0.n(application, c4320g, c4362q1, b9, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f35668n) {
            case 0:
                return a();
            default:
                Application application = (Application) this.f35670v.f35781u;
                B b9 = C.f35493b;
                E.c(b9);
                return new C4387x(application, b9, (C4383w) this.f35671w.f(), false);
        }
    }

    public C4316f(Z2 z22, C4386w2 c4386w2, Z2 z23) {
        this.f35669u = z22;
        this.f35670v = c4386w2;
        this.f35671w = z23;
    }
}
