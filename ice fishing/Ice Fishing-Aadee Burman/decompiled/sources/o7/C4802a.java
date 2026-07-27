package o7;

import j7.EnumC4613b;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4802a {

    /* renamed from: a, reason: collision with root package name */
    public final g7.c f39634a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.d f39635b;

    /* renamed from: c, reason: collision with root package name */
    public final C4808g f39636c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39637d;

    public C4802a(g7.c cVar, g7.d dVar, C4808g c4808g, int i) {
        this.f39634a = cVar;
        this.f39635b = dVar;
        this.f39636c = c4808g;
        this.f39637d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4802a)) {
            return false;
        }
        C4802a c4802a = (C4802a) obj;
        if (!this.f39634a.equals(c4802a.f39634a) || !this.f39635b.equals(c4802a.f39635b) || !this.f39636c.equals(c4802a.f39636c) || this.f39637d != c4802a.f39637d) {
            return false;
        }
        Object obj2 = EnumC4613b.f38477n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f39634a.hashCode() ^ 1000003) * 1000003) ^ this.f39635b.hashCode()) * 1000003) ^ this.f39636c.hashCode()) * 1000003) ^ this.f39637d) * 1000003) ^ EnumC4613b.f38477n.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f39634a + ", view=" + this.f39635b + "}";
    }
}
