package com.anythink.core.common.n.b.a.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15133l;

    /* renamed from: m, reason: collision with root package name */
    public final com.anythink.core.common.n.c.f f15134m;

    /* renamed from: n, reason: collision with root package name */
    final int f15135n;

    /* renamed from: a, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15123a = com.anythink.core.common.n.c.f.a(":");

    /* renamed from: b, reason: collision with root package name */
    public static final String f15124b = ":status";

    /* renamed from: g, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15129g = com.anythink.core.common.n.c.f.a(f15124b);

    /* renamed from: c, reason: collision with root package name */
    public static final String f15125c = ":method";

    /* renamed from: h, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15130h = com.anythink.core.common.n.c.f.a(f15125c);

    /* renamed from: d, reason: collision with root package name */
    public static final String f15126d = ":path";
    public static final com.anythink.core.common.n.c.f i = com.anythink.core.common.n.c.f.a(f15126d);

    /* renamed from: e, reason: collision with root package name */
    public static final String f15127e = ":scheme";

    /* renamed from: j, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15131j = com.anythink.core.common.n.c.f.a(f15127e);

    /* renamed from: f, reason: collision with root package name */
    public static final String f15128f = ":authority";

    /* renamed from: k, reason: collision with root package name */
    public static final com.anythink.core.common.n.c.f f15132k = com.anythink.core.common.n.c.f.a(f15128f);

    public c(String str, String str2) {
        this(com.anythink.core.common.n.c.f.a(str), com.anythink.core.common.n.c.f.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f15133l.equals(cVar.f15133l) && this.f15134m.equals(cVar.f15134m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15134m.hashCode() + ((this.f15133l.hashCode() + 527) * 31);
    }

    public final String toString() {
        return com.anythink.core.common.n.b.a.c.a("%s: %s", this.f15133l.a(), this.f15134m.a());
    }

    public c(com.anythink.core.common.n.c.f fVar, String str) {
        this(fVar, com.anythink.core.common.n.c.f.a(str));
    }

    public c(com.anythink.core.common.n.c.f fVar, com.anythink.core.common.n.c.f fVar2) {
        this.f15133l = fVar;
        this.f15134m = fVar2;
        this.f15135n = fVar2.j() + fVar.j() + 32;
    }
}
