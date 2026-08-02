package defpackage;

import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.yb.domain.f0;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class xy51 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ xy51(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ty51 ty51Var = ty51.a;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = f0Var.i;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                f0Var.i = null;
                r0 r0Var = f0Var.g.a;
                r0Var.getClass();
                r0Var.m(null, ty51Var);
                return zy11Var;
            default:
                wy51 wy51Var = (wy51) obj;
                qy51 qy51Var = f0Var.g;
                hst hstVar = jst.e;
                Objects.toString(wy51Var);
                hstVar.getClass();
                if (wy51Var instanceof uy51) {
                    qy51Var.a.l(wy51Var);
                    ((c) f0Var.e).p();
                    f0Var.f.a.a();
                } else if (jl40.l(wy51Var, vy51.a)) {
                    qy51Var.a.l(wy51Var);
                } else if (!jl40.l(wy51Var, ty51Var)) {
                    w511.b();
                    return null;
                }
                return zy11Var;
        }
    }
}
