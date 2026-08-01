package androidx.window.layout;

import t0.C0350b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0350b f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final e f2232c;

    public f(C0350b c0350b, e eVar, e eVar2) {
        this.f2230a = c0350b;
        this.f2231b = eVar;
        this.f2232c = eVar2;
        if (c0350b.b() == 0 && c0350b.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c0350b.f4360a != 0 && c0350b.f4361b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean a() {
        e eVar = e.f2227h;
        e eVar2 = this.f2231b;
        if (D1.i.a(eVar2, eVar)) {
            return true;
        }
        if (D1.i.a(eVar2, e.f2226g)) {
            if (D1.i.a(this.f2232c, e.f2225f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        f fVar = (f) obj;
        return D1.i.a(this.f2230a, fVar.f2230a) && D1.i.a(this.f2231b, fVar.f2231b) && D1.i.a(this.f2232c, fVar.f2232c);
    }

    public final int hashCode() {
        return this.f2232c.hashCode() + ((this.f2231b.hashCode() + (this.f2230a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return ((Object) f.class.getSimpleName()) + " { " + this.f2230a + ", type=" + this.f2231b + ", state=" + this.f2232c + " }";
    }
}
