package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j5 implements defpackage.vk0 {
    public final defpackage.q5 ZpBGe2uQfcn8;

    public j5(defpackage.q5 q5Var) {
        this.ZpBGe2uQfcn8 = q5Var;
    }

    @Override // defpackage.vk0
    public final int QiMR8OkAhezm(defpackage.fa0 fa0Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.qk0) list.get(0)).FhgBoOud6zyW(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.qk0) list.get(i2)).FhgBoOud6zyW(i));
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

    @Override // defpackage.vk0
    public final int ZpBGe2uQfcn8(defpackage.fa0 fa0Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.qk0) list.get(0)).oh71FJcDz6S2(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.qk0) list.get(i2)).oh71FJcDz6S2(i));
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

    @Override // defpackage.vk0
    public final int e6mdH7fiFuta(defpackage.fa0 fa0Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.qk0) list.get(0)).Jkfc0NcwyPL8(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.qk0) list.get(i2)).Jkfc0NcwyPL8(i));
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

    @Override // defpackage.vk0
    public final int fWTAfUmVKrZq(defpackage.fa0 fa0Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.qk0) list.get(0)).GoIRkIe1iwj6(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.qk0) list.get(i2)).GoIRkIe1iwj6(i));
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

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(defpackage.xk0 xk0Var, java.util.List list, long j) {
        defpackage.ry0 ry0Var;
        int i;
        defpackage.ry0 ry0Var2;
        int i2;
        int i3;
        int size = list.size();
        defpackage.ry0[] ry0VarArr = new defpackage.ry0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            ry0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            defpackage.qk0 qk0Var = (defpackage.qk0) list.get(i4);
            java.lang.Object GE9mJIPrb8gP = qk0Var.GE9mJIPrb8gP();
            defpackage.l5 l5Var = GE9mJIPrb8gP instanceof defpackage.l5 ? (defpackage.l5) GE9mJIPrb8gP : null;
            if (l5Var != null && ((java.lang.Boolean) l5Var.ZpBGe2uQfcn8.getValue()).booleanValue()) {
                ry0VarArr[i4] = qk0Var.WDYagTQQm9ns(j);
                j2 = (r7.oh71FJcDz6S2 & 4294967295L) | (r7.WDYagTQQm9ns << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            defpackage.qk0 qk0Var2 = (defpackage.qk0) list.get(i5);
            if (ry0VarArr[i5] == null) {
                ry0VarArr[i5] = qk0Var2.WDYagTQQm9ns(j);
            }
        }
        if (xk0Var.ZVVdXbWmyCSK()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                ry0Var2 = null;
            } else {
                ry0Var2 = ry0VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = ry0Var2 != null ? ry0Var2.WDYagTQQm9ns : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            defpackage.ry0 ry0Var3 = ry0VarArr[i8];
                            int i9 = ry0Var3 != null ? ry0Var3.WDYagTQQm9ns : 0;
                            if (i7 < i9) {
                                ry0Var2 = ry0Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = ry0Var2 != null ? ry0Var2.WDYagTQQm9ns : 0;
        }
        if (xk0Var.ZVVdXbWmyCSK()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                ry0Var = ry0VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = ry0Var != null ? ry0Var.oh71FJcDz6S2 : 0;
                    if (1 <= i10) {
                        while (true) {
                            defpackage.ry0 ry0Var4 = ry0VarArr[i];
                            int i12 = ry0Var4 != null ? ry0Var4.oh71FJcDz6S2 : 0;
                            if (i11 < i12) {
                                ry0Var = ry0Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = ry0Var != null ? ry0Var.oh71FJcDz6S2 : 0;
        }
        if (!xk0Var.ZVVdXbWmyCSK()) {
            this.ZpBGe2uQfcn8.fWTAfUmVKrZq.setValue(new defpackage.u90((i2 << 32) | (i3 & 4294967295L)));
        }
        return xk0Var.hwoZxnIesQBZ(i2, i3, defpackage.bv.WDYagTQQm9ns, new defpackage.i5(ry0VarArr, this, i2, i3));
    }
}
