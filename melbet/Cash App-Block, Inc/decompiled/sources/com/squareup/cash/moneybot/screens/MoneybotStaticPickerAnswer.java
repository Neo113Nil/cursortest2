package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.music.screens.MusicScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneybotStaticPickerAnswer implements Parcelable {

    public final class Dismissed extends MoneybotStaticPickerAnswer {
        public static final Dismissed INSTANCE = new Dismissed();
        public static final Parcelable.Creator<Dismissed> CREATOR = new MusicScreen.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1273038280;
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

    public final class Selected extends MoneybotStaticPickerAnswer {
        public static final Parcelable.Creator<Selected> CREATOR = new MusicScreen.Creator(14);
        public final MoneybotStaticPickerOption option;

        public Selected(MoneybotStaticPickerOption moneybotStaticPickerOption) {
            moneybotStaticPickerOption.getClass();
            this.option = moneybotStaticPickerOption;
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
