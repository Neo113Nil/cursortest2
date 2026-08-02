package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.payments.viewmodels.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LabeledDetailRow implements Parcelable {
    public static final Parcelable.Creator<LabeledDetailRow> CREATOR = new Size.Creator(5);
    public final String label;
    public final String value;

    public LabeledDetailRow(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabeledDetailRow)) {
            return false;
        }
        LabeledDetailRow labeledDetailRow = (LabeledDetailRow) obj;
        return Intrinsics.areEqual(this.label, labeledDetailRow.label) && Intrinsics.areEqual(this.value, labeledDetailRow.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LabeledDetailRow(label=", this.label, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.label);
        parcel.writeString(this.value);
    }
}
