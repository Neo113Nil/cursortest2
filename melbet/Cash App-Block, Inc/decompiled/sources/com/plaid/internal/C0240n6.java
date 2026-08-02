package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0240n6 implements Factory {
    public final Provider a;
    public final Provider b;
    public final Provider c;

    public C0240n6(Provider provider, Provider provider2, Provider provider3) {
        this.a = provider;
        this.b = provider2;
        this.c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0231m6((N5) this.a.get(), (C0114c5) this.b.get(), (Json) this.c.get());
    }
}
