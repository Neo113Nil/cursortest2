package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vk0 implements m4, vd1 {
    public final Object AvO7iQsrTN;
    public int EljAMC1QTz;
    public final int OOA6hdeuvCS;

    public vk0(int i, int i2, oo ooVar) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = new rx0((gs) new ks(i, i2, ooVar));
    }

    @Override // defpackage.td1
    public r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.AvO7iQsrTN).E7jCp8Ls(j, r3Var, r3Var2, r3Var3);
    }

    @Override // defpackage.m4
    public void EljAMC1QTz(int i, Object obj) {
        ((m4) this.AvO7iQsrTN).EljAMC1QTz(i + (this.EljAMC1QTz == 0 ? this.OOA6hdeuvCS : 0), obj);
    }

    @Override // defpackage.m4
    public void JFJ3QoxA(int i, int i2) {
        ((m4) this.AvO7iQsrTN).JFJ3QoxA(i + (this.EljAMC1QTz == 0 ? this.OOA6hdeuvCS : 0), i2);
    }

    @Override // defpackage.m4
    public void OOA6hdeuvCS() {
        ((m4) this.AvO7iQsrTN).OOA6hdeuvCS();
    }

    @Override // defpackage.m4
    public void X1lG3V04pd(int i, Object obj) {
        ((m4) this.AvO7iQsrTN).X1lG3V04pd(i + (this.EljAMC1QTz == 0 ? this.OOA6hdeuvCS : 0), obj);
    }

    @Override // defpackage.m4
    public void XnEVoBF0td1l(lv lvVar, Object obj) {
        ((m4) this.AvO7iQsrTN).XnEVoBF0td1l(lvVar, obj);
    }

    @Override // defpackage.m4
    public void YmKjaVtbfp5Z() {
        if (this.EljAMC1QTz <= 0) {
            we.GWasM1elztuh("OffsetApplier up called with no corresponding down");
        }
        this.EljAMC1QTz--;
        ((m4) this.AvO7iQsrTN).YmKjaVtbfp5Z();
    }

    @Override // defpackage.m4
    public void encWxUiV2(int i, int i2, int i3) {
        int i4 = this.EljAMC1QTz == 0 ? this.OOA6hdeuvCS : 0;
        ((m4) this.AvO7iQsrTN).encWxUiV2(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.td1
    public r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.AvO7iQsrTN).iwATDS1i01k(j, r3Var, r3Var2, r3Var3);
    }

    @Override // defpackage.m4
    public Object mOu10nynGul() {
        return ((m4) this.AvO7iQsrTN).mOu10nynGul();
    }

    @Override // defpackage.vd1
    public int rQPn8YBR() {
        return this.EljAMC1QTz;
    }

    @Override // defpackage.vd1
    public int uFEq9NpZ() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.m4
    public void xqGvceK5x(Object obj) {
        this.EljAMC1QTz++;
        ((m4) this.AvO7iQsrTN).xqGvceK5x(obj);
    }

    public vk0(m4 m4Var, int i) {
        this.AvO7iQsrTN = m4Var;
        this.OOA6hdeuvCS = i;
    }
}
