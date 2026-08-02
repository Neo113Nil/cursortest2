package io.flutter.plugins.webviewflutter;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.bf41;
import defpackage.bzj0;
import defpackage.dtb0;
import defpackage.e331;
import defpackage.gv40;
import defpackage.m2v;
import defpackage.r941;
import defpackage.rx3;
import defpackage.scc;
import defpackage.tt5;
import defpackage.w4u;
import defpackage.xv10;
import defpackage.zsb0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Result;

/* loaded from: classes4.dex */
public class WebChromeClientProxyApi$WebChromeClientImpl extends WebChromeClientProxyApi$SecureWebChromeClient {
    private static final String TAG = "WebChromeClientImpl";
    private final a api;
    private boolean returnValueForOnShowFileChooser = false;
    private boolean returnValueForOnConsoleMessage = false;
    private boolean returnValueForOnJsAlert = false;
    private boolean returnValueForOnJsConfirm = false;
    private boolean returnValueForOnJsPrompt = false;

    public WebChromeClientProxyApi$WebChromeClientImpl(a aVar) {
        this.api = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onConsoleMessage$7(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onGeolocationPermissionsHidePrompt$4(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onGeolocationPermissionsShowPrompt$3(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onHideCustomView$2(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onJsAlert$8(JsResult jsResult, bzj0 bzj0Var) {
        if (!bzj0Var.d) {
            jsResult.confirm();
            return null;
        }
        xv10 xv10Var = (xv10) this.api.b;
        Throwable th = bzj0Var.c;
        Objects.requireNonNull(th);
        xv10Var.getClass();
        xv10.g(th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onJsConfirm$9(JsResult jsResult, bzj0 bzj0Var) {
        if (!bzj0Var.d) {
            if (Boolean.TRUE.equals(bzj0Var.b)) {
                jsResult.confirm();
                return null;
            }
            jsResult.cancel();
            return null;
        }
        xv10 xv10Var = (xv10) this.api.b;
        Throwable th = bzj0Var.c;
        Objects.requireNonNull(th);
        xv10Var.getClass();
        xv10.g(th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onJsPrompt$10(JsPromptResult jsPromptResult, bzj0 bzj0Var) {
        if (bzj0Var.d) {
            xv10 xv10Var = (xv10) this.api.b;
            Throwable th = bzj0Var.c;
            Objects.requireNonNull(th);
            xv10Var.getClass();
            xv10.g(th);
            return null;
        }
        String str = (String) bzj0Var.b;
        if (str != null) {
            jsPromptResult.confirm(str);
            return null;
        }
        jsPromptResult.cancel();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onPermissionRequest$6(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onProgressChanged$0(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$onShowCustomView$1(Result result) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onShowFileChooser$5(boolean z, ValueCallback valueCallback, bzj0 bzj0Var) {
        if (bzj0Var.d) {
            xv10 xv10Var = (xv10) this.api.b;
            Throwable th = bzj0Var.c;
            Objects.requireNonNull(th);
            xv10Var.getClass();
            xv10.g(th);
            return null;
        }
        List list = (List) bzj0Var.b;
        Objects.requireNonNull(list);
        List list2 = list;
        if (z) {
            Uri[] uriArr = new Uri[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                uriArr[i] = Uri.parse((String) list2.get(i));
            }
            valueCallback.onReceiveValue(uriArr);
        }
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        a aVar = this.api;
        r941 r941Var = new r941(4);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (((w4u) xv10Var.b).k(this)) {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", xv10Var.f(), null).z(scc.g(this, consoleMessage), new zsb0(12, r941Var));
        } else {
            lambda$onConsoleMessage$7(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", ""))));
        }
        return this.returnValueForOnConsoleMessage;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        a aVar = this.api;
        r941 r941Var = new r941(3);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onGeolocationPermissionsHidePrompt$4(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", xv10Var.f(), null).z(Collections.singletonList(this), new zsb0(14, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        a aVar = this.api;
        r941 r941Var = new r941(6);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onGeolocationPermissionsShowPrompt$3(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", xv10Var.f(), null).z(scc.g(this, str, callback), new zsb0(13, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        a aVar = this.api;
        r941 r941Var = new r941(9);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onHideCustomView$2(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", xv10Var.f(), null).z(Collections.singletonList(this), new zsb0(8, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.returnValueForOnJsAlert) {
            return false;
        }
        a aVar = this.api;
        int i = 1;
        gv40 gv40Var = new gv40(20, new bf41(this, jsResult, i));
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (((w4u) xv10Var.b).k(this)) {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", xv10Var.f(), null).z(scc.g(this, webView, str, str2), new dtb0(gv40Var, i));
        } else {
            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", ""))));
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i = 0;
        if (!this.returnValueForOnJsConfirm) {
            return false;
        }
        a aVar = this.api;
        gv40 gv40Var = new gv40(20, new bf41(this, jsResult, i));
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", ""))));
            return true;
        }
        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", xv10Var.f(), null).z(scc.g(this, webView, str, str2), new dtb0(gv40Var, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        int i = 0;
        if (!this.returnValueForOnJsPrompt) {
            return false;
        }
        a aVar = this.api;
        gv40 gv40Var = new gv40(20, new e331(14, this, jsPromptResult));
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", ""))));
            return true;
        }
        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", xv10Var.f(), null).z(scc.g(this, webView, str, str2, str3), new dtb0(gv40Var, i));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        a aVar = this.api;
        r941 r941Var = new r941(8);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onPermissionRequest$6(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", xv10Var.f(), null).z(scc.g(this, permissionRequest), new zsb0(10, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        a aVar = this.api;
        long j = i;
        r941 r941Var = new r941(7);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onProgressChanged$0(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", xv10Var.f(), null).z(scc.g(this, webView, Long.valueOf(j)), new zsb0(9, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        a aVar = this.api;
        r941 r941Var = new r941(5);
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            lambda$onShowCustomView$1(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", ""))));
        } else {
            new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", xv10Var.f(), null).z(scc.g(this, view, customViewCallback), new zsb0(11, r941Var));
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        boolean z = this.returnValueForOnShowFileChooser;
        a aVar = this.api;
        gv40 gv40Var = new gv40(20, new rx3(this, z, valueCallback, 21));
        aVar.getClass();
        xv10 xv10Var = (xv10) aVar.b;
        xv10Var.getClass();
        if (!((w4u) xv10Var.b).k(this)) {
            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", ""))));
            return z;
        }
        new m2v((tt5) xv10Var.a, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", xv10Var.f(), null).z(scc.g(this, webView, fileChooserParams), new dtb0(gv40Var, 2));
        return z;
    }

    public void setReturnValueForOnConsoleMessage(boolean z) {
        this.returnValueForOnConsoleMessage = z;
    }

    public void setReturnValueForOnJsAlert(boolean z) {
        this.returnValueForOnJsAlert = z;
    }

    public void setReturnValueForOnJsConfirm(boolean z) {
        this.returnValueForOnJsConfirm = z;
    }

    public void setReturnValueForOnJsPrompt(boolean z) {
        this.returnValueForOnJsPrompt = z;
    }

    public void setReturnValueForOnShowFileChooser(boolean z) {
        this.returnValueForOnShowFileChooser = z;
    }
}
