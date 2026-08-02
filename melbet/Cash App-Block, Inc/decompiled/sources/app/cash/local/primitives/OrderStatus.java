package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuItem;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OrderStatus implements Parcelable {
    public static final Parcelable.Creator<OrderStatus> CREATOR = new MenuItem.Creator(16);
    public final boolean cancelled;
    public final String currentStatusFulfillmentLabel;
    public final String currentStatusHeading;
    public final int currentStatusIndex;
    public final boolean inProgress;
    public final List statuses;

    public OrderStatus(int i, List list, String str, boolean z, String str2, boolean z2) {
        list.getClass();
        this.currentStatusIndex = i;
        this.statuses = list;
        this.currentStatusHeading = str;
        this.cancelled = z;
        this.currentStatusFulfillmentLabel = str2;
        this.inProgress = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatus)) {
            return false;
        }
        OrderStatus orderStatus = (OrderStatus) obj;
        return this.currentStatusIndex == orderStatus.currentStatusIndex && Intrinsics.areEqual(this.statuses, orderStatus.statuses) && Intrinsics.areEqual(this.currentStatusHeading, orderStatus.currentStatusHeading) && this.cancelled == orderStatus.cancelled && Intrinsics.areEqual(this.currentStatusFulfillmentLabel, orderStatus.currentStatusFulfillmentLabel) && this.inProgress == orderStatus.inProgress;
    }

    public final String getCurrentStatusFulfillmentLabel() {
        return this.currentStatusFulfillmentLabel;
    }

    public final int getCurrentStatusIndex() {
        return this.currentStatusIndex;
    }

    public final List getStatuses() {
        return this.statuses;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.currentStatusIndex) * 31, 31, this.statuses);
        String str = this.currentStatusHeading;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.cancelled);
        String str2 = this.currentStatusFulfillmentLabel;
        return Boolean.hashCode(this.inProgress) + ((m2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderStatus(currentStatusIndex=");
        sb.append(this.currentStatusIndex);
        sb.append(", statuses=");
        sb.append(this.statuses);
        sb.append(", currentStatusHeading=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.currentStatusHeading, ", cancelled=", this.cancelled, ", currentStatusFulfillmentLabel=");
        return re$$ExternalSyntheticOutline0.m(sb, this.currentStatusFulfillmentLabel, ", inProgress=", this.inProgress, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.currentStatusIndex);
        parcel.writeStringList(this.statuses);
        parcel.writeString(this.currentStatusHeading);
        parcel.writeInt(this.cancelled ? 1 : 0);
        parcel.writeString(this.currentStatusFulfillmentLabel);
        parcel.writeInt(this.inProgress ? 1 : 0);
    }
}
