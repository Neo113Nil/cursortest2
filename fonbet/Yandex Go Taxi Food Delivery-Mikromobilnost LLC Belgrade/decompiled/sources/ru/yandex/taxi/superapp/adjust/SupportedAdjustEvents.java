package ru.yandex.taxi.superapp.adjust;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/superapp/adjust/SupportedAdjustEvents;", "", "SHORTCUT_CLICKED", "SHOWCASE_APPEARED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SupportedAdjustEvents {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SupportedAdjustEvents[] $VALUES;
    public static final SupportedAdjustEvents SHORTCUT_CLICKED;
    public static final SupportedAdjustEvents SHOWCASE_APPEARED;

    static {
        SupportedAdjustEvents supportedAdjustEvents = new SupportedAdjustEvents("SHORTCUT_CLICKED", 0);
        SHORTCUT_CLICKED = supportedAdjustEvents;
        SupportedAdjustEvents supportedAdjustEvents2 = new SupportedAdjustEvents("SHOWCASE_APPEARED", 1);
        SHOWCASE_APPEARED = supportedAdjustEvents2;
        SupportedAdjustEvents[] supportedAdjustEventsArr = {supportedAdjustEvents, supportedAdjustEvents2};
        $VALUES = supportedAdjustEventsArr;
        $ENTRIES = a.a(supportedAdjustEventsArr);
    }

    public static SupportedAdjustEvents valueOf(String str) {
        return (SupportedAdjustEvents) Enum.valueOf(SupportedAdjustEvents.class, str);
    }

    public static SupportedAdjustEvents[] values() {
        return (SupportedAdjustEvents[]) $VALUES.clone();
    }
}
