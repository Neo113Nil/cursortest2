package defpackage;

/* loaded from: classes.dex */
public final class qw0 extends defpackage.c80 {
    public final long F7NU4MC0GW;
    public final java.lang.Object r1MBDhnF;

    public qw0(long j, java.lang.Object obj) {
        this.r1MBDhnF = obj;
        this.F7NU4MC0GW = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.qw0)) {
            return false;
        }
        defpackage.qw0 qw0Var = (defpackage.qw0) obj;
        return this.r1MBDhnF.equals(qw0Var.r1MBDhnF) && this.F7NU4MC0GW == qw0Var.F7NU4MC0GW;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.F7NU4MC0GW) + (this.r1MBDhnF.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.r1MBDhnF + ", compositeKey=" + this.F7NU4MC0GW + ')';
    }
}
