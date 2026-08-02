package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import com.yandex.mapkit.transport.masstransit.Pass;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Pass.values().length];
        try {
            iArr[Pass.UNDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Pass.OVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
