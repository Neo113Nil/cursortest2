package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FloatingChatInputStatus {
    public static final /* synthetic */ FloatingChatInputStatus[] $VALUES;
    public static final FloatingChatInputStatus ACTIVE;
    public static final FloatingChatInputStatus READY;

    static {
        FloatingChatInputStatus floatingChatInputStatus = new FloatingChatInputStatus("READY", 0);
        READY = floatingChatInputStatus;
        FloatingChatInputStatus floatingChatInputStatus2 = new FloatingChatInputStatus("ACTIVE", 1);
        ACTIVE = floatingChatInputStatus2;
        $VALUES = new FloatingChatInputStatus[]{floatingChatInputStatus, floatingChatInputStatus2, new FloatingChatInputStatus("PROCESSING", 2)};
    }

    public static FloatingChatInputStatus valueOf(String str) {
        return (FloatingChatInputStatus) Enum.valueOf(FloatingChatInputStatus.class, str);
    }

    public static FloatingChatInputStatus[] values() {
        return (FloatingChatInputStatus[]) $VALUES.clone();
    }
}
