package defpackage;

/* loaded from: classes4.dex */
public final class qn1 implements sn1 {
    public final int a;
    public final boolean b;

    public qn1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn1)) {
            return false;
        }
        qn1 qn1Var = (qn1) obj;
        return this.a == qn1Var.a && this.b == qn1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(placeholdersCount=" + this.a + ", isLoading=" + this.b + ")";
    }
}
