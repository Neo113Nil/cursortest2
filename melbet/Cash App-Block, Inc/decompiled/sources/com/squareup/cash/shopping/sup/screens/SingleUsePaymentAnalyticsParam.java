package com.squareup.cash.shopping.sup.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SingleUsePaymentAnalyticsParam implements Parcelable {
    public static final Parcelable.Creator<SingleUsePaymentAnalyticsParam> CREATOR = new ErrorScreen.Creator(17);
    public final String entityToken;
    public final String entryUrl;
    public final String flowToken;
    public final InfoContext infoContext;
    public final BrowserOrigin origin;

    public SingleUsePaymentAnalyticsParam(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3) {
        infoContext.getClass();
        this.flowToken = str;
        this.infoContext = infoContext;
        this.origin = browserOrigin;
        this.entryUrl = str2;
        this.entityToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleUsePaymentAnalyticsParam)) {
            return false;
        }
        SingleUsePaymentAnalyticsParam singleUsePaymentAnalyticsParam = (SingleUsePaymentAnalyticsParam) obj;
        return Intrinsics.areEqual(this.flowToken, singleUsePaymentAnalyticsParam.flowToken) && this.infoContext == singleUsePaymentAnalyticsParam.infoContext && this.origin == singleUsePaymentAnalyticsParam.origin && Intrinsics.areEqual(this.entryUrl, singleUsePaymentAnalyticsParam.entryUrl) && Intrinsics.areEqual(this.entityToken, singleUsePaymentAnalyticsParam.entityToken);
    }

    public final int hashCode() {
        String str = this.flowToken;
        int hashCode = (this.infoContext.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str2 = this.entryUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entityToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleUsePaymentAnalyticsParam(flowToken=");
        sb.append(this.flowToken);
        sb.append(", infoContext=");
        sb.append(this.infoContext);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", entryUrl=");
        sb.append(this.entryUrl);
        sb.append(", entityToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entityToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.flowToken);
        parcel.writeString(this.infoContext.name());
        BrowserOrigin browserOrigin = this.origin;
        if (browserOrigin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(browserOrigin.name());
        }
        parcel.writeString(this.entryUrl);
        parcel.writeString(this.entityToken);
    }
}
