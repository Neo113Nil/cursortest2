package defpackage;

/* loaded from: classes.dex */
public final class e8l {
    public final xgc a;

    public e8l(xgc xgcVar) {
        this.a = xgcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e8l) {
            return this.a.equals(((e8l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
