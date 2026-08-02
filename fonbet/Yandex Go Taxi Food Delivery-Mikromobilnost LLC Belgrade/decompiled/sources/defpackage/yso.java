package defpackage;

import android.animation.ValueAnimator;
import androidx.camera.view.ScreenFlashView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.a;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.glowingborder.GlowingBorderDrawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerAnimatedBorderView;
import com.yandex.go.superapp.discovery.map.impl.ui.main.explorer.ExplorerDistrictCoverageProgressView;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardCompanionSectionView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.timeline.RideCardTimelineBannerView;
import com.yandex.go.vault.ui.PrizeModalView;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.maps.core.geometry.Point;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.plus.home.animation.PlusLoadingAnimationView;
import com.ybsdk.feature.main.internal.screens.products.views.PulsingGradientDrawable;
import com.ybsdk.feature.savings.internal.screens.account.view.IncomeProgressView;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import java.util.Collections;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemExpandableContainerComponent;
import ru.yandex.taxi.design.ProgressButtonComponent;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.widget.OptimizedShimmeringPaint;
import ru.yandex.taxi.widget.OptimizedShimmeringRobotoTextView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final /* synthetic */ class yso implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yso(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f4c0 f4c0Var;
        Guideline guideline;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ExplorerAnimatedBorderView.animator$lambda$0$0((ExplorerAnimatedBorderView) obj, valueAnimator);
                break;
            case 1:
                ExplorerDistrictCoverageProgressView.setCoverage$lambda$0$0((ExplorerDistrictCoverageProgressView) obj, valueAnimator);
                break;
            case 2:
                auo auoVar = (auo) obj;
                Float f = (Float) valueAnimator.getAnimatedValue();
                auoVar.a = f.floatValue();
                ((tls) auoVar.b).invoke(f);
                break;
            case 3:
                v2t v2tVar = (v2t) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo1 eo1Var = v2tVar.c;
                Point.Companion companion = Point.INSTANCE;
                Point point = v2tVar.a;
                double lat = point.getLat();
                Point point2 = v2tVar.b;
                double d = floatValue;
                eo1Var.invoke(companion.invoke(((point2.getLat() - point.getLat()) * d) + lat, ((point2.getLon() - point.getLon()) * d) + point.getLon()));
                break;
            case 4:
                ((sxo) obj).invoke((Float) valueAnimator.getAnimatedValue());
                break;
            case 5:
                GlowingBorderDrawable.startAnimation$lambda$3$lambda$2((GlowingBorderDrawable) obj, valueAnimator);
                break;
            case 6:
                Iterator it = ((o1v) obj).c.iterator();
                while (it.hasNext()) {
                    w4e0 w4e0Var = (w4e0) it.next();
                    float f2 = w4e0Var.l;
                    if (f2 > 0.0f) {
                        w4e0Var.t(valueAnimator.getAnimatedFraction() * (w4e0Var.m + f2));
                    }
                }
                break;
            case 7:
                IncomeProgressView.animateProgress$lambda$14$lambda$12((IncomeProgressView) obj, valueAnimator);
                break;
            case 8:
                ListItemExpandableContainerComponent.animateHeight$lambda$0((ListItemExpandableContainerComponent) obj, valueAnimator);
                break;
            case 9:
                a aVar = (a) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar.k.setAlpha((int) (255.0f * floatValue2));
                aVar.y = floatValue2;
                break;
            case 10:
                ((ClippableRoundedCornerLayout) obj).updateCornerRadii((float[]) valueAnimator.getAnimatedValue());
                break;
            case 11:
                ru.yandex.taxi.masstransit.promo.a aVar2 = (ru.yandex.taxi.masstransit.promo.a) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aVar2.d.b.setTranslationY(floatValue3);
                aVar2.b.setTranslationY(floatValue3);
                break;
            case 12:
                j250 j250Var = (j250) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f3 = ((-1.0f) * floatValue4) + 1.0f;
                j250Var.d.setAlpha(f3);
                RobotoTextView robotoTextView = j250Var.g;
                robotoTextView.setAlpha(f3);
                float f4 = ((-0.5f) * floatValue4) + 1.0f;
                robotoTextView.setScaleX(f4);
                robotoTextView.setScaleY(f4);
                break;
            case 13:
                ((gh00) ((wb50) obj).a).x((ScreenPoint) valueAnimator.getAnimatedValue());
                break;
            case 14:
                OptimizedShimmeringPaint.enableShimmering$lambda$0((OptimizedShimmeringPaint) obj, valueAnimator);
                break;
            case 15:
                OptimizedShimmeringRobotoTextView.gradientAnimator$lambda$0$0((OptimizedShimmeringRobotoTextView) obj, valueAnimator);
                break;
            case 16:
                p190 p190Var = (p190) obj;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i2 = p190Var.q;
                w4e0 w4e0Var2 = p190Var.k;
                PolylinePosition polylinePosition = p190Var.o;
                if (intValue != i2 && w4e0Var2 != null && polylinePosition != null) {
                    if (intValue >= polylinePosition.getSegmentIndex()) {
                        w4e0Var2.r(EmptyList.a);
                    } else {
                        w4e0Var2.r(Collections.singletonList(new Subpolyline(new PolylinePosition(intValue, 1.0d), polylinePosition)));
                    }
                    p190Var.q = intValue;
                    break;
                }
                break;
            case 17:
                PlusLoadingAnimationView.animation_delegate$lambda$13$lambda$12$lambda$10((PlusLoadingAnimationView) obj, valueAnimator);
                break;
            case 18:
                n58 n58Var = ((m58) obj).d;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue(CaretView.ALPHA_PROPERTY)).floatValue();
                if (n58Var != null && (f4c0Var = n58Var.a) != null) {
                    f4c0Var.A(floatValue5);
                    break;
                }
                break;
            case 19:
                ((PrintAnimationTextView) obj).animateClipBounds(valueAnimator);
                break;
            case 20:
                PrizeModalView.setupAppearanceAnimation$lambda$0((PrizeModalView) obj, valueAnimator);
                break;
            case 21:
                ProgressButtonComponent.resumeProgressAnimation$lambda$0$0((ProgressButtonComponent) obj, valueAnimator);
                break;
            case 22:
                ProgressIndicator.progressAnimation$lambda$2$lambda$1((ProgressIndicator) obj, valueAnimator);
                break;
            case 23:
                PulsingGradientDrawable.startPulse$lambda$8$lambda$7((PulsingGradientDrawable) obj, valueAnimator);
                break;
            case 24:
                RideCardCompanionSectionView.lottieViewFadeInAnimator_delegate$lambda$0$0$0((RideCardCompanionSectionView) obj, valueAnimator);
                break;
            case 25:
                RideCardTimelineBannerView.animateOffsetTail$lambda$0((RideCardTimelineBannerView) obj, valueAnimator);
                break;
            case 26:
                SavingsAccountCloseDepositFragment.startScaryAnimation$lambda$6$lambda$4((SavingsAccountCloseDepositFragment) obj, valueAnimator);
                break;
            case 27:
                ScootersFeedbackCard.changeRatingBarTitleVisibility$lambda$0$0((ScootersFeedbackCard) obj, valueAnimator);
                break;
            case 28:
                ScootersQrModalView scootersQrModalView = (ScootersQrModalView) obj;
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                scootersQrModalView.offerCardBottomOffset = intValue2;
                guideline = scootersQrModalView.offerCardOffsetGuideline;
                guideline.setGuidelineEnd(intValue2);
                break;
            default:
                ((ScreenFlashView) obj).lambda$animateToFullOpacity$0(valueAnimator);
                break;
        }
    }
}
