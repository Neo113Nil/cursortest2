package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import yads.aa2;
import yads.bs1;
import yads.cs1;
import yads.ib2;
import yads.t31;

/* loaded from: classes7.dex */
public final class xv81 implements n771 {
    public yg71 d;
    public fb81 e;
    public cs1 g;
    public cfr h;
    public int i;
    public int j;
    public v071 k;
    public int l;
    public long m;
    public final byte[] a = new byte[42];
    public final dl81 b = new dl81(new byte[32768], 0);
    public final r291 c = new r291();
    public int f = 0;

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.d = yg71Var;
        this.e = yg71Var.l(0, 1);
        yg71Var.mo495a();
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            v071 v071Var = this.k;
            if (v071Var != null) {
                v071Var.b(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.i(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        int i;
        boolean z;
        cs1 cs1Var;
        cfr cfrVar;
        cs1 cs1Var2;
        int i2;
        a871 w471Var;
        long j;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        int i3 = this.f;
        cs1 cs1Var3 = null;
        ?? r4 = 0;
        if (i3 == 0) {
            w971 w971Var = (w971) bb71Var;
            w971Var.y = 0;
            long j4 = w971Var.w;
            cs1 a = new rb71().a(w971Var, null);
            if (a != null && a.b.length != 0) {
                cs1Var3 = a;
            }
            w971Var.b((int) ((w971Var.w + w971Var.y) - j4));
            this.g = cs1Var3;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i3 == 1) {
            w971 w971Var2 = (w971) bb71Var;
            w971Var2.I(bArr, 0, bArr.length, false);
            w971Var2.y = 0;
            this.f = 2;
            return 0;
        }
        int i4 = 24;
        if (i3 == 2) {
            ((w971) bb71Var).E(new byte[4], 0, 4, false);
            if ((((r1[0] & 255) << 24) | ((r1[1] & 255) << 16) | ((r1[2] & 255) << 8) | (r1[3] & 255)) == 1716281667) {
                this.f = 3;
                return 0;
            }
            dy31.g(null, "Failed to read FLAC stream marker.");
            return 0;
        }
        if (i3 == 3) {
            cfr cfrVar2 = this.h;
            boolean z5 = false;
            while (!z5) {
                w971 w971Var3 = (w971) bb71Var;
                w971Var3.y = r4;
                byte[] bArr2 = new byte[4];
                uh81 uh81Var = new uh81();
                uh81Var.a = bArr2;
                uh81Var.d = 4;
                w971Var3.I(bArr2, r4, 4, r4);
                boolean k = uh81Var.k();
                int a2 = uh81Var.a(7);
                int a3 = uh81Var.a(i4) + 4;
                if (a2 == 0) {
                    byte[] bArr3 = new byte[38];
                    w971Var3.E(bArr3, r4, 38, r4);
                    cfrVar2 = new cfr(bArr3, 4, 1);
                    i = i4;
                    z = k;
                } else {
                    if (cfrVar2 == null) {
                        w511.q();
                        return 0;
                    }
                    cs1 cs1Var4 = (cs1) cfrVar2.l;
                    if (a2 == 3) {
                        dl81 dl81Var = new dl81(a3);
                        w971Var3.E(dl81Var.a, r4, a3, r4);
                        i = i4;
                        z = k;
                        cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, p4a1.a(dl81Var), (cs1) cfrVar2.l);
                    } else {
                        i = i4;
                        z = k;
                        if (a2 == 4) {
                            dl81 dl81Var2 = new dl81(a3);
                            w971Var3.E(dl81Var2.a, 0, a3, false);
                            dl81Var2.m(dl81Var2.b + 4);
                            cs1 d = w8a1.d(Arrays.asList((String[]) w8a1.c(dl81Var2, false, false).b));
                            if (cs1Var4 == null) {
                                cs1Var2 = d;
                            } else {
                                if (d != null) {
                                    bs1[] bs1VarArr = d.b;
                                    if (bs1VarArr.length != 0) {
                                        cs1Var4 = new cs1((bs1[]) rf71.r(cs1Var4.b, bs1VarArr));
                                    }
                                }
                                cs1Var2 = cs1Var4;
                            }
                            cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, (bfr) cfrVar2.k, cs1Var2);
                        } else if (a2 == 6) {
                            dl81 dl81Var3 = new dl81(a3);
                            w971Var3.E(dl81Var3.a, 0, a3, false);
                            dl81Var3.m(dl81Var3.b + 4);
                            int a4 = dl81Var3.a();
                            String b = dl81Var3.b(dl81Var3.a(), md81.a);
                            String b2 = dl81Var3.b(dl81Var3.a(), md81.c);
                            int a5 = dl81Var3.a();
                            int a6 = dl81Var3.a();
                            int a7 = dl81Var3.a();
                            int a8 = dl81Var3.a();
                            int a9 = dl81Var3.a();
                            byte[] bArr4 = new byte[a9];
                            dl81Var3.d(0, a9, bArr4);
                            cs1 cs1Var5 = new cs1(t31.n(new ib2(a4, b, b2, a5, a6, a7, a8, bArr4)));
                            if (cs1Var4 != null) {
                                bs1[] bs1VarArr2 = cs1Var5.b;
                                if (bs1VarArr2.length == 0) {
                                    cs1Var = cs1Var4;
                                    cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, (bfr) cfrVar2.k, cs1Var);
                                } else {
                                    cs1Var5 = new cs1((bs1[]) rf71.r(cs1Var4.b, bs1VarArr2));
                                }
                            }
                            cs1Var = cs1Var5;
                            cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, (bfr) cfrVar2.k, cs1Var);
                        } else {
                            w971Var3.b(a3);
                        }
                    }
                    cfrVar2 = cfrVar;
                }
                int i5 = rf71.a;
                this.h = cfrVar2;
                z5 = z;
                i4 = i;
                r4 = 0;
            }
            this.h.getClass();
            this.i = Math.max(this.h.c, 6);
            fb81 fb81Var = this.e;
            int i6 = rf71.a;
            fb81Var.k(this.h.a(bArr, this.g));
            this.f = 4;
            return 0;
        }
        long j5 = 0;
        if (i3 == 4) {
            w971 w971Var4 = (w971) bb71Var;
            w971Var4.y = 0;
            byte[] bArr5 = new byte[2];
            w971Var4.I(bArr5, 0, 2, false);
            int i7 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
            if ((i7 >> 2) != 16382) {
                w971Var4.y = 0;
                dy31.g(null, "First frame does not start with sync code.");
                return 0;
            }
            w971Var4.y = 0;
            this.j = i7;
            yg71 yg71Var = this.d;
            int i8 = rf71.a;
            long j6 = w971Var4.w;
            long j7 = w971Var4.c;
            this.h.getClass();
            cfr cfrVar3 = this.h;
            bfr bfrVar = (bfr) cfrVar3.k;
            int i9 = cfrVar3.e;
            long j8 = cfrVar3.j;
            if (bfrVar != null) {
                w471Var = new w471(cfrVar3, j6, 0);
                i2 = 0;
            } else {
                if (j7 == -1 || j8 <= 0) {
                    i2 = 0;
                    w471Var = new w471(j8 != 0 ? (j8 * 1000000) / i9 : -9223372036854775807L, 0L);
                } else {
                    int i10 = this.j;
                    int i11 = cfrVar3.c;
                    gp51 gp51Var = new gp51(25, cfrVar3);
                    o3 o3Var = new o3(cfrVar3, i10, (byte) 0);
                    i2 = 0;
                    long j9 = cfrVar3.j;
                    long j10 = j9 != 0 ? (j9 * 1000000) / i9 : -9223372036854775807L;
                    int i12 = cfrVar3.d;
                    if (i12 > 0) {
                        j = j9;
                        j2 = ((i12 + i11) / 2) + 1;
                    } else {
                        j = j9;
                        int i13 = cfrVar3.a;
                        j2 = 64 + (((((i13 != cfrVar3.b || i13 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i13) * cfrVar3.g) * cfrVar3.h) / 8);
                    }
                    v071 v071Var = new v071(gp51Var, o3Var, j10, j, j6, j7, j2, Math.max(6, i11));
                    this.k = v071Var;
                    w471Var = (q471) v071Var.b;
                }
            }
            yg71Var.r(w471Var);
            this.f = 5;
            return i2;
        }
        if (i3 != 5) {
            ny61.k();
            return 0;
        }
        this.e.getClass();
        this.h.getClass();
        v071 v071Var2 = this.k;
        if (v071Var2 != null && ((xt5) v071Var2.d) != null) {
            return v071Var2.a((w971) bb71Var, jp61Var);
        }
        if (this.m == -1) {
            cfr cfrVar4 = this.h;
            w971 w971Var5 = (w971) bb71Var;
            w971Var5.y = 0;
            w971Var5.c(1, false);
            byte[] bArr6 = new byte[1];
            w971Var5.I(bArr6, 0, 1, false);
            boolean z6 = (bArr6[0] & 1) == 1;
            w971Var5.c(2, false);
            int i14 = z6 ? 7 : 6;
            dl81 dl81Var4 = new dl81(i14);
            byte[] bArr7 = dl81Var4.a;
            int i15 = 0;
            while (i15 < i14) {
                int f = w971Var5.f(i15, i14 - i15, bArr7);
                if (f == -1) {
                    break;
                }
                i15 += f;
            }
            dl81Var4.k(i15);
            w971Var5.y = 0;
            try {
                long y = dl81Var4.y();
                if (!z6) {
                    y *= cfrVar4.b;
                }
                j5 = y;
                z4 = true;
            } catch (NumberFormatException unused) {
                z4 = false;
            }
            if (!z4) {
                throw new aa2(null, null, true, 1);
            }
            this.m = j5;
        } else {
            dl81 dl81Var5 = this.b;
            int i16 = dl81Var5.c;
            if (i16 < 32768) {
                int v = ((w971) bb71Var).v(i16, 32768 - i16, dl81Var5.a);
                z2 = v == -1;
                if (!z2) {
                    dl81Var5.k(i16 + v);
                } else if (dl81Var5.c - dl81Var5.b == 0) {
                    long j11 = this.m * 1000000;
                    cfr cfrVar5 = this.h;
                    int i17 = rf71.a;
                    this.e.b(j11 / cfrVar5.e, 1, this.l, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i18 = dl81Var5.b;
            int i19 = this.l;
            int i20 = this.i;
            if (i19 < i20) {
                dl81Var5.m(dl81Var5.b + Math.min(i20 - i19, dl81Var5.c - i18));
            }
            this.h.getClass();
            int i21 = dl81Var5.b;
            while (true) {
                int i22 = dl81Var5.c - 16;
                r291 r291Var = this.c;
                if (i21 <= i22) {
                    dl81Var5.m(i21);
                    if (v3a1.a(dl81Var5, this.h, this.j, r291Var)) {
                        dl81Var5.m(i21);
                        j3 = r291Var.a;
                        break;
                    }
                    i21++;
                } else {
                    if (z2) {
                        while (true) {
                            int i23 = dl81Var5.c;
                            if (i21 > i23 - this.i) {
                                dl81Var5.m(i23);
                                break;
                            }
                            dl81Var5.m(i21);
                            try {
                                z3 = v3a1.a(dl81Var5, this.h, this.j, r291Var);
                            } catch (IndexOutOfBoundsException unused2) {
                                z3 = false;
                            }
                            if (dl81Var5.b > dl81Var5.c) {
                                z3 = false;
                            }
                            if (z3) {
                                dl81Var5.m(i21);
                                j3 = r291Var.a;
                                break;
                            }
                            i21++;
                        }
                    } else {
                        dl81Var5.m(i21);
                    }
                    j3 = -1;
                }
            }
            int i24 = dl81Var5.b - i18;
            dl81Var5.m(i18);
            this.e.a(i24, dl81Var5);
            int i25 = this.l + i24;
            this.l = i25;
            if (j3 != -1) {
                long j12 = this.m * 1000000;
                cfr cfrVar6 = this.h;
                int i26 = rf71.a;
                this.e.b(j12 / cfrVar6.e, 1, i25, 0, null);
                this.l = 0;
                this.m = j3;
            }
            int i27 = dl81Var5.c;
            int i28 = dl81Var5.b;
            int i29 = i27 - i28;
            if (i29 < 16) {
                byte[] bArr8 = dl81Var5.a;
                System.arraycopy(bArr8, i28, bArr8, 0, i29);
                dl81Var5.m(0);
                dl81Var5.k(i29);
            }
        }
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        w971 w971Var = (w971) bb71Var;
        cs1 a = new rb71().a(w971Var, n571.b);
        if (a != null) {
            int length = a.b.length;
        }
        byte[] bArr = new byte[4];
        w971Var.I(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }
}
