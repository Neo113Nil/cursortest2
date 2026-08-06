package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d1 implements defpackage.vk0 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public static final defpackage.d1 giKS3J6vZuNy = new defpackage.d1(0);
    public static final defpackage.d1 fWTAfUmVKrZq = new defpackage.d1(1);
    public static final defpackage.d1 JhCgjQRTAOCT = new defpackage.d1(2);
    public static final defpackage.d1 WDYagTQQm9ns = new defpackage.d1(3);
    public static final defpackage.awuGf4qH8HFd oh71FJcDz6S2 = new defpackage.awuGf4qH8HFd(6);
    public static final defpackage.d1 QiMR8OkAhezm = new defpackage.d1(4);
    public static final defpackage.d1 P05cfTpS5W5L = new defpackage.d1(5);

    public /* synthetic */ d1(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(defpackage.xk0 xk0Var, java.util.List list, long j) {
        int i = this.ZpBGe2uQfcn8;
        defpackage.bv bvVar = defpackage.bv.WDYagTQQm9ns;
        switch (i) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    defpackage.ry0 WDYagTQQm9ns2 = ((defpackage.qk0) list.get(i4)).WDYagTQQm9ns(j);
                    i2 = java.lang.Math.max(i2, WDYagTQQm9ns2.WDYagTQQm9ns);
                    i3 = java.lang.Math.max(i3, WDYagTQQm9ns2.oh71FJcDz6S2);
                    arrayList.add(WDYagTQQm9ns2);
                }
                if (list.isEmpty()) {
                    i2 = defpackage.mk.GE9mJIPrb8gP(j);
                    i3 = defpackage.mk.e6mdH7fiFuta(j);
                }
                return xk0Var.hwoZxnIesQBZ(i2, i3, bvVar, new defpackage.c1(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return xk0Var.hwoZxnIesQBZ(0, 0, bvVar, defpackage.n.T1fB7bDYiVJQ);
                }
                if (size2 == 1) {
                    defpackage.ry0 WDYagTQQm9ns3 = ((defpackage.qk0) list.get(0)).WDYagTQQm9ns(j);
                    return xk0Var.hwoZxnIesQBZ(WDYagTQQm9ns3.WDYagTQQm9ns, WDYagTQQm9ns3.oh71FJcDz6S2, bvVar, new defpackage.g(WDYagTQQm9ns3, 1));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                int size3 = list.size();
                int i5 = 0;
                int i6 = 0;
                while (r2 < size3) {
                    defpackage.ry0 WDYagTQQm9ns4 = ((defpackage.qk0) list.get(r2)).WDYagTQQm9ns(j);
                    i5 = java.lang.Math.max(i5, WDYagTQQm9ns4.WDYagTQQm9ns);
                    i6 = java.lang.Math.max(i6, WDYagTQQm9ns4.oh71FJcDz6S2);
                    arrayList2.add(WDYagTQQm9ns4);
                    r2++;
                }
                return xk0Var.hwoZxnIesQBZ(i5, i6, bvVar, new defpackage.c1(1, arrayList2));
            case 2:
                return xk0Var.hwoZxnIesQBZ(defpackage.mk.GE9mJIPrb8gP(j), defpackage.mk.e6mdH7fiFuta(j), bvVar, new defpackage.awuGf4qH8HFd(6));
            case 3:
                return xk0Var.hwoZxnIesQBZ(defpackage.mk.P05cfTpS5W5L(j), defpackage.mk.QiMR8OkAhezm(j), bvVar, oh71FJcDz6S2);
            case 4:
                java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
                int size4 = list.size();
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < size4; i9++) {
                    defpackage.ry0 WDYagTQQm9ns5 = ((defpackage.qk0) list.get(i9)).WDYagTQQm9ns(j);
                    i7 = java.lang.Math.max(i7, WDYagTQQm9ns5.WDYagTQQm9ns);
                    i8 = java.lang.Math.max(i8, WDYagTQQm9ns5.oh71FJcDz6S2);
                    arrayList3.add(WDYagTQQm9ns5);
                }
                return xk0Var.hwoZxnIesQBZ(i7, i8, bvVar, new defpackage.wd1(0, arrayList3));
            default:
                return xk0Var.hwoZxnIesQBZ(defpackage.mk.oh71FJcDz6S2(j) ? defpackage.mk.P05cfTpS5W5L(j) : 0, defpackage.mk.WDYagTQQm9ns(j) ? defpackage.mk.QiMR8OkAhezm(j) : 0, bvVar, new defpackage.awuGf4qH8HFd(6));
        }
    }
}
