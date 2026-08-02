package com.netcetera.threeds.sdk.infrastructure;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.netcetera.threeds.sdk.infrastructure.x;

/* loaded from: classes5.dex */
public class ar extends x {
    private static int getWarnings = 1;
    private static int initialize;

    public ar(x.get getVar, Handler handler) {
        super(getVar, handler);
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ar arVar = new ar((x.get) objArr[0], new Handler(Looper.getMainLooper()));
        int i = initialize;
        int i2 = i & 37;
        int i3 = -(-((i ^ 37) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            return arVar;
        }
        throw null;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.x
    public void aB_(Uri uri) {
        int i = getWarnings;
        int i2 = i & 57;
        int i3 = (i ^ 57) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.x, android.webkit.WebViewClient
    public /* bridge */ /* synthetic */ WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        initialize = (getWarnings + 9) % 128;
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        int i = initialize;
        getWarnings = ((i & 83) + (i | 83)) % 128;
        return shouldInterceptRequest;
    }

    public static ar get(x.get getVar) {
        return (ar) initialize(new Object[]{getVar}, -769679435, 769679435, (int) System.currentTimeMillis());
    }
}
