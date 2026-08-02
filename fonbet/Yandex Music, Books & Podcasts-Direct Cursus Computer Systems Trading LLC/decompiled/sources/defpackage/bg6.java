package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bg6 implements ps3, Function1 {
    public final es3 a;
    public final zt3 b;

    public bg6(es3 es3Var, zt3 zt3Var) {
        this.a = es3Var;
        this.b = zt3Var;
    }

    @Override // defpackage.ps3
    public final void a(es3 es3Var, l3o l3oVar) {
        r7o r7oVar = z7o.b;
        this.b.resumeWith(l3oVar);
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        if (es3Var.o()) {
            return;
        }
        r7o r7oVar = z7o.b;
        this.b.resumeWith(new t7o(iOException));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        try {
            this.a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.a;
    }
}
