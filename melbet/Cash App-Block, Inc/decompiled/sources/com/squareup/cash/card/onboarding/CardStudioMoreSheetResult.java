package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.card.onboarding.StampResult;

/* loaded from: classes6.dex */
public interface CardStudioMoreSheetResult extends Parcelable {

    public final class Dismissed implements CardStudioMoreSheetResult {
        public static final Dismissed INSTANCE = new Dismissed();
        public static final Parcelable.Creator<Dismissed> CREATOR = new StampResult.Creator(3);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -38636235;
        }

        public final String toString() {
            return "Dismissed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Done implements CardStudioMoreSheetResult {
        public static final Parcelable.Creator<Done> CREATOR = new StampResult.Creator(4);
        public final boolean isShowingCashtag;

        public Done(boolean z) {
            this.isShowingCashtag = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && this.isShowingCashtag == ((Done) obj).isShowingCashtag;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isShowingCashtag);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Done(isShowingCashtag=", ")", this.isShowingCashtag);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isShowingCashtag ? 1 : 0);
        }
    }

    public final class StartOver implements CardStudioMoreSheetResult {
        public static final Parcelable.Creator<StartOver> CREATOR = new StampResult.Creator(5);
        public final boolean isShowingCashtag;

        public StartOver(boolean z) {
            this.isShowingCashtag = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartOver) && this.isShowingCashtag == ((StartOver) obj).isShowingCashtag;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isShowingCashtag);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("StartOver(isShowingCashtag=", ")", this.isShowingCashtag);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.isShowingCashtag ? 1 : 0);
        }
    }
}
