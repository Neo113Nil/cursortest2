package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.card.onboarding.StampResult;

/* loaded from: classes6.dex */
public interface CardStudioUndoResult extends Parcelable {

    public final class Cancel implements CardStudioUndoResult {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new StampResult.Creator(6);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 573866010;
        }

        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Undo implements CardStudioUndoResult {
        public static final Undo INSTANCE = new Undo();
        public static final Parcelable.Creator<Undo> CREATOR = new StampResult.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Undo);
        }

        public final int hashCode() {
            return -1013378428;
        }

        public final String toString() {
            return "Undo";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
