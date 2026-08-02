package defpackage;

/* loaded from: classes4.dex */
public final class jvo {
    public final hn5 a;
    public final fnb b;
    public final dk4 c;
    public final f7l d;

    public jvo(hn5 hn5Var, fnb fnbVar, dk4 dk4Var, f7l f7lVar) {
        hn5Var.getClass();
        fnbVar.getClass();
        this.a = hn5Var;
        this.b = fnbVar;
        this.c = dk4Var;
        this.d = f7lVar;
        hn5Var.getLifecycle().a(new xnn(4, this));
    }

    public final boolean a(v84 v84Var) {
        d6l x;
        n7q n7qVar;
        mwk b;
        v84Var.getClass();
        int ordinal = v84Var.ordinal();
        if (ordinal == 0) {
            new j2n(this.a, this.b, r1n.a, l2n.a, false).m();
            return true;
        }
        if (ordinal == 1) {
            dk4 dk4Var = this.c;
            hn5 hn5Var = this.a;
            if (dk4Var.e(hn5Var) && (x = p6g.x((e6l) this.d.c.getValue())) != null && (n7qVar = x.a) != null && (b = n7qVar.b()) != null) {
                xee Y = v3g.Y(b, h74.b);
                if (Y instanceof f94) {
                    return false;
                }
                if (Y instanceof e94) {
                    new lum(hn5Var).Q(((e94) Y).j);
                    return true;
                }
                b6e.s();
                return false;
            }
        } else if (ordinal != 2) {
            b6e.s();
            return false;
        }
        return true;
    }
}
