package defpackage;

import java.io.EOFException;
import yads.bs1;
import yads.c43;
import yads.cs1;
import yads.ts1;

/* loaded from: classes7.dex */
public final class qt71 implements n771 {
    public yg71 e;
    public fb81 f;
    public int h;
    public cs1 i;
    public long k;
    public long l;
    public int m;
    public zk71 n;
    public boolean o;
    public final dl81 a = new dl81(10);
    public final nd81 b = new nd81();
    public final co71 c = new co71();
    public long j = -9223372036854775807L;
    public final rb71 d = new rb71();
    public fb81 g = new np81();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if ((r9.w + r9.y) > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(w971 w971Var) {
        zk71 zk71Var = this.n;
        if (zk71Var != null) {
            long a = zk71Var.a();
            if (a != -1) {
            }
        }
        try {
            return !w971Var.I(this.a.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.e = yg71Var;
        fb81 l = yg71Var.l(0, 1);
        this.f = l;
        this.g = l;
        this.e.mo495a();
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.h = 0;
        this.j = -9223372036854775807L;
        this.k = 0L;
        this.m = 0;
    }

    public final boolean d(w971 w971Var, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = z ? 32768 : 131072;
        w971Var.y = 0;
        if (w971Var.w == 0) {
            cs1 a2 = this.d.a(w971Var, null);
            this.i = a2;
            if (a2 != null) {
                this.c.a(a2);
            }
            i = (int) (w971Var.w + w971Var.y);
            if (!z) {
                w971Var.b(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!a(w971Var)) {
                dl81 dl81Var = this.a;
                dl81Var.m(0);
                int a3 = dl81Var.a();
                if ((i2 == 0 || ((-128000) & a3) == (i2 & (-128000))) && (a = gea1.a(a3)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(a3);
                        i2 = a3;
                    }
                    w971Var.c(a - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        dy31.g(null, "Searched too many bytes.");
                        return false;
                    }
                    if (z) {
                        w971Var.y = 0;
                        w971Var.c(i + i6, false);
                    } else {
                        w971Var.b(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                ny61.b();
                return false;
            }
        }
        if (z) {
            w971Var.b(i + i5);
        } else {
            w971Var.y = 0;
        }
        this.h = i2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r7 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b1  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        long j;
        long j2;
        int i;
        int i2;
        co71 co71Var;
        int a;
        b681 b681Var;
        co71 co71Var2;
        zk71 zk71Var;
        int i3;
        int i4;
        int v;
        cs1 cs1Var;
        qj81 qj81Var;
        zk71 ug81Var;
        long j3;
        co71 co71Var3;
        int s;
        if (this.f == null) {
            ny61.k();
            return 0;
        }
        int i5 = rf71.a;
        if (this.h == 0) {
            try {
                d((w971) bb71Var, false);
            } catch (EOFException unused) {
            }
        }
        zk71 zk71Var2 = this.n;
        dl81 dl81Var = this.a;
        nd81 nd81Var = this.b;
        if (zk71Var2 == null) {
            dl81 dl81Var2 = new dl81(nd81Var.c);
            j = -9223372036854775807L;
            w971 w971Var = (w971) bb71Var;
            w971Var.I(dl81Var2.a, 0, nd81Var.c, false);
            long j4 = w971Var.c;
            int i6 = nd81Var.a & 1;
            long j5 = 0;
            int i7 = nd81Var.e;
            if (i6 != 0) {
                if (i7 != 1) {
                    i = 36;
                    j2 = 1000000;
                    if (dl81Var2.c >= i + 4) {
                        dl81Var2.m(i);
                        i2 = dl81Var2.a();
                        if (i2 != 1483304551) {
                        }
                        co71Var = this.c;
                        zk71 zk71Var3 = null;
                        if (i2 != 1483304551 || i2 == 1231971951) {
                            long j6 = w971Var.w;
                            int i8 = nd81Var.g;
                            int i9 = nd81Var.d;
                            a = dl81Var2.a();
                            if ((a & 1) == 1 || (v = dl81Var2.v()) == 0) {
                                b681Var = null;
                            } else {
                                long h = rf71.h(v, i8 * 1000000, i9);
                                if ((a & 6) != 6) {
                                    b681Var = new b681(j6, nd81Var.c, h, -1L, null);
                                } else {
                                    long t = dl81Var2.t();
                                    long[] jArr = new long[100];
                                    for (int i10 = 0; i10 < 100; i10++) {
                                        jArr[i10] = dl81Var2.s();
                                    }
                                    if (j4 != -1 && j4 != j6 + t) {
                                        nba1.e();
                                    }
                                    b681Var = new b681(j6, nd81Var.c, h, t, jArr);
                                }
                            }
                            co71Var2 = co71Var;
                            if (b681Var != null && (co71Var2.a == -1 || co71Var2.b == -1)) {
                                w971Var.y = 0;
                                w971Var.c(i + 141, false);
                                w971Var.I(dl81Var.a, 0, 3, false);
                                dl81Var.m(0);
                                int u = dl81Var.u();
                                i3 = u >> 12;
                                i4 = u & 4095;
                                if (i3 <= 0 || i4 > 0) {
                                    co71Var2.a = i3;
                                    co71Var2.b = i4;
                                }
                            }
                            w971Var.b(nd81Var.c);
                            if (b681Var == null && !b681Var.b() && i2 == 1231971951) {
                                w971Var.I(dl81Var.a, 0, 4, false);
                                dl81Var.m(0);
                                nd81Var.a(dl81Var.a());
                                zk71Var = new ug81(w971Var.c, w971Var.w, this.b);
                            } else {
                                zk71Var = b681Var;
                            }
                        } else {
                            if (i2 == 1447187017) {
                                long j7 = w971Var.w;
                                dl81Var2.m(dl81Var2.b + 10);
                                int a2 = dl81Var2.a();
                                if (a2 <= 0) {
                                    co71Var3 = co71Var;
                                } else {
                                    int i11 = nd81Var.d;
                                    co71 co71Var4 = co71Var;
                                    long h2 = rf71.h(a2, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
                                    int x = dl81Var2.x();
                                    int x2 = dl81Var2.x();
                                    int x3 = dl81Var2.x();
                                    dl81Var2.m(dl81Var2.b + 2);
                                    long j8 = nd81Var.c + j7;
                                    long[] jArr2 = new long[x];
                                    long[] jArr3 = new long[x];
                                    int i12 = 0;
                                    while (i12 < x) {
                                        long[] jArr4 = jArr2;
                                        co71Var3 = co71Var4;
                                        jArr4[i12] = (i12 * h2) / x;
                                        jArr3[i12] = Math.max(j7, j8);
                                        if (x3 == 1) {
                                            s = dl81Var2.s();
                                        } else if (x3 == 2) {
                                            s = dl81Var2.x();
                                        } else if (x3 == 3) {
                                            s = dl81Var2.u();
                                        } else if (x3 == 4) {
                                            s = dl81Var2.v();
                                        }
                                        i12++;
                                        j7 = (s * x2) + j7;
                                        co71Var4 = co71Var3;
                                        jArr2 = jArr4;
                                    }
                                    long j9 = j7;
                                    long[] jArr5 = jArr2;
                                    co71Var3 = co71Var4;
                                    if (j4 != -1 && j4 != j9) {
                                        nba1.e();
                                    }
                                    zk71Var = new wf71(jArr5, jArr3, h2, j9);
                                    w971Var.b(nd81Var.c);
                                }
                                zk71Var = null;
                                w971Var.b(nd81Var.c);
                            } else {
                                co71Var3 = co71Var;
                                w971Var.y = 0;
                                zk71Var = null;
                            }
                            co71Var2 = co71Var3;
                        }
                        cs1Var = this.i;
                        long j10 = w971Var.w;
                        if (cs1Var != null) {
                            int length = cs1Var.b.length;
                            for (int i13 = 0; i13 < length; i13++) {
                                bs1[] bs1VarArr = cs1Var.b;
                                bs1 bs1Var = bs1VarArr[i13];
                                if (bs1Var instanceof ts1) {
                                    ts1 ts1Var = (ts1) bs1Var;
                                    int length2 = bs1VarArr.length;
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 >= length2) {
                                            j3 = -9223372036854775807L;
                                            break;
                                        }
                                        bs1 bs1Var2 = cs1Var.b[i14];
                                        if (bs1Var2 instanceof c43) {
                                            c43 c43Var = (c43) bs1Var2;
                                            if (c43Var.b.equals("TLEN")) {
                                                j3 = rf71.g(Long.parseLong(c43Var.d));
                                                break;
                                            }
                                        }
                                        i14++;
                                    }
                                    int length3 = ts1Var.f.length;
                                    int i15 = length3 + 1;
                                    long[] jArr6 = new long[i15];
                                    long[] jArr7 = new long[i15];
                                    jArr6[0] = j10;
                                    jArr7[0] = 0;
                                    int i16 = 1;
                                    while (i16 <= length3) {
                                        int i17 = i16 - 1;
                                        long j11 = j10 + ts1Var.d + ts1Var.f[i17];
                                        j5 += ts1Var.e + ts1Var.g[i17];
                                        jArr6[i16] = j11;
                                        jArr7[i16] = j5;
                                        i16++;
                                        length3 = length3;
                                        j10 = j11;
                                    }
                                    qj81Var = new qj81(j3, jArr6, jArr7);
                                    if (this.o) {
                                        ug81Var = new nh71();
                                    } else {
                                        if (qj81Var != null) {
                                            zk71Var3 = qj81Var;
                                        } else if (zk71Var != null) {
                                            zk71Var3 = zk71Var;
                                        }
                                        if (zk71Var3 != null) {
                                            zk71Var3.b();
                                            ug81Var = zk71Var3;
                                        } else {
                                            w971Var.I(dl81Var.a, 0, 4, false);
                                            dl81Var.m(0);
                                            nd81Var.a(dl81Var.a());
                                            ug81Var = new ug81(w971Var.c, w971Var.w, this.b);
                                        }
                                    }
                                    this.n = ug81Var;
                                    this.e.r(ug81Var);
                                    fb81 fb81Var = this.g;
                                    da81 da81Var = new da81();
                                    da81Var.k = nd81Var.b;
                                    da81Var.l = 4096;
                                    da81Var.x = nd81Var.e;
                                    da81Var.y = nd81Var.d;
                                    da81Var.A = co71Var2.a;
                                    da81Var.B = co71Var2.b;
                                    da81Var.i = this.i;
                                    fb81Var.k(new qd81(da81Var));
                                    this.l = w971Var.w;
                                }
                            }
                        }
                        qj81Var = null;
                        if (this.o) {
                        }
                        this.n = ug81Var;
                        this.e.r(ug81Var);
                        fb81 fb81Var2 = this.g;
                        da81 da81Var2 = new da81();
                        da81Var2.k = nd81Var.b;
                        da81Var2.l = 4096;
                        da81Var2.x = nd81Var.e;
                        da81Var2.y = nd81Var.d;
                        da81Var2.A = co71Var2.a;
                        da81Var2.B = co71Var2.b;
                        da81Var2.i = this.i;
                        fb81Var2.k(new qd81(da81Var2));
                        this.l = w971Var.w;
                    }
                    if (dl81Var2.c >= 40) {
                        dl81Var2.m(36);
                        if (dl81Var2.a() == 1447187017) {
                            i2 = 1447187017;
                            co71Var = this.c;
                            zk71 zk71Var32 = null;
                            if (i2 != 1483304551) {
                            }
                            long j62 = w971Var.w;
                            int i82 = nd81Var.g;
                            int i92 = nd81Var.d;
                            a = dl81Var2.a();
                            if ((a & 1) == 1) {
                            }
                            b681Var = null;
                            co71Var2 = co71Var;
                            if (b681Var != null) {
                                w971Var.y = 0;
                                w971Var.c(i + 141, false);
                                w971Var.I(dl81Var.a, 0, 3, false);
                                dl81Var.m(0);
                                int u2 = dl81Var.u();
                                i3 = u2 >> 12;
                                i4 = u2 & 4095;
                                if (i3 <= 0) {
                                }
                                co71Var2.a = i3;
                                co71Var2.b = i4;
                            }
                            w971Var.b(nd81Var.c);
                            if (b681Var == null) {
                            }
                            zk71Var = b681Var;
                            cs1Var = this.i;
                            long j102 = w971Var.w;
                            if (cs1Var != null) {
                            }
                            qj81Var = null;
                            if (this.o) {
                            }
                            this.n = ug81Var;
                            this.e.r(ug81Var);
                            fb81 fb81Var22 = this.g;
                            da81 da81Var22 = new da81();
                            da81Var22.k = nd81Var.b;
                            da81Var22.l = 4096;
                            da81Var22.x = nd81Var.e;
                            da81Var22.y = nd81Var.d;
                            da81Var22.A = co71Var2.a;
                            da81Var22.B = co71Var2.b;
                            da81Var22.i = this.i;
                            fb81Var22.k(new qd81(da81Var22));
                            this.l = w971Var.w;
                        }
                    }
                    i2 = 0;
                    co71Var = this.c;
                    zk71 zk71Var322 = null;
                    if (i2 != 1483304551) {
                    }
                    long j622 = w971Var.w;
                    int i822 = nd81Var.g;
                    int i922 = nd81Var.d;
                    a = dl81Var2.a();
                    if ((a & 1) == 1) {
                    }
                    b681Var = null;
                    co71Var2 = co71Var;
                    if (b681Var != null) {
                    }
                    w971Var.b(nd81Var.c);
                    if (b681Var == null) {
                    }
                    zk71Var = b681Var;
                    cs1Var = this.i;
                    long j1022 = w971Var.w;
                    if (cs1Var != null) {
                    }
                    qj81Var = null;
                    if (this.o) {
                    }
                    this.n = ug81Var;
                    this.e.r(ug81Var);
                    fb81 fb81Var222 = this.g;
                    da81 da81Var222 = new da81();
                    da81Var222.k = nd81Var.b;
                    da81Var222.l = 4096;
                    da81Var222.x = nd81Var.e;
                    da81Var222.y = nd81Var.d;
                    da81Var222.A = co71Var2.a;
                    da81Var222.B = co71Var2.b;
                    da81Var222.i = this.i;
                    fb81Var222.k(new qd81(da81Var222));
                    this.l = w971Var.w;
                }
                i = 21;
                j2 = 1000000;
                if (dl81Var2.c >= i + 4) {
                }
                if (dl81Var2.c >= 40) {
                }
                i2 = 0;
                co71Var = this.c;
                zk71 zk71Var3222 = null;
                if (i2 != 1483304551) {
                }
                long j6222 = w971Var.w;
                int i8222 = nd81Var.g;
                int i9222 = nd81Var.d;
                a = dl81Var2.a();
                if ((a & 1) == 1) {
                }
                b681Var = null;
                co71Var2 = co71Var;
                if (b681Var != null) {
                }
                w971Var.b(nd81Var.c);
                if (b681Var == null) {
                }
                zk71Var = b681Var;
                cs1Var = this.i;
                long j10222 = w971Var.w;
                if (cs1Var != null) {
                }
                qj81Var = null;
                if (this.o) {
                }
                this.n = ug81Var;
                this.e.r(ug81Var);
                fb81 fb81Var2222 = this.g;
                da81 da81Var2222 = new da81();
                da81Var2222.k = nd81Var.b;
                da81Var2222.l = 4096;
                da81Var2222.x = nd81Var.e;
                da81Var2222.y = nd81Var.d;
                da81Var2222.A = co71Var2.a;
                da81Var2222.B = co71Var2.b;
                da81Var2222.i = this.i;
                fb81Var2222.k(new qd81(da81Var2222));
                this.l = w971Var.w;
            } else {
                if (i7 == 1) {
                    i = 13;
                    j2 = 1000000;
                    if (dl81Var2.c >= i + 4) {
                    }
                    if (dl81Var2.c >= 40) {
                    }
                    i2 = 0;
                    co71Var = this.c;
                    zk71 zk71Var32222 = null;
                    if (i2 != 1483304551) {
                    }
                    long j62222 = w971Var.w;
                    int i82222 = nd81Var.g;
                    int i92222 = nd81Var.d;
                    a = dl81Var2.a();
                    if ((a & 1) == 1) {
                    }
                    b681Var = null;
                    co71Var2 = co71Var;
                    if (b681Var != null) {
                    }
                    w971Var.b(nd81Var.c);
                    if (b681Var == null) {
                    }
                    zk71Var = b681Var;
                    cs1Var = this.i;
                    long j102222 = w971Var.w;
                    if (cs1Var != null) {
                    }
                    qj81Var = null;
                    if (this.o) {
                    }
                    this.n = ug81Var;
                    this.e.r(ug81Var);
                    fb81 fb81Var22222 = this.g;
                    da81 da81Var22222 = new da81();
                    da81Var22222.k = nd81Var.b;
                    da81Var22222.l = 4096;
                    da81Var22222.x = nd81Var.e;
                    da81Var22222.y = nd81Var.d;
                    da81Var22222.A = co71Var2.a;
                    da81Var22222.B = co71Var2.b;
                    da81Var22222.i = this.i;
                    fb81Var22222.k(new qd81(da81Var22222));
                    this.l = w971Var.w;
                }
                i = 21;
                j2 = 1000000;
                if (dl81Var2.c >= i + 4) {
                }
                if (dl81Var2.c >= 40) {
                }
                i2 = 0;
                co71Var = this.c;
                zk71 zk71Var322222 = null;
                if (i2 != 1483304551) {
                }
                long j622222 = w971Var.w;
                int i822222 = nd81Var.g;
                int i922222 = nd81Var.d;
                a = dl81Var2.a();
                if ((a & 1) == 1) {
                }
                b681Var = null;
                co71Var2 = co71Var;
                if (b681Var != null) {
                }
                w971Var.b(nd81Var.c);
                if (b681Var == null) {
                }
                zk71Var = b681Var;
                cs1Var = this.i;
                long j1022222 = w971Var.w;
                if (cs1Var != null) {
                }
                qj81Var = null;
                if (this.o) {
                }
                this.n = ug81Var;
                this.e.r(ug81Var);
                fb81 fb81Var222222 = this.g;
                da81 da81Var222222 = new da81();
                da81Var222222.k = nd81Var.b;
                da81Var222222.l = 4096;
                da81Var222222.x = nd81Var.e;
                da81Var222222.y = nd81Var.d;
                da81Var222222.A = co71Var2.a;
                da81Var222222.B = co71Var2.b;
                da81Var222222.i = this.i;
                fb81Var222222.k(new qd81(da81Var222222));
                this.l = w971Var.w;
            }
        } else {
            j = -9223372036854775807L;
            j2 = 1000000;
            long j12 = this.l;
            if (j12 != 0) {
                w971 w971Var2 = (w971) bb71Var;
                long j13 = w971Var2.w;
                if (j13 < j12) {
                    w971Var2.b((int) (j12 - j13));
                }
            }
        }
        if (this.m == 0) {
            w971 w971Var3 = (w971) bb71Var;
            w971Var3.y = 0;
            if (!a(w971Var3)) {
                dl81Var.m(0);
                int a3 = dl81Var.a();
                if (((-128000) & a3) != (this.h & (-128000)) || gea1.a(a3) == -1) {
                    w971Var3.b(1);
                    this.h = 0;
                    return 0;
                }
                nd81Var.a(a3);
                if (this.j == j) {
                    this.j = this.n.a(w971Var3.w);
                }
                this.m = nd81Var.c;
            }
            return -1;
        }
        int c = this.g.c(bb71Var, this.m, true);
        if (c == -1) {
            return -1;
        }
        int i18 = this.m - c;
        this.m = i18;
        if (i18 > 0) {
            return 0;
        }
        this.g.b(((this.k * j2) / nd81Var.d) + this.j, 1, nd81Var.c, 0, null);
        this.k += nd81Var.g;
        this.m = 0;
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        return d((w971) bb71Var, true);
    }
}
