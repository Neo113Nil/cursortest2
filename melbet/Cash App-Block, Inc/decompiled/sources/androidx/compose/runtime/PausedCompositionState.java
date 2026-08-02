package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PausedCompositionState {
    public static final /* synthetic */ PausedCompositionState[] $VALUES;
    public static final PausedCompositionState Applied;
    public static final PausedCompositionState ApplyPending;
    public static final PausedCompositionState Cancelled;
    public static final PausedCompositionState InitialPending;
    public static final PausedCompositionState Invalid;
    public static final PausedCompositionState RecomposePending;
    public static final PausedCompositionState Recomposing;

    static {
        PausedCompositionState pausedCompositionState = new PausedCompositionState("Invalid", 0);
        Invalid = pausedCompositionState;
        PausedCompositionState pausedCompositionState2 = new PausedCompositionState("Cancelled", 1);
        Cancelled = pausedCompositionState2;
        PausedCompositionState pausedCompositionState3 = new PausedCompositionState("InitialPending", 2);
        InitialPending = pausedCompositionState3;
        PausedCompositionState pausedCompositionState4 = new PausedCompositionState("RecomposePending", 3);
        RecomposePending = pausedCompositionState4;
        PausedCompositionState pausedCompositionState5 = new PausedCompositionState("Recomposing", 4);
        Recomposing = pausedCompositionState5;
        PausedCompositionState pausedCompositionState6 = new PausedCompositionState("ApplyPending", 5);
        ApplyPending = pausedCompositionState6;
        PausedCompositionState pausedCompositionState7 = new PausedCompositionState("Applied", 6);
        Applied = pausedCompositionState7;
        $VALUES = new PausedCompositionState[]{pausedCompositionState, pausedCompositionState2, pausedCompositionState3, pausedCompositionState4, pausedCompositionState5, pausedCompositionState6, pausedCompositionState7};
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) $VALUES.clone();
    }
}
