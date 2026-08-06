package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kc1 implements defpackage.hc1, defpackage.oc {
    public final java.util.HashSet JhCgjQRTAOCT;
    public final defpackage.hc1[] P05cfTpS5W5L;
    public final boolean[] QiMR8OkAhezm;
    public final java.lang.String[] WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.ti1 e6mdH7fiFuta;
    public final int fWTAfUmVKrZq;
    public final defpackage.j80 giKS3J6vZuNy;
    public final defpackage.hc1[] oh71FJcDz6S2;

    public kc1(java.lang.String str, defpackage.j80 j80Var, int i, java.util.List list, defpackage.oe oeVar) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = j80Var;
        this.fWTAfUmVKrZq = i;
        java.util.ArrayList arrayList = oeVar.giKS3J6vZuNy;
        arrayList.getClass();
        java.util.HashSet hashSet = new java.util.HashSet(defpackage.jk0.zJPqDeoF0Os1(defpackage.jf.Wc0TdmRSwbbi(arrayList, 12)));
        defpackage.hf.Hx18F4M3RgD4(arrayList, hashSet);
        this.JhCgjQRTAOCT = hashSet;
        int i2 = 0;
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        this.WDYagTQQm9ns = strArr;
        this.oh71FJcDz6S2 = defpackage.ok0.w7APNrr0aGRc(oeVar.JhCgjQRTAOCT);
        this.QiMR8OkAhezm = defpackage.hf.pf0OXpZQoaz3(oeVar.oh71FJcDz6S2);
        strArr.getClass();
        defpackage.y60 y60Var = new defpackage.y60(i2, new defpackage.l3(3, strArr));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(y60Var, 10));
        java.util.Iterator it = y60Var.iterator();
        while (true) {
            defpackage.ZVVdXbWmyCSK zVVdXbWmyCSK = (defpackage.ZVVdXbWmyCSK) it;
            if (!((java.util.Iterator) zVVdXbWmyCSK.QiMR8OkAhezm).hasNext()) {
                defpackage.jk0.Wc0TdmRSwbbi(arrayList2);
                this.P05cfTpS5W5L = defpackage.ok0.w7APNrr0aGRc(list);
                this.e6mdH7fiFuta = new defpackage.ti1(new defpackage.jc1(i2, this));
                return;
            }
            defpackage.x60 x60Var = (defpackage.x60) zVVdXbWmyCSK.next();
            arrayList2.add(new defpackage.bw0(x60Var.giKS3J6vZuNy, java.lang.Integer.valueOf(x60Var.ZpBGe2uQfcn8)));
        }
    }

    @Override // defpackage.hc1
    public final java.lang.String JhCgjQRTAOCT(int i) {
        return this.WDYagTQQm9ns[i];
    }

    @Override // defpackage.hc1
    public final boolean P05cfTpS5W5L(int i) {
        return this.QiMR8OkAhezm[i];
    }

    @Override // defpackage.hc1
    public final defpackage.hc1 QiMR8OkAhezm(int i) {
        return this.oh71FJcDz6S2[i];
    }

    @Override // defpackage.oc
    public final java.util.Set WDYagTQQm9ns() {
        return this.JhCgjQRTAOCT;
    }

    @Override // defpackage.hc1
    public final java.lang.String ZpBGe2uQfcn8() {
        return this.ZpBGe2uQfcn8;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kc1) {
            defpackage.hc1 hc1Var = (defpackage.hc1) obj;
            if (this.ZpBGe2uQfcn8.equals(hc1Var.ZpBGe2uQfcn8()) && java.util.Arrays.equals(this.P05cfTpS5W5L, ((defpackage.kc1) obj).P05cfTpS5W5L)) {
                int fWTAfUmVKrZq = hc1Var.fWTAfUmVKrZq();
                int i2 = this.fWTAfUmVKrZq;
                if (i2 == fWTAfUmVKrZq) {
                    for (0; i < i2; i + 1) {
                        defpackage.hc1[] hc1VarArr = this.oh71FJcDz6S2;
                        i = (defpackage.ma0.QiMR8OkAhezm(hc1VarArr[i].ZpBGe2uQfcn8(), hc1Var.QiMR8OkAhezm(i).ZpBGe2uQfcn8()) && defpackage.ma0.QiMR8OkAhezm(hc1VarArr[i].giKS3J6vZuNy(), hc1Var.QiMR8OkAhezm(i).giKS3J6vZuNy())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hc1
    public final int fWTAfUmVKrZq() {
        return this.fWTAfUmVKrZq;
    }

    @Override // defpackage.hc1
    public final defpackage.j80 giKS3J6vZuNy() {
        return this.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return ((java.lang.Number) this.e6mdH7fiFuta.getValue()).intValue();
    }

    public final java.lang.String toString() {
        return defpackage.b80.GcLuU6pT9wO9(this);
    }
}
