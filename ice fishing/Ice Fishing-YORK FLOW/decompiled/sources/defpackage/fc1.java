package defpackage;

/* loaded from: classes.dex */
public abstract class fc1 extends defpackage.gc1 {
    public static defpackage.dc1 GcLuU6pT9wO9(java.lang.Object obj, defpackage.y10 y10Var) {
        return obj == null ? defpackage.dv.ZpBGe2uQfcn8 : new defpackage.cx(new defpackage.l3(29, obj), y10Var, 1);
    }

    public static defpackage.dc1 hH0RRJrNssvh(java.util.Iterator it) {
        it.getClass();
        return new defpackage.lk(new defpackage.of(1, it));
    }

    public static java.util.List xahdJg25P1Bv(defpackage.dc1 dc1Var) {
        java.util.Iterator it = dc1Var.iterator();
        if (!it.hasNext()) {
            return defpackage.av.WDYagTQQm9ns;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return defpackage.ma0.VFeft99leXEK(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
