package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ExecutionSequencer$RunningState {
    public static final /* synthetic */ ExecutionSequencer$RunningState[] $VALUES;
    public static final ExecutionSequencer$RunningState CANCELLED;
    public static final ExecutionSequencer$RunningState NOT_RUN;
    public static final ExecutionSequencer$RunningState STARTED;

    static {
        ExecutionSequencer$RunningState executionSequencer$RunningState = new ExecutionSequencer$RunningState("NOT_RUN", 0);
        NOT_RUN = executionSequencer$RunningState;
        ExecutionSequencer$RunningState executionSequencer$RunningState2 = new ExecutionSequencer$RunningState("CANCELLED", 1);
        CANCELLED = executionSequencer$RunningState2;
        ExecutionSequencer$RunningState executionSequencer$RunningState3 = new ExecutionSequencer$RunningState("STARTED", 2);
        STARTED = executionSequencer$RunningState3;
        $VALUES = new ExecutionSequencer$RunningState[]{executionSequencer$RunningState, executionSequencer$RunningState2, executionSequencer$RunningState3};
    }

    public static ExecutionSequencer$RunningState valueOf(String str) {
        return (ExecutionSequencer$RunningState) Enum.valueOf(ExecutionSequencer$RunningState.class, str);
    }

    public static ExecutionSequencer$RunningState[] values() {
        return (ExecutionSequencer$RunningState[]) $VALUES.clone();
    }
}
