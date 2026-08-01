package com.google.android.datatransport;

import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFunctionHelper extends WebChromeClient {
    public final WinterFlowCompilerMapper WinterFlowArrayNetwork;
    public final WinterFlowCompilerMapper WinterFlowCacheManagerAgent;
    public final WinterFlowCompilerMapper WinterFlowHookDataSource;
    public final WinterFlowJSONDecorator WinterFlowRouterStructure;

    public WinterFlowFunctionHelper(WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowCompilerMapper winterFlowCompilerMapper, WinterFlowCompilerMapper winterFlowCompilerMapper2, WinterFlowCompilerMapper winterFlowCompilerMapper3) {
        winterFlowCompilerMapper.getClass();
        winterFlowCompilerMapper2.getClass();
        winterFlowCompilerMapper3.getClass();
        this.WinterFlowRouterStructure = winterFlowJSONDecorator;
        this.WinterFlowHookDataSource = winterFlowCompilerMapper;
        this.WinterFlowCacheManagerAgent = winterFlowCompilerMapper2;
        this.WinterFlowArrayNetwork = winterFlowCompilerMapper3;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (webView == null || message == null) {
            return false;
        }
        this.WinterFlowRouterStructure.WinterFlowUnitTestResponse(new WinterFlowRepositoryOrchestration(webView, message));
        return Boolean.TRUE.booleanValue();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.WinterFlowCacheManagerAgent.WinterFlowUnitTestResponse(new WinterFlowVersionControlProcess(permissionRequest));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.WinterFlowArrayNetwork.WinterFlowUnitTestResponse(new WinterFlowServerCloud(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return ((Boolean) this.WinterFlowHookDataSource.WinterFlowUnitTestResponse(new WinterFlowAPIGateway(valueCallback))).booleanValue();
    }
}
