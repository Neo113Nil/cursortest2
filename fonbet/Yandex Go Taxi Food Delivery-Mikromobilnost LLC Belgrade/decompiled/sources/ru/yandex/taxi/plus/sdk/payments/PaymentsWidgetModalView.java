package ru.yandex.taxi.plus.sdk.payments;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.b;
import defpackage.ffh0;
import defpackage.frh0;
import defpackage.joa0;
import defpackage.koa0;
import defpackage.loa0;
import defpackage.ooa0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.zka0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0002\u0019\u001c\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/PaymentsWidgetModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lloa0;", "Landroid/content/Context;", "context", "Looa0;", "presenter", "Lzka0;", "paymentWidgetWebInterface", "<init>", "(Landroid/content/Context;Looa0;Lzka0;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "url", "openUrl", "(Ljava/lang/String;)V", "onDetachedFromWindow", "close", "Looa0;", "Lzka0;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "joa0", "callback", "Ljoa0;", "koa0", "onBackPressedCallback", "Lkoa0;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentsWidgetModalView extends SlideableModalView implements loa0 {
    private final joa0 callback;
    private final koa0 onBackPressedCallback;
    private final zka0 paymentWidgetWebInterface;
    private final ooa0 presenter;
    private final WebView webView;

    public PaymentsWidgetModalView(Context context, ooa0 ooa0Var, zka0 zka0Var) {
        super(context);
        this.presenter = ooa0Var;
        this.paymentWidgetWebInterface = zka0Var;
        setInterceptOnBackPress(false);
        setDismissOnTouchOutside(true);
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        int i = ffh0.payment_widget_webview;
        WeakHashMap weakHashMap = b.a;
        WebView webView = (WebView) ((View) rp31.d(this, i));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.addJavascriptInterface(zka0Var, "__webviewPaymentWidget");
        webView.setWebViewClient(new WebViewClient());
        this.webView = webView;
        this.callback = new joa0(this);
        this.onBackPressedCallback = new koa0(this);
    }

    @Override // defpackage.loa0
    public void close() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return frh0.payment_widget_modal_view;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.paymentWidgetWebInterface.c = this.callback;
        ooa0 ooa0Var = this.presenter;
        ooa0Var.a = this;
        openUrl(ooa0Var.d);
        tje.a0(getContext(), this.onBackPressedCallback);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.paymentWidgetWebInterface.c = null;
        ooa0 ooa0Var = this.presenter;
        boolean z = ooa0Var.c;
        ooa0Var.a = ooa0Var.b;
        this.onBackPressedCallback.g();
    }

    @Override // defpackage.loa0
    public void openUrl(String url) {
        this.webView.loadUrl(url);
    }
}
