package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFe1ySDK {
    final String getCurrencyIso4217Code;
    final String getMonetizationNetwork;

    public AFe1ySDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1ySDK)) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
        return Intrinsics.a(this.getMonetizationNetwork, aFe1ySDK.getMonetizationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.getMonetizationNetwork + ", host=" + this.getCurrencyIso4217Code + ")";
    }
}
