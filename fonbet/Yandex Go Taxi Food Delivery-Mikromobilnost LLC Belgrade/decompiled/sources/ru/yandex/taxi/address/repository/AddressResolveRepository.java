package ru.yandex.taxi.address.repository;

import defpackage.bvf0;
import defpackage.k4o;
import defpackage.qv10;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class AddressResolveRepository {
    public final r0 a = bvf0.c(State.LOADED);
    public final r0 b = bvf0.c(Boolean.FALSE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "", "UNSUPPORTED", "WAITING", "LOADING", "ERROR", "LOADED", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State LOADED;
        public static final State LOADING;
        public static final State UNSUPPORTED;
        public static final State WAITING;

        static {
            State state = new State("UNSUPPORTED", 0);
            UNSUPPORTED = state;
            State state2 = new State("WAITING", 1);
            WAITING = state2;
            State state3 = new State("LOADING", 2);
            LOADING = state3;
            State state4 = new State("ERROR", 3);
            ERROR = state4;
            State state5 = new State("LOADED", 4);
            LOADED = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
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

    public final void a(boolean z) {
        qv10.B(z, this.b, null);
    }

    public final void b(State state) {
        this.a.l(state);
    }
}
