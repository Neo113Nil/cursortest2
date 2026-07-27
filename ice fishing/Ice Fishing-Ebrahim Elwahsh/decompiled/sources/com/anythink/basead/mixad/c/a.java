package com.anythink.basead.mixad.c;

import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.BaseAd;

/* loaded from: classes.dex */
public final class a implements ATNativeAdInfo.AdController {

    /* renamed from: a, reason: collision with root package name */
    private BaseAd f9664a;

    public a(BaseAd baseAd) {
        this.f9664a = baseAd;
    }

    @Override // com.anythink.core.api.ATNativeAdInfo.AdController
    public final void pauseVideo() {
        BaseAd baseAd = this.f9664a;
        if (baseAd != null) {
            baseAd.pauseVideo();
        }
    }

    @Override // com.anythink.core.api.ATNativeAdInfo.AdController
    public final void resumeVideo() {
        BaseAd baseAd = this.f9664a;
        if (baseAd != null) {
            baseAd.resumeVideo();
        }
    }

    @Override // com.anythink.core.api.ATNativeAdInfo.AdController
    public final void setVideoMute(boolean z8) {
        BaseAd baseAd = this.f9664a;
        if (baseAd != null) {
            baseAd.setVideoMute(z8);
        }
    }
}
