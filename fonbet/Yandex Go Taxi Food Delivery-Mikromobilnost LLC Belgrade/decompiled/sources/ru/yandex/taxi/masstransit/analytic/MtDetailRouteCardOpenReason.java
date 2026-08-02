package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/masstransit/analytic/MtDetailRouteCardOpenReason;", "", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "PULL", "BUTTON_TAP", "SELECTOR_TAP", "HANDLER_TAP", "BACK_FROM_MAP_FLOW", "HUB", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDetailRouteCardOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtDetailRouteCardOpenReason[] $VALUES;
    public static final MtDetailRouteCardOpenReason BACK_FROM_MAP_FLOW;
    public static final MtDetailRouteCardOpenReason BUTTON_TAP;
    public static final MtDetailRouteCardOpenReason HANDLER_TAP;
    public static final MtDetailRouteCardOpenReason HUB;
    public static final MtDetailRouteCardOpenReason PULL;
    public static final MtDetailRouteCardOpenReason SELECTOR_TAP;
    private final String value;

    static {
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason = new MtDetailRouteCardOpenReason("PULL", 0, "pull");
        PULL = mtDetailRouteCardOpenReason;
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason2 = new MtDetailRouteCardOpenReason("BUTTON_TAP", 1, "button_tap");
        BUTTON_TAP = mtDetailRouteCardOpenReason2;
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason3 = new MtDetailRouteCardOpenReason("SELECTOR_TAP", 2, "selector_tap");
        SELECTOR_TAP = mtDetailRouteCardOpenReason3;
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason4 = new MtDetailRouteCardOpenReason("HANDLER_TAP", 3, "handler_tap");
        HANDLER_TAP = mtDetailRouteCardOpenReason4;
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason5 = new MtDetailRouteCardOpenReason("BACK_FROM_MAP_FLOW", 4, "back_from_map_flow");
        BACK_FROM_MAP_FLOW = mtDetailRouteCardOpenReason5;
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason6 = new MtDetailRouteCardOpenReason("HUB", 5, "hub");
        HUB = mtDetailRouteCardOpenReason6;
        MtDetailRouteCardOpenReason[] mtDetailRouteCardOpenReasonArr = {mtDetailRouteCardOpenReason, mtDetailRouteCardOpenReason2, mtDetailRouteCardOpenReason3, mtDetailRouteCardOpenReason4, mtDetailRouteCardOpenReason5, mtDetailRouteCardOpenReason6};
        $VALUES = mtDetailRouteCardOpenReasonArr;
        $ENTRIES = a.a(mtDetailRouteCardOpenReasonArr);
    }

    public MtDetailRouteCardOpenReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MtDetailRouteCardOpenReason valueOf(String str) {
        return (MtDetailRouteCardOpenReason) Enum.valueOf(MtDetailRouteCardOpenReason.class, str);
    }

    public static MtDetailRouteCardOpenReason[] values() {
        return (MtDetailRouteCardOpenReason[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
