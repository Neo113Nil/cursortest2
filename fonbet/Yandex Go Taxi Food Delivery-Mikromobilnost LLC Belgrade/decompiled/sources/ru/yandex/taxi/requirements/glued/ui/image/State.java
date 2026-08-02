package ru.yandex.taxi.requirements.glued.ui.image;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/requirements/glued/ui/image/State;", "", "SHOWN", "HIDED", "glued"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;
    public static final State HIDED;
    public static final State SHOWN;

    static {
        State state = new State("SHOWN", 0);
        SHOWN = state;
        State state2 = new State("HIDED", 1);
        HIDED = state2;
        State[] stateArr = {state, state2};
        $VALUES = stateArr;
        $ENTRIES = kotlin.enums.a.a(stateArr);
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
