package defpackage;

/* loaded from: classes3.dex */
public final class wi5 implements yi5 {
    public final gm5 a;

    public wi5(gm5 gm5Var) {
        this.a = gm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi5) && this.a.equals(((wi5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Follow(deferred=" + this.a + ")";
    }
}
