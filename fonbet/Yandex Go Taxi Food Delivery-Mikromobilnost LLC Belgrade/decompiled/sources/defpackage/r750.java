package defpackage;

/* loaded from: classes10.dex */
public final class r750 extends udq0 {
    public final i750 f;

    public r750(i750 i750Var) {
        this.f = i750Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r750.class == obj.getClass() && jl40.l(this.f, ((r750) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f + ", direction=-1)";
    }
}
