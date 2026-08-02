package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class vd2 {
    public final up4 a;
    public final HashMap b;

    public vd2(up4 up4Var, HashMap hashMap) {
        this.a = up4Var;
        this.b = hashMap;
    }

    public final long a(lsm lsmVar, long j, int i) {
        long a = j - this.a.a();
        wd2 wd2Var = (wd2) this.b.get(lsmVar);
        long j2 = wd2Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), a), wd2Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vd2)) {
            return false;
        }
        vd2 vd2Var = (vd2) obj;
        return this.a.equals(vd2Var.a) && this.b.equals(vd2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
