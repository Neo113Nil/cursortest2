package com.squareup.cash.db2;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class WalletAddressForCurrency {
    public final String wallet_address;

    public WalletAddressForCurrency(String str) {
        this.wallet_address = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletAddressForCurrency) && Intrinsics.areEqual(this.wallet_address, ((WalletAddressForCurrency) obj).wallet_address);
    }

    public final int hashCode() {
        String str = this.wallet_address;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WalletAddressForCurrency(wallet_address=", this.wallet_address, ")");
    }
}
