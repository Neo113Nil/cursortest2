package f6;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f37485a;

    /* renamed from: b, reason: collision with root package name */
    public final g f37486b;

    public d(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f37485a = str;
        if (gVar == null) {
            throw new NullPointerException("Null value");
        }
        this.f37486b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f37485a.equals(dVar.f37485a) && this.f37486b.equals(dVar.f37486b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37485a.hashCode() ^ 1000003) * 1000003) ^ this.f37486b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.f37485a + ", value=" + this.f37486b + "}";
    }
}
