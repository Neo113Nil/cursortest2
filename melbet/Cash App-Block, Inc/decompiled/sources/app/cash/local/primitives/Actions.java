package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.primitives.Cart;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Actions implements Parcelable {
    public static final Parcelable.Creator<Actions> CREATOR = new Cart.Creator(13);
    public final DiscountMode discountMode;
    public final List pastOrders;
    public final List popularOrders;
    public final List reorderablePastSelections;

    public Actions(DiscountMode discountMode, List list, List list2, List list3) {
        discountMode.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.discountMode = discountMode;
        this.popularOrders = list;
        this.pastOrders = list2;
        this.reorderablePastSelections = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Actions)) {
            return false;
        }
        Actions actions = (Actions) obj;
        return Intrinsics.areEqual(this.discountMode, actions.discountMode) && Intrinsics.areEqual(this.popularOrders, actions.popularOrders) && Intrinsics.areEqual(this.pastOrders, actions.pastOrders) && Intrinsics.areEqual(this.reorderablePastSelections, actions.reorderablePastSelections);
    }

    public final int hashCode() {
        return this.reorderablePastSelections.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.discountMode.hashCode() * 31, 31, this.popularOrders), 31, this.pastOrders);
    }

    public final String toString() {
        return "Actions(discountMode=" + this.discountMode + ", popularOrders=" + this.popularOrders + ", pastOrders=" + this.pastOrders + ", reorderablePastSelections=" + this.reorderablePastSelections + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.discountMode, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.popularOrders, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.pastOrders, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.reorderablePastSelections, parcel);
        while (m3.hasNext()) {
            parcel.writeParcelable((Parcelable) m3.next(), i);
        }
    }
}
