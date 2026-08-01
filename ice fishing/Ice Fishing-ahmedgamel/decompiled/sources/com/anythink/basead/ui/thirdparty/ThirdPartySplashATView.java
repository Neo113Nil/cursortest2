package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.AsseblemSplashATView;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.e.a.f;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThirdPartySplashATView extends AsseblemSplashATView implements f {

    /* renamed from: A, reason: collision with root package name */
    BaseAd f11353A;

    /* renamed from: B, reason: collision with root package name */
    private View f11354B;

    public ThirdPartySplashATView(Context context) {
        super(context);
    }

    private void D() {
        BaseAd baseAd;
        BaseAd baseAd2;
        BaseAd baseAd3;
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.f9742n.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd3 = this.f11353A) != null && baseAd3.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.f11353A.getAdMediaView(new Object[0]);
            this.f11354B = adMediaView;
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.f11354B.getParent()).removeView(this.f11354B);
            }
            frameLayout2.addView(this.f11354B, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && (baseAd2 = this.f11353A) != null && baseAd2.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = layoutParams.height;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (this.f9735f.f14168o.C() == 2) {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = q.a(getContext(), 18.0f);
                } else {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = q.a(getContext(), 12.0f);
                }
            }
            roundImageView.setLayoutParams(layoutParams);
            ((ViewGroup) roundImageView.getParent()).addView(this.f11353A.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (((BaseSdkSplashATView) this).f9887C == null || (baseAd = this.f11353A) == null || baseAd.getAdLogoView() == null || ((BaseSdkSplashATView) this).f9887C.getParent() == null || !(((BaseSdkSplashATView) this).f9887C.getParent() instanceof ViewGroup)) {
            return;
        }
        ((BaseSdkSplashATView) this).f9887C.setVisibility(4);
        ((ViewGroup) ((BaseSdkSplashATView) this).f9887C.getParent()).addView(this.f11353A.getAdLogoView(), ((BaseSdkSplashATView) this).f9887C.getLayoutParams());
    }

    private boolean E() {
        x xVar = this.f9735f;
        return xVar != null && xVar.f14160f == 39;
    }

    private boolean F() {
        x xVar = this.f9735f;
        return xVar != null && xVar.f14160f == 59;
    }

    private boolean G() {
        x xVar = this.f9735f;
        return xVar != null && xVar.f14160f == 2;
    }

    private boolean H() {
        y yVar;
        x xVar = this.f9735f;
        return (xVar == null || (yVar = xVar.f14168o) == null || yVar.J() == 0) ? false : true;
    }

    private boolean I() {
        BaseAd baseAd = this.f11353A;
        return (baseAd == null || !TextUtils.equals(baseAd.getAdType(), "1") || this.f11354B == null) ? false : true;
    }

    private boolean J() {
        x xVar = this.f9735f;
        int i = xVar != null ? xVar.f14160f : 0;
        return i == 2 || i == 39 || i == 47 || i == 50 || i == 59;
    }

    private void b(View view) {
        FrameLayout.LayoutParams a9 = com.anythink.basead.mixad.f.a.a(this.f9735f.f14160f, 0, 0);
        if (this.f11353A != null) {
            com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
            com.anythink.basead.ui.f.a aVar = this.f9948V;
            if (aVar != null) {
                aVar.a(this.f11353A, bVar, true);
            }
            bVar.a(((AsseblemSplashATView) this).f9682a);
            View view2 = this.f9745q;
            if (view2 instanceof CTAButtonLayout) {
                bVar.e(((CTAButtonLayout) view2).getMajorCTAButtonView());
            } else {
                bVar.e(view2);
            }
            bVar.d(((AsseblemSplashATView) this).f9683b);
            bVar.b(getIconView());
            if (this.f9735f.f14168o.J() == 0) {
                this.f9742n.add(this);
                this.f11353A.registerListener(view, this.f9742n, a9, bVar);
                return;
            }
            if (this.f9735f.f14168o.J() == 2) {
                c(this.f11354B);
                ArrayList arrayList = new ArrayList();
                View view3 = ((AsseblemSplashATView) this).f9685d;
                if (view3 != null) {
                    arrayList.add(view3);
                }
                this.f11353A.registerListener(view, arrayList, a9, bVar);
                return;
            }
            x xVar = this.f9735f;
            if (xVar != null && xVar.f14160f == 59) {
                c.c(this.f11353A.getAdIconView());
            }
            c(this.f11354B);
            ArrayList arrayList2 = new ArrayList();
            View view4 = this.f9745q;
            if (view4 instanceof CTAButtonLayout) {
                arrayList2.add(((CTAButtonLayout) view4).getMajorCTAButtonView());
            } else {
                arrayList2.add(view4);
            }
            this.f11353A.registerListener(view, arrayList2, a9, bVar);
        }
    }

    private void c(View view) {
        if (view != null && H()) {
            if (J()) {
                c.c(view);
            }
            if (!E() || I()) {
                return;
            }
            c.b(view);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final float a(com.anythink.basead.ui.b bVar, boolean z3) {
        return 1.0f;
    }

    @Override // com.anythink.basead.ui.AsseblemSplashATView, com.anythink.basead.ui.BaseSdkSplashATView
    public final void d() {
    }

    public void disableHWVideoViewClickable() {
        if (H() && E()) {
            c.a(this.f11354B);
        }
    }

    public View getIconView() {
        BaseAd baseAd = this.f11353A;
        if (baseAd == null) {
            return null;
        }
        if (!TextUtils.isEmpty(baseAd.getIconImageUrl())) {
            return ((AsseblemSplashATView) this).f9684c;
        }
        View adIconView = this.f11353A.getAdIconView();
        if (adIconView != null) {
            return adIconView;
        }
        return null;
    }

    @Override // com.anythink.core.common.l.e.a.f
    public void handleFullScreenClick(View view) {
        if (view != null && E() && H()) {
            c.c(view);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean n() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView, com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t.b().a(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartySplashATView.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseAd baseAd = ThirdPartySplashATView.this.f11353A;
                if (baseAd != null) {
                    baseAd.destroy();
                    ThirdPartySplashATView.this.f11353A = null;
                }
            }
        }, 1000L);
    }

    @Override // com.anythink.core.common.l.e.a.f
    public void registerNativeAdContainer(View view) {
        FrameLayout.LayoutParams a9 = com.anythink.basead.mixad.f.a.a(this.f9735f.f14160f, 0, 0);
        if (this.f11353A != null) {
            com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
            com.anythink.basead.ui.f.a aVar = this.f9948V;
            if (aVar != null) {
                aVar.a(this.f11353A, bVar, true);
            }
            bVar.a(((AsseblemSplashATView) this).f9682a);
            View view2 = this.f9745q;
            if (view2 instanceof CTAButtonLayout) {
                bVar.e(((CTAButtonLayout) view2).getMajorCTAButtonView());
            } else {
                bVar.e(view2);
            }
            bVar.d(((AsseblemSplashATView) this).f9683b);
            bVar.b(getIconView());
            if (this.f9735f.f14168o.J() == 0) {
                this.f9742n.add(this);
                this.f11353A.registerListener(view, this.f9742n, a9, bVar);
                return;
            }
            if (this.f9735f.f14168o.J() == 2) {
                c(this.f11354B);
                ArrayList arrayList = new ArrayList();
                View view3 = ((AsseblemSplashATView) this).f9685d;
                if (view3 != null) {
                    arrayList.add(view3);
                }
                this.f11353A.registerListener(view, arrayList, a9, bVar);
                return;
            }
            x xVar = this.f9735f;
            if (xVar != null && xVar.f14160f == 59) {
                c.c(this.f11353A.getAdIconView());
            }
            c(this.f11354B);
            ArrayList arrayList2 = new ArrayList();
            View view4 = this.f9745q;
            if (view4 instanceof CTAButtonLayout) {
                arrayList2.add(((CTAButtonLayout) view4).getMajorCTAButtonView());
            } else {
                arrayList2.add(view4);
            }
            this.f11353A.registerListener(view, arrayList2, a9, bVar);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void w() {
        super.w();
        ViewGroup viewGroup = this.f9937K;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView, com.anythink.basead.ui.BaseSplashATView
    public final void x() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartySplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar, String str, BaseAd baseAd, com.anythink.core.common.l.a aVar2) {
        super(context, xVar, wVar, aVar);
        BaseAd baseAd2;
        BaseAd baseAd3;
        BaseAd baseAd4;
        this.f11353A = baseAd;
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_lable_area", "id"));
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            this.f9742n.add(frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_ad_content_image_area", "id"));
        if (frameLayout2 != null && (baseAd4 = this.f11353A) != null && baseAd4.getAdMediaView(new Object[0]) != null) {
            View adMediaView = this.f11353A.getAdMediaView(new Object[0]);
            this.f11354B = adMediaView;
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.f11354B.getParent()).removeView(this.f11354B);
            }
            frameLayout2.addView(this.f11354B, new FrameLayout.LayoutParams(-1, -1));
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_splash_icon", "id"));
        if (roundImageView != null && (baseAd3 = this.f11353A) != null && baseAd3.getAdIconView() != null && roundImageView.getParent() != null && (roundImageView.getParent() instanceof ViewGroup)) {
            TextView textView = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_title", "id"));
            if (textView != null) {
                textView.setGravity(3);
            }
            TextView textView2 = (TextView) findViewById(q.a(getContext(), "myoffer_splash_desc", "id"));
            if (textView2 != null) {
                textView2.setGravity(3);
            }
            roundImageView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
            layoutParams.width = layoutParams.height;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (this.f9735f.f14168o.C() == 2) {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = q.a(getContext(), 18.0f);
                } else {
                    ((RelativeLayout.LayoutParams) layoutParams).rightMargin = q.a(getContext(), 12.0f);
                }
            }
            roundImageView.setLayoutParams(layoutParams);
            ((ViewGroup) roundImageView.getParent()).addView(this.f11353A.getAdIconView(), roundImageView.getLayoutParams());
        }
        if (((BaseSdkSplashATView) this).f9887C != null && (baseAd2 = this.f11353A) != null && baseAd2.getAdLogoView() != null && ((BaseSdkSplashATView) this).f9887C.getParent() != null && (((BaseSdkSplashATView) this).f9887C.getParent() instanceof ViewGroup)) {
            ((BaseSdkSplashATView) this).f9887C.setVisibility(4);
            ((ViewGroup) ((BaseSdkSplashATView) this).f9887C.getParent()).addView(this.f11353A.getAdLogoView(), ((BaseSdkSplashATView) this).f9887C.getLayoutParams());
        }
        if (aVar2 instanceof View) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            addView((View) aVar2, layoutParams2);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void a(boolean z3, int i) {
        B();
        if (z3 && !this.f9940N) {
            this.f9940N = true;
            this.f9947U = i;
            a(115);
            com.anythink.basead.g.a aVar = this.f9941O;
            if (aVar != null) {
                aVar.onAdClosed();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.anythink.core.common.l.a aVar) {
        if (aVar instanceof View) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView((View) aVar, layoutParams);
        }
    }
}
