package com.squareup.cash.securityhub.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SecurityEducationSupportRowId {
    public static final /* synthetic */ SecurityEducationSupportRowId[] $VALUES;
    public static final SecurityEducationSupportRowId IVE_BEEN_HACKED;
    public static final SecurityEducationSupportRowId IVE_BEEN_SCAMMED;
    public static final SecurityEducationSupportRowId REPORT_AN_ISSUE;

    static {
        SecurityEducationSupportRowId securityEducationSupportRowId = new SecurityEducationSupportRowId("IVE_BEEN_SCAMMED", 0);
        IVE_BEEN_SCAMMED = securityEducationSupportRowId;
        SecurityEducationSupportRowId securityEducationSupportRowId2 = new SecurityEducationSupportRowId("IVE_BEEN_HACKED", 1);
        IVE_BEEN_HACKED = securityEducationSupportRowId2;
        SecurityEducationSupportRowId securityEducationSupportRowId3 = new SecurityEducationSupportRowId("REPORT_AN_ISSUE", 2);
        REPORT_AN_ISSUE = securityEducationSupportRowId3;
        $VALUES = new SecurityEducationSupportRowId[]{securityEducationSupportRowId, securityEducationSupportRowId2, securityEducationSupportRowId3};
    }

    public static SecurityEducationSupportRowId valueOf(String str) {
        return (SecurityEducationSupportRowId) Enum.valueOf(SecurityEducationSupportRowId.class, str);
    }

    public static SecurityEducationSupportRowId[] values() {
        return (SecurityEducationSupportRowId[]) $VALUES.clone();
    }
}
