package com.squareup.cash.shopping.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ActionType {
    public static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType DISMISS;
    public static final ActionType URL;

    static {
        ActionType actionType = new ActionType("DISMISS", 0);
        DISMISS = actionType;
        ActionType actionType2 = new ActionType("URL", 1);
        URL = actionType2;
        $VALUES = new ActionType[]{actionType, actionType2};
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
