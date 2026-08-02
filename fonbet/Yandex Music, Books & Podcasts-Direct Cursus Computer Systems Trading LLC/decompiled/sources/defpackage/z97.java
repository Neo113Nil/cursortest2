package defpackage;

/* loaded from: classes3.dex */
public final class z97 {
    public final y97 a;
    public final y97 b;
    public final double c;

    public z97(y97 y97Var, y97 y97Var2, double d) {
        this.a = y97Var;
        this.b = y97Var2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z97)) {
            return false;
        }
        z97 z97Var = (z97) obj;
        return this.a == z97Var.a && this.b == z97Var.b && Double.compare(this.c, z97Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        return k5r.n(sb, this.c, ')');
    }
}
