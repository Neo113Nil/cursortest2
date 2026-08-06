package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ry implements fn0 {
    public final c AvO7iQsrTN;
    public final ny EljAMC1QTz;
    public int Mjvvu5DE;
    public oy OOA6hdeuvCS;
    public boolean WdrkLMV3xh;
    public float[] XnEVoBF0td1l;
    public boolean Y6hRI1cF8;
    public boolean cilMamHF;
    public lv encWxUiV2;
    public z50 jivtDDk9H;
    public wu mOu10nynGul;
    public boolean rQPn8YBR;
    public boolean uFEq9NpZ;
    public long JFJ3QoxA = 9223372034707292159L;
    public final float[] E7jCp8Ls = z50.rQPn8YBR();
    public el iwATDS1i01k = rj0.Yi7zF1RB1();
    public p50 WIEu4Ya2g8 = p50.OOA6hdeuvCS;
    public final u9 YmKjaVtbfp5Z = new u9();
    public long mE4lRynR = ga1.Yi7zF1RB1;
    public boolean lv06NcmrQ = true;
    public final NWXxPwoOUSX9 WRKkgoJXwDn = new NWXxPwoOUSX9(13, this);

    public ry(oy oyVar, ny nyVar, c cVar, lv lvVar, wu wuVar) {
        this.OOA6hdeuvCS = oyVar;
        this.EljAMC1QTz = nyVar;
        this.AvO7iQsrTN = cVar;
        this.encWxUiV2 = lvVar;
        this.mOu10nynGul = wuVar;
    }

    public final void AvO7iQsrTN() {
        c.WIEu4Ya2g8();
        if (this.uFEq9NpZ) {
            if (!ga1.GWasM1elztuh(this.mE4lRynR, ga1.Yi7zF1RB1) && !b30.GWasM1elztuh(this.OOA6hdeuvCS.Y6hRI1cF8, this.JFJ3QoxA)) {
                oy oyVar = this.OOA6hdeuvCS;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.mE4lRynR >> 32)) * ((int) (this.JFJ3QoxA >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.mE4lRynR & 4294967295L)) * ((int) (this.JFJ3QoxA & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!uk0.Yi7zF1RB1(oyVar.cilMamHF, floatToRawIntBits)) {
                    oyVar.cilMamHF = floatToRawIntBits;
                    oyVar.GWasM1elztuh.rezfBrjOrqK(floatToRawIntBits);
                }
            }
            oy oyVar2 = this.OOA6hdeuvCS;
            el elVar = this.iwATDS1i01k;
            p50 p50Var = this.WIEu4Ya2g8;
            long j = this.JFJ3QoxA;
            long j2 = oyVar2.Y6hRI1cF8;
            qy qyVar = oyVar2.GWasM1elztuh;
            if (!b30.GWasM1elztuh(j2, j)) {
                oyVar2.Y6hRI1cF8 = j;
                long j3 = oyVar2.jivtDDk9H;
                qyVar.ozMwhSAI((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (oyVar2.mOu10nynGul == 9205357640488583168L) {
                    oyVar2.AvO7iQsrTN = true;
                    oyVar2.GWasM1elztuh();
                }
            }
            oyVar2.Yi7zF1RB1 = elVar;
            oyVar2.X1lG3V04pd = p50Var;
            oyVar2.xqGvceK5x = this.WRKkgoJXwDn;
            qyVar.WdrkLMV3xh(elVar, p50Var, oyVar2, oyVar2.OOA6hdeuvCS);
            EljAMC1QTz(false);
        }
    }

    public final void EljAMC1QTz(boolean z) {
        if (z != this.uFEq9NpZ) {
            this.uFEq9NpZ = z;
            c cVar = this.AvO7iQsrTN;
            ag0 ag0Var = cVar.A1EKNP6CxJ;
            boolean z2 = cVar.DmJncFq5;
            if (!z) {
                if (z2) {
                    return;
                }
                ag0Var.JFJ3QoxA(this);
                ag0 ag0Var2 = cVar.MZhzXH72;
                if (ag0Var2 != null) {
                    ag0Var2.JFJ3QoxA(this);
                    return;
                }
                return;
            }
            if (!z2) {
                ag0Var.GWasM1elztuh(this);
                return;
            }
            ag0 ag0Var3 = cVar.MZhzXH72;
            if (ag0Var3 == null) {
                ag0Var3 = new ag0();
                cVar.MZhzXH72 = ag0Var3;
            }
            ag0Var3.GWasM1elztuh(this);
        }
    }

    public final float[] GWasM1elztuh() {
        float[] fArr = this.XnEVoBF0td1l;
        if (fArr == null) {
            fArr = z50.rQPn8YBR();
            this.XnEVoBF0td1l = fArr;
        }
        if (this.cilMamHF) {
            this.cilMamHF = false;
            float[] Yi7zF1RB1 = Yi7zF1RB1();
            if (this.lv06NcmrQ) {
                return Yi7zF1RB1;
            }
            if (!fb1.AEn1Rrio(Yi7zF1RB1, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final void OOA6hdeuvCS(long j) {
        if (b30.GWasM1elztuh(j, this.JFJ3QoxA)) {
            return;
        }
        if (c.WIEu4Ya2g8()) {
            this.AvO7iQsrTN.DmJncFq5(-4.0f);
        }
        this.JFJ3QoxA = j;
        X1lG3V04pd();
    }

    public final void X1lG3V04pd() {
        if (this.uFEq9NpZ || this.rQPn8YBR) {
            return;
        }
        this.AvO7iQsrTN.invalidate();
        EljAMC1QTz(true);
    }

    public final float[] Yi7zF1RB1() {
        boolean z = this.Y6hRI1cF8;
        float[] fArr = this.E7jCp8Ls;
        if (z) {
            oy oyVar = this.OOA6hdeuvCS;
            long j = oyVar.cilMamHF;
            qy qyVar = oyVar.GWasM1elztuh;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = n4.mOu10nynGul(o30.CMh55RymNfS(this.JFJ3QoxA));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float Mjvvu5DE = qyVar.Mjvvu5DE();
            float AvO7iQsrTN = qyVar.AvO7iQsrTN();
            float lv06NcmrQ = qyVar.lv06NcmrQ();
            float AEn1Rrio = qyVar.AEn1Rrio();
            float DmJncFq5 = qyVar.DmJncFq5();
            float OOA6hdeuvCS = qyVar.OOA6hdeuvCS();
            float MZhzXH72 = qyVar.MZhzXH72();
            double d = lv06NcmrQ * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (AvO7iQsrTN * cos) - (0.0f * sin);
            float f3 = (0.0f * cos) + (AvO7iQsrTN * sin);
            double d2 = AEn1Rrio * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (Mjvvu5DE * cos2);
            float f10 = (f3 * cos2) + ((-Mjvvu5DE) * sin2);
            double d3 = DmJncFq5 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * OOA6hdeuvCS;
            float f14 = sin3 * cos * OOA6hdeuvCS;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * OOA6hdeuvCS;
            float f16 = f12 * MZhzXH72;
            float f17 = cos * cos3 * MZhzXH72;
            float f18 = ((cos3 * f6) + (f11 * f4)) * MZhzXH72;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.Y6hRI1cF8 = false;
            this.lv06NcmrQ = n4.uFEq9NpZ(fArr);
        }
        return fArr;
    }

    public final void xqGvceK5x(long j) {
        boolean WIEu4Ya2g8 = c.WIEu4Ya2g8();
        c cVar = this.AvO7iQsrTN;
        if (WIEu4Ya2g8) {
            cVar.DmJncFq5(-4.0f);
        }
        oy oyVar = this.OOA6hdeuvCS;
        if (!u20.GWasM1elztuh(oyVar.jivtDDk9H, j)) {
            oyVar.jivtDDk9H = j;
            oyVar.GWasM1elztuh.ozMwhSAI((int) (j >> 32), (int) (j & 4294967295L), oyVar.Y6hRI1cF8);
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar.invalidate();
            return;
        }
        ViewParent parent = cVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(cVar, cVar);
        }
    }
}
