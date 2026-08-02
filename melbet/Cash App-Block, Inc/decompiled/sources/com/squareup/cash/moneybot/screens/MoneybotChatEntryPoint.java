package com.squareup.cash.moneybot.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneybotChatEntryPoint {
    public static final /* synthetic */ MoneybotChatEntryPoint[] $VALUES;
    public static final MoneybotChatEntryPoint DEEP_LINK;
    public static final MoneybotChatEntryPoint HISTORY;
    public static final MoneybotChatEntryPoint IN_APP_MESSAGE;
    public static final MoneybotChatEntryPoint MONEY;
    public static final MoneybotChatEntryPoint MONEYBOT_HOME;
    public static final MoneybotChatEntryPoint NEW_CHAT;
    public static final MoneybotChatEntryPoint NULL_STATE;
    public static final MoneybotChatEntryPoint PUSH_NOTIFICATION;

    static {
        MoneybotChatEntryPoint moneybotChatEntryPoint = new MoneybotChatEntryPoint("MONEY", 0);
        MONEY = moneybotChatEntryPoint;
        MoneybotChatEntryPoint moneybotChatEntryPoint2 = new MoneybotChatEntryPoint("MONEYBOT_HOME", 1);
        MONEYBOT_HOME = moneybotChatEntryPoint2;
        MoneybotChatEntryPoint moneybotChatEntryPoint3 = new MoneybotChatEntryPoint("HISTORY", 2);
        HISTORY = moneybotChatEntryPoint3;
        MoneybotChatEntryPoint moneybotChatEntryPoint4 = new MoneybotChatEntryPoint("NULL_STATE", 3);
        NULL_STATE = moneybotChatEntryPoint4;
        MoneybotChatEntryPoint moneybotChatEntryPoint5 = new MoneybotChatEntryPoint("NEW_CHAT", 4);
        NEW_CHAT = moneybotChatEntryPoint5;
        MoneybotChatEntryPoint moneybotChatEntryPoint6 = new MoneybotChatEntryPoint("PUSH_NOTIFICATION", 5);
        PUSH_NOTIFICATION = moneybotChatEntryPoint6;
        MoneybotChatEntryPoint moneybotChatEntryPoint7 = new MoneybotChatEntryPoint("IN_APP_MESSAGE", 6);
        IN_APP_MESSAGE = moneybotChatEntryPoint7;
        MoneybotChatEntryPoint moneybotChatEntryPoint8 = new MoneybotChatEntryPoint("DEEP_LINK", 7);
        DEEP_LINK = moneybotChatEntryPoint8;
        $VALUES = new MoneybotChatEntryPoint[]{moneybotChatEntryPoint, moneybotChatEntryPoint2, moneybotChatEntryPoint3, moneybotChatEntryPoint4, moneybotChatEntryPoint5, moneybotChatEntryPoint6, moneybotChatEntryPoint7, moneybotChatEntryPoint8};
    }

    public static MoneybotChatEntryPoint valueOf(String str) {
        return (MoneybotChatEntryPoint) Enum.valueOf(MoneybotChatEntryPoint.class, str);
    }

    public static MoneybotChatEntryPoint[] values() {
        return (MoneybotChatEntryPoint[]) $VALUES.clone();
    }
}
