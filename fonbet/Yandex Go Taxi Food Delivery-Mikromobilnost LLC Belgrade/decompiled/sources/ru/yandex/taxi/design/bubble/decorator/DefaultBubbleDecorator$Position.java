package ru.yandex.taxi.design.bubble.decorator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Position", "", "Lru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Position;", "CENTER", "OFFSET_START", "OFFSET_END", "RELATIVE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultBubbleDecorator$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultBubbleDecorator$Position[] $VALUES;
    public static final DefaultBubbleDecorator$Position CENTER;
    public static final DefaultBubbleDecorator$Position OFFSET_END;
    public static final DefaultBubbleDecorator$Position OFFSET_START;
    public static final DefaultBubbleDecorator$Position RELATIVE;

    static {
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position = new DefaultBubbleDecorator$Position("CENTER", 0);
        CENTER = defaultBubbleDecorator$Position;
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position2 = new DefaultBubbleDecorator$Position("OFFSET_START", 1);
        OFFSET_START = defaultBubbleDecorator$Position2;
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position3 = new DefaultBubbleDecorator$Position("OFFSET_END", 2);
        OFFSET_END = defaultBubbleDecorator$Position3;
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position4 = new DefaultBubbleDecorator$Position("RELATIVE", 3);
        RELATIVE = defaultBubbleDecorator$Position4;
        DefaultBubbleDecorator$Position[] defaultBubbleDecorator$PositionArr = {defaultBubbleDecorator$Position, defaultBubbleDecorator$Position2, defaultBubbleDecorator$Position3, defaultBubbleDecorator$Position4};
        $VALUES = defaultBubbleDecorator$PositionArr;
        $ENTRIES = a.a(defaultBubbleDecorator$PositionArr);
    }

    public static DefaultBubbleDecorator$Position valueOf(String str) {
        return (DefaultBubbleDecorator$Position) Enum.valueOf(DefaultBubbleDecorator$Position.class, str);
    }

    public static DefaultBubbleDecorator$Position[] values() {
        return (DefaultBubbleDecorator$Position[]) $VALUES.clone();
    }
}
