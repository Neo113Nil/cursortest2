package com.squareup.cash.db.contacts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AliasSyncState {
    public static final /* synthetic */ AliasSyncState[] $VALUES;
    public static final AliasSyncState NEW;
    public static final AliasSyncState REMOVED;
    public static final AliasSyncState SYNCED;

    static {
        AliasSyncState aliasSyncState = new AliasSyncState("SYNCED", 0);
        SYNCED = aliasSyncState;
        AliasSyncState aliasSyncState2 = new AliasSyncState("NEW", 1);
        NEW = aliasSyncState2;
        AliasSyncState aliasSyncState3 = new AliasSyncState("REMOVED", 2);
        REMOVED = aliasSyncState3;
        $VALUES = new AliasSyncState[]{aliasSyncState, aliasSyncState2, aliasSyncState3};
    }

    public static AliasSyncState valueOf(String str) {
        return (AliasSyncState) Enum.valueOf(AliasSyncState.class, str);
    }

    public static AliasSyncState[] values() {
        return (AliasSyncState[]) $VALUES.clone();
    }
}
