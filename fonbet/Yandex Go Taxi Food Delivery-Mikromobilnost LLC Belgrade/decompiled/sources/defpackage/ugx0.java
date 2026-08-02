package defpackage;

/* loaded from: classes2.dex */
public final class ugx0 {
    public final String a;
    public final hi4 b;

    public ugx0(String str, hi4 hi4Var) {
        this.a = str;
        this.b = hi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugx0)) {
            return false;
        }
        ugx0 ugx0Var = (ugx0) obj;
        return this.a.equals(ugx0Var.a) && this.b.equals(ugx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundTv(__typename=" + this.a + ", backgroundTv=" + this.b + ')';
    }
}
