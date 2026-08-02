package ru.yandex.taxi.widget;

import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaceholderView.PlaceholderType.values().length];
        try {
            iArr[PlaceholderView.PlaceholderType.RECTANGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaceholderView.PlaceholderType.OVAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlaceholderView.PlaceholderType.ROUNDED_LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlaceholderView.PlaceholderType.DRAWABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
