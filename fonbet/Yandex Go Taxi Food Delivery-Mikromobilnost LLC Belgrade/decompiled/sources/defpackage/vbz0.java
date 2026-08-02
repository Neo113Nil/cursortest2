package defpackage;

import java.util.TimeZone;

/* loaded from: classes11.dex */
public class vbz0 extends wbz0 {
    public final double z;

    public vbz0(double d) {
        this.z = d;
    }

    @Override // defpackage.wbz0
    public final boolean m(w3c w3cVar, wbz0 wbz0Var) {
        return wbz0Var.n(this);
    }

    @Override // defpackage.wbz0
    public final boolean n(vbz0 vbz0Var) {
        double d = vbz0Var.z;
        TimeZone timeZone = TimeZone.getDefault();
        double dSTSavings = (timeZone.getDSTSavings() + timeZone.getRawOffset()) / 1000;
        return ((int) ((Math.round(this.z + dSTSavings) / 86400) - (Math.round(d + dSTSavings) / 86400))) != 0;
    }

    @Override // defpackage.wbz0
    public final double q() {
        return this.z;
    }
}
