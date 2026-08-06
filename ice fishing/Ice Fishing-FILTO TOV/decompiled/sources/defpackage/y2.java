package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y2 extends h50 implements hv {
    public final /* synthetic */ z2 AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ long encWxUiV2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(z2 z2Var, long j, int i) {
        super(1);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = z2Var;
        this.encWxUiV2 = j;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        xr xrVar;
        int i = this.EljAMC1QTz;
        long j = this.encWxUiV2;
        z2 z2Var = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                ma1 ma1Var = (ma1) obj;
                if (!o30.rQPn8YBR(ma1Var.Yi7zF1RB1(), z2Var.Y6hRI1cF8.Yi7zF1RB1())) {
                    m51 m51Var = (m51) z2Var.Y6hRI1cF8.xqGvceK5x.AvO7iQsrTN(ma1Var.Yi7zF1RB1());
                    j = m51Var != null ? ((b30) m51Var.getValue()).GWasM1elztuh : 0L;
                } else if (!b30.GWasM1elztuh(z2Var.cilMamHF, -9223372034707292160L)) {
                    j = z2Var.cilMamHF;
                }
                m51 m51Var2 = (m51) z2Var.Y6hRI1cF8.xqGvceK5x.AvO7iQsrTN(ma1Var.X1lG3V04pd());
                r1 = m51Var2 != null ? ((b30) m51Var2.getValue()).GWasM1elztuh : 0L;
                x21 x21Var = (x21) z2Var.jivtDDk9H.getValue();
                return (x21Var == null || (xrVar = (xr) x21Var.GWasM1elztuh.EljAMC1QTz(new b30(j), new b30(r1))) == null) ? fb1.J3Xc8BaqpN8(0.0f, 400.0f, null, 5) : xrVar;
            default:
                if (o30.rQPn8YBR(obj, z2Var.Y6hRI1cF8.Yi7zF1RB1())) {
                    r1 = b30.GWasM1elztuh(z2Var.cilMamHF, -9223372034707292160L) ? j : z2Var.cilMamHF;
                } else {
                    m51 m51Var3 = (m51) z2Var.Y6hRI1cF8.xqGvceK5x.AvO7iQsrTN(obj);
                    if (m51Var3 != null) {
                        r1 = ((b30) m51Var3.getValue()).GWasM1elztuh;
                    }
                }
                return new b30(r1);
        }
    }
}
