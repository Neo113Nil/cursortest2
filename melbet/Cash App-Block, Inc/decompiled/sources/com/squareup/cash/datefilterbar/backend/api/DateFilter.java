package com.squareup.cash.datefilterbar.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface DateFilter extends Parcelable {

    public final class AllTime implements DateFilter {
        public static final AllTime INSTANCE = new AllTime();
        public static final Parcelable.Creator<AllTime> CREATOR = new Recipient.Creator(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllTime);
        }

        public final int hashCode() {
            return -1821879385;
        }

        public final String toString() {
            return "AllTime";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Monthly implements DateFilter {
        public static final Parcelable.Creator<Monthly> CREATOR = new Recipient.Creator(8);
        public final int month;
        public final int year;

        public Monthly(int i, int i2) {
            this.month = i;
            this.year = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Monthly)) {
                return false;
            }
            Monthly monthly = (Monthly) obj;
            return this.month == monthly.month && this.year == monthly.year;
        }

        public final int hashCode() {
            return Integer.hashCode(this.year) + (Integer.hashCode(this.month) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.month, this.year, "Monthly(month=", ", year=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.month);
            parcel.writeInt(this.year);
        }
    }

    public final class Yearly implements DateFilter {
        public static final Parcelable.Creator<Yearly> CREATOR = new Recipient.Creator(9);
        public final int year;

        public Yearly(int i) {
            this.year = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Yearly) && this.year == ((Yearly) obj).year;
        }

        public final int hashCode() {
            return Integer.hashCode(this.year);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.year, "Yearly(year=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.year);
        }
    }
}
