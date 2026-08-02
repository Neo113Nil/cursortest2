package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class x2q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk3 b;

    public /* synthetic */ x2q(yk3 yk3Var, int i) {
        this.a = i;
        this.b = yk3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jd jdVar;
        switch (this.a) {
            case 0:
                qld.J(new x2q(this.b, 1));
                return Unit.a;
            default:
                yk3 yk3Var = this.b;
                synchronized (yk3Var.b) {
                    if (((Throwable) yk3Var.c) != null) {
                        throw new IllegalStateException("couldn't be prepared, since already failed");
                    }
                    if (yk3Var.a) {
                        throw new IllegalStateException("already prepared");
                    }
                    yk3Var.a = true;
                    jdVar = (jd) yk3Var.d;
                }
                jdVar.call();
                return Unit.a;
        }
    }
}
