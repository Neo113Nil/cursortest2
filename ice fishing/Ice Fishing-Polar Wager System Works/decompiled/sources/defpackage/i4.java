package defpackage;

/* loaded from: classes.dex */
public final class i4 implements defpackage.ii0 {
    public final defpackage.p4 IHQe1A4L2xu;

    public i4(defpackage.p4 p4Var) {
        this.IHQe1A4L2xu = p4Var;
    }

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
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.di0) list.get(0)).AsxAYCCkb3Hi(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.di0) list.get(i2)).AsxAYCCkb3Hi(i));
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
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
        java.lang.Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = java.lang.Integer.valueOf(((defpackage.di0) list.get(0)).lpprD5VAS(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((defpackage.di0) list.get(i2)).lpprD5VAS(i));
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
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        defpackage.bv0 bv0Var;
        int i;
        defpackage.bv0 bv0Var2;
        int i2;
        int i3;
        int size = list.size();
        defpackage.bv0[] bv0VarArr = new defpackage.bv0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            bv0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            defpackage.di0 di0Var = (defpackage.di0) list.get(i4);
            java.lang.Object ez2rX8ReCYw = di0Var.ez2rX8ReCYw();
            defpackage.k4 k4Var = ez2rX8ReCYw instanceof defpackage.k4 ? (defpackage.k4) ez2rX8ReCYw : null;
            if (k4Var != null && ((java.lang.Boolean) k4Var.IHQe1A4L2xu.getValue()).booleanValue()) {
                bv0VarArr[i4] = di0Var.xiZrDbcSW0(j);
                j2 = (r7.xiZrDbcSW0 & 4294967295L) | (r7.adDC3e2L << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            defpackage.di0 di0Var2 = (defpackage.di0) list.get(i5);
            if (bv0VarArr[i5] == null) {
                bv0VarArr[i5] = di0Var2.xiZrDbcSW0(j);
            }
        }
        if (ki0Var.cnag84Bm()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                bv0Var2 = null;
            } else {
                bv0Var2 = bv0VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = bv0Var2 != null ? bv0Var2.adDC3e2L : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            defpackage.bv0 bv0Var3 = bv0VarArr[i8];
                            int i9 = bv0Var3 != null ? bv0Var3.adDC3e2L : 0;
                            if (i7 < i9) {
                                bv0Var2 = bv0Var3;
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
            i2 = bv0Var2 != null ? bv0Var2.adDC3e2L : 0;
        }
        if (ki0Var.cnag84Bm()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                bv0Var = bv0VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = bv0Var != null ? bv0Var.xiZrDbcSW0 : 0;
                    if (1 <= i10) {
                        while (true) {
                            defpackage.bv0 bv0Var4 = bv0VarArr[i];
                            int i12 = bv0Var4 != null ? bv0Var4.xiZrDbcSW0 : 0;
                            if (i11 < i12) {
                                bv0Var = bv0Var4;
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
            i3 = bv0Var != null ? bv0Var.xiZrDbcSW0 : 0;
        }
        if (!ki0Var.cnag84Bm()) {
            this.IHQe1A4L2xu.r1MBDhnF.setValue(new defpackage.i70((i2 << 32) | (i3 & 4294967295L)));
        }
        return ki0Var.EoOhNTTfIN7K(i2, i3, defpackage.ot.adDC3e2L, new defpackage.h4(bv0VarArr, this, i2, i3));
    }
}
