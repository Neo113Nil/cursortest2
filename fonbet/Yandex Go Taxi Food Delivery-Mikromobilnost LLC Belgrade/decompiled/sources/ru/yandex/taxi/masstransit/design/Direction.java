package ru.yandex.taxi.masstransit.design;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/design/Direction;", "", "UP", "DOWN", "NOT_CHANGED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction DOWN;
    public static final Direction NOT_CHANGED;
    public static final Direction UP;

    static {
        Direction direction = new Direction("UP", 0);
        UP = direction;
        Direction direction2 = new Direction("DOWN", 1);
        DOWN = direction2;
        Direction direction3 = new Direction("NOT_CHANGED", 2);
        NOT_CHANGED = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        $VALUES = directionArr;
        $ENTRIES = kotlin.enums.a.a(directionArr);
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
