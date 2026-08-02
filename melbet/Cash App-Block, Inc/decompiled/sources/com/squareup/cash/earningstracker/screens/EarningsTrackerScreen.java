package com.squareup.cash.earningstracker.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.earningstracker.EarningsTrackerEntrypoint;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EarningsTrackerScreen implements Screen {
    public static final Parcelable.Creator<EarningsTrackerScreen> CREATOR = new AddPayerCustomersScreen.Creator(19);
    public final DateFilter earningsFilter;
    public final EarningsTrackerEntrypoint entrypoint;

    public EarningsTrackerScreen(EarningsTrackerEntrypoint earningsTrackerEntrypoint, DateFilter dateFilter) {
        earningsTrackerEntrypoint.getClass();
        this.entrypoint = earningsTrackerEntrypoint;
        this.earningsFilter = dateFilter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerScreen)) {
            return false;
        }
        EarningsTrackerScreen earningsTrackerScreen = (EarningsTrackerScreen) obj;
        return this.entrypoint == earningsTrackerScreen.entrypoint && Intrinsics.areEqual(this.earningsFilter, earningsTrackerScreen.earningsFilter);
    }

    public final int hashCode() {
        int hashCode = this.entrypoint.hashCode() * 31;
        DateFilter dateFilter = this.earningsFilter;
        return hashCode + (dateFilter == null ? 0 : dateFilter.hashCode());
    }

    public final String toString() {
        return "EarningsTrackerScreen(entrypoint=" + this.entrypoint + ", earningsFilter=" + this.earningsFilter + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.entrypoint.name());
        parcel.writeParcelable(this.earningsFilter, i);
    }
}
