package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends C1869hB {
    public InterfaceC1712ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(NativeAdLayout nativeAdLayout, C1840gi c1840gi, NativeAd nativeAd, C1304Vd c1304Vd) {
        C1534bk c1534bk = new C1534bk(c1840gi);
        MediaView mediaView = new MediaView(c1840gi);
        AdOptionsView adOptionsView = new AdOptionsView(c1840gi, nativeAd, nativeAdLayout);
        c1304Vd.A09(adOptionsView, 28);
        this.A00 = new F2(c1840gi, nativeAd, c1304Vd, UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1534bk, mediaView, adOptionsView);
        YB.A0N(nativeAdLayout, c1304Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1534bk, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1210Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
