package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ul0 implements defpackage.wo {
    public defpackage.ul0 GE9mJIPrb8gP;
    public defpackage.us0 Ns0WNyEWdPsk;
    public int QiMR8OkAhezm;
    public boolean T1fB7bDYiVJQ;
    public defpackage.l WmetiUbpKU9I;
    public boolean XntWc4eZSQ8j;
    public defpackage.ul0 e6mdH7fiFuta;
    public defpackage.sr0 fNwYGHIYeJcR;
    public boolean gUjdnLbkVAaA;
    public boolean h3m55N1URyyK;
    public defpackage.jl oh71FJcDz6S2;
    public boolean s0TASMVLSWD5;
    public defpackage.ul0 WDYagTQQm9ns = this;
    public int P05cfTpS5W5L = -1;

    public void ARgw6UjYb9W7(defpackage.ul0 ul0Var) {
        this.WDYagTQQm9ns = ul0Var;
    }

    public void K0gkXZrJwRZi() {
        if (!this.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.T1fB7bDYiVJQ) {
            defpackage.e80.giKS3J6vZuNy("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.T1fB7bDYiVJQ = false;
        ZEXjjCYihNTt();
        this.XntWc4eZSQ8j = true;
    }

    public boolean RIHPIrzkudeW() {
        return !(this instanceof defpackage.k9);
    }

    public void S0c5Wv6LbIVo() {
        if (this.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("node attached multiple times");
        }
        if (this.fNwYGHIYeJcR == null) {
            defpackage.e80.giKS3J6vZuNy("attach invoked on a node without a coordinator");
        }
        this.s0TASMVLSWD5 = true;
        this.T1fB7bDYiVJQ = true;
    }

    public void SJaTq1YjP6B8(defpackage.sr0 sr0Var) {
        this.fNwYGHIYeJcR = sr0Var;
    }

    public void TlJvUa0ZXCBu() {
        if (!this.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("Cannot detach a node that is not attached");
        }
        if (this.T1fB7bDYiVJQ) {
            defpackage.e80.giKS3J6vZuNy("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.XntWc4eZSQ8j) {
            defpackage.e80.giKS3J6vZuNy("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.s0TASMVLSWD5 = false;
        defpackage.jl jlVar = this.oh71FJcDz6S2;
        if (jlVar != null) {
            defpackage.ok0.BHfvd2J71qpO(jlVar, new defpackage.yl0("The Modifier.Node was detached", 2));
            this.oh71FJcDz6S2 = null;
        }
    }

    public void Ux2tdpxXtKdg() {
        if (!this.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("node detached multiple times");
        }
        if (this.fNwYGHIYeJcR == null) {
            defpackage.e80.giKS3J6vZuNy("detach invoked on a node without a coordinator");
        }
        if (!this.XntWc4eZSQ8j) {
            defpackage.e80.giKS3J6vZuNy("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.XntWc4eZSQ8j = false;
        defpackage.l lVar = this.WmetiUbpKU9I;
        if (lVar != null) {
            lVar.ZpBGe2uQfcn8();
        }
        awuGf4qH8HFd();
    }

    public final defpackage.sm XuMcJunjB8iA() {
        defpackage.jl jlVar = this.oh71FJcDz6S2;
        if (jlVar != null) {
            return jlVar;
        }
        defpackage.jl QiMR8OkAhezm = defpackage.ok0.QiMR8OkAhezm(((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getCoroutineContext().fNwYGHIYeJcR(new defpackage.eb0((defpackage.cb0) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(this)).getCoroutineContext().XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8))));
        this.oh71FJcDz6S2 = QiMR8OkAhezm;
        return QiMR8OkAhezm;
    }

    public void ZdAZC2JJ1p6Z() {
        if (!this.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("reset() called on an unattached node");
        }
        Wx2ec0FCRg9J();
    }

    public void Wx2ec0FCRg9J() {
    }

    public void ZEXjjCYihNTt() {
    }

    public void awuGf4qH8HFd() {
    }
}
