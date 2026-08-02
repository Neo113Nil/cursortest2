package defpackage;

/* loaded from: classes10.dex */
public final class t38 {
    public final int a;
    public final int b;

    public t38(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t38)) {
            return false;
        }
        t38 t38Var = (t38) obj;
        return this.a == t38Var.a && this.b == t38Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.a);
        sb.append(", encodeRate=");
        return oyr.s(sb, this.b, ')');
    }
}
