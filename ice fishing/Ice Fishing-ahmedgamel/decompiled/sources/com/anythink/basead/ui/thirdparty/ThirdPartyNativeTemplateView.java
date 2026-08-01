package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.MediaATView;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.l.e.a.d;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThirdPartyNativeTemplateView extends MediaATView implements d {

    /* renamed from: r, reason: collision with root package name */
    ATNativeAdInfo.AdPrepareInfo f11349r;

    /* renamed from: s, reason: collision with root package name */
    private BaseAd f11350s;

    public ThirdPartyNativeTemplateView(Context context, w wVar, x xVar, boolean z3, BaseMediaATView.a aVar, BaseAd baseAd) {
        super(context, wVar, xVar, z3, aVar);
        this.f11350s = baseAd;
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final void a(int i, int i6) {
        ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_media_ad_main_image_container", "id"));
        View adMediaView = this.f11350s.getAdMediaView(viewGroup);
        if (viewGroup == null || adMediaView == null) {
            super.a(i, i6);
        } else {
            if (this.f9828c.f14168o.J() != 0) {
                c.c(adMediaView);
            }
            am.a(adMediaView);
            viewGroup.addView(adMediaView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f11350s.setVideoMute(true);
        View findViewById = findViewById(q.a(getContext(), "myoffer_ad_lable", "id"));
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // com.anythink.core.common.l.e.a.d
    public void destroyNativeAd() {
        destroyPlayerView(0);
    }

    public ATNativeAdInfo.AdPrepareInfo getAdPrepareInfo() {
        return this.f11349r;
    }

    @Override // com.anythink.basead.ui.MediaATView, com.anythink.basead.ui.BaseMediaATView
    public void init(int i, int i6, int i9) {
        super.init(i, i6, i9);
        ATNativeAdInfo.AdPrepareInfo adPrepareInfo = new ATNativeAdInfo.AdPrepareInfo();
        this.f11349r = adPrepareInfo;
        adPrepareInfo.setTitleView(((MediaATView) this).f10093j);
        this.f11349r.setDescView(this.f10098o);
        this.f11349r.setIconView(this.f10097n);
        this.f11349r.setMainImageView(this.f10096m);
        this.f11349r.setCtaView(((MediaATView) this).f10094k);
        this.f11349r.setParentView(this);
        this.f11349r.setCloseView(this.f9832g);
        this.f11349r.setAdLogoView(this.f10099p);
        this.f11349r.getClickViewList().clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(((MediaATView) this).f10094k);
        if (this.f9828c.f14168o.J() == 0) {
            arrayList.add(((MediaATView) this).f10093j);
            arrayList.add(this.f10098o);
            arrayList.add(this.f10097n);
            arrayList.add(this.f10096m);
            arrayList.add(this);
        }
        this.f11349r.setClickViewList(arrayList);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(getContext(), 32.0f), q.a(getContext(), 12.0f));
        layoutParams.gravity = 85;
        this.f11349r.setChoiceViewLayoutParams(layoutParams);
        View adIconView = this.f11350s.getAdIconView();
        RoundImageView roundImageView = this.f10097n;
        if (roundImageView != null && adIconView != null) {
            if (roundImageView.getParent() != null && (this.f10097n.getParent() instanceof ViewGroup)) {
                am.a(adIconView);
                this.f10097n.setVisibility(0);
                ((ViewGroup) this.f10097n.getParent()).addView(adIconView, this.f10097n.getLayoutParams());
            }
            if (this.f9828c.f14168o.J() != 0) {
                c.c(adIconView);
            }
        }
        View adLogoView = this.f11350s.getAdLogoView();
        ImageView imageView = this.f10099p;
        if (imageView != null && adLogoView != null && imageView.getParent() != null && (this.f10099p.getParent() instanceof ViewGroup)) {
            am.a(adLogoView);
            this.f10099p.setVisibility(4);
            ((ViewGroup) this.f10099p.getParent()).addView(adLogoView, this.f10099p.getLayoutParams());
        }
        if (this.i != null) {
            com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
            this.i.a(this.f11350s, bVar, true);
            this.f11349r.setDomainView(bVar.h());
            this.f11349r.setWarningView(bVar.i());
            this.f11349r.setAdFromView(bVar.f());
        }
        setIsMuted(true);
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final boolean a() {
        return this.f11350s.getAdIconView() == null && super.a();
    }
}
