package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateBitcoinWithdrawalScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<InitiateBitcoinWithdrawalScenarioPlanInput> CREATOR = new Recipient.Creator(3);
    public final CryptoPayment payment;

    public InitiateBitcoinWithdrawalScenarioPlanInput(CryptoPayment cryptoPayment) {
        cryptoPayment.getClass();
        this.payment = cryptoPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateBitcoinWithdrawalScenarioPlanInput) && Intrinsics.areEqual(this.payment, ((InitiateBitcoinWithdrawalScenarioPlanInput) obj).payment);
    }

    public final int hashCode() {
        return this.payment.hashCode();
    }

    public final String toString() {
        return "InitiateBitcoinWithdrawalScenarioPlanInput(payment=" + this.payment + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.payment, i);
    }
}
