package defpackage;

/* loaded from: classes.dex */
public final class mn0 implements java.util.Iterator, defpackage.g90 {
    public final /* synthetic */ defpackage.nn0 AARZUJiTa;
    public int adDC3e2L = -1;
    public boolean xiZrDbcSW0;

    public mn0(defpackage.nn0 nn0Var) {
        this.AARZUJiTa = nn0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L + 1 < this.AARZUJiTa.oh6vYeIP.adDC3e2L();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        this.xiZrDbcSW0 = true;
        defpackage.qb1 qb1Var = this.AARZUJiTa.oh6vYeIP;
        int i = this.adDC3e2L + 1;
        this.adDC3e2L = i;
        return (defpackage.gn0) qb1Var.xiZrDbcSW0(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.xiZrDbcSW0) {
            defpackage.db.AARZUJiTa("You must call next() before you can remove an element");
            return;
        }
        defpackage.qb1 qb1Var = this.AARZUJiTa.oh6vYeIP;
        ((defpackage.gn0) qb1Var.xiZrDbcSW0(this.adDC3e2L)).AARZUJiTa = null;
        int i = this.adDC3e2L;
        java.lang.Object[] objArr = qb1Var.AARZUJiTa;
        java.lang.Object obj = objArr[i];
        java.lang.Object obj2 = defpackage.mj1.fnWB2E7cs;
        if (obj != obj2) {
            objArr[i] = obj2;
            qb1Var.adDC3e2L = true;
        }
        this.adDC3e2L = i - 1;
        this.xiZrDbcSW0 = false;
    }
}
