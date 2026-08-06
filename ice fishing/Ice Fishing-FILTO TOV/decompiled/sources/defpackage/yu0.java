package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yu0 implements el {
    public float E7jCp8Ls;
    public long JFJ3QoxA;
    public p50 Mjvvu5DE;
    public int OOA6hdeuvCS;
    public long WIEu4Ya2g8;
    public long XnEVoBF0td1l;
    public el YmKjaVtbfp5Z;
    public boolean iwATDS1i01k;
    public z50 jivtDDk9H;
    public int mE4lRynR;
    public float mOu10nynGul;
    public long rQPn8YBR;
    public z11 uFEq9NpZ;
    public float EljAMC1QTz = 1.0f;
    public float AvO7iQsrTN = 1.0f;
    public float encWxUiV2 = 1.0f;

    public yu0() {
        long j = sy.GWasM1elztuh;
        this.JFJ3QoxA = j;
        this.rQPn8YBR = j;
        this.E7jCp8Ls = 8.0f;
        this.XnEVoBF0td1l = ga1.Yi7zF1RB1;
        this.uFEq9NpZ = vc0.EljAMC1QTz;
        this.WIEu4Ya2g8 = 9205357640488583168L;
        this.YmKjaVtbfp5Z = rj0.Yi7zF1RB1();
        this.Mjvvu5DE = p50.OOA6hdeuvCS;
        this.mE4lRynR = 3;
    }

    public final void AvO7iQsrTN(long j) {
        if (ga1.GWasM1elztuh(this.XnEVoBF0td1l, j)) {
            return;
        }
        this.OOA6hdeuvCS |= 4096;
        this.XnEVoBF0td1l = j;
    }

    public final void EljAMC1QTz(float f) {
        if (this.AvO7iQsrTN == f) {
            return;
        }
        this.OOA6hdeuvCS |= 2;
        this.AvO7iQsrTN = f;
    }

    public final void GWasM1elztuh() {
        OOA6hdeuvCS(1.0f);
        EljAMC1QTz(1.0f);
        X1lG3V04pd(1.0f);
        if (this.mOu10nynGul != 0.0f) {
            this.OOA6hdeuvCS |= 32;
            this.mOu10nynGul = 0.0f;
        }
        long j = sy.GWasM1elztuh;
        if (!yb.X1lG3V04pd(this.JFJ3QoxA, j)) {
            this.OOA6hdeuvCS |= 64;
            this.JFJ3QoxA = j;
        }
        if (!yb.X1lG3V04pd(this.rQPn8YBR, j)) {
            this.OOA6hdeuvCS |= 128;
            this.rQPn8YBR = j;
        }
        if (this.E7jCp8Ls != 8.0f) {
            this.OOA6hdeuvCS |= 2048;
            this.E7jCp8Ls = 8.0f;
        }
        AvO7iQsrTN(ga1.Yi7zF1RB1);
        tz tzVar = vc0.EljAMC1QTz;
        if (!o30.rQPn8YBR(this.uFEq9NpZ, tzVar)) {
            this.OOA6hdeuvCS |= 8192;
            this.uFEq9NpZ = tzVar;
        }
        if (this.iwATDS1i01k) {
            this.OOA6hdeuvCS |= 16384;
            this.iwATDS1i01k = false;
        }
        if (this.mE4lRynR != 3) {
            this.OOA6hdeuvCS |= 524288;
            this.mE4lRynR = 3;
        }
        this.WIEu4Ya2g8 = 9205357640488583168L;
        this.jivtDDk9H = null;
        this.OOA6hdeuvCS = 0;
    }

    public final void OOA6hdeuvCS(float f) {
        if (this.EljAMC1QTz == f) {
            return;
        }
        this.OOA6hdeuvCS |= 1;
        this.EljAMC1QTz = f;
    }

    public final void X1lG3V04pd(float f) {
        if (this.encWxUiV2 == f) {
            return;
        }
        this.OOA6hdeuvCS |= 4;
        this.encWxUiV2 = f;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.YmKjaVtbfp5Z.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.YmKjaVtbfp5Z.mOu10nynGul();
    }
}
