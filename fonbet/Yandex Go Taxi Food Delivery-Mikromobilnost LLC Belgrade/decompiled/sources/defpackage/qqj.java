package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes13.dex */
public final class qqj {
    public final g a;

    public qqj(g gVar) {
        this.a = gVar;
    }

    public final boolean a(wlf0 wlf0Var) {
        g gVar = this.a;
        boolean isEmpty = gVar.a().a.isEmpty();
        boolean isEmpty2 = gVar.a().e.isEmpty();
        String str = wlf0Var.e;
        boolean l = jl40.l(str, ServiceType.TAXI.getAlias());
        boolean l2 = jl40.l(str, ServiceType.LOGISTICS.getAlias());
        if (isEmpty && isEmpty2) {
            return false;
        }
        return l || l2;
    }
}
