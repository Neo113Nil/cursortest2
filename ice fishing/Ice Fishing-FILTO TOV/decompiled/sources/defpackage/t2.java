package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t2 implements bd0 {
    public final a3 GWasM1elztuh;

    public t2(a3 a3Var) {
        this.GWasM1elztuh = a3Var;
    }

    @Override // defpackage.bd0
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        up0 up0Var;
        int i;
        up0 up0Var2;
        int i2;
        int i3;
        int size = list.size();
        up0[] up0VarArr = new up0[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            up0Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            wc0 wc0Var = (wc0) list.get(i4);
            Object encWxUiV2 = wc0Var.encWxUiV2();
            v2 v2Var = encWxUiV2 instanceof v2 ? (v2) encWxUiV2 : null;
            if (v2Var != null && ((Boolean) v2Var.GWasM1elztuh.getValue()).booleanValue()) {
                up0VarArr[i4] = wc0Var.OOA6hdeuvCS(j);
                j2 = (r7.EljAMC1QTz & 4294967295L) | (r7.OOA6hdeuvCS << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            wc0 wc0Var2 = (wc0) list.get(i5);
            if (up0VarArr[i5] == null) {
                up0VarArr[i5] = wc0Var2.OOA6hdeuvCS(j);
            }
        }
        if (dd0Var.XnEVoBF0td1l()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                up0Var2 = null;
            } else {
                up0Var2 = up0VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = up0Var2 != null ? up0Var2.OOA6hdeuvCS : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            up0 up0Var3 = up0VarArr[i8];
                            int i9 = up0Var3 != null ? up0Var3.OOA6hdeuvCS : 0;
                            if (i7 < i9) {
                                up0Var2 = up0Var3;
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
            i2 = up0Var2 != null ? up0Var2.OOA6hdeuvCS : 0;
        }
        if (dd0Var.XnEVoBF0td1l()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                up0Var = up0VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = up0Var != null ? up0Var.EljAMC1QTz : 0;
                    if (1 <= i10) {
                        while (true) {
                            up0 up0Var4 = up0VarArr[i];
                            int i12 = up0Var4 != null ? up0Var4.EljAMC1QTz : 0;
                            if (i11 < i12) {
                                up0Var = up0Var4;
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
            i3 = up0Var != null ? up0Var.EljAMC1QTz : 0;
        }
        if (!dd0Var.XnEVoBF0td1l()) {
            this.GWasM1elztuh.X1lG3V04pd.setValue(new b30((i2 << 32) | (i3 & 4294967295L)));
        }
        return dd0Var.MjxSquD6Av(i2, i3, yp.OOA6hdeuvCS, new s2(up0VarArr, this, i2, i3));
    }

    @Override // defpackage.bd0
    public final int JFJ3QoxA(k30 k30Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((wc0) list.get(0)).dqB83aoLBB(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((wc0) list.get(i2)).dqB83aoLBB(i));
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

    @Override // defpackage.bd0
    public final int Yi7zF1RB1(k30 k30Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((wc0) list.get(0)).EljAMC1QTz(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((wc0) list.get(i2)).EljAMC1QTz(i));
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

    @Override // defpackage.bd0
    public final int encWxUiV2(k30 k30Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((wc0) list.get(0)).Uxq83abb04(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((wc0) list.get(i2)).Uxq83abb04(i));
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

    @Override // defpackage.bd0
    public final int xqGvceK5x(k30 k30Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((wc0) list.get(0)).J3Xc8BaqpN8(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((wc0) list.get(i2)).J3Xc8BaqpN8(i));
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
}
