package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import com.fyber.fairbid.ads.PlacementType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3519a;

    static {
        int[] iArr = new int[PlacementType.values().length];
        f3519a = iArr;
        try {
            iArr[PlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3519a[PlacementType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3519a[PlacementType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
