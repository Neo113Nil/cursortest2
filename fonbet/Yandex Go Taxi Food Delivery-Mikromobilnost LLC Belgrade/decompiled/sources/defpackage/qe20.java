package defpackage;

/* loaded from: classes2.dex */
public final class qe20 {
    public final int a;
    public final float b;

    public qe20(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe20)) {
            return false;
        }
        qe20 qe20Var = (qe20) obj;
        return this.a == qe20Var.a && Float.compare(this.b, qe20Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PositionColor(color=");
        sb.append(this.a);
        sb.append(", position=");
        return n.n(sb, this.b, ')');
    }
}
