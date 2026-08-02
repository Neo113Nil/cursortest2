package com.squareup.cash.cdf.cashappscore;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppletState {
    public static final /* synthetic */ AppletState[] $VALUES;
    public static final AppletState INSTALLED;
    public static final AppletState UNINSTALLED;

    static {
        AppletState appletState = new AppletState("INSTALLED", 0);
        INSTALLED = appletState;
        AppletState appletState2 = new AppletState("UNINSTALLED", 1);
        UNINSTALLED = appletState2;
        $VALUES = new AppletState[]{appletState, appletState2};
    }

    public static AppletState valueOf(String str) {
        return (AppletState) Enum.valueOf(AppletState.class, str);
    }

    public static AppletState[] values() {
        return (AppletState[]) $VALUES.clone();
    }
}
