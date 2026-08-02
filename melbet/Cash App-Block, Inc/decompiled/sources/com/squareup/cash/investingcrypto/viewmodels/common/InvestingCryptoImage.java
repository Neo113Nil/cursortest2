package com.squareup.cash.investingcrypto.viewmodels.common;

import com.google.mlkit.vision.text.zza;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class InvestingCryptoImage {
    public static final /* synthetic */ InvestingCryptoImage[] $VALUES;
    public static final InvestingCryptoImage ARROW_DOWN;
    public static final InvestingCryptoImage ARROW_UP;
    public static final InvestingCryptoImage BITCOIN;
    public static final InvestingCryptoImage CAUTION;
    public static final zza Companion;

    static {
        InvestingCryptoImage investingCryptoImage = new InvestingCryptoImage("BITCOIN", 0);
        BITCOIN = investingCryptoImage;
        InvestingCryptoImage investingCryptoImage2 = new InvestingCryptoImage("ARROW_UP", 1);
        ARROW_UP = investingCryptoImage2;
        InvestingCryptoImage investingCryptoImage3 = new InvestingCryptoImage("ARROW_DOWN", 2);
        ARROW_DOWN = investingCryptoImage3;
        InvestingCryptoImage investingCryptoImage4 = new InvestingCryptoImage("CAUTION", 3);
        CAUTION = investingCryptoImage4;
        $VALUES = new InvestingCryptoImage[]{investingCryptoImage, investingCryptoImage2, investingCryptoImage3, investingCryptoImage4, new InvestingCryptoImage("SAVINGS", 4)};
        Companion = new zza(26);
    }

    public static InvestingCryptoImage valueOf(String str) {
        return (InvestingCryptoImage) Enum.valueOf(InvestingCryptoImage.class, str);
    }

    public static InvestingCryptoImage[] values() {
        return (InvestingCryptoImage[]) $VALUES.clone();
    }
}
