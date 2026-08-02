package defpackage;

/* loaded from: classes10.dex */
public final class z4y {
    public final int a;
    public final int b;

    public z4y(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            lxv.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        lxv.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4y)) {
            return false;
        }
        z4y z4yVar = (z4y) obj;
        return this.a == z4yVar.a && this.b == z4yVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return oyr.s(sb, this.b, ')');
    }
}
