package com.squareup.cash.earnings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsAllocationDistribution implements Parcelable {
    public static final Parcelable.Creator<EarningsAllocationDistribution> CREATOR = new AddPayerCustomersScreen.Creator(11);
    public final ArrayList allocations;

    public final class DestinationAndShare implements Parcelable {
        public static final Parcelable.Creator<DestinationAndShare> CREATOR = new AddPayerCustomersScreen.Creator(12);
        public final AllocationDestination destination;
        public final long shareInBasisPoints;

        public DestinationAndShare(AllocationDestination allocationDestination, long j) {
            allocationDestination.getClass();
            this.destination = allocationDestination;
            this.shareInBasisPoints = j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DestinationAndShare)) {
                return false;
            }
            DestinationAndShare destinationAndShare = (DestinationAndShare) obj;
            return Intrinsics.areEqual(this.destination, destinationAndShare.destination) && this.shareInBasisPoints == destinationAndShare.shareInBasisPoints;
        }

        public final int hashCode() {
            return Long.hashCode(this.shareInBasisPoints) + (this.destination.hashCode() * 31);
        }

        public final String toString() {
            return "DestinationAndShare(destination=" + this.destination + ", shareInBasisPoints=" + this.shareInBasisPoints + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.destination, i);
            parcel.writeLong(this.shareInBasisPoints);
        }
    }

    public EarningsAllocationDistribution(ArrayList arrayList) {
        this.allocations = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsAllocationDistribution) && this.allocations.equals(((EarningsAllocationDistribution) obj).allocations);
    }

    public final int hashCode() {
        return this.allocations.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("EarningsAllocationDistribution(allocations=", ")", this.allocations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.allocations, parcel);
        while (m.hasNext()) {
            ((DestinationAndShare) m.next()).writeToParcel(parcel, i);
        }
    }
}
