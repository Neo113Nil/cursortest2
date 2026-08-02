package defpackage;

import com.yandex.go.design.compose.theme.AppThemeType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class rrt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AppThemeType.values().length];
        try {
            iArr[AppThemeType.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AppThemeType.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
