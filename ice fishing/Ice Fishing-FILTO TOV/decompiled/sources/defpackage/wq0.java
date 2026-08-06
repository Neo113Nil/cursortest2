package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wq0 extends d70 {
    public final Object GWasM1elztuh;
    public final long Yi7zF1RB1;

    public wq0(long j, Object obj) {
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq0)) {
            return false;
        }
        wq0 wq0Var = (wq0) obj;
        return this.GWasM1elztuh.equals(wq0Var.GWasM1elztuh) && this.Yi7zF1RB1 == wq0Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Long.hashCode(this.Yi7zF1RB1) + (this.GWasM1elztuh.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.GWasM1elztuh + ", compositeKey=" + this.Yi7zF1RB1 + ')';
    }
}
