package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u6 extends he0 implements w50, b01 {
    public hv mE4lRynR;

    @Override // defpackage.b01
    public final boolean AvO7iQsrTN() {
        return false;
    }

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new w1(3, OOA6hdeuvCS, this));
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
        z11 z11Var;
        boolean z;
        bk0 AEn1Rrio = vc0.AEn1Rrio(this, 2);
        if (AEn1Rrio.MZhzXH72) {
            z11Var = AEn1Rrio.eUH21U3apd;
            z = AEn1Rrio.A1EKNP6CxJ;
        } else {
            yu0 yu0Var = vc0.OOA6hdeuvCS;
            if (yu0Var == null) {
                vc0.OOA6hdeuvCS = new yu0();
            } else {
                yu0Var.GWasM1elztuh();
            }
            yu0 yu0Var2 = vc0.OOA6hdeuvCS;
            yu0Var2.getClass();
            yu0Var2.YmKjaVtbfp5Z = AEn1Rrio.mE4lRynR.M3K9sHhK;
            yu0Var2.WIEu4Ya2g8 = o30.CMh55RymNfS(AEn1Rrio.AvO7iQsrTN);
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            try {
                this.mE4lRynR.mOu10nynGul(yu0Var2);
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                z11Var = yu0Var2.uFEq9NpZ;
                z = yu0Var2.iwATDS1i01k;
            } catch (Throwable th) {
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                throw th;
            }
        }
        if (z) {
            j01.Yi7zF1RB1(l01Var, z11Var);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.mE4lRynR + ')';
    }
}
