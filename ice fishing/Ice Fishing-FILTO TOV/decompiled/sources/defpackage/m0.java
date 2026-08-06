package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m0 {
    public long AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public final el GWasM1elztuh;
    public final boolean OOA6hdeuvCS;
    public final ro X1lG3V04pd;
    public long Yi7zF1RB1 = 9205357640488583168L;
    public long encWxUiV2;
    public final yk mOu10nynGul;
    public final fo0 xqGvceK5x;

    public m0(Context context, el elVar, long j, nn0 nn0Var) {
        this.GWasM1elztuh = elVar;
        ro roVar = new ro(context, ki1.HFYAaqMd6(j));
        this.X1lG3V04pd = roVar;
        this.xqGvceK5x = new fo0(kc1.GWasM1elztuh, b9xEq24R1.qugwajBSa59j);
        this.OOA6hdeuvCS = true;
        this.AvO7iQsrTN = 0L;
        this.encWxUiV2 = -1L;
        l0 l0Var = new l0(this);
        gq0 gq0Var = f71.GWasM1elztuh;
        h71 h71Var = new h71(null, null, l0Var);
        this.mOu10nynGul = Build.VERSION.SDK_INT >= 31 ? new my(h71Var, this, roVar) : new my(h71Var, this, roVar, nn0Var);
    }

    public final float AvO7iQsrTN(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (X1lG3V04pd() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32));
        EdgeEffect xqGvceK5x = this.X1lG3V04pd.xqGvceK5x();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d4.xqGvceK5x(xqGvceK5x, f, intBitsToFloat);
        } else {
            xqGvceK5x.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? d4.X1lG3V04pd(xqGvceK5x) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float EljAMC1QTz(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (X1lG3V04pd() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32));
        EdgeEffect X1lG3V04pd = this.X1lG3V04pd.X1lG3V04pd();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d4.xqGvceK5x(X1lG3V04pd, intBitsToFloat2, f);
        } else {
            X1lG3V04pd.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? d4.X1lG3V04pd(X1lG3V04pd) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void GWasM1elztuh() {
        boolean z;
        ro roVar = this.X1lG3V04pd;
        EdgeEffect edgeEffect = roVar.xqGvceK5x;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = roVar.OOA6hdeuvCS;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = roVar.EljAMC1QTz;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = roVar.AvO7iQsrTN;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            xqGvceK5x();
        }
    }

    public final float OOA6hdeuvCS(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (X1lG3V04pd() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L));
        EdgeEffect Yi7zF1RB1 = this.X1lG3V04pd.Yi7zF1RB1();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = d4.xqGvceK5x(Yi7zF1RB1, f, f2);
        } else {
            Yi7zF1RB1.onPull(f, f2);
        }
        return (i2 >= 31 ? d4.X1lG3V04pd(Yi7zF1RB1) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.AvO7iQsrTN)) * (-f) : Float.intBitsToFloat(i);
    }

    public final long X1lG3V04pd() {
        long j = this.Yi7zF1RB1;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = n4.mOu10nynGul(this.AvO7iQsrTN);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(long j, vy0 vy0Var, wg wgVar) {
        j0 j0Var;
        int i;
        long xqGvceK5x;
        long xqGvceK5x2;
        if (wgVar instanceof j0) {
            j0Var = (j0) wgVar;
            int i2 = j0Var.rQPn8YBR;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0Var.rQPn8YBR = i2 - Integer.MIN_VALUE;
                Object obj = j0Var.mOu10nynGul;
                i = j0Var.rQPn8YBR;
                kc1 kc1Var = kc1.GWasM1elztuh;
                ro roVar = this.X1lG3V04pd;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    boolean X1lG3V04pd = t21.X1lG3V04pd(this.AvO7iQsrTN);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (X1lG3V04pd) {
                        j0Var.rQPn8YBR = 1;
                        vy0Var.getClass();
                        vy0 vy0Var2 = new vy0(vy0Var.E7jCp8Ls, j0Var);
                        vy0Var2.rQPn8YBR = j;
                        if (vy0Var2.WIEu4Ya2g8(kc1Var) != qhVar) {
                            return kc1Var;
                        }
                    } else {
                        boolean AvO7iQsrTN = ro.AvO7iQsrTN(roVar.EljAMC1QTz);
                        el elVar = this.GWasM1elztuh;
                        long X1lG3V04pd2 = n4.X1lG3V04pd((!AvO7iQsrTN || yd1.Yi7zF1RB1(j) >= 0.0f) ? (!ro.AvO7iQsrTN(roVar.AvO7iQsrTN) || yd1.Yi7zF1RB1(j) <= 0.0f) ? 0.0f : -o30.AvO7iQsrTN(roVar.xqGvceK5x(), -yd1.Yi7zF1RB1(j), Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32)), elVar) : o30.AvO7iQsrTN(roVar.X1lG3V04pd(), yd1.Yi7zF1RB1(j), Float.intBitsToFloat((int) (this.AvO7iQsrTN >> 32)), elVar), (!ro.AvO7iQsrTN(roVar.xqGvceK5x) || yd1.X1lG3V04pd(j) >= 0.0f) ? (!ro.AvO7iQsrTN(roVar.OOA6hdeuvCS) || yd1.X1lG3V04pd(j) <= 0.0f) ? 0.0f : -o30.AvO7iQsrTN(roVar.Yi7zF1RB1(), -yd1.X1lG3V04pd(j), Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L)), elVar) : o30.AvO7iQsrTN(roVar.OOA6hdeuvCS(), yd1.X1lG3V04pd(j), Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L)), elVar));
                        if (X1lG3V04pd2 != 0) {
                            xqGvceK5x();
                        }
                        xqGvceK5x = yd1.xqGvceK5x(j, X1lG3V04pd2);
                        j0Var.encWxUiV2 = xqGvceK5x;
                        j0Var.rQPn8YBR = 2;
                        vy0Var.getClass();
                        vy0 vy0Var3 = new vy0(vy0Var.E7jCp8Ls, j0Var);
                        vy0Var3.rQPn8YBR = xqGvceK5x;
                        obj = vy0Var3.WIEu4Ya2g8(kc1Var);
                    }
                    return qhVar;
                }
                if (i == 1) {
                    o50.A1EKNP6CxJ(obj);
                    return kc1Var;
                }
                if (i != 2) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xqGvceK5x = j0Var.encWxUiV2;
                o50.A1EKNP6CxJ(obj);
                xqGvceK5x2 = yd1.xqGvceK5x(xqGvceK5x, ((yd1) obj).GWasM1elztuh);
                this.EljAMC1QTz = false;
                if (yd1.Yi7zF1RB1(xqGvceK5x2) <= 0.0f) {
                    EdgeEffect X1lG3V04pd3 = roVar.X1lG3V04pd();
                    int MZhzXH72 = vc0.MZhzXH72(yd1.Yi7zF1RB1(xqGvceK5x2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        X1lG3V04pd3.onAbsorb(MZhzXH72);
                    } else if (X1lG3V04pd3.isFinished()) {
                        X1lG3V04pd3.onAbsorb(MZhzXH72);
                    }
                } else if (yd1.Yi7zF1RB1(xqGvceK5x2) < 0.0f) {
                    EdgeEffect xqGvceK5x3 = roVar.xqGvceK5x();
                    int i3 = -vc0.MZhzXH72(yd1.Yi7zF1RB1(xqGvceK5x2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        xqGvceK5x3.onAbsorb(i3);
                    } else if (xqGvceK5x3.isFinished()) {
                        xqGvceK5x3.onAbsorb(i3);
                    }
                }
                if (yd1.X1lG3V04pd(xqGvceK5x2) <= 0.0f) {
                    EdgeEffect OOA6hdeuvCS = roVar.OOA6hdeuvCS();
                    int MZhzXH722 = vc0.MZhzXH72(yd1.X1lG3V04pd(xqGvceK5x2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        OOA6hdeuvCS.onAbsorb(MZhzXH722);
                    } else if (OOA6hdeuvCS.isFinished()) {
                        OOA6hdeuvCS.onAbsorb(MZhzXH722);
                    }
                } else if (yd1.X1lG3V04pd(xqGvceK5x2) < 0.0f) {
                    EdgeEffect Yi7zF1RB1 = roVar.Yi7zF1RB1();
                    int i4 = -vc0.MZhzXH72(yd1.X1lG3V04pd(xqGvceK5x2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        Yi7zF1RB1.onAbsorb(i4);
                    } else if (Yi7zF1RB1.isFinished()) {
                        Yi7zF1RB1.onAbsorb(i4);
                    }
                }
                GWasM1elztuh();
                return kc1Var;
            }
        }
        j0Var = new j0(this, wgVar);
        Object obj2 = j0Var.mOu10nynGul;
        i = j0Var.rQPn8YBR;
        kc1 kc1Var2 = kc1.GWasM1elztuh;
        ro roVar2 = this.X1lG3V04pd;
        if (i != 0) {
        }
        xqGvceK5x2 = yd1.xqGvceK5x(xqGvceK5x, ((yd1) obj2).GWasM1elztuh);
        this.EljAMC1QTz = false;
        if (yd1.Yi7zF1RB1(xqGvceK5x2) <= 0.0f) {
        }
        if (yd1.X1lG3V04pd(xqGvceK5x2) <= 0.0f) {
        }
        GWasM1elztuh();
        return kc1Var2;
    }

    public final float encWxUiV2(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (X1lG3V04pd() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L));
        EdgeEffect OOA6hdeuvCS = this.X1lG3V04pd.OOA6hdeuvCS();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = d4.xqGvceK5x(OOA6hdeuvCS, intBitsToFloat2, intBitsToFloat);
        } else {
            OOA6hdeuvCS.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? d4.X1lG3V04pd(OOA6hdeuvCS) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.AvO7iQsrTN & 4294967295L)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void mOu10nynGul(long j) {
        boolean GWasM1elztuh = t21.GWasM1elztuh(this.AvO7iQsrTN, 0L);
        boolean GWasM1elztuh2 = t21.GWasM1elztuh(j, this.AvO7iQsrTN);
        this.AvO7iQsrTN = j;
        if (!GWasM1elztuh2) {
            long MZhzXH72 = (vc0.MZhzXH72(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (vc0.MZhzXH72(Float.intBitsToFloat((int) (j >> 32))) << 32);
            ro roVar = this.X1lG3V04pd;
            roVar.X1lG3V04pd = MZhzXH72;
            EdgeEffect edgeEffect = roVar.xqGvceK5x;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (MZhzXH72 >> 32), (int) (MZhzXH72 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = roVar.OOA6hdeuvCS;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (MZhzXH72 >> 32), (int) (MZhzXH72 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = roVar.EljAMC1QTz;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (MZhzXH72 & 4294967295L), (int) (MZhzXH72 >> 32));
            }
            EdgeEffect edgeEffect4 = roVar.AvO7iQsrTN;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (MZhzXH72 & 4294967295L), (int) (MZhzXH72 >> 32));
            }
            EdgeEffect edgeEffect5 = roVar.encWxUiV2;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (MZhzXH72 >> 32), (int) (MZhzXH72 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = roVar.mOu10nynGul;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (MZhzXH72 >> 32), (int) (MZhzXH72 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = roVar.JFJ3QoxA;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (MZhzXH72 & 4294967295L), (int) (MZhzXH72 >> 32));
            }
            EdgeEffect edgeEffect8 = roVar.rQPn8YBR;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & MZhzXH72), (int) (MZhzXH72 >> 32));
            }
        }
        if (GWasM1elztuh || GWasM1elztuh2) {
            return;
        }
        GWasM1elztuh();
    }

    public final void xqGvceK5x() {
        if (this.OOA6hdeuvCS) {
            this.xqGvceK5x.setValue(kc1.GWasM1elztuh);
        }
    }
}
