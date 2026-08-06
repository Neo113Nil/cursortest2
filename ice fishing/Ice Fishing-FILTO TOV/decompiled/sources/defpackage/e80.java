package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class e80 implements wu {
    public final /* synthetic */ g80 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ e80(g80 g80Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = g80Var;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        g80 g80Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                u80 u80Var = g80Var.jivtDDk9H.Yi7zF1RB1;
                return Float.valueOf((((co0) u80Var.OOA6hdeuvCS.Yi7zF1RB1).AvO7iQsrTN() * 500) + ((co0) u80Var.OOA6hdeuvCS.X1lG3V04pd).AvO7iQsrTN());
            case 1:
                u80 u80Var2 = g80Var.jivtDDk9H.Yi7zF1RB1;
                int AvO7iQsrTN = ((co0) u80Var2.OOA6hdeuvCS.Yi7zF1RB1).AvO7iQsrTN();
                int AvO7iQsrTN2 = ((co0) u80Var2.OOA6hdeuvCS.X1lG3V04pd).AvO7iQsrTN();
                return Float.valueOf(u80Var2.X1lG3V04pd() ? (AvO7iQsrTN * 500) + AvO7iQsrTN2 + 100.0f : (AvO7iQsrTN * 500) + AvO7iQsrTN2);
            default:
                u80 u80Var3 = g80Var.jivtDDk9H.Yi7zF1RB1;
                int AvO7iQsrTN3 = (int) (u80Var3.AvO7iQsrTN().iwATDS1i01k == xm0.OOA6hdeuvCS ? u80Var3.AvO7iQsrTN().AvO7iQsrTN() & 4294967295L : u80Var3.AvO7iQsrTN().AvO7iQsrTN() >> 32);
                u80 u80Var4 = g80Var.jivtDDk9H.Yi7zF1RB1;
                return Float.valueOf(AvO7iQsrTN3 - ((-u80Var4.AvO7iQsrTN().E7jCp8Ls) + u80Var4.AvO7iQsrTN().WIEu4Ya2g8));
        }
    }
}
