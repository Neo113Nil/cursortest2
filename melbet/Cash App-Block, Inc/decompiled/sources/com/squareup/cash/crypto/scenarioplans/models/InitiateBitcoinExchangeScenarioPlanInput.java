package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateBitcoinExchangeScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<InitiateBitcoinExchangeScenarioPlanInput> CREATOR = new Recipient.Creator(2);
    public final BitcoinExchangeType bitcoinExchangeType;
    public final ExchangeRequest request;

    public InitiateBitcoinExchangeScenarioPlanInput(ExchangeRequest exchangeRequest, BitcoinExchangeType bitcoinExchangeType) {
        exchangeRequest.getClass();
        bitcoinExchangeType.getClass();
        this.request = exchangeRequest;
        this.bitcoinExchangeType = bitcoinExchangeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateBitcoinExchangeScenarioPlanInput)) {
            return false;
        }
        InitiateBitcoinExchangeScenarioPlanInput initiateBitcoinExchangeScenarioPlanInput = (InitiateBitcoinExchangeScenarioPlanInput) obj;
        return Intrinsics.areEqual(this.request, initiateBitcoinExchangeScenarioPlanInput.request) && Intrinsics.areEqual(this.bitcoinExchangeType, initiateBitcoinExchangeScenarioPlanInput.bitcoinExchangeType);
    }

    public final int hashCode() {
        return this.bitcoinExchangeType.hashCode() + (this.request.hashCode() * 31);
    }

    public final String toString() {
        return "InitiateBitcoinExchangeScenarioPlanInput(request=" + this.request + ", bitcoinExchangeType=" + this.bitcoinExchangeType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.request, i);
        parcel.writeParcelable(this.bitcoinExchangeType, i);
    }
}
