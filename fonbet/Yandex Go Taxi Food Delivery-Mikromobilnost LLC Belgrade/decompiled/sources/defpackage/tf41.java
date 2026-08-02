package defpackage;

import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class tf41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlideableModalView.CardMode.values().length];
        try {
            iArr[SlideableModalView.CardMode.SLIDEABLE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlideableModalView.CardMode.FIXED_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlideableModalView.CardMode.FULLSCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
