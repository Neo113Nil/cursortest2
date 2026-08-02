package defpackage;

/* loaded from: classes3.dex */
public final class cqn implements eqn {
    public final bqn a;

    public cqn(bqn bqnVar) {
        this.a = bqnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqn) && this.a.equals(((cqn) obj).a);
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
        return "ChannelError(error=" + this.a + ")";
    }
}
