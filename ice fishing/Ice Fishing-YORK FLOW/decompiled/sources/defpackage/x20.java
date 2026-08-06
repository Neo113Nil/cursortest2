package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x20 extends defpackage.iu1 {
    public defpackage.yf1 JhCgjQRTAOCT;
    public final java.util.List WDYagTQQm9ns;
    public final defpackage.c31 fWTAfUmVKrZq;
    public final defpackage.gg1 giKS3J6vZuNy;

    public x20() {
        defpackage.gg1 fNwYGHIYeJcR = defpackage.nq1.fNwYGHIYeJcR(new defpackage.w20());
        this.giKS3J6vZuNy = fNwYGHIYeJcR;
        this.fWTAfUmVKrZq = new defpackage.c31(fNwYGHIYeJcR);
        this.WDYagTQQm9ns = defpackage.ma0.oCu53ZX2v4Ju(defpackage.ma0.oCu53ZX2v4Ju(0, 1, 2), defpackage.ma0.oCu53ZX2v4Ju(3, 4, 5), defpackage.ma0.oCu53ZX2v4Ju(6, 7, 8), defpackage.ma0.oCu53ZX2v4Ju(0, 3, 6), defpackage.ma0.oCu53ZX2v4Ju(1, 4, 7), defpackage.ma0.oCu53ZX2v4Ju(2, 5, 8), defpackage.ma0.oCu53ZX2v4Ju(0, 4, 8), defpackage.ma0.oCu53ZX2v4Ju(2, 4, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        return new defpackage.bw0(defpackage.v20.oh71FJcDz6S2, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.bw0 WDYagTQQm9ns(java.util.ArrayList arrayList) {
        java.util.List list;
        java.util.Iterator it = this.WDYagTQQm9ns.iterator();
        loop0: while (true) {
            int i = 0;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        i++;
                        if (((defpackage.u20) obj) == defpackage.u20.WDYagTQQm9ns) {
                            return new defpackage.bw0(defpackage.v20.WDYagTQQm9ns, null);
                        }
                    }
                }
                return new defpackage.bw0(defpackage.v20.P05cfTpS5W5L, null);
            }
            list = (java.util.List) it.next();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add((defpackage.u20) arrayList.get(((java.lang.Number) it2.next()).intValue()));
            }
            if (!arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    java.lang.Object obj2 = arrayList2.get(i2);
                    i2++;
                    if (((defpackage.u20) obj2) != defpackage.u20.oh71FJcDz6S2) {
                        if (!arrayList2.isEmpty()) {
                            int size3 = arrayList2.size();
                            while (i < size3) {
                                java.lang.Object obj3 = arrayList2.get(i);
                                i++;
                                if (((defpackage.u20) obj3) == defpackage.u20.QiMR8OkAhezm) {
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return new defpackage.bw0(defpackage.v20.QiMR8OkAhezm, list);
    }

    public final java.lang.Integer oh71FJcDz6S2(java.util.ArrayList arrayList, defpackage.u20 u20Var) {
        int i;
        int i2;
        for (java.util.List list : this.WDYagTQQm9ns) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add((defpackage.u20) arrayList.get(((java.lang.Number) it.next()).intValue()));
            }
            int i3 = 0;
            if (arrayList2.isEmpty()) {
                i = 0;
            } else {
                int size = arrayList2.size();
                i = 0;
                int i4 = 0;
                while (i4 < size) {
                    java.lang.Object obj = arrayList2.get(i4);
                    i4++;
                    if (((defpackage.u20) obj) == u20Var && (i = i + 1) < 0) {
                        throw new java.lang.ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            if (i == 2) {
                boolean isEmpty = arrayList2.isEmpty();
                defpackage.u20 u20Var2 = defpackage.u20.WDYagTQQm9ns;
                if (isEmpty) {
                    i2 = 0;
                } else {
                    int size2 = arrayList2.size();
                    i2 = 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        java.lang.Object obj2 = arrayList2.get(i5);
                        i5++;
                        if (((defpackage.u20) obj2) == u20Var2 && (i2 = i2 + 1) < 0) {
                            throw new java.lang.ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i2 == 1) {
                    int size3 = arrayList2.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            i3 = -1;
                            break;
                        }
                        java.lang.Object obj3 = arrayList2.get(i6);
                        i6++;
                        if (((defpackage.u20) obj3) == u20Var2) {
                            break;
                        }
                        i3++;
                    }
                    return (java.lang.Integer) list.get(i3);
                }
            }
        }
        return null;
    }
}
