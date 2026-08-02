package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ComposerState {
    public static final /* synthetic */ ComposerState[] $VALUES;
    public static final ComposerState COLLAPSED;
    public static final ComposerState EXPANDED;

    static {
        ComposerState composerState = new ComposerState("COLLAPSED", 0);
        COLLAPSED = composerState;
        ComposerState composerState2 = new ComposerState("EXPANDED", 1);
        EXPANDED = composerState2;
        $VALUES = new ComposerState[]{composerState, composerState2};
    }

    public static ComposerState valueOf(String str) {
        return (ComposerState) Enum.valueOf(ComposerState.class, str);
    }

    public static ComposerState[] values() {
        return (ComposerState[]) $VALUES.clone();
    }
}
