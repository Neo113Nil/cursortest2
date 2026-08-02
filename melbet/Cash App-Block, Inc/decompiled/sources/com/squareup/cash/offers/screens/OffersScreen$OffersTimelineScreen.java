package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersTimelineScreen implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<OffersScreen$OffersTimelineScreen> CREATOR = new ListSection.Creator(15);
    public final OfferSheetKey offerSheetKey;
    public final Screen parentScreen;
    public final String referrerFlowToken;
    public final boolean searchModeContext;
    public final String sourceScreen;
    public final String sourceSection;

    public OffersScreen$OffersTimelineScreen(OfferSheetKey offerSheetKey, Screen screen, boolean z, String str, String str2, String str3) {
        offerSheetKey.getClass();
        this.offerSheetKey = offerSheetKey;
        this.parentScreen = screen;
        this.searchModeContext = z;
        this.sourceScreen = str;
        this.sourceSection = str2;
        this.referrerFlowToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersTimelineScreen)) {
            return false;
        }
        OffersScreen$OffersTimelineScreen offersScreen$OffersTimelineScreen = (OffersScreen$OffersTimelineScreen) obj;
        return Intrinsics.areEqual(this.offerSheetKey, offersScreen$OffersTimelineScreen.offerSheetKey) && Intrinsics.areEqual(this.parentScreen, offersScreen$OffersTimelineScreen.parentScreen) && this.searchModeContext == offersScreen$OffersTimelineScreen.searchModeContext && Intrinsics.areEqual(this.sourceScreen, offersScreen$OffersTimelineScreen.sourceScreen) && Intrinsics.areEqual(this.sourceSection, offersScreen$OffersTimelineScreen.sourceSection) && Intrinsics.areEqual(this.referrerFlowToken, offersScreen$OffersTimelineScreen.referrerFlowToken);
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
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersTimelineScreen(offerSheetKey=");
        sb.append(this.offerSheetKey);
        sb.append(", parentScreen=");
        sb.append(this.parentScreen);
        sb.append(", searchModeContext=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.searchModeContext, ", sourceScreen=", this.sourceScreen, ", sourceSection=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.sourceSection, ", referrerFlowToken=", this.referrerFlowToken, ")");
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
    }
}
