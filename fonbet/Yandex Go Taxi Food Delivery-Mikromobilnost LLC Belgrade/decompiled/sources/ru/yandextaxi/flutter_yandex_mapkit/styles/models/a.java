package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import ru.yandextaxi.flutter_yandex_mapkit.styles.models.PlacemarkStyleData;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacemarkStyleData.ContentType.values().length];
        try {
            iArr[PlacemarkStyleData.ContentType.MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacemarkStyleData.ContentType.IMG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
