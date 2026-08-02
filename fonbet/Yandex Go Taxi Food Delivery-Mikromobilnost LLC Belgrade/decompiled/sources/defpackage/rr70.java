package defpackage;

import com.yandex.go.taxi.order.promotions.modal_default.interactor.c;
import com.yandex.go.taxi.order.promotions.modal_default.model.ModalDefaultAction;
import com.yandex.go.taxi.order.promotions.modal_default.router.a;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;

/* loaded from: classes14.dex */
public final class rr70 extends ad5 {
    public final c A;
    public final wsc B;
    public final pr70 x;
    public final yj70 y;
    public final usc z;

    public rr70(pr70 pr70Var, yj70 yj70Var, usc uscVar, c cVar, wsc wscVar) {
        super(qr70.class);
        this.x = pr70Var;
        this.y = yj70Var;
        this.z = uscVar;
        this.A = cVar;
        this.B = wscVar;
    }

    public final void Kg(ModalDefaultAction modalDefaultAction) {
        String analyticsName = modalDefaultAction.getAnalyticsName();
        usc uscVar = this.z;
        wsc wscVar = this.B;
        if (analyticsName != null) {
            wscVar.a(uscVar, analyticsName);
        }
        wscVar.b(uscVar, CommunicationModalAnalyticsData$CloseReason.ACTION_BUTTON);
        ((a) this.y.a).r(new fd60(28));
    }
}
