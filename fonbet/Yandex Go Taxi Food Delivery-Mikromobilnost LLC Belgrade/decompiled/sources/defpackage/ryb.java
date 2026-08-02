package defpackage;

import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ryb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoutePointType.values().length];
        try {
            iArr[RoutePointType.POINT_A.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoutePointType.POINT_B.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoutePointType.POINT_MID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
