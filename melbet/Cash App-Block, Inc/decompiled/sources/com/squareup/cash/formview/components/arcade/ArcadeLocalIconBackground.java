package com.squareup.cash.formview.components.arcade;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ArcadeLocalIconBackground {
    public static final /* synthetic */ ArcadeLocalIconBackground[] $VALUES;
    public static final ArcadeLocalIconBackground BRAND;
    public static final ArcadeLocalIconBackground DANGER;
    public static final ArcadeLocalIconBackground STANDARD;

    static {
        ArcadeLocalIconBackground arcadeLocalIconBackground = new ArcadeLocalIconBackground("BRAND", 0);
        BRAND = arcadeLocalIconBackground;
        ArcadeLocalIconBackground arcadeLocalIconBackground2 = new ArcadeLocalIconBackground("DANGER", 1);
        DANGER = arcadeLocalIconBackground2;
        ArcadeLocalIconBackground arcadeLocalIconBackground3 = new ArcadeLocalIconBackground("SUBTLE", 2);
        ArcadeLocalIconBackground arcadeLocalIconBackground4 = new ArcadeLocalIconBackground("STANDARD", 3);
        STANDARD = arcadeLocalIconBackground4;
        $VALUES = new ArcadeLocalIconBackground[]{arcadeLocalIconBackground, arcadeLocalIconBackground2, arcadeLocalIconBackground3, arcadeLocalIconBackground4};
    }

    public static ArcadeLocalIconBackground valueOf(String str) {
        return (ArcadeLocalIconBackground) Enum.valueOf(ArcadeLocalIconBackground.class, str);
    }

    public static ArcadeLocalIconBackground[] values() {
        return (ArcadeLocalIconBackground[]) $VALUES.clone();
    }
}
