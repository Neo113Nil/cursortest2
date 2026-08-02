package defpackage;

/* loaded from: classes2.dex */
public abstract class ymx extends md51 {
    public static final meo b = new meo();
    public final yh6 a;

    public ymx(yh6 yh6Var) {
        this.a = yh6Var;
    }

    public static md51 j(ymx ymxVar, tls tlsVar, tls tlsVar2, int i) {
        yh6 yh6Var = ymxVar.a;
        yh6Var.getClass();
        if (yh6Var instanceof p7x0) {
            yh6Var = zmx.a;
        }
        if ((i & 4) != 0) {
            tlsVar2 = null;
        }
        return ymxVar.i(yh6Var, tlsVar, tlsVar2);
    }

    public static md51 l(ymx ymxVar, tls tlsVar, tls tlsVar2, int i) {
        yh6 yh6Var = ymxVar.a;
        yh6Var.getClass();
        if (yh6Var instanceof p7x0) {
            yh6Var = zmx.a;
        }
        if ((i & 4) != 0) {
            tlsVar2 = null;
        }
        return ymxVar.k(yh6Var, tlsVar, tlsVar2);
    }

    @Override // defpackage.md51
    public final md51 a(tls tlsVar, tls tlsVar2) {
        return l(this, tlsVar, tlsVar2, 1);
    }

    @Override // defpackage.md51
    public final md51 b(tls tlsVar) {
        return l(this, new mtw(11), tlsVar, 1);
    }

    @Override // defpackage.md51
    public final void c(tls tlsVar) {
        l(this, new mtw(10), tlsVar, 1);
    }

    @Override // defpackage.md51
    public final md51 d(sls slsVar) {
        return j(this, new ic0(24, slsVar), new ic0(25, slsVar), 1);
    }

    @Override // defpackage.md51
    public final md51 e(c2e0 c2e0Var, c2e0 c2e0Var2) {
        return j(this, c2e0Var, c2e0Var2, 1);
    }

    @Override // defpackage.md51
    public final md51 f(tls tlsVar) {
        return j(this, new mtw(12), tlsVar, 1);
    }

    @Override // defpackage.md51
    public final md51 g(tls tlsVar) {
        return j(this, tlsVar, null, 5);
    }

    @Override // defpackage.md51
    public final md51 h(tls tlsVar) {
        return l(this, tlsVar, null, 5);
    }

    public abstract y4r0 i(yh6 yh6Var, tls tlsVar, tls tlsVar2);

    public abstract y4r0 k(yh6 yh6Var, tls tlsVar, tls tlsVar2);

    public abstract boolean m();

    public ymx() {
        this(zmx.a);
    }
}
