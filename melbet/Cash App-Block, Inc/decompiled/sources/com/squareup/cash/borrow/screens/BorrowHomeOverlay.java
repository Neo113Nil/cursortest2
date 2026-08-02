package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface BorrowHomeOverlay extends BorrowScreen, Screen, OnlyOneOverlayTreatment {

    /* loaded from: classes5.dex */
    public final class BulletinInfo implements BorrowHomeOverlay {
        public static final Parcelable.Creator<BulletinInfo> CREATOR = new BorrowHome.Creator(27);
        public final BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet;
        public final Screen parentScreen;

        public BulletinInfo(BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet, Screen screen) {
            infoSheet.getClass();
            screen.getClass();
            this.infoSheet = infoSheet;
            this.parentScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BulletinInfo)) {
                return false;
            }
            BulletinInfo bulletinInfo = (BulletinInfo) obj;
            return Intrinsics.areEqual(this.infoSheet, bulletinInfo.infoSheet) && Intrinsics.areEqual(this.parentScreen, bulletinInfo.parentScreen);
        }

        @Override // com.squareup.cash.borrow.screens.BorrowHomeOverlay
        public final Screen getParentScreen() {
            return this.parentScreen;
        }

        public final int hashCode() {
            return this.parentScreen.hashCode() + (this.infoSheet.hashCode() * 31);
        }

        public final String toString() {
            return "BulletinInfo(infoSheet=" + this.infoSheet + ", parentScreen=" + this.parentScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.infoSheet, i);
            parcel.writeParcelable(this.parentScreen, i);
        }
    }

    /* loaded from: classes5.dex */
    public final class LoanDetails implements BorrowHomeOverlay {
        public static final Parcelable.Creator<LoanDetails> CREATOR = new BorrowHome.Creator(28);
        public final BorrowAppletLoanHistoryTile.Data.Loan.Details details;
        public final Screen parentScreen;
        public final String token;

        public LoanDetails(BorrowAppletLoanHistoryTile.Data.Loan.Details details, String str, Screen screen) {
            details.getClass();
            screen.getClass();
            this.details = details;
            this.token = str;
            this.parentScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoanDetails)) {
                return false;
            }
            LoanDetails loanDetails = (LoanDetails) obj;
            return Intrinsics.areEqual(this.details, loanDetails.details) && Intrinsics.areEqual(this.token, loanDetails.token) && Intrinsics.areEqual(this.parentScreen, loanDetails.parentScreen);
        }

        @Override // com.squareup.cash.borrow.screens.BorrowHomeOverlay
        public final Screen getParentScreen() {
            return this.parentScreen;
        }

        public final int hashCode() {
            int hashCode = this.details.hashCode() * 31;
            String str = this.token;
            return this.parentScreen.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "LoanDetails(details=" + this.details + ", token=" + this.token + ", parentScreen=" + this.parentScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.details, i);
            parcel.writeString(this.token);
            parcel.writeParcelable(this.parentScreen, i);
        }
    }

    /* loaded from: classes5.dex */
    public final class RepaymentSelection implements BorrowHomeOverlay {
        public static final Parcelable.Creator<RepaymentSelection> CREATOR = new BorrowHome.Creator(29);
        public final LoanRepaymentSelectionData data;
        public final Screen parentScreen;

        public RepaymentSelection(LoanRepaymentSelectionData loanRepaymentSelectionData, Screen screen) {
            loanRepaymentSelectionData.getClass();
            screen.getClass();
            this.data = loanRepaymentSelectionData;
            this.parentScreen = screen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RepaymentSelection)) {
                return false;
            }
            RepaymentSelection repaymentSelection = (RepaymentSelection) obj;
            return Intrinsics.areEqual(this.data, repaymentSelection.data) && Intrinsics.areEqual(this.parentScreen, repaymentSelection.parentScreen);
        }

        @Override // com.squareup.cash.borrow.screens.BorrowHomeOverlay
        public final Screen getParentScreen() {
            return this.parentScreen;
        }

        public final int hashCode() {
            return this.parentScreen.hashCode() + (this.data.hashCode() * 31);
        }

        public final String toString() {
            return "RepaymentSelection(data=" + this.data + ", parentScreen=" + this.parentScreen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.data, i);
            parcel.writeParcelable(this.parentScreen, i);
        }
    }

    Screen getParentScreen();
}
