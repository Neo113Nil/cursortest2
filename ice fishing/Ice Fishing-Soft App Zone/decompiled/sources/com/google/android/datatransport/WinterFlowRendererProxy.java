package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererProxy extends WebViewClient {
    public final WinterFlowConfigurationModule WinterFlowRouterStructure;

    public WinterFlowRendererProxy(WinterFlowConfigurationModule winterFlowConfigurationModule) {
        this.WinterFlowRouterStructure = winterFlowConfigurationModule;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Boolean bool;
        Context context;
        Object winterFlowDecoratorTool;
        String str;
        Context context2;
        String str2 = null;
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        Set<String> set = (Set) this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str3 : set) {
                str3.getClass();
                if (valueOf.startsWith(str3)) {
                    if (webView != null && (context = webView.getContext()) != null) {
                        try {
                            if (valueOf.startsWith("intent://")) {
                                int WinterFlowBackendCacheManager = WinterFlowFrameworkStrategy.WinterFlowBackendCacheManager(valueOf, "#Intent;", 0, false);
                                str = WinterFlowBackendCacheManager == -1 ? valueOf : valueOf.substring(0, WinterFlowBackendCacheManager);
                                int WinterFlowBackendCacheManager2 = WinterFlowFrameworkStrategy.WinterFlowBackendCacheManager(str, "intent://", 0, false);
                                if (WinterFlowBackendCacheManager2 >= 0) {
                                    int length = "intent://".length() + WinterFlowBackendCacheManager2;
                                    if (length >= WinterFlowBackendCacheManager2) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append((CharSequence) str, 0, WinterFlowBackendCacheManager2);
                                        sb.append((CharSequence) "https://");
                                        sb.append((CharSequence) str, length, str.length());
                                        str = sb.toString();
                                    } else {
                                        WinterFlowEventEmitterOrchestration.WinterFlowArrayNetwork(length, WinterFlowBackendCacheManager2, ") is less than start index (", "End index (");
                                        str = null;
                                    }
                                }
                            } else {
                                str = valueOf;
                            }
                            Uri parse = Uri.parse(str);
                            parse.getClass();
                            context.startActivity(new Intent("android.intent.action.VIEW", parse));
                            winterFlowDecoratorTool = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        } catch (Throwable th) {
                            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
                        }
                        if (WinterFlowRendererStructure.WinterFlowRouterStructure(winterFlowDecoratorTool) != null && valueOf.startsWith("intent://")) {
                            Pattern compile = Pattern.compile("S\\.browser_fallback_url=([^;]+)");
                            compile.getClass();
                            Matcher matcher = compile.matcher(valueOf);
                            matcher.getClass();
                            WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, valueOf);
                            if (WinterFlowTransactionAgent != null) {
                                WinterFlowWebsocketEngine winterFlowWebsocketEngine = (WinterFlowWebsocketEngine) WinterFlowTransactionAgent.WinterFlowRouterRouter;
                                if (winterFlowWebsocketEngine == null) {
                                    winterFlowWebsocketEngine = new WinterFlowWebsocketEngine(WinterFlowTransactionAgent);
                                    WinterFlowTransactionAgent.WinterFlowRouterRouter = winterFlowWebsocketEngine;
                                }
                                str2 = URLDecoder.decode((String) winterFlowWebsocketEngine.get(1), WinterFlowDataSourceRepository.WinterFlowRouterStructure.name());
                            }
                            if (str2 != null) {
                                try {
                                    Uri parse2 = Uri.parse(str2);
                                    parse2.getClass();
                                    context.startActivity(new Intent("android.intent.action.VIEW", parse2));
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                    bool = Boolean.TRUE;
                    return bool.booleanValue();
                }
            }
        }
        if (valueOf.startsWith("http")) {
            bool = Boolean.FALSE;
        } else {
            if (webView != null && (context2 = webView.getContext()) != null) {
                try {
                    context2.startActivity(Intent.parseUri(valueOf, 1));
                } catch (Throwable unused2) {
                }
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        return bool.booleanValue();
    }
}
