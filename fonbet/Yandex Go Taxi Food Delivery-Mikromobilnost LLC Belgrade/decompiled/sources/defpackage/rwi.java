package defpackage;

/* loaded from: classes15.dex */
public final class rwi {
    public final hs31 a;

    public rwi(hs31 hs31Var) {
        this.a = hs31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwi) && jl40.l(this.a, ((rwi) obj).a);
    }

    public final int hashCode() {
        this.a.hashCode();
        throw null;
    }

    public final String toString() {
        return "Dependencies(viewModelFactory=" + this.a + ", activityComponent=null)";
    }
}
