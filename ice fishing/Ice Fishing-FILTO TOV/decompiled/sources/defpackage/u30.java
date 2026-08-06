package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u30 implements dd0, k30 {
    public final p50 EljAMC1QTz;
    public final /* synthetic */ k30 OOA6hdeuvCS;

    public u30(k30 k30Var, p50 p50Var) {
        this.OOA6hdeuvCS = k30Var;
        this.EljAMC1QTz = p50Var;
    }

    @Override // defpackage.el
    public final float AEn1Rrio(long j) {
        return this.OOA6hdeuvCS.AEn1Rrio(j);
    }

    @Override // defpackage.el
    public final long CMh55RymNfS(long j) {
        return this.OOA6hdeuvCS.CMh55RymNfS(j);
    }

    @Override // defpackage.dd0
    public final cd0 HFYAaqMd6(int i, int i2, Map map, hv hvVar, hv hvVar2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            t10.Yi7zF1RB1("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t30(i, i2, map, hvVar);
    }

    @Override // defpackage.el
    public final float K0ReC6MK(int i) {
        return this.OOA6hdeuvCS.K0ReC6MK(i);
    }

    @Override // defpackage.el
    public final float MItybXapHX(long j) {
        return this.OOA6hdeuvCS.MItybXapHX(j);
    }

    @Override // defpackage.el
    public final long Mjvvu5DE(long j) {
        return this.OOA6hdeuvCS.Mjvvu5DE(j);
    }

    @Override // defpackage.el
    public final long NyNgffpi(float f) {
        return this.OOA6hdeuvCS.NyNgffpi(f);
    }

    @Override // defpackage.k30
    public final boolean XnEVoBF0td1l() {
        return this.OOA6hdeuvCS.XnEVoBF0td1l();
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.OOA6hdeuvCS.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final long YmKjaVtbfp5Z(float f) {
        return this.OOA6hdeuvCS.YmKjaVtbfp5Z(f);
    }

    @Override // defpackage.k30
    public final p50 getLayoutDirection() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.el
    public final float jivtDDk9H(float f) {
        return this.OOA6hdeuvCS.jivtDDk9H(f);
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.OOA6hdeuvCS.mOu10nynGul();
    }

    @Override // defpackage.el
    public final float rASgSCrgZkT7(float f) {
        return this.OOA6hdeuvCS.rASgSCrgZkT7(f);
    }

    @Override // defpackage.el
    public final int rezfBrjOrqK(float f) {
        return this.OOA6hdeuvCS.rezfBrjOrqK(f);
    }
}
