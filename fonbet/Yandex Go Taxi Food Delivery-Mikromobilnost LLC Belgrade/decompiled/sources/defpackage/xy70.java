package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.superapp.orders.multi.tracking.c;
import ru.yandex.taxi.utils.f;

/* loaded from: classes6.dex */
public final class xy70 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy70 b;

    public /* synthetic */ xy70(yy70 yy70Var, int i) {
        this.a = i;
        this.b = yy70Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yy70 yy70Var = this.b;
        switch (i) {
            case 0:
                yy70Var.e(((Number) obj).intValue());
                break;
            default:
                az70 az70Var = (az70) obj;
                c cVar = yy70Var.w;
                f09 f09Var = yy70Var.E;
                o2y0 o2y0Var = az70Var.a;
                if (o2y0Var == null) {
                    yy70Var.F.f(true);
                    jwp0 jwp0Var = yy70Var.P;
                    if (jwp0Var != null) {
                        f09Var.Hg(jwp0Var);
                        f09Var.Hg(jwp0Var);
                        an8 an8Var = f09Var.w;
                        an8Var.getClass();
                        an8Var.u(new m09(jwp0Var));
                    }
                    yy70Var.Q = null;
                    yy70Var.P = null;
                } else if (o2y0Var != yy70Var.Q) {
                    yy70Var.Q = o2y0Var;
                    jtp0 jtp0Var = yy70Var.y.a;
                    f fVar = f09Var.c;
                    jwp0 jwp0Var2 = new jwp0(jtp0Var, o2y0Var, fVar, (e070) fVar.c, yy70Var.a);
                    yy70Var.P = jwp0Var2;
                    f09Var.Ig(jwp0Var2);
                    if (yy70Var.N) {
                        yy70Var.resume();
                    }
                }
                if (o2y0Var != null) {
                    cVar.c();
                } else {
                    ((gh00) yy70Var.b).p(yy70Var);
                    yy70Var.b();
                    cVar.b(az70Var.b);
                }
                bx70 bx70Var = yy70Var.A;
                boolean z = az70Var.a != null;
                bx70Var.a.Wg(z, !z);
                break;
        }
        return zy11Var;
    }
}
