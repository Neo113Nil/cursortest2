package ru.yandex.taxi.communications.model.widgets;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionType;", "", "UNKNOWN", "OFFER_SUBSTITUTION", "TARIFF_REDIRECT", "REQUEST_TOTW", "FORCE_SOON_ORDER", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType FORCE_SOON_ORDER;
    public static final ActionType OFFER_SUBSTITUTION;
    public static final ActionType REQUEST_TOTW;
    public static final ActionType TARIFF_REDIRECT;
    public static final ActionType UNKNOWN;

    static {
        ActionType actionType = new ActionType("UNKNOWN", 0);
        UNKNOWN = actionType;
        ActionType actionType2 = new ActionType("OFFER_SUBSTITUTION", 1);
        OFFER_SUBSTITUTION = actionType2;
        ActionType actionType3 = new ActionType("TARIFF_REDIRECT", 2);
        TARIFF_REDIRECT = actionType3;
        ActionType actionType4 = new ActionType("REQUEST_TOTW", 3);
        REQUEST_TOTW = actionType4;
        ActionType actionType5 = new ActionType("FORCE_SOON_ORDER", 4);
        FORCE_SOON_ORDER = actionType5;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5};
        $VALUES = actionTypeArr;
        $ENTRIES = kotlin.enums.a.a(actionTypeArr);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }
}
