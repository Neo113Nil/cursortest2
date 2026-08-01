package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.ColdActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowEncryptionSystem implements WinterFlowObjectSession {
    public final /* synthetic */ ColdActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowEncryptionSystem(ColdActivity coldActivity, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = coldActivity;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        ColdActivity coldActivity = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final WebView webView = (WebView) obj;
                int i2 = ColdActivity.WinterFlowUserManagerUserManager;
                webView.getClass();
                WinterFlowRendererProxy winterFlowRendererProxy = coldActivity.WinterFlowEventEmitterController;
                if (winterFlowRendererProxy == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("defaultWebViewClient");
                    throw null;
                }
                WinterFlowFunctionHelper winterFlowFunctionHelper = coldActivity.WinterFlowArrayHelper;
                if (winterFlowFunctionHelper == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("defaultChromeClient");
                    throw null;
                }
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.setAcceptThirdPartyCookies(webView, true);
                webView.setWebChromeClient(winterFlowFunctionHelper);
                webView.setWebViewClient(winterFlowRendererProxy);
                webView.setDownloadListener(new DownloadListener() { // from class: com.google.android.datatransport.WinterFlowLibraryStructure
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        Context context = webView.getContext();
                        str.getClass();
                        Uri parse = Uri.parse(str);
                        parse.getClass();
                        context.startActivity(new Intent("android.intent.action.VIEW", parse));
                    }
                });
                webView.setLayerType(2, null);
                webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                WebSettings settings = webView.getSettings();
                settings.getClass();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setBuiltInZoomControls(true);
                settings.setDisplayZoomControls(false);
                settings.setMediaPlaybackRequiresUserGesture(false);
                settings.setMixedContentMode(0);
                settings.setSupportMultipleWindows(true);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                Context context = (Context) obj;
                int i3 = ColdActivity.WinterFlowUserManagerUserManager;
                context.getClass();
                WebView webView2 = new WebView(context);
                coldActivity.WinterFlowCacheManagerListener.WinterFlowUnitTestResponse(webView2);
                try {
                    WebSettings settings2 = webView2.getSettings();
                    String userAgentString = webView2.getSettings().getUserAgentString();
                    userAgentString.getClass();
                    settings2.setUserAgentString(WinterFlowHookModule.WinterFlowMapperProtocol(userAgentString, "; wv", ""));
                } catch (Throwable unused) {
                }
                coldActivity.WinterFlowServerProtocol().addView(webView2);
                webView2.loadUrl((String) ((WinterFlowRequestHandler) coldActivity.WinterFlowPackageIDE.getValue()).WinterFlowArrayNetwork.WinterFlowVariableVersionControl.getValue());
                return coldActivity.WinterFlowServerProtocol();
        }
    }
}
