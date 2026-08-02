package com.squareup.cash.data.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BadgeSpacing {
    public static final /* synthetic */ BadgeSpacing[] $VALUES = {new BadgeSpacing("SMALL", 0), new BadgeSpacing("MEDIUM", 1), new BadgeSpacing("LARGE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BadgeSpacing EF5;

    public static BadgeSpacing valueOf(String str) {
        return (BadgeSpacing) Enum.valueOf(BadgeSpacing.class, str);
    }

    public static BadgeSpacing[] values() {
        return (BadgeSpacing[]) $VALUES.clone();
    }
}
