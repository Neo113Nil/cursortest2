package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class CatchingFishViewMockkFlux {
    public static void CatchingFishParcelableFAB(final WebView webView, boolean z, CatchingFishToolbarMVVM catchingFishToolbarMVVM, WebViewClient webViewClient) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(webView, "webView");
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToolbarMVVM, "chromeClient");
        CatchingFishFirebaseDagger.CatchingFishNavigation(webViewClient, "navigationClient");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        cookieManager.setAcceptCookie(true);
        webView.setDownloadListener(new DownloadListener() { // from class: kotlin.text.CatchingFishFABCustomView
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Context context = webView.getContext();
                CatchingFishFirebaseDagger.CatchingFishAnimationMockk(str);
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        });
        webView.setWebChromeClient(catchingFishToolbarMVVM);
        webView.setWebViewClient(webViewClient);
        webView.setVisibility(z ? 4 : 0);
        webView.setLayerType(2, null);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = webView.getSettings();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMixedContentMode(0);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
    }
}
