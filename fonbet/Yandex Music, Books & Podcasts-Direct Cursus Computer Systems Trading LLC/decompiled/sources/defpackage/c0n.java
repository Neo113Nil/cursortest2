package defpackage;

import android.util.SparseArray;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class c0n implements r2c {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public pgc i;
    public t2c j;
    public boolean k;
    public final ojs a = new ojs(0);
    public final d7k c = new d7k(4096);
    public final SparseArray b = new SparseArray();
    public final a0n d = new a0n(0);

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        ojs ojsVar = this.a;
        synchronized (ojsVar) {
            j3 = ojsVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long d = ojsVar.d();
            z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            ojsVar.f(j2);
        }
        pgc pgcVar = this.i;
        if (pgcVar != null) {
            pgcVar.B(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            b0n b0nVar = (b0n) sparseArray.valueAt(i);
            b0nVar.f = false;
            b0nVar.a.c();
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        byte[] bArr = new byte[14];
        gm7 gm7Var = (gm7) s2cVar;
        gm7Var.l(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            gm7Var.c(bArr[13] & 7, false);
            gm7Var.l(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        int i;
        int i2;
        long j;
        q2b q2bVar;
        long j2;
        vq1.B(this.j);
        long length = s2cVar.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        a0n a0nVar = this.d;
        if (i3 != 0 && !a0nVar.d) {
            ojs ojsVar = a0nVar.b;
            d7k d7kVar = a0nVar.c;
            if (!a0nVar.f) {
                long length2 = s2cVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j4 = length2 - min;
                if (s2cVar.getPosition() != j4) {
                    ci0Var.a = j4;
                    return 1;
                }
                d7kVar.E(min);
                s2cVar.n();
                s2cVar.A(d7kVar.a, 0, min);
                int i4 = d7kVar.b;
                int i5 = d7kVar.c - 4;
                while (true) {
                    if (i5 < i4) {
                        break;
                    }
                    if (a0n.b(i5, d7kVar.a) == 442) {
                        d7kVar.H(i5 + 4);
                        long c = a0n.c(d7kVar);
                        if (c != -9223372036854775807L) {
                            j3 = c;
                            break;
                        }
                    }
                    i5--;
                }
                a0nVar.h = j3;
                a0nVar.f = true;
                return 0;
            }
            if (a0nVar.h == -9223372036854775807L) {
                a0nVar.a(s2cVar);
                return 0;
            }
            if (a0nVar.e) {
                long j5 = a0nVar.g;
                if (j5 == -9223372036854775807L) {
                    a0nVar.a(s2cVar);
                    return 0;
                }
                a0nVar.i = ojsVar.c(a0nVar.h) - ojsVar.b(j5);
                a0nVar.a(s2cVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, s2cVar.getLength());
            long j6 = 0;
            if (s2cVar.getPosition() != j6) {
                ci0Var.a = j6;
                return 1;
            }
            d7kVar.E(min2);
            s2cVar.n();
            s2cVar.A(d7kVar.a, 0, min2);
            int i6 = d7kVar.b;
            int i7 = d7kVar.c;
            while (true) {
                if (i6 >= i7 - 3) {
                    j2 = -9223372036854775807L;
                    break;
                }
                if (a0n.b(i6, d7kVar.a) == 442) {
                    d7kVar.H(i6 + 4);
                    long c2 = a0n.c(d7kVar);
                    if (c2 != -9223372036854775807L) {
                        j2 = c2;
                        break;
                    }
                }
                i6++;
            }
            a0nVar.g = j2;
            a0nVar.e = true;
            return 0;
        }
        if (this.k) {
            i = i3;
            i2 = 4;
        } else {
            this.k = true;
            long j7 = a0nVar.i;
            if (j7 != -9223372036854775807L) {
                i = i3;
                i2 = 4;
                pgc pgcVar = new pgc(new d51(15), new nnd(a0nVar.b), j7, j7 + 1, 0L, length, 188L, 1000);
                this.i = pgcVar;
                this.j.E((o03) pgcVar.c);
            } else {
                i = i3;
                i2 = 4;
                this.j.E(new zg2(j7));
            }
        }
        pgc pgcVar2 = this.i;
        if (pgcVar2 != null && ((bq0) pgcVar2.e) != null) {
            return pgcVar2.t(s2cVar, ci0Var);
        }
        s2cVar.n();
        long s = i != 0 ? length - s2cVar.s() : -1L;
        if (s != -1 && s < 4) {
            return -1;
        }
        d7k d7kVar2 = this.c;
        if (!s2cVar.l(d7kVar2.a, 0, i2, true)) {
            return -1;
        }
        d7kVar2.H(0);
        int h = d7kVar2.h();
        if (h == 441) {
            return -1;
        }
        if (h == 442) {
            s2cVar.A(d7kVar2.a, 0, 10);
            d7kVar2.H(9);
            s2cVar.y((d7kVar2.v() & 7) + 14);
            return 0;
        }
        if (h == 443) {
            s2cVar.A(d7kVar2.a, 0, 2);
            d7kVar2.H(0);
            s2cVar.y(d7kVar2.B() + 6);
            return 0;
        }
        if (((h & (-256)) >> 8) != 1) {
            s2cVar.y(1);
            return 0;
        }
        int i8 = h & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseArray sparseArray = this.b;
        b0n b0nVar = (b0n) sparseArray.get(i8);
        if (!this.e) {
            if (b0nVar == null) {
                if (i8 == 189) {
                    q2bVar = new w9("video/mp2p");
                    this.f = true;
                    this.h = s2cVar.getPosition();
                } else if ((h & 224) == 192) {
                    q2bVar = new yuf(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = s2cVar.getPosition();
                } else if ((h & 240) == 224) {
                    q2bVar = new lrd(null, "video/mp2p");
                    this.g = true;
                    this.h = s2cVar.getPosition();
                } else {
                    q2bVar = null;
                }
                if (q2bVar != null) {
                    q2bVar.e(this.j, new cp2(i8, 256));
                    b0nVar = new b0n(q2bVar, this.a);
                    sparseArray.put(i8, b0nVar);
                }
            }
            if (s2cVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.K();
            }
        }
        s2cVar.A(d7kVar2.a, 0, 2);
        d7kVar2.H(0);
        int B = d7kVar2.B() + 6;
        if (b0nVar == null) {
            s2cVar.y(B);
            return 0;
        }
        d7kVar2.E(B);
        s2cVar.readFully(d7kVar2.a, 0, B);
        d7kVar2.H(6);
        q2b q2bVar2 = b0nVar.a;
        v94 v94Var = b0nVar.c;
        d7kVar2.f(v94Var.b, 0, 3);
        v94Var.q(0);
        v94Var.t(8);
        b0nVar.d = v94Var.h();
        b0nVar.e = v94Var.h();
        v94Var.t(6);
        d7kVar2.f(v94Var.b, 0, v94Var.i(8));
        v94Var.q(0);
        ojs ojsVar2 = b0nVar.b;
        b0nVar.g = 0L;
        if (b0nVar.d) {
            v94Var.t(4);
            v94Var.t(1);
            v94Var.t(1);
            long i9 = (v94Var.i(3) << 30) | (v94Var.i(15) << 15) | v94Var.i(15);
            v94Var.t(1);
            if (b0nVar.f || !b0nVar.e) {
                j = i9;
            } else {
                v94Var.t(4);
                v94Var.t(1);
                v94Var.t(1);
                v94Var.t(1);
                ojsVar2.b((v94Var.i(15) << 15) | (v94Var.i(3) << 30) | v94Var.i(15));
                b0nVar.f = true;
                j = i9;
            }
            b0nVar.g = ojsVar2.b(j);
        }
        q2bVar2.f(4, b0nVar.g);
        q2bVar2.b(d7kVar2);
        q2bVar2.d(false);
        d7kVar2.G(d7kVar2.a.length);
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.j = t2cVar;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
