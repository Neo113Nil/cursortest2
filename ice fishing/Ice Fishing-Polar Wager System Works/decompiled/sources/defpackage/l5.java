package defpackage;

/* loaded from: classes.dex */
public final class l5 implements java.lang.CharSequence {
    public final java.util.ArrayList AARZUJiTa;
    public final java.util.ArrayList EXtogiMhuM;
    public final java.util.List adDC3e2L;
    public final java.lang.String xiZrDbcSW0;

    static {
        defpackage.F7NU4MC0GW f7nu4mc0gw = defpackage.q41.IHQe1A4L2xu;
    }

    public l5(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        this.adDC3e2L = list;
        this.xiZrDbcSW0 = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                defpackage.k5 k5Var = (defpackage.k5) list.get(i);
                java.lang.Object obj = k5Var.IHQe1A4L2xu;
                if (obj instanceof defpackage.ob1) {
                    arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                    arrayList.add(k5Var);
                } else if (obj instanceof defpackage.kt0) {
                    arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                    arrayList2.add(k5Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.AARZUJiTa = arrayList;
        this.EXtogiMhuM = arrayList2;
        java.util.List yUiIS9dG7NYk = arrayList2 != null ? defpackage.td.yUiIS9dG7NYk(arrayList2, new defpackage.hy(5)) : null;
        if (yUiIS9dG7NYk == null || yUiIS9dG7NYk.isEmpty()) {
            return;
        }
        int i2 = ((defpackage.k5) defpackage.td.JcqDrWrgMf(yUiIS9dG7NYk)).r1MBDhnF;
        defpackage.wk0 wk0Var = defpackage.w60.IHQe1A4L2xu;
        defpackage.wk0 wk0Var2 = new defpackage.wk0(1);
        wk0Var2.IHQe1A4L2xu(i2);
        int size2 = yUiIS9dG7NYk.size();
        for (int i3 = 1; i3 < size2; i3++) {
            defpackage.k5 k5Var2 = (defpackage.k5) yUiIS9dG7NYk.get(i3);
            while (true) {
                if (wk0Var2.oh6vYeIP != 0) {
                    int r1MBDhnF = wk0Var2.r1MBDhnF();
                    int i4 = k5Var2.oh6vYeIP;
                    int i5 = k5Var2.r1MBDhnF;
                    if (i4 >= r1MBDhnF) {
                        wk0Var2.F7NU4MC0GW(wk0Var2.oh6vYeIP - 1);
                    } else if (i5 > r1MBDhnF) {
                        defpackage.y50.IHQe1A4L2xu("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + r1MBDhnF);
                    }
                }
            }
            wk0Var2.IHQe1A4L2xu(k5Var2.r1MBDhnF);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.xiZrDbcSW0.charAt(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.l5)) {
            return false;
        }
        defpackage.l5 l5Var = (defpackage.l5) obj;
        return defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, l5Var.xiZrDbcSW0) && defpackage.x70.QoRHpC4k(this.adDC3e2L, l5Var.adDC3e2L);
    }

    public final int hashCode() {
        int hashCode = this.xiZrDbcSW0.hashCode() * 31;
        java.util.List list = this.adDC3e2L;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.xiZrDbcSW0.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence subSequence(int i, int i2) {
        java.util.ArrayList arrayList;
        if (i > i2) {
            defpackage.y50.IHQe1A4L2xu("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        java.lang.String str = this.xiZrDbcSW0;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        java.lang.String substring = str.substring(i, i2);
        int i3 = defpackage.m5.IHQe1A4L2xu;
        if (i > i2) {
            defpackage.y50.IHQe1A4L2xu("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        java.util.List list = this.adDC3e2L;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.k5 k5Var = (defpackage.k5) list.get(i4);
                int i5 = k5Var.oh6vYeIP;
                int i6 = k5Var.r1MBDhnF;
                if (defpackage.m5.IHQe1A4L2xu(i, i2, i5, i6)) {
                    arrayList.add(new defpackage.k5(k5Var.IHQe1A4L2xu, java.lang.Math.max(i, k5Var.oh6vYeIP) - i, java.lang.Math.min(i2, i6) - i, k5Var.F7NU4MC0GW));
                }
            }
        }
        arrayList = null;
        return new defpackage.l5(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.xiZrDbcSW0;
    }

    public /* synthetic */ l5(java.lang.String str) {
        this(str, defpackage.nt.adDC3e2L);
    }

    public l5(java.lang.String str, java.util.List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
