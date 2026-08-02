package defpackage;

/* loaded from: classes.dex */
public final class hap {
    public static final hap c;
    public static final hap d;
    public static final hap e;
    public final long a;
    public final long b;

    static {
        hap hapVar = new hap(0L, 0L);
        c = hapVar;
        d = new hap(Long.MAX_VALUE, Long.MAX_VALUE);
        new hap(Long.MAX_VALUE, 0L);
        new hap(0L, Long.MAX_VALUE);
        e = hapVar;
    }

    public hap(long j, long j2) {
        vq1.v(j >= 0);
        vq1.v(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = dvt.a;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = false;
        boolean z2 = j6 <= j2 && j2 <= j7;
        if (j6 <= j3 && j3 <= j7) {
            z = true;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j3 : j6;
            }
            return j2;
        }
        if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
            return j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hap.class == obj.getClass()) {
            hap hapVar = (hap) obj;
            if (this.a == hapVar.a && this.b == hapVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
