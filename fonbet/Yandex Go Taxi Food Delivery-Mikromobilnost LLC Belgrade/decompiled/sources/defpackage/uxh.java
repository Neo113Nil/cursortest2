package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.delivery.router.DeliveryCommonChildModalView;
import com.yandex.go.delivery.sdd_slots_selector.DeliverySddIntervalsModalView;
import com.yandex.go.delivery.tracking.courier_chat.DeliveryCourierChatModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.logistics.cargo_flow.form.DeliveryCargoFormModalView;
import com.yandex.go.places.impl.ui.main.DiscoveryMainModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b;
import com.yandex.go.taxi.order.detailed_price.ui.DetailedPriceModalView;
import com.yandex.go.taxi.order.details.v1.ui.DetailsButtonComponent;
import com.yandex.go.trusted_contacts.ui.dialog.DialogContentModalView;
import com.yandex.payment.divkit.select.DivCvvNumber;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.logistics.care.impl.router.DeliveryCareSlideableView;
import ru.yandex.taxi.logistics.dashboard.DeliveryDashboardCard;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.DeliveryExplicitCommentCourierView;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBaseView;
import ru.yandex.taxi.logistics.ndd_route_selector.view.filters.DeliveryFilterModalView;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.video.m3.offline.ExoDownloadManager$prepareTrackVariants$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class uxh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uxh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uzx binding;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DeliveryCareSlideableView) obj).expand();
                break;
            case 1:
                ((DeliveryCargoFormModalView) obj).requestFocus();
                break;
            case 2:
                DeliveryCommonChildModalView.onAttachedToWindow$lambda$0((DeliveryCommonChildModalView) obj);
                break;
            case 3:
                DeliveryCommonChildModalView.setupButton$onFloatButtonBack((vzh) obj);
                break;
            case 4:
                DeliveryCourierChatModalView.onAttachedToWindow$lambda$0((DeliveryCourierChatModalView) obj);
                break;
            case 5:
                DeliveryDashboardCard.onAttachedToWindow$lambda$0((DeliveryDashboardCard) obj);
                break;
            case 6:
                DeliveryExplicitCommentCourierView._init_$lambda$0((DeliveryExplicitCommentCourierView) obj);
                break;
            case 7:
                DeliveryExplicitCommentRequirementBaseView.lambda$0$0((DeliveryExplicitCommentRequirementBaseView) obj);
                break;
            case 8:
                ((DeliveryFilterModalView) obj).onBackPressed();
                break;
            case 9:
                ((rai) obj).a.a(jq.a);
                break;
            case 10:
                DeliverySddIntervalsModalView.onAttachedToWindow$lambda$0((DeliverySddIntervalsModalView) obj);
                break;
            case 11:
                ((iik0) obj).invoke();
                break;
            case 12:
                ((d0j) obj).c.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, false);
                break;
            case 13:
                DetailedPriceModalView._init_$goBack((g3j) obj);
                break;
            case 14:
                binding = ((DetailedPriceModalView) obj).getBinding();
                cma1.J(binding.e);
                break;
            case 15:
                DetailsButtonComponent.render$lambda$0$0((t4j) obj);
                break;
            case 16:
                DialogContentModalView.onAttachedToWindow$lambda$0((DialogContentModalView) obj);
                break;
            case 17:
                DiscountsAddPromoCodeModalView._init_$backButtonClicked((b) obj);
                break;
            case 18:
                isj isjVar = (isj) obj;
                isjVar.e.run();
                isjVar.f = null;
                break;
            case 19:
                DiscoveryMainModalView.setupOpenMapButton$lambda$1((DiscoveryMainModalView) obj);
                break;
            case 20:
                ((sy60) obj).a();
                break;
            case 21:
                DivCvvNumber.setState$lambda$0$0((zpa0) obj);
                break;
            case 22:
                nkl nklVar = (nkl) obj;
                if (nklVar.d) {
                    nklVar.a(nklVar.a, true);
                }
                nklVar.d = false;
                break;
            case 23:
                androidx.media3.exoplayer.offline.b bVar = (androidx.media3.exoplayer.offline.b) obj;
                ExoDownloadManager$prepareTrackVariants$1.AnonymousClass1 anonymousClass1 = bVar.g;
                anonymousClass1.getClass();
                anonymousClass1.onPrepared(bVar);
                break;
            case 24:
                ((q7m) obj).a();
                break;
            case 25:
                ((RecyclerView) obj).setItemAnimator(null);
                break;
            case 26:
                ((j8m) obj).q = false;
                break;
            case 27:
                DriveTariffCardCollapsedView.setupButtonShadow$lambda$0((DriveTariffCardCollapsedView) obj);
                break;
            case 28:
                DriveTariffCardCollapsedView._init_$onContinueButtonClick((lgm) obj);
                break;
            default:
                DriveTariffCardModalView.focusRouteButton$lambda$0$onFocusRoute((ahm) obj);
                break;
        }
    }
}
