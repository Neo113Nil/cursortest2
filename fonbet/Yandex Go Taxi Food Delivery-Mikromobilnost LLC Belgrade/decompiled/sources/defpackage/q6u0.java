package defpackage;

import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q6u0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StaticMapImageConfig$MapType.values().length];
        try {
            iArr[StaticMapImageConfig$MapType.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
