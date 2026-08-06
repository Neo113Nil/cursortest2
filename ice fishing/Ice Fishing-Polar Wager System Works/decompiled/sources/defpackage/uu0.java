package defpackage;

/* loaded from: classes.dex */
public final class uu0 extends defpackage.NHJTzaLwkd {
    public final defpackage.su0 AARZUJiTa;
    public int EXtogiMhuM;
    public int SH1y5HwkJhh;
    public defpackage.xi1 riuEU0zW4;

    public uu0(defpackage.su0 su0Var, int i) {
        super(i, su0Var.JlrlGoKF);
        this.AARZUJiTa = su0Var;
        this.EXtogiMhuM = su0Var.xiZrDbcSW0();
        this.SH1y5HwkJhh = -1;
        oh6vYeIP();
    }

    public final void IHQe1A4L2xu() {
        if (this.EXtogiMhuM != this.AARZUJiTa.xiZrDbcSW0()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // defpackage.NHJTzaLwkd, java.util.ListIterator
    public final void add(java.lang.Object obj) {
        IHQe1A4L2xu();
        int i = this.adDC3e2L;
        defpackage.su0 su0Var = this.AARZUJiTa;
        su0Var.add(i, obj);
        this.adDC3e2L++;
        this.xiZrDbcSW0 = su0Var.IHQe1A4L2xu();
        this.EXtogiMhuM = su0Var.xiZrDbcSW0();
        this.SH1y5HwkJhh = -1;
        oh6vYeIP();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        IHQe1A4L2xu();
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        int i = this.adDC3e2L;
        this.SH1y5HwkJhh = i;
        defpackage.xi1 xi1Var = this.riuEU0zW4;
        defpackage.su0 su0Var = this.AARZUJiTa;
        if (xi1Var == null) {
            java.lang.Object[] objArr = su0Var.ez2rX8ReCYw;
            this.adDC3e2L = i + 1;
            return objArr[i];
        }
        if (xi1Var.hasNext()) {
            this.adDC3e2L++;
            return xi1Var.next();
        }
        java.lang.Object[] objArr2 = su0Var.ez2rX8ReCYw;
        int i2 = this.adDC3e2L;
        this.adDC3e2L = i2 + 1;
        return objArr2[i2 - xi1Var.xiZrDbcSW0];
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void oh6vYeIP() {
        defpackage.su0 su0Var = this.AARZUJiTa;
        java.lang.Object[] objArr = su0Var.SH1y5HwkJhh;
        if (objArr == null) {
            this.riuEU0zW4 = null;
            return;
        }
        int i = (su0Var.JlrlGoKF - 1) & (-32);
        int i2 = this.adDC3e2L;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (su0Var.EXtogiMhuM / 5) + 1;
        defpackage.xi1 xi1Var = this.riuEU0zW4;
        if (xi1Var == null) {
            this.riuEU0zW4 = new defpackage.xi1(objArr, i2, i, i3);
            return;
        }
        xi1Var.adDC3e2L = i2;
        xi1Var.xiZrDbcSW0 = i;
        xi1Var.AARZUJiTa = i3;
        if (xi1Var.EXtogiMhuM.length < i3) {
            xi1Var.EXtogiMhuM = new java.lang.Object[i3];
        }
        xi1Var.EXtogiMhuM[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        xi1Var.riuEU0zW4 = r0;
        xi1Var.oh6vYeIP(i2 - r0, 1);
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        IHQe1A4L2xu();
        if (!hasPrevious()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        int i = this.adDC3e2L;
        this.SH1y5HwkJhh = i - 1;
        defpackage.xi1 xi1Var = this.riuEU0zW4;
        defpackage.su0 su0Var = this.AARZUJiTa;
        if (xi1Var == null) {
            java.lang.Object[] objArr = su0Var.ez2rX8ReCYw;
            int i2 = i - 1;
            this.adDC3e2L = i2;
            return objArr[i2];
        }
        int i3 = xi1Var.xiZrDbcSW0;
        if (i <= i3) {
            this.adDC3e2L = i - 1;
            return xi1Var.previous();
        }
        java.lang.Object[] objArr2 = su0Var.ez2rX8ReCYw;
        int i4 = i - 1;
        this.adDC3e2L = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.NHJTzaLwkd, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        IHQe1A4L2xu();
        int i = this.SH1y5HwkJhh;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.su0 su0Var = this.AARZUJiTa;
        su0Var.oh6vYeIP(i);
        int i2 = this.SH1y5HwkJhh;
        if (i2 < this.adDC3e2L) {
            this.adDC3e2L = i2;
        }
        this.xiZrDbcSW0 = su0Var.IHQe1A4L2xu();
        this.EXtogiMhuM = su0Var.xiZrDbcSW0();
        this.SH1y5HwkJhh = -1;
        oh6vYeIP();
    }

    @Override // defpackage.NHJTzaLwkd, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        IHQe1A4L2xu();
        int i = this.SH1y5HwkJhh;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.su0 su0Var = this.AARZUJiTa;
        su0Var.set(i, obj);
        this.EXtogiMhuM = su0Var.xiZrDbcSW0();
        oh6vYeIP();
    }
}
