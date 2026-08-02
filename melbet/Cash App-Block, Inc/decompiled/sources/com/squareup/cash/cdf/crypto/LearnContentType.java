package com.squareup.cash.cdf.crypto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LearnContentType {
    public static final /* synthetic */ LearnContentType[] $VALUES;
    public static final LearnContentType STABLECOIN_CAROUSEL;
    public static final LearnContentType STORY;

    /* JADX INFO: Fake field, exist only in values array */
    LearnContentType EF0;

    static {
        LearnContentType learnContentType = new LearnContentType("CAROUSEL", 0);
        LearnContentType learnContentType2 = new LearnContentType("LINK", 1);
        LearnContentType learnContentType3 = new LearnContentType("STABLECOIN_CAROUSEL", 2);
        STABLECOIN_CAROUSEL = learnContentType3;
        LearnContentType learnContentType4 = new LearnContentType("STORY", 3);
        STORY = learnContentType4;
        $VALUES = new LearnContentType[]{learnContentType, learnContentType2, learnContentType3, learnContentType4};
    }

    public static LearnContentType valueOf(String str) {
        return (LearnContentType) Enum.valueOf(LearnContentType.class, str);
    }

    public static LearnContentType[] values() {
        return (LearnContentType[]) $VALUES.clone();
    }
}
