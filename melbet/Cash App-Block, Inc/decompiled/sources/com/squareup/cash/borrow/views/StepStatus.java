package com.squareup.cash.borrow.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class StepStatus {
    public static final /* synthetic */ StepStatus[] $VALUES;
    public static final StepStatus COMPLETE;
    public static final StepStatus IN_PROGRESS;
    public static final StepStatus PENDING;

    static {
        StepStatus stepStatus = new StepStatus("PENDING", 0);
        PENDING = stepStatus;
        StepStatus stepStatus2 = new StepStatus("IN_PROGRESS", 1);
        IN_PROGRESS = stepStatus2;
        StepStatus stepStatus3 = new StepStatus("COMPLETE", 2);
        COMPLETE = stepStatus3;
        $VALUES = new StepStatus[]{stepStatus, stepStatus2, stepStatus3};
    }

    public static StepStatus valueOf(String str) {
        return (StepStatus) Enum.valueOf(StepStatus.class, str);
    }

    public static StepStatus[] values() {
        return (StepStatus[]) $VALUES.clone();
    }
}
