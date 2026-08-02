package ru.yandex.taxi.scooters.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/scooters/domain/ScootersDetailedOrderFocusInteractor$FocusType", "", "Lru/yandex/taxi/scooters/domain/ScootersDetailedOrderFocusInteractor$FocusType;", "FOCUS_ON_USER", "FOCUS_ON_ROUTE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersDetailedOrderFocusInteractor$FocusType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersDetailedOrderFocusInteractor$FocusType[] $VALUES;
    public static final ScootersDetailedOrderFocusInteractor$FocusType FOCUS_ON_ROUTE;
    public static final ScootersDetailedOrderFocusInteractor$FocusType FOCUS_ON_USER;

    static {
        ScootersDetailedOrderFocusInteractor$FocusType scootersDetailedOrderFocusInteractor$FocusType = new ScootersDetailedOrderFocusInteractor$FocusType("FOCUS_ON_USER", 0);
        FOCUS_ON_USER = scootersDetailedOrderFocusInteractor$FocusType;
        ScootersDetailedOrderFocusInteractor$FocusType scootersDetailedOrderFocusInteractor$FocusType2 = new ScootersDetailedOrderFocusInteractor$FocusType("FOCUS_ON_ROUTE", 1);
        FOCUS_ON_ROUTE = scootersDetailedOrderFocusInteractor$FocusType2;
        ScootersDetailedOrderFocusInteractor$FocusType[] scootersDetailedOrderFocusInteractor$FocusTypeArr = {scootersDetailedOrderFocusInteractor$FocusType, scootersDetailedOrderFocusInteractor$FocusType2};
        $VALUES = scootersDetailedOrderFocusInteractor$FocusTypeArr;
        $ENTRIES = kotlin.enums.a.a(scootersDetailedOrderFocusInteractor$FocusTypeArr);
    }

    public static ScootersDetailedOrderFocusInteractor$FocusType valueOf(String str) {
        return (ScootersDetailedOrderFocusInteractor$FocusType) Enum.valueOf(ScootersDetailedOrderFocusInteractor$FocusType.class, str);
    }

    public static ScootersDetailedOrderFocusInteractor$FocusType[] values() {
        return (ScootersDetailedOrderFocusInteractor$FocusType[]) $VALUES.clone();
    }
}
