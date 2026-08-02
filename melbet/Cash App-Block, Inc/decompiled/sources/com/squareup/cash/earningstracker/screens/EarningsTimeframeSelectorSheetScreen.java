package com.squareup.cash.earningstracker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earningstracker.viewmodels.Timeframe;

/* loaded from: classes.dex */
public final class EarningsTimeframeSelectorSheetScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<EarningsTimeframeSelectorSheetScreen> CREATOR = new AddPayerCustomersScreen.Creator(18);
    public final Timeframe selectedTimeframe;

    public EarningsTimeframeSelectorSheetScreen(Timeframe timeframe) {
        timeframe.getClass();
        this.selectedTimeframe = timeframe;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsTimeframeSelectorSheetScreen) && this.selectedTimeframe == ((EarningsTimeframeSelectorSheetScreen) obj).selectedTimeframe;
    }

    public final int hashCode() {
        return this.selectedTimeframe.hashCode();
    }

    public final String toString() {
        return "EarningsTimeframeSelectorSheetScreen(selectedTimeframe=" + this.selectedTimeframe + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.selectedTimeframe.name());
    }
}
