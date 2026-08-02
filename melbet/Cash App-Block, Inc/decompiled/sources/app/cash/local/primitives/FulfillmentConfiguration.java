package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface FulfillmentConfiguration extends Parcelable {

    public final class Delivery implements FulfillmentConfiguration {
        public static final Parcelable.Creator<Delivery> CREATOR = new Creator();
        public final LocalFulfillment.DeliveryDetails deliveryDetails;
        public final LocalMoney deliveryFee;
        public final EstimatedCompletionDuration estimatedCompletionDuration;
        public final EstimatedCompletionTime estimatedCompletionTime;
        public final String locationToken;
        public final LocalFulfillment.SchedulingDetails schedulingDetails;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                LocationToken createFromParcel = parcel.readInt() == 0 ? null : LocationToken.CREATOR.createFromParcel(parcel);
                return new Delivery(createFromParcel != null ? createFromParcel.value : null, parcel.readInt() == 0 ? null : EstimatedCompletionTime.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EstimatedCompletionDuration.CREATOR.createFromParcel(parcel), (LocalFulfillment.SchedulingDetails) parcel.readParcelable(Delivery.class.getClassLoader()), (LocalFulfillment.DeliveryDetails) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readInt() != 0 ? LocalMoney.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Delivery[i];
            }
        }

        public Delivery(String str, EstimatedCompletionTime estimatedCompletionTime, EstimatedCompletionDuration estimatedCompletionDuration, LocalFulfillment.SchedulingDetails schedulingDetails, LocalFulfillment.DeliveryDetails deliveryDetails, LocalMoney localMoney) {
            this.locationToken = str;
            this.estimatedCompletionTime = estimatedCompletionTime;
            this.estimatedCompletionDuration = estimatedCompletionDuration;
            this.schedulingDetails = schedulingDetails;
            this.deliveryDetails = deliveryDetails;
            this.deliveryFee = localMoney;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Delivery)) {
                return false;
            }
            Delivery delivery = (Delivery) obj;
            String str = delivery.locationToken;
            String str2 = this.locationToken;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            return areEqual && Intrinsics.areEqual(this.estimatedCompletionTime, delivery.estimatedCompletionTime) && Intrinsics.areEqual(this.estimatedCompletionDuration, delivery.estimatedCompletionDuration) && Intrinsics.areEqual(this.schedulingDetails, delivery.schedulingDetails) && Intrinsics.areEqual(this.deliveryDetails, delivery.deliveryDetails) && Intrinsics.areEqual(this.deliveryFee, delivery.deliveryFee);
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final EstimatedCompletionDuration getEstimatedCompletionDuration() {
            return this.estimatedCompletionDuration;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final EstimatedCompletionTime getEstimatedCompletionTime() {
            return this.estimatedCompletionTime;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        /* renamed from: getLocationToken-VSCKlZI */
        public final String mo1238getLocationTokenVSCKlZI() {
            return this.locationToken;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final LocalFulfillment.SchedulingDetails getSchedulingDetails() {
            return this.schedulingDetails;
        }

        public final int hashCode() {
            String str = this.locationToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            EstimatedCompletionTime estimatedCompletionTime = this.estimatedCompletionTime;
            int hashCode2 = (hashCode + (estimatedCompletionTime == null ? 0 : estimatedCompletionTime.hashCode())) * 31;
            EstimatedCompletionDuration estimatedCompletionDuration = this.estimatedCompletionDuration;
            int hashCode3 = (hashCode2 + (estimatedCompletionDuration == null ? 0 : estimatedCompletionDuration.hashCode())) * 31;
            LocalFulfillment.SchedulingDetails schedulingDetails = this.schedulingDetails;
            int hashCode4 = (hashCode3 + (schedulingDetails == null ? 0 : schedulingDetails.hashCode())) * 31;
            LocalFulfillment.DeliveryDetails deliveryDetails = this.deliveryDetails;
            int hashCode5 = (hashCode4 + (deliveryDetails == null ? 0 : deliveryDetails.hashCode())) * 31;
            LocalMoney localMoney = this.deliveryFee;
            return hashCode5 + (localMoney != null ? localMoney.hashCode() : 0);
        }

        public final String toString() {
            String str = this.locationToken;
            return "Delivery(locationToken=" + (str == null ? "null" : LocationToken.m1252toStringimpl(str)) + ", estimatedCompletionTime=" + this.estimatedCompletionTime + ", estimatedCompletionDuration=" + this.estimatedCompletionDuration + ", schedulingDetails=" + this.schedulingDetails + ", deliveryDetails=" + this.deliveryDetails + ", deliveryFee=" + this.deliveryFee + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            String str = this.locationToken;
            if (str == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(str);
            }
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
            parcel.writeParcelable(this.schedulingDetails, i);
            parcel.writeParcelable(this.deliveryDetails, i);
            LocalMoney localMoney = this.deliveryFee;
            if (localMoney == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localMoney.writeToParcel(parcel, i);
            }
        }
    }

    public final class InStore implements FulfillmentConfiguration {
        public static final Parcelable.Creator<InStore> CREATOR = new Creator();
        public final LocalFulfillment.InStoreDetails inStoreDetails;
        public final String locationToken;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new InStore(LocationToken.CREATOR.createFromParcel(parcel).value, (LocalFulfillment.InStoreDetails) parcel.readParcelable(InStore.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InStore[i];
            }
        }

        public InStore(String str, LocalFulfillment.InStoreDetails inStoreDetails) {
            str.getClass();
            inStoreDetails.getClass();
            this.locationToken = str;
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
            if (!(obj instanceof InStore)) {
                return false;
            }
            InStore inStore = (InStore) obj;
            return Intrinsics.areEqual(this.locationToken, inStore.locationToken) && Intrinsics.areEqual(this.inStoreDetails, inStore.inStoreDetails);
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        /* renamed from: getLocationToken-VSCKlZI */
        public final String mo1238getLocationTokenVSCKlZI() {
            return this.locationToken;
        }

        public final int hashCode() {
            return this.inStoreDetails.hashCode() + (this.locationToken.hashCode() * 31);
        }

        public final String toString() {
            return "InStore(locationToken=" + LocationToken.m1252toStringimpl(this.locationToken) + ", inStoreDetails=" + this.inStoreDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.locationToken);
            parcel.writeParcelable(this.inStoreDetails, i);
        }
    }

    public final class Unspecified implements FulfillmentConfiguration {
        public static final Unspecified INSTANCE = new Unspecified();
        public static final Parcelable.Creator<Unspecified> CREATOR = new Line.Creator(11);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unspecified);
        }

        public final int hashCode() {
            return 342682930;
        }

        public final String toString() {
            return "Unspecified";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    default EstimatedCompletionDuration getEstimatedCompletionDuration() {
        return null;
    }

    default EstimatedCompletionTime getEstimatedCompletionTime() {
        return null;
    }

    /* renamed from: getLocationToken-VSCKlZI, reason: not valid java name */
    default String mo1238getLocationTokenVSCKlZI() {
        return null;
    }

    default LocalFulfillment.SchedulingDetails getSchedulingDetails() {
        return null;
    }

    public final class Pickup implements FulfillmentConfiguration {
        public static final Parcelable.Creator<Pickup> CREATOR = new Creator();
        public final EstimatedCompletionDuration estimatedCompletionDuration;
        public final EstimatedCompletionTime estimatedCompletionTime;
        public final String locationToken;
        public final LocalFulfillment.SchedulingDetails schedulingDetails;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Pickup(LocationToken.CREATOR.createFromParcel(parcel).value, parcel.readInt() == 0 ? null : EstimatedCompletionTime.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EstimatedCompletionDuration.CREATOR.createFromParcel(parcel) : null, (LocalFulfillment.SchedulingDetails) parcel.readParcelable(Pickup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pickup[i];
            }
        }

        public Pickup(String str, EstimatedCompletionTime estimatedCompletionTime, EstimatedCompletionDuration estimatedCompletionDuration, LocalFulfillment.SchedulingDetails schedulingDetails) {
            str.getClass();
            this.locationToken = str;
            this.estimatedCompletionTime = estimatedCompletionTime;
            this.estimatedCompletionDuration = estimatedCompletionDuration;
            this.schedulingDetails = schedulingDetails;
        }

        /* renamed from: copy-hYjS5Xw$default, reason: not valid java name */
        public static Pickup m1239copyhYjS5Xw$default(Pickup pickup, EstimatedCompletionDuration estimatedCompletionDuration, LocalFulfillment.SchedulingDetails schedulingDetails, int i) {
            String str = pickup.locationToken;
            EstimatedCompletionTime estimatedCompletionTime = (i & 2) != 0 ? pickup.estimatedCompletionTime : null;
            if ((i & 8) != 0) {
                schedulingDetails = pickup.schedulingDetails;
            }
            pickup.getClass();
            str.getClass();
            return new Pickup(str, estimatedCompletionTime, estimatedCompletionDuration, schedulingDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pickup)) {
                return false;
            }
            Pickup pickup = (Pickup) obj;
            return Intrinsics.areEqual(this.locationToken, pickup.locationToken) && Intrinsics.areEqual(this.estimatedCompletionTime, pickup.estimatedCompletionTime) && Intrinsics.areEqual(this.estimatedCompletionDuration, pickup.estimatedCompletionDuration) && Intrinsics.areEqual(this.schedulingDetails, pickup.schedulingDetails);
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final EstimatedCompletionDuration getEstimatedCompletionDuration() {
            return this.estimatedCompletionDuration;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final EstimatedCompletionTime getEstimatedCompletionTime() {
            return this.estimatedCompletionTime;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        /* renamed from: getLocationToken-VSCKlZI */
        public final String mo1238getLocationTokenVSCKlZI() {
            return this.locationToken;
        }

        @Override // app.cash.local.primitives.FulfillmentConfiguration
        public final LocalFulfillment.SchedulingDetails getSchedulingDetails() {
            return this.schedulingDetails;
        }

        public final int hashCode() {
            int hashCode = this.locationToken.hashCode() * 31;
            EstimatedCompletionTime estimatedCompletionTime = this.estimatedCompletionTime;
            int hashCode2 = (hashCode + (estimatedCompletionTime == null ? 0 : estimatedCompletionTime.hashCode())) * 31;
            EstimatedCompletionDuration estimatedCompletionDuration = this.estimatedCompletionDuration;
            int hashCode3 = (hashCode2 + (estimatedCompletionDuration == null ? 0 : estimatedCompletionDuration.hashCode())) * 31;
            LocalFulfillment.SchedulingDetails schedulingDetails = this.schedulingDetails;
            return hashCode3 + (schedulingDetails != null ? schedulingDetails.hashCode() : 0);
        }

        public final String toString() {
            return "Pickup(locationToken=" + LocationToken.m1252toStringimpl(this.locationToken) + ", estimatedCompletionTime=" + this.estimatedCompletionTime + ", estimatedCompletionDuration=" + this.estimatedCompletionDuration + ", schedulingDetails=" + this.schedulingDetails + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.locationToken);
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
            parcel.writeParcelable(this.schedulingDetails, i);
        }

        public /* synthetic */ Pickup(String str, EstimatedCompletionDuration estimatedCompletionDuration, int i) {
            this(str, null, (i & 4) != 0 ? null : estimatedCompletionDuration, null);
        }
    }
}
