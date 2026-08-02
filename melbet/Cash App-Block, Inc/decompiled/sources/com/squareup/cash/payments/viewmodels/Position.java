package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class Position implements Parcelable {
    public static final Parcelable.Creator<Position> CREATOR = new Size.Creator(19);
    public final float x;
    public final float y;
    public final float z;

    public Position(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public static Position copy$default(Position position, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = position.x;
        }
        if ((i & 2) != 0) {
            f2 = position.y;
        }
        if ((i & 4) != 0) {
            f3 = position.z;
        }
        position.getClass();
        return new Position(f, f2, f3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return Float.compare(this.x, position.x) == 0 && Float.compare(this.y, position.y) == 0 && Float.compare(this.z, position.z) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.z) + CameraState$Type$EnumUnboxingLocalUtility.m(this.y, Float.hashCode(this.x) * 31, 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(this.z, ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Position(x=", this.x, ", y=", this.y, ", z="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.z);
    }
}
