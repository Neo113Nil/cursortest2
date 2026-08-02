package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class dr5 implements bwh, dra {
    public final Object a;
    public x0 b;
    public cra c;
    public final /* synthetic */ fr5 d;

    public dr5(fr5 fr5Var, Object obj) {
        this.d = fr5Var;
        this.b = fr5Var.t(null);
        this.c = new cra(fr5Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.bwh
    public final void A(int i, uvh uvhVar, cfg cfgVar, boh bohVar, int i2) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            x0Var.getClass();
            x0Var.x(new sj7(x0Var, cfgVar, b, i2));
        }
    }

    @Override // defpackage.bwh
    public final void C(int i, uvh uvhVar, boh bohVar) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            x0Var.getClass();
            x0Var.x(new suh(3, x0Var, b));
        }
    }

    @Override // defpackage.bwh
    public final void J(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            x0Var.getClass();
            x0Var.x(new yvh(x0Var, cfgVar, b, 1));
        }
    }

    @Override // defpackage.bwh
    public final void K(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            x0Var.getClass();
            x0Var.x(new yvh(x0Var, cfgVar, b, 0));
        }
    }

    @Override // defpackage.dra
    public final void T(int i, uvh uvhVar) {
        if (a(i, uvhVar)) {
            this.c.f();
        }
    }

    public final boolean a(int i, uvh uvhVar) {
        uvh uvhVar2;
        Object obj = this.a;
        fr5 fr5Var = this.d;
        if (uvhVar != null) {
            uvhVar2 = fr5Var.A(obj, uvhVar);
            if (uvhVar2 == null) {
                return false;
            }
        } else {
            uvhVar2 = null;
        }
        int C = fr5Var.C(i, obj);
        x0 x0Var = this.b;
        if (x0Var.b != C || !Objects.equals((uvh) x0Var.c, uvhVar2)) {
            this.b = new x0((CopyOnWriteArrayList) fr5Var.c.d, C, uvhVar2);
        }
        cra craVar = this.c;
        if (craVar.a == C && Objects.equals(craVar.b, uvhVar2)) {
            return true;
        }
        this.c = new cra(fr5Var.d.c, C, uvhVar2);
        return true;
    }

    public final boh b(boh bohVar, uvh uvhVar) {
        long j = bohVar.f;
        fr5 fr5Var = this.d;
        Object obj = this.a;
        long B = fr5Var.B(j, obj);
        long j2 = bohVar.g;
        long B2 = fr5Var.B(j2, obj);
        return (B == j && B2 == j2) ? bohVar : new boh(bohVar.a, bohVar.b, bohVar.c, bohVar.d, bohVar.e, B, B2);
    }

    @Override // defpackage.dra
    public final void d(int i, uvh uvhVar, Exception exc) {
        if (a(i, uvhVar)) {
            this.c.e(exc);
        }
    }

    @Override // defpackage.bwh
    public final void f(int i, uvh uvhVar, boh bohVar) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            uvh uvhVar2 = (uvh) x0Var.c;
            uvhVar2.getClass();
            x0Var.x(new u13(13, x0Var, uvhVar2, b));
        }
    }

    @Override // defpackage.dra
    public final void g(int i, uvh uvhVar, int i2) {
        if (a(i, uvhVar)) {
            this.c.d(i2);
        }
    }

    @Override // defpackage.bwh
    public final void i(int i, uvh uvhVar, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        if (a(i, uvhVar)) {
            x0 x0Var = this.b;
            boh b = b(bohVar, uvhVar);
            x0Var.getClass();
            x0Var.x(new fj7(x0Var, cfgVar, b, iOException, z));
        }
    }

    @Override // defpackage.dra
    public final void r(int i, uvh uvhVar) {
        if (a(i, uvhVar)) {
            this.c.c();
        }
    }

    @Override // defpackage.dra
    public final void w(int i, uvh uvhVar) {
        if (a(i, uvhVar)) {
            this.c.b();
        }
    }

    @Override // defpackage.dra
    public final void x(int i, uvh uvhVar) {
        if (a(i, uvhVar)) {
            this.c.a();
        }
    }
}
