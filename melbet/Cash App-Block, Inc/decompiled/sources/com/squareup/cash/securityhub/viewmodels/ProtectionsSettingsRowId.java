package com.squareup.cash.securityhub.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProtectionsSettingsRowId {
    public static final /* synthetic */ ProtectionsSettingsRowId[] $VALUES;
    public static final ProtectionsSettingsRowId NOTIFICATIONS;
    public static final ProtectionsSettingsRowId PERSONAL_INFO;
    public static final ProtectionsSettingsRowId PRIVACY;
    public static final ProtectionsSettingsRowId SECURITY;

    static {
        ProtectionsSettingsRowId protectionsSettingsRowId = new ProtectionsSettingsRowId("SECURITY", 0);
        SECURITY = protectionsSettingsRowId;
        ProtectionsSettingsRowId protectionsSettingsRowId2 = new ProtectionsSettingsRowId("PRIVACY", 1);
        PRIVACY = protectionsSettingsRowId2;
        ProtectionsSettingsRowId protectionsSettingsRowId3 = new ProtectionsSettingsRowId("NOTIFICATIONS", 2);
        NOTIFICATIONS = protectionsSettingsRowId3;
        ProtectionsSettingsRowId protectionsSettingsRowId4 = new ProtectionsSettingsRowId("PERSONAL_INFO", 3);
        PERSONAL_INFO = protectionsSettingsRowId4;
        $VALUES = new ProtectionsSettingsRowId[]{protectionsSettingsRowId, protectionsSettingsRowId2, protectionsSettingsRowId3, protectionsSettingsRowId4};
    }

    public static ProtectionsSettingsRowId valueOf(String str) {
        return (ProtectionsSettingsRowId) Enum.valueOf(ProtectionsSettingsRowId.class, str);
    }

    public static ProtectionsSettingsRowId[] values() {
        return (ProtectionsSettingsRowId[]) $VALUES.clone();
    }
}
