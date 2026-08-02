package ru.yandex.taxi.transition;

import ru.yandex.taxi.transition.AttachableViewHolder;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AttachableViewHolder.TransitionType.values().length];
        try {
            iArr[AttachableViewHolder.TransitionType.APPEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AttachableViewHolder.TransitionType.DISAPPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
