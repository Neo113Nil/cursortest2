package defpackage;

/* loaded from: classes8.dex */
public final class vhc0 {
    public final Integer a;
    public final Integer b;

    public vhc0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhc0)) {
            return false;
        }
        vhc0 vhc0Var = (vhc0) obj;
        return jl40.l(this.a, vhc0Var.a) && jl40.l(this.b, vhc0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(showAfter=");
        sb.append(this.a);
        sb.append(", closeAfter=");
        return vfc.o(sb, this.b, ')');
    }
}
