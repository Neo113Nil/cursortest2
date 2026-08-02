package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Fulfillment implements Parcelable {
    public static final Parcelable.Creator<Fulfillment> CREATOR = new Creator();
    public final LocalFulfillment.DeliveryDetails deliveryDetails;
    public final EstimatedCompletionDuration estimatedCompletionDuration;
    public final EstimatedCompletionTime estimatedCompletionTime;
    public final LocalFulfillment.InStoreDetails inStoreDetails;
    public final LocalFulfillment.SchedulingDetails schedulingDetails;

    /* renamed from: type, reason: collision with root package name */
    public final LocalFulfillmentType f911type;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Fulfillment(LocalFulfillmentType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EstimatedCompletionTime.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EstimatedCompletionDuration.CREATOR.createFromParcel(parcel) : null, (LocalFulfillment.DeliveryDetails) parcel.readParcelable(Fulfillment.class.getClassLoader()), (LocalFulfillment.SchedulingDetails) parcel.readParcelable(Fulfillment.class.getClassLoader()), (LocalFulfillment.InStoreDetails) parcel.readParcelable(Fulfillment.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Fulfillment[i];
        }
    }

    public Fulfillment(LocalFulfillmentType localFulfillmentType, EstimatedCompletionTime estimatedCompletionTime, EstimatedCompletionDuration estimatedCompletionDuration, LocalFulfillment.DeliveryDetails deliveryDetails, LocalFulfillment.SchedulingDetails schedulingDetails, LocalFulfillment.InStoreDetails inStoreDetails) {
        localFulfillmentType.getClass();
        this.f911type = localFulfillmentType;
        this.estimatedCompletionTime = estimatedCompletionTime;
        this.estimatedCompletionDuration = estimatedCompletionDuration;
        this.deliveryDetails = deliveryDetails;
        this.schedulingDetails = schedulingDetails;
        this.inStoreDetails = inStoreDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fulfillment)) {
            return false;
        }
        Fulfillment fulfillment = (Fulfillment) obj;
        return this.f911type == fulfillment.f911type && Intrinsics.areEqual(this.estimatedCompletionTime, fulfillment.estimatedCompletionTime) && Intrinsics.areEqual(this.estimatedCompletionDuration, fulfillment.estimatedCompletionDuration) && Intrinsics.areEqual(this.deliveryDetails, fulfillment.deliveryDetails) && Intrinsics.areEqual(this.schedulingDetails, fulfillment.schedulingDetails) && Intrinsics.areEqual(this.inStoreDetails, fulfillment.inStoreDetails);
    }

    public final int hashCode() {
        int hashCode = this.f911type.hashCode() * 31;
        EstimatedCompletionTime estimatedCompletionTime = this.estimatedCompletionTime;
        int hashCode2 = (hashCode + (estimatedCompletionTime == null ? 0 : estimatedCompletionTime.hashCode())) * 31;
        EstimatedCompletionDuration estimatedCompletionDuration = this.estimatedCompletionDuration;
        int hashCode3 = (hashCode2 + (estimatedCompletionDuration == null ? 0 : estimatedCompletionDuration.hashCode())) * 31;
        LocalFulfillment.DeliveryDetails deliveryDetails = this.deliveryDetails;
        int hashCode4 = (hashCode3 + (deliveryDetails == null ? 0 : deliveryDetails.hashCode())) * 31;
        LocalFulfillment.SchedulingDetails schedulingDetails = this.schedulingDetails;
        int hashCode5 = (hashCode4 + (schedulingDetails == null ? 0 : schedulingDetails.hashCode())) * 31;
        LocalFulfillment.InStoreDetails inStoreDetails = this.inStoreDetails;
        return hashCode5 + (inStoreDetails != null ? inStoreDetails.hashCode() : 0);
    }

    public final String toString() {
        return "Fulfillment(type=" + this.f911type + ", estimatedCompletionTime=" + this.estimatedCompletionTime + ", estimatedCompletionDuration=" + this.estimatedCompletionDuration + ", deliveryDetails=" + this.deliveryDetails + ", schedulingDetails=" + this.schedulingDetails + ", inStoreDetails=" + this.inStoreDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.f911type.name());
        EstimatedCompletionTime estimatedCompletionTime = this.estimatedCompletionTime;
        if (estimatedCompletionTime == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedCompletionTime.writeToParcel(parcel, i);
        }
        EstimatedCompletionDuration estimatedCompletionDuration = this.estimatedCompletionDuration;
        if (estimatedCompletionDuration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            estimatedCompletionDuration.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.deliveryDetails, i);
        parcel.writeParcelable(this.schedulingDetails, i);
        parcel.writeParcelable(this.inStoreDetails, i);
    }
}
