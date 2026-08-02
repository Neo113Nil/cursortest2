package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class J1 implements Factory {
    public final I1 a;
    public final Provider b;
    public final Provider c;

    public J1(I1 i1, Provider provider, Provider provider2) {
        this.a = i1;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i1 = this.a;
        T3 t3 = (T3) this.b.get();
        Json json = (Json) this.c.get();
        i1.getClass();
        t3.getClass();
        json.getClass();
        return new C(t3, json);
    }
}
