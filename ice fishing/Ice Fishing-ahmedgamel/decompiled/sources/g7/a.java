package g7;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: n, reason: collision with root package name */
    public final k7.b f37659n;

    public a(k7.b bVar) {
        this.f37659n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f37659n.equals(((a) obj).f37659n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37659n.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{descriptor=" + this.f37659n + '}';
    }
}
