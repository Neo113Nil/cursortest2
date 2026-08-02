package defpackage;

/* loaded from: classes6.dex */
public final class xq4 {
    public final int a;
    public final int b;

    public xq4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq4)) {
            return false;
        }
        xq4 xq4Var = (xq4) obj;
        return this.a == xq4Var.a && this.b == xq4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodecInstancesInfo(currentCount=");
        sb.append(this.a);
        sb.append(", totalAllocations=");
        return vz1.r(sb, this.b, ')');
    }
}
