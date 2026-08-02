package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.screens.BoostDetailsScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RedactedParcelableList extends Redacted {
    public static final Parcelable.Creator<RedactedParcelableList> CREATOR = new BoostDetailsScreen.Creator(8);
    public final List value;

    public RedactedParcelableList(List list) {
        list.getClass();
        this.value = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RedactedParcelableList) && Intrinsics.areEqual(this.value, ((RedactedParcelableList) obj).value);
    }

    @Override // com.squareup.cash.screens.Redacted
    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.value, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
