package defpackage;

import ru.yandex.taxi.common_models.net.geometry.GeometryType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w46 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GeometryType.values().length];
        try {
            iArr[GeometryType.POLYGON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeometryType.MULTI_POLYGON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
