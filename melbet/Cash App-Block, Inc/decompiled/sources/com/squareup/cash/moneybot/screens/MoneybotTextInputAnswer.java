package com.squareup.cash.moneybot.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class MoneybotTextInputAnswer implements Parcelable {

    public final class Dismissed extends MoneybotTextInputAnswer {
        public static final Dismissed INSTANCE = new Dismissed();
        public static final Parcelable.Creator<Dismissed> CREATOR = new MusicScreen.Creator(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1236641069;
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

    public final class Selected extends MoneybotTextInputAnswer {
        public static final Parcelable.Creator<Selected> CREATOR = new MusicScreen.Creator(21);
        public final String text;

        public Selected(String str) {
            str.getClass();
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Selected) && Intrinsics.areEqual(this.text, ((Selected) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selected(text=", this.text, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.text);
        }
    }
}
