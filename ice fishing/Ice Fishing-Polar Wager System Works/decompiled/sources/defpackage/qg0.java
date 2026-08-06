package defpackage;

/* loaded from: classes.dex */
public abstract class qg0 {
    public int AARZUJiTa;
    public java.lang.Object EXtogiMhuM;
    public int adDC3e2L;
    public int xiZrDbcSW0;

    public qg0() {
        if (defpackage.c41.xiZrDbcSW0 == null) {
            defpackage.c41.xiZrDbcSW0 = new defpackage.c41(14);
        }
    }

    public int IHQe1A4L2xu(int i) {
        if (i < this.AARZUJiTa) {
            return ((java.nio.ByteBuffer) this.EXtogiMhuM).getShort(this.xiZrDbcSW0 + i);
        }
        return 0;
    }

    public boolean hasNext() {
        return this.adDC3e2L < ((defpackage.rg0) this.EXtogiMhuM).SH1y5HwkJhh;
    }

    public void oh6vYeIP() {
        if (((defpackage.rg0) this.EXtogiMhuM).JlrlGoKF != this.AARZUJiTa) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void r1MBDhnF() {
        while (true) {
            int i = this.adDC3e2L;
            defpackage.rg0 rg0Var = (defpackage.rg0) this.EXtogiMhuM;
            if (i >= rg0Var.SH1y5HwkJhh || rg0Var.AARZUJiTa[i] >= 0) {
                return;
            } else {
                this.adDC3e2L = i + 1;
            }
        }
    }

    public void remove() {
        defpackage.rg0 rg0Var = (defpackage.rg0) this.EXtogiMhuM;
        oh6vYeIP();
        if (this.xiZrDbcSW0 == -1) {
            defpackage.db.AARZUJiTa("Call next() before removing element from the iterator.");
            return;
        }
        rg0Var.r1MBDhnF();
        rg0Var.ez2rX8ReCYw(this.xiZrDbcSW0);
        this.xiZrDbcSW0 = -1;
        this.AARZUJiTa = rg0Var.JlrlGoKF;
    }
}
