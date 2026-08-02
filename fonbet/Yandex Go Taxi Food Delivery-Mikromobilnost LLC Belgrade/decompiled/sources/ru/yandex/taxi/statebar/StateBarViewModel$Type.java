package ru.yandex.taxi.statebar;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/yandex/taxi/statebar/StateBarViewModel$Type", "", "Lru/yandex/taxi/statebar/StateBarViewModel$Type;", "", "priority", CA20Status.STATUS_USER_I, "a", "()I", "BACK_TO_ACTIVE_ORDER", "ACTIVE_LINKED_ORDER", "IN_APP_CALL", "CHARGERS_DEBT", "NO_INTERNET_CONNECTION", "SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION", "SCOOTERS_SUPER_PASS_GRACE", "OVERDRAFT", "LOCATION_ERRORS", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StateBarViewModel$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StateBarViewModel$Type[] $VALUES;
    public static final StateBarViewModel$Type ACTIVE_LINKED_ORDER;
    public static final StateBarViewModel$Type BACK_TO_ACTIVE_ORDER;
    public static final StateBarViewModel$Type CHARGERS_DEBT;
    public static final StateBarViewModel$Type IN_APP_CALL;
    public static final StateBarViewModel$Type LOCATION_ERRORS;
    public static final StateBarViewModel$Type NO_INTERNET_CONNECTION;
    public static final StateBarViewModel$Type OVERDRAFT;
    public static final StateBarViewModel$Type SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION;
    public static final StateBarViewModel$Type SCOOTERS_SUPER_PASS_GRACE;
    private final int priority;

    static {
        StateBarViewModel$Type stateBarViewModel$Type = new StateBarViewModel$Type("BACK_TO_ACTIVE_ORDER", 0, 0);
        BACK_TO_ACTIVE_ORDER = stateBarViewModel$Type;
        StateBarViewModel$Type stateBarViewModel$Type2 = new StateBarViewModel$Type("ACTIVE_LINKED_ORDER", 1, 1);
        ACTIVE_LINKED_ORDER = stateBarViewModel$Type2;
        StateBarViewModel$Type stateBarViewModel$Type3 = new StateBarViewModel$Type("IN_APP_CALL", 2, 2);
        IN_APP_CALL = stateBarViewModel$Type3;
        StateBarViewModel$Type stateBarViewModel$Type4 = new StateBarViewModel$Type("CHARGERS_DEBT", 3, 3);
        CHARGERS_DEBT = stateBarViewModel$Type4;
        StateBarViewModel$Type stateBarViewModel$Type5 = new StateBarViewModel$Type("NO_INTERNET_CONNECTION", 4, 4);
        NO_INTERNET_CONNECTION = stateBarViewModel$Type5;
        StateBarViewModel$Type stateBarViewModel$Type6 = new StateBarViewModel$Type("SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION", 5, 5);
        SCOOTERS_REQUIRE_MOS_RU_AUTHORIZATION = stateBarViewModel$Type6;
        StateBarViewModel$Type stateBarViewModel$Type7 = new StateBarViewModel$Type("SCOOTERS_SUPER_PASS_GRACE", 6, 6);
        SCOOTERS_SUPER_PASS_GRACE = stateBarViewModel$Type7;
        StateBarViewModel$Type stateBarViewModel$Type8 = new StateBarViewModel$Type("OVERDRAFT", 7, 7);
        OVERDRAFT = stateBarViewModel$Type8;
        StateBarViewModel$Type stateBarViewModel$Type9 = new StateBarViewModel$Type("LOCATION_ERRORS", 8, 8);
        LOCATION_ERRORS = stateBarViewModel$Type9;
        StateBarViewModel$Type[] stateBarViewModel$TypeArr = {stateBarViewModel$Type, stateBarViewModel$Type2, stateBarViewModel$Type3, stateBarViewModel$Type4, stateBarViewModel$Type5, stateBarViewModel$Type6, stateBarViewModel$Type7, stateBarViewModel$Type8, stateBarViewModel$Type9};
        $VALUES = stateBarViewModel$TypeArr;
        $ENTRIES = kotlin.enums.a.a(stateBarViewModel$TypeArr);
    }

    public StateBarViewModel$Type(String str, int i, int i2) {
        this.priority = i2;
    }

    public static StateBarViewModel$Type valueOf(String str) {
        return (StateBarViewModel$Type) Enum.valueOf(StateBarViewModel$Type.class, str);
    }

    public static StateBarViewModel$Type[] values() {
        return (StateBarViewModel$Type[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }
}
