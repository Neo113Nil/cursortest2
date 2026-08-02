package ru.yandex.taxi.superapp.address;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/superapp/address/OrderAddressViewModel$State", "", "Lru/yandex/taxi/superapp/address/OrderAddressViewModel$State;", "GONE", "DEFAULT", "IN_PROGRESS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderAddressViewModel$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderAddressViewModel$State[] $VALUES;
    public static final OrderAddressViewModel$State DEFAULT;
    public static final OrderAddressViewModel$State GONE;
    public static final OrderAddressViewModel$State IN_PROGRESS;

    static {
        OrderAddressViewModel$State orderAddressViewModel$State = new OrderAddressViewModel$State("GONE", 0);
        GONE = orderAddressViewModel$State;
        OrderAddressViewModel$State orderAddressViewModel$State2 = new OrderAddressViewModel$State("DEFAULT", 1);
        DEFAULT = orderAddressViewModel$State2;
        OrderAddressViewModel$State orderAddressViewModel$State3 = new OrderAddressViewModel$State("IN_PROGRESS", 2);
        IN_PROGRESS = orderAddressViewModel$State3;
        OrderAddressViewModel$State[] orderAddressViewModel$StateArr = {orderAddressViewModel$State, orderAddressViewModel$State2, orderAddressViewModel$State3};
        $VALUES = orderAddressViewModel$StateArr;
        $ENTRIES = kotlin.enums.a.a(orderAddressViewModel$StateArr);
    }

    public static OrderAddressViewModel$State valueOf(String str) {
        return (OrderAddressViewModel$State) Enum.valueOf(OrderAddressViewModel$State.class, str);
    }

    public static OrderAddressViewModel$State[] values() {
        return (OrderAddressViewModel$State[]) $VALUES.clone();
    }
}
