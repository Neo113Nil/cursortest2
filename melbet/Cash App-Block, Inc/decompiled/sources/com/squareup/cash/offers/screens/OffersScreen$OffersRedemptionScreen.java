package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.nearby.viewmodels.ListSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersRedemptionScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<OffersScreen$OffersRedemptionScreen> CREATOR = new ListSection.Creator(14);
    public final String entityToken;
    public final String entryUrl;
    public final InfoContext infoContext;
    public final BrowserOrigin origin;
    public final String referrerFlowToken;
    public final SheetStyle sheetStyle;

    public OffersScreen$OffersRedemptionScreen(SheetStyle sheetStyle, InfoContext infoContext, BrowserOrigin browserOrigin, String str, String str2, String str3) {
        sheetStyle.getClass();
        infoContext.getClass();
        str3.getClass();
        this.sheetStyle = sheetStyle;
        this.infoContext = infoContext;
        this.origin = browserOrigin;
        this.referrerFlowToken = str;
        this.entityToken = str2;
        this.entryUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersRedemptionScreen)) {
            return false;
        }
        OffersScreen$OffersRedemptionScreen offersScreen$OffersRedemptionScreen = (OffersScreen$OffersRedemptionScreen) obj;
        return Intrinsics.areEqual(this.sheetStyle, offersScreen$OffersRedemptionScreen.sheetStyle) && this.infoContext == offersScreen$OffersRedemptionScreen.infoContext && this.origin == offersScreen$OffersRedemptionScreen.origin && Intrinsics.areEqual(this.referrerFlowToken, offersScreen$OffersRedemptionScreen.referrerFlowToken) && Intrinsics.areEqual(this.entityToken, offersScreen$OffersRedemptionScreen.entityToken) && Intrinsics.areEqual(this.entryUrl, offersScreen$OffersRedemptionScreen.entryUrl);
    }

    public final int hashCode() {
        int hashCode = (this.infoContext.hashCode() + (this.sheetStyle.hashCode() * 31)) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode2 = (hashCode + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str = this.referrerFlowToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entityToken;
        return this.entryUrl.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersRedemptionScreen(sheetStyle=");
        sb.append(this.sheetStyle);
        sb.append(", infoContext=");
        sb.append(this.infoContext);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrerFlowToken=");
        sb.append(this.referrerFlowToken);
        sb.append(", entityToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entityToken, ", entryUrl=", this.entryUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.sheetStyle, i);
        parcel.writeString(this.infoContext.name());
        BrowserOrigin browserOrigin = this.origin;
        if (browserOrigin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(browserOrigin.name());
        }
        parcel.writeString(this.referrerFlowToken);
        parcel.writeString(this.entityToken);
        parcel.writeString(this.entryUrl);
    }
}
