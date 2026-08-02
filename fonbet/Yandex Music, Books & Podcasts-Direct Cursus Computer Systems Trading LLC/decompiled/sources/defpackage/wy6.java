package defpackage;

/* loaded from: classes4.dex */
public final class wy6 extends zy6 {
    public final int a;
    public final Integer b;

    public wy6(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy6)) {
            return false;
        }
        wy6 wy6Var = (wy6) obj;
        return this.a == wy6Var.a && this.b.equals(wy6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(errorTitle=" + this.a + ", errorSubtitle=" + this.b + ")";
    }
}
