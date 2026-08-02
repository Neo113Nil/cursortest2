package com.yandex.passport.internal.ui.challenge.vpn;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.cz0;
import defpackage.etn;
import defpackage.ki7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d extends WebChromeClient {
    public final /* synthetic */ int a = 0;
    public final Context b;
    public final Object c;
    public final Object d;

    public d(Context context, Function1 function1, Function2 function2) {
        context.getClass();
        this.b = context;
        this.c = function1;
        this.d = function2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.a) {
            case 0:
                Object obj = message != null ? message.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                WebView webView2 = new WebView(this.b);
                webView2.setWebViewClient(new ki7(1, (y) this.c, (Activity) this.d));
                webViewTransport.setWebView(webView2);
                message.sendToTarget();
                return true;
            default:
                return super.onCreateWindow(webView, z, z2, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        switch (this.a) {
            case 1:
                if (permissionRequest != null) {
                    cz0 cz0Var = new cz0(0);
                    cz0 cz0Var2 = new cz0(0);
                    String[] resources = permissionRequest.getResources();
                    resources.getClass();
                    for (String str : resources) {
                        str.getClass();
                        String str2 = str.equals("android.webkit.resource.VIDEO_CAPTURE") ? "android.permission.CAMERA" : null;
                        if (str2 != null) {
                            if (etn.z(this.b, str2) == 0) {
                                cz0Var.add(str);
                            } else {
                                cz0Var2.add(str2);
                            }
                        }
                    }
                    Function2 function2 = (Function2) this.d;
                    if (function2 != null) {
                        function2.invoke(cz0Var2, new com.yandex.plus.bdui.templating.render.a(permissionRequest, cz0Var, this));
                        break;
                    }
                }
                break;
            default:
                super.onPermissionRequest(permissionRequest);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.a) {
            case 1:
                webView.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                Function1 function1 = (Function1) this.c;
                if (function1 == null) {
                    return true;
                }
                function1.invoke(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.l(1, valueCallback, ValueCallback.class, "onReceiveValue", "onReceiveValue(Ljava/lang/Object;)V", 0, 20));
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public d(Context context, y yVar, Activity activity) {
        this.b = context;
        this.c = yVar;
        this.d = activity;
    }
}
