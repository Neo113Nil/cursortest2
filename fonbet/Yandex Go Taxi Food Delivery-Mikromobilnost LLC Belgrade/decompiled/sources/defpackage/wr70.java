package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.OrderDefaultModalView;

/* loaded from: classes14.dex */
public final class wr70 implements qr70 {
    public final /* synthetic */ OrderDefaultModalView a;

    public wr70(OrderDefaultModalView orderDefaultModalView) {
        this.a = orderDefaultModalView;
    }

    @Override // defpackage.qr70
    public final void O3(vr70 vr70Var) {
        yq70 yq70Var;
        yq70Var = this.a.adapter;
        if (yq70Var != null) {
            yq70Var.submitList(vr70Var.a, null);
        }
    }
}
