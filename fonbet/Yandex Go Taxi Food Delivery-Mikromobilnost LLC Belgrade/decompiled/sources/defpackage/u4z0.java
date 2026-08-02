package defpackage;

import ru.yandextaxi.flutter_yandex_mapkit.models.TileFormat;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class u4z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TileFormat.values().length];
        try {
            iArr[TileFormat.PNG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TileFormat.JPG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TileFormat.VECTOR2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TileFormat.VECTOR3.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TileFormat.GEO_JSON.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
