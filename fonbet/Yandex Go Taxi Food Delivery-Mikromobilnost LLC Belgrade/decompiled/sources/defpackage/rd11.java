package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class rd11 {
    public static final nd11 Companion = new nd11();
    public final qd11 a;

    public /* synthetic */ rd11(int i, qd11 qd11Var) {
        if (1 == (i & 1)) {
            this.a = qd11Var;
        } else {
            qje.Z(i, 1, md11.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd11) && jl40.l(this.a, ((rd11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GeolocationParams(location=" + this.a + ')';
    }

    public rd11(qd11 qd11Var) {
        this.a = qd11Var;
    }
}
