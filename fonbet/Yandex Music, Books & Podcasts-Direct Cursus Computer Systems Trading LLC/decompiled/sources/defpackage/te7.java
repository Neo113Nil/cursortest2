package defpackage;

/* loaded from: classes6.dex */
public final class te7 {
    public static final te7 d = new te7(3, 5, 5);
    public static final te7 e = new te7(1, 1, 1);
    public final int a;
    public final int b;
    public final int c;

    public te7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te7)) {
            return false;
        }
        te7 te7Var = (te7) obj;
        return this.a == te7Var.a && this.b == te7Var.b && this.c == te7Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpsilonConfig(numOfElementsBefore=");
        sb.append(this.a);
        sb.append(", numOfElementsAfter=");
        sb.append(this.b);
        sb.append(", numOfElementsIfMediaDataNotFound=");
        return vz1.r(sb, this.c, ')');
    }
}
