package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f81 {
    public static final f81 X1lG3V04pd = new f81(o50.WRKkgoJXwDn(0), o50.WRKkgoJXwDn(0));
    public final long GWasM1elztuh;
    public final long Yi7zF1RB1;

    public f81(long j, long j2) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f81)) {
            return false;
        }
        f81 f81Var = (f81) obj;
        return a91.GWasM1elztuh(this.GWasM1elztuh, f81Var.GWasM1elztuh) && a91.GWasM1elztuh(this.Yi7zF1RB1, f81Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        b91[] b91VarArr = a91.Yi7zF1RB1;
        return Long.hashCode(this.Yi7zF1RB1) + (Long.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) a91.xqGvceK5x(this.GWasM1elztuh)) + ", restLine=" + ((Object) a91.xqGvceK5x(this.Yi7zF1RB1)) + ')';
    }
}
