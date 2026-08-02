package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Rotation implements Parcelable {
    public static final Parcelable.Creator<Rotation> CREATOR = new Size.Creator(20);
    public final float rotation;

    public Rotation(float f) {
        this.rotation = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Rotation) && Float.compare(this.rotation, ((Rotation) obj).rotation) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.rotation);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rotation, "Rotation(rotation=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.rotation);
    }
}
