package defpackage;

import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.ui.discovery.MtDiscoveryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class tf30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dwc b;

    public /* synthetic */ tf30(dwc dwcVar, int i) {
        this.a = i;
        this.b = dwcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dwc dwcVar = this.b;
        switch (i) {
            case 0:
                MtDetailedRouteModalView.compassButton$onCompassButtonClicked(dwcVar);
                break;
            case 1:
                MtDiscoveryModalView.lambda$0$onCompassButtonClicked(dwcVar);
                break;
            default:
                MtMainFlexModalView.lambda$0$onCompassButtonClicked(dwcVar);
                break;
        }
    }
}
