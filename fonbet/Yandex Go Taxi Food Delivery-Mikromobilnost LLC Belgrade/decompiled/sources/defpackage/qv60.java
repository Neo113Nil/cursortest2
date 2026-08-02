package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class qv60 implements b5p {
    public d5p a;
    public gru0 b;
    public boolean c;

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        gru0 gru0Var = this.b;
        if (gru0Var != null) {
            sv60 sv60Var = gru0Var.a;
            tv60 tv60Var = sv60Var.a;
            tv60Var.a = 0;
            tv60Var.b = 0L;
            tv60Var.c = 0;
            tv60Var.d = 0;
            tv60Var.e = 0;
            sv60Var.b.H(0);
            sv60Var.c = -1;
            sv60Var.e = false;
            if (j == 0) {
                gru0Var.d(!gru0Var.l);
                return;
            }
            if (gru0Var.h != 0) {
                long j3 = (gru0Var.i * j2) / 1000000;
                gru0Var.e = j3;
                uv60 uv60Var = gru0Var.d;
                int i = tw21.a;
                uv60Var.g(j3);
                gru0Var.h = 2;
            }
        }
    }

    public final boolean b(c5p c5pVar) {
        boolean z;
        tv60 tv60Var = new tv60();
        if (tv60Var.a(c5pVar, true) && (tv60Var.a & 2) == 2) {
            int min = Math.min(tv60Var.e, 8);
            ef90 ef90Var = new ef90(min);
            c5pVar.g(0, min, ef90Var.a);
            ef90Var.K(0);
            if (ef90Var.a() >= 5 && ef90Var.y() == 127 && ef90Var.A() == 1179402563) {
                this.b = new afr();
                return true;
            }
            ef90Var.K(0);
            try {
                z = xj91.f(1, ef90Var, true);
            } catch (ParserException unused) {
                z = false;
            }
            if (z) {
                this.b = new tz31();
            } else {
                ef90Var.K(0);
                if (ch70.e(ef90Var, ch70.o)) {
                    this.b = new ch70();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.a = d5pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        int i;
        ef90 ef90Var;
        byte[] bArr;
        d6z.z(this.a);
        if (this.b == null) {
            if (!b(c5pVar)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            c5pVar.J();
        }
        if (!this.c) {
            g001 B = this.a.B(0, 1);
            this.a.A();
            gru0 gru0Var = this.b;
            gru0Var.c = this.a;
            gru0Var.b = B;
            gru0Var.d(true);
            this.c = true;
        }
        gru0 gru0Var2 = this.b;
        sv60 sv60Var = gru0Var2.a;
        d6z.z(gru0Var2.b);
        int i2 = tw21.a;
        int i3 = gru0Var2.h;
        if (i3 != 0) {
            if (i3 == 1) {
                c5pVar.O((int) gru0Var2.f);
                gru0Var2.h = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return -1;
                }
                ny61.k();
                return 0;
            }
            long j = gru0Var2.d.j(c5pVar);
            if (j >= 0) {
                xde0Var.a = j;
                return 1;
            }
            if (j < -1) {
                gru0Var2.a(-(j + 2));
            }
            if (!gru0Var2.l) {
                f7q0 d = gru0Var2.d.d();
                d6z.z(d);
                gru0Var2.c.w(d);
                g001 g001Var = gru0Var2.b;
                d.k();
                g001Var.getClass();
                gru0Var2.l = true;
            }
            if (gru0Var2.k <= 0 && !sv60Var.b(c5pVar)) {
                gru0Var2.h = 3;
                return -1;
            }
            gru0Var2.k = 0L;
            ef90 ef90Var2 = sv60Var.b;
            long b = gru0Var2.b(ef90Var2);
            if (b >= 0) {
                long j2 = gru0Var2.g;
                if (j2 + b >= gru0Var2.e) {
                    gru0Var2.b.a(ef90Var2, ef90Var2.c, 0);
                    gru0Var2.b.c((j2 * 1000000) / gru0Var2.i, 1, ef90Var2.c, 0, null);
                    gru0Var2.e = -1L;
                }
            }
            gru0Var2.g += b;
            return 0;
        }
        while (true) {
            boolean b2 = sv60Var.b(c5pVar);
            ef90 ef90Var3 = sv60Var.b;
            if (!b2) {
                gru0Var2.h = 3;
                return -1;
            }
            long position = c5pVar.getPosition();
            long j3 = gru0Var2.f;
            gru0Var2.k = position - j3;
            if (gru0Var2.c(ef90Var3, j3, gru0Var2.j)) {
                gru0Var2.f = c5pVar.getPosition();
            } else {
                a aVar = (a) gru0Var2.j.a;
                gru0Var2.i = aVar.E;
                if (!gru0Var2.m) {
                    gru0Var2.b.d(aVar);
                    gru0Var2.m = true;
                }
                zer zerVar = (zer) gru0Var2.j.b;
                if (zerVar != null) {
                    gru0Var2.d = zerVar;
                } else {
                    if (c5pVar.getLength() != -1) {
                        tv60 tv60Var = sv60Var.a;
                        boolean z = (tv60Var.a & 4) != 0;
                        i = 2;
                        long j4 = gru0Var2.f;
                        long length = c5pVar.getLength();
                        long j5 = tv60Var.d + tv60Var.e;
                        long j6 = tv60Var.b;
                        ef90Var = ef90Var3;
                        gru0Var2.d = new dgh(gru0Var2, j4, length, j5, j6, z);
                        gru0Var2.h = i;
                        bArr = ef90Var.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        ef90Var.I(ef90Var.c, Arrays.copyOf(bArr, Math.max(65025, ef90Var.c)));
                        return 0;
                    }
                    gru0Var2.d = new s400();
                }
                i = 2;
                ef90Var = ef90Var3;
                gru0Var2.h = i;
                bArr = ef90Var.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        try {
            return b(c5pVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
