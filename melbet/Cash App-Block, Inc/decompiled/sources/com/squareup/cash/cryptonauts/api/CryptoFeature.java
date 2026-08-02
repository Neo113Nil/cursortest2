package com.squareup.cash.cryptonauts.api;

import com.google.mlkit.vision.text.zzc;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public enum CryptoFeature implements WireEnum {
    FEATURE_UNSPECIFIED(0),
    BTC_P2P_SEND(1),
    BTC_P2P_RECEIVE(2),
    BTC_WITHDRAW(3),
    BTC_DEPOSIT(4),
    BTC_LN_WITHDRAW(5),
    BTC_LN_DEPOSIT(6),
    BTC_BUY(7),
    BTC_SELL(8),
    BTC_BITKEY_TRANSFER(9),
    BTC_BITKEY_BUY_AND_TRANSFER(10),
    BTC_DEPOSIT_REVERSAL(11),
    BTC_BITKEY_SELL(12),
    BTC_SQUARE_SELLER_LN_PAYMENT(13),
    BTC_MAP(14);

    public static final CryptoFeature$Companion$ADAPTER$1 ADAPTER;
    public static final zzc Companion;
    public final int value;

    static {
        CryptoFeature cryptoFeature = FEATURE_UNSPECIFIED;
        Companion = new zzc(22);
        ADAPTER = new CryptoFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CryptoFeature.class), Syntax.PROTO_3, cryptoFeature);
    }

    CryptoFeature(int i) {
        this.value = i;
    }

    public static final CryptoFeature fromValue(int i) {
        Companion.getClass();
        return zzc.m2067fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
