package ru.yandex.taxi.communications.model.widgets;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.p73;
import defpackage.q73;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ArrowActionType;", "", "Companion", "q73", "UNKNOWN", "SELECT_ALT_OFFER", "PERSONAL_GOAL_SELECTOR", "SHARE_ROUTE_BUTTON", "SHOW_REQUIREMENT_INFO", "TOPUP_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ArrowActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ArrowActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final q73 Companion;
    public static final ArrowActionType PERSONAL_GOAL_SELECTOR;
    public static final ArrowActionType SELECT_ALT_OFFER;
    public static final ArrowActionType SHARE_ROUTE_BUTTON;
    public static final ArrowActionType SHOW_REQUIREMENT_INFO;
    public static final ArrowActionType TOPUP_CARD;
    public static final ArrowActionType UNKNOWN;

    static {
        ArrowActionType arrowActionType = new ArrowActionType("UNKNOWN", 0);
        UNKNOWN = arrowActionType;
        ArrowActionType arrowActionType2 = new ArrowActionType("SELECT_ALT_OFFER", 1);
        SELECT_ALT_OFFER = arrowActionType2;
        ArrowActionType arrowActionType3 = new ArrowActionType("PERSONAL_GOAL_SELECTOR", 2);
        PERSONAL_GOAL_SELECTOR = arrowActionType3;
        ArrowActionType arrowActionType4 = new ArrowActionType("SHARE_ROUTE_BUTTON", 3);
        SHARE_ROUTE_BUTTON = arrowActionType4;
        ArrowActionType arrowActionType5 = new ArrowActionType("SHOW_REQUIREMENT_INFO", 4);
        SHOW_REQUIREMENT_INFO = arrowActionType5;
        ArrowActionType arrowActionType6 = new ArrowActionType("TOPUP_CARD", 5);
        TOPUP_CARD = arrowActionType6;
        ArrowActionType[] arrowActionTypeArr = {arrowActionType, arrowActionType2, arrowActionType3, arrowActionType4, arrowActionType5, arrowActionType6};
        $VALUES = arrowActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(arrowActionTypeArr);
        Companion = new q73();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(0));
    }

    public static ArrowActionType valueOf(String str) {
        return (ArrowActionType) Enum.valueOf(ArrowActionType.class, str);
    }

    public static ArrowActionType[] values() {
        return (ArrowActionType[]) $VALUES.clone();
    }
}
