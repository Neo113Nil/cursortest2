package ru.yandex.taxi.logistics.sdk.delivery_launch.domain;

import defpackage.bvf0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class DeliveryLaunchLoadingStateRepository {
    public final r0 a = bvf0.c(State.UNDEFINED);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/domain/DeliveryLaunchLoadingStateRepository$State;", "", "LOADING", "READY", "ERROR", "UNDEFINED", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ERROR;
        public static final State LOADING;
        public static final State READY;
        public static final State UNDEFINED;

        static {
            State state = new State("LOADING", 0);
            LOADING = state;
            State state2 = new State("READY", 1);
            READY = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State state4 = new State("UNDEFINED", 3);
            UNDEFINED = state4;
            State[] stateArr = {state, state2, state3, state4};
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
