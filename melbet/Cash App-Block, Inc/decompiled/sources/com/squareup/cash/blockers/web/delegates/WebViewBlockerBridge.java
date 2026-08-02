package com.squareup.cash.blockers.web.delegates;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.glance.appwidget.NormalizeCompositionTreeKt;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.blockers.web.viewmodels.WebBlockerBridgeCommand$RefreshCommand;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.common.web.UriSchemeKt;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WebViewBlockerFillrAndroid;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.stripe.android.view.PaymentAuthWebChromeClient;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.internal.ContextScope;
import papa.PapaEvent;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class WebViewBlockerBridge implements WebAppBridge {
    public final AggregateAutofillWebManager autofillManager;
    public final ContextScope scope;
    public final WebViewBlockerCookieManager webBlockerCookieManager;
    public final BufferedChannel webEvents;
    public final WebView webView;

    public WebViewBlockerBridge(CoroutineScope coroutineScope, WebView webView, boolean z, boolean z2, WebViewBlockerCookieManager webViewBlockerCookieManager, FeatureFlagManager featureFlagManager, RealAutofillWebManagerProvider realAutofillWebManagerProvider) {
        this.webView = webView;
        this.webBlockerCookieManager = webViewBlockerCookieManager;
        AggregateAutofillWebManager aggregateAutofillWebManager = realAutofillWebManagerProvider.get(null);
        this.autofillManager = aggregateAutofillWebManager;
        ContextScope plus = JobKt.plus(new CoroutineName(WebViewBlockerBridge.class.getName()), coroutineScope);
        JobKt.launch$default(plus, null, CoroutineStart.UNDISPATCHED, new CardModelView.AnonymousClass1.C00581(this, null, 12), 1);
        this.scope = plus;
        BufferedChannel Channel$default = PapaEvent.Channel$default(-1, null, null, 6);
        this.webEvents = Channel$default;
        boolean z3 = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$WebViewBlockerFillrAndroid.INSTANCE)).enabled() && z;
        WebBlockerWebViewClient webBlockerWebViewClient = new WebBlockerWebViewClient(Channel$default, coroutineScope, aggregateAutofillWebManager, z2);
        PaymentAuthWebChromeClient paymentAuthWebChromeClient = new PaymentAuthWebChromeClient(coroutineScope, Channel$default);
        aggregateAutofillWebManager.fillrManager.enabled = z3;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(!z2);
        if (z2) {
            String userAgentString = settings.getUserAgentString();
            userAgentString.getClass();
            settings.setUserAgentString(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(userAgentString, "; wv", ""), "Version/4.0 ", ""));
        }
        settings.setMixedContentMode(2);
        webView.setWebViewClient(webBlockerWebViewClient);
        webView.setWebChromeClient(paymentAuthWebChromeClient);
        CookieManager cookieManager = ((RealWebViewBlockerCookieManager) webViewBlockerCookieManager).cookieManager.cookieManager();
        if (cookieManager != null) {
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
        aggregateAutofillWebManager.registerWebView(webView);
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final ReceiveChannel getWebEvents() {
        return this.webEvents;
    }

    public final void loadUrl(String str, List list) {
        str.getClass();
        list.getClass();
        Uri parse = Uri.parse(str);
        parse.getClass();
        Uri https = UriSchemeKt.toHttps(parse);
        if (!str.equals(https.toString())) {
            Timber.Forest.e("Attempted to load http url in the blocker webview: ".concat(str), new Object[0]);
        }
        JobKt.launch$default(this.scope, null, null, new WebViewBlockerBridge$loadUrl$1(this, https, str, list, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void sendWebCommand(NormalizeCompositionTreeKt normalizeCompositionTreeKt) {
        if (((WebBlockerBridgeCommand$RefreshCommand) normalizeCompositionTreeKt) instanceof WebBlockerBridgeCommand$RefreshCommand) {
            this.webView.reload();
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.cash.common.web.WebAppBridge
    public final void loadUrl(String str) {
        str.getClass();
        loadUrl(str, EmptyList.INSTANCE);
    }
}
