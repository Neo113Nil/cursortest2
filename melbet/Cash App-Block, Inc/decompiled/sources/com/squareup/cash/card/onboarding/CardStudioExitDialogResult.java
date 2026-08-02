package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.card.onboarding.StampResult;

/* loaded from: classes6.dex */
public interface CardStudioExitDialogResult extends Parcelable {

    public final class Exit implements CardStudioExitDialogResult {
        public static final Exit INSTANCE = new Exit();
        public static final Parcelable.Creator<Exit> CREATOR = new StampResult.Creator(1);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -303750116;
        }

        public final String toString() {
            return "Exit";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Stay implements CardStudioExitDialogResult {
        public static final Stay INSTANCE = new Stay();
        public static final Parcelable.Creator<Stay> CREATOR = new StampResult.Creator(2);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Stay);
        }

        public final int hashCode() {
            return -303337129;
        }

        public final String toString() {
            return "Stay";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
