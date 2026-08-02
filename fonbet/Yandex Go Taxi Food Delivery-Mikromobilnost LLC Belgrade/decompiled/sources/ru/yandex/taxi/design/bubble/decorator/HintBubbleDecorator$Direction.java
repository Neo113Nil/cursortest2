package ru.yandex.taxi.design.bubble.decorator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/design/bubble/decorator/HintBubbleDecorator$Direction", "", "Lru/yandex/taxi/design/bubble/decorator/HintBubbleDecorator$Direction;", JCP.RAW_PREFIX, "UP", "DOWN", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HintBubbleDecorator$Direction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HintBubbleDecorator$Direction[] $VALUES;
    public static final HintBubbleDecorator$Direction DOWN;
    public static final HintBubbleDecorator$Direction NONE;
    public static final HintBubbleDecorator$Direction UP;

    static {
        HintBubbleDecorator$Direction hintBubbleDecorator$Direction = new HintBubbleDecorator$Direction(JCP.RAW_PREFIX, 0);
        NONE = hintBubbleDecorator$Direction;
        HintBubbleDecorator$Direction hintBubbleDecorator$Direction2 = new HintBubbleDecorator$Direction("UP", 1);
        UP = hintBubbleDecorator$Direction2;
        HintBubbleDecorator$Direction hintBubbleDecorator$Direction3 = new HintBubbleDecorator$Direction("DOWN", 2);
        DOWN = hintBubbleDecorator$Direction3;
        HintBubbleDecorator$Direction[] hintBubbleDecorator$DirectionArr = {hintBubbleDecorator$Direction, hintBubbleDecorator$Direction2, hintBubbleDecorator$Direction3};
        $VALUES = hintBubbleDecorator$DirectionArr;
        $ENTRIES = a.a(hintBubbleDecorator$DirectionArr);
    }

    public static HintBubbleDecorator$Direction valueOf(String str) {
        return (HintBubbleDecorator$Direction) Enum.valueOf(HintBubbleDecorator$Direction.class, str);
    }

    public static HintBubbleDecorator$Direction[] values() {
        return (HintBubbleDecorator$Direction[]) $VALUES.clone();
    }
}
