package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class r5 implements defpackage.vk0 {
    public final defpackage.v5 ZpBGe2uQfcn8;
    public boolean giKS3J6vZuNy;

    public r5(defpackage.v5 v5Var) {
        this.ZpBGe2uQfcn8 = v5Var;
    }

    @Override // defpackage.vk0
    public final int QiMR8OkAhezm(defpackage.fa0 fa0Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int FhgBoOud6zyW = ((defpackage.qk0) list.get(0)).FhgBoOud6zyW(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int FhgBoOud6zyW2 = ((defpackage.qk0) list.get(i2)).FhgBoOud6zyW(i);
                if (FhgBoOud6zyW2 > FhgBoOud6zyW) {
                    FhgBoOud6zyW = FhgBoOud6zyW2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return FhgBoOud6zyW;
    }

    @Override // defpackage.vk0
    public final int ZpBGe2uQfcn8(defpackage.fa0 fa0Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int oh71FJcDz6S2 = ((defpackage.qk0) list.get(0)).oh71FJcDz6S2(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int oh71FJcDz6S22 = ((defpackage.qk0) list.get(i2)).oh71FJcDz6S2(i);
                if (oh71FJcDz6S22 > oh71FJcDz6S2) {
                    oh71FJcDz6S2 = oh71FJcDz6S22;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return oh71FJcDz6S2;
    }

    @Override // defpackage.vk0
    public final int e6mdH7fiFuta(defpackage.fa0 fa0Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Jkfc0NcwyPL8 = ((defpackage.qk0) list.get(0)).Jkfc0NcwyPL8(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int Jkfc0NcwyPL82 = ((defpackage.qk0) list.get(i2)).Jkfc0NcwyPL8(i);
                if (Jkfc0NcwyPL82 > Jkfc0NcwyPL8) {
                    Jkfc0NcwyPL8 = Jkfc0NcwyPL82;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return Jkfc0NcwyPL8;
    }

    @Override // defpackage.vk0
    public final int fWTAfUmVKrZq(defpackage.fa0 fa0Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int GoIRkIe1iwj6 = ((defpackage.qk0) list.get(0)).GoIRkIe1iwj6(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int GoIRkIe1iwj62 = ((defpackage.qk0) list.get(i2)).GoIRkIe1iwj6(i);
                if (GoIRkIe1iwj62 > GoIRkIe1iwj6) {
                    GoIRkIe1iwj6 = GoIRkIe1iwj62;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return GoIRkIe1iwj6;
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(defpackage.xk0 xk0Var, java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.ry0 WDYagTQQm9ns = ((defpackage.qk0) list.get(i3)).WDYagTQQm9ns(j);
            i = java.lang.Math.max(i, WDYagTQQm9ns.WDYagTQQm9ns);
            i2 = java.lang.Math.max(i2, WDYagTQQm9ns.oh71FJcDz6S2);
            arrayList.add(WDYagTQQm9ns);
        }
        boolean ZVVdXbWmyCSK = xk0Var.ZVVdXbWmyCSK();
        defpackage.v5 v5Var = this.ZpBGe2uQfcn8;
        if (ZVVdXbWmyCSK) {
            this.giKS3J6vZuNy = true;
            v5Var.ZpBGe2uQfcn8.setValue(new defpackage.u90((i2 & 4294967295L) | (i << 32)));
        } else if (!this.giKS3J6vZuNy) {
            v5Var.ZpBGe2uQfcn8.setValue(new defpackage.u90((i2 & 4294967295L) | (i << 32)));
        }
        return xk0Var.hwoZxnIesQBZ(i, i2, defpackage.bv.WDYagTQQm9ns, new defpackage.c1(2, arrayList));
    }
}
