package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class xer implements b5p {
    public final byte[] a;
    public final ef90 b;
    public final boolean c;
    public final yer d;
    public d5p e;
    public g001 f;
    public int g;
    public w820 h;
    public cfr i;
    public int j;
    public int k;
    public wer l;
    public int m;
    public long n;

    public xer(int i) {
        this.a = new byte[42];
        this.b = new ef90(new byte[32768], 0);
        this.c = false;
        this.d = new yer();
        this.g = 0;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            wer werVar = this.l;
            if (werVar != null) {
                werVar.e(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.H(0);
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.e = d5pVar;
        this.f = d5pVar.B(0, 1);
        d5pVar.A();
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        cfr cfrVar;
        int i;
        f7q0 qb4Var;
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        boolean z2;
        int i2 = this.g;
        w820 w820Var = null;
        if (i2 == 0) {
            c5pVar.J();
            long L = c5pVar.L();
            w820 a = new y5v().a(c5pVar, !this.c ? null : w5v.b);
            if (a != null && a.a.length != 0) {
                w820Var = a;
            }
            c5pVar.O((int) (c5pVar.L() - L));
            this.h = w820Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i2 == 1) {
            c5pVar.g(0, bArr.length, bArr);
            c5pVar.J();
            this.g = 2;
            return 0;
        }
        int i3 = 3;
        if (i2 == 2) {
            ef90 ef90Var = new ef90(4);
            c5pVar.readFully(ef90Var.a, 0, 4);
            if (ef90Var.A() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        if (i2 == 3) {
            int i4 = 0;
            cfr cfrVar2 = this.i;
            boolean z3 = false;
            while (!z3) {
                c5pVar.J();
                byte[] bArr2 = new byte[4];
                df90 df90Var = new df90(bArr2, 4);
                int i5 = i4;
                c5pVar.g(i5, 4, bArr2);
                boolean f = df90Var.f();
                int g = df90Var.g(r10);
                int g2 = df90Var.g(24) + 4;
                if (g == 0) {
                    byte[] bArr3 = new byte[38];
                    c5pVar.readFully(bArr3, i5, 38);
                    cfrVar2 = new cfr(bArr3, 4, i5);
                } else {
                    if (cfrVar2 == null) {
                        w511.q();
                        return 0;
                    }
                    w820 w820Var2 = (w820) cfrVar2.l;
                    if (g == i3) {
                        ef90 ef90Var2 = new ef90(g2);
                        c5pVar.readFully(ef90Var2.a, i5, g2);
                        cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, ooa1.a(ef90Var2), (w820) cfrVar2.l);
                    } else if (g == 4) {
                        ef90 ef90Var3 = new ef90(g2);
                        c5pVar.readFully(ef90Var3.a, 0, g2);
                        ef90Var3.L(4);
                        w820 c = xj91.c(Arrays.asList((String[]) xj91.d(ef90Var3, false, false).a));
                        if (w820Var2 != null) {
                            c = w820Var2.b(c);
                        }
                        cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, (bfr) cfrVar2.k, c);
                    } else if (g == 6) {
                        ef90 ef90Var4 = new ef90(g2);
                        c5pVar.readFully(ef90Var4.a, 0, g2);
                        ef90Var4.L(4);
                        w820 w820Var3 = new w820(ImmutableList.r(grb0.a(ef90Var4)));
                        if (w820Var2 != null) {
                            w820Var3 = w820Var2.b(w820Var3);
                        }
                        cfrVar = new cfr(cfrVar2.a, cfrVar2.b, cfrVar2.c, cfrVar2.d, cfrVar2.e, cfrVar2.g, cfrVar2.h, cfrVar2.j, (bfr) cfrVar2.k, w820Var3);
                    } else {
                        c5pVar.O(g2);
                    }
                    cfrVar2 = cfrVar;
                }
                int i6 = tw21.a;
                this.i = cfrVar2;
                z3 = f;
                i3 = 3;
                r10 = 7;
                i4 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            a d = this.i.d(bArr, this.h);
            g001 g001Var = this.f;
            f7s a2 = d.a();
            a2.l = eh20.q("audio/flac");
            smw0.u(a2, g001Var);
            g001 g001Var2 = this.f;
            this.i.c();
            g001Var2.getClass();
            this.g = 4;
            return 0;
        }
        if (i2 == 4) {
            c5pVar.J();
            ef90 ef90Var5 = new ef90(2);
            c5pVar.g(0, 2, ef90Var5.a);
            int E = ef90Var5.E();
            if ((E >> 2) != 16382) {
                c5pVar.J();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            c5pVar.J();
            this.k = E;
            d5p d5pVar = this.e;
            int i7 = tw21.a;
            long position = c5pVar.getPosition();
            long length = c5pVar.getLength();
            this.i.getClass();
            cfr cfrVar3 = this.i;
            if (((bfr) cfrVar3.k) != null) {
                qb4Var = new qb4(cfrVar3, position, 1);
                i = 0;
            } else if (length == -1 || cfrVar3.j <= 0) {
                i = 0;
                qb4Var = new qb4(cfrVar3.c());
            } else {
                int i8 = this.k;
                int i9 = cfrVar3.c;
                xen xenVar = new xen(11, cfrVar3);
                o3 o3Var = new o3(cfrVar3, i8);
                long c2 = cfrVar3.c();
                long j5 = cfrVar3.j;
                int i10 = cfrVar3.d;
                if (i10 > 0) {
                    i = 0;
                    j = j5;
                    j2 = (i10 + i9) / 2;
                    j3 = 1;
                } else {
                    i = 0;
                    j = j5;
                    int i11 = cfrVar3.a;
                    j2 = ((((i11 != cfrVar3.b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * cfrVar3.g) * cfrVar3.h) / 8;
                    j3 = 64;
                }
                wer werVar = new wer(xenVar, o3Var, c2, j, position, length, j2 + j3, Math.max(6, i9));
                this.l = werVar;
                qb4Var = (vt5) werVar.b;
            }
            d5pVar.w(qb4Var);
            this.g = 5;
            return i;
        }
        if (i2 != 5) {
            ny61.k();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        wer werVar2 = this.l;
        if (werVar2 != null && ((xt5) werVar2.d) != null) {
            return werVar2.c(c5pVar, xde0Var);
        }
        if (this.n == -1) {
            cfr cfrVar4 = this.i;
            c5pVar.J();
            c5pVar.N(1);
            byte[] bArr4 = new byte[1];
            c5pVar.g(0, 1, bArr4);
            z = (bArr4[0] & 1) == 1;
            c5pVar.N(2);
            r10 = z ? 7 : 6;
            ef90 ef90Var6 = new ef90(r10);
            byte[] bArr5 = ef90Var6.a;
            int i12 = 0;
            while (i12 < r10) {
                int p = c5pVar.p(i12, r10 - i12, bArr5);
                if (p == -1) {
                    break;
                }
                i12 += p;
            }
            ef90Var6.J(i12);
            c5pVar.J();
            yer yerVar = new yer();
            try {
                long F = ef90Var6.F();
                if (!z) {
                    F *= cfrVar4.b;
                }
                yerVar.a = F;
                this.n = F;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        ef90 ef90Var7 = this.b;
        int i13 = ef90Var7.c;
        if (i13 < 32768) {
            int read = c5pVar.read(ef90Var7.a, i13, 32768 - i13);
            z = read == -1;
            if (!z) {
                ef90Var7.J(i13 + read);
            } else if (ef90Var7.a() == 0) {
                long j6 = this.n * 1000000;
                cfr cfrVar5 = this.i;
                int i14 = tw21.a;
                this.f.c(j6 / cfrVar5.e, 1, this.m, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int i15 = ef90Var7.b;
        int i16 = this.m;
        int i17 = this.j;
        if (i16 < i17) {
            ef90Var7.L(Math.min(i17 - i16, ef90Var7.a()));
        }
        this.i.getClass();
        int i18 = ef90Var7.b;
        while (true) {
            int i19 = ef90Var7.c - 16;
            yer yerVar2 = this.d;
            if (i18 <= i19) {
                ef90Var7.K(i18);
                if (joa1.b(ef90Var7, this.i, this.k, yerVar2)) {
                    ef90Var7.K(i18);
                    j4 = yerVar2.a;
                    break;
                }
                i18++;
            } else {
                if (z) {
                    while (true) {
                        int i20 = ef90Var7.c;
                        if (i18 > i20 - this.j) {
                            ef90Var7.K(i20);
                            break;
                        }
                        ef90Var7.K(i18);
                        try {
                            z2 = joa1.b(ef90Var7, this.i, this.k, yerVar2);
                        } catch (IndexOutOfBoundsException unused2) {
                            z2 = false;
                        }
                        if (ef90Var7.b > ef90Var7.c) {
                            z2 = false;
                        }
                        if (z2) {
                            ef90Var7.K(i18);
                            j4 = yerVar2.a;
                            break;
                        }
                        i18++;
                    }
                } else {
                    ef90Var7.K(i18);
                }
                j4 = -1;
            }
        }
        int i21 = ef90Var7.b - i15;
        ef90Var7.K(i15);
        this.f.a(ef90Var7, i21, 0);
        int i22 = this.m + i21;
        this.m = i22;
        if (j4 != -1) {
            long j7 = this.n * 1000000;
            cfr cfrVar6 = this.i;
            int i23 = tw21.a;
            this.f.c(j7 / cfrVar6.e, 1, i22, 0, null);
            this.m = 0;
            this.n = j4;
        }
        int length2 = ef90Var7.a.length - ef90Var7.c;
        if (ef90Var7.a() < 16 && length2 < 16) {
            int a3 = ef90Var7.a();
            byte[] bArr6 = ef90Var7.a;
            System.arraycopy(bArr6, ef90Var7.b, bArr6, 0, a3);
            ef90Var7.K(0);
            ef90Var7.J(a3);
        }
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        w820 a = new y5v().a(c5pVar, w5v.b);
        if (a != null) {
            int length = a.a.length;
        }
        ef90 ef90Var = new ef90(4);
        ((kbh) c5pVar).H(ef90Var.a, 0, 4, false);
        return ef90Var.A() == 1716281667;
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    public xer() {
        this(0);
    }
}
