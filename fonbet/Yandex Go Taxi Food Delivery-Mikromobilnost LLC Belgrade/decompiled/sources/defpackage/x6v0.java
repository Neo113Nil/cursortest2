package defpackage;

import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class x6v0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointType.values().length];
        try {
            iArr[PointType.DESTINATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
