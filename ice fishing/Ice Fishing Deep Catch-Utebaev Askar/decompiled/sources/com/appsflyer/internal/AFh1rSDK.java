package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1rSDK extends AFh1uSDK {
    private final boolean getCurrencyIso4217Code;
    private final AFd1kSDK getMonetizationNetwork;

    public AFh1rSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getMonetizationNetwork = aFd1kSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void d(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("D", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("E", getRevenue(str, aFh1vSDK));
        }
        if (z4) {
            this.getMonetizationNetwork.copydefault().getRevenue(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void force(AFh1vSDK aFh1vSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("F", getRevenue(str, aFh1vSDK));
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void i(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("I", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void v(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("V", getRevenue(str, aFh1vSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void w(AFh1vSDK aFh1vSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getMonetizationNetwork.copydefault().getCurrencyIso4217Code("W", getRevenue(str, aFh1vSDK));
        }
    }
}
