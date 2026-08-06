package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qn0 extends he0 implements w50, go {
    public s6 WdrkLMV3xh;
    public r6 Y6hRI1cF8;
    public k61 cilMamHF;
    public boolean jivtDDk9H;
    public float lv06NcmrQ;
    public rd1 mE4lRynR;

    public static boolean XmVeRDAr(long j) {
        return !t21.GWasM1elztuh(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean sb9fmtV8A(long j) {
        return !t21.GWasM1elztuh(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.go
    public final void DmJncFq5(i60 i60Var) {
        u9 u9Var = i60Var.OOA6hdeuvCS;
        long Yi7zF1RB1 = this.mE4lRynR.Yi7zF1RB1();
        long floatToRawIntBits = (Float.floatToRawIntBits(XmVeRDAr(Yi7zF1RB1) ? Float.intBitsToFloat((int) (Yi7zF1RB1 >> 32)) : Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32))) << 32) | (Float.floatToRawIntBits(sb9fmtV8A(Yi7zF1RB1) ? Float.intBitsToFloat((int) (Yi7zF1RB1 & 4294967295L)) : Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L))) & 4294967295L);
        long WRKkgoJXwDn = (Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32)) == 0.0f || Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L)) == 0.0f) ? 0L : w60.WRKkgoJXwDn(floatToRawIntBits, this.cilMamHF.mOu10nynGul(floatToRawIntBits, u9Var.xqGvceK5x()));
        long GWasM1elztuh = this.Y6hRI1cF8.GWasM1elztuh((Math.round(Float.intBitsToFloat((int) (WRKkgoJXwDn >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (WRKkgoJXwDn & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (u9Var.xqGvceK5x() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (u9Var.xqGvceK5x() & 4294967295L))) & 4294967295L), i60Var.getLayoutDirection());
        float f = (int) (GWasM1elztuh >> 32);
        float f2 = (int) (GWasM1elztuh & 4294967295L);
        ((j6IIN2O8eOU) u9Var.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(f, f2);
        try {
            this.mE4lRynR.GWasM1elztuh(i60Var, WRKkgoJXwDn, this.lv06NcmrQ, this.WdrkLMV3xh);
            ((j6IIN2O8eOU) u9Var.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
            i60Var.GWasM1elztuh();
        } catch (Throwable th) {
            ((j6IIN2O8eOU) u9Var.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(Hc2GqxcqBiX(j));
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new Bg54Cq4f(OOA6hdeuvCS, 3));
    }

    @Override // defpackage.w50
    public final int EljAMC1QTz(ub0 ub0Var, wc0 wc0Var, int i) {
        if (!gqMuANyCes()) {
            return wc0Var.J3Xc8BaqpN8(i);
        }
        long Hc2GqxcqBiX = Hc2GqxcqBiX(fg.Yi7zF1RB1(0, i, 7));
        return Math.max(eg.JFJ3QoxA(Hc2GqxcqBiX), wc0Var.J3Xc8BaqpN8(i));
    }

    public final long Hc2GqxcqBiX(long j) {
        boolean z = false;
        boolean z2 = eg.xqGvceK5x(j) && eg.X1lG3V04pd(j);
        if (eg.EljAMC1QTz(j) && eg.OOA6hdeuvCS(j)) {
            z = true;
        }
        if ((!gqMuANyCes() && z2) || z) {
            return eg.GWasM1elztuh(j, eg.encWxUiV2(j), 0, eg.AvO7iQsrTN(j), 0, 10);
        }
        long Yi7zF1RB1 = this.mE4lRynR.Yi7zF1RB1();
        int round = XmVeRDAr(Yi7zF1RB1) ? Math.round(Float.intBitsToFloat((int) (Yi7zF1RB1 >> 32))) : eg.JFJ3QoxA(j);
        int round2 = sb9fmtV8A(Yi7zF1RB1) ? Math.round(Float.intBitsToFloat((int) (Yi7zF1RB1 & 4294967295L))) : eg.mOu10nynGul(j);
        int EljAMC1QTz = fg.EljAMC1QTz(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(fg.OOA6hdeuvCS(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(EljAMC1QTz) << 32);
        if (gqMuANyCes()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!XmVeRDAr(this.mE4lRynR.Yi7zF1RB1()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.mE4lRynR.Yi7zF1RB1() >> 32))) << 32) | (Float.floatToRawIntBits(!sb9fmtV8A(this.mE4lRynR.Yi7zF1RB1()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.mE4lRynR.Yi7zF1RB1() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : w60.WRKkgoJXwDn(floatToRawIntBits2, this.cilMamHF.mOu10nynGul(floatToRawIntBits2, floatToRawIntBits));
        }
        return eg.GWasM1elztuh(j, fg.EljAMC1QTz(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, fg.OOA6hdeuvCS(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.w50
    public final int JFJ3QoxA(ub0 ub0Var, wc0 wc0Var, int i) {
        if (!gqMuANyCes()) {
            return wc0Var.EljAMC1QTz(i);
        }
        long Hc2GqxcqBiX = Hc2GqxcqBiX(fg.Yi7zF1RB1(i, 0, 13));
        return Math.max(eg.mOu10nynGul(Hc2GqxcqBiX), wc0Var.EljAMC1QTz(i));
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.w50
    public final int WRKkgoJXwDn(ub0 ub0Var, wc0 wc0Var, int i) {
        if (!gqMuANyCes()) {
            return wc0Var.Uxq83abb04(i);
        }
        long Hc2GqxcqBiX = Hc2GqxcqBiX(fg.Yi7zF1RB1(i, 0, 13));
        return Math.max(eg.mOu10nynGul(Hc2GqxcqBiX), wc0Var.Uxq83abb04(i));
    }

    @Override // defpackage.w50
    public final int dqB83aoLBB(ub0 ub0Var, wc0 wc0Var, int i) {
        if (!gqMuANyCes()) {
            return wc0Var.dqB83aoLBB(i);
        }
        long Hc2GqxcqBiX = Hc2GqxcqBiX(fg.Yi7zF1RB1(0, i, 7));
        return Math.max(eg.JFJ3QoxA(Hc2GqxcqBiX), wc0Var.dqB83aoLBB(i));
    }

    public final boolean gqMuANyCes() {
        return this.jivtDDk9H && this.mE4lRynR.Yi7zF1RB1() != 9205357640488583168L;
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.mE4lRynR + ", sizeToIntrinsics=" + this.jivtDDk9H + ", alignment=" + this.Y6hRI1cF8 + ", alpha=" + this.lv06NcmrQ + ", colorFilter=" + this.WdrkLMV3xh + ')';
    }
}
