package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class kk0 {
    public final wy0 GWasM1elztuh;
    public final d OOA6hdeuvCS = new d(4);
    public el X1lG3V04pd;
    public final lv Yi7zF1RB1;
    public boolean xqGvceK5x;

    public kk0(wy0 wy0Var, lv lvVar, el elVar) {
        this.GWasM1elztuh = wy0Var;
        this.Yi7zF1RB1 = lvVar;
        this.X1lG3V04pd = elVar;
    }

    public static void GWasM1elztuh(gq0 gq0Var) {
        List list = gq0Var.GWasM1elztuh;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kq0) list.get(i)).GWasM1elztuh();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Yi7zF1RB1(lv lvVar, wg wgVar) {
        jk0 jk0Var;
        int i;
        if (wgVar instanceof jk0) {
            jk0Var = (jk0) wgVar;
            int i2 = jk0Var.JFJ3QoxA;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jk0Var.JFJ3QoxA = i2 - Integer.MIN_VALUE;
                Object obj = jk0Var.encWxUiV2;
                i = jk0Var.JFJ3QoxA;
                vg vgVar = null;
                if (i != 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.xqGvceK5x = true;
                    xqGvceK5x xqgvcek5x = new xqGvceK5x(this, lvVar, vgVar, 17);
                    jk0Var.JFJ3QoxA = 1;
                    gh ghVar = jk0Var.EljAMC1QTz;
                    ghVar.getClass();
                    t61 t61Var = new t61(jk0Var, ghVar);
                    Object k8h8IjolWQ = z50.k8h8IjolWQ(t61Var, t61Var, xqgvcek5x);
                    qh qhVar = qh.OOA6hdeuvCS;
                    if (k8h8IjolWQ == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                this.xqGvceK5x = false;
                return kc1.GWasM1elztuh;
            }
        }
        jk0Var = new jk0(this, wgVar);
        Object obj2 = jk0Var.encWxUiV2;
        i = jk0Var.JFJ3QoxA;
        vg vgVar2 = null;
        if (i != 0) {
        }
        this.xqGvceK5x = false;
        return kc1.GWasM1elztuh;
    }
}
