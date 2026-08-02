package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.composable.adapter.ViewStateId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ConfirmBitcoinDepositIntentScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<ConfirmBitcoinDepositIntentScenarioPlanInput> CREATOR = new ViewStateId.Creator(29);
    public final String partner;
    public final String token;

    public ConfirmBitcoinDepositIntentScenarioPlanInput(String str, String str2) {
        str.getClass();
        this.token = str;
        this.partner = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBitcoinDepositIntentScenarioPlanInput)) {
            return false;
        }
        ConfirmBitcoinDepositIntentScenarioPlanInput confirmBitcoinDepositIntentScenarioPlanInput = (ConfirmBitcoinDepositIntentScenarioPlanInput) obj;
        return Intrinsics.areEqual(this.token, confirmBitcoinDepositIntentScenarioPlanInput.token) && Intrinsics.areEqual(this.partner, confirmBitcoinDepositIntentScenarioPlanInput.partner);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.partner;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ConfirmBitcoinDepositIntentScenarioPlanInput(token=", this.token, ", partner=", this.partner, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeString(this.partner);
    }
}
