package defpackage;

import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class vza {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DefaultBubbleDecorator$Direction.values().length];
        try {
            iArr[DefaultBubbleDecorator$Direction.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.START.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DefaultBubbleDecorator$Direction.END.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[DefaultBubbleDecorator$Position.values().length];
        try {
            iArr2[DefaultBubbleDecorator$Position.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DefaultBubbleDecorator$Position.OFFSET_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DefaultBubbleDecorator$Position.OFFSET_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DefaultBubbleDecorator$Position.RELATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
