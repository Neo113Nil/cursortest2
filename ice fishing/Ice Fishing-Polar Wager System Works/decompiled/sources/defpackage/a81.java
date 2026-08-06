package defpackage;

/* loaded from: classes.dex */
public abstract class a81 extends defpackage.b81 {
    public static defpackage.y71 p4kuH6PDtgom(java.util.Iterator it) {
        it.getClass();
        return new defpackage.ji(new defpackage.zd(1, it));
    }

    public static java.util.List wll2JLbTBC2(defpackage.y71 y71Var) {
        java.util.Iterator it = y71Var.iterator();
        if (!it.hasNext()) {
            return defpackage.nt.adDC3e2L;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return defpackage.fm.p4kuH6PDtgom(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static defpackage.y71 yIx6ChFVk(java.lang.Object obj, defpackage.g00 g00Var) {
        return obj == null ? defpackage.qt.IHQe1A4L2xu : new defpackage.rv(new defpackage.e3(19, obj), g00Var, 1);
    }
}
