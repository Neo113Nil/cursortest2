package com.squareup.cash.moneybot.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneybotDebugOverlayState {
    public static final /* synthetic */ MoneybotDebugOverlayState[] $VALUES;
    public static final MoneybotDebugOverlayState Main;
    public static final MoneybotDebugOverlayState OpenChatSessionDialog;
    public static final MoneybotDebugOverlayState TokenUsage;

    static {
        MoneybotDebugOverlayState moneybotDebugOverlayState = new MoneybotDebugOverlayState("Main", 0);
        Main = moneybotDebugOverlayState;
        MoneybotDebugOverlayState moneybotDebugOverlayState2 = new MoneybotDebugOverlayState("TokenUsage", 1);
        TokenUsage = moneybotDebugOverlayState2;
        MoneybotDebugOverlayState moneybotDebugOverlayState3 = new MoneybotDebugOverlayState("OpenChatSessionDialog", 2);
        OpenChatSessionDialog = moneybotDebugOverlayState3;
        $VALUES = new MoneybotDebugOverlayState[]{moneybotDebugOverlayState, moneybotDebugOverlayState2, moneybotDebugOverlayState3};
    }

    public static MoneybotDebugOverlayState valueOf(String str) {
        return (MoneybotDebugOverlayState) Enum.valueOf(MoneybotDebugOverlayState.class, str);
    }

    public static MoneybotDebugOverlayState[] values() {
        return (MoneybotDebugOverlayState[]) $VALUES.clone();
    }
}
