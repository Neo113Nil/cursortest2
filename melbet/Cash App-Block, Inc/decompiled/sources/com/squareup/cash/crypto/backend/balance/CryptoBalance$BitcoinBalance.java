package com.squareup.cash.crypto.backend.balance;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_face.zzna;
import com.squareup.cash.crypto.amount.BitcoinAmount;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CryptoBalance$BitcoinBalance extends zzna {
    public final BitcoinAmount amount;
    public final String instrumentToken;
    public final Long version;

    public CryptoBalance$BitcoinBalance(BitcoinAmount bitcoinAmount, String str, Long l) {
        str.getClass();
        this.amount = bitcoinAmount;
        this.instrumentToken = str;
        this.version = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoBalance$BitcoinBalance)) {
            return false;
        }
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) obj;
        return this.amount.equals(cryptoBalance$BitcoinBalance.amount) && Intrinsics.areEqual(this.instrumentToken, cryptoBalance$BitcoinBalance.instrumentToken) && Intrinsics.areEqual(this.version, cryptoBalance$BitcoinBalance.version);
    }

    public final BitcoinAmount getAmount() {
        return this.amount;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.instrumentToken);
        Long l = this.version;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitcoinBalance(amount=");
        sb.append(this.amount);
        sb.append(", instrumentToken=");
        sb.append(this.instrumentToken);
        sb.append(", version=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.version, ")");
    }
}
