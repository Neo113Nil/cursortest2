package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersDetailsScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<OffersScreen$OffersDetailsScreen> CREATOR = new ListSection.Creator(5);
    public final BlockersData.MoneybotContext moneybotContext;
    public final OfferSheetKey offerSheetKey;
    public final Screen parentScreen;
    public final String queryToken;
    public final String referrerFlowToken;
    public final String searchFlowToken;
    public final boolean searchModeContext;
    public final String shopFlowToken;
    public final String sourceScreen;
    public final String sourceSection;

    public OffersScreen$OffersDetailsScreen(OfferSheetKey offerSheetKey, Screen screen, boolean z, String str, String str2, String str3, String str4, String str5, String str6, BlockersData.MoneybotContext moneybotContext) {
        offerSheetKey.getClass();
        this.offerSheetKey = offerSheetKey;
        this.parentScreen = screen;
        this.searchModeContext = z;
        this.sourceScreen = str;
        this.sourceSection = str2;
        this.referrerFlowToken = str3;
        this.searchFlowToken = str4;
        this.shopFlowToken = str5;
        this.queryToken = str6;
        this.moneybotContext = moneybotContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersDetailsScreen)) {
            return false;
        }
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = (OffersScreen$OffersDetailsScreen) obj;
        return Intrinsics.areEqual(this.offerSheetKey, offersScreen$OffersDetailsScreen.offerSheetKey) && Intrinsics.areEqual(this.parentScreen, offersScreen$OffersDetailsScreen.parentScreen) && this.searchModeContext == offersScreen$OffersDetailsScreen.searchModeContext && Intrinsics.areEqual(this.sourceScreen, offersScreen$OffersDetailsScreen.sourceScreen) && Intrinsics.areEqual(this.sourceSection, offersScreen$OffersDetailsScreen.sourceSection) && Intrinsics.areEqual(this.referrerFlowToken, offersScreen$OffersDetailsScreen.referrerFlowToken) && Intrinsics.areEqual(this.searchFlowToken, offersScreen$OffersDetailsScreen.searchFlowToken) && Intrinsics.areEqual(this.shopFlowToken, offersScreen$OffersDetailsScreen.shopFlowToken) && Intrinsics.areEqual(this.queryToken, offersScreen$OffersDetailsScreen.queryToken) && Intrinsics.areEqual(this.moneybotContext, offersScreen$OffersDetailsScreen.moneybotContext);
    }

    public final int hashCode() {
        int hashCode = this.offerSheetKey.hashCode() * 31;
        Screen screen = this.parentScreen;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.searchModeContext);
        String str = this.sourceScreen;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceSection;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referrerFlowToken;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchFlowToken;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shopFlowToken;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.queryToken;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockersData.MoneybotContext moneybotContext = this.moneybotContext;
        return hashCode7 + (moneybotContext != null ? moneybotContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersDetailsScreen(offerSheetKey=");
        sb.append(this.offerSheetKey);
        sb.append(", parentScreen=");
        sb.append(this.parentScreen);
        sb.append(", searchModeContext=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.searchModeContext, ", sourceScreen=", this.sourceScreen, ", sourceSection=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.sourceSection, ", referrerFlowToken=", this.referrerFlowToken, ", searchFlowToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.searchFlowToken, ", shopFlowToken=", this.shopFlowToken, ", queryToken=");
        sb.append(this.queryToken);
        sb.append(", moneybotContext=");
        sb.append(this.moneybotContext);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.offerSheetKey, i);
        parcel.writeParcelable(this.parentScreen, i);
        parcel.writeInt(this.searchModeContext ? 1 : 0);
        parcel.writeString(this.sourceScreen);
        parcel.writeString(this.sourceSection);
        parcel.writeString(this.referrerFlowToken);
        parcel.writeString(this.searchFlowToken);
        parcel.writeString(this.shopFlowToken);
        parcel.writeString(this.queryToken);
        parcel.writeParcelable(this.moneybotContext, i);
    }

    public /* synthetic */ OffersScreen$OffersDetailsScreen(OfferSheetKey offerSheetKey, Screen screen, BlockersData.MoneybotContext moneybotContext, int i) {
        this(offerSheetKey, screen, false, null, null, null, null, null, null, (i & 512) != 0 ? null : moneybotContext);
    }
}
