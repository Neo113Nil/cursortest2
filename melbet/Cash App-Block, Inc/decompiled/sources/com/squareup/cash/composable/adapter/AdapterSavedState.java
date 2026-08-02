package com.squareup.cash.composable.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.composable.adapter.ViewStateId;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AdapterSavedState implements Parcelable {
    public static final Parcelable.Creator<AdapterSavedState> CREATOR = new ViewStateId.Creator(7);
    public final Map viewStates;

    public AdapterSavedState(Map map) {
        map.getClass();
        this.viewStates = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdapterSavedState) && Intrinsics.areEqual(this.viewStates, ((AdapterSavedState) obj).viewStates);
    }

    public final int hashCode() {
        return this.viewStates.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("AdapterSavedState(viewStates=", ")", this.viewStates);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.viewStates, parcel);
        while (m.hasNext()) {
            Map.Entry entry = (Map.Entry) m.next();
            ((ViewStateId) entry.getKey()).writeToParcel(parcel, i);
            SparseArray sparseArray = (SparseArray) entry.getValue();
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 != size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeParcelable((Parcelable) sparseArray.valueAt(i2), i);
            }
        }
    }
}
