package com.squareup.cash.moneybot.widgets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ComposerInputStatus {
    public static final /* synthetic */ ComposerInputStatus[] $VALUES;
    public static final ComposerInputStatus ACTIVE;
    public static final ComposerInputStatus READY;

    static {
        ComposerInputStatus composerInputStatus = new ComposerInputStatus("READY", 0);
        READY = composerInputStatus;
        ComposerInputStatus composerInputStatus2 = new ComposerInputStatus("ACTIVE", 1);
        ACTIVE = composerInputStatus2;
        $VALUES = new ComposerInputStatus[]{composerInputStatus, composerInputStatus2};
    }

    public static ComposerInputStatus valueOf(String str) {
        return (ComposerInputStatus) Enum.valueOf(ComposerInputStatus.class, str);
    }

    public static ComposerInputStatus[] values() {
        return (ComposerInputStatus[]) $VALUES.clone();
    }
}
