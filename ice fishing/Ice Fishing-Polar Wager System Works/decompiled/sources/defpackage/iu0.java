package defpackage;

/* loaded from: classes.dex */
public abstract class iu0 implements java.util.Iterator, defpackage.g90 {
    public boolean AARZUJiTa = true;
    public final defpackage.zi1[] adDC3e2L;
    public int xiZrDbcSW0;

    public iu0(defpackage.yi1 yi1Var, defpackage.zi1[] zi1VarArr) {
        this.adDC3e2L = zi1VarArr;
        zi1VarArr[0].IHQe1A4L2xu(yi1Var.F7NU4MC0GW, java.lang.Integer.bitCount(yi1Var.IHQe1A4L2xu) * 2, 0);
        this.xiZrDbcSW0 = 0;
        IHQe1A4L2xu();
    }

    public final void IHQe1A4L2xu() {
        int i = this.xiZrDbcSW0;
        defpackage.zi1[] zi1VarArr = this.adDC3e2L;
        defpackage.zi1 zi1Var = zi1VarArr[i];
        if (zi1Var.AARZUJiTa < zi1Var.xiZrDbcSW0) {
            return;
        }
        while (-1 < i) {
            int oh6vYeIP = oh6vYeIP(i);
            if (oh6vYeIP == -1) {
                defpackage.zi1 zi1Var2 = zi1VarArr[i];
                int i2 = zi1Var2.AARZUJiTa;
                java.lang.Object[] objArr = zi1Var2.adDC3e2L;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    zi1Var2.AARZUJiTa = i2 + 1;
                    oh6vYeIP = oh6vYeIP(i);
                }
            }
            if (oh6vYeIP != -1) {
                this.xiZrDbcSW0 = oh6vYeIP;
                return;
            }
            if (i > 0) {
                defpackage.zi1 zi1Var3 = zi1VarArr[i - 1];
                int i3 = zi1Var3.AARZUJiTa;
                int length2 = zi1Var3.adDC3e2L.length;
                zi1Var3.AARZUJiTa = i3 + 1;
            }
            zi1VarArr[i].IHQe1A4L2xu(defpackage.yi1.adDC3e2L.F7NU4MC0GW, 0, 0);
            i--;
        }
        this.AARZUJiTa = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AARZUJiTa;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.AARZUJiTa) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        java.lang.Object next = this.adDC3e2L[this.xiZrDbcSW0].next();
        IHQe1A4L2xu();
        return next;
    }

    public final int oh6vYeIP(int i) {
        defpackage.zi1[] zi1VarArr = this.adDC3e2L;
        defpackage.zi1 zi1Var = zi1VarArr[i];
        int i2 = zi1Var.AARZUJiTa;
        if (i2 < zi1Var.xiZrDbcSW0) {
            return i;
        }
        java.lang.Object[] objArr = zi1Var.adDC3e2L;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        java.lang.Object obj = objArr[i2];
        obj.getClass();
        defpackage.yi1 yi1Var = (defpackage.yi1) obj;
        if (i == 6) {
            defpackage.zi1 zi1Var2 = zi1VarArr[i + 1];
            java.lang.Object[] objArr2 = yi1Var.F7NU4MC0GW;
            zi1Var2.IHQe1A4L2xu(objArr2, objArr2.length, 0);
        } else {
            zi1VarArr[i + 1].IHQe1A4L2xu(yi1Var.F7NU4MC0GW, java.lang.Integer.bitCount(yi1Var.IHQe1A4L2xu) * 2, 0);
        }
        return oh6vYeIP(i + 1);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
