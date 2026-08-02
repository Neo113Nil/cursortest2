package com.squareup.cash.blockers.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowHome;

/* loaded from: classes4.dex */
public interface IneligibleMergeResult extends Parcelable {

    public final class Negative implements IneligibleMergeResult {
        public static final Negative INSTANCE = new Negative();
        public static final Parcelable.Creator<Negative> CREATOR = new BorrowHome.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Negative);
        }

        public final int hashCode() {
            return -80385946;
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

    public final class Positive implements IneligibleMergeResult {
        public static final Positive INSTANCE = new Positive();
        public static final Parcelable.Creator<Positive> CREATOR = new BorrowHome.Creator(14);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Positive);
        }

        public final int hashCode() {
            return -253692374;
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
