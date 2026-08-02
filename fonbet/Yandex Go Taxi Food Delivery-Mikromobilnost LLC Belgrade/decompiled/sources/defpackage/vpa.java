package defpackage;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.lifecycle.y;
import com.yandex.go.chargers.ui.ChargersShortcutsLikeSlideableModalView;
import com.yandex.go.scooters.background.ScootersBackgroundModalView;
import com.yandex.go.scooters.offers.v2.ScootersCardV2ModalView;
import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.ybsdk.core.design.widget.ModalView;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.design.ListItemExpandableContainerComponent;
import ru.yandex.taxi.design.NotificationStackComponent$showInternal$2;
import ru.yandex.taxi.discovery.DiscoveryTransitionModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.ontheway.damage.ScootersDamageView;
import ru.yandex.taxi.scooters.utils.ScootersShortcutsLikeSlideableModalView;
import ru.yandex.taxi.surge.dialog.PaidOptionDialog;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class vpa implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ vpa(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ChargersShortcutsLikeSlideableModalView.dismissWithAction$lambda$0();
                break;
            case 1:
                int i = sqc.T0;
                break;
            case 2:
                CostCenterFieldsModalView.bindSelectView$lambda$1();
                break;
            case 3:
                DefaultSurfaceProcessor.lambda$executeSafely$11();
                break;
            case 4:
                break;
            case 5:
                DeliveryContactsModalView.createDefaultContactsView$lambda$0();
                break;
            case 6:
                DetailedCancelPopupModalView.onAttachedToWindow$lambda$0();
                break;
            case 7:
                DetailedCancelPopupModalView.onAttachedToWindow$lambda$1();
                break;
            case 8:
                DiscoveryTransitionModalView.onCollapseListener$lambda$0();
                break;
            case 9:
                DualSurfaceProcessor.lambda$executeSafely$7();
                break;
            case 10:
                EglBase10Impl.EglConnection.lambda$new$1();
                break;
            case 11:
                EglBase14Impl.EglConnection.lambda$new$1();
                break;
            case 12:
                y.A.y.a(fey.a);
                break;
            case 13:
                ListItemExpandableContainerComponent.setContent$lambda$0();
                break;
            case 14:
                ModalView.lambda$dismissWithAction$3();
                break;
            case 15:
                ru.yandex.taxi.widget.ModalView.onBackPressedListener$lambda$0();
                break;
            case 16:
            case 17:
                break;
            case 18:
                NotificationStackComponent$showInternal$2.onAnimationEnd$lambda$0();
                break;
            case 19:
                PaidOptionDialog.addButton$lambda$0();
                break;
            case 20:
                break;
            case 21:
                ScootersBackgroundModalView.detach$lambda$0();
                break;
            case 22:
                ScootersCardV2ModalView.vehicleActualPhotoButton$lambda$0();
                break;
            case 23:
                ScootersDamageView.onAttachedToWindow$lambda$0();
                break;
            case 24:
                ScootersDetailedOrderV2ModalView.vehicleActualPhotoButton$lambda$0();
                break;
            case 25:
                ScootersDetailedOrderV2ModalView._init_$lambda$0();
                break;
            case 26:
                ScootersShortcutsLikeSlideableModalView.dismissWithAction$lambda$0();
                break;
            case 27:
                SelectedMessagesPanel.lambda$onDelete$9();
                break;
            case 28:
                SimpleSpinnerModalView.dismiss$lambda$0();
                break;
            default:
                SlideableModalView.onSlideOutListener$lambda$0();
                break;
        }
    }

    public /* synthetic */ vpa(au50 au50Var, Exception exc, int i) {
        this.a = i;
    }
}
