package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import r2.C4896a;
import r2.C4906k;
import v2.BinderC5100d;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4030uh extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C2575Fh f35331a;

    public C4030uh(C2575Fh c2575Fh) {
        this.f35331a = c2575Fh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC4084vh)) {
            return webView.getContext();
        }
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) webView;
        Activity j6 = interfaceC4084vh.j();
        return j6 != null ? j6 : interfaceC4084vh.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z6) {
        C2677Lh c2677Lh;
        C4896a c4896a;
        try {
            C2575Fh c2575Fh = this.f35331a;
            if (c2575Fh != null && (c2677Lh = c2575Fh.f25606n.f25846G) != null && (c4896a = c2677Lh.f26939P) != null && c4896a != null && !c4896a.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c4896a.b(sb.toString());
                return false;
            }
            w2.D d9 = C4906k.f40186C.f40191c;
            AlertDialog.Builder k9 = w2.D.k(context);
            k9.setTitle(str2);
            if (!z6) {
                k9.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3868rh(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3868rh(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3815qh(0, jsResult)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            k9.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3922sh(0, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC2952ae(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3815qh(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Fail to display Dialog.", e9);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC4084vh)) {
            int i = w2.z.f41712b;
            x2.i.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC5100d y02 = ((InterfaceC4084vh) webView).y0();
        if (y02 != null) {
            y02.t();
        } else {
            int i4 = w2.z.f41712b;
            x2.i.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        AbstractC5128c.h(sb, "JS: ", message, " (", sourceId);
        String d9 = AbstractC5128c.d(lineNumber, ":", ")", sb);
        if (d9.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC3976th.f35109a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i4 = w2.z.f41712b;
            x2.i.c(d9);
        } else if (i == 2) {
            int i6 = w2.z.f41712b;
            x2.i.f(d9);
        } else if (i == 3 || i == 4) {
            int i9 = w2.z.f41712b;
            x2.i.e(d9);
        } else if (i != 5) {
            int i10 = w2.z.f41712b;
            x2.i.e(d9);
        } else {
            int i11 = w2.z.f41712b;
            x2.i.a(d9);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z9, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        C2677Lh c2677Lh = this.f35331a.f25606n.f25846G;
        if (c2677Lh != null) {
            webView2.setWebViewClient(c2677Lh);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j6, long j9, long j10, WebStorage.QuotaUpdater quotaUpdater) {
        long j11 = 5242880 - j10;
        if (j11 <= 0) {
            quotaUpdater.updateQuota(j6);
            return;
        }
        if (j6 == 0) {
            if (j9 > j11 || j9 > 1048576) {
                j9 = 0;
            }
        } else if (j9 == 0) {
            j9 = Math.min(Math.min(131072L, j11) + j6, 1048576L);
        } else {
            if (j9 <= Math.min(1048576 - j6, j11)) {
                j6 += j9;
            }
            j9 = j6;
        }
        quotaUpdater.updateQuota(j9);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            w2.D d9 = C4906k.f40186C.f40191c;
            C2575Fh c2575Fh = this.f35331a;
            boolean z6 = w2.D.c(c2575Fh.getContext(), "android.permission.ACCESS_FINE_LOCATION") || w2.D.c(c2575Fh.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            C3324ha c3324ha = AbstractC3592ma.Ne;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z6, true);
            }
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Oe)).booleanValue()) {
                int i = w2.z.f41712b;
                x2.i.a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC5100d y02 = this.f35331a.f25606n.y0();
        if (y02 != null) {
            y02.A();
        } else {
            int i = w2.z.f41712b;
            x2.i.f("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        BinderC5100d y02 = this.f35331a.f25606n.y0();
        if (y02 == null) {
            int i4 = w2.z.f41712b;
            x2.i.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = y02.f41114u;
        FrameLayout frameLayout = new FrameLayout(activity);
        y02.f41097A = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        y02.f41097A.addView(view, -1, -1);
        activity.setContentView(y02.f41097A);
        y02.f41107L = true;
        y02.f41098B = customViewCallback;
        y02.f41119z = true;
        y02.Q(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
