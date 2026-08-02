package defpackage;

import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.superapp.order.multi.old.view.g;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import ru.yandex.taxi.order.analytics.model.OrderButton;

/* loaded from: classes14.dex */
public final class t7y0 implements w7i0 {
    public q6y0 a;
    public final /* synthetic */ b b;

    public t7y0(b bVar) {
        this.b = bVar;
    }

    @Override // defpackage.w7i0
    public final void h(float f, boolean z) {
        if (z) {
            b bVar = this.b;
            int i = (int) f;
            bVar.o0.startSelectionAnimation(i);
            q6y0 q6y0Var = this.a;
            if (q6y0Var == null) {
                ny61.g("Missing order on rating changed");
                return;
            }
            jy70 jy70Var = bVar.V;
            a aVar = jy70Var.a.l;
            aVar.h.a(q6y0Var, OrderButton.RAITING.getAnalyticName(), jy70Var.b, jy70Var.c);
            ((u7y0) aVar.i.get()).a(i, q6y0Var.c);
            g gVar = aVar.c;
            String a = q6y0Var.a();
            gVar.getClass();
            gVar.d(a, true, DetailsOpenReason.RATING, TaxiCardNavigationAction.EMPTY);
            bVar.a0.a(f, q6y0Var.a());
        }
    }
}
