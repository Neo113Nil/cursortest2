package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x01 extends y01 {
    public static v01 EXrPz3p7hFb(Object obj, hv hvVar) {
        return obj == null ? aq.GWasM1elztuh : new cl(new o1(17, obj), hvVar, 2);
    }

    public static v01 k8h8IjolWQ(Iterator it) {
        it.getClass();
        return new dg(new xb(1, it));
    }

    public static List ozMwhSAI(v01 v01Var) {
        Iterator it = v01Var.iterator();
        if (!it.hasNext()) {
            return xp.OOA6hdeuvCS;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return fb1.HFYAaqMd6(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
