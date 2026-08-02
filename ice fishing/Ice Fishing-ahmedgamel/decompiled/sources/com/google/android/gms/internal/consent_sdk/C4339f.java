package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* renamed from: com.google.android.gms.internal.consent_sdk.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4339f implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36437n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Z2 f36438u;

    /* renamed from: v, reason: collision with root package name */
    public final C4409w2 f36439v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2 f36440w;

    public C4339f(C4409w2 c4409w2, Z2 z22, Z2 z23) {
        this.f36439v = c4409w2;
        this.f36438u = z22;
        this.f36440w = z23;
    }

    public S0.n a() {
        Application application = (Application) this.f36439v.f36550u;
        C4343g c4343g = (C4343g) this.f36438u.f();
        C4385q1 c4385q1 = (C4385q1) this.f36440w.f();
        B b9 = C.f36262b;
        E.c(b9);
        return new S0.n(application, c4343g, c4385q1, b9, 4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f36437n) {
            case 0:
                return a();
            default:
                Application application = (Application) this.f36439v.f36550u;
                B b9 = C.f36262b;
                E.c(b9);
                return new C4410x(application, b9, (C4406w) this.f36440w.f(), false);
        }
    }

    public C4339f(Z2 z22, C4409w2 c4409w2, Z2 z23) {
        this.f36438u = z22;
        this.f36439v = c4409w2;
        this.f36440w = z23;
    }
}
