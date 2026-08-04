package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1tSDK extends AFh1uSDK {
    private final AFd1kSDK getRevenue;

    public AFh1tSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1uSDK
    public final void e(AFh1vSDK aFh1vSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1vSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            if (kotlin.text.o.b(str)) {
                str = "missing label";
            }
            this.getRevenue.afErrorLog().getRevenue(th, withTag$SDK_prodRelease(str, aFh1vSDK));
        }
    }
}
