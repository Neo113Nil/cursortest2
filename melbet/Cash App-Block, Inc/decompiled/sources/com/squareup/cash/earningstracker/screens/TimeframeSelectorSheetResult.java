package com.squareup.cash.earningstracker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;

/* loaded from: classes6.dex */
public final class TimeframeSelectorSheetResult implements Parcelable {
    public static final Parcelable.Creator<TimeframeSelectorSheetResult> CREATOR = new AddPayerCustomersScreen.Creator(21);
    public final Timeframe timeframe;

    public TimeframeSelectorSheetResult(Timeframe timeframe) {
        timeframe.getClass();
        this.timeframe = timeframe;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeframeSelectorSheetResult) && this.timeframe == ((TimeframeSelectorSheetResult) obj).timeframe;
    }

    public final int hashCode() {
        return this.timeframe.hashCode();
    }

    public final String toString() {
        return "TimeframeSelectorSheetResult(timeframe=" + this.timeframe + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.timeframe.name());
    }
}
