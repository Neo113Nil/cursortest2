package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import ru.yandextaxi.flutter_yandex_mapkit.styles.models.ProportionFunction;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProportionFunction.Type.values().length];
        try {
            iArr[ProportionFunction.Type.CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProportionFunction.Type.ZOOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProportionFunction.Type.TILT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProportionFunction.Type.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
