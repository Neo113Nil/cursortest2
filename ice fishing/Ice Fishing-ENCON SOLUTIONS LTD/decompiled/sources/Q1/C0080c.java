package Q1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: Q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080c {

    /* renamed from: d, reason: collision with root package name */
    public static final W1.j f1572d;

    /* renamed from: e, reason: collision with root package name */
    public static final W1.j f1573e;

    /* renamed from: f, reason: collision with root package name */
    public static final W1.j f1574f;

    /* renamed from: g, reason: collision with root package name */
    public static final W1.j f1575g;

    /* renamed from: h, reason: collision with root package name */
    public static final W1.j f1576h;

    /* renamed from: i, reason: collision with root package name */
    public static final W1.j f1577i;

    /* renamed from: a, reason: collision with root package name */
    public final W1.j f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.j f1579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1580c;

    static {
        W1.j jVar = W1.j.f1876d;
        f1572d = m0.j.j(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f1573e = m0.j.j(":status");
        f1574f = m0.j.j(":method");
        f1575g = m0.j.j(":path");
        f1576h = m0.j.j(":scheme");
        f1577i = m0.j.j(":authority");
    }

    public C0080c(W1.j name, W1.j value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f1578a = name;
        this.f1579b = value;
        this.f1580c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080c)) {
            return false;
        }
        C0080c c0080c = (C0080c) obj;
        return kotlin.jvm.internal.i.a(this.f1578a, c0080c.f1578a) && kotlin.jvm.internal.i.a(this.f1579b, c0080c.f1579b);
    }

    public final int hashCode() {
        return this.f1579b.hashCode() + (this.f1578a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1578a.h() + ": " + this.f1579b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0080c(String name, String value) {
        this(m0.j.j(name), m0.j.j(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        W1.j jVar = W1.j.f1876d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0080c(W1.j name, String value) {
        this(name, m0.j.j(value));
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        W1.j jVar = W1.j.f1876d;
    }
}
