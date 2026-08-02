package com.squareup.cash.crypto.scenarioplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.protos.common.Money;

/* loaded from: classes6.dex */
public final class InitiateStablecoinWithdrawalScenarioPlanInput implements ScenarioPlanInput {
    public static final Parcelable.Creator<InitiateStablecoinWithdrawalScenarioPlanInput> CREATOR = new Recipient.Creator(5);
    public final SolanaAddress address;
    public final Money amount;
    public final String flowToken;
    public final InstrumentSelectionData instrumentSelectionData;
    public final String paymentId;
    public final StablecoinWithdrawalOption withdrawalOption;

    public /* synthetic */ InitiateStablecoinWithdrawalScenarioPlanInput(SolanaAddress solanaAddress, StablecoinWithdrawalOption stablecoinWithdrawalOption, String str, String str2, Money money, InstrumentSelectionData instrumentSelectionData, int i) {
        this((i & 1) != 0 ? null : solanaAddress, (i & 2) != 0 ? null : stablecoinWithdrawalOption, str, str2, money, (i & 32) != 0 ? null : instrumentSelectionData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.address, i);
        parcel.writeParcelable(this.withdrawalOption, i);
        parcel.writeString(this.paymentId);
        parcel.writeString(this.flowToken);
        parcel.writeParcelable(this.amount, i);
        parcel.writeParcelable(this.instrumentSelectionData, i);
    }

    public InitiateStablecoinWithdrawalScenarioPlanInput(SolanaAddress solanaAddress, StablecoinWithdrawalOption stablecoinWithdrawalOption, String str, String str2, Money money, InstrumentSelectionData instrumentSelectionData) {
        this.address = solanaAddress;
        this.withdrawalOption = stablecoinWithdrawalOption;
        this.paymentId = str;
        this.flowToken = str2;
        this.amount = money;
        this.instrumentSelectionData = instrumentSelectionData;
    }
}
