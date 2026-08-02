package defpackage;

/* loaded from: classes3.dex */
public final class hz1 implements iz1 {
    public final ez1 a;

    public hz1(ez1 ez1Var) {
        this.a = ez1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz1) && this.a.equals(((hz1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Show(uiData=" + this.a + ")";
    }
}
