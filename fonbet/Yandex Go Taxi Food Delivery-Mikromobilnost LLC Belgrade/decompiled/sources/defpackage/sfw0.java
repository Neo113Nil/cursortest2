package defpackage;

import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sfw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointType.values().length];
        try {
            iArr[PointType.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointType.SOURCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
