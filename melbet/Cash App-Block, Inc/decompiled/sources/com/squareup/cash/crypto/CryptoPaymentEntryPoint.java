package com.squareup.cash.crypto;

import com.fillr.e;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum CryptoPaymentEntryPoint implements WireEnum {
    ENTRY_POINT_UNKNOWN(0),
    DEEP_LINK(1),
    MAIN_KEYPAD_SCANNER_QR_CODE(2),
    CRYPTO_SCANNER_QR_CODE(3),
    CRYPTO_SCANNER_MANUAL_PASTE(4),
    CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT(5),
    CRYPTO_AMOUNT_FOR_RECIPIENT(6);

    public static final CryptoPaymentEntryPoint$Companion$ADAPTER$1 ADAPTER;
    public static final e Companion;
    public final int value;

    static {
        CryptoPaymentEntryPoint cryptoPaymentEntryPoint = ENTRY_POINT_UNKNOWN;
        Companion = new e();
        ADAPTER = new CryptoPaymentEntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CryptoPaymentEntryPoint.class), Syntax.PROTO_2, cryptoPaymentEntryPoint);
    }

    CryptoPaymentEntryPoint(int i) {
        this.value = i;
    }

    public static final CryptoPaymentEntryPoint fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return ENTRY_POINT_UNKNOWN;
            case 1:
                return DEEP_LINK;
            case 2:
                return MAIN_KEYPAD_SCANNER_QR_CODE;
            case 3:
                return CRYPTO_SCANNER_QR_CODE;
            case 4:
                return CRYPTO_SCANNER_MANUAL_PASTE;
            case 5:
                return CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT;
            case 6:
                return CRYPTO_AMOUNT_FOR_RECIPIENT;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
