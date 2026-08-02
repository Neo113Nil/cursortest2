package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0213b9 {
    public final C0882ye a;

    public AbstractC0213b9() {
        C0882ye c0882ye = new C0882ye(0);
        c0882ye.a(EnumC0271d9.c, 0);
        c0882ye.a(EnumC0271d9.d, 1);
        c0882ye.a(EnumC0271d9.e, 2);
        c0882ye.a(EnumC0271d9.f, 3);
        this.a = c0882ye;
    }

    public final C0882ye a() {
        return this.a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
