package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class H4 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4461b;

    public H4(Q4 q4) {
        this.f4460a = String.format("component_%s.db", Arrays.copyOf(new Object[]{q4.d() ? "main" : q4.b()}, 1));
        this.f4461b = "db_metrica_" + q4;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final String a() {
        return this.f4461b;
    }

    @Override // io.appmetrica.analytics.impl.X6
    public final String b() {
        return this.f4460a;
    }
}
