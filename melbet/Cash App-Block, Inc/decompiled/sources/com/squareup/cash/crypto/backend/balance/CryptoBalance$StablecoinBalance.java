package com.squareup.cash.crypto.backend.balance;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoBalance$StablecoinBalance extends zzna {
    public final long amount;
    public final String instrumentToken;

    public CryptoBalance$StablecoinBalance(long j, String str) {
        str.getClass();
        this.amount = j;
        this.instrumentToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoBalance$StablecoinBalance)) {
            return false;
        }
        CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) obj;
        return this.amount == cryptoBalance$StablecoinBalance.amount && Intrinsics.areEqual(this.instrumentToken, cryptoBalance$StablecoinBalance.instrumentToken);
    }

    public final int hashCode() {
        return this.instrumentToken.hashCode() + (Long.hashCode(this.amount) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("StablecoinBalance(amount=", this.amount, ", instrumentToken=", this.instrumentToken);
        m.append(")");
        return m.toString();
    }
}
