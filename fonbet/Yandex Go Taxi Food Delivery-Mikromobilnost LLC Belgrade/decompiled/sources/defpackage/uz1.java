package defpackage;

import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;

/* loaded from: classes14.dex */
public final /* synthetic */ class uz1 implements rqs0 {
    public final /* synthetic */ int a;

    public /* synthetic */ uz1(int i) {
        this.a = i;
    }

    private final void b(nqs0 nqs0Var, wss0 wss0Var) {
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        switch (this.a) {
            case 0:
                int i = qc6.T;
                break;
            case 1:
                int i2 = ad6.U;
                break;
            case 2:
                int i3 = otv.S;
                break;
            case 3:
                break;
            case 4:
                RideCardTimelineBannerView.render$lambda$0(nqs0Var, wss0Var);
                break;
            default:
                SlotItemButtonViewComponent.renderTrail$lambda$0(nqs0Var, wss0Var);
                break;
        }
    }
}
