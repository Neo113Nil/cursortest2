package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class og extends he0 implements ef, ed0 {
    public boolean WdrkLMV3xh;
    public boolean Y6hRI1cF8;
    public boolean arNh8D4Z5gB;
    public final ky0 cilMamHF;
    public final wy0 jivtDDk9H;
    public xm0 mE4lRynR;
    public final x7 lv06NcmrQ = new x7(0);
    public long WRKkgoJXwDn = -1;

    public og(xm0 xm0Var, wy0 wy0Var, boolean z, ky0 ky0Var) {
        this.mE4lRynR = xm0Var;
        this.jivtDDk9H = wy0Var;
        this.Y6hRI1cF8 = z;
        this.cilMamHF = ky0Var;
    }

    public static boolean XmVeRDAr(og ogVar, kt0 kt0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = ogVar.sb9fmtV8A();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long OGdJP42E = ogVar.OGdJP42E(kt0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (OGdJP42E >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (OGdJP42E & 4294967295L))) <= 0.5f;
    }

    public static final float gqMuANyCes(og ogVar, d8 d8Var, long j) {
        float f;
        kt0 kt0Var;
        int compare;
        long j2 = ogVar.WRKkgoJXwDn;
        rg0 rg0Var = ogVar.lv06NcmrQ.GWasM1elztuh;
        int i = rg0Var.AvO7iQsrTN - 1;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        if (i < objArr.length) {
            kt0Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                kt0 kt0Var2 = (kt0) ((lg) objArr[i]).GWasM1elztuh.GWasM1elztuh();
                if (kt0Var2 != null) {
                    long Yi7zF1RB1 = kt0Var2.Yi7zF1RB1();
                    long CMh55RymNfS = o30.CMh55RymNfS(ogVar.sb9fmtV8A());
                    f = 0.0f;
                    int ordinal = ogVar.mE4lRynR.ordinal();
                    if (ordinal == 0) {
                        compare = Float.compare(Float.intBitsToFloat((int) (Yi7zF1RB1 & 4294967295L)), Float.intBitsToFloat((int) (CMh55RymNfS & 4294967295L)));
                    } else {
                        if (ordinal != 1) {
                            o4.xqGvceK5x();
                            return 0.0f;
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (Yi7zF1RB1 >> 32)), Float.intBitsToFloat((int) (CMh55RymNfS >> 32)));
                    }
                    if (compare <= 0) {
                        kt0Var = kt0Var2;
                    } else if (kt0Var == null) {
                        kt0Var = kt0Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            kt0Var = null;
        }
        if (kt0Var == null) {
            kt0 kt0Var3 = ogVar.WdrkLMV3xh ? (kt0) ogVar.cilMamHF.GWasM1elztuh() : null;
            if (kt0Var3 == null) {
                return f;
            }
            kt0Var = kt0Var3;
        }
        long CMh55RymNfS2 = o30.CMh55RymNfS(j2);
        int ordinal2 = ogVar.mE4lRynR.ordinal();
        if (ordinal2 == 0) {
            float f2 = kt0Var.Yi7zF1RB1;
            return d8Var.GWasM1elztuh(f2 - ((int) (j & 4294967295L)), kt0Var.xqGvceK5x - f2, Float.intBitsToFloat((int) (CMh55RymNfS2 & 4294967295L)));
        }
        if (ordinal2 == 1) {
            float f3 = kt0Var.GWasM1elztuh;
            return d8Var.GWasM1elztuh(f3 - ((int) (j >> 32)), kt0Var.X1lG3V04pd - f3, Float.intBitsToFloat((int) (CMh55RymNfS2 >> 32)));
        }
        o4.xqGvceK5x();
        return f;
    }

    public final void Hc2GqxcqBiX(long j) {
        lf lfVar = f8.GWasM1elztuh;
        d8 d8Var = (d8) o30.Mjvvu5DE(this, lfVar);
        if (this.arNh8D4Z5gB) {
            w10.X1lG3V04pd("launchAnimation called when previous animation was running");
        }
        ((d8) o30.Mjvvu5DE(this, lfVar)).getClass();
        d8.GWasM1elztuh.getClass();
        fb1.MZhzXH72(oFzb77RX3H8t(), null, new ng(this, new bd1(c8.Yi7zF1RB1), d8Var, j, null), 1);
    }

    public final long OGdJP42E(kt0 kt0Var, long j, long j2) {
        long CMh55RymNfS = o30.CMh55RymNfS(j);
        int ordinal = this.mE4lRynR.ordinal();
        if (ordinal == 0) {
            d8 d8Var = (d8) o30.Mjvvu5DE(this, f8.GWasM1elztuh);
            float f = kt0Var.Yi7zF1RB1;
            float GWasM1elztuh = d8Var.GWasM1elztuh(f - ((int) (j2 & 4294967295L)), kt0Var.xqGvceK5x - f, Float.intBitsToFloat((int) (CMh55RymNfS & 4294967295L)));
            return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(GWasM1elztuh) & 4294967295L);
        }
        if (ordinal != 1) {
            o4.xqGvceK5x();
            return 0L;
        }
        d8 d8Var2 = (d8) o30.Mjvvu5DE(this, f8.GWasM1elztuh);
        float f2 = kt0Var.GWasM1elztuh;
        return (Float.floatToRawIntBits(d8Var2.GWasM1elztuh(f2 - ((int) (j2 >> 32)), kt0Var.X1lG3V04pd - f2, Float.intBitsToFloat((int) (CMh55RymNfS >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.ed0
    public final void X1lG3V04pd(long j) {
        int uFEq9NpZ;
        long sb9fmtV8A = sb9fmtV8A();
        this.WRKkgoJXwDn = j;
        int ordinal = this.mE4lRynR.ordinal();
        if (ordinal == 0) {
            uFEq9NpZ = o30.uFEq9NpZ((int) (j & 4294967295L), (int) (sb9fmtV8A & 4294967295L));
        } else {
            if (ordinal != 1) {
                o4.xqGvceK5x();
                return;
            }
            uFEq9NpZ = o30.uFEq9NpZ((int) (j >> 32), (int) (sb9fmtV8A >> 32));
        }
        if (uFEq9NpZ >= 0) {
            return;
        }
        long j2 = !this.Y6hRI1cF8 ? this.mE4lRynR == xm0.OOA6hdeuvCS ? (((int) (sb9fmtV8A & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (sb9fmtV8A >> 32)) - ((int) (j >> 32))) << 32 : 0L;
        kt0 kt0Var = (kt0) this.cilMamHF.GWasM1elztuh();
        if (kt0Var == null || this.arNh8D4Z5gB || this.WdrkLMV3xh || !XmVeRDAr(this, kt0Var, sb9fmtV8A, 0L, 2) || XmVeRDAr(this, kt0Var, 0L, j2, 1)) {
            return;
        }
        this.WdrkLMV3xh = true;
        Hc2GqxcqBiX(j2);
    }

    public final long sb9fmtV8A() {
        long j = this.WRKkgoJXwDn;
        if (b30.GWasM1elztuh(j, -1L)) {
            return 0L;
        }
        return j;
    }
}
