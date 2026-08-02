package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ChatContentState {
    public static final /* synthetic */ ChatContentState[] $VALUES;
    public static final ChatContentState CHAT_FEED;
    public static final ChatContentState EMPTY;

    /* JADX INFO: Fake field, exist only in values array */
    ChatContentState EF0;

    static {
        ChatContentState chatContentState = new ChatContentState("LOADING", 0);
        ChatContentState chatContentState2 = new ChatContentState("EMPTY", 1);
        EMPTY = chatContentState2;
        ChatContentState chatContentState3 = new ChatContentState("CHAT_FEED", 2);
        CHAT_FEED = chatContentState3;
        $VALUES = new ChatContentState[]{chatContentState, chatContentState2, chatContentState3};
    }

    public static ChatContentState valueOf(String str) {
        return (ChatContentState) Enum.valueOf(ChatContentState.class, str);
    }

    public static ChatContentState[] values() {
        return (ChatContentState[]) $VALUES.clone();
    }
}
