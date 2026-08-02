package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes14.dex */
public final class t580 {
    public final zuj0 a;

    public t580(zuj0 zuj0Var) {
        this.a = zuj0Var;
    }

    public final rbh a(TaxiOrder taxiOrder) {
        String f = taxiOrder.f();
        if ((f == null || evu0.J(f)) && ((f = taxiOrder.b.C) == null || evu0.J(f))) {
            f = ((avj0) this.a).h(kyh0.taxisearch_title);
        }
        String e = taxiOrder.e();
        if (e == null || evu0.J(e)) {
            e = taxiOrder.b.D;
        }
        return new rbh(f, e, 8);
    }
}
