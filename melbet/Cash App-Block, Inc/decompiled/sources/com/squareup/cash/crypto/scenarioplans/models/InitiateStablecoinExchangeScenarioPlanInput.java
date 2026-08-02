package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.crypto.navigation.StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll;
import com.squareup.cash.db.contacts.Recipient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateStablecoinExchangeScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<InitiateStablecoinExchangeScenarioPlanInput> CREATOR = new Recipient.Creator(4);
    public final StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll exchangeType;

    public InitiateStablecoinExchangeScenarioPlanInput(StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll) {
        stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.getClass();
        this.exchangeType = stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateStablecoinExchangeScenarioPlanInput) && Intrinsics.areEqual(this.exchangeType, ((InitiateStablecoinExchangeScenarioPlanInput) obj).exchangeType);
    }

    public final int hashCode() {
        return this.exchangeType.hashCode();
    }

    public final String toString() {
        return "InitiateStablecoinExchangeScenarioPlanInput(exchangeType=" + this.exchangeType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.exchangeType, i);
    }
}
