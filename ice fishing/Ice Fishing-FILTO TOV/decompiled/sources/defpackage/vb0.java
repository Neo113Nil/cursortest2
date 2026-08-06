package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vb0 extends tp0 {
    public final Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    public /* synthetic */ vb0(int i, Object obj) {
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = obj;
    }

    @Override // defpackage.tp0
    public final int EljAMC1QTz() {
        int i = this.EljAMC1QTz;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return ((ub0) obj).JFXS9W1rB5s4();
            default:
                return ((c) obj).getRoot().MZhzXH72.WIEu4Ya2g8.OOA6hdeuvCS;
        }
    }

    @Override // defpackage.tp0
    public final p50 OOA6hdeuvCS() {
        int i = this.EljAMC1QTz;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return ((ub0) obj).getLayoutDirection();
            default:
                return ((c) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.tp0
    public float X1lG3V04pd(sz szVar) {
        float intBitsToFloat;
        int dcDmLGVhzWm;
        switch (this.EljAMC1QTz) {
            case 0:
                lv lvVar = szVar.GWasM1elztuh;
                if (lvVar != null) {
                    return ((Number) lvVar.EljAMC1QTz(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ub0 ub0Var = (ub0) this.AvO7iQsrTN;
                if (ub0Var.iwATDS1i01k) {
                    return Float.NaN;
                }
                ub0 ub0Var2 = ub0Var;
                while (true) {
                    ai0 ai0Var = ub0Var2.YmKjaVtbfp5Z;
                    if (!Float.isNaN((ai0Var == null || (dcDmLGVhzWm = d5.dcDmLGVhzWm((sz[]) ai0Var.Yi7zF1RB1, szVar)) < 0) ? Float.NaN : ((float[]) ai0Var.X1lG3V04pd)[dcDmLGVhzWm])) {
                        ub0Var2.nXl1EmE5(ub0Var.bCsSzSHkbaQ(), szVar);
                        n50 vaTCmWUgXF = ub0Var2.vaTCmWUgXF();
                        n50 vaTCmWUgXF2 = ub0Var.vaTCmWUgXF();
                        switch (szVar.Yi7zF1RB1) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (vaTCmWUgXF2.M3K9sHhK(vaTCmWUgXF, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (vaTCmWUgXF.DmJncFq5() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (vaTCmWUgXF2.M3K9sHhK(vaTCmWUgXF, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (vaTCmWUgXF.DmJncFq5() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    ub0 hOpoc9RpANL = ub0Var2.hOpoc9RpANL();
                    if (hOpoc9RpANL == null) {
                        ub0Var2.nXl1EmE5(ub0Var.bCsSzSHkbaQ(), szVar);
                        return Float.NaN;
                    }
                    ub0Var2 = hOpoc9RpANL;
                }
                break;
            default:
                return super.X1lG3V04pd(szVar);
        }
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        int i = this.EljAMC1QTz;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return ((ub0) obj).Yi7zF1RB1();
            default:
                return ((c) obj).getDensity().Yi7zF1RB1();
        }
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        int i = this.EljAMC1QTz;
        Object obj = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                return ((ub0) obj).mOu10nynGul();
            default:
                return ((c) obj).getDensity().mOu10nynGul();
        }
    }
}
