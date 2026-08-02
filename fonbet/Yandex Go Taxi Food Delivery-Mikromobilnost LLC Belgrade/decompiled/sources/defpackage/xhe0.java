package defpackage;

/* loaded from: classes2.dex */
public final class xhe0 implements eie0 {
    public final eie0 a;

    public xhe0(eie0 eie0Var) {
        this.a = eie0Var;
    }

    public final eie0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xhe0) && jl40.l(this.a, ((xhe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Not(predicate=" + this.a + ')';
    }
}
