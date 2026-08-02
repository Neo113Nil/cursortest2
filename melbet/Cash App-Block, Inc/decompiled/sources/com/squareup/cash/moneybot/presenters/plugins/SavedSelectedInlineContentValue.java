package com.squareup.cash.moneybot.presenters.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.limits.screens.LimitsScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SavedSelectedInlineContentValue implements Parcelable {
    public static final Parcelable.Creator<SavedSelectedInlineContentValue> CREATOR = new LimitsScreen.Creator(21);
    public final String placeholderKey;
    public final SelectedInlineContentValue value;

    public SavedSelectedInlineContentValue(String str, SelectedInlineContentValue selectedInlineContentValue) {
        str.getClass();
        selectedInlineContentValue.getClass();
        this.placeholderKey = str;
        this.value = selectedInlineContentValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSelectedInlineContentValue)) {
            return false;
        }
        SavedSelectedInlineContentValue savedSelectedInlineContentValue = (SavedSelectedInlineContentValue) obj;
        return Intrinsics.areEqual(this.placeholderKey, savedSelectedInlineContentValue.placeholderKey) && Intrinsics.areEqual(this.value, savedSelectedInlineContentValue.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.placeholderKey.hashCode() * 31);
    }

    public final String toString() {
        return "SavedSelectedInlineContentValue(placeholderKey=" + this.placeholderKey + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.placeholderKey);
        parcel.writeParcelable(this.value, i);
    }
}
