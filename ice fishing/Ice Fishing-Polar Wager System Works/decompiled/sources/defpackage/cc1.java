package defpackage;

/* loaded from: classes.dex */
public final class cc1 implements defpackage.q91 {
    public final long adDC3e2L;
    public final long xiZrDbcSW0;

    public cc1(long j, long j2) {
        this.adDC3e2L = j;
        this.xiZrDbcSW0 = j2;
        if (j < 0) {
            defpackage.db.EXtogiMhuM("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        defpackage.db.EXtogiMhuM("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cc1)) {
            return false;
        }
        defpackage.cc1 cc1Var = (defpackage.cc1) obj;
        return this.adDC3e2L == cc1Var.adDC3e2L && this.xiZrDbcSW0 == cc1Var.xiZrDbcSW0;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.xiZrDbcSW0) + (java.lang.Long.hashCode(this.adDC3e2L) * 31);
    }

    @Override // defpackage.q91
    public final defpackage.hw r1MBDhnF(defpackage.jd1 jd1Var) {
        defpackage.bc1 bc1Var = new defpackage.bc1(this, null);
        int i = defpackage.cx.IHQe1A4L2xu;
        return defpackage.gq1.kd6TUFXn(new defpackage.sw(new defpackage.ac(bc1Var, jd1Var, defpackage.lt.adDC3e2L, -2, defpackage.t9.adDC3e2L), new defpackage.ll(2, null, 4)));
    }

    public final java.lang.String toString() {
        defpackage.te0 te0Var = new defpackage.te0(2);
        long j = this.adDC3e2L;
        if (j > 0) {
            te0Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.xiZrDbcSW0;
        if (j2 < Long.MAX_VALUE) {
            te0Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + defpackage.td.cSNyPqwud(defpackage.fm.fnWB2E7cs(te0Var), null, null, null, null, 63) + ')';
    }
}
