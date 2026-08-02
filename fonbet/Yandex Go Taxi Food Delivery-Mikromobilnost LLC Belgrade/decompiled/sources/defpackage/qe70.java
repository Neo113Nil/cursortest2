package defpackage;

/* loaded from: classes2.dex */
public final class qe70 {
    public final String a;
    public final hi4 b;

    public qe70(String str, hi4 hi4Var) {
        this.a = str;
        this.b = hi4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe70)) {
            return false;
        }
        qe70 qe70Var = (qe70) obj;
        return this.a.equals(qe70Var.a) && this.b.equals(qe70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundTv(__typename=" + this.a + ", backgroundTv=" + this.b + ')';
    }
}
