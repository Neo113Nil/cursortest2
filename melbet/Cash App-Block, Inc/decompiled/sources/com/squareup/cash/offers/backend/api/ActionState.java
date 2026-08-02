package com.squareup.cash.offers.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ActionState {
    public static final /* synthetic */ ActionState[] $VALUES;
    public static final ActionState END_API_DONE;
    public static final ActionState END_DB_DONE;
    public static final ActionState END_TRACKING_DONE;
    public static final ActionState INITIAL;
    public static final ActionState START_API_DONE;
    public static final ActionState START_DB_DONE;
    public static final ActionState START_MAPPING_DONE;
    public static final ActionState START_TRACKING_DONE;

    static {
        ActionState actionState = new ActionState("INITIAL", 0);
        INITIAL = actionState;
        ActionState actionState2 = new ActionState("START_TRACKING_DONE", 1);
        START_TRACKING_DONE = actionState2;
        ActionState actionState3 = new ActionState("START_API_DONE", 2);
        START_API_DONE = actionState3;
        ActionState actionState4 = new ActionState("END_API_DONE", 3);
        END_API_DONE = actionState4;
        ActionState actionState5 = new ActionState("START_DB_DONE", 4);
        START_DB_DONE = actionState5;
        ActionState actionState6 = new ActionState("END_DB_DONE", 5);
        END_DB_DONE = actionState6;
        ActionState actionState7 = new ActionState("START_MAPPING_DONE", 6);
        START_MAPPING_DONE = actionState7;
        ActionState actionState8 = new ActionState("END_TRACKING_DONE", 7);
        END_TRACKING_DONE = actionState8;
        $VALUES = new ActionState[]{actionState, actionState2, actionState3, actionState4, actionState5, actionState6, actionState7, actionState8};
    }

    public static ActionState valueOf(String str) {
        return (ActionState) Enum.valueOf(ActionState.class, str);
    }

    public static ActionState[] values() {
        return (ActionState[]) $VALUES.clone();
    }
}
