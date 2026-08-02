package com.squareup.cash.money.views;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class SavedToolbarNestedScrollState implements Parcelable {
    public static final Parcelable.Creator<SavedToolbarNestedScrollState> CREATOR = new Creator();
    public final float toolbarHeight;
    public final float toolbarScrollDelta;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SavedToolbarNestedScrollState(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavedToolbarNestedScrollState[i];
        }
    }

    public SavedToolbarNestedScrollState(float f, float f2) {
        this.toolbarHeight = f;
        this.toolbarScrollDelta = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedToolbarNestedScrollState)) {
            return false;
        }
        SavedToolbarNestedScrollState savedToolbarNestedScrollState = (SavedToolbarNestedScrollState) obj;
        return Float.compare(this.toolbarHeight, savedToolbarNestedScrollState.toolbarHeight) == 0 && Float.compare(this.toolbarScrollDelta, savedToolbarNestedScrollState.toolbarScrollDelta) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.toolbarScrollDelta) + (Float.hashCode(this.toolbarHeight) * 31);
    }

    public final String toString() {
        return "SavedToolbarNestedScrollState(toolbarHeight=" + this.toolbarHeight + ", toolbarScrollDelta=" + this.toolbarScrollDelta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeFloat(this.toolbarHeight);
        parcel.writeFloat(this.toolbarScrollDelta);
    }
}
