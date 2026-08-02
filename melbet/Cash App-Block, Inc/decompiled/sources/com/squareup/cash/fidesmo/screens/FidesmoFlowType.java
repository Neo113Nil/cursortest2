package com.squareup.cash.fidesmo.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FidesmoFlowType {
    public static final /* synthetic */ FidesmoFlowType[] $VALUES;
    public static final FidesmoFlowType DEPROVISION;
    public static final FidesmoFlowType PROVISION;

    static {
        FidesmoFlowType fidesmoFlowType = new FidesmoFlowType("PROVISION", 0);
        PROVISION = fidesmoFlowType;
        FidesmoFlowType fidesmoFlowType2 = new FidesmoFlowType("DEPROVISION", 1);
        DEPROVISION = fidesmoFlowType2;
        $VALUES = new FidesmoFlowType[]{fidesmoFlowType, fidesmoFlowType2};
    }

    public static FidesmoFlowType valueOf(String str) {
        return (FidesmoFlowType) Enum.valueOf(FidesmoFlowType.class, str);
    }

    public static FidesmoFlowType[] values() {
        return (FidesmoFlowType[]) $VALUES.clone();
    }
}
