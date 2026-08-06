package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l6 implements java.lang.CharSequence {
    public final java.util.ArrayList P05cfTpS5W5L;
    public final java.util.ArrayList QiMR8OkAhezm;
    public final java.util.List WDYagTQQm9ns;
    public final java.lang.String oh71FJcDz6S2;

    static {
        defpackage.n80 n80Var = defpackage.k81.ZpBGe2uQfcn8;
    }

    public l6(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        this.WDYagTQQm9ns = list;
        this.oh71FJcDz6S2 = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                defpackage.k6 k6Var = (defpackage.k6) list.get(i);
                java.lang.Object obj = k6Var.ZpBGe2uQfcn8;
                if (obj instanceof defpackage.pf1) {
                    arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                    arrayList.add(k6Var);
                } else if (obj instanceof defpackage.hw0) {
                    arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                    arrayList2.add(k6Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.QiMR8OkAhezm = arrayList;
        this.P05cfTpS5W5L = arrayList2;
        java.util.List mnkwqFSfsWTC = arrayList2 != null ? defpackage.hf.mnkwqFSfsWTC(arrayList2, new defpackage.oz(5)) : null;
        if (mnkwqFSfsWTC == null || mnkwqFSfsWTC.isEmpty()) {
            return;
        }
        int i2 = ((defpackage.k6) defpackage.hf.fhbmYuu9J3cT(mnkwqFSfsWTC)).fWTAfUmVKrZq;
        defpackage.fn0 fn0Var = defpackage.i90.ZpBGe2uQfcn8;
        defpackage.fn0 fn0Var2 = new defpackage.fn0(1);
        fn0Var2.ZpBGe2uQfcn8(i2);
        int size2 = mnkwqFSfsWTC.size();
        for (int i3 = 1; i3 < size2; i3++) {
            defpackage.k6 k6Var2 = (defpackage.k6) mnkwqFSfsWTC.get(i3);
            while (true) {
                if (fn0Var2.giKS3J6vZuNy != 0) {
                    int fWTAfUmVKrZq = fn0Var2.fWTAfUmVKrZq();
                    int i4 = k6Var2.giKS3J6vZuNy;
                    int i5 = k6Var2.fWTAfUmVKrZq;
                    if (i4 >= fWTAfUmVKrZq) {
                        fn0Var2.JhCgjQRTAOCT(fn0Var2.giKS3J6vZuNy - 1);
                    } else if (i5 > fWTAfUmVKrZq) {
                        defpackage.f80.ZpBGe2uQfcn8("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + fWTAfUmVKrZq);
                    }
                }
            }
            fn0Var2.ZpBGe2uQfcn8(k6Var2.fWTAfUmVKrZq);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r2.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: ZpBGe2uQfcn8, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.l6 subSequence(int i, int i2) {
        java.util.ArrayList arrayList;
        if (!(i <= i2)) {
            defpackage.f80.ZpBGe2uQfcn8("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        java.lang.String str = this.oh71FJcDz6S2;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        java.lang.String substring = str.substring(i, i2);
        defpackage.l6 l6Var = defpackage.m6.ZpBGe2uQfcn8;
        if (i > i2) {
            defpackage.f80.ZpBGe2uQfcn8("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        java.util.List list = this.WDYagTQQm9ns;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.k6 k6Var = (defpackage.k6) list.get(i3);
                int i4 = k6Var.giKS3J6vZuNy;
                int i5 = k6Var.fWTAfUmVKrZq;
                if (defpackage.m6.giKS3J6vZuNy(i, i2, i4, i5)) {
                    arrayList.add(new defpackage.k6(java.lang.Math.max(i, k6Var.giKS3J6vZuNy) - i, java.lang.Math.min(i2, i5) - i, k6Var.ZpBGe2uQfcn8, k6Var.JhCgjQRTAOCT));
                }
            }
        }
        arrayList = null;
        return new defpackage.l6(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.oh71FJcDz6S2.charAt(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.l6)) {
            return false;
        }
        defpackage.l6 l6Var = (defpackage.l6) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, l6Var.oh71FJcDz6S2) && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, l6Var.WDYagTQQm9ns);
    }

    public final int hashCode() {
        int hashCode = this.oh71FJcDz6S2.hashCode() * 31;
        java.util.List list = this.WDYagTQQm9ns;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.oh71FJcDz6S2.length();
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.oh71FJcDz6S2;
    }

    public /* synthetic */ l6(java.lang.String str) {
        this(str, defpackage.av.WDYagTQQm9ns);
    }

    public l6(java.lang.String str, java.util.List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
