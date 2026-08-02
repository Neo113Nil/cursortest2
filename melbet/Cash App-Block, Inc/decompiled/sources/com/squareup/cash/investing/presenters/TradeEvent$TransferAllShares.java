package com.squareup.cash.investing.presenters;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;

/* loaded from: classes6.dex */
public final class TradeEvent$TransferAllShares extends MultipartBody.Companion {
    public final String shares;

    public TradeEvent$TransferAllShares(String str) {
        str.getClass();
        this.shares = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TradeEvent$TransferAllShares) && Intrinsics.areEqual(this.shares, ((TradeEvent$TransferAllShares) obj).shares);
    }

    public final int hashCode() {
        return this.shares.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TransferAllShares(shares=", this.shares, ")");
    }
}
