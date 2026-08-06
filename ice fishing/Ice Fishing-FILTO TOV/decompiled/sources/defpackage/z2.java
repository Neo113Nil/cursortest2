package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z2 extends a60 {
    public a3 Y6hRI1cF8;
    public long cilMamHF;
    public mg0 jivtDDk9H;
    public la1 mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        long j2;
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        if (dd0Var.XnEVoBF0td1l()) {
            j2 = (OOA6hdeuvCS.OOA6hdeuvCS << 32) | (OOA6hdeuvCS.EljAMC1QTz & 4294967295L);
        } else {
            la1 la1Var = this.mE4lRynR;
            int i = OOA6hdeuvCS.OOA6hdeuvCS;
            if (la1Var == null) {
                j2 = (i << 32) | (OOA6hdeuvCS.EljAMC1QTz & 4294967295L);
                this.cilMamHF = j2;
            } else {
                long j3 = (OOA6hdeuvCS.EljAMC1QTz & 4294967295L) | (i << 32);
                ka1 GWasM1elztuh = la1Var.GWasM1elztuh(new y2(this, j3, 0), new y2(this, j3, 1));
                this.Y6hRI1cF8.getClass();
                j2 = ((b30) GWasM1elztuh.getValue()).GWasM1elztuh;
                this.cilMamHF = ((b30) GWasM1elztuh.getValue()).GWasM1elztuh;
            }
        }
        return dd0Var.MjxSquD6Av((int) (j2 >> 32), (int) (4294967295L & j2), yp.OOA6hdeuvCS, new x2(this, OOA6hdeuvCS, j2));
    }

    @Override // defpackage.he0
    public final void gHe2tSmr6w() {
        this.cilMamHF = -9223372034707292160L;
    }
}
