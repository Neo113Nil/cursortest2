package defpackage;

import com.yandex.go.superapp.orders.card.OrderCardView;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class udc {
    public pfs0 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final tdc c = new tdc(this);

    public final void a(OrderCardView orderCardView) {
        pfs0 pfs0Var = this.a;
        if (pfs0Var != null && orderCardView.isAttachedToWindow()) {
            orderCardView.setColors(pfs0Var.b, pfs0Var.a, pfs0Var.c, pfs0Var.d, pfs0Var.e, pfs0Var.f, pfs0Var.g, pfs0Var.h, pfs0Var.i);
        }
    }
}
