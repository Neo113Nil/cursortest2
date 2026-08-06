package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kp0 extends rezfBrjOrqK {
    public final dp0 EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ kp0(dp0 dp0Var, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = dp0Var;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        dp0 dp0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                dp0Var.getClass();
                break;
            default:
                dp0Var.getClass();
                break;
        }
        return dp0Var.EljAMC1QTz;
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.OOA6hdeuvCS;
        dp0 dp0Var = this.EljAMC1QTz;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = dp0Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && dp0Var.containsKey(entry.getKey());
            default:
                return dp0Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                za1 za1Var = this.EljAMC1QTz.OOA6hdeuvCS;
                ab1[] ab1VarArr = new ab1[8];
                for (int i = 0; i < 8; i++) {
                    ab1VarArr[i] = new bb1(0);
                }
                return new lp0(za1Var, ab1VarArr);
            default:
                za1 za1Var2 = this.EljAMC1QTz.OOA6hdeuvCS;
                ab1[] ab1VarArr2 = new ab1[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    ab1VarArr2[i2] = new bb1(1);
                }
                return new lp0(za1Var2, ab1VarArr2);
        }
    }
}
