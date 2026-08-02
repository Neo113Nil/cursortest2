package defpackage;

/* loaded from: classes4.dex */
public final class an1 implements cn1 {
    public final int a;
    public final boolean b;

    public an1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return this.a == an1Var.a && this.b == an1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(placeholdersCount=" + this.a + ", isLoading=" + this.b + ")";
    }
}
