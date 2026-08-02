package defpackage;

/* loaded from: classes.dex */
public final class vr5 {
    public final sr5 a;

    public vr5(sr5 sr5Var) {
        this.a = sr5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr5) {
            return this.a.equals(((vr5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
