package defpackage;

/* loaded from: classes2.dex */
public final class xec {
    public final String a;
    public final oyt b;

    public xec(String str, oyt oytVar) {
        this.a = str;
        this.b = oytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xec)) {
            return false;
        }
        xec xecVar = (xec) obj;
        return this.a.equals(xecVar.a) && this.b.equals(xecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Gradient(__typename=" + this.a + ", gradientFragment=" + this.b + ')';
    }
}
