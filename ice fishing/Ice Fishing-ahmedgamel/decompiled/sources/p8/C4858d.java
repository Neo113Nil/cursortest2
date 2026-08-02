package p8;

import x.C5175n;

/* renamed from: p8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4858d {

    /* renamed from: d, reason: collision with root package name */
    public static final y8.h f39873d;

    /* renamed from: e, reason: collision with root package name */
    public static final y8.h f39874e;

    /* renamed from: f, reason: collision with root package name */
    public static final y8.h f39875f;

    /* renamed from: g, reason: collision with root package name */
    public static final y8.h f39876g;

    /* renamed from: h, reason: collision with root package name */
    public static final y8.h f39877h;
    public static final y8.h i;

    /* renamed from: a, reason: collision with root package name */
    public final y8.h f39878a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.h f39879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39880c;

    static {
        y8.h hVar = y8.h.f41925w;
        f39873d = C5175n.d(":");
        f39874e = C5175n.d(com.anythink.core.common.n.b.a.e.c.f15911b);
        f39875f = C5175n.d(com.anythink.core.common.n.b.a.e.c.f15912c);
        f39876g = C5175n.d(com.anythink.core.common.n.b.a.e.c.f15913d);
        f39877h = C5175n.d(com.anythink.core.common.n.b.a.e.c.f15914e);
        i = C5175n.d(com.anythink.core.common.n.b.a.e.c.f15915f);
    }

    public C4858d(y8.h name, y8.h value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        this.f39878a = name;
        this.f39879b = value;
        this.f39880c = value.a() + name.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4858d)) {
            return false;
        }
        C4858d c4858d = (C4858d) obj;
        return kotlin.jvm.internal.h.a(this.f39878a, c4858d.f39878a) && kotlin.jvm.internal.h.a(this.f39879b, c4858d.f39879b);
    }

    public final int hashCode() {
        return this.f39879b.hashCode() + (this.f39878a.hashCode() * 31);
    }

    public final String toString() {
        return this.f39878a.l() + ": " + this.f39879b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(String str, String str2) {
        this(C5175n.d(str), C5175n.d(str2));
        y8.h hVar = y8.h.f41925w;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4858d(y8.h name, String value) {
        this(name, C5175n.d(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        y8.h hVar = y8.h.f41925w;
    }
}
