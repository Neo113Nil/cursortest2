package ru.yandex.taxi.map_common.map;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/map_common/map/MapViewInflateStrategy;", "", "", "eventName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OnCreate", "OnMapScreenAppeared", "OnLargestContentfulPaint", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapViewInflateStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapViewInflateStrategy[] $VALUES;
    public static final MapViewInflateStrategy OnCreate;
    public static final MapViewInflateStrategy OnLargestContentfulPaint;
    public static final MapViewInflateStrategy OnMapScreenAppeared;
    private final String eventName;

    static {
        MapViewInflateStrategy mapViewInflateStrategy = new MapViewInflateStrategy("OnCreate", 0, "on_create");
        OnCreate = mapViewInflateStrategy;
        MapViewInflateStrategy mapViewInflateStrategy2 = new MapViewInflateStrategy("OnMapScreenAppeared", 1, "on_map_screen_appeared");
        OnMapScreenAppeared = mapViewInflateStrategy2;
        MapViewInflateStrategy mapViewInflateStrategy3 = new MapViewInflateStrategy("OnLargestContentfulPaint", 2, "on_largest_contentful_paint");
        OnLargestContentfulPaint = mapViewInflateStrategy3;
        MapViewInflateStrategy[] mapViewInflateStrategyArr = {mapViewInflateStrategy, mapViewInflateStrategy2, mapViewInflateStrategy3};
        $VALUES = mapViewInflateStrategyArr;
        $ENTRIES = kotlin.enums.a.a(mapViewInflateStrategyArr);
    }

    public MapViewInflateStrategy(String str, int i, String str2) {
        this.eventName = str2;
    }

    public static MapViewInflateStrategy valueOf(String str) {
        return (MapViewInflateStrategy) Enum.valueOf(MapViewInflateStrategy.class, str);
    }

    public static MapViewInflateStrategy[] values() {
        return (MapViewInflateStrategy[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }
}
