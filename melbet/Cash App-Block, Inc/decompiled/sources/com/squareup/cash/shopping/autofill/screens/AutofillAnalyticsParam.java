package com.squareup.cash.shopping.autofill.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.screens.BoostDetailsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AutofillAnalyticsParam implements Parcelable {
    public static final Parcelable.Creator<AutofillAnalyticsParam> CREATOR = new BoostDetailsScreen.Creator(26);
    public final String businessName;
    public final String businessToken;
    public final String flowToken;
    public final InfoContext infoContext;
    public final BrowserOrigin origin;

    public AutofillAnalyticsParam(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2, String str3) {
        infoContext.getClass();
        this.flowToken = str;
        this.infoContext = infoContext;
        this.origin = browserOrigin;
        this.businessToken = str2;
        this.businessName = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillAnalyticsParam)) {
            return false;
        }
        AutofillAnalyticsParam autofillAnalyticsParam = (AutofillAnalyticsParam) obj;
        return Intrinsics.areEqual(this.flowToken, autofillAnalyticsParam.flowToken) && this.infoContext == autofillAnalyticsParam.infoContext && this.origin == autofillAnalyticsParam.origin && Intrinsics.areEqual(this.businessToken, autofillAnalyticsParam.businessToken) && Intrinsics.areEqual(this.businessName, autofillAnalyticsParam.businessName);
    }

    public final int hashCode() {
        String str = this.flowToken;
        int hashCode = (this.infoContext.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str2 = this.businessToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutofillAnalyticsParam(flowToken=");
        sb.append(this.flowToken);
        sb.append(", infoContext=");
        sb.append(this.infoContext);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", businessToken=");
        sb.append(this.businessToken);
        sb.append(", businessName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.businessName, ")");
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
        parcel.writeString(this.businessToken);
        parcel.writeString(this.businessName);
    }
}
