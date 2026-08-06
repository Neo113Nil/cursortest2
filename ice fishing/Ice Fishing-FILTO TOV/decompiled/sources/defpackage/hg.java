package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hg {
    public final int GWasM1elztuh;
    public final ig X1lG3V04pd;
    public final long Yi7zF1RB1;
    public final ha1 xqGvceK5x;

    public hg(int i, long j, ig igVar, ha1 ha1Var) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = j;
        this.X1lG3V04pd = igVar;
        this.xqGvceK5x = ha1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return this.GWasM1elztuh == hgVar.GWasM1elztuh && this.Yi7zF1RB1 == hgVar.Yi7zF1RB1 && this.X1lG3V04pd == hgVar.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, hgVar.xqGvceK5x);
    }

    public final int hashCode() {
        int hashCode = (this.X1lG3V04pd.hashCode() + mr0.X1lG3V04pd(Integer.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1)) * 31;
        ha1 ha1Var = this.xqGvceK5x;
        return hashCode + (ha1Var == null ? 0 : ha1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.GWasM1elztuh + ", timestamp=" + this.Yi7zF1RB1 + ", type=" + this.X1lG3V04pd + ", structureCompat=" + this.xqGvceK5x + ')';
    }
}
