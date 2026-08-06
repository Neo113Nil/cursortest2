package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class cy0 implements java.util.Iterator, defpackage.nb0 {
    public boolean QiMR8OkAhezm = true;
    public final defpackage.wp1[] WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public cy0(defpackage.vp1 vp1Var, defpackage.wp1[] wp1VarArr) {
        this.WDYagTQQm9ns = wp1VarArr;
        wp1VarArr[0].ZpBGe2uQfcn8(vp1Var.JhCgjQRTAOCT, java.lang.Integer.bitCount(vp1Var.ZpBGe2uQfcn8) * 2, 0);
        this.oh71FJcDz6S2 = 0;
        ZpBGe2uQfcn8();
    }

    public final void ZpBGe2uQfcn8() {
        int i = this.oh71FJcDz6S2;
        defpackage.wp1[] wp1VarArr = this.WDYagTQQm9ns;
        defpackage.wp1 wp1Var = wp1VarArr[i];
        if (wp1Var.QiMR8OkAhezm < wp1Var.oh71FJcDz6S2) {
            return;
        }
        while (-1 < i) {
            int giKS3J6vZuNy = giKS3J6vZuNy(i);
            if (giKS3J6vZuNy == -1) {
                defpackage.wp1 wp1Var2 = wp1VarArr[i];
                int i2 = wp1Var2.QiMR8OkAhezm;
                java.lang.Object[] objArr = wp1Var2.WDYagTQQm9ns;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    wp1Var2.QiMR8OkAhezm = i2 + 1;
                    giKS3J6vZuNy = giKS3J6vZuNy(i);
                }
            }
            if (giKS3J6vZuNy != -1) {
                this.oh71FJcDz6S2 = giKS3J6vZuNy;
                return;
            }
            if (i > 0) {
                defpackage.wp1 wp1Var3 = wp1VarArr[i - 1];
                int i3 = wp1Var3.QiMR8OkAhezm;
                int length2 = wp1Var3.WDYagTQQm9ns.length;
                wp1Var3.QiMR8OkAhezm = i3 + 1;
            }
            wp1VarArr[i].ZpBGe2uQfcn8(defpackage.vp1.WDYagTQQm9ns.JhCgjQRTAOCT, 0, 0);
            i--;
        }
        this.QiMR8OkAhezm = false;
    }

    public final int giKS3J6vZuNy(int i) {
        defpackage.wp1[] wp1VarArr = this.WDYagTQQm9ns;
        defpackage.wp1 wp1Var = wp1VarArr[i];
        int i2 = wp1Var.QiMR8OkAhezm;
        if (i2 < wp1Var.oh71FJcDz6S2) {
            return i;
        }
        java.lang.Object[] objArr = wp1Var.WDYagTQQm9ns;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        java.lang.Object obj = objArr[i2];
        obj.getClass();
        defpackage.vp1 vp1Var = (defpackage.vp1) obj;
        if (i == 6) {
            defpackage.wp1 wp1Var2 = wp1VarArr[i + 1];
            java.lang.Object[] objArr2 = vp1Var.JhCgjQRTAOCT;
            wp1Var2.ZpBGe2uQfcn8(objArr2, objArr2.length, 0);
        } else {
            wp1VarArr[i + 1].ZpBGe2uQfcn8(vp1Var.JhCgjQRTAOCT, java.lang.Integer.bitCount(vp1Var.ZpBGe2uQfcn8) * 2, 0);
        }
        return giKS3J6vZuNy(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.QiMR8OkAhezm;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.QiMR8OkAhezm) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        java.lang.Object next = this.WDYagTQQm9ns[this.oh71FJcDz6S2].next();
        ZpBGe2uQfcn8();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
