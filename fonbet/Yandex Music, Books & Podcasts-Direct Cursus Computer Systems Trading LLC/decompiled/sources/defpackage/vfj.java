package defpackage;

/* loaded from: classes5.dex */
public final class vfj implements wfj {
    public final rf3 a;

    public vfj(rf3 rf3Var) {
        rf3Var.getClass();
        this.a = rf3Var;
    }

    @Override // defpackage.wfj
    public final rf3 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfj) && this.a == ((vfj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Support(tab=" + this.a + ")";
    }
}
