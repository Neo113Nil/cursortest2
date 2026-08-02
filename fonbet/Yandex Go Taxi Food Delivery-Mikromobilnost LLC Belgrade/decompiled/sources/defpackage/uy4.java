package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.WebViewType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class uy4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewType.values().length];
        try {
            iArr[WebViewType.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewType.STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
