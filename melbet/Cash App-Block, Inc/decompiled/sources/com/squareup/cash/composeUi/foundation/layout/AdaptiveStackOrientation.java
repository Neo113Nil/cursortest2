package com.squareup.cash.composeUi.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AdaptiveStackOrientation {
    public static final /* synthetic */ AdaptiveStackOrientation[] $VALUES;
    public static final AdaptiveStackOrientation Auto;
    public static final AdaptiveStackOrientation AutoUntilVertical;
    public static final AdaptiveStackOrientation ForcedVertical;

    static {
        AdaptiveStackOrientation adaptiveStackOrientation = new AdaptiveStackOrientation("Auto", 0);
        Auto = adaptiveStackOrientation;
        AdaptiveStackOrientation adaptiveStackOrientation2 = new AdaptiveStackOrientation("ForcedVertical", 1);
        ForcedVertical = adaptiveStackOrientation2;
        AdaptiveStackOrientation adaptiveStackOrientation3 = new AdaptiveStackOrientation("AutoUntilVertical", 2);
        AutoUntilVertical = adaptiveStackOrientation3;
        $VALUES = new AdaptiveStackOrientation[]{adaptiveStackOrientation, adaptiveStackOrientation2, adaptiveStackOrientation3};
    }

    public static AdaptiveStackOrientation valueOf(String str) {
        return (AdaptiveStackOrientation) Enum.valueOf(AdaptiveStackOrientation.class, str);
    }

    public static AdaptiveStackOrientation[] values() {
        return (AdaptiveStackOrientation[]) $VALUES.clone();
    }
}
