package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes2.dex */
public final class E1 implements a3 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35505n;

    /* renamed from: u, reason: collision with root package name */
    public final C4386w2 f35506u;

    /* renamed from: v, reason: collision with root package name */
    public final Z2 f35507v;

    public /* synthetic */ E1(C4386w2 c4386w2, Z2 z22, int i) {
        this.f35505n = i;
        this.f35506u = c4386w2;
        this.f35507v = z22;
    }

    public C4344m a() {
        return new C4344m((Application) this.f35506u.f35781u, (C4320g) this.f35507v.f());
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public final Object f() {
        switch (this.f35505n) {
            case 0:
                return new C4362q1((Application) this.f35506u.f35781u, (C4308d) this.f35507v.f());
            default:
                return a();
        }
    }
}
