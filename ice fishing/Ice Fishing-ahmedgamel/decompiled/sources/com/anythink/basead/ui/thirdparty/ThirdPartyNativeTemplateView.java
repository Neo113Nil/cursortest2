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
    ATNativeAdInfo.AdPrepareInfo f12135r;

    /* renamed from: s, reason: collision with root package name */
    private BaseAd f12136s;

    public ThirdPartyNativeTemplateView(Context context, w wVar, x xVar, boolean z6, BaseMediaATView.a aVar, BaseAd baseAd) {
        super(context, wVar, xVar, z6, aVar);
        this.f12136s = baseAd;
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final void a(int i, int i4) {
        ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_media_ad_main_image_container", "id"));
        View adMediaView = this.f12136s.getAdMediaView(viewGroup);
        if (viewGroup == null || adMediaView == null) {
            super.a(i, i4);
        } else {
            if (this.f10614c.f14954o.J() != 0) {
                c.c(adMediaView);
            }
            am.a(adMediaView);
            viewGroup.addView(adMediaView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f12136s.setVideoMute(true);
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
        return this.f12135r;
    }

    @Override // com.anythink.basead.ui.MediaATView, com.anythink.basead.ui.BaseMediaATView
    public void init(int i, int i4, int i6) {
        super.init(i, i4, i6);
        ATNativeAdInfo.AdPrepareInfo adPrepareInfo = new ATNativeAdInfo.AdPrepareInfo();
        this.f12135r = adPrepareInfo;
        adPrepareInfo.setTitleView(((MediaATView) this).f10879j);
        this.f12135r.setDescView(this.f10884o);
        this.f12135r.setIconView(this.f10883n);
        this.f12135r.setMainImageView(this.f10882m);
        this.f12135r.setCtaView(((MediaATView) this).f10880k);
        this.f12135r.setParentView(this);
        this.f12135r.setCloseView(this.f10618g);
        this.f12135r.setAdLogoView(this.f10885p);
        this.f12135r.getClickViewList().clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(((MediaATView) this).f10880k);
        if (this.f10614c.f14954o.J() == 0) {
            arrayList.add(((MediaATView) this).f10879j);
            arrayList.add(this.f10884o);
            arrayList.add(this.f10883n);
            arrayList.add(this.f10882m);
            arrayList.add(this);
        }
        this.f12135r.setClickViewList(arrayList);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(q.a(getContext(), 32.0f), q.a(getContext(), 12.0f));
        layoutParams.gravity = 85;
        this.f12135r.setChoiceViewLayoutParams(layoutParams);
        View adIconView = this.f12136s.getAdIconView();
        RoundImageView roundImageView = this.f10883n;
        if (roundImageView != null && adIconView != null) {
            if (roundImageView.getParent() != null && (this.f10883n.getParent() instanceof ViewGroup)) {
                am.a(adIconView);
                this.f10883n.setVisibility(0);
                ((ViewGroup) this.f10883n.getParent()).addView(adIconView, this.f10883n.getLayoutParams());
            }
            if (this.f10614c.f14954o.J() != 0) {
                c.c(adIconView);
            }
        }
        View adLogoView = this.f12136s.getAdLogoView();
        ImageView imageView = this.f10885p;
        if (imageView != null && adLogoView != null && imageView.getParent() != null && (this.f10885p.getParent() instanceof ViewGroup)) {
            am.a(adLogoView);
            this.f10885p.setVisibility(4);
            ((ViewGroup) this.f10885p.getParent()).addView(adLogoView, this.f10885p.getLayoutParams());
        }
        if (this.i != null) {
            com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
            this.i.a(this.f12136s, bVar, true);
            this.f12135r.setDomainView(bVar.h());
            this.f12135r.setWarningView(bVar.i());
            this.f12135r.setAdFromView(bVar.f());
        }
        setIsMuted(true);
    }

    @Override // com.anythink.basead.ui.MediaATView
    public final boolean a() {
        return this.f12136s.getAdIconView() == null && super.a();
    }
}
