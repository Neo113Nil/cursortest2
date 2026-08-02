package com.squareup.cash.cdf.customersupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ChatBotStatus {
    public static final /* synthetic */ ChatBotStatus[] $VALUES;
    public static final ChatBotStatus ACTIVE;
    public static final ChatBotStatus HANDED_OVER;
    public static final ChatBotStatus READY;

    static {
        ChatBotStatus chatBotStatus = new ChatBotStatus("READY", 0);
        READY = chatBotStatus;
        ChatBotStatus chatBotStatus2 = new ChatBotStatus("ACTIVE", 1);
        ACTIVE = chatBotStatus2;
        ChatBotStatus chatBotStatus3 = new ChatBotStatus("HANDED_OVER", 2);
        HANDED_OVER = chatBotStatus3;
        $VALUES = new ChatBotStatus[]{chatBotStatus, chatBotStatus2, chatBotStatus3};
    }

    public static ChatBotStatus valueOf(String str) {
        return (ChatBotStatus) Enum.valueOf(ChatBotStatus.class, str);
    }

    public static ChatBotStatus[] values() {
        return (ChatBotStatus[]) $VALUES.clone();
    }
}
