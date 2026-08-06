package defpackage;

/* loaded from: classes.dex */
public final class q4 implements defpackage.ii0 {
    public final defpackage.x4 IHQe1A4L2xu;
    public boolean oh6vYeIP;

    public q4(defpackage.x4 x4Var) {
        this.IHQe1A4L2xu = x4Var;
    }

    @Override // defpackage.ii0
    public final int AARZUJiTa(defpackage.t70 t70Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int RmCzwkUxICV = ((defpackage.di0) list.get(0)).RmCzwkUxICV(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int RmCzwkUxICV2 = ((defpackage.di0) list.get(i2)).RmCzwkUxICV(i);
                if (RmCzwkUxICV2 > RmCzwkUxICV) {
                    RmCzwkUxICV = RmCzwkUxICV2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return RmCzwkUxICV;
    }

    @Override // defpackage.ii0
    public final int IHQe1A4L2xu(defpackage.t70 t70Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int AARZUJiTa = ((defpackage.di0) list.get(0)).AARZUJiTa(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int AARZUJiTa2 = ((defpackage.di0) list.get(i2)).AARZUJiTa(i);
                if (AARZUJiTa2 > AARZUJiTa) {
                    AARZUJiTa = AARZUJiTa2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return AARZUJiTa;
    }

    @Override // defpackage.ii0
    public final int r1MBDhnF(defpackage.t70 t70Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int AsxAYCCkb3Hi = ((defpackage.di0) list.get(0)).AsxAYCCkb3Hi(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int AsxAYCCkb3Hi2 = ((defpackage.di0) list.get(i2)).AsxAYCCkb3Hi(i);
                if (AsxAYCCkb3Hi2 > AsxAYCCkb3Hi) {
                    AsxAYCCkb3Hi = AsxAYCCkb3Hi2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return AsxAYCCkb3Hi;
    }

    @Override // defpackage.ii0
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int lpprD5VAS = ((defpackage.di0) list.get(0)).lpprD5VAS(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int lpprD5VAS2 = ((defpackage.di0) list.get(i2)).lpprD5VAS(i);
                if (lpprD5VAS2 > lpprD5VAS) {
                    lpprD5VAS = lpprD5VAS2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return lpprD5VAS;
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.bv0 xiZrDbcSW0 = ((defpackage.di0) list.get(i3)).xiZrDbcSW0(j);
            i = java.lang.Math.max(i, xiZrDbcSW0.adDC3e2L);
            i2 = java.lang.Math.max(i2, xiZrDbcSW0.xiZrDbcSW0);
            arrayList.add(xiZrDbcSW0);
        }
        boolean cnag84Bm = ki0Var.cnag84Bm();
        defpackage.x4 x4Var = this.IHQe1A4L2xu;
        if (cnag84Bm) {
            this.oh6vYeIP = true;
            x4Var.IHQe1A4L2xu.setValue(new defpackage.i70((i2 & 4294967295L) | (i << 32)));
        } else if (!this.oh6vYeIP) {
            x4Var.IHQe1A4L2xu.setValue(new defpackage.i70((i2 & 4294967295L) | (i << 32)));
        }
        return ki0Var.EoOhNTTfIN7K(i, i2, defpackage.ot.adDC3e2L, new defpackage.v1(1, arrayList));
    }
}
