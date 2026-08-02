package com.squareup.cash.cdf.customersupport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ChatMessageSender {
    public static final /* synthetic */ ChatMessageSender[] $VALUES;
    public static final ChatMessageSender ADVOCATE;
    public static final ChatMessageSender BOT;

    static {
        ChatMessageSender chatMessageSender = new ChatMessageSender("ADVOCATE", 0);
        ADVOCATE = chatMessageSender;
        ChatMessageSender chatMessageSender2 = new ChatMessageSender("BOT", 1);
        BOT = chatMessageSender2;
        $VALUES = new ChatMessageSender[]{chatMessageSender, chatMessageSender2};
    }

    public static ChatMessageSender valueOf(String str) {
        return (ChatMessageSender) Enum.valueOf(ChatMessageSender.class, str);
    }

    public static ChatMessageSender[] values() {
        return (ChatMessageSender[]) $VALUES.clone();
    }
}
