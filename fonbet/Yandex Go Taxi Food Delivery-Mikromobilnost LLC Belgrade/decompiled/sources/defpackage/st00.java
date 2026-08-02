package defpackage;

import ru.yandex.taxi.map_common.map.MapViewInflateStrategy;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class st00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapViewInflateStrategy.values().length];
        try {
            iArr[MapViewInflateStrategy.OnCreate.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapViewInflateStrategy.OnMapScreenAppeared.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapViewInflateStrategy.OnLargestContentfulPaint.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
