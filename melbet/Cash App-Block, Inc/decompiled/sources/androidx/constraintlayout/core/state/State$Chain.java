package androidx.constraintlayout.core.state;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class State$Chain {
    public static final /* synthetic */ State$Chain[] $VALUES;
    public static final State$Chain PACKED;
    public static final State$Chain SPREAD;
    public static final State$Chain SPREAD_INSIDE;
    public static final HashMap valueMap;

    static {
        State$Chain state$Chain = new State$Chain("SPREAD", 0);
        SPREAD = state$Chain;
        State$Chain state$Chain2 = new State$Chain("SPREAD_INSIDE", 1);
        SPREAD_INSIDE = state$Chain2;
        State$Chain state$Chain3 = new State$Chain("PACKED", 2);
        PACKED = state$Chain3;
        $VALUES = new State$Chain[]{state$Chain, state$Chain2, state$Chain3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        valueMap = hashMap2;
        hashMap.put("packed", state$Chain3);
        hashMap.put("spread_inside", state$Chain2);
        hashMap.put("spread", state$Chain);
        Fragment$5$$ExternalSyntheticOutline0.m(2, hashMap2, "packed", 1, "spread_inside");
        hashMap2.put("spread", 0);
    }

    public static int getValueByString(String str) {
        HashMap hashMap = valueMap;
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        return -1;
    }

    public static State$Chain valueOf(String str) {
        return (State$Chain) Enum.valueOf(State$Chain.class, str);
    }

    public static State$Chain[] values() {
        return (State$Chain[]) $VALUES.clone();
    }
}
