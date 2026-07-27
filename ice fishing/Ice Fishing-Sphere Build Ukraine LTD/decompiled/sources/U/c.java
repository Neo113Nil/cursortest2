package U;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1023a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1024b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1025c;

    public c(R.b bVar, b bVar2, b bVar3) {
        this.f1023a = bVar;
        this.f1024b = bVar2;
        this.f1025c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f923a != 0 && bVar.f924b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        E0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return E0.i.a(this.f1023a, cVar.f1023a) && E0.i.a(this.f1024b, cVar.f1024b) && E0.i.a(this.f1025c, cVar.f1025c);
    }

    public final int hashCode() {
        return this.f1025c.hashCode() + ((this.f1024b.hashCode() + (this.f1023a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1023a + ", type=" + this.f1024b + ", state=" + this.f1025c + " }";
    }
}
