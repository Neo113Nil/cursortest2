package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.FulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FulfillmentConfigurations implements Parcelable {
    public static final Parcelable.Creator<FulfillmentConfigurations> CREATOR = new Creator();
    public final FulfillmentConfiguration asap;
    public final LocalFulfillment.SchedulingDetails.SchedulingMode currentSchedulingMode;
    public final FulfillmentConfiguration scheduled;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FulfillmentConfigurations(LocalFulfillment.SchedulingDetails.SchedulingMode.valueOf(parcel.readString()), (FulfillmentConfiguration) parcel.readParcelable(FulfillmentConfigurations.class.getClassLoader()), (FulfillmentConfiguration) parcel.readParcelable(FulfillmentConfigurations.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FulfillmentConfigurations[i];
        }
    }

    public FulfillmentConfigurations(LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode, FulfillmentConfiguration fulfillmentConfiguration, FulfillmentConfiguration fulfillmentConfiguration2) {
        schedulingMode.getClass();
        fulfillmentConfiguration.getClass();
        fulfillmentConfiguration2.getClass();
        this.currentSchedulingMode = schedulingMode;
        this.asap = fulfillmentConfiguration;
        this.scheduled = fulfillmentConfiguration2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfillmentConfigurations)) {
            return false;
        }
        FulfillmentConfigurations fulfillmentConfigurations = (FulfillmentConfigurations) obj;
        return this.currentSchedulingMode == fulfillmentConfigurations.currentSchedulingMode && Intrinsics.areEqual(this.asap, fulfillmentConfigurations.asap) && Intrinsics.areEqual(this.scheduled, fulfillmentConfigurations.scheduled);
    }

    public final int hashCode() {
        return this.scheduled.hashCode() + ((this.asap.hashCode() + (this.currentSchedulingMode.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FulfillmentConfigurations(currentSchedulingMode=" + this.currentSchedulingMode + ", asap=" + this.asap + ", scheduled=" + this.scheduled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.currentSchedulingMode.name());
        parcel.writeParcelable(this.asap, i);
        parcel.writeParcelable(this.scheduled, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FulfillmentConfigurations(FulfillmentConfiguration fulfillmentConfiguration, int i) {
        this(r0, r4 != 0 ? r1 : fulfillmentConfiguration, r1);
        LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP;
        int i2 = i & 2;
        FulfillmentConfiguration.Unspecified unspecified = FulfillmentConfiguration.Unspecified.INSTANCE;
    }
}
