package yads;

import com.yandex.go.ads.mobile_ads_sdk.presentation.divkit.native_banner.MobileAdsNativeBannerView;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.j;
import defpackage.gn61;
import defpackage.sls;
import defpackage.uk10;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class ar3 extends Lambda implements sls {
    public final /* synthetic */ gn61 b;
    public final /* synthetic */ j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar3(gn61 gn61Var, j jVar) {
        super(0);
        this.b = gn61Var;
        this.c = jVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        NativeAdLoadListener nativeAdLoadListener = this.b.a;
        j jVar = this.c;
        MobileAdsNativeBannerView mobileAdsNativeBannerView = (MobileAdsNativeBannerView) ((uk10) nativeAdLoadListener).a;
        mobileAdsNativeBannerView.pendingAd = jVar;
        mobileAdsNativeBannerView.tryBind();
        return zy11.a;
    }
}
