package ru.yandex.taxi.logistics.sdk.ui.component.misc;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0083\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/component/misc/Quarter;", "", "Companion", "ru/yandex/taxi/logistics/sdk/ui/component/misc/c", "LOWER_RIGHT", "LOWER_LEFT", "UPPER_RIGHT", "UPPER_LEFT", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class Quarter {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Quarter[] $VALUES;
    public static final c Companion;
    public static final Quarter LOWER_LEFT;
    public static final Quarter LOWER_RIGHT;
    public static final Quarter UPPER_LEFT;
    public static final Quarter UPPER_RIGHT;

    static {
        Quarter quarter = new Quarter("LOWER_RIGHT", 0);
        LOWER_RIGHT = quarter;
        Quarter quarter2 = new Quarter("LOWER_LEFT", 1);
        LOWER_LEFT = quarter2;
        Quarter quarter3 = new Quarter("UPPER_RIGHT", 2);
        UPPER_RIGHT = quarter3;
        Quarter quarter4 = new Quarter("UPPER_LEFT", 3);
        UPPER_LEFT = quarter4;
        Quarter[] quarterArr = {quarter, quarter2, quarter3, quarter4};
        $VALUES = quarterArr;
        $ENTRIES = kotlin.enums.a.a(quarterArr);
        Companion = new c();
    }

    public static Quarter valueOf(String str) {
        return (Quarter) Enum.valueOf(Quarter.class, str);
    }

    public static Quarter[] values() {
        return (Quarter[]) $VALUES.clone();
    }
}
