package defpackage;

import ru.yandex.taxi.models.OrderRatioHeightType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class vy20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderRatioHeightType.values().length];
        try {
            iArr[OrderRatioHeightType.MULTIORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderRatioHeightType.ORDER_FEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
