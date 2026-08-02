package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.transport.masstransit.Travolator;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Travolator.values().length];
        try {
            iArr[Travolator.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Travolator.UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Travolator.DOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
