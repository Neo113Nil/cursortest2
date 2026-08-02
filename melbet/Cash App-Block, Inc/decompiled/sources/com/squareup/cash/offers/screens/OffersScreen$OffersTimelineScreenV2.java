package com.squareup.cash.offers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OffersScreen$OffersTimelineScreenV2 implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<OffersScreen$OffersTimelineScreenV2> CREATOR = new ListSection.Creator(16);
    public final Screen originScreen;
    public final String storeName;

    public OffersScreen$OffersTimelineScreenV2(Screen screen, String str) {
        str.getClass();
        screen.getClass();
        this.storeName = str;
        this.originScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersScreen$OffersTimelineScreenV2)) {
            return false;
        }
        OffersScreen$OffersTimelineScreenV2 offersScreen$OffersTimelineScreenV2 = (OffersScreen$OffersTimelineScreenV2) obj;
        return Intrinsics.areEqual(this.storeName, offersScreen$OffersTimelineScreenV2.storeName) && Intrinsics.areEqual(this.originScreen, offersScreen$OffersTimelineScreenV2.originScreen);
    }

    public final int hashCode() {
        return this.originScreen.hashCode() + (this.storeName.hashCode() * 31);
    }

    public final String toString() {
        return "OffersTimelineScreenV2(storeName=" + this.storeName + ", originScreen=" + this.originScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.storeName);
        parcel.writeParcelable(this.originScreen, i);
    }
}
