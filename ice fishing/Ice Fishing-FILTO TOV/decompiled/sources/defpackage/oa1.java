package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oa1 implements m51 {
    public final fo0 AvO7iQsrTN;
    public final bo0 E7jCp8Ls;
    public final fo0 EljAMC1QTz;
    public t71 JFJ3QoxA;
    public final c51 Mjvvu5DE;
    public final eb1 OOA6hdeuvCS;
    public final do0 WIEu4Ya2g8;
    public boolean XnEVoBF0td1l;
    public boolean YmKjaVtbfp5Z;
    public final fo0 encWxUiV2;
    public r3 iwATDS1i01k;
    public final /* synthetic */ qa1 mE4lRynR;
    public oz0 mOu10nynGul;
    public final fo0 rQPn8YBR;
    public final fo0 uFEq9NpZ;

    public oa1(qa1 qa1Var, Object obj, r3 r3Var, eb1 eb1Var) {
        this.mE4lRynR = qa1Var;
        this.OOA6hdeuvCS = eb1Var;
        fo0 WRKkgoJXwDn = z50.WRKkgoJXwDn(obj);
        this.EljAMC1QTz = WRKkgoJXwDn;
        Object obj2 = null;
        this.AvO7iQsrTN = z50.WRKkgoJXwDn(fb1.J3Xc8BaqpN8(0.0f, 0.0f, null, 7));
        this.encWxUiV2 = z50.WRKkgoJXwDn(new t71(Yi7zF1RB1(), eb1Var, obj, WRKkgoJXwDn.getValue(), r3Var));
        this.rQPn8YBR = z50.WRKkgoJXwDn(Boolean.TRUE);
        this.E7jCp8Ls = new bo0(-1.0f);
        this.uFEq9NpZ = z50.WRKkgoJXwDn(obj);
        this.iwATDS1i01k = r3Var;
        this.WIEu4Ya2g8 = new do0(GWasM1elztuh().X1lG3V04pd());
        Float f = (Float) hf1.GWasM1elztuh.get(eb1Var);
        if (f != null) {
            float floatValue = f.floatValue();
            r3 r3Var2 = (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj);
            int Yi7zF1RB1 = r3Var2.Yi7zF1RB1();
            for (int i = 0; i < Yi7zF1RB1; i++) {
                r3Var2.OOA6hdeuvCS(floatValue, i);
            }
            obj2 = this.OOA6hdeuvCS.Yi7zF1RB1.mOu10nynGul(r3Var2);
        }
        this.Mjvvu5DE = fb1.J3Xc8BaqpN8(0.0f, 0.0f, obj2, 3);
    }

    public final void AvO7iQsrTN(Object obj, Object obj2, xr xrVar) {
        this.EljAMC1QTz.setValue(obj2);
        this.AvO7iQsrTN.setValue(xrVar);
        if (o30.rQPn8YBR(GWasM1elztuh().xqGvceK5x, obj) && o30.rQPn8YBR(GWasM1elztuh().X1lG3V04pd, obj2)) {
            return;
        }
        EljAMC1QTz(obj, false);
    }

    public final void EljAMC1QTz(Object obj, boolean z) {
        t71 t71Var = this.JFJ3QoxA;
        Object obj2 = t71Var != null ? t71Var.X1lG3V04pd : null;
        fo0 fo0Var = this.EljAMC1QTz;
        boolean rQPn8YBR = o30.rQPn8YBR(obj2, fo0Var.getValue());
        do0 do0Var = this.WIEu4Ya2g8;
        fo0 fo0Var2 = this.encWxUiV2;
        eb1 eb1Var = this.OOA6hdeuvCS;
        if (rQPn8YBR) {
            fo0Var2.setValue(new t71(this.Mjvvu5DE, eb1Var, obj, obj, this.iwATDS1i01k.X1lG3V04pd()));
            this.XnEVoBF0td1l = true;
            do0Var.encWxUiV2(GWasM1elztuh().X1lG3V04pd());
            return;
        }
        xr Yi7zF1RB1 = (!z || this.YmKjaVtbfp5Z) ? Yi7zF1RB1() : Yi7zF1RB1() instanceof c51 ? Yi7zF1RB1() : this.Mjvvu5DE;
        qa1 qa1Var = this.mE4lRynR;
        long OOA6hdeuvCS = qa1Var.OOA6hdeuvCS();
        fo0 fo0Var3 = qa1Var.encWxUiV2;
        fo0Var2.setValue(new t71(OOA6hdeuvCS <= 0 ? Yi7zF1RB1 : new h51(Yi7zF1RB1, qa1Var.OOA6hdeuvCS()), eb1Var, obj, fo0Var.getValue(), this.iwATDS1i01k));
        do0Var.encWxUiV2(GWasM1elztuh().X1lG3V04pd());
        this.XnEVoBF0td1l = false;
        fo0Var3.setValue(Boolean.TRUE);
        if (qa1Var.AvO7iQsrTN()) {
            p41 p41Var = qa1Var.mOu10nynGul;
            int size = p41Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                oa1 oa1Var = (oa1) p41Var.get(i);
                j = Math.max(j, oa1Var.WIEu4Ya2g8.AvO7iQsrTN());
                oa1Var.X1lG3V04pd(0L);
            }
            fo0Var3.setValue(Boolean.FALSE);
        }
    }

    public final t71 GWasM1elztuh() {
        return (t71) this.encWxUiV2.getValue();
    }

    public final void OOA6hdeuvCS(Object obj) {
        this.uFEq9NpZ.setValue(obj);
    }

    public final void X1lG3V04pd(long j) {
        if (this.E7jCp8Ls.AvO7iQsrTN() == -1.0f) {
            this.YmKjaVtbfp5Z = true;
            if (o30.rQPn8YBR(GWasM1elztuh().X1lG3V04pd, GWasM1elztuh().xqGvceK5x)) {
                OOA6hdeuvCS(GWasM1elztuh().X1lG3V04pd);
            } else {
                OOA6hdeuvCS(GWasM1elztuh().Yi7zF1RB1(j));
                this.iwATDS1i01k = GWasM1elztuh().EljAMC1QTz(j);
            }
        }
    }

    public final xr Yi7zF1RB1() {
        return (xr) this.AvO7iQsrTN.getValue();
    }

    @Override // defpackage.m51
    public final Object getValue() {
        return this.uFEq9NpZ.getValue();
    }

    public final String toString() {
        return "current value: " + this.uFEq9NpZ.getValue() + ", target: " + this.EljAMC1QTz.getValue() + ", spec: " + Yi7zF1RB1();
    }
}
