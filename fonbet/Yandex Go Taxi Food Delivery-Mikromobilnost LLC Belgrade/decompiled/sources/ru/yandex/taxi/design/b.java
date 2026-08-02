package ru.yandex.taxi.design;

import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AnimatedListItemInputComponent.State.values().length];
        try {
            iArr[AnimatedListItemInputComponent.State.FOCUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnimatedListItemInputComponent.State.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
