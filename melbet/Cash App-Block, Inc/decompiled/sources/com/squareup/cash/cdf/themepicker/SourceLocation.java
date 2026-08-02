package com.squareup.cash.cdf.themepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SourceLocation {
    public static final /* synthetic */ SourceLocation[] $VALUES;
    public static final SourceLocation DEEP_LINK;
    public static final SourceLocation PROFILE;

    static {
        SourceLocation sourceLocation = new SourceLocation("DEEP_LINK", 0);
        DEEP_LINK = sourceLocation;
        SourceLocation sourceLocation2 = new SourceLocation("PROFILE", 1);
        PROFILE = sourceLocation2;
        $VALUES = new SourceLocation[]{sourceLocation, sourceLocation2};
    }

    public static SourceLocation valueOf(String str) {
        return (SourceLocation) Enum.valueOf(SourceLocation.class, str);
    }

    public static SourceLocation[] values() {
        return (SourceLocation[]) $VALUES.clone();
    }
}
