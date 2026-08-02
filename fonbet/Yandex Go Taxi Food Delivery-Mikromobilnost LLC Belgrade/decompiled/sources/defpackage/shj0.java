package defpackage;

import defpackage.oqj0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class shj0 {
    public static final rhj0 a(lmw0 lmw0Var, oqj0 oqj0Var) {
        oqj0.b a = oqj0Var.a(lmw0Var.getName());
        if (a == null || !a.a) {
            return null;
        }
        String Y = d6z.Y(oqj0Var, a.e);
        String str = !evu0.J(Y) ? Y : null;
        String Y2 = d6z.Y(oqj0Var, a.f);
        String str2 = !evu0.J(Y2) ? Y2 : null;
        String Y3 = d6z.Y(oqj0Var, a.g);
        String str3 = !evu0.J(Y3) ? Y3 : null;
        List<oqj0.a> list = a.h;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (oqj0.a aVar : list) {
            arrayList.add(new qhj0(d6z.Y(oqj0Var, aVar.a), d6z.Y(oqj0Var, aVar.b)));
        }
        return new rhj0(a.c, str, str2, str3, arrayList);
    }
}
