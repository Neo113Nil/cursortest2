package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Zoom implements Parcelable {
    public static final Parcelable.Creator<Zoom> CREATOR = new Size.Creator(29);
    public final float scale;

    public Zoom(float f) {
        this.scale = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Zoom) && Float.compare(this.scale, ((Zoom) obj).scale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.scale);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scale, "Zoom(scale=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.scale);
    }
}
