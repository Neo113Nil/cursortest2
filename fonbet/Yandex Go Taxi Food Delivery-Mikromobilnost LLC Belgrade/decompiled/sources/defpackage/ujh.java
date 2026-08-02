package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ujh implements yvf0 {
    public final /* synthetic */ int a = 0;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;

    public ujh(yvf0 yvf0Var, yvf0 yvf0Var2, qom0 qom0Var, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.f = qom0Var;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.f;
        yvf0 yvf0Var2 = this.e;
        yvf0 yvf0Var3 = this.d;
        yvf0 yvf0Var4 = this.c;
        yvf0 yvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new tjh((Executor) yvf0Var5.get(), (x820) yvf0Var4.get(), (am2) ((qom0) yvf0Var).get(), (ugo) yvf0Var3.get(), (w0x0) yvf0Var2.get());
            default:
                return new z811((s3c) yvf0Var5.get(), (s3c) yvf0Var4.get(), (tjh) ((ujh) yvf0Var3).get(), (wd21) ((xd21) yvf0Var2).get(), (ofa0) ((qom0) yvf0Var).get());
        }
    }

    public ujh(yvf0 yvf0Var, yvf0 yvf0Var2, ujh ujhVar, xd21 xd21Var, qom0 qom0Var) {
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = ujhVar;
        this.e = xd21Var;
        this.f = qom0Var;
    }
}
