package p8;

import x.C5176n;

/* renamed from: p8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4858d {

    /* renamed from: d, reason: collision with root package name */
    public static final y8.h f39826d;

    /* renamed from: e, reason: collision with root package name */
    public static final y8.h f39827e;

    /* renamed from: f, reason: collision with root package name */
    public static final y8.h f39828f;

    /* renamed from: g, reason: collision with root package name */
    public static final y8.h f39829g;

    /* renamed from: h, reason: collision with root package name */
    public static final y8.h f39830h;
    public static final y8.h i;

    /* renamed from: a, reason: collision with root package name */
    public final y8.h f39831a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.h f39832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39833c;

    static {
        y8.h hVar = y8.h.f41954w;
        f39826d = C5176n.b(":");
        f39827e = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15124b);
        f39828f = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15125c);
        f39829g = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15126d);
        f39830h = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15127e);
        i = C5176n.b(com.anythink.core.common.n.b.a.e.c.f15128f);
    }

    public C4858d(y8.h name, y8.h value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        this.f39831a = name;
        this.f39832b = value;
        this.f39833c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858d)) {
            return false;
        }
        C4858d c4858d = (C4858d) obj;
        return kotlin.jvm.internal.h.a(this.f39831a, c4858d.f39831a) && kotlin.jvm.internal.h.a(this.f39832b, c4858d.f39832b);
    }

    public final int hashCode() {
        return this.f39832b.hashCode() + (this.f39831a.hashCode() * 31);
    }

    public final String toString() {
        return this.f39831a.l() + ": " + this.f39832b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(String str, String str2) {
        this(C5176n.b(str), C5176n.b(str2));
        y8.h hVar = y8.h.f41954w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(y8.h name, String value) {
        this(name, C5176n.b(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        y8.h hVar = y8.h.f41954w;
    }
}
