package ru.yandex.taxi.maas.api.analytics;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/maas/api/analytics/MultiTransportChooseExitCardAnalytics$CloseReasonV2", "", "Lru/yandex/taxi/maas/api/analytics/MultiTransportChooseExitCardAnalytics$CloseReasonV2;", "", "eventValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AndroidBackButton", "RollOff", "CloseButton", "BackButton", PlusPayUiKitInflaterFactory.NAME_BUTTON, "TouchOutside", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiTransportChooseExitCardAnalytics$CloseReasonV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultiTransportChooseExitCardAnalytics$CloseReasonV2[] $VALUES;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 AndroidBackButton;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 BackButton;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 Button;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 CloseButton;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 RollOff;
    public static final MultiTransportChooseExitCardAnalytics$CloseReasonV2 TouchOutside;
    private final String eventValue;

    static {
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV2 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2("AndroidBackButton", 0, "android_back_button");
        AndroidBackButton = multiTransportChooseExitCardAnalytics$CloseReasonV2;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV22 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2("RollOff", 1, "roll_off");
        RollOff = multiTransportChooseExitCardAnalytics$CloseReasonV22;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV23 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2("CloseButton", 2, "close_button");
        CloseButton = multiTransportChooseExitCardAnalytics$CloseReasonV23;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV24 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2("BackButton", 3, "back_button");
        BackButton = multiTransportChooseExitCardAnalytics$CloseReasonV24;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV25 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2(PlusPayUiKitInflaterFactory.NAME_BUTTON, 4, "button");
        Button = multiTransportChooseExitCardAnalytics$CloseReasonV25;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2 multiTransportChooseExitCardAnalytics$CloseReasonV26 = new MultiTransportChooseExitCardAnalytics$CloseReasonV2("TouchOutside", 5, "touch_outside");
        TouchOutside = multiTransportChooseExitCardAnalytics$CloseReasonV26;
        MultiTransportChooseExitCardAnalytics$CloseReasonV2[] multiTransportChooseExitCardAnalytics$CloseReasonV2Arr = {multiTransportChooseExitCardAnalytics$CloseReasonV2, multiTransportChooseExitCardAnalytics$CloseReasonV22, multiTransportChooseExitCardAnalytics$CloseReasonV23, multiTransportChooseExitCardAnalytics$CloseReasonV24, multiTransportChooseExitCardAnalytics$CloseReasonV25, multiTransportChooseExitCardAnalytics$CloseReasonV26};
        $VALUES = multiTransportChooseExitCardAnalytics$CloseReasonV2Arr;
        $ENTRIES = a.a(multiTransportChooseExitCardAnalytics$CloseReasonV2Arr);
    }

    public MultiTransportChooseExitCardAnalytics$CloseReasonV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static MultiTransportChooseExitCardAnalytics$CloseReasonV2 valueOf(String str) {
        return (MultiTransportChooseExitCardAnalytics$CloseReasonV2) Enum.valueOf(MultiTransportChooseExitCardAnalytics$CloseReasonV2.class, str);
    }

    public static MultiTransportChooseExitCardAnalytics$CloseReasonV2[] values() {
        return (MultiTransportChooseExitCardAnalytics$CloseReasonV2[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
