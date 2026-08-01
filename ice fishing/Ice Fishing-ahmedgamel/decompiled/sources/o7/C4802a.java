package o7;

import j7.EnumC4613b;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4802a {

    /* renamed from: a, reason: collision with root package name */
    public final g7.c f39637a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.d f39638b;

    /* renamed from: c, reason: collision with root package name */
    public final C4808g f39639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39640d;

    public C4802a(g7.c cVar, g7.d dVar, C4808g c4808g, int i) {
        this.f39637a = cVar;
        this.f39638b = dVar;
        this.f39639c = c4808g;
        this.f39640d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4802a)) {
            return false;
        }
        C4802a c4802a = (C4802a) obj;
        if (!this.f39637a.equals(c4802a.f39637a) || !this.f39638b.equals(c4802a.f39638b) || !this.f39639c.equals(c4802a.f39639c) || this.f39640d != c4802a.f39640d) {
            return false;
        }
        Object obj2 = EnumC4613b.f38477n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f39637a.hashCode() ^ 1000003) * 1000003) ^ this.f39638b.hashCode()) * 1000003) ^ this.f39639c.hashCode()) * 1000003) ^ this.f39640d) * 1000003) ^ EnumC4613b.f38477n.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f39637a + ", view=" + this.f39638b + "}";
    }
}
