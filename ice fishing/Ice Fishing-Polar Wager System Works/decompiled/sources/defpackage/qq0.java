package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qq0 {
    public final /* synthetic */ java.lang.Object IHQe1A4L2xu;

    public /* synthetic */ qq0(java.lang.Object obj) {
        this.IHQe1A4L2xu = obj;
    }

    public void IHQe1A4L2xu() {
        defpackage.k00 k00Var = (defpackage.k00) this.IHQe1A4L2xu;
        synchronized (defpackage.wa1.r1MBDhnF) {
            java.util.List list = defpackage.wa1.EXtogiMhuM;
            list.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(list, 10));
            boolean z = false;
            for (java.lang.Object obj : list) {
                boolean z2 = true;
                if (!z && defpackage.x70.QoRHpC4k(obj, k00Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            defpackage.wa1.EXtogiMhuM = arrayList;
        }
    }
}
