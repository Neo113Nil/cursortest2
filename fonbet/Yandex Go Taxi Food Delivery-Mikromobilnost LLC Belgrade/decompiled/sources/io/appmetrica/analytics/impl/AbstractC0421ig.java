package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0421ig extends Jh {
    public AbstractC0421ig(InterfaceC0418ic interfaceC0418ic) {
        this(interfaceC0418ic, null);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final String a(String str, String str2) {
        return this.a.getString(g(str), str2);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final boolean b(String str) {
        return this.a.a(g(str));
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public So e(String str) {
        return f(g(str));
    }

    public abstract String g(String str);

    public AbstractC0421ig(InterfaceC0418ic interfaceC0418ic, String str) {
        super(interfaceC0418ic, str);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final int a(String str, int i) {
        return this.a.getInt(g(str), i);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final So b(String str, int i) {
        return d(g(str), i);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final So b(String str, long j) {
        return d(g(str), j);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final long a(String str, long j) {
        return this.a.getLong(g(str), j);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final So b(String str, boolean z) {
        return d(g(str), z);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final So b(String str, String str2) {
        return d(g(str), str2);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final boolean a(String str, boolean z) {
        return this.a.getBoolean(g(str), z);
    }
}
