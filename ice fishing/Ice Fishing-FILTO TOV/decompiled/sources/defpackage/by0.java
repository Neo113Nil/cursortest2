package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class by0 implements py0 {
    public static final d JFJ3QoxA = new d(19, new ix0(1, 0), new dx0(19));
    public float EljAMC1QTz;
    public final co0 GWasM1elztuh;
    public final ml encWxUiV2;
    public final ml mOu10nynGul;
    public final co0 Yi7zF1RB1 = new co0(0);
    public final co0 X1lG3V04pd = new co0(0);
    public final tf0 xqGvceK5x = new tf0();
    public final co0 OOA6hdeuvCS = new co0(Integer.MAX_VALUE);
    public final rk AvO7iQsrTN = new rk(new E7jCp8Ls(16, this));

    public by0(int i) {
        this.GWasM1elztuh = new co0(i);
        final int i2 = 0;
        this.encWxUiV2 = z50.iwATDS1i01k(new wu(this) { // from class: ay0
            public final /* synthetic */ by0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i3 = i2;
                by0 by0Var = this.EljAMC1QTz;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(by0Var.GWasM1elztuh.AvO7iQsrTN() < by0Var.OOA6hdeuvCS.AvO7iQsrTN());
                    default:
                        return Boolean.valueOf(by0Var.GWasM1elztuh.AvO7iQsrTN() > 0);
                }
            }
        });
        final int i3 = 1;
        this.mOu10nynGul = z50.iwATDS1i01k(new wu(this) { // from class: ay0
            public final /* synthetic */ by0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                int i32 = i3;
                by0 by0Var = this.EljAMC1QTz;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(by0Var.GWasM1elztuh.AvO7iQsrTN() < by0Var.OOA6hdeuvCS.AvO7iQsrTN());
                    default:
                        return Boolean.valueOf(by0Var.GWasM1elztuh.AvO7iQsrTN() > 0);
                }
            }
        });
    }

    @Override // defpackage.py0
    public final boolean GWasM1elztuh() {
        return ((Boolean) this.mOu10nynGul.getValue()).booleanValue();
    }

    @Override // defpackage.py0
    public final float OOA6hdeuvCS(float f) {
        return this.AvO7iQsrTN.OOA6hdeuvCS(f);
    }

    @Override // defpackage.py0
    public final boolean X1lG3V04pd() {
        return ((Boolean) this.encWxUiV2.getValue()).booleanValue();
    }

    @Override // defpackage.py0
    public final boolean Yi7zF1RB1() {
        return this.AvO7iQsrTN.Yi7zF1RB1();
    }

    @Override // defpackage.py0
    public final Object xqGvceK5x(tg0 tg0Var, lv lvVar, wg wgVar) {
        Object xqGvceK5x = this.AvO7iQsrTN.xqGvceK5x(tg0Var, lvVar, wgVar);
        return xqGvceK5x == qh.OOA6hdeuvCS ? xqGvceK5x : kc1.GWasM1elztuh;
    }
}
