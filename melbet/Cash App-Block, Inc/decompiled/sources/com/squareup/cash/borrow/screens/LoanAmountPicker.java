package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.lending.InitiateLoanData;

/* loaded from: classes.dex */
public interface LoanAmountPicker extends BorrowScreen {

    public final class LoanAmountPickerFull implements LoanAmountPicker, BorrowScreen {
        public static final Parcelable.Creator<LoanAmountPickerFull> CREATOR = new BorrowLimitHub.Creator(2);
        public final String flowToken;
        public final InitiateLoanData loanData;

        public LoanAmountPickerFull(InitiateLoanData initiateLoanData, String str) {
            initiateLoanData.getClass();
            this.loanData = initiateLoanData;
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.borrow.screens.LoanAmountPicker
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.borrow.screens.LoanAmountPicker
        public final InitiateLoanData getLoanData() {
            return this.loanData;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.loanData, i);
            parcel.writeString(this.flowToken);
        }
    }

    public final class LoanAmountPickerSheet implements LoanAmountPicker, BottomSheetScreen {
        public static final Parcelable.Creator<LoanAmountPickerSheet> CREATOR = new BorrowLimitHub.Creator(3);
        public final String flowToken;
        public final InitiateLoanData loanData;

        public LoanAmountPickerSheet(InitiateLoanData initiateLoanData, String str) {
            initiateLoanData.getClass();
            this.loanData = initiateLoanData;
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.borrow.screens.LoanAmountPicker
        public final String getFlowToken() {
            return this.flowToken;
        }

        @Override // com.squareup.cash.borrow.screens.LoanAmountPicker
        public final InitiateLoanData getLoanData() {
            return this.loanData;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.loanData, i);
            parcel.writeString(this.flowToken);
        }
    }

    String getFlowToken();

    InitiateLoanData getLoanData();
}
