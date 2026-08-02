package defpackage;

import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.HintBubbleDecorator$Position;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qju {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HintBubbleDecorator$Direction.values().length];
        try {
            iArr[HintBubbleDecorator$Direction.DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HintBubbleDecorator$Direction.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HintBubbleDecorator$Direction.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[HintBubbleDecorator$Position.values().length];
        try {
            iArr2[HintBubbleDecorator$Position.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.OFFSET_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.OFFSET_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[HintBubbleDecorator$Position.TOP_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
