package defpackage;

import jason.statham.tools.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class z8c0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9c0 b;

    public /* synthetic */ z8c0(b9c0 b9c0Var, int i) {
        this.a = i;
        this.b = b9c0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b9c0 b9c0Var = this.b;
        switch (i) {
            case 0:
                b9c0Var.x.k((kr) obj);
                break;
            default:
                lac0 lac0Var = (lac0) obj;
                k6x k6xVar = b9c0Var.F;
                if (k6xVar.a()) {
                    d6x d = a.d(k6xVar.b(), lac0Var.a, lac0Var.b, lac0Var.c);
                    if (!d.equals(k6xVar.b())) {
                        k6xVar.e(d);
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
