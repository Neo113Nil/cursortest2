package com.squareup.cash.arcade.components.titlebar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NavigationType {
    public static final /* synthetic */ NavigationType[] $VALUES;
    public static final NavigationType BACK;
    public static final NavigationType CLOSE;
    public static final NavigationType NONE;

    static {
        NavigationType navigationType = new NavigationType("BACK", 0);
        BACK = navigationType;
        NavigationType navigationType2 = new NavigationType("CLOSE", 1);
        CLOSE = navigationType2;
        NavigationType navigationType3 = new NavigationType("NONE", 2);
        NONE = navigationType3;
        $VALUES = new NavigationType[]{navigationType, navigationType2, navigationType3};
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) $VALUES.clone();
    }
}
