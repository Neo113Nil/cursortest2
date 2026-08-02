package defpackage;

import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.ui.discovery.MtDiscoveryModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class uf30 implements awc {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideableModalView b;

    public /* synthetic */ uf30(SlideableModalView slideableModalView, int i) {
        this.a = i;
        this.b = slideableModalView;
    }

    @Override // defpackage.awc
    public final void k(gwc gwcVar) {
        RotatableFloatButton rotatableFloatButton;
        RotatableFloatButton rotatableFloatButton2;
        RotatableFloatButton rotatableFloatButton3;
        RotatableFloatButton rotatableFloatButton4;
        RotatableFloatButton rotatableFloatButton5;
        RotatableFloatButton rotatableFloatButton6;
        int i = this.a;
        SlideableModalView slideableModalView = this.b;
        switch (i) {
            case 0:
                MtDetailedRouteModalView mtDetailedRouteModalView = (MtDetailedRouteModalView) slideableModalView;
                rotatableFloatButton = mtDetailedRouteModalView.compassButton;
                rotatableFloatButton.setVisibilityAnimated(gwcVar.a);
                rotatableFloatButton2 = mtDetailedRouteModalView.compassButton;
                rotatableFloatButton2.setImageRotation(gwcVar.b);
                break;
            case 1:
                MtDiscoveryModalView mtDiscoveryModalView = (MtDiscoveryModalView) slideableModalView;
                rotatableFloatButton3 = mtDiscoveryModalView.compassButton;
                rotatableFloatButton3.setVisibilityAnimated(gwcVar.a);
                rotatableFloatButton4 = mtDiscoveryModalView.compassButton;
                rotatableFloatButton4.setImageRotation(gwcVar.b);
                break;
            default:
                MtMainFlexModalView mtMainFlexModalView = (MtMainFlexModalView) slideableModalView;
                rotatableFloatButton5 = mtMainFlexModalView.compassButton;
                rotatableFloatButton5.setVisibilityAnimated(gwcVar.a);
                rotatableFloatButton6 = mtMainFlexModalView.compassButton;
                rotatableFloatButton6.setImageRotation(gwcVar.b);
                break;
        }
    }
}
