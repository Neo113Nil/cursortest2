package defpackage;

import defpackage.u851;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class w851 implements xi70 {
    public final axm a;
    public final qqo b;

    public w851(axm axmVar, rqo rqoVar) {
        this.a = axmVar;
        u851.Companion.getClass();
        this.b = ((jbh) rqoVar).c(u851.f);
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        u851 u851Var = (u851) this.b.b();
        if (u851Var.b() && !this.a.c()) {
            u851.a aVar = (u851.a) u851Var.c.get(vi70Var.a.f);
            if (aVar != null) {
                return hay.m(d6z.Y(u851Var, aVar.a), d6z.Y(u851Var, aVar.b), null, vi70Var.a.a.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 4);
            }
        }
        return null;
    }

    @Override // defpackage.xi70
    public final String b() {
        return "WithoutDueOrderButtonInteractor";
    }
}
