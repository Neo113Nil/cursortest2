package com.squareup.cash.appforeground;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppForegroundState {
    public static final /* synthetic */ AppForegroundState[] $VALUES;
    public static final AppForegroundState BACKGROUND;
    public static final AppForegroundState FOREGROUND;

    static {
        AppForegroundState appForegroundState = new AppForegroundState("FOREGROUND", 0);
        FOREGROUND = appForegroundState;
        AppForegroundState appForegroundState2 = new AppForegroundState("BACKGROUND", 1);
        BACKGROUND = appForegroundState2;
        $VALUES = new AppForegroundState[]{appForegroundState, appForegroundState2};
    }

    public static AppForegroundState valueOf(String str) {
        return (AppForegroundState) Enum.valueOf(AppForegroundState.class, str);
    }

    public static AppForegroundState[] values() {
        return (AppForegroundState[]) $VALUES.clone();
    }
}
