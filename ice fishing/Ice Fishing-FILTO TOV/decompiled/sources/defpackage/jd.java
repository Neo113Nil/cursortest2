package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jd implements lv, mv, nv, ov, pv, qv, rv, sv, xu, yu, av, bv, cv, dv, ev, fv, gv, iv, jv {
    public tv AvO7iQsrTN;
    public final boolean EljAMC1QTz;
    public final int OOA6hdeuvCS;
    public at0 encWxUiV2;
    public ArrayList mOu10nynGul;

    public jd(int i, boolean z, tv tvVar) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = z;
        this.AvO7iQsrTN = tvVar;
    }

    public final Object AvO7iQsrTN(Object obj, Object obj2, qx qxVar, int i) {
        qxVar.Uxq83abb04(this.OOA6hdeuvCS);
        JFJ3QoxA(qxVar);
        int XnEVoBF0td1l = qxVar.EljAMC1QTz(this) ? rj0.XnEVoBF0td1l(2, 2) : rj0.XnEVoBF0td1l(1, 2);
        tv tvVar = this.AvO7iQsrTN;
        fb1.XnEVoBF0td1l(4, tvVar);
        Object XnEVoBF0td1l2 = ((nv) tvVar).XnEVoBF0td1l(obj, obj2, qxVar, Integer.valueOf(XnEVoBF0td1l | i));
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(this, obj, obj2, i);
        }
        return XnEVoBF0td1l2;
    }

    @Override // defpackage.lv
    public final /* bridge */ /* synthetic */ Object EljAMC1QTz(Object obj, Object obj2) {
        return xqGvceK5x(((Number) obj2).intValue(), (qx) obj);
    }

    public final void JFJ3QoxA(qx qxVar) {
        at0 WdrkLMV3xh;
        if (!this.EljAMC1QTz || (WdrkLMV3xh = qxVar.WdrkLMV3xh()) == null) {
            return;
        }
        WdrkLMV3xh.Yi7zF1RB1 |= 1;
        at0 at0Var = this.encWxUiV2;
        if (at0Var == null || !at0Var.GWasM1elztuh() || at0Var == WdrkLMV3xh || o30.rQPn8YBR(at0Var.X1lG3V04pd, WdrkLMV3xh.X1lG3V04pd)) {
            this.encWxUiV2 = WdrkLMV3xh;
            return;
        }
        ArrayList arrayList = this.mOu10nynGul;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.mOu10nynGul = arrayList2;
            arrayList2.add(WdrkLMV3xh);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            at0 at0Var2 = (at0) arrayList.get(i);
            if (at0Var2 == null || !at0Var2.GWasM1elztuh() || at0Var2 == WdrkLMV3xh || o30.rQPn8YBR(at0Var2.X1lG3V04pd, WdrkLMV3xh.X1lG3V04pd)) {
                arrayList.set(i, WdrkLMV3xh);
                return;
            }
        }
        arrayList.add(WdrkLMV3xh);
    }

    public final Object OOA6hdeuvCS(Object obj, qx qxVar, int i) {
        qxVar.Uxq83abb04(this.OOA6hdeuvCS);
        JFJ3QoxA(qxVar);
        int i2 = 1;
        int XnEVoBF0td1l = qxVar.EljAMC1QTz(this) ? rj0.XnEVoBF0td1l(2, 1) : rj0.XnEVoBF0td1l(1, 1);
        tv tvVar = this.AvO7iQsrTN;
        fb1.XnEVoBF0td1l(3, tvVar);
        Object X1lG3V04pd = ((mv) tvVar).X1lG3V04pd(obj, qxVar, Integer.valueOf(XnEVoBF0td1l | i));
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new w9(i, i2, this, obj);
        }
        return X1lG3V04pd;
    }

    @Override // defpackage.mv
    public final /* bridge */ /* synthetic */ Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        return OOA6hdeuvCS(obj, (qx) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.nv
    public final /* bridge */ /* synthetic */ Object XnEVoBF0td1l(Object obj, Object obj2, Object obj3, Object obj4) {
        return AvO7iQsrTN(obj, obj2, (qx) obj3, ((Number) obj4).intValue());
    }

    public final Object xqGvceK5x(int i, qx qxVar) {
        qxVar.Uxq83abb04(this.OOA6hdeuvCS);
        JFJ3QoxA(qxVar);
        int XnEVoBF0td1l = i | (qxVar.EljAMC1QTz(this) ? rj0.XnEVoBF0td1l(2, 0) : rj0.XnEVoBF0td1l(1, 0));
        tv tvVar = this.AvO7iQsrTN;
        fb1.XnEVoBF0td1l(2, tvVar);
        Object EljAMC1QTz = ((lv) tvVar).EljAMC1QTz(qxVar, Integer.valueOf(XnEVoBF0td1l));
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new id(2, this, jd.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return EljAMC1QTz;
    }
}
