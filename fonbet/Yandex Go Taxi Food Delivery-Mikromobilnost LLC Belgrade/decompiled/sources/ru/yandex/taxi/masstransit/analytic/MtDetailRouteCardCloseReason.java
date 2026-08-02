package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/analytic/MtDetailRouteCardCloseReason;", "", "PULL", "SYSTEM_BACK_BUTTON", "CARD_BACK_BUTTON", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDetailRouteCardCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtDetailRouteCardCloseReason[] $VALUES;
    public static final MtDetailRouteCardCloseReason CARD_BACK_BUTTON;
    public static final MtDetailRouteCardCloseReason PULL;
    public static final MtDetailRouteCardCloseReason SYSTEM_BACK_BUTTON;

    static {
        MtDetailRouteCardCloseReason mtDetailRouteCardCloseReason = new MtDetailRouteCardCloseReason("PULL", 0);
        PULL = mtDetailRouteCardCloseReason;
        MtDetailRouteCardCloseReason mtDetailRouteCardCloseReason2 = new MtDetailRouteCardCloseReason("SYSTEM_BACK_BUTTON", 1);
        SYSTEM_BACK_BUTTON = mtDetailRouteCardCloseReason2;
        MtDetailRouteCardCloseReason mtDetailRouteCardCloseReason3 = new MtDetailRouteCardCloseReason("CARD_BACK_BUTTON", 2);
        CARD_BACK_BUTTON = mtDetailRouteCardCloseReason3;
        MtDetailRouteCardCloseReason[] mtDetailRouteCardCloseReasonArr = {mtDetailRouteCardCloseReason, mtDetailRouteCardCloseReason2, mtDetailRouteCardCloseReason3};
        $VALUES = mtDetailRouteCardCloseReasonArr;
        $ENTRIES = a.a(mtDetailRouteCardCloseReasonArr);
    }

    public static MtDetailRouteCardCloseReason valueOf(String str) {
        return (MtDetailRouteCardCloseReason) Enum.valueOf(MtDetailRouteCardCloseReason.class, str);
    }

    public static MtDetailRouteCardCloseReason[] values() {
        return (MtDetailRouteCardCloseReason[]) $VALUES.clone();
    }
}
