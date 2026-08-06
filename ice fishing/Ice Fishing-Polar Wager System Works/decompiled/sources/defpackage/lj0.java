package defpackage;

/* loaded from: classes.dex */
public abstract class lj0 implements defpackage.kn {
    public int AARZUJiTa;
    public boolean DFo87pBq1E5;
    public defpackage.o0 G3OKOH3wZRC;
    public defpackage.ip0 JlrlGoKF;
    public boolean QoRHpC4k;
    public defpackage.lj0 SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public boolean cnag84Bm;
    public defpackage.eq0 ez2rX8ReCYw;
    public boolean kd6TUFXn;
    public defpackage.lj0 riuEU0zW4;
    public defpackage.dj xiZrDbcSW0;
    public defpackage.lj0 adDC3e2L = this;
    public int EXtogiMhuM = -1;

    public void Ay906ovssqgN() {
        if (!this.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("node detached multiple times");
        }
        if (this.JlrlGoKF == null) {
            defpackage.x50.oh6vYeIP("detach invoked on a node without a coordinator");
        }
        if (!this.QoRHpC4k) {
            defpackage.x50.oh6vYeIP("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.QoRHpC4k = false;
        defpackage.o0 o0Var = this.G3OKOH3wZRC;
        if (o0Var != null) {
            o0Var.IHQe1A4L2xu();
        }
        yUiIS9dG7NYk();
    }

    public void FisHbM7NmV(defpackage.lj0 lj0Var) {
        this.adDC3e2L = lj0Var;
    }

    public boolean ZNF7fheNE() {
        return !(this instanceof defpackage.t7);
    }

    public void boH8X4DXyc4() {
        if (!this.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("reset() called on an unattached node");
        }
        juTJww2r();
    }

    public final defpackage.uj dOmtpLcqqI1y() {
        defpackage.dj djVar = this.xiZrDbcSW0;
        if (djVar != null) {
            return djVar;
        }
        defpackage.dj oh6vYeIP = defpackage.h1.oh6vYeIP(((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getCoroutineContext().JlrlGoKF(new defpackage.w80((defpackage.u80) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(this)).getCoroutineContext().cnag84Bm(defpackage.n.lpprD5VAS))));
        this.xiZrDbcSW0 = oh6vYeIP;
        return oh6vYeIP;
    }

    public void flIYPhR0() {
        if (this.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("node attached multiple times");
        }
        if (this.JlrlGoKF == null) {
            defpackage.x50.oh6vYeIP("attach invoked on a node without a coordinator");
        }
        this.kd6TUFXn = true;
        this.cnag84Bm = true;
    }

    public void k3hcgHS3MP() {
        if (!this.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("Cannot detach a node that is not attached");
        }
        if (this.cnag84Bm) {
            defpackage.x50.oh6vYeIP("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.QoRHpC4k) {
            defpackage.x50.oh6vYeIP("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.kd6TUFXn = false;
        defpackage.dj djVar = this.xiZrDbcSW0;
        if (djVar != null) {
            defpackage.h1.G3OKOH3wZRC(djVar, new defpackage.pj0("The Modifier.Node was detached", 2));
            this.xiZrDbcSW0 = null;
        }
    }

    public void seT5W8IHOge() {
        if (!this.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.cnag84Bm) {
            defpackage.x50.oh6vYeIP("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.cnag84Bm = false;
        JX5fKip1C6();
        this.QoRHpC4k = true;
    }

    public void xWQVQvEdoGv(defpackage.ip0 ip0Var) {
        this.JlrlGoKF = ip0Var;
    }

    public void JX5fKip1C6() {
    }

    public void juTJww2r() {
    }

    public void yUiIS9dG7NYk() {
    }
}
