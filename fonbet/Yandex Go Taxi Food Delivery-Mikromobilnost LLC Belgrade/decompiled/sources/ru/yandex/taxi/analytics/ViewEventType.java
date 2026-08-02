package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/analytics/ViewEventType;", "", "SHOWN", "CLOSED", "TAPPED", "SCROLLED", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewEventType[] $VALUES;
    public static final ViewEventType CLOSED;
    public static final ViewEventType SCROLLED;
    public static final ViewEventType SHOWN;
    public static final ViewEventType TAPPED;

    static {
        ViewEventType viewEventType = new ViewEventType("SHOWN", 0);
        SHOWN = viewEventType;
        ViewEventType viewEventType2 = new ViewEventType("CLOSED", 1);
        CLOSED = viewEventType2;
        ViewEventType viewEventType3 = new ViewEventType("TAPPED", 2);
        TAPPED = viewEventType3;
        ViewEventType viewEventType4 = new ViewEventType("SCROLLED", 3);
        SCROLLED = viewEventType4;
        ViewEventType[] viewEventTypeArr = {viewEventType, viewEventType2, viewEventType3, viewEventType4};
        $VALUES = viewEventTypeArr;
        $ENTRIES = a.a(viewEventTypeArr);
    }

    public static ViewEventType valueOf(String str) {
        return (ViewEventType) Enum.valueOf(ViewEventType.class, str);
    }

    public static ViewEventType[] values() {
        return (ViewEventType[]) $VALUES.clone();
    }
}
