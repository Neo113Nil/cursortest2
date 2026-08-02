package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DisclosureExitConfirmationScreen implements BlockersScreens.BlockersDialogScreens {
    public static final Parcelable.Creator<DisclosureExitConfirmationScreen> CREATOR = new CheckCaptureQuestion.Creator(2);
    public final BlockersData blockersData;
    public final String message;
    public final String negativeButtonText;
    public final String positiveButtonText;

    public DisclosureExitConfirmationScreen(BlockersData blockersData, String str, String str2, String str3) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.blockersData = blockersData;
        this.message = str;
        this.positiveButtonText = str2;
        this.negativeButtonText = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureExitConfirmationScreen)) {
            return false;
        }
        DisclosureExitConfirmationScreen disclosureExitConfirmationScreen = (DisclosureExitConfirmationScreen) obj;
        return Intrinsics.areEqual(this.blockersData, disclosureExitConfirmationScreen.blockersData) && Intrinsics.areEqual(this.message, disclosureExitConfirmationScreen.message) && Intrinsics.areEqual(this.positiveButtonText, disclosureExitConfirmationScreen.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, disclosureExitConfirmationScreen.negativeButtonText);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.negativeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.message), 31, this.positiveButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "DisclosureExitConfirmationScreen(blockersData=", ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.message);
        parcel.writeString(this.positiveButtonText);
        parcel.writeString(this.negativeButtonText);
    }
}
