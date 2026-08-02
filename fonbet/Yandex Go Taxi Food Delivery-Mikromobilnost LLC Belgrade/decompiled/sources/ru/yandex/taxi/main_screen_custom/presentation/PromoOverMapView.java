package ru.yandex.taxi.main_screen_custom.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.mapkit.ScreenRect;
import defpackage.a3v;
import defpackage.cma1;
import defpackage.gh00;
import defpackage.ib00;
import defpackage.jeh0;
import defpackage.nof0;
import defpackage.ny61;
import defpackage.oqh0;
import defpackage.tje;
import defpackage.trg0;
import defpackage.uof0;
import defpackage.usg0;
import defpackage.vof0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.TooltipView;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonFrameLayout;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001'B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, d2 = {"Lru/yandex/taxi/main_screen_custom/presentation/PromoOverMapView;", "Lru/yandex/taxi/widget/accessibility/AccessibilityButtonFrameLayout;", "Landroid/content/Context;", "context", "La3v;", "focusCoordinator", "Lru/yandex/taxi/main_screen_custom/presentation/v;", "promoOverMapViewPresenter", "<init>", "(Landroid/content/Context;La3v;Lru/yandex/taxi/main_screen_custom/presentation/v;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "La3v;", "Lru/yandex/taxi/main_screen_custom/presentation/v;", "Lib00;", "binding", "Lib00;", "Lcom/airbnb/lottie/LottieAnimationView;", "promoPackage", "Lcom/airbnb/lottie/LottieAnimationView;", "Landroid/widget/ImageView;", "promoStaticImage", "Landroid/widget/ImageView;", "Lru/yandex/taxi/widget/TooltipView;", "bubble", "Lru/yandex/taxi/widget/TooltipView;", "imageDefaultHeight", CA20Status.STATUS_USER_I, "listItemHeight", "topBarrier", "uof0", "main_screen_custom"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PromoOverMapView extends AccessibilityButtonFrameLayout {
    private final ib00 binding;
    private final TooltipView bubble;
    private final a3v focusCoordinator;
    private final int imageDefaultHeight;
    private final int listItemHeight;
    private final v promoOverMapViewPresenter;
    private final LottieAnimationView promoPackage;
    private final ImageView promoStaticImage;
    private final int topBarrier;

    public PromoOverMapView(Context context, a3v a3vVar, v vVar) {
        super(context, null, 0, 6, null);
        this.focusCoordinator = a3vVar;
        this.promoOverMapViewPresenter = vVar;
        View inflate = LayoutInflater.from(context).inflate(oqh0.main_screen_promo_view, (ViewGroup) this, false);
        addView(inflate);
        int i = jeh0.promo_animation_package;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i, inflate);
        if (lottieAnimationView != null) {
            i = jeh0.promo_bubble;
            TooltipView tooltipView = (TooltipView) cma1.O(i, inflate);
            if (tooltipView != null) {
                i = jeh0.promo_static_image;
                ImageView imageView = (ImageView) cma1.O(i, inflate);
                if (imageView != null) {
                    this.binding = new ib00((LinearLayout) inflate, lottieAnimationView, tooltipView, imageView);
                    this.promoPackage = lottieAnimationView;
                    this.promoStaticImage = imageView;
                    this.bubble = tooltipView;
                    this.imageDefaultHeight = tje.r(trg0.main_screen_promo_animation_height, getContext());
                    this.listItemHeight = tje.r(usg0.list_item_height, getContext());
                    this.topBarrier = tje.r(usg0.list_item_height, getContext());
                    setAlpha(0.0f);
                    tooltipView.setClickable(false);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v vVar = this.promoOverMapViewPresenter;
        vVar.Bg(new uof0(this));
        com.yandex.go.navigation.screen.c cVar = vVar.I;
        tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$listenToNewPromo$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(new e(cVar.c()), new PromoOverMapViewPresenter$listenToNewPromo$$inlined$flatMapLatest$1(null, vVar)), null, vVar), 3);
        tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$listenToPinRectChanges$$inlined$collectIn$1(kotlinx.coroutines.flow.e.X(cVar.c(), new PromoOverMapViewPresenter$listenToPinRectChanges$$inlined$flatMapLatest$1(null, vVar)), null, (vof0) vVar.Dg()), 3);
        tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$updatePromoOnResume$1(null, vVar), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.promoOverMapViewPresenter.Cg();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        nof0 nof0Var;
        super.onSizeChanged(w, h, oldw, oldh);
        if (oldw == 0 || oldh == 0) {
            v vVar = this.promoOverMapViewPresenter;
            if (vVar.I.b() == Screen.DELIVERY_ROUTE) {
                ScreenRect c = ((gh00) vVar.x).a.c();
                nof0Var = c != null ? v.Mg(c) : null;
            } else {
                nof0Var = new nof0(vVar.y.Gf(), false);
            }
            if (nof0Var != null) {
                ((vof0) vVar.Dg()).render(nof0Var);
            }
        }
    }
}
