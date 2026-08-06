package Z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final W.b f1930a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1931b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1932c;

    public c(W.b bVar, b bVar2, b bVar3) {
        this.f1930a = bVar;
        this.f1931b = bVar2;
        this.f1932c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f1833a != 0 && bVar.f1834b != 0) {
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
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.i.a(this.f1930a, cVar.f1930a) && kotlin.jvm.internal.i.a(this.f1931b, cVar.f1931b) && kotlin.jvm.internal.i.a(this.f1932c, cVar.f1932c);
    }

    public final int hashCode() {
        return this.f1932c.hashCode() + ((this.f1931b.hashCode() + (this.f1930a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1930a + ", type=" + this.f1931b + ", state=" + this.f1932c + " }";
    }
}
