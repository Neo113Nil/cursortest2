package defpackage;

import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class zu8 {
    public final dqe0 a;
    public final xk2 b;
    public final ev8 c;
    public final xk2 d;
    public final aw8 e;

    public zu8(dqe0 dqe0Var, xk2 xk2Var, ev8 ev8Var, xk2 xk2Var2, aw8 aw8Var, y9y0 y9y0Var) {
        this.a = dqe0Var;
        this.b = xk2Var;
        this.c = ev8Var;
        this.d = xk2Var2;
        this.e = aw8Var;
    }

    public final u0j a(ju0 ju0Var) {
        if (ju0Var instanceof hu0) {
            int a = ju0Var.a();
            dqe0 dqe0Var = this.a;
            if (a < dqe0Var.b().size()) {
                return dqe0Var.b().size() > 0 ? new dzi(ju0Var.a()) : kzi.a;
            }
        }
        return tyi.a;
    }

    public final f0j b(ju0 ju0Var, String str) {
        u0j a = a(ju0Var);
        h0j h0jVar = a instanceof tyi ? new h0j(tyi.a, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, false) : a instanceof dzi ? new h0j(new dzi(ju0Var.a()), ju0Var.a(), TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, false) : new h0j(kzi.a, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, false);
        u0j a2 = a(ju0Var);
        SourcePicker sourcePicker = SourcePicker.DEST_FROM_DELIVERY;
        if (a2 instanceof tyi) {
            ddf ddfVar = new ddf(RoutePointType.POINT_B);
            r51 r51Var = new r51(sourcePicker);
            m3o m3oVar = m3o.b;
            i6r i6rVar = this.d.a;
            i6rVar.getClass();
            m3oVar.getClass();
            return new axf(h0jVar, ddfVar, r51Var, m3oVar, i6rVar, str);
        }
        if (!(a2 instanceof dzi)) {
            ddf ddfVar2 = new ddf(RoutePointType.POINT_B);
            r51 r51Var2 = new r51(sourcePicker);
            m3o m3oVar2 = m3o.b;
            i6r i6rVar2 = this.b.a;
            i6rVar2.getClass();
            m3oVar2.getClass();
            return new iwf(h0jVar, ddfVar2, r51Var2, m3oVar2, i6rVar2, str);
        }
        int a3 = ju0Var.a();
        ddf ddfVar3 = new ddf(RoutePointType.POINT_B);
        r51 r51Var3 = new r51(sourcePicker);
        m3o m3oVar3 = m3o.b;
        i6r i6rVar3 = this.c.a;
        i6rVar3.getClass();
        m3oVar3.getClass();
        return new cxf(h0jVar, ddfVar3, r51Var3, m3oVar3, i6rVar3, Integer.valueOf(a3), str);
    }

    public final kxf c(String str) {
        ujt0 ujt0Var = new ujt0(false);
        ddf ddfVar = new ddf(RoutePointType.POINT_A);
        r51 r51Var = new r51(SourcePicker.SOURCE_FROM_DELIVERY);
        m3o m3oVar = m3o.b;
        i6r i6rVar = this.e.a;
        i6rVar.getClass();
        m3oVar.getClass();
        return new kxf(ujt0Var, ddfVar, r51Var, m3oVar, i6rVar, str);
    }
}
