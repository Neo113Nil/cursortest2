package com.squareup.cash.cdf.giftcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SourceLocation {
    public static final /* synthetic */ SourceLocation[] $VALUES;
    public static final SourceLocation DEEP_LINK;
    public static final SourceLocation DISCOVER;
    public static final SourceLocation PAYMENT_PAD;

    static {
        SourceLocation sourceLocation = new SourceLocation("PAYMENT_PAD", 0);
        PAYMENT_PAD = sourceLocation;
        SourceLocation sourceLocation2 = new SourceLocation("DISCOVER", 1);
        DISCOVER = sourceLocation2;
        SourceLocation sourceLocation3 = new SourceLocation("DEEP_LINK", 2);
        DEEP_LINK = sourceLocation3;
        $VALUES = new SourceLocation[]{sourceLocation, sourceLocation2, sourceLocation3};
    }

    public static SourceLocation valueOf(String str) {
        return (SourceLocation) Enum.valueOf(SourceLocation.class, str);
    }

    public static SourceLocation[] values() {
        return (SourceLocation[]) $VALUES.clone();
    }
}
