package defpackage;

import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class r7w0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewThemeChangeMode.values().length];
        try {
            iArr[WebViewThemeChangeMode.PREFERS_COLOR_SCHEME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewThemeChangeMode.SUPPORT_NATIVE_JS_CALLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewThemeChangeMode.NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
