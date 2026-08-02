package com.appsflyer.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFe1ySDK {
    final String getCurrencyIso4217Code;
    final String getMonetizationNetwork;

    public AFe1ySDK(String str, String str2) {
        str.getClass();
        str2.getClass();
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
        return Intrinsics.areEqual(this.getMonetizationNetwork, aFe1ySDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFe1ySDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("HostConfig(prefix=", this.getMonetizationNetwork, ", host=", this.getCurrencyIso4217Code, ")");
    }
}
