package defpackage;

/* loaded from: classes.dex */
public final class uof {
    public final jgg0 a;
    public final boolean b;

    public uof(jgg0 jgg0Var, boolean z) {
        this.a = jgg0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uof) {
            uof uofVar = (uof) obj;
            if (uofVar.a.equals(this.a) && uofVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
