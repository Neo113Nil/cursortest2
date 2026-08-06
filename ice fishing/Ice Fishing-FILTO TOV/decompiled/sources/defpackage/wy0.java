package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wy0 {
    public final oy0 AvO7iQsrTN;
    public rx0 EljAMC1QTz;
    public py0 GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public fk X1lG3V04pd;
    public m0 Yi7zF1RB1;
    public final ky0 encWxUiV2;
    public boolean mOu10nynGul;
    public xm0 xqGvceK5x;
    public int JFJ3QoxA = 1;
    public zx0 rQPn8YBR = hy0.Yi7zF1RB1;
    public final uy0 E7jCp8Ls = new uy0(this);
    public final E7jCp8Ls XnEVoBF0td1l = new E7jCp8Ls(17, this);

    public wy0(py0 py0Var, m0 m0Var, fk fkVar, xm0 xm0Var, boolean z, rx0 rx0Var, oy0 oy0Var, ky0 ky0Var) {
        this.GWasM1elztuh = py0Var;
        this.Yi7zF1RB1 = m0Var;
        this.X1lG3V04pd = fkVar;
        this.xqGvceK5x = xm0Var;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = rx0Var;
        this.AvO7iQsrTN = oy0Var;
        this.encWxUiV2 = ky0Var;
    }

    public final float AvO7iQsrTN(long j) {
        return Float.intBitsToFloat((int) (this.xqGvceK5x == xm0.EljAMC1QTz ? j >> 32 : j & 4294967295L));
    }

    public final Object EljAMC1QTz(tg0 tg0Var, lv lvVar, wg wgVar) {
        Object xqGvceK5x = this.GWasM1elztuh.xqGvceK5x(tg0Var, new EljAMC1QTz(this, lvVar, null, 15), wgVar);
        return xqGvceK5x == qh.OOA6hdeuvCS ? xqGvceK5x : kc1.GWasM1elztuh;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GWasM1elztuh(long j, wg wgVar) {
        ry0 ry0Var;
        int i;
        wy0 wy0Var;
        Throwable th;
        qt0 qt0Var;
        if (wgVar instanceof ry0) {
            ry0Var = (ry0) wgVar;
            int i2 = ry0Var.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ry0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = ry0Var.mOu10nynGul;
                i = ry0Var.rQPn8YBR;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    qt0 qt0Var2 = new qt0();
                    qt0Var2.OOA6hdeuvCS = j;
                    this.mOu10nynGul = true;
                    try {
                        tg0 tg0Var = tg0.OOA6hdeuvCS;
                        wy0Var = this;
                        try {
                            ty0 ty0Var = new ty0(wy0Var, qt0Var2, j, null);
                            ry0Var.encWxUiV2 = qt0Var2;
                            ry0Var.rQPn8YBR = 1;
                            Object EljAMC1QTz = wy0Var.EljAMC1QTz(tg0Var, ty0Var, ry0Var);
                            qh qhVar = qh.OOA6hdeuvCS;
                            if (EljAMC1QTz == qhVar) {
                                return qhVar;
                            }
                            qt0Var = qt0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            wy0Var.mOu10nynGul = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        wy0Var = this;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qt0Var = ry0Var.encWxUiV2;
                    try {
                        o50.A1EKNP6CxJ(obj);
                        wy0Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        wy0Var = this;
                        wy0Var.mOu10nynGul = false;
                        throw th;
                    }
                }
                wy0Var.mOu10nynGul = false;
                return new yd1(qt0Var.OOA6hdeuvCS);
            }
        }
        ry0Var = new ry0(this, wgVar);
        Object obj2 = ry0Var.mOu10nynGul;
        i = ry0Var.rQPn8YBR;
        if (i != 0) {
        }
        wy0Var.mOu10nynGul = false;
        return new yd1(qt0Var.OOA6hdeuvCS);
    }

    public final long OOA6hdeuvCS(long j) {
        return this.OOA6hdeuvCS ? uk0.EljAMC1QTz(-1.0f, j) : j;
    }

    public final long X1lG3V04pd(zx0 zx0Var, long j, int i) {
        nj0 nj0Var = (nj0) this.EljAMC1QTz.OOA6hdeuvCS;
        nj0 sb9fmtV8A = nj0Var != null ? nj0Var.sb9fmtV8A() : null;
        long bfDgRvRIg = sb9fmtV8A != null ? sb9fmtV8A.bfDgRvRIg(i, j) : 0L;
        long xqGvceK5x = uk0.xqGvceK5x(j, bfDgRvRIg);
        long OOA6hdeuvCS = OOA6hdeuvCS(encWxUiV2(zx0Var.GWasM1elztuh(AvO7iQsrTN(OOA6hdeuvCS(this.xqGvceK5x == xm0.EljAMC1QTz ? uk0.GWasM1elztuh(xqGvceK5x, 0.0f, 1) : uk0.GWasM1elztuh(xqGvceK5x, 0.0f, 2))))));
        oy0 oy0Var = this.AvO7iQsrTN;
        if (oy0Var.Mjvvu5DE) {
            ViewTreeObserver viewTreeObserver = ((c) vc0.A1EKNP6CxJ(oy0Var)).getViewTreeObserver();
            try {
                if (c.q2wN4kodRW == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    c.q2wN4kodRW = declaredMethod;
                }
                Method method = c.q2wN4kodRW;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long xqGvceK5x2 = uk0.xqGvceK5x(xqGvceK5x, OOA6hdeuvCS);
        nj0 nj0Var2 = (nj0) this.EljAMC1QTz.OOA6hdeuvCS;
        nj0 sb9fmtV8A2 = nj0Var2 != null ? nj0Var2.sb9fmtV8A() : null;
        return uk0.OOA6hdeuvCS(uk0.OOA6hdeuvCS(bfDgRvRIg, OOA6hdeuvCS), sb9fmtV8A2 != null ? sb9fmtV8A2.Hc2GqxcqBiX(i, OOA6hdeuvCS, xqGvceK5x2) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.fk) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(long j, boolean z, d71 d71Var) {
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (z) {
            fk fkVar = this.X1lG3V04pd;
            dx0 dx0Var = hy0.GWasM1elztuh;
        }
        long GWasM1elztuh = yd1.GWasM1elztuh(j, 0.0f, 0.0f, this.xqGvceK5x == xm0.EljAMC1QTz ? 1 : 2);
        vy0 vy0Var = new vy0(this, null);
        m0 m0Var = this.Yi7zF1RB1;
        qh qhVar = qh.OOA6hdeuvCS;
        if (m0Var == null || !(this.GWasM1elztuh.X1lG3V04pd() || this.GWasM1elztuh.GWasM1elztuh())) {
            vy0 vy0Var2 = new vy0(vy0Var.E7jCp8Ls, d71Var);
            vy0Var2.rQPn8YBR = GWasM1elztuh;
            Object WIEu4Ya2g8 = vy0Var2.WIEu4Ya2g8(kc1Var);
            if (WIEu4Ya2g8 == qhVar) {
                return WIEu4Ya2g8;
            }
        } else {
            Object Yi7zF1RB1 = m0Var.Yi7zF1RB1(GWasM1elztuh, vy0Var, d71Var);
            if (Yi7zF1RB1 == qhVar) {
                return Yi7zF1RB1;
            }
        }
        return kc1Var;
    }

    public final long encWxUiV2(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.xqGvceK5x == xm0.EljAMC1QTz) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float mOu10nynGul(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        xm0 xm0Var = this.xqGvceK5x;
        if (atan2 >= 0.7853981633974483d) {
            if (xm0Var == xm0.OOA6hdeuvCS) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (xm0Var == xm0.EljAMC1QTz) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final float xqGvceK5x(float f) {
        return this.OOA6hdeuvCS ? f * (-1.0f) : f;
    }
}
