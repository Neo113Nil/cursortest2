package com.squareup.cash.initialscreenloader.backend.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AppProcessInfo$ActivityEvent {
    public static final /* synthetic */ AppProcessInfo$ActivityEvent[] $VALUES;
    public static final AppProcessInfo$ActivityEvent DESTROYED;
    public static final AppProcessInfo$ActivityEvent POST_CREATED_HAS_STATE;
    public static final AppProcessInfo$ActivityEvent PRE_CREATED_NO_STATE;

    static {
        AppProcessInfo$ActivityEvent appProcessInfo$ActivityEvent = new AppProcessInfo$ActivityEvent("PRE_CREATED_NO_STATE", 0);
        PRE_CREATED_NO_STATE = appProcessInfo$ActivityEvent;
        AppProcessInfo$ActivityEvent appProcessInfo$ActivityEvent2 = new AppProcessInfo$ActivityEvent("POST_CREATED_HAS_STATE", 1);
        POST_CREATED_HAS_STATE = appProcessInfo$ActivityEvent2;
        AppProcessInfo$ActivityEvent appProcessInfo$ActivityEvent3 = new AppProcessInfo$ActivityEvent("DESTROYED", 2);
        DESTROYED = appProcessInfo$ActivityEvent3;
        $VALUES = new AppProcessInfo$ActivityEvent[]{appProcessInfo$ActivityEvent, appProcessInfo$ActivityEvent2, appProcessInfo$ActivityEvent3};
    }

    public static AppProcessInfo$ActivityEvent valueOf(String str) {
        return (AppProcessInfo$ActivityEvent) Enum.valueOf(AppProcessInfo$ActivityEvent.class, str);
    }

    public static AppProcessInfo$ActivityEvent[] values() {
        return (AppProcessInfo$ActivityEvent[]) $VALUES.clone();
    }
}
