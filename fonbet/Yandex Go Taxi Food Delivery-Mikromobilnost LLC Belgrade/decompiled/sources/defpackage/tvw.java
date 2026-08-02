package defpackage;

import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.intercity.IntercityPreorderInfo;
import java.util.ArrayList;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.orderforanother.repository.a;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes6.dex */
public final class tvw {
    public final zse0 a;
    public final h3y b;
    public final l0j c;
    public final h3y d;
    public final yvw e;
    public final b f;
    public final w3r0 g;
    public final g h;
    public final axm i;
    public final d9w j;
    public final dqe0 k;
    public final a l;

    public tvw(zse0 zse0Var, h3y h3yVar, l0j l0jVar, h3y h3yVar2, yvw yvwVar, b bVar, w3r0 w3r0Var, g gVar, axm axmVar, d9w d9wVar, dqe0 dqe0Var, a aVar) {
        this.a = zse0Var;
        this.b = h3yVar;
        this.c = l0jVar;
        this.d = h3yVar2;
        this.e = yvwVar;
        this.f = bVar;
        this.g = w3r0Var;
        this.h = gVar;
        this.i = axmVar;
        this.j = d9wVar;
        this.k = dqe0Var;
        this.l = aVar;
    }

    public final void a(Preorder preorder) {
        if (this.k.a == preorder) {
            return;
        }
        preorder.y = null;
        zse0 zse0Var = this.a;
        zse0Var.a.a = preorder;
        zse0Var.a.a.F = -1.0d;
        com.yandex.go.taxi.tariffs.internal.repository.a aVar = this.e.a;
        aVar.a.set(null);
        aVar.b.clear();
        this.e.getClass();
        prx0.a.a();
        a aVar2 = this.l;
        pv70 pv70Var = preorder.M;
        if (pv70Var == null) {
            aVar2.f();
        } else {
            aVar2.f.l(pv70Var);
        }
        this.f.g();
        n0 n0Var = this.g.f.a;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        this.h.c.g(zy11Var);
        this.i.c.g(zy11Var);
        e9w e9wVar = (e9w) this.j;
        r0 r0Var = e9wVar.c;
        IntercityPreorderInfo intercityPreorderInfo = e9wVar.a.a.J;
        r0Var.l(intercityPreorderInfo != null ? intercityPreorderInfo.a : null);
        xku0 xku0Var = (xku0) this.b.get();
        fga0 fga0Var = xku0Var.a;
        fga0Var.getClass();
        CorpAccount j = fga0Var.j(fga0Var.q(PaymentMethod$Type.CORP));
        jve b = j != null ? xku0Var.c.b(j) : null;
        if (b != null) {
            ((amc) this.d.get()).h(b.a, b.e);
        }
        l0j l0jVar = this.c;
        l0jVar.getClass();
        l0jVar.a = new hif(new ArrayList());
    }
}
