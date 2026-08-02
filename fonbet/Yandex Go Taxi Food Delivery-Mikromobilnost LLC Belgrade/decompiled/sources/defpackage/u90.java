package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetFragment;
import com.yandex.go.chargers.background.ChargersBackgroundModalView;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.order.active.ChargersActiveOrderModalView;
import com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1;
import com.yandex.go.delivery.router.DeliveryCommonChildModalView;
import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardModalView;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.logistics.cargo_flow.discovery_map.CargoFlowDiscoveryMapModalView;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.shortcuts.impl.ui.feed.CoordinatorFeedView;
import com.yandex.messaging.input.DimmedBackgroundView;
import com.yandex.messaging.views.bottomsheet.a;
import com.yandex.messaging.views.bottomsheet.b;
import com.yandex.mobile.drive.view.AlertView;
import ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalView;
import ru.yandex.taxi.altpins.walking_route.fragment.AltpinWalkingRouteFragment;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.multiorder.BubbleModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class u90 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                AddCardModalView.hideKeyboardOnLayoutChangeListener$lambda$0((AddCardModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                ((AddressMapFragment) obj).requestFocusRect();
                break;
            case 2:
                AlertView._init_$lambda$1((AlertView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                ((sls) obj).invoke();
                break;
            case 4:
                ((AlternativeSourceModalView) obj).updateFocusRect();
                break;
            case 5:
                ((AltpinWalkingRouteFragment) obj).onModalLayoutChanged();
                break;
            case 6:
                a aVar = (a) obj;
                int height = aVar.a.a.getHeight();
                BottomSheetBehavior bottomSheetBehavior = aVar.e;
                bottomSheetBehavior.P(aVar.a().getHeight() - height);
                bottomSheetBehavior.V(height, false);
                int max = Math.max(aVar.a().getWidth(), aVar.a().getHeight());
                View view2 = aVar.b;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                view2.setLayoutParams(layoutParams instanceof ConstraintLayout.LayoutParams ? new ConstraintLayout.LayoutParams(((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).width, max) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ViewGroup.MarginLayoutParams(((ViewGroup.MarginLayoutParams) layoutParams).width, max) : new ViewGroup.LayoutParams(layoutParams.width, max));
                view2.setY(((b) aVar.d.getLast()).k().a);
                break;
            case 7:
                ((yln) obj).onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                BubbleModalView.onAnchorLayoutChangeListener$lambda$0((BubbleModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 9:
                no6 no6Var = (no6) obj;
                int width = ((View) no6Var.b).getWidth();
                BubbleComponent bubbleComponent = (BubbleComponent) no6Var.c;
                int width2 = bubbleComponent.getWidth();
                bubbleComponent.setTranslationY(r1.getBottom());
                dgr0 dgr0Var = (dgr0) no6Var.w;
                if (width2 <= width) {
                    dgr0Var.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
                    bubbleComponent.setTranslationX((width - width2) / 2.0f);
                    break;
                } else {
                    dgr0Var.p(DefaultBubbleDecorator$Position.OFFSET_START, (width - dgr0Var.c) / 2.0f);
                    bubbleComponent.setTranslationX(0.0f);
                    break;
                }
            case 10:
                BusinessAccountCreationView.addButtonContainerLayoutListener$lambda$0((BusinessAccountCreationView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 11:
                CargoFlowDiscoveryMapModalView.focusCoordinatorChangeListener$lambda$0((CargoFlowDiscoveryMapModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 12:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new dn7(15, carouselLayoutManager));
                    break;
                }
                break;
            case 13:
                ChargersActiveOrderModalView.onLayoutChangeListener$lambda$0((ChargersActiveOrderModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                ChargersBackgroundModalView.onAttachedToWindow$lambda$3((ChargersBackgroundModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                ((ChargersMultiOrderModalView) obj).setFocusCoordinatorMargins();
                break;
            case 16:
                ChargersOfferModalView.onAttachedToWindow$lambda$0((ChargersOfferModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 17:
                CompositeAddressSearchModalView._init_$lambda$0((CompositeAddressSearchModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 18:
                ((cde) obj).b = null;
                break;
            case 19:
                CoordinatorFeedView.onLayoutChangeListener$lambda$0((CoordinatorFeedView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 20:
                CreateAccountView._init_$lambda$3((CreateAccountView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 21:
                xm2 xm2Var = new xm2((com.yandex.go.payments.shared.details.settings.limits.currencysettings.b) obj, i4 - i2, 5);
                Rect rect = xw31.a;
                xm2Var.run();
                view.post(xm2Var);
                break;
            case 22:
                ((CustomBottomSheetFragment) obj).adjustBottomSheetHeight();
                break;
            case 23:
                DeliveryCommonCameraModalViewKt$provideCameraModalView$1.setupBottomSection$lambda$7((DeliveryCommonCameraModalViewKt$provideCameraModalView$1) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 24:
                DeliveryCommonChildModalView.focusCoordinatorChangeListener$lambda$0((DeliveryCommonChildModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 25:
                DeliveryTrackingModalView.listenForUpsellContainerChanges$lambda$0((DeliveryTrackingModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 26:
                ((DimmedBackgroundView) obj).invalidate();
                break;
            case 27:
                ((DoubleContentModalView) obj).actualizeAnchorOffset();
                break;
            case 28:
                DriveTariffCardCollapsedView._init_$lambda$0((DriveTariffCardCollapsedView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                DriveTariffCardModalView.collapsedViewLayoutChangeListener$lambda$0((DriveTariffCardModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
