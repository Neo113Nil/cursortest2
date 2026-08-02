package com.squareup.cash.shopping.web;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.util.android.Intents;
import com.squareup.util.android.coroutines.ViewKt;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final class ShoppingWebChromeClient extends WebChromeClient {
    public final /* synthetic */ int $r8$classId;
    public final Object shoppingWebBridge;

    public ShoppingWebChromeClient(ShoppingWebBridge shoppingWebBridge) {
        this.$r8$classId = 0;
        this.shoppingWebBridge = shoppingWebBridge;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        switch (this.$r8$classId) {
            case 0:
                super.onProgressChanged(webView, i);
                if (webView != null) {
                    ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new MoneyTabUIKt$MoneyTabLoaded$1$1(this, i, webView, (Continuation) null, 10));
                    return;
                }
                return;
            case 1:
            default:
                super.onProgressChanged(webView, i);
                return;
            case 2:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.shoppingWebBridge;
                ProgressBar progressBar = financialConnectionsSheetLiteActivity.progressBar;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    throw null;
                }
                progressBar.setVisibility(i < 100 ? 0 : 8);
                ProgressBar progressBar2 = financialConnectionsSheetLiteActivity.progressBar;
                if (progressBar2 != null) {
                    progressBar2.setProgress(i);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    throw null;
                }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        switch (this.$r8$classId) {
            case 0:
                webView.getClass();
                str.getClass();
                super.onReceivedTitle(webView, str);
                ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebBridge$loadUrl$1(this, str, null, 13));
                break;
            default:
                super.onReceivedTitle(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        switch (this.$r8$classId) {
            case 1:
                if (fileChooserParams == null || (createIntent = fileChooserParams.createIntent()) == null) {
                    return false;
                }
                TaxWebAppBridge taxWebAppBridge = (TaxWebAppBridge) this.shoppingWebBridge;
                String type2 = createIntent.getType();
                if (type2 == null) {
                    type2 = "*/*";
                }
                if (StringsKt.contains((CharSequence) type2, (CharSequence) "image/", false)) {
                    JobKt.launch$default(taxWebAppBridge.getScope(), null, null, new TaxWebAppBridge.AnonymousClass3(taxWebAppBridge, (Object) this, (Continuation) null, 5), 3);
                    taxWebAppBridge.webviewUploadCallback = valueCallback;
                } else {
                    if (!Intents.maybeStartActivityForResult(taxWebAppBridge.activity, createIntent, 7)) {
                        return false;
                    }
                    taxWebAppBridge.webviewUploadCallback = valueCallback;
                }
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public /* synthetic */ ShoppingWebChromeClient(Object obj, int i) {
        this.$r8$classId = i;
        this.shoppingWebBridge = obj;
    }
}
