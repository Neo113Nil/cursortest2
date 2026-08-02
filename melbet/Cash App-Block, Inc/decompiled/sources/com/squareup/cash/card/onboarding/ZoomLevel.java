package com.squareup.cash.card.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ZoomLevel {
    public static final /* synthetic */ ZoomLevel[] $VALUES;
    public static final ZoomLevel FAR;
    public static final ZoomLevel MEDIUM;
    public static final ZoomLevel NEAR;

    static {
        ZoomLevel zoomLevel = new ZoomLevel("FAR", 0);
        FAR = zoomLevel;
        ZoomLevel zoomLevel2 = new ZoomLevel("MEDIUM", 1);
        MEDIUM = zoomLevel2;
        ZoomLevel zoomLevel3 = new ZoomLevel("NEAR", 2);
        NEAR = zoomLevel3;
        $VALUES = new ZoomLevel[]{zoomLevel, zoomLevel2, zoomLevel3};
    }

    public static ZoomLevel valueOf(String str) {
        return (ZoomLevel) Enum.valueOf(ZoomLevel.class, str);
    }

    public static ZoomLevel[] values() {
        return (ZoomLevel[]) $VALUES.clone();
    }
}
