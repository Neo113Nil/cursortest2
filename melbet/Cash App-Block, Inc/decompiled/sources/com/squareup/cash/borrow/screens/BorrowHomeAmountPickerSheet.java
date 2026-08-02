package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.protos.lending.InitiateLoanData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BorrowHomeAmountPickerSheet implements BorrowScreen, BottomSheetScreen {
    public static final Parcelable.Creator<BorrowHomeAmountPickerSheet> CREATOR = new BorrowHome.Creator(26);
    public final Screen origin;
    public final InitiateLoanData pickerData;

    public BorrowHomeAmountPickerSheet(InitiateLoanData initiateLoanData, Screen screen) {
        initiateLoanData.getClass();
        screen.getClass();
        this.pickerData = initiateLoanData;
        this.origin = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorrowHomeAmountPickerSheet)) {
            return false;
        }
        BorrowHomeAmountPickerSheet borrowHomeAmountPickerSheet = (BorrowHomeAmountPickerSheet) obj;
        return Intrinsics.areEqual(this.pickerData, borrowHomeAmountPickerSheet.pickerData) && Intrinsics.areEqual(this.origin, borrowHomeAmountPickerSheet.origin);
    }

    public final int hashCode() {
        return this.origin.hashCode() + (this.pickerData.hashCode() * 31);
    }

    public final String toString() {
        return "BorrowHomeAmountPickerSheet(pickerData=" + this.pickerData + ", origin=" + this.origin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.pickerData, i);
        parcel.writeParcelable(this.origin, i);
    }
}
