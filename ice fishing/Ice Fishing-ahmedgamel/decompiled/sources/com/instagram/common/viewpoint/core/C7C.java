package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1889hB {
    public InterfaceC1732ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1860gi c1860gi, NativeAd nativeAd, C1324Vd c1324Vd) {
        C1554bk c1554bk = new C1554bk(c1860gi);
        MediaView mediaView = new MediaView(c1860gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1860gi, nativeAd, nativeAdLayout);
        c1324Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1860gi, nativeAd, c1324Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1554bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1324Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1554bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1230Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
