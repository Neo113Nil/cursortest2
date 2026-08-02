package defpackage;

/* loaded from: classes3.dex */
public final class dqn implements eqn {
    public final tgr a;

    public dqn(tgr tgrVar) {
        this.a = tgrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqn) && this.a.equals(((dqn) obj).a);
    }

    @Override // defpackage.eqn
    public final String getMessage() {
        return String.valueOf(this.a.getMessage());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.eqn
    public final Throwable s() {
        return this.a;
    }

    public final String toString() {
        return "RequestError(error=" + this.a + ")";
    }
}
