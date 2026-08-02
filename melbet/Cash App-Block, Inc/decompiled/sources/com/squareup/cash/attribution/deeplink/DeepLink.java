package com.squareup.cash.attribution.deeplink;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeepLink {
    public final String appsFlyerId;
    public final String deepLink;
    public final String payload;

    public DeepLink(String str, String str2, String str3) {
        str.getClass();
        this.deepLink = str;
        this.payload = str2;
        this.appsFlyerId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLink)) {
            return false;
        }
        DeepLink deepLink = (DeepLink) obj;
        return Intrinsics.areEqual(this.deepLink, deepLink.deepLink) && Intrinsics.areEqual(this.payload, deepLink.payload) && Intrinsics.areEqual(this.appsFlyerId, deepLink.appsFlyerId);
    }

    public final int hashCode() {
        int hashCode = this.deepLink.hashCode() * 31;
        String str = this.payload;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.appsFlyerId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeepLink(deepLink=", this.deepLink, ", payload=", this.payload, ", appsFlyerId="), this.appsFlyerId, ")");
    }
}
