package com.squareup.cash.observability.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ObservabilityExecutionContext {
    public static final /* synthetic */ ObservabilityExecutionContext[] $VALUES;
    public static final ObservabilityExecutionContext CUSTOMER;
    public static final ObservabilityExecutionContext UI_TEST;

    static {
        ObservabilityExecutionContext observabilityExecutionContext = new ObservabilityExecutionContext("CUSTOMER", 0);
        CUSTOMER = observabilityExecutionContext;
        ObservabilityExecutionContext observabilityExecutionContext2 = new ObservabilityExecutionContext("INTERNAL_CUSTOMER", 1);
        ObservabilityExecutionContext observabilityExecutionContext3 = new ObservabilityExecutionContext("INTERNAL_TESTER", 2);
        ObservabilityExecutionContext observabilityExecutionContext4 = new ObservabilityExecutionContext("UI_TEST", 3);
        UI_TEST = observabilityExecutionContext4;
        $VALUES = new ObservabilityExecutionContext[]{observabilityExecutionContext, observabilityExecutionContext2, observabilityExecutionContext3, observabilityExecutionContext4};
    }

    public static ObservabilityExecutionContext valueOf(String str) {
        return (ObservabilityExecutionContext) Enum.valueOf(ObservabilityExecutionContext.class, str);
    }

    public static ObservabilityExecutionContext[] values() {
        return (ObservabilityExecutionContext[]) $VALUES.clone();
    }
}
