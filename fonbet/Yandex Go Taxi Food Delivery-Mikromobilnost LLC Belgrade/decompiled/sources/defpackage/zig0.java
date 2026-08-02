package defpackage;

import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class zig0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ThemeType.values().length];
        try {
            iArr[ThemeType.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeType.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
