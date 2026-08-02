package com.squareup.cash.eligibility.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SettingVisibility {
    public static final /* synthetic */ SettingVisibility[] $VALUES;
    public static final SettingVisibility DISABLED;
    public static final SettingVisibility HIDDEN;
    public static final SettingVisibility VISIBLE;

    static {
        SettingVisibility settingVisibility = new SettingVisibility("VISIBLE", 0);
        VISIBLE = settingVisibility;
        SettingVisibility settingVisibility2 = new SettingVisibility("DISABLED", 1);
        DISABLED = settingVisibility2;
        SettingVisibility settingVisibility3 = new SettingVisibility("HIDDEN", 2);
        HIDDEN = settingVisibility3;
        $VALUES = new SettingVisibility[]{settingVisibility, settingVisibility2, settingVisibility3};
    }

    public static SettingVisibility valueOf(String str) {
        return (SettingVisibility) Enum.valueOf(SettingVisibility.class, str);
    }

    public static SettingVisibility[] values() {
        return (SettingVisibility[]) $VALUES.clone();
    }
}
