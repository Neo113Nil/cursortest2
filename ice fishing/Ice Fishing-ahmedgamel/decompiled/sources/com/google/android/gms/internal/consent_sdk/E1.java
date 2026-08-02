package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes2.dex */
public final class E1 implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36274n;

    /* renamed from: u, reason: collision with root package name */
    public final C4409w2 f36275u;

    /* renamed from: v, reason: collision with root package name */
    public final Z2 f36276v;

    public /* synthetic */ E1(C4409w2 c4409w2, Z2 z22, int i) {
        this.f36274n = i;
        this.f36275u = c4409w2;
        this.f36276v = z22;
    }

    public C4367m a() {
        return new C4367m((Application) this.f36275u.f36550u, (C4343g) this.f36276v.f());
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f36274n) {
            case 0:
                return new C4385q1((Application) this.f36275u.f36550u, (C4331d) this.f36276v.f());
            default:
                return a();
        }
    }
}
