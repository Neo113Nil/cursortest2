package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;

/* loaded from: classes.dex */
public final class AtmLocationDetailsScreen implements BottomSheetScreen {
    public static final Parcelable.Creator<AtmLocationDetailsScreen> CREATOR = new Recipient.Creator(13);
    public final AtmExplainerScreen explainerScreen;
    public final GetRetailerLocationsResponse.RetailerLocation retailerLocation;

    public AtmLocationDetailsScreen(GetRetailerLocationsResponse.RetailerLocation retailerLocation, AtmExplainerScreen atmExplainerScreen) {
        retailerLocation.getClass();
        atmExplainerScreen.getClass();
        this.retailerLocation = retailerLocation;
        this.explainerScreen = atmExplainerScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.retailerLocation, i);
        parcel.writeParcelable(this.explainerScreen, i);
    }
}
