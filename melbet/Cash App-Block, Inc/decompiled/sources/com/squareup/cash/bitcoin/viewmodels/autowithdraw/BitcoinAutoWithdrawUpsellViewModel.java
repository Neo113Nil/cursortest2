package com.squareup.cash.bitcoin.viewmodels.autowithdraw;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class BitcoinAutoWithdrawUpsellViewModel {
    public final String targetDescription;

    public BitcoinAutoWithdrawUpsellViewModel(String str) {
        this.targetDescription = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinAutoWithdrawUpsellViewModel) && this.targetDescription.equals(((BitcoinAutoWithdrawUpsellViewModel) obj).targetDescription);
    }

    public final int hashCode() {
        return this.targetDescription.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinAutoWithdrawUpsellViewModel(targetDescription=", this.targetDescription, ")");
    }
}
