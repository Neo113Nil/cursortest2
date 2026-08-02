package com.squareup.cash.investing.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import okhttp3.MultipartBody;

/* loaded from: classes6.dex */
public final class TradeEvent$TransferStock extends MultipartBody.Companion {
    public final long amount;

    public TradeEvent$TransferStock(long j) {
        this.amount = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TradeEvent$TransferStock) && this.amount == ((TradeEvent$TransferStock) obj).amount;
    }

    public final int hashCode() {
        return Long.hashCode(this.amount);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.amount, "TransferStock(amount=", ")");
    }
}
