package com.appsflyer.internal;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1bSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1fSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1fSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/internal/AFe1fSDK;", "AFAdRevenueData", "Ljava/lang/String;", "getMonetizationNetwork", "getCurrencyIso4217Code"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AFe1bSDK {

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final String getMonetizationNetwork;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    public final AFe1fSDK AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    public final String getCurrencyIso4217Code;

    public AFe1bSDK(String str, String str2, AFe1fSDK aFe1fSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1fSDK, "");
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = str2;
        this.AFAdRevenueData = aFe1fSDK;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFe1bSDK)) {
            return false;
        }
        AFe1bSDK aFe1bSDK = (AFe1bSDK) p0;
        return Intrinsics.areEqual(this.getMonetizationNetwork, aFe1bSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getCurrencyIso4217Code, aFe1bSDK.getCurrencyIso4217Code) && this.AFAdRevenueData == aFe1bSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        int hashCode = this.getMonetizationNetwork.hashCode() * 31;
        String str = this.getCurrencyIso4217Code;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.AFAdRevenueData.hashCode();
    }

    public final String toString() {
        return "HostMeta(name=" + this.getMonetizationNetwork + ", prefix=" + this.getCurrencyIso4217Code + ", method=" + this.AFAdRevenueData + ")";
    }
}
