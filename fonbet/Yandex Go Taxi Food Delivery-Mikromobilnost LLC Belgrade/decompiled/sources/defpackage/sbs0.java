package defpackage;

/* loaded from: classes4.dex */
public final class sbs0 extends yez {
    public final qfz a;

    public sbs0(qfz qfzVar) {
        this.a = qfzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbs0) && jl40.l(this.a, ((sbs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SignatureVerificationFailed(signatureResult=" + this.a + ')';
    }
}
