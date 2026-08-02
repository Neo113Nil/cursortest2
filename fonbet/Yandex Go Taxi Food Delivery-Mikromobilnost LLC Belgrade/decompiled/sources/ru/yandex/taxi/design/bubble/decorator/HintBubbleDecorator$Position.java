package ru.yandex.taxi.design.bubble.decorator;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/design/bubble/decorator/HintBubbleDecorator$Position", "", "Lru/yandex/taxi/design/bubble/decorator/HintBubbleDecorator$Position;", "CENTER", "OFFSET_START", "OFFSET_END", "TOP_LEFT", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HintBubbleDecorator$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HintBubbleDecorator$Position[] $VALUES;
    public static final HintBubbleDecorator$Position CENTER;
    public static final HintBubbleDecorator$Position OFFSET_END;
    public static final HintBubbleDecorator$Position OFFSET_START;
    public static final HintBubbleDecorator$Position TOP_LEFT;

    static {
        HintBubbleDecorator$Position hintBubbleDecorator$Position = new HintBubbleDecorator$Position("CENTER", 0);
        CENTER = hintBubbleDecorator$Position;
        HintBubbleDecorator$Position hintBubbleDecorator$Position2 = new HintBubbleDecorator$Position("OFFSET_START", 1);
        OFFSET_START = hintBubbleDecorator$Position2;
        HintBubbleDecorator$Position hintBubbleDecorator$Position3 = new HintBubbleDecorator$Position("OFFSET_END", 2);
        OFFSET_END = hintBubbleDecorator$Position3;
        HintBubbleDecorator$Position hintBubbleDecorator$Position4 = new HintBubbleDecorator$Position("TOP_LEFT", 3);
        TOP_LEFT = hintBubbleDecorator$Position4;
        HintBubbleDecorator$Position[] hintBubbleDecorator$PositionArr = {hintBubbleDecorator$Position, hintBubbleDecorator$Position2, hintBubbleDecorator$Position3, hintBubbleDecorator$Position4};
        $VALUES = hintBubbleDecorator$PositionArr;
        $ENTRIES = a.a(hintBubbleDecorator$PositionArr);
    }

    public static HintBubbleDecorator$Position valueOf(String str) {
        return (HintBubbleDecorator$Position) Enum.valueOf(HintBubbleDecorator$Position.class, str);
    }

    public static HintBubbleDecorator$Position[] values() {
        return (HintBubbleDecorator$Position[]) $VALUES.clone();
    }
}
