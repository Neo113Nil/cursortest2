package ru.yandex.taxi.design;

import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ListItemCheckComponent.Mode.values().length];
        try {
            iArr[ListItemCheckComponent.Mode.MULTIPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ListItemCheckComponent.Mode.RECTANGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ListItemCheckComponent.Mode.RECTANGLE_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
