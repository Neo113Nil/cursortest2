package com.squareup.cash.investing.viewmodels;

import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;

/* loaded from: classes6.dex */
public interface StockMetric extends Comparable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BackgroundType {
        public static final /* synthetic */ BackgroundType[] $VALUES;
        public static final BackgroundType DARK;
        public static final BackgroundType LIGHT;

        static {
            BackgroundType backgroundType = new BackgroundType("LIGHT", 0);
            LIGHT = backgroundType;
            BackgroundType backgroundType2 = new BackgroundType("DARK", 1);
            DARK = backgroundType2;
            $VALUES = new BackgroundType[]{backgroundType, backgroundType2};
        }

        public static BackgroundType valueOf(String str) {
            return (BackgroundType) Enum.valueOf(BackgroundType.class, str);
        }

        public static BackgroundType[] values() {
            return (BackgroundType[]) $VALUES.clone();
        }
    }

    BackgroundType getBackgroundColorType();

    InvestingCryptoImage getNetProfitIcon();

    String getText();
}
