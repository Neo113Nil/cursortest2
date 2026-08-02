package defpackage;

/* loaded from: classes.dex */
public final class rwd implements j131 {
    public final tls a;

    public rwd(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j131
    public final Object a(r1b0 r1b0Var) {
        return this.a.invoke(r1b0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwd) && this.a.equals(((rwd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
