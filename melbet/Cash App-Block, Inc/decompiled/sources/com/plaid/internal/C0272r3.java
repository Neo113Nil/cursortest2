package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0272r3 implements Factory {
    public final Provider a;
    public final Provider b;

    public C0272r3(C0147d3 c0147d3, Provider provider, Provider provider2) {
        this.a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E5 e5 = (E5) this.a.get();
        C0230m5 c0230m5 = (C0230m5) this.b.get();
        e5.getClass();
        c0230m5.getClass();
        EnumC0203j5 b = c0230m5.b();
        b.getClass();
        int i = C0212k5.a[b.ordinal()];
        String str = "https://production.plaid.com/";
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = e5.a(str, new G5(null, 3)).create(i8.class);
        create.getClass();
        return (i8) create;
    }
}
