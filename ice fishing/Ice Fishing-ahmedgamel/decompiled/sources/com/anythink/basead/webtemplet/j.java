package com.anythink.basead.webtemplet;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    WTWebView f12302a;

    /* renamed from: b, reason: collision with root package name */
    g f12303b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12304c = com.anythink.expressad.foundation.d.j.cD;

    /* renamed from: d, reason: collision with root package name */
    private c f12305d;

    /* renamed from: com.anythink.basead.webtemplet.j$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12306a;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            f12306a = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12306a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12306a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12306a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12306a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void a(WTWebView wTWebView) {
        this.f12302a = wTWebView;
        this.f12303b = new g(wTWebView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.messageLevel() == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = AnonymousClass1.f12306a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
        } else if (i == 2 || i == 3) {
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
        } else {
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        if (this.f12303b == null) {
            return super.onConsoleMessage(consoleMessage);
        }
        String message = consoleMessage.message();
        if (TextUtils.isEmpty(message) || !message.startsWith(h.f12296a) || !this.f12303b.a(h.f12296a)) {
            return super.onConsoleMessage(consoleMessage);
        }
        this.f12303b.c(message);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
    }

    public final void a(c cVar) {
        this.f12305d = cVar;
    }
}
