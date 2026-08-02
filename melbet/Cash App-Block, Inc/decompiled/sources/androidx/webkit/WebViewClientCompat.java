package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.zipline.CallResult;
import com.fillr.m1;
import com.nimbusds.jose.util.X509CertUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes3.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, CallResult callResult) {
        WebResourceErrorBoundaryInterface webResourceErrorBoundaryInterface = (WebResourceErrorBoundaryInterface) callResult.serviceNames;
        if (WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            if (((WebResourceError) callResult.result) == null) {
                m1 m1Var = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
                callResult.result = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) m1Var.a).convertWebResourceError(Proxy.getInvocationHandler(webResourceErrorBoundaryInterface));
            }
            int errorCode = ((WebResourceError) callResult.result).getErrorCode();
            if (((WebResourceError) callResult.result) == null) {
                m1 m1Var2 = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
                callResult.result = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) m1Var2.a).convertWebResourceError(Proxy.getInvocationHandler(webResourceErrorBoundaryInterface));
            }
            onReceivedError(webView, errorCode, ((WebResourceError) callResult.result).getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        SafeBrowsingResponseBoundaryInterface safeBrowsingResponseBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) X509CertUtils.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        if (!WebViewFeature.isFeatureSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL.getClass();
        m1 m1Var = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
        ((SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) m1Var.a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(safeBrowsingResponseBoundaryInterface))).showInterstitial(true);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (WebViewFeature.isFeatureSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL.getClass();
            if (safeBrowsingResponse == null) {
                m1 m1Var = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
                safeBrowsingResponse = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) m1Var.a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(null));
            }
            safeBrowsingResponse.showInterstitial(true);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CallResult callResult = new CallResult();
        callResult.result = webResourceError;
        onReceivedError(webView, webResourceRequest, callResult);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        CallResult callResult = new CallResult();
        callResult.serviceNames = (WebResourceErrorBoundaryInterface) X509CertUtils.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, callResult);
    }
}
