package com.squareup.cash.bugreporting.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DiagnosticAttachment {
    public static final /* synthetic */ DiagnosticAttachment[] $VALUES;
    public static final DiagnosticAttachment BackStack;
    public static final DiagnosticAttachment Database;
    public static final DiagnosticAttachment DebugPreferences;
    public static final DiagnosticAttachment Logs;
    public static final DiagnosticAttachment Preferences;
    public static final DiagnosticAttachment SamEligibility;
    public static final DiagnosticAttachment ViewHierarchy;

    static {
        DiagnosticAttachment diagnosticAttachment = new DiagnosticAttachment("ViewHierarchy", 0);
        ViewHierarchy = diagnosticAttachment;
        DiagnosticAttachment diagnosticAttachment2 = new DiagnosticAttachment("BackStack", 1);
        BackStack = diagnosticAttachment2;
        DiagnosticAttachment diagnosticAttachment3 = new DiagnosticAttachment("Logs", 2);
        Logs = diagnosticAttachment3;
        DiagnosticAttachment diagnosticAttachment4 = new DiagnosticAttachment("Database", 3);
        Database = diagnosticAttachment4;
        DiagnosticAttachment diagnosticAttachment5 = new DiagnosticAttachment("Preferences", 4);
        Preferences = diagnosticAttachment5;
        DiagnosticAttachment diagnosticAttachment6 = new DiagnosticAttachment("DebugPreferences", 5);
        DebugPreferences = diagnosticAttachment6;
        DiagnosticAttachment diagnosticAttachment7 = new DiagnosticAttachment("SamEligibility", 6);
        SamEligibility = diagnosticAttachment7;
        $VALUES = new DiagnosticAttachment[]{diagnosticAttachment, diagnosticAttachment2, diagnosticAttachment3, diagnosticAttachment4, diagnosticAttachment5, diagnosticAttachment6, diagnosticAttachment7};
    }

    public static DiagnosticAttachment valueOf(String str) {
        return (DiagnosticAttachment) Enum.valueOf(DiagnosticAttachment.class, str);
    }

    public static DiagnosticAttachment[] values() {
        return (DiagnosticAttachment[]) $VALUES.clone();
    }
}
