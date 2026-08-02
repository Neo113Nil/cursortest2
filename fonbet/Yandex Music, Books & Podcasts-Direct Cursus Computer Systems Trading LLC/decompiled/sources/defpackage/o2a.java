package defpackage;

/* loaded from: classes5.dex */
public final class o2a {
    public final double a;
    public final m2a b;
    public final n2a c;

    public o2a(double d, m2a m2aVar, n2a n2aVar) {
        this.a = d;
        this.b = m2aVar;
        this.c = n2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o2a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o2a o2aVar = (o2a) obj;
        return this.a == o2aVar.a && this.b == o2aVar.b && this.c == o2aVar.c;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        m2a m2aVar = this.b;
        int hashCode2 = (hashCode + (m2aVar != null ? m2aVar.hashCode() : 0)) * 31;
        n2a n2aVar = this.c;
        return hashCode2 + (n2aVar != null ? n2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Option(duration=" + this.a + ", interpolator=" + this.b + ", transition=" + this.c + ")";
    }
}
