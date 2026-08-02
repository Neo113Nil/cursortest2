package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ObservedTableStates$ObserveOp {
    public static final /* synthetic */ ObservedTableStates$ObserveOp[] $VALUES;
    public static final ObservedTableStates$ObserveOp ADD;
    public static final ObservedTableStates$ObserveOp NO_OP;
    public static final ObservedTableStates$ObserveOp REMOVE;

    static {
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp = new ObservedTableStates$ObserveOp("NO_OP", 0);
        NO_OP = observedTableStates$ObserveOp;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp2 = new ObservedTableStates$ObserveOp("ADD", 1);
        ADD = observedTableStates$ObserveOp2;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp3 = new ObservedTableStates$ObserveOp("REMOVE", 2);
        REMOVE = observedTableStates$ObserveOp3;
        $VALUES = new ObservedTableStates$ObserveOp[]{observedTableStates$ObserveOp, observedTableStates$ObserveOp2, observedTableStates$ObserveOp3};
    }

    public static ObservedTableStates$ObserveOp valueOf(String str) {
        return (ObservedTableStates$ObserveOp) Enum.valueOf(ObservedTableStates$ObserveOp.class, str);
    }

    public static ObservedTableStates$ObserveOp[] values() {
        return (ObservedTableStates$ObserveOp[]) $VALUES.clone();
    }
}
