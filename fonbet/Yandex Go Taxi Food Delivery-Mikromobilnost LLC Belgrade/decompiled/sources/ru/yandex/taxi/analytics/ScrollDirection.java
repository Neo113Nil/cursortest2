package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/analytics/ScrollDirection;", "", "UP", "DOWN", "UNKNOWN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScrollDirection[] $VALUES;
    public static final ScrollDirection DOWN;
    public static final ScrollDirection UNKNOWN;
    public static final ScrollDirection UP;

    static {
        ScrollDirection scrollDirection = new ScrollDirection("UP", 0);
        UP = scrollDirection;
        ScrollDirection scrollDirection2 = new ScrollDirection("DOWN", 1);
        DOWN = scrollDirection2;
        ScrollDirection scrollDirection3 = new ScrollDirection("UNKNOWN", 2);
        UNKNOWN = scrollDirection3;
        ScrollDirection[] scrollDirectionArr = {scrollDirection, scrollDirection2, scrollDirection3};
        $VALUES = scrollDirectionArr;
        $ENTRIES = a.a(scrollDirectionArr);
    }

    public static ScrollDirection valueOf(String str) {
        return (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
    }

    public static ScrollDirection[] values() {
        return (ScrollDirection[]) $VALUES.clone();
    }
}
