package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ComposerSharedElementKey {
    public static final /* synthetic */ ComposerSharedElementKey[] $VALUES;
    public static final ComposerSharedElementKey Background;
    public static final ComposerSharedElementKey Bounds;
    public static final ComposerSharedElementKey SendButton;
    public static final ComposerSharedElementKey TextInput;

    static {
        ComposerSharedElementKey composerSharedElementKey = new ComposerSharedElementKey("Bounds", 0);
        Bounds = composerSharedElementKey;
        ComposerSharedElementKey composerSharedElementKey2 = new ComposerSharedElementKey("Background", 1);
        Background = composerSharedElementKey2;
        ComposerSharedElementKey composerSharedElementKey3 = new ComposerSharedElementKey("SendButton", 2);
        SendButton = composerSharedElementKey3;
        ComposerSharedElementKey composerSharedElementKey4 = new ComposerSharedElementKey("TextInput", 3);
        TextInput = composerSharedElementKey4;
        $VALUES = new ComposerSharedElementKey[]{composerSharedElementKey, composerSharedElementKey2, composerSharedElementKey3, composerSharedElementKey4};
    }

    public static ComposerSharedElementKey valueOf(String str) {
        return (ComposerSharedElementKey) Enum.valueOf(ComposerSharedElementKey.class, str);
    }

    public static ComposerSharedElementKey[] values() {
        return (ComposerSharedElementKey[]) $VALUES.clone();
    }
}
