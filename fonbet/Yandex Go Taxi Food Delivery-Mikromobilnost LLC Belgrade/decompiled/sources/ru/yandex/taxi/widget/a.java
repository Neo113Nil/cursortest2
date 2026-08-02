package ru.yandex.taxi.widget;

import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ArrowsView.State.values().length];
        try {
            iArr[ArrowsView.State.UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ArrowsView.State.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ArrowsView.State.PLAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ArrowsView.State.GONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
