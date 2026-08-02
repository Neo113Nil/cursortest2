package ru.yandex.taxi.design;

import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AnimatedListItemInputComponent.State.values().length];
        try {
            iArr[AnimatedListItemInputComponent.State.EMPTY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AnimatedListItemInputComponent.State.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AnimatedListItemInputComponent.State.FOCUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
