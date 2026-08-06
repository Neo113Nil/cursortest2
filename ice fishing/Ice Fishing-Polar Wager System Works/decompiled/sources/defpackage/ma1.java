package defpackage;

/* loaded from: classes.dex */
public final class ma1 implements java.util.Iterator {
    public java.util.Iterator AARZUJiTa;
    public final /* synthetic */ defpackage.ka1 EXtogiMhuM;
    public int adDC3e2L = -1;
    public boolean xiZrDbcSW0;

    public ma1(defpackage.ka1 ka1Var) {
        this.EXtogiMhuM = ka1Var;
    }

    public final java.util.Iterator IHQe1A4L2xu() {
        if (this.AARZUJiTa == null) {
            this.AARZUJiTa = this.EXtogiMhuM.xiZrDbcSW0.entrySet().iterator();
        }
        return this.AARZUJiTa;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.adDC3e2L + 1;
        defpackage.ka1 ka1Var = this.EXtogiMhuM;
        return i < ka1Var.adDC3e2L.size() || (!ka1Var.xiZrDbcSW0.isEmpty() && IHQe1A4L2xu().hasNext());
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        this.xiZrDbcSW0 = true;
        int i = this.adDC3e2L + 1;
        this.adDC3e2L = i;
        defpackage.ka1 ka1Var = this.EXtogiMhuM;
        return i < ka1Var.adDC3e2L.size() ? (java.util.Map.Entry) ka1Var.adDC3e2L.get(this.adDC3e2L) : (java.util.Map.Entry) IHQe1A4L2xu().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.xiZrDbcSW0) {
            defpackage.db.AARZUJiTa("remove() was called before next()");
            return;
        }
        this.xiZrDbcSW0 = false;
        int i = defpackage.ka1.SH1y5HwkJhh;
        defpackage.ka1 ka1Var = this.EXtogiMhuM;
        ka1Var.oh6vYeIP();
        if (this.adDC3e2L >= ka1Var.adDC3e2L.size()) {
            IHQe1A4L2xu().remove();
            return;
        }
        int i2 = this.adDC3e2L;
        this.adDC3e2L = i2 - 1;
        ka1Var.EXtogiMhuM(i2);
    }
}
