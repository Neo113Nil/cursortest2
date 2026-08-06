package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class d80 implements hv {
    public final /* synthetic */ g80 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ d80(g80 g80Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = g80Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        g80 g80Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                k80 k80Var = (k80) g80Var.mE4lRynR.GWasM1elztuh();
                int X1lG3V04pd = k80Var.X1lG3V04pd();
                int i2 = 0;
                while (true) {
                    if (i2 >= X1lG3V04pd) {
                        i2 = -1;
                    } else if (!k80Var.xqGvceK5x(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                k80 k80Var2 = (k80) g80Var.mE4lRynR.GWasM1elztuh();
                if (intValue < 0 || intValue >= k80Var2.X1lG3V04pd()) {
                    StringBuilder rQPn8YBR = mr0.rQPn8YBR("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    rQPn8YBR.append(k80Var2.X1lG3V04pd());
                    rQPn8YBR.append(')');
                    w10.GWasM1elztuh(rQPn8YBR.toString());
                }
                fb1.MZhzXH72(g80Var.oFzb77RX3H8t(), null, new f80(g80Var, intValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
