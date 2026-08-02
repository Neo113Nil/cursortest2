package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.masstransit.geopayment.domain.c;

/* loaded from: classes6.dex */
public final class sk30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ uk30 b;
    public final /* synthetic */ n26 c;
    public final /* synthetic */ tse w;

    public /* synthetic */ sk30(uk30 uk30Var, n26 n26Var, tse tseVar, int i) {
        this.a = i;
        this.b = uk30Var;
        this.c = n26Var;
        this.w = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        k26 k26Var;
        k26 k26Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tse tseVar = this.w;
        u26 u26Var = null;
        n26 n26Var = this.c;
        uk30 uk30Var = this.b;
        switch (i) {
            case 0:
                if (((Boolean) uk30Var.i.d.a.getValue()).booleanValue()) {
                    c cVar = uk30Var.g;
                    r26 r26Var = n26Var.a;
                    if (r26Var != null && (k26Var = r26Var.b) != null) {
                        u26Var = k26Var.f;
                    }
                    cVar.a.f(u26Var, tseVar);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    c cVar2 = uk30Var.g;
                    r26 r26Var2 = n26Var.a;
                    if (r26Var2 != null && (k26Var2 = r26Var2.b) != null) {
                        u26Var = k26Var2.f;
                    }
                    cVar2.a.f(u26Var, tseVar);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
