package defpackage;

import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class twv0 {
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
        a = iArr;
    }
}
