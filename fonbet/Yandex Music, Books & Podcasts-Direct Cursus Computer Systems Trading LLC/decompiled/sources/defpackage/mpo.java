package defpackage;

/* loaded from: classes4.dex */
public final class mpo {
    public final lpo a;
    public final int b;

    public mpo(lpo lpoVar, int i) {
        this.a = lpoVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpo)) {
            return false;
        }
        mpo mpoVar = (mpo) obj;
        return this.a == mpoVar.a && this.b == mpoVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SbpChallengeResultInfo(status=" + this.a + ", attemptsLeft=" + this.b + ")";
    }
}
