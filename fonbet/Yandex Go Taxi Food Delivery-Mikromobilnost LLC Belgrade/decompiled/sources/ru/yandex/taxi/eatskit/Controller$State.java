package ru.yandex.taxi.eatskit;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/eatskit/Controller$State", "", "Lru/yandex/taxi/eatskit/Controller$State;", "INITIAL", "LOADING", "ERROR", Card.ACTIVE, "NO_AUTH", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Controller$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Controller$State[] $VALUES;
    public static final Controller$State ACTIVE;
    public static final Controller$State ERROR;
    public static final Controller$State INITIAL;
    public static final Controller$State LOADING;
    public static final Controller$State NO_AUTH;

    static {
        Controller$State controller$State = new Controller$State("INITIAL", 0);
        INITIAL = controller$State;
        Controller$State controller$State2 = new Controller$State("LOADING", 1);
        LOADING = controller$State2;
        Controller$State controller$State3 = new Controller$State("ERROR", 2);
        ERROR = controller$State3;
        Controller$State controller$State4 = new Controller$State(Card.ACTIVE, 3);
        ACTIVE = controller$State4;
        Controller$State controller$State5 = new Controller$State("NO_AUTH", 4);
        NO_AUTH = controller$State5;
        Controller$State[] controller$StateArr = {controller$State, controller$State2, controller$State3, controller$State4, controller$State5};
        $VALUES = controller$StateArr;
        $ENTRIES = kotlin.enums.a.a(controller$StateArr);
    }

    public static Controller$State valueOf(String str) {
        return (Controller$State) Enum.valueOf(Controller$State.class, str);
    }

    public static Controller$State[] values() {
        return (Controller$State[]) $VALUES.clone();
    }
}
