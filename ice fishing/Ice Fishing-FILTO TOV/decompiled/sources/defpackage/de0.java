package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class de0 extends he0 implements ef, w50 {
    public LinkedHashMap mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        float f = ((cn) o30.Mjvvu5DE(this, g30.X1lG3V04pd)).OOA6hdeuvCS;
        if (f < 0.0f) {
            f = 0.0f;
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        boolean z = this.Mjvvu5DE && !Float.isNaN(f) && cn.GWasM1elztuh(f, 0.0f) > 0;
        int rezfBrjOrqK = !Float.isNaN(f) ? dd0Var.rezfBrjOrqK(f) : 0;
        int i = OOA6hdeuvCS.OOA6hdeuvCS;
        if (z) {
            i = Math.max(i, rezfBrjOrqK);
        }
        int i2 = OOA6hdeuvCS.EljAMC1QTz;
        if (z) {
            i2 = Math.max(i2, rezfBrjOrqK);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.mE4lRynR;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.mE4lRynR = linkedHashMap;
            }
            fe1 fe1Var = g30.Yi7zF1RB1;
            int round = Math.round((rezfBrjOrqK - OOA6hdeuvCS.OOA6hdeuvCS) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(fe1Var, Integer.valueOf(round));
            qz qzVar = g30.GWasM1elztuh;
            int round2 = Math.round((rezfBrjOrqK - OOA6hdeuvCS.EljAMC1QTz) / 2.0f);
            linkedHashMap.put(qzVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.mE4lRynR;
        if (map == null) {
            map = yp.OOA6hdeuvCS;
        }
        return dd0Var.MjxSquD6Av(i, i2, map, new j20(i, OOA6hdeuvCS, i2));
    }
}
