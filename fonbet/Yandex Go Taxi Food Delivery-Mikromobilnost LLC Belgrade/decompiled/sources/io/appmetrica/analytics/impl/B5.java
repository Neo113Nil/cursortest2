package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class B5 implements U7 {
    public final String a;
    public final String b;

    public B5(K5 k5) {
        this.a = String.format("component_%s.db", Arrays.copyOf(new Object[]{k5.d() ? "main" : k5.b()}, 1));
        this.b = "db_metrica_" + k5;
    }

    @Override // io.appmetrica.analytics.impl.U7
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.U7
    public final String b() {
        return this.a;
    }
}
