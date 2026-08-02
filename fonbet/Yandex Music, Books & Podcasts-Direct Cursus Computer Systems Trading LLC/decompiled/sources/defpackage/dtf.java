package defpackage;

/* loaded from: classes.dex */
public final class dtf {
    public final int a;
    public final int b;

    public dtf(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            vme.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        vme.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtf)) {
            return false;
        }
        dtf dtfVar = (dtf) obj;
        return this.a == dtfVar.a && this.b == dtfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vz1.r(sb, this.b, ')');
    }
}
