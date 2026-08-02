package com.squareup.cash.bitcoin.viewmodels;

import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinKeypadError$MaxLimitError extends AndroidTileMode_androidKt {
    public final String depositLimitMessage;
    public final String message;

    public BitcoinKeypadError$MaxLimitError(String str, String str2) {
        this.message = str;
        this.depositLimitMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinKeypadError$MaxLimitError)) {
            return false;
        }
        BitcoinKeypadError$MaxLimitError bitcoinKeypadError$MaxLimitError = (BitcoinKeypadError$MaxLimitError) obj;
        return Intrinsics.areEqual(this.message, bitcoinKeypadError$MaxLimitError.message) && Intrinsics.areEqual(this.depositLimitMessage, bitcoinKeypadError$MaxLimitError.depositLimitMessage);
    }

    @Override // androidx.compose.ui.graphics.AndroidTileMode_androidKt
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.depositLimitMessage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MaxLimitError(message=", this.message, ", depositLimitMessage=", this.depositLimitMessage, ")");
    }
}
