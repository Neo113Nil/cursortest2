package defpackage;

import com.ybsdk.feature.webview.api.WebViewHeader;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class sp41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WebViewHeader.values().length];
        try {
            iArr[WebViewHeader.X_YABANK_SESSION_UUID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebViewHeader.HEADER_AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebViewHeader.SDK_USER_AGENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebViewHeader.HEADER_ACCEPT_LANGUAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
