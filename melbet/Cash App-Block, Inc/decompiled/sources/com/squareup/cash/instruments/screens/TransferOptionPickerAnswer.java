package com.squareup.cash.instruments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.instruments.common.Instrument;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class TransferOptionPickerAnswer implements Parcelable {

    public final class Dismissed extends TransferOptionPickerAnswer {
        public static final Dismissed INSTANCE = new Dismissed();
        public static final Parcelable.Creator<Dismissed> CREATOR = new Instrument.Creator(9);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1248743102;
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

    public final class LinkTapped extends TransferOptionPickerAnswer {
        public static final Parcelable.Creator<LinkTapped> CREATOR = new Instrument.Creator(10);
        public final TransferOptions transferOption;

        public LinkTapped(TransferOptions transferOptions) {
            transferOptions.getClass();
            this.transferOption = transferOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LinkTapped) && this.transferOption == ((LinkTapped) obj).transferOption;
        }

        public final int hashCode() {
            return this.transferOption.hashCode();
        }

        public final String toString() {
            return "LinkTapped(transferOption=" + this.transferOption + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.transferOption.name());
        }
    }

    public final class Selected extends TransferOptionPickerAnswer {
        public static final Parcelable.Creator<Selected> CREATOR = new Instrument.Creator(11);
        public final TransferOptionPickerSelectedOption option;

        public Selected(TransferOptionPickerSelectedOption transferOptionPickerSelectedOption) {
            transferOptionPickerSelectedOption.getClass();
            this.option = transferOptionPickerSelectedOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Selected) && Intrinsics.areEqual(this.option, ((Selected) obj).option);
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "Selected(option=" + this.option + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.option.writeToParcel(parcel, i);
        }
    }
}
