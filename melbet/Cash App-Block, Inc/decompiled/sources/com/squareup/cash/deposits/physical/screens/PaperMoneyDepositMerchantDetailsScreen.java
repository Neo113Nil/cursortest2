package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.papermate.app.GetRetailerLocationsResponse;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;

/* loaded from: classes.dex */
public final class PaperMoneyDepositMerchantDetailsScreen implements BlockersScreens.ChildBlockersScreens, Screen, BottomSheetScreen {
    public static final Parcelable.Creator<PaperMoneyDepositMerchantDetailsScreen> CREATOR = new Recipient.Creator(21);
    public final BlockersData blockersData;
    public final BenefitExplainerScreen explainerScreen;
    public final PaperCashDepositBlocker paperCashDepositBlocker;
    public final GetRetailerLocationsResponse.RetailerLocation retailerLocation;

    public PaperMoneyDepositMerchantDetailsScreen(PaperCashDepositBlocker paperCashDepositBlocker, GetRetailerLocationsResponse.RetailerLocation retailerLocation, BenefitExplainerScreen benefitExplainerScreen, BlockersData blockersData) {
        paperCashDepositBlocker.getClass();
        retailerLocation.getClass();
        blockersData.getClass();
        this.paperCashDepositBlocker = paperCashDepositBlocker;
        this.retailerLocation = retailerLocation;
        this.explainerScreen = benefitExplainerScreen;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyDepositMerchantDetailsScreen)) {
            return false;
        }
        PaperMoneyDepositMerchantDetailsScreen paperMoneyDepositMerchantDetailsScreen = (PaperMoneyDepositMerchantDetailsScreen) obj;
        return Intrinsics.areEqual(this.paperCashDepositBlocker, paperMoneyDepositMerchantDetailsScreen.paperCashDepositBlocker) && Intrinsics.areEqual(this.retailerLocation, paperMoneyDepositMerchantDetailsScreen.retailerLocation) && Intrinsics.areEqual(this.explainerScreen, paperMoneyDepositMerchantDetailsScreen.explainerScreen) && Intrinsics.areEqual(this.blockersData, paperMoneyDepositMerchantDetailsScreen.blockersData);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = (this.retailerLocation.hashCode() + (this.paperCashDepositBlocker.hashCode() * 31)) * 31;
        BenefitExplainerScreen benefitExplainerScreen = this.explainerScreen;
        return this.blockersData.hashCode() + ((hashCode + (benefitExplainerScreen == null ? 0 : benefitExplainerScreen.hashCode())) * 31);
    }

    public final String toString() {
        return "PaperMoneyDepositMerchantDetailsScreen(paperCashDepositBlocker=" + this.paperCashDepositBlocker + ", retailerLocation=" + this.retailerLocation + ", explainerScreen=" + this.explainerScreen + ", blockersData=" + this.blockersData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.paperCashDepositBlocker, i);
        parcel.writeParcelable(this.retailerLocation, i);
        parcel.writeParcelable(this.explainerScreen, i);
        parcel.writeParcelable(this.blockersData, i);
    }
}
