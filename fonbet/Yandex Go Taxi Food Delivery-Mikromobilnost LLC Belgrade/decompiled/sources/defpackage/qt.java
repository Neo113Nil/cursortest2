package defpackage;

import android.content.Context;
import com.yandex.go.lootbox.impl.domain.interactors.activation.a;
import com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView;
import com.yandex.go.taxi.order.communications.d;
import com.yandex.go.taxi.order.communications.e;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final /* synthetic */ class qt implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e b;
    public final /* synthetic */ b c;

    public /* synthetic */ qt(e eVar, b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaxiOrder b;
        int i = this.a;
        b bVar = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                String str = ((ActionButton.j) bVar).a;
                if (str == null || evu0.J(str)) {
                    str = c.G(kyh0.order_for_other_choose_from_contacts, eVar.c0);
                }
                eVar.j0.a(new tfb0(str, null, null, null, false, null, null, 262142), new rt(eVar), new d(eVar), eVar.k0);
                break;
            default:
                qqz qqzVar = eVar.g0;
                Context context = eVar.c0.getContext();
                ActionButton.g gVar = (ActionButton.g) bVar;
                String str2 = gVar.a;
                String str3 = gVar.b;
                String str4 = gVar.c;
                o2y0 o2y0Var = eVar.r0;
                String str5 = null;
                String d = o2y0Var != null ? o2y0Var.d() : null;
                if (o2y0Var != null && (b = o2y0Var.b()) != null) {
                    str5 = b.w();
                }
                rqz rqzVar = (rqz) qqzVar;
                wrr wrrVar = rqzVar.c.a;
                com.yandex.go.lootbox.impl.presentation.modal.c cVar = new com.yandex.go.lootbox.impl.presentation.modal.c((n3h) ((xvf0) wrrVar.b).get(), (bqz) ((qx5) wrrVar.c).get(), (a) ((xvf0) wrrVar.w).get(), (com.yandex.go.lootbox.impl.domain.interactors.animation.e) ((xvf0) wrrVar.x).get(), (iqz) ((xvf0) wrrVar.y).get(), (apz) ((x0z) wrrVar.z).get(), (ruc) ((s2g) wrrVar.A).get(), str2, str3, d, str5);
                q4g q4gVar = rqzVar.b.a;
                rqzVar.e.s(new LootBoxModalView(context, cVar, str4, (gqz) ((x0z) q4gVar.b).get(), (zuj0) ((xvf0) q4gVar.c).get(), (cqz) ((rut) q4gVar.w).get(), (pav) ((xvf0) q4gVar.x).get(), (k7x0) ((s2g) q4gVar.y).get()), false);
                break;
        }
    }

    public /* synthetic */ qt(b bVar, e eVar) {
        this.c = bVar;
        this.b = eVar;
    }
}
