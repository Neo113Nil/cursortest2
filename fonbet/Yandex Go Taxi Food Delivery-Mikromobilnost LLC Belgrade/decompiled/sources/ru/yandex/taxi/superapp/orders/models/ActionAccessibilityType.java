package ru.yandex.taxi.superapp.orders.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/superapp/orders/models/ActionAccessibilityType;", "", "CHECKBOX", "WALKING_ROUTE", "NOOP_BUTTON", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionAccessibilityType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionAccessibilityType[] $VALUES;
    public static final ActionAccessibilityType CHECKBOX;
    public static final ActionAccessibilityType NOOP_BUTTON;
    public static final ActionAccessibilityType WALKING_ROUTE;

    static {
        ActionAccessibilityType actionAccessibilityType = new ActionAccessibilityType("CHECKBOX", 0);
        CHECKBOX = actionAccessibilityType;
        ActionAccessibilityType actionAccessibilityType2 = new ActionAccessibilityType("WALKING_ROUTE", 1);
        WALKING_ROUTE = actionAccessibilityType2;
        ActionAccessibilityType actionAccessibilityType3 = new ActionAccessibilityType("NOOP_BUTTON", 2);
        NOOP_BUTTON = actionAccessibilityType3;
        ActionAccessibilityType[] actionAccessibilityTypeArr = {actionAccessibilityType, actionAccessibilityType2, actionAccessibilityType3};
        $VALUES = actionAccessibilityTypeArr;
        $ENTRIES = a.a(actionAccessibilityTypeArr);
    }

    public static ActionAccessibilityType valueOf(String str) {
        return (ActionAccessibilityType) Enum.valueOf(ActionAccessibilityType.class, str);
    }

    public static ActionAccessibilityType[] values() {
        return (ActionAccessibilityType[]) $VALUES.clone();
    }
}
