package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class sfi implements r2c {
    public final long a;
    public final d7k b;
    public final bgi c;
    public final n1d d;
    public final qec e;
    public final z48 f;
    public t2c g;
    public azs h;
    public azs i;
    public int j;
    public u2i k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public uap q;
    public boolean r;
    public boolean s;
    public long t;

    public sfi(long j) {
        this.a = j;
        this.b = new d7k(10);
        this.c = new bgi();
        this.d = new n1d();
        this.l = -9223372036854775807L;
        this.e = new qec(5);
        z48 z48Var = new z48();
        this.f = z48Var;
        this.i = z48Var;
        this.o = -1L;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.t = j2;
        if (this.q instanceof xie) {
            throw null;
        }
    }

    public final void c() {
        uap uapVar = this.q;
        if ((uapVar instanceof h86) && ((h86) uapVar).g()) {
            long j = this.o;
            if (j == -1 || j == this.q.f()) {
                return;
            }
            h86 h86Var = (h86) this.q;
            this.q = new h86(this.o, h86Var.h, h86Var.i, h86Var.j, h86Var.k);
            t2c t2cVar = this.g;
            t2cVar.getClass();
            t2cVar.E(this.q);
            this.h.getClass();
            this.q.k();
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        return f(s2cVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.s() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(s2c s2cVar) {
        uap uapVar = this.q;
        if (uapVar != null) {
            long f = uapVar.f();
            if (f != -1) {
            }
        }
        try {
            return !s2cVar.l(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r18 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00de, code lost:
    
        r17.y(r3 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
    
        r16.j = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        r17.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(s2c s2cVar, boolean z) {
        int i;
        int i2;
        int R;
        int i3 = z ? SQLiteDatabase.OPEN_NOMUTEX : SQLiteDatabase.OPEN_SHAREDCACHE;
        s2cVar.n();
        if (s2cVar.getPosition() == 0) {
            d7k d7kVar = (d7k) this.e.b;
            int i4 = 0;
            u2i u2iVar = null;
            while (true) {
                try {
                    s2cVar.A(d7kVar.a, 0, 10);
                    d7kVar.H(0);
                    if (d7kVar.y() != 4801587) {
                        break;
                    }
                    d7kVar.I(3);
                    int u = d7kVar.u();
                    int i5 = u + 10;
                    if (u2iVar == null) {
                        byte[] bArr = new byte[i5];
                        System.arraycopy(d7kVar.a, 0, bArr, 0, 10);
                        s2cVar.A(bArr, 10, u);
                        u2iVar = new pae(null).g0(i5, bArr);
                    } else {
                        s2cVar.u(u);
                    }
                    i4 += i5;
                } catch (EOFException unused) {
                }
            }
            s2cVar.n();
            s2cVar.u(i4);
            this.k = u2iVar;
            if (u2iVar != null) {
                this.d.b(u2iVar);
            }
            i = (int) s2cVar.s();
            if (!z) {
                s2cVar.y(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = i2;
        int i7 = i6;
        while (true) {
            if (!e(s2cVar)) {
                d7k d7kVar2 = this.b;
                d7kVar2.H(0);
                int h = d7kVar2.h();
                if ((i2 == 0 || ((-128000) & h) == (i2 & (-128000))) && (R = xp3.R(h)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(h);
                        i2 = h;
                    }
                    s2cVar.u(R - 4);
                } else {
                    int i8 = i7 + 1;
                    if (i7 == i3) {
                        if (z) {
                            return false;
                        }
                        c();
                        xq0.v();
                        return false;
                    }
                    if (z) {
                        s2cVar.n();
                        s2cVar.u(i + i8);
                    } else {
                        s2cVar.y(1);
                    }
                    i6 = 0;
                    i7 = i8;
                    i2 = 0;
                }
            } else if (i6 <= 0) {
                c();
                xq0.v();
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (r3 != 1231971951) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0381  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        Throwable th;
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        n1d n1dVar;
        int h;
        long[] jArr;
        int i5;
        int i6;
        int i7;
        n1d n1dVar2;
        int i8;
        long j3;
        uap h86Var;
        u2i u2iVar;
        f9i f9iVar;
        uap h86Var2;
        long j4;
        int v;
        vq1.B(this.h);
        int i9 = dvt.a;
        int i10 = this.j;
        bgi bgiVar = this.c;
        if (i10 == 0) {
            try {
                f(s2cVar, false);
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        uap uapVar = this.q;
        d7k d7kVar = this.b;
        if (uapVar == null) {
            d7k d7kVar2 = new d7k(bgiVar.b);
            j = 1000000;
            s2cVar.A(d7kVar2.a, 0, bgiVar.b);
            int i11 = bgiVar.a & 1;
            int i12 = bgiVar.d;
            th = null;
            if (i11 != 0) {
                if (i12 != 1) {
                    i3 = 36;
                    j2 = 0;
                    if (d7kVar2.c >= i3 + 4) {
                        d7kVar2.H(i3);
                        i4 = d7kVar2.h();
                        if (i4 != 1483304551) {
                        }
                        n1dVar = this.d;
                        if (i4 != 1231971951) {
                            if (i4 == 1447187017) {
                                long length = s2cVar.getLength();
                                long position = s2cVar.getPosition();
                                d7kVar2.I(6);
                                long h2 = bgiVar.b + position + d7kVar2.h();
                                int h3 = d7kVar2.h();
                                if (h3 > 0) {
                                    long e0 = dvt.e0(bgiVar.c, (h3 * bgiVar.f) - 1);
                                    int B = d7kVar2.B();
                                    int B2 = d7kVar2.B();
                                    int B3 = d7kVar2.B();
                                    d7kVar2.I(2);
                                    long j5 = position + bgiVar.b;
                                    long[] jArr2 = new long[B];
                                    long[] jArr3 = new long[B];
                                    int i13 = 0;
                                    while (i13 < B) {
                                        long[] jArr4 = jArr2;
                                        long[] jArr5 = jArr3;
                                        jArr4[i13] = (i13 * e0) / B;
                                        jArr5[i13] = j5;
                                        if (B3 == 1) {
                                            v = d7kVar2.v();
                                        } else if (B3 == 2) {
                                            v = d7kVar2.B();
                                        } else if (B3 == 3) {
                                            v = d7kVar2.y();
                                        } else if (B3 == 4) {
                                            v = d7kVar2.z();
                                        }
                                        j5 += B2 * v;
                                        i13++;
                                        B3 = B3;
                                        jArr2 = jArr4;
                                        jArr3 = jArr5;
                                    }
                                    long[] jArr6 = jArr2;
                                    long[] jArr7 = jArr3;
                                    if (length != -1 && length != h2) {
                                        StringBuilder l = tlm.l(length, "VBRI data size mismatch: ", ", ");
                                        l.append(h2);
                                        vq1.n0("VbriSeeker", l.toString());
                                    }
                                    if (h2 != j5) {
                                        StringBuilder l2 = tlm.l(h2, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        l2.append(j5);
                                        l2.append("\nSeeking will be inaccurate.");
                                        vq1.n0("VbriSeeker", l2.toString());
                                        h2 = Math.max(h2, j5);
                                    }
                                    h86Var = new wyt(jArr6, jArr7, e0, h2, bgiVar.e);
                                    s2cVar.y(bgiVar.b);
                                }
                                h86Var = null;
                                s2cVar.y(bgiVar.b);
                            } else if (i4 != 1483304551) {
                                s2cVar.n();
                                h86Var = null;
                            }
                            n1dVar2 = n1dVar;
                            u2iVar = this.k;
                            long position2 = s2cVar.getPosition();
                            if (u2iVar != null) {
                                for (n2i n2iVar : u2iVar.a) {
                                    if (n2iVar instanceof e9i) {
                                        int[] iArr = ((e9i) n2iVar).e;
                                        if (u2iVar != null) {
                                            for (n2i n2iVar2 : u2iVar.a) {
                                                if (n2iVar2 instanceof gcs) {
                                                    gcs gcsVar = (gcs) n2iVar2;
                                                    if (gcsVar.a.equals("TLEN")) {
                                                        j4 = dvt.Y(Long.parseLong((String) gcsVar.c.get(0)));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        j4 = -9223372036854775807L;
                                        int length2 = iArr.length;
                                        int i14 = length2 + 1;
                                        long[] jArr8 = new long[i14];
                                        long[] jArr9 = new long[i14];
                                        jArr8[0] = position2;
                                        jArr9[0] = 0;
                                        long j6 = 0;
                                        int i15 = 1;
                                        while (i15 <= length2) {
                                            int i16 = i15 - 1;
                                            long j7 = position2 + r10.c + iArr[i16];
                                            j6 += r10.d + r10.f[i16];
                                            jArr8[i15] = j7;
                                            jArr9[i15] = j6;
                                            i15++;
                                            length2 = length2;
                                            position2 = j7;
                                        }
                                        f9iVar = new f9i(j4, jArr8, jArr9);
                                        if (this.r) {
                                            if (f9iVar != null) {
                                                h86Var = f9iVar;
                                            } else if (h86Var == null) {
                                                h86Var = null;
                                            }
                                            if (h86Var != null) {
                                                h86Var.g();
                                                h86Var2 = h86Var;
                                            } else {
                                                s2cVar.A(d7kVar.a, 0, 4);
                                                d7kVar.H(0);
                                                bgiVar.a(d7kVar.h());
                                                h86Var2 = new h86(s2cVar.getLength(), s2cVar.getPosition(), bgiVar.e, bgiVar.b, false);
                                            }
                                            azs azsVar = this.h;
                                            h86Var2.k();
                                            azsVar.getClass();
                                        } else {
                                            h86Var2 = new tap(-9223372036854775807L);
                                        }
                                        this.q = h86Var2;
                                        this.g.E(h86Var2);
                                        bsc bscVar = new bsc();
                                        bscVar.l = l5i.p("audio/mpeg");
                                        bscVar.m = l5i.p((String) bgiVar.g);
                                        bscVar.n = 4096;
                                        bscVar.C = bgiVar.d;
                                        bscVar.D = bgiVar.c;
                                        bscVar.F = n1dVar2.a;
                                        bscVar.G = n1dVar2.b;
                                        bscVar.k = this.k;
                                        if (this.q.j() != -2147483647) {
                                            bscVar.h = this.q.j();
                                        }
                                        this.i.d(new dsc(bscVar));
                                        this.n = s2cVar.getPosition();
                                    }
                                }
                            }
                            f9iVar = null;
                            if (this.r) {
                            }
                            this.q = h86Var2;
                            this.g.E(h86Var2);
                            bsc bscVar2 = new bsc();
                            bscVar2.l = l5i.p("audio/mpeg");
                            bscVar2.m = l5i.p((String) bgiVar.g);
                            bscVar2.n = 4096;
                            bscVar2.C = bgiVar.d;
                            bscVar2.D = bgiVar.c;
                            bscVar2.F = n1dVar2.a;
                            bscVar2.G = n1dVar2.b;
                            bscVar2.k = this.k;
                            if (this.q.j() != -2147483647) {
                            }
                            this.i.d(new dsc(bscVar2));
                            this.n = s2cVar.getPosition();
                        }
                        h = d7kVar2.h();
                        int z = (h & 1) == 0 ? d7kVar2.z() : -1;
                        long x = (h & 2) == 0 ? d7kVar2.x() : -1L;
                        if ((h & 4) != 4) {
                            long[] jArr10 = new long[100];
                            int i17 = 0;
                            for (int i18 = 100; i17 < i18; i18 = 100) {
                                long[] jArr11 = jArr10;
                                jArr11[i17] = d7kVar2.v();
                                i17++;
                                jArr10 = jArr11;
                            }
                            jArr = jArr10;
                        } else {
                            jArr = null;
                        }
                        if ((h & 8) != 0) {
                            d7kVar2.I(4);
                        }
                        if (d7kVar2.a() < 24) {
                            d7kVar2.I(21);
                            int y = d7kVar2.y();
                            i6 = (16773120 & y) >> 12;
                            i5 = y & 4095;
                        } else {
                            i5 = -1;
                            i6 = -1;
                        }
                        long j8 = z;
                        int i19 = bgiVar.b;
                        int i20 = bgiVar.c;
                        i7 = bgiVar.e;
                        int i21 = bgiVar.f;
                        if ((n1dVar.a != -1 || n1dVar.b == -1) && i6 != -1 && i5 != -1) {
                            n1dVar.a = i6;
                            n1dVar.b = i5;
                        }
                        long position3 = s2cVar.getPosition();
                        if (s2cVar.getLength() != -1 || x == -1) {
                            n1dVar2 = n1dVar;
                            i8 = i7;
                        } else {
                            i8 = i7;
                            long j9 = position3 + x;
                            if (s2cVar.getLength() != j9) {
                                StringBuilder sb = new StringBuilder("Data size mismatch between stream (");
                                n1dVar2 = n1dVar;
                                sb.append(s2cVar.getLength());
                                sb.append(") and Xing frame (");
                                sb.append(j9);
                                sb.append("), using Xing value.");
                                vq1.Y("Mp3Extractor", sb.toString());
                            } else {
                                n1dVar2 = n1dVar;
                            }
                        }
                        s2cVar.y(bgiVar.b);
                        if (i4 != 1483304551) {
                            long e02 = (j8 == -1 || j8 == 0) ? -9223372036854775807L : dvt.e0(i20, (j8 * i21) - 1);
                            if (e02 != -9223372036854775807L) {
                                h86Var = (x == -1 || jArr == null) ? new b7w(position3, i19, e02, i8, -1L, null) : new b7w(position3, i19, e02, i8, x, jArr);
                                u2iVar = this.k;
                                long position22 = s2cVar.getPosition();
                                if (u2iVar != null) {
                                }
                                f9iVar = null;
                                if (this.r) {
                                }
                                this.q = h86Var2;
                                this.g.E(h86Var2);
                                bsc bscVar22 = new bsc();
                                bscVar22.l = l5i.p("audio/mpeg");
                                bscVar22.m = l5i.p((String) bgiVar.g);
                                bscVar22.n = 4096;
                                bscVar22.C = bgiVar.d;
                                bscVar22.D = bgiVar.c;
                                bscVar22.F = n1dVar2.a;
                                bscVar22.G = n1dVar2.b;
                                bscVar22.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new dsc(bscVar22));
                                this.n = s2cVar.getPosition();
                            }
                            h86Var = null;
                            u2iVar = this.k;
                            long position222 = s2cVar.getPosition();
                            if (u2iVar != null) {
                            }
                            f9iVar = null;
                            if (this.r) {
                            }
                            this.q = h86Var2;
                            this.g.E(h86Var2);
                            bsc bscVar222 = new bsc();
                            bscVar222.l = l5i.p("audio/mpeg");
                            bscVar222.m = l5i.p((String) bgiVar.g);
                            bscVar222.n = 4096;
                            bscVar222.C = bgiVar.d;
                            bscVar222.D = bgiVar.c;
                            bscVar222.F = n1dVar2.a;
                            bscVar222.G = n1dVar2.b;
                            bscVar222.k = this.k;
                            if (this.q.j() != -2147483647) {
                            }
                            this.i.d(new dsc(bscVar222));
                            this.n = s2cVar.getPosition();
                        } else {
                            long length3 = s2cVar.getLength();
                            long e03 = (j8 == -1 || j8 == 0) ? -9223372036854775807L : dvt.e0(i20, (i21 * j8) - 1);
                            if (e03 != -9223372036854775807L) {
                                if (x != -1) {
                                    length3 = position3 + x;
                                    j3 = x - i19;
                                } else if (length3 != -1) {
                                    j3 = (length3 - position3) - i19;
                                }
                                long j10 = length3;
                                long j11 = j3;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                h86Var = new h86(j10, position3 + i19, zc4.s(dvt.g0(j11, 8000000L, e03, roundingMode)), zc4.s(bzf.y(j11, j8, roundingMode)), false);
                                u2iVar = this.k;
                                long position2222 = s2cVar.getPosition();
                                if (u2iVar != null) {
                                }
                                f9iVar = null;
                                if (this.r) {
                                }
                                this.q = h86Var2;
                                this.g.E(h86Var2);
                                bsc bscVar2222 = new bsc();
                                bscVar2222.l = l5i.p("audio/mpeg");
                                bscVar2222.m = l5i.p((String) bgiVar.g);
                                bscVar2222.n = 4096;
                                bscVar2222.C = bgiVar.d;
                                bscVar2222.D = bgiVar.c;
                                bscVar2222.F = n1dVar2.a;
                                bscVar2222.G = n1dVar2.b;
                                bscVar2222.k = this.k;
                                if (this.q.j() != -2147483647) {
                                }
                                this.i.d(new dsc(bscVar2222));
                                this.n = s2cVar.getPosition();
                            }
                            h86Var = null;
                            u2iVar = this.k;
                            long position22222 = s2cVar.getPosition();
                            if (u2iVar != null) {
                            }
                            f9iVar = null;
                            if (this.r) {
                            }
                            this.q = h86Var2;
                            this.g.E(h86Var2);
                            bsc bscVar22222 = new bsc();
                            bscVar22222.l = l5i.p("audio/mpeg");
                            bscVar22222.m = l5i.p((String) bgiVar.g);
                            bscVar22222.n = 4096;
                            bscVar22222.C = bgiVar.d;
                            bscVar22222.D = bgiVar.c;
                            bscVar22222.F = n1dVar2.a;
                            bscVar22222.G = n1dVar2.b;
                            bscVar22222.k = this.k;
                            if (this.q.j() != -2147483647) {
                            }
                            this.i.d(new dsc(bscVar22222));
                            this.n = s2cVar.getPosition();
                        }
                    }
                    if (d7kVar2.c >= 40) {
                        d7kVar2.H(36);
                        if (d7kVar2.h() == 1447187017) {
                            i4 = 1447187017;
                            n1dVar = this.d;
                            if (i4 != 1231971951) {
                            }
                            h = d7kVar2.h();
                            if ((h & 1) == 0) {
                            }
                            if ((h & 2) == 0) {
                            }
                            if ((h & 4) != 4) {
                            }
                            if ((h & 8) != 0) {
                            }
                            if (d7kVar2.a() < 24) {
                            }
                            long j82 = z;
                            int i192 = bgiVar.b;
                            int i202 = bgiVar.c;
                            i7 = bgiVar.e;
                            int i212 = bgiVar.f;
                            if (n1dVar.a != -1) {
                            }
                            n1dVar.a = i6;
                            n1dVar.b = i5;
                            long position32 = s2cVar.getPosition();
                            if (s2cVar.getLength() != -1) {
                            }
                            n1dVar2 = n1dVar;
                            i8 = i7;
                            s2cVar.y(bgiVar.b);
                            if (i4 != 1483304551) {
                            }
                        }
                    }
                    i4 = 0;
                    n1dVar = this.d;
                    if (i4 != 1231971951) {
                    }
                    h = d7kVar2.h();
                    if ((h & 1) == 0) {
                    }
                    if ((h & 2) == 0) {
                    }
                    if ((h & 4) != 4) {
                    }
                    if ((h & 8) != 0) {
                    }
                    if (d7kVar2.a() < 24) {
                    }
                    long j822 = z;
                    int i1922 = bgiVar.b;
                    int i2022 = bgiVar.c;
                    i7 = bgiVar.e;
                    int i2122 = bgiVar.f;
                    if (n1dVar.a != -1) {
                    }
                    n1dVar.a = i6;
                    n1dVar.b = i5;
                    long position322 = s2cVar.getPosition();
                    if (s2cVar.getLength() != -1) {
                    }
                    n1dVar2 = n1dVar;
                    i8 = i7;
                    s2cVar.y(bgiVar.b);
                    if (i4 != 1483304551) {
                    }
                }
                i3 = 21;
                j2 = 0;
                if (d7kVar2.c >= i3 + 4) {
                }
                if (d7kVar2.c >= 40) {
                }
                i4 = 0;
                n1dVar = this.d;
                if (i4 != 1231971951) {
                }
                h = d7kVar2.h();
                if ((h & 1) == 0) {
                }
                if ((h & 2) == 0) {
                }
                if ((h & 4) != 4) {
                }
                if ((h & 8) != 0) {
                }
                if (d7kVar2.a() < 24) {
                }
                long j8222 = z;
                int i19222 = bgiVar.b;
                int i20222 = bgiVar.c;
                i7 = bgiVar.e;
                int i21222 = bgiVar.f;
                if (n1dVar.a != -1) {
                }
                n1dVar.a = i6;
                n1dVar.b = i5;
                long position3222 = s2cVar.getPosition();
                if (s2cVar.getLength() != -1) {
                }
                n1dVar2 = n1dVar;
                i8 = i7;
                s2cVar.y(bgiVar.b);
                if (i4 != 1483304551) {
                }
            } else {
                if (i12 == 1) {
                    i3 = 13;
                    j2 = 0;
                    if (d7kVar2.c >= i3 + 4) {
                    }
                    if (d7kVar2.c >= 40) {
                    }
                    i4 = 0;
                    n1dVar = this.d;
                    if (i4 != 1231971951) {
                    }
                    h = d7kVar2.h();
                    if ((h & 1) == 0) {
                    }
                    if ((h & 2) == 0) {
                    }
                    if ((h & 4) != 4) {
                    }
                    if ((h & 8) != 0) {
                    }
                    if (d7kVar2.a() < 24) {
                    }
                    long j82222 = z;
                    int i192222 = bgiVar.b;
                    int i202222 = bgiVar.c;
                    i7 = bgiVar.e;
                    int i212222 = bgiVar.f;
                    if (n1dVar.a != -1) {
                    }
                    n1dVar.a = i6;
                    n1dVar.b = i5;
                    long position32222 = s2cVar.getPosition();
                    if (s2cVar.getLength() != -1) {
                    }
                    n1dVar2 = n1dVar;
                    i8 = i7;
                    s2cVar.y(bgiVar.b);
                    if (i4 != 1483304551) {
                    }
                }
                i3 = 21;
                j2 = 0;
                if (d7kVar2.c >= i3 + 4) {
                }
                if (d7kVar2.c >= 40) {
                }
                i4 = 0;
                n1dVar = this.d;
                if (i4 != 1231971951) {
                }
                h = d7kVar2.h();
                if ((h & 1) == 0) {
                }
                if ((h & 2) == 0) {
                }
                if ((h & 4) != 4) {
                }
                if ((h & 8) != 0) {
                }
                if (d7kVar2.a() < 24) {
                }
                long j822222 = z;
                int i1922222 = bgiVar.b;
                int i2022222 = bgiVar.c;
                i7 = bgiVar.e;
                int i2122222 = bgiVar.f;
                if (n1dVar.a != -1) {
                }
                n1dVar.a = i6;
                n1dVar.b = i5;
                long position322222 = s2cVar.getPosition();
                if (s2cVar.getLength() != -1) {
                }
                n1dVar2 = n1dVar;
                i8 = i7;
                s2cVar.y(bgiVar.b);
                if (i4 != 1483304551) {
                }
            }
        } else {
            th = null;
            j = 1000000;
            j2 = 0;
            if (this.n != 0) {
                long position4 = s2cVar.getPosition();
                long j12 = this.n;
                if (position4 < j12) {
                    s2cVar.y((int) (j12 - position4));
                }
            }
        }
        if (this.p == 0) {
            s2cVar.n();
            if (!e(s2cVar)) {
                d7kVar.H(0);
                int h4 = d7kVar.h();
                if (((-128000) & h4) != (this.j & (-128000)) || xp3.R(h4) == -1) {
                    s2cVar.y(1);
                    this.j = 0;
                    i = 0;
                    i2 = -1;
                    if (i == i2) {
                        uap uapVar2 = this.q;
                        if (uapVar2 instanceof xie) {
                            if (uapVar2.k() != ((this.m * j) / bgiVar.c) + this.l) {
                                ((xie) this.q).getClass();
                                throw th;
                            }
                        }
                    }
                    return i;
                }
                bgiVar.a(h4);
                if (this.l == -9223372036854775807L) {
                    this.l = this.q.c(s2cVar.getPosition());
                    long j13 = this.a;
                    if (j13 != -9223372036854775807L) {
                        this.l = (j13 - this.q.c(j2)) + this.l;
                    }
                }
                this.p = bgiVar.b;
                this.o = s2cVar.getPosition() + bgiVar.b;
                if (this.q instanceof xie) {
                    long j14 = ((this.m + bgiVar.f) * j) / bgiVar.c;
                    throw th;
                }
            }
            i = -1;
            i2 = -1;
            if (i == i2) {
            }
            return i;
        }
        int c = this.i.c(s2cVar, this.p, true);
        if (c != -1) {
            int i22 = this.p - c;
            this.p = i22;
            if (i22 <= 0) {
                this.i.a(((this.m * j) / bgiVar.c) + this.l, 1, bgiVar.b, 0, null);
                this.m += bgiVar.f;
                this.p = 0;
                i = 0;
                i2 = -1;
                if (i == i2) {
                }
                return i;
            }
            i = 0;
            i2 = -1;
            if (i == i2) {
            }
            return i;
        }
        i = -1;
        i2 = -1;
        if (i == i2) {
        }
        return i;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.g = t2cVar;
        azs M = t2cVar.M(0, 1);
        this.h = M;
        this.i = M;
        this.g.K();
    }

    @Override // defpackage.r2c
    public final void a() {
    }

    public sfi(int i) {
        this(-9223372036854775807L);
    }
}
