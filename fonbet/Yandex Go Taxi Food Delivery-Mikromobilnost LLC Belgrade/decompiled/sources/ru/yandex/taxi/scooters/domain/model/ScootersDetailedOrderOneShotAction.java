package ru.yandex.taxi.scooters.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/domain/model/ScootersDetailedOrderOneShotAction;", "", "CANCEL", "FINISH", "ROUTE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderOneShotAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDetailedOrderOneShotAction[] $VALUES;
    public static final ScootersDetailedOrderOneShotAction CANCEL;
    public static final ScootersDetailedOrderOneShotAction FINISH;
    public static final ScootersDetailedOrderOneShotAction ROUTE;

    static {
        ScootersDetailedOrderOneShotAction scootersDetailedOrderOneShotAction = new ScootersDetailedOrderOneShotAction("CANCEL", 0);
        CANCEL = scootersDetailedOrderOneShotAction;
        ScootersDetailedOrderOneShotAction scootersDetailedOrderOneShotAction2 = new ScootersDetailedOrderOneShotAction("FINISH", 1);
        FINISH = scootersDetailedOrderOneShotAction2;
        ScootersDetailedOrderOneShotAction scootersDetailedOrderOneShotAction3 = new ScootersDetailedOrderOneShotAction("ROUTE", 2);
        ROUTE = scootersDetailedOrderOneShotAction3;
        ScootersDetailedOrderOneShotAction[] scootersDetailedOrderOneShotActionArr = {scootersDetailedOrderOneShotAction, scootersDetailedOrderOneShotAction2, scootersDetailedOrderOneShotAction3};
        $VALUES = scootersDetailedOrderOneShotActionArr;
        $ENTRIES = a.a(scootersDetailedOrderOneShotActionArr);
    }

    public static ScootersDetailedOrderOneShotAction valueOf(String str) {
        return (ScootersDetailedOrderOneShotAction) Enum.valueOf(ScootersDetailedOrderOneShotAction.class, str);
    }

    public static ScootersDetailedOrderOneShotAction[] values() {
        return (ScootersDetailedOrderOneShotAction[]) $VALUES.clone();
    }
}
