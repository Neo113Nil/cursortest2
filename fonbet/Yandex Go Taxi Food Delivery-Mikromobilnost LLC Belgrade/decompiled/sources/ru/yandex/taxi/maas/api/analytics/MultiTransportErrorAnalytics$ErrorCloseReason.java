package ru.yandex.taxi.maas.api.analytics;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/maas/api/analytics/MultiTransportErrorAnalytics$ErrorCloseReason", "", "Lru/yandex/taxi/maas/api/analytics/MultiTransportErrorAnalytics$ErrorCloseReason;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AndroidBackButton", "RollOff", "CloseButton", "BackButton", PlusPayUiKitInflaterFactory.NAME_BUTTON, "TouchOutside", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiTransportErrorAnalytics$ErrorCloseReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTransportErrorAnalytics$ErrorCloseReason[] $VALUES;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason AndroidBackButton;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason BackButton;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason Button;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason CloseButton;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason RollOff;
    public static final MultiTransportErrorAnalytics$ErrorCloseReason TouchOutside;
    private final String eventValue;

    static {
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason = new MultiTransportErrorAnalytics$ErrorCloseReason("AndroidBackButton", 0, "android_back_button");
        AndroidBackButton = multiTransportErrorAnalytics$ErrorCloseReason;
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason2 = new MultiTransportErrorAnalytics$ErrorCloseReason("RollOff", 1, "roll_off");
        RollOff = multiTransportErrorAnalytics$ErrorCloseReason2;
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason3 = new MultiTransportErrorAnalytics$ErrorCloseReason("CloseButton", 2, "close_button");
        CloseButton = multiTransportErrorAnalytics$ErrorCloseReason3;
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason4 = new MultiTransportErrorAnalytics$ErrorCloseReason("BackButton", 3, "back_button");
        BackButton = multiTransportErrorAnalytics$ErrorCloseReason4;
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason5 = new MultiTransportErrorAnalytics$ErrorCloseReason(PlusPayUiKitInflaterFactory.NAME_BUTTON, 4, "button");
        Button = multiTransportErrorAnalytics$ErrorCloseReason5;
        MultiTransportErrorAnalytics$ErrorCloseReason multiTransportErrorAnalytics$ErrorCloseReason6 = new MultiTransportErrorAnalytics$ErrorCloseReason("TouchOutside", 5, "touch_outside");
        TouchOutside = multiTransportErrorAnalytics$ErrorCloseReason6;
        MultiTransportErrorAnalytics$ErrorCloseReason[] multiTransportErrorAnalytics$ErrorCloseReasonArr = {multiTransportErrorAnalytics$ErrorCloseReason, multiTransportErrorAnalytics$ErrorCloseReason2, multiTransportErrorAnalytics$ErrorCloseReason3, multiTransportErrorAnalytics$ErrorCloseReason4, multiTransportErrorAnalytics$ErrorCloseReason5, multiTransportErrorAnalytics$ErrorCloseReason6};
        $VALUES = multiTransportErrorAnalytics$ErrorCloseReasonArr;
        $ENTRIES = a.a(multiTransportErrorAnalytics$ErrorCloseReasonArr);
    }

    public MultiTransportErrorAnalytics$ErrorCloseReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MultiTransportErrorAnalytics$ErrorCloseReason valueOf(String str) {
        return (MultiTransportErrorAnalytics$ErrorCloseReason) Enum.valueOf(MultiTransportErrorAnalytics$ErrorCloseReason.class, str);
    }

    public static MultiTransportErrorAnalytics$ErrorCloseReason[] values() {
        return (MultiTransportErrorAnalytics$ErrorCloseReason[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
