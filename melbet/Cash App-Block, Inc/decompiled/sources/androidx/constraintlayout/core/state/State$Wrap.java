package androidx.constraintlayout.core.state;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class State$Wrap {
    public static final /* synthetic */ State$Wrap[] $VALUES;
    public static final HashMap valueMap;

    /* JADX INFO: Fake field, exist only in values array */
    State$Wrap EF0;

    static {
        State$Wrap state$Wrap = new State$Wrap("NONE", 0);
        State$Wrap state$Wrap2 = new State$Wrap("CHAIN", 1);
        State$Wrap state$Wrap3 = new State$Wrap("ALIGNED", 2);
        $VALUES = new State$Wrap[]{state$Wrap, state$Wrap2, state$Wrap3};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        valueMap = hashMap2;
        hashMap.put("none", state$Wrap);
        hashMap.put("chain", state$Wrap2);
        hashMap.put("aligned", state$Wrap3);
        Fragment$5$$ExternalSyntheticOutline0.m(0, hashMap2, "none", 3, "chain");
        hashMap2.put("aligned", 2);
    }

    public static State$Wrap valueOf(String str) {
        return (State$Wrap) Enum.valueOf(State$Wrap.class, str);
    }

    public static State$Wrap[] values() {
        return (State$Wrap[]) $VALUES.clone();
    }
}
