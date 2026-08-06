package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f50 implements af1 {
    public final va GWasM1elztuh;
    public final px0 Yi7zF1RB1;

    public f50(va vaVar, px0 px0Var) {
        this.GWasM1elztuh = vaVar;
        this.Yi7zF1RB1 = px0Var;
    }

    @Override // defpackage.af1
    public final we1 X1lG3V04pd(va vaVar, of0 of0Var) {
        g1 g1Var = new g1(of0Var);
        v5 v5Var = this.Yi7zF1RB1.OOA6hdeuvCS;
        j00 j00Var = (j00) v5Var.OOA6hdeuvCS;
        j00Var.getClass();
        Object obj = j00Var.GWasM1elztuh.get(e50.OOA6hdeuvCS);
        if (obj == null) {
            obj = null;
        }
        if (!o30.rQPn8YBR(obj, Boolean.TRUE)) {
            return (we1) this.Yi7zF1RB1.xqGvceK5x(this.GWasM1elztuh, g1Var);
        }
        String str = vaVar.Yi7zF1RB1() + '-' + fb1.arNh8D4Z5gB();
        hb1 hb1Var = new hb1(vaVar);
        hb1 hb1Var2 = cf1.GWasM1elztuh;
        rx0 rx0Var = (rx0) v5Var.X1lG3V04pd;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rx0Var.AvO7iQsrTN;
        v5 v5Var2 = (v5) rx0Var.OOA6hdeuvCS;
        w60 w60Var = (w60) v5Var2.GWasM1elztuh;
        w60Var.getClass();
        g90 g90Var = g90.OOA6hdeuvCS;
        w60Var.Mjvvu5DE(g90Var, "| (+) Scope - id:'" + str + "' q:'" + hb1Var + '\'');
        Set set = (Set) rx0Var.EljAMC1QTz;
        if (!set.contains(hb1Var)) {
            w60 w60Var2 = (w60) v5Var2.GWasM1elztuh;
            w60Var2.getClass();
            w60Var2.Mjvvu5DE(g90Var, "| Scope '" + hb1Var + "' not defined. Creating it ...");
            set.add(hb1Var);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new vk("Scope with id '" + str + "' is already created");
        }
        px0 px0Var = new px0(hb1Var, str, hb1Var2, (v5) rx0Var.OOA6hdeuvCS, 4);
        px0[] px0VarArr = {(px0) rx0Var.encWxUiV2};
        if (px0Var.X1lG3V04pd) {
            o4.jivtDDk9H("Can't add scope link to a root scope");
            return null;
        }
        px0Var.EljAMC1QTz.addAll(0, d5.nXl1EmE5(px0VarArr));
        concurrentHashMap.put(str, px0Var);
        px0 px0Var2 = this.Yi7zF1RB1;
        if (!px0Var2.X1lG3V04pd) {
            px0[] px0VarArr2 = {px0Var2};
            if (px0Var.X1lG3V04pd) {
                o4.jivtDDk9H("Can't add scope link to a root scope");
                return null;
            }
            px0Var.EljAMC1QTz.addAll(0, d5.nXl1EmE5(px0VarArr2));
        }
        we1 we1Var = (we1) px0Var.xqGvceK5x(this.GWasM1elztuh, g1Var);
        df1 df1Var = new df1(str, v5Var);
        xe1 xe1Var = we1Var.GWasM1elztuh;
        if (xe1Var == null) {
            return we1Var;
        }
        if (xe1Var.xqGvceK5x) {
            xe1.GWasM1elztuh(df1Var);
            return we1Var;
        }
        synchronized (xe1Var.GWasM1elztuh) {
            xe1Var.X1lG3V04pd.add(df1Var);
        }
        return we1Var;
    }
}
