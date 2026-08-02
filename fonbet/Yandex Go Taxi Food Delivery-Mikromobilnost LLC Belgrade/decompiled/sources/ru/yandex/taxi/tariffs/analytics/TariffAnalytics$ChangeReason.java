package ru.yandex.taxi.tariffs.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/tariffs/analytics/TariffAnalytics$ChangeReason", "", "Lru/yandex/taxi/tariffs/analytics/TariffAnalytics$ChangeReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NotAvailable", "NotFoundInSelectedVertical", "SelectedVerticalNotFound", "PreviouslyChangedByUser", "NotCanBeDefault", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TariffAnalytics$ChangeReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffAnalytics$ChangeReason[] $VALUES;
    public static final TariffAnalytics$ChangeReason NotAvailable;
    public static final TariffAnalytics$ChangeReason NotCanBeDefault;
    public static final TariffAnalytics$ChangeReason NotFoundInSelectedVertical;
    public static final TariffAnalytics$ChangeReason PreviouslyChangedByUser;
    public static final TariffAnalytics$ChangeReason SelectedVerticalNotFound;
    private final String eventValue;

    static {
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason = new TariffAnalytics$ChangeReason("NotAvailable", 0, "not_available");
        NotAvailable = tariffAnalytics$ChangeReason;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason2 = new TariffAnalytics$ChangeReason("NotFoundInSelectedVertical", 1, "not_found_in_selected_vertical");
        NotFoundInSelectedVertical = tariffAnalytics$ChangeReason2;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason3 = new TariffAnalytics$ChangeReason("SelectedVerticalNotFound", 2, "selected_vertical_not_found");
        SelectedVerticalNotFound = tariffAnalytics$ChangeReason3;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason4 = new TariffAnalytics$ChangeReason("PreviouslyChangedByUser", 3, "previously_changed_by_user");
        PreviouslyChangedByUser = tariffAnalytics$ChangeReason4;
        TariffAnalytics$ChangeReason tariffAnalytics$ChangeReason5 = new TariffAnalytics$ChangeReason("NotCanBeDefault", 4, "not_can_be_default");
        NotCanBeDefault = tariffAnalytics$ChangeReason5;
        TariffAnalytics$ChangeReason[] tariffAnalytics$ChangeReasonArr = {tariffAnalytics$ChangeReason, tariffAnalytics$ChangeReason2, tariffAnalytics$ChangeReason3, tariffAnalytics$ChangeReason4, tariffAnalytics$ChangeReason5};
        $VALUES = tariffAnalytics$ChangeReasonArr;
        $ENTRIES = a.a(tariffAnalytics$ChangeReasonArr);
    }

    public TariffAnalytics$ChangeReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TariffAnalytics$ChangeReason valueOf(String str) {
        return (TariffAnalytics$ChangeReason) Enum.valueOf(TariffAnalytics$ChangeReason.class, str);
    }

    public static TariffAnalytics$ChangeReason[] values() {
        return (TariffAnalytics$ChangeReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
