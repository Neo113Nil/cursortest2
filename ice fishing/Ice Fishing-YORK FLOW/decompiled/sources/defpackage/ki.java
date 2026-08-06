package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ki extends java.lang.RuntimeException {
    public final int P05cfTpS5W5L;
    public final defpackage.fn0 QiMR8OkAhezm;
    public final defpackage.sn0 WDYagTQQm9ns;
    public final defpackage.sn0 oh71FJcDz6S2;

    public ki(defpackage.sn0 sn0Var, defpackage.sn0 sn0Var2, defpackage.fn0 fn0Var, int i, java.lang.Exception exc) {
        super(exc);
        this.WDYagTQQm9ns = sn0Var;
        this.oh71FJcDz6S2 = sn0Var2;
        this.QiMR8OkAhezm = fn0Var;
        this.P05cfTpS5W5L = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.util.List list;
        java.util.Collection collection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.P05cfTpS5W5L);
        sb.append(":\n            |");
        defpackage.ec1 blKFvluuDQOf = defpackage.v70.blKFvluuDQOf(new defpackage.ji(this, null));
        if (blKFvluuDQOf.hasNext()) {
            java.lang.Object next = blKFvluuDQOf.next();
            if (blKFvluuDQOf.hasNext()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(next);
                while (blKFvluuDQOf.hasNext()) {
                    arrayList.add(blKFvluuDQOf.next());
                }
                list = arrayList;
            } else {
                list = defpackage.ma0.VFeft99leXEK(next);
            }
        } else {
            list = defpackage.av.WDYagTQQm9ns;
        }
        int size = list.size();
        if (50 >= size) {
            collection = defpackage.hf.a6r05ZxsOP0A(list);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(50);
            if (list instanceof java.util.RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                java.util.ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(defpackage.hf.m6iZQUu7XjoL(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return defpackage.ug1.xahdJg25P1Bv(sb.toString());
    }
}
