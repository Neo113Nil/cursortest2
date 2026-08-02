package com.squareup.cash.crypto.amount;

import com.google.mlkit.vision.text.zza;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum CryptoCurrency implements WireEnum {
    UNKNOWN(0),
    BTC(1),
    XUS(2);

    public static final CryptoCurrency$Companion$ADAPTER$1 ADAPTER;
    public static final zza Companion;
    public final int value;

    static {
        CryptoCurrency cryptoCurrency = UNKNOWN;
        Companion = new zza(21);
        ADAPTER = new CryptoCurrency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CryptoCurrency.class), Syntax.PROTO_2, cryptoCurrency);
    }

    CryptoCurrency(int i) {
        this.value = i;
    }

    public static final CryptoCurrency fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return BTC;
        }
        if (i != 2) {
            return null;
        }
        return XUS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
