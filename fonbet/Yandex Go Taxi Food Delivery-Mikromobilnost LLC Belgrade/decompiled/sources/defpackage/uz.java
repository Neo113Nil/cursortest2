package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.order.preparing.ChargersOrderPreparingModalView;
import com.yandex.go.chargers.qr.ChargersQrCameraPreview;
import com.yandex.go.chargers.qr.ChargersQrModalView;
import com.yandex.go.chargers.station.presentation.details.ChargersStationDetailsModalView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationFooterView;
import com.yandex.go.drive.vertical.ui.double_content_modal.DoubleContentModalView;
import com.yandex.go.navigator.settings.BaseSettingsModalView;
import com.yandex.go.shortcuts.impl.ui.feed.CoordinatorFeedView;
import com.yandex.go.shortcuts.impl.ui.feed.StickyView;
import com.yandex.go.taxi.order.a;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.ybsdk.widgets.common.CircleButtonView;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import org.altbeacon.beacon.b;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.routes.presentation.c;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes13.dex */
public final class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LottieAnimationView lottieAnimationView;
        MotionLayout motionLayout;
        dda binding;
        View content;
        dda binding2;
        woa binding3;
        woa binding4;
        View content2;
        int behaviourState;
        msa binding5;
        ChargersStationFooterView chargersStationFooterView;
        msa binding6;
        msa binding7;
        a3v a3vVar;
        boolean z;
        sra sraVar;
        StickyView stickyView;
        StickyView stickyView2;
        doq doqVar;
        AnimatorSet animatorSet;
        DialogInterface.OnDismissListener onDismissListener;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        int unused;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((i00) ((b00) this.b).j.getValue()).a(new rvw());
                return;
            case 1:
                a aVar = (a) this.b;
                synchronized (aVar.a) {
                    try {
                        a20 a20Var = aVar.b;
                        Object obj = a20Var.b;
                        if (obj == null) {
                            z2 = false;
                        }
                        if (z2) {
                            if (obj == null) {
                                throw new NoSuchElementException();
                            }
                            a20Var.b = null;
                            aVar.b(obj, this);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                k30 k30Var = (k30) this.b;
                while (!k30Var.e) {
                    try {
                        k30Var.b((j30) k30Var.c.remove());
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            case 3:
                ((AddressSearchView) this.b).addressInput.requestFocus();
                return;
            case 4:
                ((BaseSettingsModalView) this.b).updateShadowVisibility();
                return;
            case 5:
                b bVar = (b) this.b;
                bVar.t = false;
                try {
                    bVar.b(7, null);
                    return;
                } catch (RemoteException unused3) {
                    return;
                }
            case 6:
                xe6 xe6Var = (xe6) this.b;
                xe6Var.c = false;
                BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) xe6Var.e;
                androidx.customview.widget.a aVar2 = bottomSheetBehavior2.l0;
                if (aVar2 != null && aVar2.h()) {
                    xe6Var.a(xe6Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior2.k0 == 2) {
                        bottomSheetBehavior2.X(xe6Var.b);
                        return;
                    }
                    return;
                }
            case 7:
                CardBannerV2ModalView cardBannerV2ModalView = (CardBannerV2ModalView) this.b;
                lottieAnimationView = cardBannerV2ModalView.extraAnimationView;
                cardBannerV2ModalView.showAndPlay(lottieAnimationView);
                return;
            case 8:
                ((o) ((com.yandex.go.logistics.cargo_flow.route_selector.b) this.b).z).d();
                return;
            case 9:
                Carousel carousel = (Carousel) this.b;
                motionLayout = carousel.mMotionLayout;
                motionLayout.setProgress(0.0f);
                carousel.updateItems();
                Carousel.access$300(carousel);
                unused = carousel.mIndex;
                throw null;
            case 10:
                ((dy8) ((zo31) ((wx8) this.b).R)).a.requestLayout();
                return;
            case 11:
                RecyclerView.e layoutManager = ((mz8) this.b).c0().getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.l1(0);
                    return;
                }
                return;
            case 12:
                RecyclerView.e layoutManager2 = ((nz8) this.b).c0().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.l1(0);
                    return;
                }
                return;
            case 13:
                ChargersOfferModalView chargersOfferModalView = (ChargersOfferModalView) this.b;
                chargersOfferModalView.isLoading = false;
                chargersOfferModalView.fitCardToContent();
                return;
            case 14:
                ChargersOrderPreparingModalView chargersOrderPreparingModalView = (ChargersOrderPreparingModalView) this.b;
                binding = chargersOrderPreparingModalView.getBinding();
                ViewGroup.LayoutParams layoutParams = binding.a.getLayoutParams();
                content = chargersOrderPreparingModalView.getContent();
                layoutParams.height = content.getMeasuredHeight();
                binding2 = chargersOrderPreparingModalView.getBinding();
                binding2.a.setLayoutParams(layoutParams);
                return;
            case 15:
                ChargersQrModalView chargersQrModalView = (ChargersQrModalView) this.b;
                binding3 = chargersQrModalView.getBinding();
                ChargersQrCameraPreview chargersQrCameraPreview = binding3.b;
                binding4 = chargersQrModalView.getBinding();
                ViewGroup.LayoutParams layoutParams2 = binding4.b.getLayoutParams();
                content2 = chargersQrModalView.getContent();
                layoutParams2.height = content2.getMeasuredHeight();
                chargersQrCameraPreview.setLayoutParams(layoutParams2);
                return;
            case 16:
                ChargersStationDetailsModalView chargersStationDetailsModalView = (ChargersStationDetailsModalView) this.b;
                behaviourState = chargersStationDetailsModalView.behaviourState();
                binding5 = chargersStationDetailsModalView.getBinding();
                int r = tje.r(mrg0.go_design_card_divider_default_size, chargersStationDetailsModalView.getContext()) + binding5.b.getDescriptionsAndBricksHeight() + binding5.h.getHeight();
                chargersStationFooterView = chargersStationDetailsModalView.chargersStationFooterView;
                int height = chargersStationFooterView.getHeight() + r;
                binding6 = chargersStationDetailsModalView.getBinding();
                int height2 = binding6.c.getHeight() + height;
                binding7 = chargersStationDetailsModalView.getBinding();
                ViewGroup.LayoutParams layoutParams3 = binding7.c.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? layoutParams3 : null);
                int i = height2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                if (behaviourState != 6) {
                    chargersStationDetailsModalView.setBehaviorAnchorHeight(Integer.valueOf(i));
                }
                chargersStationDetailsModalView.setBehaviorPeekHeight(i);
                a3vVar = chargersStationDetailsModalView.focusCoordinator;
                a3vVar.Td(i, ChargersStationDetailsModalView.class);
                z = chargersStationDetailsModalView.isModalSheetReadyHandled;
                if (!z) {
                    chargersStationDetailsModalView.isModalSheetReadyHandled = true;
                    sraVar = chargersStationDetailsModalView.presenter;
                    g641 g641Var = ((ru.yandex.taxi.layers.presentation.walkroute.simple.b) ((hsa) sraVar.H.a).Q.get()).d;
                    if (g641Var != null) {
                        g641Var.Jg(false);
                    }
                }
                if (behaviourState == 4) {
                    chargersStationDetailsModalView.setBehaviorState(6);
                    return;
                }
                return;
            case 17:
                CircleButtonView circleButtonView = (CircleButtonView) this.b;
                if (circleButtonView.isAttachedToWindow()) {
                    circleButtonView.requestLayout();
                    return;
                }
                return;
            case 18:
                ((o) ((c) this.b).A).d();
                return;
            case 19:
                ((sqc) this.b).x0.requestLayout();
                return;
            case 20:
                ((v2e) this.b).B.d();
                return;
            case 21:
                CoordinatorFeedView coordinatorFeedView = (CoordinatorFeedView) this.b;
                stickyView = coordinatorFeedView.stickyView;
                stickyView2 = coordinatorFeedView.stickyView;
                Animator[] animatorArr = {ObjectAnimator.ofInt(stickyView, ek2.a, stickyView.getHeight(), ((Number) stickyView2.collapsedHeight().invoke()).intValue())};
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether((Animator[]) Arrays.copyOf(animatorArr, 1));
                animatorSet2.setDuration(100L);
                coordinatorFeedView.stickyViewAnimator = animatorSet2;
                doqVar = coordinatorFeedView.bottomSheetBehaviorCallback;
                animatorSet = coordinatorFeedView.stickyViewAnimator;
                AnimatorSet animatorSet3 = animatorSet != null ? animatorSet : null;
                if (animatorSet3 != null) {
                    doqVar.getClass();
                    animatorSet3.cancel();
                }
                doqVar.b = animatorSet3;
                return;
            case 22:
                ((org.altbeacon.beacon.service.scanner.b) this.b).h(Boolean.TRUE);
                return;
            case 23:
                sls slsVar = ((com.yandex.payment.divkit.bind.b) this.b).H;
                if (slsVar != null) {
                    slsVar.invoke();
                    return;
                }
                return;
            case 24:
                sls slsVar2 = ((kvf) this.b).I;
                if (slsVar2 != null) {
                    slsVar2.invoke();
                    return;
                }
                return;
            case 25:
                DeliveryContactsModalView deliveryContactsModalView = (DeliveryContactsModalView) this.b;
                DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).k.title().requestFocus();
                DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).k.title().performAccessibilityAction(64, null);
                DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).k.title().sendAccessibilityEvent(8);
                return;
            case 26:
                ((DetailsCardHorizontalButtons) this.b).startShowAnimation();
                return;
            case 27:
                DialogFragment dialogFragment = (DialogFragment) this.b;
                onDismissListener = dialogFragment.mOnDismissListener;
                onDismissListener.onDismiss(dialogFragment.mDialog);
                return;
            case 28:
                un7 un7Var = (un7) this.b;
                if (un7Var.b) {
                    un7Var.b = false;
                    ((Handler) un7Var.x).postDelayed(this, 300L);
                    return;
                }
                w3i w3iVar = (w3i) un7Var.w;
                ExecutorService executorService = (ExecutorService) un7Var.y;
                w3iVar.getClass();
                executorService.execute(new ych(w3iVar, 1));
                un7Var.c = false;
                un7Var.a = 0;
                return;
            default:
                DoubleContentModalView doubleContentModalView = (DoubleContentModalView) this.b;
                doubleContentModalView.actualizeAnchorOffset();
                bottomSheetBehavior = doubleContentModalView.getBottomSheetBehavior();
                doubleContentModalView.onDialogSlide(bottomSheetBehavior.E == 3 ? 1.0f : 0.0f);
                return;
        }
    }
}
