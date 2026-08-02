package com.squareup.cash.blockers.presenters;

import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.protos.franklin.app.SetAmountRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BitcoinAmountBlockerPresenter$State {
    public final BitcoinAmountViewModel bitcoinAmountModel;
    public final SetAmountRequest setAmountRequest;

    public BitcoinAmountBlockerPresenter$State(BitcoinAmountViewModel bitcoinAmountViewModel, SetAmountRequest setAmountRequest) {
        this.bitcoinAmountModel = bitcoinAmountViewModel;
        this.setAmountRequest = setAmountRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinAmountBlockerPresenter$State)) {
            return false;
        }
        BitcoinAmountBlockerPresenter$State bitcoinAmountBlockerPresenter$State = (BitcoinAmountBlockerPresenter$State) obj;
        return Intrinsics.areEqual(this.bitcoinAmountModel, bitcoinAmountBlockerPresenter$State.bitcoinAmountModel) && Intrinsics.areEqual(this.setAmountRequest, bitcoinAmountBlockerPresenter$State.setAmountRequest);
    }

    public final int hashCode() {
        BitcoinAmountViewModel bitcoinAmountViewModel = this.bitcoinAmountModel;
        int hashCode = (bitcoinAmountViewModel == null ? 0 : bitcoinAmountViewModel.hashCode()) * 31;
        SetAmountRequest setAmountRequest = this.setAmountRequest;
        return hashCode + (setAmountRequest != null ? setAmountRequest.hashCode() : 0);
    }

    public final String toString() {
        return "State(bitcoinAmountModel=" + this.bitcoinAmountModel + ", setAmountRequest=" + this.setAmountRequest + ")";
    }
}
