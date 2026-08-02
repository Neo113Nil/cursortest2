package defpackage;

/* loaded from: classes5.dex */
public final class pp7 {
    public final int a;
    public final boolean b;

    public pp7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp7)) {
            return false;
        }
        pp7 pp7Var = (pp7) obj;
        return this.a == pp7Var.a && this.b == pp7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonthDifference(roundedMonthDifference=");
        sb.append(this.a);
        sb.append(", hasPartialMonth=");
        return dfi.j(sb, this.b, ')');
    }
}
