package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.crypto.primitives.BitcoinFeature;
import com.squareup.cash.db.contacts.Recipient;

/* loaded from: classes6.dex */
public final class CryptoOnboardingScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<CryptoOnboardingScenarioPlanInput> CREATOR = new Recipient.Creator(1);
    public final BitcoinFeature bitcoinFeature;

    public CryptoOnboardingScenarioPlanInput(BitcoinFeature bitcoinFeature) {
        bitcoinFeature.getClass();
        this.bitcoinFeature = bitcoinFeature;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoOnboardingScenarioPlanInput) && this.bitcoinFeature == ((CryptoOnboardingScenarioPlanInput) obj).bitcoinFeature;
    }

    public final int hashCode() {
        return this.bitcoinFeature.hashCode();
    }

    public final String toString() {
        return "CryptoOnboardingScenarioPlanInput(bitcoinFeature=" + this.bitcoinFeature + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.bitcoinFeature.name());
    }
}
