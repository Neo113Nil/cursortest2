package defpackage;

/* loaded from: classes.dex */
public final class fa1 implements defpackage.hh, java.lang.Iterable, defpackage.g90 {
    public int EXtogiMhuM;
    public int JlrlGoKF;
    public java.util.HashMap SyNS6RMn;
    public defpackage.xk0 cnag84Bm;
    public boolean ez2rX8ReCYw;
    public int riuEU0zW4;
    public int xiZrDbcSW0;
    public int[] adDC3e2L = new int[0];
    public java.lang.Object[] AARZUJiTa = new java.lang.Object[0];
    public final java.lang.Object SH1y5HwkJhh = new java.lang.Object();
    public java.util.ArrayList DFo87pBq1E5 = new java.util.ArrayList();

    public final defpackage.v10 AARZUJiTa(int i) {
        int i2;
        java.util.ArrayList arrayList;
        int adDC3e2L;
        java.util.HashMap hashMap = this.SyNS6RMn;
        if (hashMap != null) {
            if (this.ez2rX8ReCYw) {
                defpackage.dh.IHQe1A4L2xu("use active SlotWriter to crate an anchor for location instead");
            }
            defpackage.o10 o10Var = (i < 0 || i >= (i2 = this.xiZrDbcSW0) || (adDC3e2L = defpackage.ha1.adDC3e2L((arrayList = this.DFo87pBq1E5), i, i2)) < 0) ? null : (defpackage.o10) arrayList.get(adDC3e2L);
            if (o10Var != null) {
                return (defpackage.v10) hashMap.get(o10Var);
            }
        }
        return null;
    }

    public final int IHQe1A4L2xu(defpackage.o10 o10Var) {
        if (this.ez2rX8ReCYw) {
            defpackage.dh.IHQe1A4L2xu("Use active SlotWriter to determine anchor location instead");
        }
        if (!o10Var.IHQe1A4L2xu()) {
            defpackage.nw0.IHQe1A4L2xu("Anchor refers to a group that was removed");
        }
        return o10Var.IHQe1A4L2xu;
    }

    public final defpackage.ia1 adDC3e2L() {
        if (this.ez2rX8ReCYw) {
            defpackage.dh.IHQe1A4L2xu("Cannot start a writer when another writer is pending");
        }
        if (this.riuEU0zW4 > 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot start a writer when a reader is pending");
        }
        this.ez2rX8ReCYw = true;
        this.JlrlGoKF++;
        return new defpackage.ia1(this);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.b30(this, 0, this.xiZrDbcSW0);
    }

    public final void oh6vYeIP() {
        this.SyNS6RMn = new java.util.HashMap();
    }

    public final defpackage.ea1 r1MBDhnF() {
        if (this.ez2rX8ReCYw) {
            defpackage.db.AARZUJiTa("Cannot read while a writer is pending");
            return null;
        }
        this.riuEU0zW4++;
        return new defpackage.ea1(this);
    }

    public final boolean xiZrDbcSW0(defpackage.o10 o10Var) {
        int adDC3e2L;
        return o10Var.IHQe1A4L2xu() && (adDC3e2L = defpackage.ha1.adDC3e2L(this.DFo87pBq1E5, o10Var.IHQe1A4L2xu, this.xiZrDbcSW0)) >= 0 && defpackage.x70.QoRHpC4k(this.DFo87pBq1E5.get(adDC3e2L), o10Var);
    }
}
