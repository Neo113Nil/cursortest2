package ru.yandex.taxi.design.bubble.decorator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Direction", "", "Lru/yandex/taxi/design/bubble/decorator/DefaultBubbleDecorator$Direction;", JCP.RAW_PREFIX, "START", "UP", "END", "DOWN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultBubbleDecorator$Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultBubbleDecorator$Direction[] $VALUES;
    public static final DefaultBubbleDecorator$Direction DOWN;
    public static final DefaultBubbleDecorator$Direction END;
    public static final DefaultBubbleDecorator$Direction NONE;
    public static final DefaultBubbleDecorator$Direction START;
    public static final DefaultBubbleDecorator$Direction UP;

    static {
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction = new DefaultBubbleDecorator$Direction(JCP.RAW_PREFIX, 0);
        NONE = defaultBubbleDecorator$Direction;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction2 = new DefaultBubbleDecorator$Direction("START", 1);
        START = defaultBubbleDecorator$Direction2;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction3 = new DefaultBubbleDecorator$Direction("UP", 2);
        UP = defaultBubbleDecorator$Direction3;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction4 = new DefaultBubbleDecorator$Direction("END", 3);
        END = defaultBubbleDecorator$Direction4;
        DefaultBubbleDecorator$Direction defaultBubbleDecorator$Direction5 = new DefaultBubbleDecorator$Direction("DOWN", 4);
        DOWN = defaultBubbleDecorator$Direction5;
        DefaultBubbleDecorator$Direction[] defaultBubbleDecorator$DirectionArr = {defaultBubbleDecorator$Direction, defaultBubbleDecorator$Direction2, defaultBubbleDecorator$Direction3, defaultBubbleDecorator$Direction4, defaultBubbleDecorator$Direction5};
        $VALUES = defaultBubbleDecorator$DirectionArr;
        $ENTRIES = a.a(defaultBubbleDecorator$DirectionArr);
    }

    public static DefaultBubbleDecorator$Direction valueOf(String str) {
        return (DefaultBubbleDecorator$Direction) Enum.valueOf(DefaultBubbleDecorator$Direction.class, str);
    }

    public static DefaultBubbleDecorator$Direction[] values() {
        return (DefaultBubbleDecorator$Direction[]) $VALUES.clone();
    }
}
