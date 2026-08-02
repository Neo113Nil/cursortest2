package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.instruments.common.Instrument;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface TransferOptionPickerDisplayIcon extends Parcelable {

    public final class CashBalance implements TransferOptionPickerDisplayIcon {
        public static final CashBalance INSTANCE = new CashBalance();
        public static final Parcelable.Creator<CashBalance> CREATOR = new Instrument.Creator(12);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CashBalance);
        }

        public final int hashCode() {
            return -1984779283;
        }

        public final String toString() {
            return "CashBalance";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Instrument implements TransferOptionPickerDisplayIcon {
        public static final Parcelable.Creator<Instrument> CREATOR = new Instrument.Creator(13);
        public final com.squareup.cash.instruments.common.Instrument instrument;

        public Instrument(com.squareup.cash.instruments.common.Instrument instrument) {
            instrument.getClass();
            this.instrument = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Instrument) && Intrinsics.areEqual(this.instrument, ((Instrument) obj).instrument);
        }

        public final int hashCode() {
            return this.instrument.hashCode();
        }

        public final String toString() {
            return "Instrument(instrument=" + this.instrument + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.instrument, i);
        }
    }

    public final class Savings implements TransferOptionPickerDisplayIcon {
        public static final Parcelable.Creator<Savings> CREATOR = new Instrument.Creator(14);
        public final String iconId;
        public final Float progress;

        public Savings(Float f, String str) {
            str.getClass();
            this.iconId = str;
            this.progress = f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj;
            return Intrinsics.areEqual(this.iconId, savings.iconId) && Intrinsics.areEqual((Object) this.progress, (Object) savings.progress);
        }

        public final int hashCode() {
            int hashCode = this.iconId.hashCode() * 31;
            Float f = this.progress;
            return hashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            return "Savings(iconId=" + this.iconId + ", progress=" + this.progress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.iconId);
            Float f = this.progress;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeFloat(f.floatValue());
            }
        }
    }
}
