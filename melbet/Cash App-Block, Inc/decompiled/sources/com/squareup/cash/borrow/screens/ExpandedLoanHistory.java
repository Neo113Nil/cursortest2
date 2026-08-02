package com.squareup.cash.borrow.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ExpandedLoanHistory implements BorrowScreen {
    public static final Parcelable.Creator<ExpandedLoanHistory> CREATOR = new BorrowLimitHub.Creator(1);
    public final BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedViewData;
    public final List loans;

    public ExpandedLoanHistory(BorrowAppletLoanHistoryTile.Data.ExpandedLoanListViewData expandedLoanListViewData, List list) {
        expandedLoanListViewData.getClass();
        list.getClass();
        this.expandedViewData = expandedLoanListViewData;
        this.loans = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandedLoanHistory)) {
            return false;
        }
        ExpandedLoanHistory expandedLoanHistory = (ExpandedLoanHistory) obj;
        return Intrinsics.areEqual(this.expandedViewData, expandedLoanHistory.expandedViewData) && Intrinsics.areEqual(this.loans, expandedLoanHistory.loans);
    }

    public final int hashCode() {
        return this.loans.hashCode() + (this.expandedViewData.hashCode() * 31);
    }

    public final String toString() {
        return "ExpandedLoanHistory(expandedViewData=" + this.expandedViewData + ", loans=" + this.loans + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.expandedViewData, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.loans, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
