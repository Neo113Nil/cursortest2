package p8;

import x.C5176n;

/* renamed from: p8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4858d {

    /* renamed from: d, reason: collision with root package name */
    public static final y8.h f39823d;

    /* renamed from: e, reason: collision with root package name */
    public static final y8.h f39824e;

    /* renamed from: f, reason: collision with root package name */
    public static final y8.h f39825f;

    /* renamed from: g, reason: collision with root package name */
    public static final y8.h f39826g;

    /* renamed from: h, reason: collision with root package name */
    public static final y8.h f39827h;
    public static final y8.h i;

    /* renamed from: a, reason: collision with root package name */
    public final y8.h f39828a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.h f39829b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39830c;

    static {
        y8.h hVar = y8.h.f41951w;
        f39823d = C5176n.b(":");
        f39824e = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15124b);
        f39825f = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15125c);
        f39826g = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15126d);
        f39827h = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15127e);
        i = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15128f);
    }

    public C4858d(y8.h name, y8.h value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        this.f39828a = name;
        this.f39829b = value;
        this.f39830c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858d)) {
            return false;
        }
        C4858d c4858d = (C4858d) obj;
        return kotlin.jvm.internal.h.a(this.f39828a, c4858d.f39828a) && kotlin.jvm.internal.h.a(this.f39829b, c4858d.f39829b);
    }

    public final int hashCode() {
        return this.f39829b.hashCode() + (this.f39828a.hashCode() * 31);
    }

    public final String toString() {
        return this.f39828a.l() + ": " + this.f39829b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(String str, String str2) {
        this(C5176n.b(str), C5176n.b(str2));
        y8.h hVar = y8.h.f41951w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(y8.h name, String value) {
        this(name, C5176n.b(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        y8.h hVar = y8.h.f41951w;
    }
}
