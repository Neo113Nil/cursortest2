package defpackage;

/* loaded from: classes10.dex */
public final class y0j0 implements alc {
    public final tis0 a;

    public y0j0(tis0 tis0Var) {
        this.a = tis0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0j0) && this.a == ((y0j0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.a + ')';
    }
}
