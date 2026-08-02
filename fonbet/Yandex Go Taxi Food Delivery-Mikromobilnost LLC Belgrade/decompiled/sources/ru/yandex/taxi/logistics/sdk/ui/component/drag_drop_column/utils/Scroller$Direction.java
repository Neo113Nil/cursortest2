package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/logistics/sdk/ui/component/drag_drop_column/utils/Scroller$Direction", "", "Lru/yandex/taxi/logistics/sdk/ui/component/drag_drop_column/utils/Scroller$Direction;", "BACKWARD", "FORWARD", "sdk-ui-components"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Scroller$Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Scroller$Direction[] $VALUES;
    public static final Scroller$Direction BACKWARD;
    public static final Scroller$Direction FORWARD;

    static {
        Scroller$Direction scroller$Direction = new Scroller$Direction("BACKWARD", 0);
        BACKWARD = scroller$Direction;
        Scroller$Direction scroller$Direction2 = new Scroller$Direction("FORWARD", 1);
        FORWARD = scroller$Direction2;
        Scroller$Direction[] scroller$DirectionArr = {scroller$Direction, scroller$Direction2};
        $VALUES = scroller$DirectionArr;
        $ENTRIES = kotlin.enums.a.a(scroller$DirectionArr);
    }

    public static Scroller$Direction valueOf(String str) {
        return (Scroller$Direction) Enum.valueOf(Scroller$Direction.class, str);
    }

    public static Scroller$Direction[] values() {
        return (Scroller$Direction[]) $VALUES.clone();
    }
}
