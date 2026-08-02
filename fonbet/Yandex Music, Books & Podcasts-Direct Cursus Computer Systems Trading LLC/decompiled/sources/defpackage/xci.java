package defpackage;

/* loaded from: classes.dex */
public abstract class xci implements sv7 {
    public tf6 b;
    public int c;
    public xci e;
    public xci f;
    public fkj g;
    public f8j h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ssb m;
    public boolean n;
    public xci a = this;
    public int d = -1;

    public final mm6 G0() {
        tf6 tf6Var = this.b;
        if (tf6Var != null) {
            return tf6Var;
        }
        tf6 e = gld.e(bcx.G(this).getCoroutineContext().plus(new w2f((r2f) bcx.G(this).getCoroutineContext().get(o6c.l))));
        this.b = e;
        return e;
    }

    public boolean H0() {
        return !(this instanceof fpc);
    }

    public void I0() {
        if (this.n) {
            sme.b("node attached multiple times");
        }
        if (this.h == null) {
            sme.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void J0() {
        if (!this.n) {
            sme.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            sme.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            sme.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        tf6 tf6Var = this.b;
        if (tf6Var != null) {
            gld.L(tf6Var, new oic("The Modifier.Node was detached", 1));
            this.b = null;
        }
    }

    public void N0() {
        if (!this.n) {
            sme.b("reset() called on an unattached node");
        }
        M0();
    }

    public void O0() {
        if (!this.n) {
            sme.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            sme.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        K0();
        this.l = true;
    }

    public void P0() {
        if (!this.n) {
            sme.b("node detached multiple times");
        }
        if (this.h == null) {
            sme.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            sme.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        ssb ssbVar = this.m;
        if (ssbVar != null) {
            ssbVar.invoke();
        }
        L0();
    }

    public void Q0(xci xciVar) {
        this.a = xciVar;
    }

    public void R0(f8j f8jVar) {
        this.h = f8jVar;
    }

    public void K0() {
    }

    public void L0() {
    }

    public void M0() {
    }
}
