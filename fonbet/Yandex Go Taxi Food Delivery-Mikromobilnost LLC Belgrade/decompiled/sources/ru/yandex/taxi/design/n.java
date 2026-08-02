package ru.yandex.taxi.design;

import ru.yandex.taxi.design.RatingBarComponent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RatingBarComponent.AnimationType.values().length];
        try {
            iArr[RatingBarComponent.AnimationType.ONE_SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RatingBarComponent.AnimationType.ALL_SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
