package defpackage;

import kotlin.time.TimeMark;

/* loaded from: classes5.dex */
public final class fis implements TimeMark, Comparable {
    public final long a;

    public /* synthetic */ fis(long j) {
        this.a = j;
    }

    public static long b(long j) {
        rdi.a.getClass();
        long a = rdi.a();
        ssa ssaVar = ssa.NANOSECONDS;
        return (1 | (j - 1)) == Long.MAX_VALUE ? nsa.u(rzf.E(j)) : rzf.M(a, j);
    }

    public static final long c(long j, long j2) {
        rdi.a.getClass();
        ssa ssaVar = ssa.NANOSECONDS;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? rzf.E(j) : rzf.M(j, j2);
        }
        if (j != j2) {
            return nsa.u(rzf.E(j2));
        }
        nsa.b.getClass();
        return 0L;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fis fisVar = (fis) obj;
        fisVar.getClass();
        long c = c(this.a, fisVar.a);
        nsa.b.getClass();
        return nsa.c(c, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fis) {
            return this.a == ((fis) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
