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
import p2.C4856a;
import s2.BinderC4996d;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3805qh extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C2486Bh f33739a;

    public C3805qh(C2486Bh c2486Bh) {
        this.f33739a = c2486Bh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC3858rh)) {
            return webView.getContext();
        }
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) webView;
        Activity h9 = interfaceC3858rh.h();
        return h9 != null ? h9 : interfaceC3858rh.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z8) {
        C2588Hh c2588Hh;
        C4856a c4856a;
        try {
            C2486Bh c2486Bh = this.f33739a;
            if (c2486Bh != null && (c2588Hh = c2486Bh.f24059n.f24472G) != null && (c4856a = c2588Hh.f25395P) != null && c4856a != null && !c4856a.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c4856a.b(sb.toString());
                return false;
            }
            t2.G g9 = p2.j.f39798C.f39803c;
            AlertDialog.Builder k6 = t2.G.k(context);
            k6.setTitle(str2);
            if (!z8) {
                k6.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3643nh(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3643nh(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3589mh(0, jsResult)).create().show();
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
            k6.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC2868Xp(2, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC2856Xd(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3589mh(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Fail to display Dialog.", e6);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC3858rh)) {
            int i = t2.C.f40822b;
            u2.i.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC4996d w02 = ((InterfaceC3858rh) webView).w0();
        if (w02 != null) {
            w02.z();
        } else {
            int i4 = t2.C.f40822b;
            u2.i.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        AbstractC5051n.j(sb, "JS: ", message, " (", sourceId);
        String d2 = AbstractC5051n.d(lineNumber, ":", ")", sb);
        if (d2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC3697oh.f33177a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i4 = t2.C.f40822b;
            u2.i.c(d2);
        } else if (i == 2) {
            int i9 = t2.C.f40822b;
            u2.i.f(d2);
        } else if (i == 3 || i == 4) {
            int i10 = t2.C.f40822b;
            u2.i.e(d2);
        } else if (i != 5) {
            int i11 = t2.C.f40822b;
            u2.i.e(d2);
        } else {
            int i12 = t2.C.f40822b;
            u2.i.a(d2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        C2588Hh c2588Hh = this.f33739a.f24059n.f24472G;
        if (c2588Hh != null) {
            webView2.setWebViewClient(c2588Hh);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j9, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        long j12 = 5242880 - j11;
        if (j12 <= 0) {
            quotaUpdater.updateQuota(j9);
            return;
        }
        if (j9 == 0) {
            if (j10 > j12 || j10 > 1048576) {
                j10 = 0;
            }
        } else if (j10 == 0) {
            j10 = Math.min(Math.min(131072L, j12) + j9, 1048576L);
        } else {
            if (j10 <= Math.min(1048576 - j9, j12)) {
                j9 += j10;
            }
            j10 = j9;
        }
        quotaUpdater.updateQuota(j10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            t2.G g9 = p2.j.f39798C.f39803c;
            C2486Bh c2486Bh = this.f33739a;
            boolean z8 = t2.G.c(c2486Bh.getContext(), "android.permission.ACCESS_FINE_LOCATION") || t2.G.c(c2486Bh.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            C3151ea c3151ea = AbstractC3368ia.He;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z8, true);
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ie)).booleanValue()) {
                int i = t2.C.f40822b;
                u2.i.a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC4996d w02 = this.f33739a.f24059n.w0();
        if (w02 != null) {
            w02.x();
        } else {
            int i = t2.C.f40822b;
            u2.i.f("Could not get ad overlay when hiding custom view.");
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
        BinderC4996d w02 = this.f33739a.f24059n.w0();
        if (w02 == null) {
            int i4 = t2.C.f40822b;
            u2.i.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = w02.f40455u;
        FrameLayout frameLayout = new FrameLayout(activity);
        w02.f40438A = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        w02.f40438A.addView(view, -1, -1);
        activity.setContentView(w02.f40438A);
        w02.f40448L = true;
        w02.f40439B = customViewCallback;
        w02.f40460z = true;
        w02.N3(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
