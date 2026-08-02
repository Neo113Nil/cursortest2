package com.squareup.cash.cdf.activityrecord;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmojiReactionEntryPoint {
    public static final /* synthetic */ EmojiReactionEntryPoint[] $VALUES = {new EmojiReactionEntryPoint("ACTIVITY_ITEM_BUTTON", 0), new EmojiReactionEntryPoint("RECEIPT_VIEW", 1), new EmojiReactionEntryPoint("PERSONALIZED_PAYMENT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    EmojiReactionEntryPoint EF5;

    public static EmojiReactionEntryPoint valueOf(String str) {
        return (EmojiReactionEntryPoint) Enum.valueOf(EmojiReactionEntryPoint.class, str);
    }

    public static EmojiReactionEntryPoint[] values() {
        return (EmojiReactionEntryPoint[]) $VALUES.clone();
    }
}
