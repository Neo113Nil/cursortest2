package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StateChangeRequest {
    public static final /* synthetic */ StateChangeRequest[] $VALUES;
    public static final StateChangeRequest MatchFound;
    public static final StateChangeRequest NoRequest;
    public static final StateChangeRequest VisibleContentAbsentDuringTransition;

    static {
        StateChangeRequest stateChangeRequest = new StateChangeRequest("NoRequest", 0);
        NoRequest = stateChangeRequest;
        StateChangeRequest stateChangeRequest2 = new StateChangeRequest("MatchFound", 1);
        MatchFound = stateChangeRequest2;
        StateChangeRequest stateChangeRequest3 = new StateChangeRequest("VisibleContentAbsentDuringTransition", 2);
        VisibleContentAbsentDuringTransition = stateChangeRequest3;
        $VALUES = new StateChangeRequest[]{stateChangeRequest, stateChangeRequest2, stateChangeRequest3, new StateChangeRequest("NoMatchFound", 3)};
    }

    public static StateChangeRequest valueOf(String str) {
        return (StateChangeRequest) Enum.valueOf(StateChangeRequest.class, str);
    }

    public static StateChangeRequest[] values() {
        return (StateChangeRequest[]) $VALUES.clone();
    }
}
