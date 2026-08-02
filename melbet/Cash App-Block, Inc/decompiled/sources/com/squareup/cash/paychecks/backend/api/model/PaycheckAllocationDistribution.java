package com.squareup.cash.paychecks.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaycheckAllocationDistribution implements Parcelable {
    public static final Parcelable.Creator<PaycheckAllocationDistribution> CREATOR = new P2PListScreen.Creator(28);
    public final List allocations;

    public final class DestinationAndShare implements Parcelable {
        public static final Parcelable.Creator<DestinationAndShare> CREATOR = new P2PListScreen.Creator(29);
        public final AllocationDestination destination;
        public final long shareInBasisPoints;

        public DestinationAndShare(AllocationDestination allocationDestination, long j) {
            allocationDestination.getClass();
            this.destination = allocationDestination;
            this.shareInBasisPoints = j;
        }

        public static DestinationAndShare copy$default(DestinationAndShare destinationAndShare, long j) {
            AllocationDestination allocationDestination = destinationAndShare.destination;
            destinationAndShare.getClass();
            allocationDestination.getClass();
            return new DestinationAndShare(allocationDestination, j);
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

    public PaycheckAllocationDistribution(List list) {
        list.getClass();
        this.allocations = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaycheckAllocationDistribution) && Intrinsics.areEqual(this.allocations, ((PaycheckAllocationDistribution) obj).allocations);
    }

    public final int hashCode() {
        return this.allocations.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("PaycheckAllocationDistribution(allocations=", ")", this.allocations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.allocations, parcel);
        while (m.hasNext()) {
            ((DestinationAndShare) m.next()).writeToParcel(parcel, i);
        }
    }
}
