package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.screens.Redacted;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalizePaymentResult implements Parcelable {
    public static final Parcelable.Creator<PersonalizePaymentResult> CREATOR = new ScenarioInitiator.Creator(25);
    public final Redacted note;

    public PersonalizePaymentResult(Redacted redacted) {
        redacted.getClass();
        this.note = redacted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizePaymentResult) && Intrinsics.areEqual(this.note, ((PersonalizePaymentResult) obj).note);
    }

    public final int hashCode() {
        return this.note.hashCode();
    }

    public final String toString() {
        return "PersonalizePaymentResult(note=" + this.note + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.note, i);
    }
}
