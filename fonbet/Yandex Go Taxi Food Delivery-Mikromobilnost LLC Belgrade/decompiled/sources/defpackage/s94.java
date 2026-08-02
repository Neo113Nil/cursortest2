package defpackage;

import ru.yandex.taxi.analytics.AnalyticsContext$ElementState;
import ru.yandex.taxi.analytics.DialogCloseReason;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.analytics.ScrollDirection;
import ru.yandex.taxi.analytics.ViewEventType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class s94 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[AnalyticsContext$ElementState.values().length];
        try {
            iArr[AnalyticsContext$ElementState.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnalyticsContext$ElementState.SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScrollDirection.values().length];
        try {
            iArr2[ScrollDirection.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScrollDirection.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ViewEventType.values().length];
        try {
            iArr3[ViewEventType.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ViewEventType.TAPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ViewEventType.SCROLLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ViewEventType.CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[ModalViewCloseReason.values().length];
        try {
            iArr4[ModalViewCloseReason.BACK_PRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[ModalViewCloseReason.SLIDE_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[ModalViewCloseReason.TOUCH_OUTSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
        int[] iArr5 = new int[DialogCloseReason.values().length];
        try {
            iArr5[DialogCloseReason.BACK_PRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[DialogCloseReason.BUTTON_TAPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[DialogCloseReason.TOUCH_OUTSIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
    }
}
