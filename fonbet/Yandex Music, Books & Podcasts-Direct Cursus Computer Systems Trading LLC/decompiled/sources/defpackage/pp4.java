package defpackage;

/* loaded from: classes.dex */
public final class pp4 extends atc {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public pp4(sis sisVar, long j, long j2) {
        super(sisVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new qp4(2, j, j2);
        }
        boolean z = false;
        if (sisVar.h() != 1) {
            throw new qp4(0);
        }
        ris m = sisVar.m(0, new ris(), 0L);
        long max = Math.max(0L, j);
        if (!m.k && max != 0 && !m.h) {
            throw new qp4(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? m.m : Math.max(0L, j2);
        long j3 = m.m;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f = max;
        this.g = max2;
        this.h = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (m.i && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z = true;
        }
        this.i = z;
    }

    @Override // defpackage.atc, defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        this.e.f(0, oisVar, z);
        long j = oisVar.e - this.f;
        long j2 = this.h;
        oisVar.i(0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, oisVar.a, oisVar.b);
        return oisVar;
    }

    @Override // defpackage.atc, defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        this.e.m(0, risVar, 0L);
        long j2 = risVar.p;
        long j3 = this.f;
        risVar.p = j2 + j3;
        risVar.m = this.h;
        risVar.i = this.i;
        long j4 = risVar.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            risVar.l = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            risVar.l = max - j3;
        }
        long m0 = dvt.m0(j3);
        long j6 = risVar.e;
        if (j6 != -9223372036854775807L) {
            risVar.e = j6 + m0;
        }
        long j7 = risVar.f;
        if (j7 != -9223372036854775807L) {
            risVar.f = j7 + m0;
        }
        return risVar;
    }
}
