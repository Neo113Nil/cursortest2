package ru.yandex.taxi.preorder.summary.tariffpage.router;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/preorder/summary/tariffpage/router/TariffPageCloseReason;", "", "PULL", "FOOTER_BUTTON", "SYSTEM_BACK_BUTTON", "OUT_CARD_TAP", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffPageCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffPageCloseReason[] $VALUES;
    public static final TariffPageCloseReason FOOTER_BUTTON;
    public static final TariffPageCloseReason OUT_CARD_TAP;
    public static final TariffPageCloseReason PULL;
    public static final TariffPageCloseReason SYSTEM_BACK_BUTTON;
    public static final TariffPageCloseReason UNKNOWN;

    static {
        TariffPageCloseReason tariffPageCloseReason = new TariffPageCloseReason("PULL", 0);
        PULL = tariffPageCloseReason;
        TariffPageCloseReason tariffPageCloseReason2 = new TariffPageCloseReason("FOOTER_BUTTON", 1);
        FOOTER_BUTTON = tariffPageCloseReason2;
        TariffPageCloseReason tariffPageCloseReason3 = new TariffPageCloseReason("SYSTEM_BACK_BUTTON", 2);
        SYSTEM_BACK_BUTTON = tariffPageCloseReason3;
        TariffPageCloseReason tariffPageCloseReason4 = new TariffPageCloseReason("OUT_CARD_TAP", 3);
        OUT_CARD_TAP = tariffPageCloseReason4;
        TariffPageCloseReason tariffPageCloseReason5 = new TariffPageCloseReason("UNKNOWN", 4);
        UNKNOWN = tariffPageCloseReason5;
        TariffPageCloseReason[] tariffPageCloseReasonArr = {tariffPageCloseReason, tariffPageCloseReason2, tariffPageCloseReason3, tariffPageCloseReason4, tariffPageCloseReason5};
        $VALUES = tariffPageCloseReasonArr;
        $ENTRIES = kotlin.enums.a.a(tariffPageCloseReasonArr);
    }

    public static TariffPageCloseReason valueOf(String str) {
        return (TariffPageCloseReason) Enum.valueOf(TariffPageCloseReason.class, str);
    }

    public static TariffPageCloseReason[] values() {
        return (TariffPageCloseReason[]) $VALUES.clone();
    }
}
