package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class StablecoinDepositCopyViewModel {
    public final String truncatedAddress;

    public StablecoinDepositCopyViewModel(String str) {
        str.getClass();
        this.truncatedAddress = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StablecoinDepositCopyViewModel) && Intrinsics.areEqual(this.truncatedAddress, ((StablecoinDepositCopyViewModel) obj).truncatedAddress);
    }

    public final int hashCode() {
        return this.truncatedAddress.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StablecoinDepositCopyViewModel(truncatedAddress=", this.truncatedAddress, ")");
    }
}
