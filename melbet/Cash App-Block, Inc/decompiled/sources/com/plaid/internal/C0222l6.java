package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0222l6 implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;
    public final Provider d;
    public final C0240n6 e;
    public final Provider f;

    public C0222l6(Provider provider, Provider provider2, Provider provider3, Provider provider4, C0240n6 c0240n6, Provider provider5) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = c0240n6;
        this.f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0213k6((Z2) this.a.get(), (Y2) this.b.get(), (N5) this.c.get(), (C0100b1) this.d.get(), (C0231m6) this.e.get(), (L7) this.f.get());
    }
}
