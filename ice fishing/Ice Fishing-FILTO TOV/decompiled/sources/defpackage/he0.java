package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class he0 implements xk {
    public int AvO7iQsrTN;
    public bk0 E7jCp8Ls;
    public ug EljAMC1QTz;
    public he0 JFJ3QoxA;
    public boolean Mjvvu5DE;
    public boolean WIEu4Ya2g8;
    public boolean XnEVoBF0td1l;
    public psOJLYhIz YmKjaVtbfp5Z;
    public boolean iwATDS1i01k;
    public he0 mOu10nynGul;
    public tk0 rQPn8YBR;
    public boolean uFEq9NpZ;
    public he0 OOA6hdeuvCS = this;
    public int encWxUiV2 = -1;

    public void FhVkB11j() {
        if (!this.Mjvvu5DE) {
            t10.Yi7zF1RB1("node detached multiple times");
        }
        if (this.E7jCp8Ls == null) {
            t10.Yi7zF1RB1("detach invoked on a node without a coordinator");
        }
        if (!this.WIEu4Ya2g8) {
            t10.Yi7zF1RB1("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.WIEu4Ya2g8 = false;
        psOJLYhIz psojlyhiz = this.YmKjaVtbfp5Z;
        if (psojlyhiz != null) {
            psojlyhiz.GWasM1elztuh();
        }
        bCsSzSHkbaQ();
    }

    public boolean UjhVk5crk() {
        return !(this instanceof f6);
    }

    public void WkXHDbKiD() {
        if (this.Mjvvu5DE) {
            t10.Yi7zF1RB1("node attached multiple times");
        }
        if (this.E7jCp8Ls == null) {
            t10.Yi7zF1RB1("attach invoked on a node without a coordinator");
        }
        this.Mjvvu5DE = true;
        this.iwATDS1i01k = true;
    }

    public void hOpoc9RpANL() {
        if (!this.Mjvvu5DE) {
            t10.Yi7zF1RB1("reset() called on an unattached node");
        }
        gHe2tSmr6w();
    }

    public void j6IIN2O8eOU(he0 he0Var) {
        this.OOA6hdeuvCS = he0Var;
    }

    public void kbVzROOfKK() {
        if (!this.Mjvvu5DE) {
            t10.Yi7zF1RB1("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.iwATDS1i01k) {
            t10.Yi7zF1RB1("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.iwATDS1i01k = false;
        cTIXpaxc();
        this.WIEu4Ya2g8 = true;
    }

    public final ph oFzb77RX3H8t() {
        ug ugVar = this.EljAMC1QTz;
        if (ugVar != null) {
            return ugVar;
        }
        ug X1lG3V04pd = fb1.X1lG3V04pd(((c) vc0.A1EKNP6CxJ(this)).getCoroutineContext().mOu10nynGul(new h40((f40) ((c) vc0.A1EKNP6CxJ(this)).getCoroutineContext().E7jCp8Ls(b9xEq24R1.VeqTn1PQw7))));
        this.EljAMC1QTz = X1lG3V04pd;
        return X1lG3V04pd;
    }

    public void vaTCmWUgXF() {
        if (!this.Mjvvu5DE) {
            t10.Yi7zF1RB1("Cannot detach a node that is not attached");
        }
        if (this.iwATDS1i01k) {
            t10.Yi7zF1RB1("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.WIEu4Ya2g8) {
            t10.Yi7zF1RB1("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.Mjvvu5DE = false;
        ug ugVar = this.EljAMC1QTz;
        if (ugVar != null) {
            le0 le0Var = new le0("The Modifier.Node was detached", 2);
            f40 f40Var = (f40) ugVar.OOA6hdeuvCS.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
            if (f40Var == null) {
                o4.EljAMC1QTz(ugVar, "Scope cannot be cancelled because it does not have a job: ");
            } else {
                f40Var.GWasM1elztuh(le0Var);
                this.EljAMC1QTz = null;
            }
        }
    }

    public void xtv4Xm13vGi(bk0 bk0Var) {
        this.E7jCp8Ls = bk0Var;
    }

    public void bCsSzSHkbaQ() {
    }

    public void cTIXpaxc() {
    }

    public void gHe2tSmr6w() {
    }
}
