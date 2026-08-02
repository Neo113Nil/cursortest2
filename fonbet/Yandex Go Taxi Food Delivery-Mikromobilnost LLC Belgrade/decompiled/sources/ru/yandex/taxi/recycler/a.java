package ru.yandex.taxi.recycler;

import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SpannedGridLayoutManager.Orientation.values().length];
        try {
            iArr[SpannedGridLayoutManager.Orientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpannedGridLayoutManager.Orientation.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
