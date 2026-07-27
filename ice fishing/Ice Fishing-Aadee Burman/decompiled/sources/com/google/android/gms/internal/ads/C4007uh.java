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
import p2.C4826a;
import p2.C4835j;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.uh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4007uh extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C2555Fh f34559a;

    public C4007uh(C2555Fh c2555Fh) {
        this.f34559a = c2555Fh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC4061vh)) {
            return webView.getContext();
        }
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) webView;
        Activity j6 = interfaceC4061vh.j();
        return j6 != null ? j6 : interfaceC4061vh.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z3) {
        C2657Lh c2657Lh;
        C4826a c4826a;
        try {
            C2555Fh c2555Fh = this.f34559a;
            if (c2555Fh != null && (c2657Lh = c2555Fh.f24817n.f25061G) != null && (c4826a = c2657Lh.f26142P) != null && c4826a != null && !c4826a.a()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c4826a.b(sb.toString());
                return false;
            }
            u2.D d2 = C4835j.f39730C.f39735c;
            AlertDialog.Builder k9 = u2.D.k(context);
            k9.setTitle(str2);
            if (!z3) {
                k9.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3845rh(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC3845rh(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3792qh(0, jsResult)).create().show();
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
            k9.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC3899sh(0, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC2929ae(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC3792qh(1, jsPromptResult)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e9) {
            int i = u2.z.f41319b;
            v2.i.g("Fail to display Dialog.", e9);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC4061vh)) {
            int i = u2.z.f41319b;
            v2.i.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        BinderC5036d z02 = ((InterfaceC4061vh) webView).z0();
        if (z02 != null) {
            z02.t();
        } else {
            int i6 = u2.z.f41319b;
            v2.i.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        u1.h.i(sb, "JS: ", message, " (", sourceId);
        String d2 = u1.h.d(lineNumber, ":", ")", sb);
        if (d2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AbstractC3953th.f34330a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i6 = u2.z.f41319b;
            v2.i.c(d2);
        } else if (i == 2) {
            int i9 = u2.z.f41319b;
            v2.i.f(d2);
        } else if (i == 3 || i == 4) {
            int i10 = u2.z.f41319b;
            v2.i.e(d2);
        } else if (i != 5) {
            int i11 = u2.z.f41319b;
            v2.i.e(d2);
        } else {
            int i12 = u2.z.f41319b;
            v2.i.a(d2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z6, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        C2657Lh c2657Lh = this.f34559a.f24817n.f25061G;
        if (c2657Lh != null) {
            webView2.setWebViewClient(c2657Lh);
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
            u2.D d2 = C4835j.f39730C.f39735c;
            C2555Fh c2555Fh = this.f34559a;
            boolean z3 = u2.D.c(c2555Fh.getContext(), "android.permission.ACCESS_FINE_LOCATION") || u2.D.c(c2555Fh.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
            C3301ha c3301ha = AbstractC3569ma.Ne;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z3, true);
            }
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Oe)).booleanValue()) {
                int i = u2.z.f41319b;
                v2.i.a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        BinderC5036d z02 = this.f34559a.f24817n.z0();
        if (z02 != null) {
            z02.A();
        } else {
            int i = u2.z.f41319b;
            v2.i.f("Could not get ad overlay when hiding custom view.");
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
        BinderC5036d z02 = this.f34559a.f24817n.z0();
        if (z02 == null) {
            int i6 = u2.z.f41319b;
            v2.i.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = z02.f40823u;
        FrameLayout frameLayout = new FrameLayout(activity);
        z02.f40806A = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        z02.f40806A.addView(view, -1, -1);
        activity.setContentView(z02.f40806A);
        z02.f40816L = true;
        z02.f40807B = customViewCallback;
        z02.f40828z = true;
        z02.Q(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
