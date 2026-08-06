package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t71 implements h3 {
    public final r3 AvO7iQsrTN;
    public r3 EljAMC1QTz;
    public final td1 GWasM1elztuh;
    public r3 OOA6hdeuvCS;
    public Object X1lG3V04pd;
    public final eb1 Yi7zF1RB1;
    public long encWxUiV2;
    public r3 mOu10nynGul;
    public Object xqGvceK5x;

    public t71(l3 l3Var, eb1 eb1Var, Object obj, Object obj2, r3 r3Var) {
        this.GWasM1elztuh = l3Var.GWasM1elztuh(eb1Var);
        this.Yi7zF1RB1 = eb1Var;
        this.X1lG3V04pd = obj2;
        this.xqGvceK5x = obj;
        this.OOA6hdeuvCS = (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj);
        hv hvVar = eb1Var.GWasM1elztuh;
        this.EljAMC1QTz = (r3) hvVar.mOu10nynGul(obj2);
        this.AvO7iQsrTN = r3Var != null ? p.mOu10nynGul(r3Var) : ((r3) hvVar.mOu10nynGul(obj)).X1lG3V04pd();
        this.encWxUiV2 = -1L;
    }

    @Override // defpackage.h3
    public final r3 EljAMC1QTz(long j) {
        if (!AvO7iQsrTN(j)) {
            return this.GWasM1elztuh.E7jCp8Ls(j, this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
        }
        r3 r3Var = this.mOu10nynGul;
        if (r3Var != null) {
            return r3Var;
        }
        r3 WIEu4Ya2g8 = this.GWasM1elztuh.WIEu4Ya2g8(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
        this.mOu10nynGul = WIEu4Ya2g8;
        return WIEu4Ya2g8;
    }

    @Override // defpackage.h3
    public final boolean GWasM1elztuh() {
        return this.GWasM1elztuh.GWasM1elztuh();
    }

    @Override // defpackage.h3
    public final Object OOA6hdeuvCS() {
        return this.X1lG3V04pd;
    }

    @Override // defpackage.h3
    public final long X1lG3V04pd() {
        if (this.encWxUiV2 < 0) {
            this.encWxUiV2 = this.GWasM1elztuh.Yi7zF1RB1(this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
        }
        return this.encWxUiV2;
    }

    @Override // defpackage.h3
    public final Object Yi7zF1RB1(long j) {
        if (AvO7iQsrTN(j)) {
            return this.X1lG3V04pd;
        }
        r3 iwATDS1i01k = this.GWasM1elztuh.iwATDS1i01k(j, this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN);
        int Yi7zF1RB1 = iwATDS1i01k.Yi7zF1RB1();
        for (int i = 0; i < Yi7zF1RB1; i++) {
            if (Float.isNaN(iwATDS1i01k.GWasM1elztuh(i))) {
                vq0.Yi7zF1RB1("AnimationVector cannot contain a NaN. " + iwATDS1i01k + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.Yi7zF1RB1.Yi7zF1RB1.mOu10nynGul(iwATDS1i01k);
    }

    public final void encWxUiV2(Object obj) {
        if (o30.rQPn8YBR(obj, this.xqGvceK5x)) {
            return;
        }
        this.xqGvceK5x = obj;
        this.OOA6hdeuvCS = (r3) this.Yi7zF1RB1.GWasM1elztuh.mOu10nynGul(obj);
        this.mOu10nynGul = null;
        this.encWxUiV2 = -1L;
    }

    public final void mOu10nynGul(Object obj) {
        if (o30.rQPn8YBR(this.X1lG3V04pd, obj)) {
            return;
        }
        this.X1lG3V04pd = obj;
        this.EljAMC1QTz = (r3) this.Yi7zF1RB1.GWasM1elztuh.mOu10nynGul(obj);
        this.mOu10nynGul = null;
        this.encWxUiV2 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.xqGvceK5x + " -> " + this.X1lG3V04pd + ",initial velocity: " + this.AvO7iQsrTN + ", duration: " + (X1lG3V04pd() / 1000000) + " ms,animationSpec: " + this.GWasM1elztuh;
    }

    @Override // defpackage.h3
    public final eb1 xqGvceK5x() {
        return this.Yi7zF1RB1;
    }
}
