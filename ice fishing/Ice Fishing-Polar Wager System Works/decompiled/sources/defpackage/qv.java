package defpackage;

/* loaded from: classes.dex */
public final class qv implements java.util.Iterator, defpackage.g90 {
    public java.lang.Object EXtogiMhuM;
    public final /* synthetic */ defpackage.y71 riuEU0zW4;
    public final java.util.Iterator xiZrDbcSW0;
    public final /* synthetic */ int adDC3e2L = 0;
    public int AARZUJiTa = -1;

    public qv(defpackage.rv rvVar) {
        this.riuEU0zW4 = rvVar;
        this.xiZrDbcSW0 = new defpackage.di1((defpackage.ue1) rvVar.oh6vYeIP);
    }

    public void IHQe1A4L2xu() {
        java.lang.Object next;
        defpackage.rv rvVar = (defpackage.rv) this.riuEU0zW4;
        do {
            java.util.Iterator it = this.xiZrDbcSW0;
            if (!it.hasNext()) {
                this.AARZUJiTa = 0;
                return;
            }
            next = it.next();
        } while (((java.lang.Boolean) ((defpackage.r41) rvVar.r1MBDhnF).AARZUJiTa(next)).booleanValue());
        this.EXtogiMhuM = next;
        this.AARZUJiTa = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.adDC3e2L) {
            case 0:
                if (this.AARZUJiTa == -1) {
                    IHQe1A4L2xu();
                }
                if (this.AARZUJiTa == 1) {
                }
                break;
            default:
                if (this.AARZUJiTa == -1) {
                    oh6vYeIP();
                }
                if (this.AARZUJiTa == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.adDC3e2L) {
            case 0:
                if (this.AARZUJiTa == -1) {
                    IHQe1A4L2xu();
                }
                if (this.AARZUJiTa == 0) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    java.lang.Object obj = this.EXtogiMhuM;
                    this.EXtogiMhuM = null;
                    this.AARZUJiTa = -1;
                    break;
                }
            default:
                if (this.AARZUJiTa == -1) {
                    oh6vYeIP();
                }
                if (this.AARZUJiTa == 0) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    java.lang.Object obj2 = this.EXtogiMhuM;
                    this.EXtogiMhuM = null;
                    this.AARZUJiTa = -1;
                    break;
                }
        }
        return null;
    }

    public void oh6vYeIP() {
        java.util.Iterator it = this.xiZrDbcSW0;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) ((defpackage.ue1) this.riuEU0zW4).r1MBDhnF.AARZUJiTa(next)).booleanValue()) {
                this.AARZUJiTa = 1;
                this.EXtogiMhuM = next;
                return;
            }
        }
        this.AARZUJiTa = 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qv(defpackage.ue1 ue1Var) {
        this.riuEU0zW4 = ue1Var;
        this.xiZrDbcSW0 = ue1Var.oh6vYeIP.iterator();
    }
}
