package com.squareup.cash.formview.components.arcade;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ArcadeLocalIconForeground {
    public static final /* synthetic */ ArcadeLocalIconForeground[] $VALUES;
    public static final ArcadeLocalIconForeground BACKGROUND_APP;
    public static final ArcadeLocalIconForeground INVERSE;

    static {
        ArcadeLocalIconForeground arcadeLocalIconForeground = new ArcadeLocalIconForeground("INVERSE", 0);
        INVERSE = arcadeLocalIconForeground;
        ArcadeLocalIconForeground arcadeLocalIconForeground2 = new ArcadeLocalIconForeground("BACKGROUND_APP", 1);
        BACKGROUND_APP = arcadeLocalIconForeground2;
        $VALUES = new ArcadeLocalIconForeground[]{arcadeLocalIconForeground, arcadeLocalIconForeground2, new ArcadeLocalIconForeground("SUBTLE", 2)};
    }

    public static ArcadeLocalIconForeground valueOf(String str) {
        return (ArcadeLocalIconForeground) Enum.valueOf(ArcadeLocalIconForeground.class, str);
    }

    public static ArcadeLocalIconForeground[] values() {
        return (ArcadeLocalIconForeground[]) $VALUES.clone();
    }
}
