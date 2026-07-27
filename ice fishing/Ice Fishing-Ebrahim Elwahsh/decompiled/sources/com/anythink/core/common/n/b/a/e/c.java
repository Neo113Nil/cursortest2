package com.anythink.core.common.n.b.a.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15291l;

    /* renamed from: m, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15292m;

    /* renamed from: n, reason: collision with root package name */
    final int f15293n;

    /* renamed from: a, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15281a = com.anythink.core.common.n.c.f.a(":");

    /* renamed from: b, reason: collision with root package name */
    public static final String f15282b = ":status";

    /* renamed from: g, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15287g = com.anythink.core.common.n.c.f.a(f15282b);

    /* renamed from: c, reason: collision with root package name */
    public static final String f15283c = ":method";

    /* renamed from: h, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15288h = com.anythink.core.common.n.c.f.a(f15283c);

    /* renamed from: d, reason: collision with root package name */
    public static final String f15284d = ":path";
    public static final com.anythink.core.common.n.c.f i = com.anythink.core.common.n.c.f.a(f15284d);

    /* renamed from: e, reason: collision with root package name */
    public static final String f15285e = ":scheme";

    /* renamed from: j, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15289j = com.anythink.core.common.n.c.f.a(f15285e);

    /* renamed from: f, reason: collision with root package name */
    public static final String f15286f = ":authority";

    /* renamed from: k, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15290k = com.anythink.core.common.n.c.f.a(f15286f);

    public c(String str, String str2) {
        this(com.anythink.core.common.n.c.f.a(str), com.anythink.core.common.n.c.f.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f15291l.equals(cVar.f15291l) && this.f15292m.equals(cVar.f15292m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15292m.hashCode() + ((this.f15291l.hashCode() + 527) * 31);
    }

    public final String toString() {
        return com.anythink.core.common.n.b.a.c.a("%s: %s", this.f15291l.a(), this.f15292m.a());
    }

    public c(com.anythink.core.common.n.c.f fVar, String str) {
        this(fVar, com.anythink.core.common.n.c.f.a(str));
    }

    public c(com.anythink.core.common.n.c.f fVar, com.anythink.core.common.n.c.f fVar2) {
        this.f15291l = fVar;
        this.f15292m = fVar2;
        this.f15293n = fVar2.j() + fVar.j() + 32;
    }
}
