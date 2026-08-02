package com.squareup.cash.savings.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SavingsCardSheet implements SavingsScreen, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<SavingsCardSheet> CREATOR = new Recipient.Creator(28);
    public final SavingsCard card;
    public final SavingsScreen origin;

    public SavingsCardSheet(SavingsCard savingsCard, SavingsScreen savingsScreen) {
        savingsCard.getClass();
        savingsScreen.getClass();
        this.card = savingsCard;
        this.origin = savingsScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsCardSheet)) {
            return false;
        }
        SavingsCardSheet savingsCardSheet = (SavingsCardSheet) obj;
        return Intrinsics.areEqual(this.card, savingsCardSheet.card) && Intrinsics.areEqual(this.origin, savingsCardSheet.origin);
    }

    public final int hashCode() {
        return this.origin.hashCode() + (this.card.hashCode() * 31);
    }

    public final String toString() {
        return "SavingsCardSheet(card=" + this.card + ", origin=" + this.origin + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.card, i);
        parcel.writeParcelable(this.origin, i);
    }
}
