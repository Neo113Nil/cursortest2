package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.transport.masstransit.StairsDirection;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StairsDirection.values().length];
        try {
            iArr[StairsDirection.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StairsDirection.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StairsDirection.DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
