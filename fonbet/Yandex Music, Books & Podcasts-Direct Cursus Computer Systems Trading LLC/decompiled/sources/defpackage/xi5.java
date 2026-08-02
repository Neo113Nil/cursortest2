package defpackage;

/* loaded from: classes3.dex */
public final class xi5 implements yi5 {
    public final gm5 a;

    public xi5(gm5 gm5Var) {
        this.a = gm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi5) && this.a.equals(((xi5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Lead(deferred=" + this.a + ")";
    }
}
