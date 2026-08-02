package defpackage;

/* loaded from: classes.dex */
public final class cnq {
    public final int a;
    public final int b;

    public cnq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnq)) {
            return false;
        }
        cnq cnqVar = (cnq) obj;
        return this.a == cnqVar.a && this.b == cnqVar.b;
    }

    public final int hashCode() {
        return ouj.D(this.b) + (ouj.D(this.a) * 31);
    }

    public final String toString() {
        return "SizeSelector(width=" + f1d.y(this.a) + ", height=" + f1d.y(this.b) + ')';
    }
}
