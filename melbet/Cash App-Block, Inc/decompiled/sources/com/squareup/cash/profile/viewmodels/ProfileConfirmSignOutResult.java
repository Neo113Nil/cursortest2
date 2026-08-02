package com.squareup.cash.profile.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.viewmodels.Alias;

/* loaded from: classes7.dex */
public interface ProfileConfirmSignOutResult extends Parcelable {

    public final class Negative implements ProfileConfirmSignOutResult {
        public static final Negative INSTANCE = new Negative();
        public static final Parcelable.Creator<Negative> CREATOR = new Alias.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Negative);
        }

        public final int hashCode() {
            return -1827235692;
        }

        public final String toString() {
            return "Negative";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Positive implements ProfileConfirmSignOutResult {
        public static final Positive INSTANCE = new Positive();
        public static final Parcelable.Creator<Positive> CREATOR = new Alias.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Positive);
        }

        public final int hashCode() {
            return -2000542120;
        }

        public final String toString() {
            return "Positive";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
