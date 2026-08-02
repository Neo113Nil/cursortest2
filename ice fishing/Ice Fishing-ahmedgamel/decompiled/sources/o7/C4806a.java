package o7;

import j7.EnumC4623b;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4806a {

    /* renamed from: a, reason: collision with root package name */
    public final g7.c f39745a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.d f39746b;

    /* renamed from: c, reason: collision with root package name */
    public final C4812g f39747c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39748d;

    public C4806a(g7.c cVar, g7.d dVar, C4812g c4812g, int i) {
        this.f39745a = cVar;
        this.f39746b = dVar;
        this.f39747c = c4812g;
        this.f39748d = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4806a)) {
            return false;
        }
        C4806a c4806a = (C4806a) obj;
        if (!this.f39745a.equals(c4806a.f39745a) || !this.f39746b.equals(c4806a.f39746b) || !this.f39747c.equals(c4806a.f39747c) || this.f39748d != c4806a.f39748d) {
            return false;
        }
        Object obj2 = EnumC4623b.f38489n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f39745a.hashCode() ^ 1000003) * 1000003) ^ this.f39746b.hashCode()) * 1000003) ^ this.f39747c.hashCode()) * 1000003) ^ this.f39748d) * 1000003) ^ EnumC4623b.f38489n.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f39745a + ", view=" + this.f39746b + "}";
    }
}
