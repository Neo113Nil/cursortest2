package com.squareup.cash.crypto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class CryptoPaymentEntryPoint$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoPaymentEntryPoint.Companion.getClass();
        switch (i) {
            case 0:
                return CryptoPaymentEntryPoint.ENTRY_POINT_UNKNOWN;
            case 1:
                return CryptoPaymentEntryPoint.DEEP_LINK;
            case 2:
                return CryptoPaymentEntryPoint.MAIN_KEYPAD_SCANNER_QR_CODE;
            case 3:
                return CryptoPaymentEntryPoint.CRYPTO_SCANNER_QR_CODE;
            case 4:
                return CryptoPaymentEntryPoint.CRYPTO_SCANNER_MANUAL_PASTE;
            case 5:
                return CryptoPaymentEntryPoint.CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT;
            case 6:
                return CryptoPaymentEntryPoint.CRYPTO_AMOUNT_FOR_RECIPIENT;
            default:
                return null;
        }
    }
}
