package ru.yandex.taxi.maas.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/maas/api/analytics/MultiTransportChooseExitCardAnalytics$OpenReasonV2", "", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseExitCardAnalytics$OpenReasonV2;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ShortcutsMain", "ShortcutsOrder", "Menu", "PaymentOptions", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiTransportChooseExitCardAnalytics$OpenReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTransportChooseExitCardAnalytics$OpenReasonV2[] $VALUES;
    public static final MultiTransportChooseExitCardAnalytics$OpenReasonV2 Menu;
    public static final MultiTransportChooseExitCardAnalytics$OpenReasonV2 PaymentOptions;
    public static final MultiTransportChooseExitCardAnalytics$OpenReasonV2 ShortcutsMain;
    public static final MultiTransportChooseExitCardAnalytics$OpenReasonV2 ShortcutsOrder;
    private final String eventValue;

    static {
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 multiTransportChooseExitCardAnalytics$OpenReasonV2 = new MultiTransportChooseExitCardAnalytics$OpenReasonV2("ShortcutsMain", 0, "shortcuts_main");
        ShortcutsMain = multiTransportChooseExitCardAnalytics$OpenReasonV2;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 multiTransportChooseExitCardAnalytics$OpenReasonV22 = new MultiTransportChooseExitCardAnalytics$OpenReasonV2("ShortcutsOrder", 1, "shortcuts_order");
        ShortcutsOrder = multiTransportChooseExitCardAnalytics$OpenReasonV22;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 multiTransportChooseExitCardAnalytics$OpenReasonV23 = new MultiTransportChooseExitCardAnalytics$OpenReasonV2("Menu", 2, "menu");
        Menu = multiTransportChooseExitCardAnalytics$OpenReasonV23;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2 multiTransportChooseExitCardAnalytics$OpenReasonV24 = new MultiTransportChooseExitCardAnalytics$OpenReasonV2("PaymentOptions", 3, "payment_options");
        PaymentOptions = multiTransportChooseExitCardAnalytics$OpenReasonV24;
        MultiTransportChooseExitCardAnalytics$OpenReasonV2[] multiTransportChooseExitCardAnalytics$OpenReasonV2Arr = {multiTransportChooseExitCardAnalytics$OpenReasonV2, multiTransportChooseExitCardAnalytics$OpenReasonV22, multiTransportChooseExitCardAnalytics$OpenReasonV23, multiTransportChooseExitCardAnalytics$OpenReasonV24};
        $VALUES = multiTransportChooseExitCardAnalytics$OpenReasonV2Arr;
        $ENTRIES = a.a(multiTransportChooseExitCardAnalytics$OpenReasonV2Arr);
    }

    public MultiTransportChooseExitCardAnalytics$OpenReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MultiTransportChooseExitCardAnalytics$OpenReasonV2 valueOf(String str) {
        return (MultiTransportChooseExitCardAnalytics$OpenReasonV2) Enum.valueOf(MultiTransportChooseExitCardAnalytics$OpenReasonV2.class, str);
    }

    public static MultiTransportChooseExitCardAnalytics$OpenReasonV2[] values() {
        return (MultiTransportChooseExitCardAnalytics$OpenReasonV2[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
