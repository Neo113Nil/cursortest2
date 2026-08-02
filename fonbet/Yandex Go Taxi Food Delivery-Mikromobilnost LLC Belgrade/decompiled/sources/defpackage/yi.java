package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.textfield.c;
import com.yandex.alicekit.core.views.animator.DslAnimator;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.views.CardPanInputView;
import com.yandex.go.logistics.cargo_flow.route_selector.b;
import com.yandex.go.pickup_from_photo.ui.CameraTargetView;
import com.yandex.go.pickup_from_photo.ui.CircularProgressView;
import com.yandex.go.splash.DefaultSplashView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.DiscoveryMapSearchbarAnimatedTextView;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.companion_buffer_serch.BufferSearchAnimationItemView;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.messaging.views.AnimatedProgressView;
import com.yandex.messaging.views.bottomsheet.a;
import com.ybsdk.core.design.widget.ModalView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.CroppedTextView;
import ru.yandex.taxi.design.DividerWithColorView;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.plus.design.view.CashbackGradientButton;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes14.dex */
public final /* synthetic */ class yi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        PolylinePosition polylinePosition;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AccordionComponent.getHeightAnimator$lambda$0((AccordionComponent) obj, valueAnimator);
                break;
            case 1:
                YbButtonView ybButtonView = (YbButtonView) obj;
                ybButtonView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ybButtonView.requestLayout();
                break;
            case 2:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.getClass();
                ((ModalView) ((m6) obj).b).setBackgroundColor(num.intValue());
                break;
            case 3:
                AnimatedProgressView.setProgress$lambda$6$lambda$3((AnimatedProgressView) obj, valueAnimator);
                break;
            case 4:
                ((BaseIndicatorTabLayout) obj).lambda$animateToTab$0(valueAnimator);
                break;
            case 5:
                ((a) obj).e.V(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
                break;
            case 6:
                ((BufferSearchAnimationItemView) obj).updateNodesPointsBackground();
                break;
            case 7:
                TaxiMapView taxiMapView = ((rq7) obj).a;
                if (taxiMapView != null) {
                    taxiMapView.setFocusRect(ru.yandex.taxi.map.utils.a.A((Rect) valueAnimator.getAnimatedValue()));
                    break;
                }
                break;
            case 8:
                CameraTargetView.startBlinkAnimation$lambda$0$0((CameraTargetView) obj, valueAnimator);
                break;
            case 9:
                CardDetailsFragment.playPromoCarouselAnimation$lambda$44$lambda$43((LinearLayoutManager) obj, valueAnimator);
                break;
            case 10:
                CardPanInputView.createIconAnimator$lambda$9$lambda$8((CardPanInputView) obj, valueAnimator);
                break;
            case 11:
                b bVar = (b) obj;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue != bVar.R && bVar.K != null && (polylinePosition = bVar.U) != null) {
                    if (intValue >= polylinePosition.getSegmentIndex()) {
                        w4e0 w4e0Var = bVar.K;
                        if (w4e0Var != null) {
                            w4e0Var.r(EmptyList.a);
                        }
                    } else {
                        PolylinePosition polylinePosition2 = new PolylinePosition(intValue, 1.0d);
                        w4e0 w4e0Var2 = bVar.K;
                        if (w4e0Var2 != null) {
                            w4e0Var2.r(Collections.singletonList(new Subpolyline(polylinePosition2, polylinePosition)));
                        }
                    }
                    bVar.R = intValue;
                    break;
                }
                break;
            case 12:
                CashbackGradientButton.setIsAnimated$lambda$0$0((CashbackGradientButton) obj, valueAnimator);
                break;
            case 13:
                CircularProgressBar.rotateAnimator$lambda$0$0((CircularProgressBar) obj, valueAnimator);
                break;
            case 14:
                CircularProgressView.animateProgress$lambda$0$0((CircularProgressView) obj, valueAnimator);
                break;
            case 15:
                CroppedTextView.showFullTextWithAnimation$lambda$0$2((CroppedTextView) obj, valueAnimator);
                break;
            case 16:
                ((w04) obj).invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 17:
                DefaultSplashView.scaleBackground$lambda$0((DefaultSplashView) obj, valueAnimator);
                break;
            case 18:
                ((DefaultTimeBar) obj).lambda$new$1(valueAnimator);
                break;
            case 19:
                DetailsCardHorizontalButtons.createShowAnimator$lambda$0$0((DetailsCardHorizontalButtons) obj, valueAnimator);
                break;
            case 20:
                ((DeterminateDrawable) obj).lambda$maybeInitializeAmplitudeAnimator$1(valueAnimator);
                break;
            case 21:
                ((DiscoveryMapSearchbarAnimatedTextView) obj).animateClipBounds(valueAnimator);
                break;
            case 22:
                int i2 = sql.h0;
                ((DividerWithColorView) obj).updateColorInt(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                CardView cardView = (CardView) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f != null) {
                    cardView.setCardElevation(f.floatValue());
                    break;
                }
                break;
            case 24:
                ((DrawerLayout) obj).setScrimColor(lhc.f(-1728053248, mj2.c(bcm.a, 0, valueAnimator.getAnimatedFraction())));
                break;
            case 25:
                View view = (View) ((eim) obj).d.get();
                if (view != null) {
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
            case 26:
                DriverSectionView.rejectFadeAnimator$lambda$0$0((DriverSectionView) obj, valueAnimator);
                break;
            case 27:
                ((c) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DslAnimator) obj).onUpdate(valueAnimator);
                break;
        }
    }
}
