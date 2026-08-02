package ru.yandex.taxi.tariffs.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/tariffs/analytics/TariffSelectionReporter$ChangeReason", "", "Lru/yandex/taxi/tariffs/analytics/TariffSelectionReporter$ChangeReason;", "NOT_AVAILABLE", "NOT_FOUND_IN_SELECTED_VERTICAL", "SELECTED_VERTICAL_NOT_FOUND", "PREVIOUSLY_CHANGED_BY_USER", "NOT_CAN_BE_DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TariffSelectionReporter$ChangeReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffSelectionReporter$ChangeReason[] $VALUES;
    public static final TariffSelectionReporter$ChangeReason NOT_AVAILABLE;
    public static final TariffSelectionReporter$ChangeReason NOT_CAN_BE_DEFAULT;
    public static final TariffSelectionReporter$ChangeReason NOT_FOUND_IN_SELECTED_VERTICAL;
    public static final TariffSelectionReporter$ChangeReason PREVIOUSLY_CHANGED_BY_USER;
    public static final TariffSelectionReporter$ChangeReason SELECTED_VERTICAL_NOT_FOUND;

    static {
        TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason = new TariffSelectionReporter$ChangeReason("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = tariffSelectionReporter$ChangeReason;
        TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason2 = new TariffSelectionReporter$ChangeReason("NOT_FOUND_IN_SELECTED_VERTICAL", 1);
        NOT_FOUND_IN_SELECTED_VERTICAL = tariffSelectionReporter$ChangeReason2;
        TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason3 = new TariffSelectionReporter$ChangeReason("SELECTED_VERTICAL_NOT_FOUND", 2);
        SELECTED_VERTICAL_NOT_FOUND = tariffSelectionReporter$ChangeReason3;
        TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason4 = new TariffSelectionReporter$ChangeReason("PREVIOUSLY_CHANGED_BY_USER", 3);
        PREVIOUSLY_CHANGED_BY_USER = tariffSelectionReporter$ChangeReason4;
        TariffSelectionReporter$ChangeReason tariffSelectionReporter$ChangeReason5 = new TariffSelectionReporter$ChangeReason("NOT_CAN_BE_DEFAULT", 4);
        NOT_CAN_BE_DEFAULT = tariffSelectionReporter$ChangeReason5;
        TariffSelectionReporter$ChangeReason[] tariffSelectionReporter$ChangeReasonArr = {tariffSelectionReporter$ChangeReason, tariffSelectionReporter$ChangeReason2, tariffSelectionReporter$ChangeReason3, tariffSelectionReporter$ChangeReason4, tariffSelectionReporter$ChangeReason5};
        $VALUES = tariffSelectionReporter$ChangeReasonArr;
        $ENTRIES = a.a(tariffSelectionReporter$ChangeReasonArr);
    }

    public static TariffSelectionReporter$ChangeReason valueOf(String str) {
        return (TariffSelectionReporter$ChangeReason) Enum.valueOf(TariffSelectionReporter$ChangeReason.class, str);
    }

    public static TariffSelectionReporter$ChangeReason[] values() {
        return (TariffSelectionReporter$ChangeReason[]) $VALUES.clone();
    }
}
