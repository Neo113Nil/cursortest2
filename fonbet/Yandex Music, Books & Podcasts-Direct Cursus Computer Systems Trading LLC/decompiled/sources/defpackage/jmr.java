package defpackage;

/* loaded from: classes6.dex */
public final class jmr {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jmr(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jmr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        jmr jmrVar = (jmr) obj;
        return this.a == jmrVar.a && this.b == jmrVar.b && this.c == jmrVar.c && this.d == jmrVar.d && this.e == jmrVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.e(k5r.e(tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StuckStalledConfig(minimumBufferForAlertMs=");
        sb.append(this.a);
        sb.append(", alarmPeriodMs=");
        sb.append(this.b);
        sb.append(", fatalOnlyIfShouldContinueLoadingIsFalse=");
        sb.append(this.c);
        sb.append(", produceJustNonFatalErrors=");
        sb.append(this.d);
        sb.append(", watchOnlySeekStalled=");
        return dfi.j(sb, this.e, ')');
    }
}
