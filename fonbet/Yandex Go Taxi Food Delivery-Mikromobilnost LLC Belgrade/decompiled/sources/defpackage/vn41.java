package defpackage;

import com.yandex.plus.webview.api.container.WebViewContainerType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vn41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewContainerType.values().length];
        try {
            iArr[WebViewContainerType.TOOLBAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewContainerType.FOOTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewContainerType.MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
