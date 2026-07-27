package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1868hB {
    public InterfaceC1711ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1839gi c1839gi, NativeAd nativeAd, C1303Vd c1303Vd) {
        C1533bk c1533bk = new C1533bk(c1839gi);
        MediaView mediaView = new MediaView(c1839gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1839gi, nativeAd, nativeAdLayout);
        c1303Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1839gi, nativeAd, c1303Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1533bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1303Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1533bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1209Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
