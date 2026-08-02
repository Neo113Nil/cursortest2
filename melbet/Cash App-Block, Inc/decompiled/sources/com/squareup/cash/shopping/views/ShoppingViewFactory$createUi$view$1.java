package com.squareup.cash.shopping.views;

import android.webkit.WebView;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.shopping.web.RealShoppingWebCheckoutCookieManager;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.shopping.web.ShoppingWebBridge$Factory$Impl;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.webview.android.WebViewProvider;
import dev.zacsweers.metro.Provider;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShoppingViewFactory$createUi$view$1 extends FunctionReferenceImpl implements Function7 {
    public ShoppingViewFactory$createUi$view$1(Object obj) {
        super(7, 0, ShoppingWebBridge$Factory$Impl.class, obj, "create", "create(Lkotlinx/coroutines/CoroutineScope;Landroid/webkit/WebView;ZZLjava/lang/String;Ljava/lang/String;Z)Lcom/squareup/cash/shopping/web/ShoppingWebBridge;");
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        WebView webView = (WebView) obj2;
        boolean booleanValue = ((Boolean) serializable).booleanValue();
        coroutineScope.getClass();
        webView.getClass();
        ShoppingWebBridge$Factory$Impl shoppingWebBridge$Factory$Impl = (ShoppingWebBridge$Factory$Impl) this.receiver;
        shoppingWebBridge$Factory$Impl.getClass();
        Instrument$Adapter instrument$Adapter = shoppingWebBridge$Factory$Impl.delegateFactory;
        RealShoppingWebCheckoutCookieManager realShoppingWebCheckoutCookieManager = (RealShoppingWebCheckoutCookieManager) ((WalletUiFactory$MetroFactory) instrument$Adapter.cash_instrument_typeAdapter).invoke();
        RealAutofillWebManagerProvider realAutofillWebManagerProvider = (RealAutofillWebManagerProvider) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
        WebViewProvider webViewProvider = (WebViewProvider) ((Provider) instrument$Adapter.balance_currencyAdapter).invoke();
        realAutofillWebManagerProvider.getClass();
        webViewProvider.getClass();
        return new ShoppingWebBridge(coroutineScope, webView, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (String) obj5, (String) obj6, booleanValue, realShoppingWebCheckoutCookieManager, realAutofillWebManagerProvider, webViewProvider);
    }
}
