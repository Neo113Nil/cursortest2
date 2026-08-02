package defpackage;

import com.yandex.plus.webview.core.resource.WebViewNavigationReason;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u810 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewNavigationReason.values().length];
        try {
            iArr[WebViewNavigationReason.REDIRECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
