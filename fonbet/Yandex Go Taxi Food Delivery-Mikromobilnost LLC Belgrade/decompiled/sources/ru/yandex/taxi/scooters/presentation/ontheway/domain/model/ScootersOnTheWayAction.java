package ru.yandex.taxi.scooters.presentation.ontheway.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/domain/model/ScootersOnTheWayAction;", "", "START", "CONTINUE", "BEEP", "PAUSE", "CANCEL", "FINISH", "ROUTE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersOnTheWayAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOnTheWayAction[] $VALUES;
    public static final ScootersOnTheWayAction BEEP;
    public static final ScootersOnTheWayAction CANCEL;
    public static final ScootersOnTheWayAction CONTINUE;
    public static final ScootersOnTheWayAction FINISH;
    public static final ScootersOnTheWayAction PAUSE;
    public static final ScootersOnTheWayAction ROUTE;
    public static final ScootersOnTheWayAction START;

    static {
        ScootersOnTheWayAction scootersOnTheWayAction = new ScootersOnTheWayAction("START", 0);
        START = scootersOnTheWayAction;
        ScootersOnTheWayAction scootersOnTheWayAction2 = new ScootersOnTheWayAction("CONTINUE", 1);
        CONTINUE = scootersOnTheWayAction2;
        ScootersOnTheWayAction scootersOnTheWayAction3 = new ScootersOnTheWayAction("BEEP", 2);
        BEEP = scootersOnTheWayAction3;
        ScootersOnTheWayAction scootersOnTheWayAction4 = new ScootersOnTheWayAction("PAUSE", 3);
        PAUSE = scootersOnTheWayAction4;
        ScootersOnTheWayAction scootersOnTheWayAction5 = new ScootersOnTheWayAction("CANCEL", 4);
        CANCEL = scootersOnTheWayAction5;
        ScootersOnTheWayAction scootersOnTheWayAction6 = new ScootersOnTheWayAction("FINISH", 5);
        FINISH = scootersOnTheWayAction6;
        ScootersOnTheWayAction scootersOnTheWayAction7 = new ScootersOnTheWayAction("ROUTE", 6);
        ROUTE = scootersOnTheWayAction7;
        ScootersOnTheWayAction[] scootersOnTheWayActionArr = {scootersOnTheWayAction, scootersOnTheWayAction2, scootersOnTheWayAction3, scootersOnTheWayAction4, scootersOnTheWayAction5, scootersOnTheWayAction6, scootersOnTheWayAction7};
        $VALUES = scootersOnTheWayActionArr;
        $ENTRIES = a.a(scootersOnTheWayActionArr);
    }

    public static ScootersOnTheWayAction valueOf(String str) {
        return (ScootersOnTheWayAction) Enum.valueOf(ScootersOnTheWayAction.class, str);
    }

    public static ScootersOnTheWayAction[] values() {
        return (ScootersOnTheWayAction[]) $VALUES.clone();
    }
}
