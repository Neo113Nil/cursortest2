package com.squareup.cash.crypto.backend.profile;

import com.google.mlkit.vision.text.zzb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BitcoinDisplayUnit {
    public static final /* synthetic */ BitcoinDisplayUnit[] $VALUES;
    public static final BitcoinDisplayUnit BITCOIN;
    public static final zzb Companion;
    public static final BitcoinDisplayUnit SATOSHIS;

    static {
        BitcoinDisplayUnit bitcoinDisplayUnit = new BitcoinDisplayUnit("BITCOIN", 0);
        BITCOIN = bitcoinDisplayUnit;
        BitcoinDisplayUnit bitcoinDisplayUnit2 = new BitcoinDisplayUnit("SATOSHIS", 1);
        SATOSHIS = bitcoinDisplayUnit2;
        $VALUES = new BitcoinDisplayUnit[]{bitcoinDisplayUnit, bitcoinDisplayUnit2};
        Companion = new zzb(21);
    }

    public static BitcoinDisplayUnit valueOf(String str) {
        return (BitcoinDisplayUnit) Enum.valueOf(BitcoinDisplayUnit.class, str);
    }

    public static BitcoinDisplayUnit[] values() {
        return (BitcoinDisplayUnit[]) $VALUES.clone();
    }
}
