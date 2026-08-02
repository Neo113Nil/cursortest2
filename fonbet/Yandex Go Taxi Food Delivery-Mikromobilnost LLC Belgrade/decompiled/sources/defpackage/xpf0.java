package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.promo_plaques.data.a;
import com.yandex.go.taxi.order.promo_plaques.domain.g;
import com.yandex.go.taxi.order.promo_plaques.domain.i;
import com.yandex.go.taxi.order.promo_plaques.domain.k;
import com.yandex.go.taxi.order.promo_plaques.domain.m;
import com.yandex.go.taxi.order.promo_plaques.domain.o;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.communications.b;

/* loaded from: classes14.dex */
public final class xpf0 implements q8j {
    public final a a;
    public final b b;
    public final a5r c;
    public final tpr d;
    public final tpr e;

    public xpf0(a aVar, b bVar, lpf0 lpf0Var, a5r a5rVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = a5rVar;
        m mVar = new m(new i(new g(new k(aVar.f), this), this), this);
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = e.F(mVar, sjhVar);
        this.e = e.F(new o(new i(new g(new com.yandex.go.taxi.order.promo_plaques.domain.e(aVar.f), this), this), this), sjhVar);
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        List g = taxiOrder.V().g();
        a aVar = this.a;
        aVar.a.l(taxiOrder.l.U);
        qv10.B(taxiOrder.V().j().b, this.a.c, null);
        r0 r0Var = this.a.e;
        r0Var.getClass();
        r0Var.m(null, g);
        return zy11.a;
    }
}
