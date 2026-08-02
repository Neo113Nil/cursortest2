package defpackage;

import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;

/* loaded from: classes8.dex */
public final class u7y0 {
    public final dm21 a;
    public final wuz b;

    public u7y0(dm21 dm21Var, wuz wuzVar) {
        this.a = dm21Var;
        this.b = wuzVar;
    }

    public final void a(int i, o2y0 o2y0Var) {
        TaxiOrder b = o2y0Var.b();
        String str = b.a;
        b bVar = (b) this.a;
        ksq b2 = bVar.b(str);
        isq isqVar = new isq(b.a, b2);
        isqVar.j = i;
        int i2 = b2.i;
        this.b.getClass();
        wuz.a(b, isqVar, i2, i);
        ksq ksqVar = new ksq(isqVar);
        bVar.c(ksqVar, !an91.g(o2y0Var.c()));
        bVar.d(o2y0Var.b().a, ksqVar);
    }
}
