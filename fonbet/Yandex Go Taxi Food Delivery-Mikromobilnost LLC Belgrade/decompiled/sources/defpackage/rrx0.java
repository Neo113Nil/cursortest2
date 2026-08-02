package defpackage;

import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class rrx0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PriceUpdate$PriceLoadingState.values().length];
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PriceUpdate$PriceLoadingState.LOADING_INTERRUPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
