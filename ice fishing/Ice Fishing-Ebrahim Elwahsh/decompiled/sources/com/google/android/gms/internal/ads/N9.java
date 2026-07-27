package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum N9 implements InterfaceC3308hL {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: n, reason: collision with root package name */
    public final int f26489n;

    N9(int i) {
        this.f26489n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3308hL
    public final int a() {
        return this.f26489n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f26489n);
    }
}
