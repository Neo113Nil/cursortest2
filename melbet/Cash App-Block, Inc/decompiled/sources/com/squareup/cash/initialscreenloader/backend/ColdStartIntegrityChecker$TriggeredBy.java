package com.squareup.cash.initialscreenloader.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ColdStartIntegrityChecker$TriggeredBy {
    public static final /* synthetic */ ColdStartIntegrityChecker$TriggeredBy[] $VALUES;
    public static final ColdStartIntegrityChecker$TriggeredBy ACCOUNT_SWITCH;
    public static final ColdStartIntegrityChecker$TriggeredBy APP_STARTUP_SIGNED_IN;
    public static final ColdStartIntegrityChecker$TriggeredBy END_OF_ONBOARDING;

    static {
        ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy = new ColdStartIntegrityChecker$TriggeredBy("APP_STARTUP_SIGNED_IN", 0);
        APP_STARTUP_SIGNED_IN = coldStartIntegrityChecker$TriggeredBy;
        ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy2 = new ColdStartIntegrityChecker$TriggeredBy("END_OF_ONBOARDING", 1);
        END_OF_ONBOARDING = coldStartIntegrityChecker$TriggeredBy2;
        ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy3 = new ColdStartIntegrityChecker$TriggeredBy("ACCOUNT_SWITCH", 2);
        ACCOUNT_SWITCH = coldStartIntegrityChecker$TriggeredBy3;
        $VALUES = new ColdStartIntegrityChecker$TriggeredBy[]{coldStartIntegrityChecker$TriggeredBy, coldStartIntegrityChecker$TriggeredBy2, coldStartIntegrityChecker$TriggeredBy3};
    }

    public static ColdStartIntegrityChecker$TriggeredBy valueOf(String str) {
        return (ColdStartIntegrityChecker$TriggeredBy) Enum.valueOf(ColdStartIntegrityChecker$TriggeredBy.class, str);
    }

    public static ColdStartIntegrityChecker$TriggeredBy[] values() {
        return (ColdStartIntegrityChecker$TriggeredBy[]) $VALUES.clone();
    }
}
