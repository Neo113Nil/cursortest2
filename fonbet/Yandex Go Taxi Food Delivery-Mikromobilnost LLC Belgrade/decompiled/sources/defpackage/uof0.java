package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.navigation.NavigationBarView;
import com.yandex.go.analytics.realtime.event.CreativeType;
import defpackage.dqf0;
import defpackage.g8e;
import defpackage.iei0;
import defpackage.lx4;
import defpackage.mnf0;
import defpackage.mof0;
import defpackage.tje;
import defpackage.vof0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.main_screen_custom.presentation.PromoOverMapView;
import ru.yandex.taxi.widget.TooltipView;

/* loaded from: classes9.dex */
public final class uof0 implements vof0 {
    public final /* synthetic */ PromoOverMapView a;

    public uof0(PromoOverMapView promoOverMapView) {
        this.a = promoOverMapView;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    @Override // defpackage.eyi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(Object obj) {
        a3v a3vVar;
        int y;
        int i;
        int i2;
        TooltipView tooltipView;
        TooltipView tooltipView2;
        TooltipView tooltipView3;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        int i3;
        int i4;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        int i5;
        TooltipView tooltipView4;
        TooltipView tooltipView5;
        TooltipView tooltipView6;
        TooltipView tooltipView7;
        LottieAnimationView lottieAnimationView5;
        LottieAnimationView lottieAnimationView6;
        TooltipView tooltipView8;
        TooltipView tooltipView9;
        LottieAnimationView lottieAnimationView7;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        LottieAnimationView lottieAnimationView8;
        LottieAnimationView lottieAnimationView9;
        LottieAnimationView lottieAnimationView10;
        LottieAnimationView lottieAnimationView11;
        LottieAnimationView lottieAnimationView12;
        LottieAnimationView lottieAnimationView13;
        LottieAnimationView lottieAnimationView14;
        TooltipView tooltipView10;
        TooltipView tooltipView11;
        TooltipView tooltipView12;
        oof0 oof0Var = (oof0) obj;
        boolean z = oof0Var instanceof lof0;
        final PromoOverMapView promoOverMapView = this.a;
        if (z) {
            final lof0 lof0Var = (lof0) oof0Var;
            String d = lof0Var.c().d();
            if (d != null) {
                promoOverMapView.setContentDescription(d);
            }
            CharSequence c = lof0Var.c().c();
            if (c != null && c.length() != 0) {
                tooltipView10 = promoOverMapView.bubble;
                tooltipView10.setText(c);
                if (promoOverMapView.isOpaque()) {
                    tooltipView12 = promoOverMapView.bubble;
                    cma1.J(tooltipView12);
                } else {
                    tooltipView11 = promoOverMapView.bubble;
                    tooltipView11.setVisibility(0);
                }
            } else if (promoOverMapView.isOpaque()) {
                tooltipView9 = promoOverMapView.bubble;
                cma1.M(tooltipView9);
            } else {
                tooltipView8 = promoOverMapView.bubble;
                tooltipView8.setVisibility(4);
            }
            mnf0 c2 = lof0Var.c();
            boolean b = lof0Var.b();
            int a = lof0Var.a();
            llf0 b2 = c2.b();
            nsz b3 = b2.b();
            if (b3 != null) {
                imageView3 = promoOverMapView.promoStaticImage;
                imageView3.setVisibility(8);
                lottieAnimationView8 = promoOverMapView.promoPackage;
                lottieAnimationView8.setVisibility(0);
                lottieAnimationView9 = promoOverMapView.promoPackage;
                lottieAnimationView9.setRepeatCount(c2.b().c() - a);
                lottieAnimationView10 = promoOverMapView.promoPackage;
                final String e = c2.e();
                lottieAnimationView10.addAnimatorListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.main_screen_custom.presentation.PromoOverMapView$MvpImpl$getAnimatorListener$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        v vVar;
                        vVar = PromoOverMapView.this.promoOverMapViewPresenter;
                        String str = e;
                        HashMap hashMap = vVar.H.b;
                        Integer num = (Integer) hashMap.get(str);
                        hashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animation) {
                        v vVar;
                        vVar = PromoOverMapView.this.promoOverMapViewPresenter;
                        String str = e;
                        HashMap hashMap = vVar.H.b;
                        Integer num = (Integer) hashMap.get(str);
                        hashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                    }
                });
                lottieAnimationView11 = promoOverMapView.promoPackage;
                lottieAnimationView11.setImageAssetsFolder("promo_image_assets_folder" + c2.e());
                lottieAnimationView12 = promoOverMapView.promoPackage;
                lottieAnimationView12.setComposition(b3);
                if (b) {
                    lottieAnimationView13 = promoOverMapView.promoPackage;
                    lottieAnimationView14 = promoOverMapView.promoPackage;
                    lottieAnimationView13.postDelayed(new fsz(lottieAnimationView14, 1), (long) (c2.b().a() * 1000.0d));
                }
            }
            Bitmap d2 = b2.d();
            if (d2 != null) {
                lottieAnimationView7 = promoOverMapView.promoPackage;
                lottieAnimationView7.setVisibility(8);
                imageView = promoOverMapView.promoStaticImage;
                imageView.setVisibility(0);
                imageView2 = promoOverMapView.promoStaticImage;
                imageView2.setImageBitmap(d2);
            }
            xw31.C(tof0.a[lof0Var.c().f().ordinal()] == 1 ? NavigationBarView.ITEM_GRAVITY_START_CENTER : 8388629, promoOverMapView);
            c.z(new sls() { // from class: ru.yandex.taxi.main_screen_custom.presentation.a
                @Override // defpackage.sls
                public final Object invoke() {
                    v vVar;
                    vVar = PromoOverMapView.this.promoOverMapViewPresenter;
                    mnf0 mnf0Var = lof0Var.a;
                    ru.yandex.taxi.main_screen_custom.presentation.analytics.a aVar = vVar.C;
                    lx4 lx4Var = aVar.a;
                    String name = mnf0Var.f.name();
                    String str = mnf0Var.c.a;
                    String str2 = mnf0Var.a;
                    ru.yandex.taxi.analytics.i d3 = ((ru.yandex.taxi.analytics.j) lx4Var).d("Main.PromoObject.Tap");
                    LinkedHashMap linkedHashMap = d3.a;
                    linkedHashMap.put("position", name);
                    linkedHashMap.put("content", str);
                    linkedHashMap.put("id", str2);
                    d3.m();
                    Map map = mnf0Var.h;
                    if (map != null && !map.isEmpty()) {
                        ((com.yandex.go.analytics.realtime.a) aVar.b).d(new iei0(CreativeType.PromoOverMap, mnf0Var.a, mnf0Var.h, null, null, 50));
                    }
                    dqf0 dqf0Var = vVar.F;
                    String str3 = mnf0Var.d.a;
                    dqf0Var.a.p(dqf0Var.a.i("click_count" + str3, 0) + 1, g8e.o("click_count", str3));
                    if (!vVar.Lg(mnf0Var)) {
                        ((vof0) vVar.Dg()).render(mof0.d);
                    }
                    tje.N(vVar.Jg(), null, null, new PromoOverMapViewPresenter$promoClicked$1(vVar, mnf0Var, null), 3);
                    return zy11.a;
                }
            }, promoOverMapView);
            return;
        }
        if (jl40.l(oof0Var, mof0.a)) {
            promoOverMapView.setVisibility(8);
            return;
        }
        if (jl40.l(oof0Var, mof0.c)) {
            cma1.J(promoOverMapView);
            return;
        }
        if (jl40.l(oof0Var, mof0.b)) {
            cma1.M(promoOverMapView);
            return;
        }
        if (jl40.l(oof0Var, mof0.d)) {
            lottieAnimationView5 = promoOverMapView.promoPackage;
            lottieAnimationView5.cancelAnimation();
            lottieAnimationView6 = promoOverMapView.promoPackage;
            lottieAnimationView6.setFrame(0);
            return;
        }
        if (!(oof0Var instanceof nof0)) {
            w511.b();
            return;
        }
        nof0 nof0Var = (nof0) oof0Var;
        if (promoOverMapView.getParent() == null || !xw31.j(promoOverMapView)) {
            return;
        }
        int top = (promoOverMapView.getTop() + promoOverMapView.getBottom()) / 2;
        Rect rect = nof0Var.a;
        boolean z2 = nof0Var.d;
        int centerY = rect.centerY() - top;
        if (nof0Var.b) {
            promoOverMapView.animate().setDuration(200L).translationY(centerY);
        } else {
            float f = centerY;
            promoOverMapView.setTranslationY(f);
            promoOverMapView.animate().translationY(f);
        }
        Integer num = nof0Var.c;
        if (num != null) {
            y = num.intValue();
        } else {
            a3vVar = promoOverMapView.focusCoordinator;
            y = (int) a3vVar.getFocusRect().getBottomRight().getY();
        }
        i = promoOverMapView.listItemHeight;
        int i6 = y - i;
        i2 = promoOverMapView.topBarrier;
        int i7 = i6 - i2;
        if (z2) {
            i5 = promoOverMapView.imageDefaultHeight;
            tooltipView4 = promoOverMapView.bubble;
            if (i7 < tooltipView4.getHeight() + i5) {
                tooltipView5 = promoOverMapView.bubble;
                CharSequence text = tooltipView5.getText();
                if (text != null && text.length() != 0) {
                    if (promoOverMapView.isOpaque()) {
                        tooltipView7 = promoOverMapView.bubble;
                        cma1.M(tooltipView7);
                    } else {
                        tooltipView6 = promoOverMapView.bubble;
                        tooltipView6.setVisibility(4);
                    }
                }
                if (z2) {
                    i3 = promoOverMapView.imageDefaultHeight;
                    if (i7 < i3) {
                        i4 = promoOverMapView.imageDefaultHeight;
                        float f2 = i7 / i4;
                        lottieAnimationView3 = promoOverMapView.promoPackage;
                        lottieAnimationView3.setScaleX(f2);
                        lottieAnimationView4 = promoOverMapView.promoPackage;
                        lottieAnimationView4.setScaleY(f2);
                        return;
                    }
                }
                lottieAnimationView = promoOverMapView.promoPackage;
                lottieAnimationView.setScaleX(1.0f);
                lottieAnimationView2 = promoOverMapView.promoPackage;
                lottieAnimationView2.setScaleY(1.0f);
            }
        }
        tooltipView = promoOverMapView.bubble;
        CharSequence text2 = tooltipView.getText();
        if (text2 != null && text2.length() != 0) {
            if (promoOverMapView.isOpaque()) {
                tooltipView3 = promoOverMapView.bubble;
                cma1.J(tooltipView3);
            } else {
                tooltipView2 = promoOverMapView.bubble;
                tooltipView2.setVisibility(0);
            }
        }
        if (z2) {
        }
        lottieAnimationView = promoOverMapView.promoPackage;
        lottieAnimationView.setScaleX(1.0f);
        lottieAnimationView2 = promoOverMapView.promoPackage;
        lottieAnimationView2.setScaleY(1.0f);
    }
}
