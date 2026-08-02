package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.screens.BoostDetailsScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BoostScreenContext$WebBrowserScreenContext implements Parcelable {
    public static final Parcelable.Creator<BoostScreenContext$WebBrowserScreenContext> CREATOR = new BoostDetailsScreen.Creator(7);
    public final String entityToken;
    public final String flowToken;
    public final InfoContext infoContext;
    public final BrowserOrigin origin;

    public BoostScreenContext$WebBrowserScreenContext(BrowserOrigin browserOrigin, InfoContext infoContext, String str, String str2) {
        this.origin = browserOrigin;
        this.infoContext = infoContext;
        this.entityToken = str;
        this.flowToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostScreenContext$WebBrowserScreenContext)) {
            return false;
        }
        BoostScreenContext$WebBrowserScreenContext boostScreenContext$WebBrowserScreenContext = (BoostScreenContext$WebBrowserScreenContext) obj;
        return this.origin == boostScreenContext$WebBrowserScreenContext.origin && this.infoContext == boostScreenContext$WebBrowserScreenContext.infoContext && Intrinsics.areEqual(this.entityToken, boostScreenContext$WebBrowserScreenContext.entityToken) && Intrinsics.areEqual(this.flowToken, boostScreenContext$WebBrowserScreenContext.flowToken);
    }

    public final int hashCode() {
        BrowserOrigin browserOrigin = this.origin;
        int hashCode = (browserOrigin == null ? 0 : browserOrigin.hashCode()) * 31;
        InfoContext infoContext = this.infoContext;
        int hashCode2 = (hashCode + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        String str = this.entityToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowToken;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebBrowserScreenContext(origin=");
        sb.append(this.origin);
        sb.append(", infoContext=");
        sb.append(this.infoContext);
        sb.append(", entityToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entityToken, ", flowToken=", this.flowToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BrowserOrigin browserOrigin = this.origin;
        if (browserOrigin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(browserOrigin.name());
        }
        InfoContext infoContext = this.infoContext;
        if (infoContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(infoContext.name());
        }
        parcel.writeString(this.entityToken);
        parcel.writeString(this.flowToken);
    }
}
