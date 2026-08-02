package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.pin;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.k4o;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class ScootersPinStateRepository {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final r0 b = bvf0.c(State.LOADED);
    public final r0 c = bvf0.c(Boolean.FALSE);
    public final r0 d = bvf0.c(Boolean.TRUE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/pin/ScootersPinStateRepository$State;", "", "LOADED", "LOADING", "ERROR", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State LOADED;
        public static final State LOADING;

        static {
            State state = new State("LOADED", 0);
            LOADED = state;
            State state2 = new State("LOADING", 1);
            LOADING = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State[] stateArr = {state, state2, state3};
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
}
