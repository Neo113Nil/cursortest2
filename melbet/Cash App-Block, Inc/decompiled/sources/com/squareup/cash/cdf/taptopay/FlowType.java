package com.squareup.cash.cdf.taptopay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FlowType {
    public static final /* synthetic */ FlowType[] $VALUES;
    public static final FlowType DEMO_PAYMENT;
    public static final FlowType ONBOARDING;
    public static final FlowType PAYMENT;

    static {
        FlowType flowType = new FlowType("ONBOARDING", 0);
        ONBOARDING = flowType;
        FlowType flowType2 = new FlowType("PAYMENT", 1);
        PAYMENT = flowType2;
        FlowType flowType3 = new FlowType("DEMO_PAYMENT", 2);
        DEMO_PAYMENT = flowType3;
        $VALUES = new FlowType[]{flowType, flowType2, flowType3};
    }

    public static FlowType valueOf(String str) {
        return (FlowType) Enum.valueOf(FlowType.class, str);
    }

    public static FlowType[] values() {
        return (FlowType[]) $VALUES.clone();
    }
}
