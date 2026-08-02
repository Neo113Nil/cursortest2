package ru.yandex.taxi.design;

import ru.yandex.taxi.design.LoadingComponent;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadingComponent.LoadingMode.values().length];
        try {
            iArr[LoadingComponent.LoadingMode.DOUBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoadingComponent.LoadingMode.ICON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
