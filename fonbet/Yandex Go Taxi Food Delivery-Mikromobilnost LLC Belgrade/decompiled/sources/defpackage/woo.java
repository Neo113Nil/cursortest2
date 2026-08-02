package defpackage;

import defpackage.too;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class woo implements xi70 {
    public final voo a;

    public woo(voo vooVar) {
        this.a = vooVar;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        too tooVar = (too) this.a.a.b();
        if (!tooVar.b()) {
            return null;
        }
        too.a aVar = (too.a) tooVar.d.get(vi70Var.a.a.b);
        if (aVar == null) {
            return null;
        }
        String Y = d6z.Y(tooVar, aVar.a);
        String Y2 = d6z.Y(tooVar, aVar.b);
        if (evu0.J(Y) || !vi70Var.d) {
            return null;
        }
        return hay.g(Y, Y2, vi70Var.b, false, 24);
    }

    @Override // defpackage.xi70
    public final String b() {
        return "ExpandDetailsBySummaryOrderButtonInteractor";
    }
}
