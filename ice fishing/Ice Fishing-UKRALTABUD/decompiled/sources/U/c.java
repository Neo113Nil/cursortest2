package U;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1015a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1016b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1017c;

    public c(R.b bVar, b bVar2, b bVar3) {
        this.f1015a = bVar;
        this.f1016b = bVar2;
        this.f1017c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f915a != 0 && bVar.f916b != 0) {
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
        return E0.i.a(this.f1015a, cVar.f1015a) && E0.i.a(this.f1016b, cVar.f1016b) && E0.i.a(this.f1017c, cVar.f1017c);
    }

    public final int hashCode() {
        return this.f1017c.hashCode() + ((this.f1016b.hashCode() + (this.f1015a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1015a + ", type=" + this.f1016b + ", state=" + this.f1017c + " }";
    }
}
