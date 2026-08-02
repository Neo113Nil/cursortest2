package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class ap7 implements unj {
    public final tnj a;
    public final long b;
    public final long c;
    public final rjr d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public ap7(rjr rjrVar, long j, long j2, long j3, long j4, boolean z) {
        vq1.v(j >= 0 && j2 > j);
        this.d = rjrVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new tnj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // defpackage.unj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(s2c s2cVar) {
        long j;
        long j2;
        long j3;
        int i = this.e;
        long j4 = this.c;
        tnj tnjVar = this.a;
        if (i == 0) {
            j = 0;
            long position = s2cVar.getPosition();
            this.g = position;
            this.e = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    j3 = -1;
                } else {
                    long position2 = s2cVar.getPosition();
                    if (tnjVar.b(s2cVar, this.j)) {
                        tnjVar.a(s2cVar, false);
                        s2cVar.n();
                        long j6 = this.h;
                        long j7 = tnjVar.b;
                        long j8 = j6 - j7;
                        j2 = 2;
                        int i2 = tnjVar.d + tnjVar.e;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.j = position2;
                                this.l = j7;
                            } else {
                                this.i = s2cVar.getPosition() + i2;
                                this.k = tnjVar.b;
                            }
                            long j9 = this.j;
                            long j10 = this.i;
                            if (j9 - j10 < 100000) {
                                this.j = j10;
                                j3 = j10;
                            } else {
                                long position3 = s2cVar.getPosition() - (i2 * (j8 <= 0 ? 2L : 1L));
                                long j11 = this.j;
                                long j12 = this.i;
                                j3 = dvt.j((((j11 - j12) * j8) / (this.l - this.k)) + position3, j12, j11 - 1);
                            }
                        } else {
                            j3 = -1;
                        }
                        if (j3 == -1) {
                            return j3;
                        }
                        this.e = 3;
                    } else {
                        j3 = this.i;
                        if (j3 == position2) {
                            kac.f("No ogg page can be found.");
                            return 0L;
                        }
                    }
                }
                j2 = 2;
                if (j3 == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    e7o.n();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                tnjVar.b(s2cVar, -1L);
                tnjVar.a(s2cVar, false);
                if (tnjVar.b > this.h) {
                    s2cVar.n();
                    this.e = 4;
                    return -(this.k + j2);
                }
                s2cVar.y(tnjVar.d + tnjVar.e);
                this.i = s2cVar.getPosition();
                this.k = tnjVar.b;
            }
        } else {
            j = 0;
        }
        tnjVar.a = 0;
        tnjVar.b = j;
        tnjVar.c = 0;
        tnjVar.d = 0;
        tnjVar.e = 0;
        if (!tnjVar.b(s2cVar, -1L)) {
            xq0.v();
            return 0L;
        }
        tnjVar.a(s2cVar, false);
        s2cVar.y(tnjVar.d + tnjVar.e);
        long j13 = tnjVar.b;
        while ((tnjVar.a & 4) != 4 && tnjVar.b(s2cVar, -1L) && s2cVar.getPosition() < j4 && tnjVar.a(s2cVar, true)) {
            try {
                s2cVar.y(tnjVar.d + tnjVar.e);
                j13 = tnjVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j13;
        this.e = 4;
        return this.g;
    }

    @Override // defpackage.unj
    public final fap e() {
        if (this.f != 0) {
            return new zo7(this);
        }
        return null;
    }

    @Override // defpackage.unj
    public final void g(long j) {
        this.h = dvt.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
