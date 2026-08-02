package defpackage;

import ru.yandex.taxi.persuggest.api.GeoObjectType;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class szs {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GeoObjectType.values().length];
        try {
            iArr[GeoObjectType.ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeoObjectType.ORGANIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GeoObjectType.DELIVERY_PICKUP_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
