package com.anythink.core.common.n.b.a.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15920l;

    /* renamed from: m, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15921m;

    /* renamed from: n, reason: collision with root package name */
    final int f15922n;

    /* renamed from: a, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15910a = com.anythink.core.common.n.c.f.a(":");

    /* renamed from: b, reason: collision with root package name */
    public static final String f15911b = ":status";

    /* renamed from: g, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15916g = com.anythink.core.common.n.c.f.a(f15911b);

    /* renamed from: c, reason: collision with root package name */
    public static final String f15912c = ":method";

    /* renamed from: h, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15917h = com.anythink.core.common.n.c.f.a(f15912c);

    /* renamed from: d, reason: collision with root package name */
    public static final String f15913d = ":path";
    public static final com.anythink.core.common.n.c.f i = com.anythink.core.common.n.c.f.a(f15913d);

    /* renamed from: e, reason: collision with root package name */
    public static final String f15914e = ":scheme";

    /* renamed from: j, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15918j = com.anythink.core.common.n.c.f.a(f15914e);

    /* renamed from: f, reason: collision with root package name */
    public static final String f15915f = ":authority";

    /* renamed from: k, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15919k = com.anythink.core.common.n.c.f.a(f15915f);

    public c(String str, String str2) {
        this(com.anythink.core.common.n.c.f.a(str), com.anythink.core.common.n.c.f.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f15920l.equals(cVar.f15920l) && this.f15921m.equals(cVar.f15921m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15921m.hashCode() + ((this.f15920l.hashCode() + 527) * 31);
    }

    public final String toString() {
        return com.anythink.core.common.n.b.a.c.a("%s: %s", this.f15920l.a(), this.f15921m.a());
    }

    public c(com.anythink.core.common.n.c.f fVar, String str) {
        this(fVar, com.anythink.core.common.n.c.f.a(str));
    }

    public c(com.anythink.core.common.n.c.f fVar, com.anythink.core.common.n.c.f fVar2) {
        this.f15920l = fVar;
        this.f15921m = fVar2;
        this.f15922n = fVar2.j() + fVar.j() + 32;
    }
}
