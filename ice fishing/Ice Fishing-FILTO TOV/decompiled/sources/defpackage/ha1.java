package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ha1 implements wd1 {
    public Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public ha1(r3 r3Var, float f, float f2) {
        this.OOA6hdeuvCS = 1;
        int Yi7zF1RB1 = r3Var.Yi7zF1RB1();
        js[] jsVarArr = new js[Yi7zF1RB1];
        for (int i = 0; i < Yi7zF1RB1; i++) {
            jsVarArr[i] = new js(f, f2, r3Var.GWasM1elztuh(i));
        }
        this.EljAMC1QTz = jsVarArr;
    }

    @Override // defpackage.td1
    public r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.EljAMC1QTz).E7jCp8Ls(j, r3Var, r3Var2, r3Var3);
    }

    @Override // defpackage.wd1, defpackage.td1
    public boolean GWasM1elztuh() {
        ((rx0) this.EljAMC1QTz).getClass();
        return false;
    }

    @Override // defpackage.td1
    public r3 WIEu4Ya2g8(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.EljAMC1QTz).WIEu4Ya2g8(r3Var, r3Var2, r3Var3);
    }

    public long X1lG3V04pd(long j) {
        uk ukVar = (uk) this.EljAMC1QTz;
        ukVar.getClass();
        if (yd1.Yi7zF1RB1(j) <= 0.0f || yd1.X1lG3V04pd(j) <= 0.0f) {
            t10.Yi7zF1RB1("maximumVelocity should be a positive value. You specified=" + ((Object) yd1.EljAMC1QTz(j)));
        }
        return n4.X1lG3V04pd(ukVar.GWasM1elztuh.Yi7zF1RB1(yd1.Yi7zF1RB1(j)), ukVar.Yi7zF1RB1.Yi7zF1RB1(yd1.X1lG3V04pd(j)));
    }

    @Override // defpackage.td1
    public long Yi7zF1RB1(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.EljAMC1QTz).Yi7zF1RB1(r3Var, r3Var2, r3Var3);
    }

    @Override // defpackage.td1
    public r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return ((rx0) this.EljAMC1QTz).iwATDS1i01k(j, r3Var, r3Var2, r3Var3);
    }

    public gs xqGvceK5x(int i) {
        switch (this.OOA6hdeuvCS) {
            case 1:
                return ((js[]) this.EljAMC1QTz)[i];
            case 2:
                return (js) this.EljAMC1QTz;
            default:
                return (gs) this.EljAMC1QTz;
        }
    }

    public ha1(int i) {
        this.OOA6hdeuvCS = i;
        switch (i) {
            case 5:
                this.EljAMC1QTz = new uk();
                break;
        }
    }

    public ha1(float f, float f2, r3 r3Var) {
        ha1 ha1Var;
        this.OOA6hdeuvCS = 4;
        int i = ud1.GWasM1elztuh;
        if (r3Var != null) {
            ha1Var = new ha1(r3Var, f, f2);
        } else {
            ha1Var = new ha1(f, f2);
        }
        this.EljAMC1QTz = new rx0(ha1Var);
    }

    public /* synthetic */ ha1(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    public ha1(float f, float f2) {
        this.OOA6hdeuvCS = 2;
        this.EljAMC1QTz = new js(f, f2, 0.01f);
    }
}
