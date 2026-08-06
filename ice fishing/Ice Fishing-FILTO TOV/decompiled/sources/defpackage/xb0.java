package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xb0 implements n50 {
    public final wb0 OOA6hdeuvCS;

    public xb0(wb0 wb0Var) {
        this.OOA6hdeuvCS = wb0Var;
    }

    @Override // defpackage.n50
    public final long AvO7iQsrTN(long j) {
        return this.OOA6hdeuvCS.mE4lRynR.AvO7iQsrTN(uk0.OOA6hdeuvCS(j, GWasM1elztuh()));
    }

    @Override // defpackage.n50
    public final long DmJncFq5() {
        wb0 wb0Var = this.OOA6hdeuvCS;
        return (wb0Var.OOA6hdeuvCS << 32) | (wb0Var.EljAMC1QTz & 4294967295L);
    }

    public final long GWasM1elztuh() {
        wb0 wb0Var = this.OOA6hdeuvCS;
        wb0 jivtDDk9H = d70.jivtDDk9H(wb0Var);
        return uk0.xqGvceK5x(YZjbz8VdP5(jivtDDk9H.cilMamHF, 0L), wb0Var.mE4lRynR.YZjbz8VdP5(jivtDDk9H.mE4lRynR, 0L));
    }

    @Override // defpackage.n50
    public final n50 JFJ3QoxA() {
        wb0 P4U4zqyW7wx;
        if (!ozMwhSAI()) {
            t10.Yi7zF1RB1("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bk0 bk0Var = this.OOA6hdeuvCS.mE4lRynR.mE4lRynR.A1EKNP6CxJ.xqGvceK5x.Y6hRI1cF8;
        if (bk0Var == null || (P4U4zqyW7wx = bk0Var.P4U4zqyW7wx()) == null) {
            return null;
        }
        return P4U4zqyW7wx.cilMamHF;
    }

    @Override // defpackage.n50
    public final long M3K9sHhK(n50 n50Var, long j) {
        return YZjbz8VdP5(n50Var, j);
    }

    @Override // defpackage.n50
    public final long X1lG3V04pd(long j) {
        return this.OOA6hdeuvCS.mE4lRynR.X1lG3V04pd(uk0.OOA6hdeuvCS(0L, GWasM1elztuh()));
    }

    @Override // defpackage.n50
    public final long YZjbz8VdP5(n50 n50Var, long j) {
        boolean z = n50Var instanceof xb0;
        wb0 wb0Var = this.OOA6hdeuvCS;
        if (!z) {
            wb0 jivtDDk9H = d70.jivtDDk9H(wb0Var);
            bk0 bk0Var = jivtDDk9H.mE4lRynR;
            long YZjbz8VdP5 = YZjbz8VdP5(jivtDDk9H.cilMamHF, j);
            float f = (int) (jivtDDk9H.jivtDDk9H & 4294967295L);
            long xqGvceK5x = uk0.xqGvceK5x(YZjbz8VdP5, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!bk0Var.iK7aQfvhG().Mjvvu5DE) {
                t10.Yi7zF1RB1("LayoutCoordinate operations are only valid when isAttached is true");
            }
            bk0Var.wc9Ja9tFnR();
            bk0 bk0Var2 = bk0Var.Y6hRI1cF8;
            if (bk0Var2 != null) {
                bk0Var = bk0Var2;
            }
            return uk0.OOA6hdeuvCS(xqGvceK5x, bk0Var.YZjbz8VdP5(n50Var, 0L));
        }
        wb0 wb0Var2 = ((xb0) n50Var).OOA6hdeuvCS;
        bk0 bk0Var3 = wb0Var2.mE4lRynR;
        bk0Var3.wc9Ja9tFnR();
        wb0 P4U4zqyW7wx = wb0Var.mE4lRynR.oCbv4H4NsA(bk0Var3).P4U4zqyW7wx();
        if (P4U4zqyW7wx != null) {
            long Yi7zF1RB1 = u20.Yi7zF1RB1(u20.X1lG3V04pd(wb0Var2.OGdJP42E(P4U4zqyW7wx, false), qj.dqB83aoLBB(j)), wb0Var.OGdJP42E(P4U4zqyW7wx, false));
            return (Float.floatToRawIntBits((int) (Yi7zF1RB1 >> 32)) << 32) | (Float.floatToRawIntBits((int) (Yi7zF1RB1 & 4294967295L)) & 4294967295L);
        }
        wb0 jivtDDk9H2 = d70.jivtDDk9H(wb0Var2);
        long X1lG3V04pd = u20.X1lG3V04pd(u20.X1lG3V04pd(wb0Var2.OGdJP42E(jivtDDk9H2, false), jivtDDk9H2.jivtDDk9H), qj.dqB83aoLBB(j));
        wb0 jivtDDk9H3 = d70.jivtDDk9H(wb0Var);
        long Yi7zF1RB12 = u20.Yi7zF1RB1(X1lG3V04pd, u20.X1lG3V04pd(wb0Var.OGdJP42E(jivtDDk9H3, false), jivtDDk9H3.jivtDDk9H));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (Yi7zF1RB12 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (Yi7zF1RB12 & 4294967295L)) & 4294967295L;
        bk0 bk0Var4 = jivtDDk9H3.mE4lRynR.Y6hRI1cF8;
        bk0Var4.getClass();
        bk0 bk0Var5 = jivtDDk9H2.mE4lRynR.Y6hRI1cF8;
        bk0Var5.getClass();
        return bk0Var4.YZjbz8VdP5(bk0Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.n50
    public final kt0 eUH21U3apd(n50 n50Var, boolean z) {
        return this.OOA6hdeuvCS.mE4lRynR.eUH21U3apd(n50Var, z);
    }

    @Override // defpackage.n50
    public final boolean ozMwhSAI() {
        return this.OOA6hdeuvCS.mE4lRynR.iK7aQfvhG().Mjvvu5DE;
    }
}
