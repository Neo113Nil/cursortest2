package defpackage;

/* loaded from: classes.dex */
public final class uc implements defpackage.ii0 {
    @Override // defpackage.ii0
    public final int AARZUJiTa(defpackage.t70 t70Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.di0) list.get(0)).RmCzwkUxICV(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.di0) list.get(i2)).RmCzwkUxICV(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ii0
    public final int IHQe1A4L2xu(defpackage.t70 t70Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.di0) list.get(0)).AARZUJiTa(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.di0) list.get(i2)).AARZUJiTa(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ii0
    public final int r1MBDhnF(defpackage.t70 t70Var, java.util.List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((defpackage.di0) list.get(i3)).AsxAYCCkb3Hi(i);
        }
        return i2;
    }

    @Override // defpackage.ii0
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((defpackage.di0) list.get(i3)).lpprD5VAS(i);
        }
        return i2;
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        java.lang.Object obj;
        java.lang.Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (defpackage.x70.QoRHpC4k(defpackage.h1.C0U8sNJm((defpackage.di0) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        defpackage.di0 di0Var = (defpackage.di0) obj;
        final defpackage.bv0 xiZrDbcSW0 = di0Var != null ? di0Var.xiZrDbcSW0(defpackage.ki.IHQe1A4L2xu(j, 0, 0, 10)) : null;
        final int i2 = xiZrDbcSW0 != null ? xiZrDbcSW0.adDC3e2L : 0;
        final int i3 = xiZrDbcSW0 != null ? xiZrDbcSW0.xiZrDbcSW0 : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (defpackage.x70.QoRHpC4k(defpackage.h1.C0U8sNJm((defpackage.di0) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        defpackage.di0 di0Var2 = (defpackage.di0) obj2;
        final defpackage.bv0 xiZrDbcSW02 = di0Var2 != null ? di0Var2.xiZrDbcSW0(defpackage.ki.IHQe1A4L2xu(j, 0, 0, 10)) : null;
        int i5 = xiZrDbcSW02 != null ? xiZrDbcSW02.adDC3e2L : 0;
        final int i6 = xiZrDbcSW02 != null ? xiZrDbcSW02.xiZrDbcSW0 : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            defpackage.di0 di0Var3 = (defpackage.di0) list.get(i7);
            if (defpackage.x70.QoRHpC4k(defpackage.h1.C0U8sNJm(di0Var3), "label")) {
                final defpackage.bv0 xiZrDbcSW03 = di0Var3.xiZrDbcSW0(defpackage.li.EXtogiMhuM(-(i2 + i5), 0, j));
                int i8 = xiZrDbcSW03.adDC3e2L + i2 + i5;
                final int max = java.lang.Math.max(i3, java.lang.Math.max(xiZrDbcSW03.xiZrDbcSW0, i6));
                return ki0Var.EoOhNTTfIN7K(i8, max, defpackage.ot.adDC3e2L, new defpackage.g00() { // from class: tc
                    @Override // defpackage.g00
                    public final java.lang.Object AARZUJiTa(java.lang.Object obj3) {
                        defpackage.av0 av0Var = (defpackage.av0) obj3;
                        defpackage.bv0 bv0Var = defpackage.bv0.this;
                        int i9 = max;
                        if (bv0Var != null) {
                            defpackage.av0.JlrlGoKF(av0Var, bv0Var, 0, java.lang.Math.round(((i9 - i3) / 2.0f) * 1.0f));
                        }
                        defpackage.bv0 bv0Var2 = xiZrDbcSW03;
                        int i10 = i2;
                        defpackage.av0.JlrlGoKF(av0Var, bv0Var2, i10, 0);
                        defpackage.bv0 bv0Var3 = xiZrDbcSW02;
                        if (bv0Var3 != null) {
                            defpackage.av0.JlrlGoKF(av0Var, bv0Var3, i10 + bv0Var2.adDC3e2L, java.lang.Math.round(((i9 - i6) / 2.0f) * 1.0f));
                        }
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                });
            }
        }
        defpackage.xe0.oh6vYeIP("Collection contains no element matching the predicate.");
        throw new defpackage.cf();
    }
}
