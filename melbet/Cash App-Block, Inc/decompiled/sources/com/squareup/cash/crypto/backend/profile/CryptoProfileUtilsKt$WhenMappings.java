package com.squareup.cash.crypto.backend.profile;

import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CryptoProfileUtilsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[BitcoinDisplayUnits.values().length];
        try {
            iArr[BitcoinDisplayUnits.BITCOIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BitcoinDisplayUnits.SATOSHIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
