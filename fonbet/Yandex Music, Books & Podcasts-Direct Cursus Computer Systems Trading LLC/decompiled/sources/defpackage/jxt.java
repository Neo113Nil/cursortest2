package defpackage;

/* loaded from: classes5.dex */
public abstract class jxt {
    public final yxt a;

    public jxt(yxt yxtVar) {
        this.a = yxtVar;
    }

    public final String a() {
        return "<Variable type: " + this.a + ", value: " + bkp.S(b()) + ">";
    }

    public abstract q1f b();

    public final boolean c() {
        yxt yxtVar = yxt.Boolean;
        vc3 vc3Var = this.a == yxtVar ? (vc3) this : null;
        mac macVar = new mac(this, yxtVar);
        if (vc3Var != null) {
            return vc3Var.b;
        }
        throw macVar;
    }

    public final double d() {
        yxt yxtVar = yxt.Double;
        r9a r9aVar = this.a == yxtVar ? (r9a) this : null;
        mac macVar = new mac(this, yxtVar);
        if (r9aVar != null) {
            return r9aVar.b;
        }
        throw macVar;
    }

    public final int e() {
        yxt yxtVar = yxt.Int;
        jqe jqeVar = this.a == yxtVar ? (jqe) this : null;
        mac macVar = new mac(this, yxtVar);
        if (jqeVar != null) {
            return jqeVar.b;
        }
        throw macVar;
    }

    public final String f() {
        yxt yxtVar = yxt.String_;
        elr elrVar = this.a == yxtVar ? (elr) this : null;
        mac macVar = new mac(this, yxtVar);
        if (elrVar != null) {
            return elrVar.b;
        }
        throw macVar;
    }
}
