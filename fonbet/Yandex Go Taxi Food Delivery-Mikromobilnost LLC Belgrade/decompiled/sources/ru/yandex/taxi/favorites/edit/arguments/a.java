package ru.yandex.taxi.favorites.edit.arguments;

import ru.yandex.taxi.favorites.edit.arguments.EditArguments;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EditArguments.Type.values().length];
        try {
            iArr[EditArguments.Type.NEW_FAVORITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EditArguments.Type.EXISTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
