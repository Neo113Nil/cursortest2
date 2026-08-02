package just.adapter.snapping;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"just/adapter/snapping/SnappingCallbacksHelper$State", "", "Ljust/adapter/snapping/SnappingCallbacksHelper$State;", "IN_PROCESS", "ENDED", "TERMINAL", "just-adapter-snapping_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SnappingCallbacksHelper$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SnappingCallbacksHelper$State[] $VALUES;
    public static final SnappingCallbacksHelper$State ENDED;
    public static final SnappingCallbacksHelper$State IN_PROCESS;
    public static final SnappingCallbacksHelper$State TERMINAL;

    static {
        SnappingCallbacksHelper$State snappingCallbacksHelper$State = new SnappingCallbacksHelper$State("IN_PROCESS", 0);
        IN_PROCESS = snappingCallbacksHelper$State;
        SnappingCallbacksHelper$State snappingCallbacksHelper$State2 = new SnappingCallbacksHelper$State("ENDED", 1);
        ENDED = snappingCallbacksHelper$State2;
        SnappingCallbacksHelper$State snappingCallbacksHelper$State3 = new SnappingCallbacksHelper$State("TERMINAL", 2);
        TERMINAL = snappingCallbacksHelper$State3;
        SnappingCallbacksHelper$State[] snappingCallbacksHelper$StateArr = {snappingCallbacksHelper$State, snappingCallbacksHelper$State2, snappingCallbacksHelper$State3};
        $VALUES = snappingCallbacksHelper$StateArr;
        $ENTRIES = kotlin.enums.a.a(snappingCallbacksHelper$StateArr);
    }

    public static SnappingCallbacksHelper$State valueOf(String str) {
        return (SnappingCallbacksHelper$State) Enum.valueOf(SnappingCallbacksHelper$State.class, str);
    }

    public static SnappingCallbacksHelper$State[] values() {
        return (SnappingCallbacksHelper$State[]) $VALUES.clone();
    }
}
