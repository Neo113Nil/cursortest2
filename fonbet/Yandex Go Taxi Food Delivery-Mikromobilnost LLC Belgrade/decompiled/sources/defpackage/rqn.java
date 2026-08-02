package defpackage;

import ru.yandex.taxi.perf.screen.ScreenPerformanceState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class rqn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScreenPerformanceState.values().length];
        try {
            iArr[ScreenPerformanceState.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenPerformanceState.FIRST_CONTENTFUL_PAINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScreenPerformanceState.INTERRUPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
