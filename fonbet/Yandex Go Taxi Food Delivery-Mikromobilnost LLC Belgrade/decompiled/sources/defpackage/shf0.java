package defpackage;

import ru.yandex.taxi.logistics.sdk.ui_models.progress_bar.PartialProgressBarStyleSides;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class shf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartialProgressBarStyleSides.values().length];
        try {
            iArr[PartialProgressBarStyleSides.ROUNDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartialProgressBarStyleSides.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
