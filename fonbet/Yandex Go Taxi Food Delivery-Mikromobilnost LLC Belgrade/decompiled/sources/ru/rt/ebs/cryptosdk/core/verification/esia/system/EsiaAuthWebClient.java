package ru.rt.ebs.cryptosdk.core.verification.esia.system;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import defpackage.pme;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.EsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.SslErrorEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaErrorResult;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptRequest;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptResult;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b*\u0010)J-\u0010-\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J5\u0010-\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010/\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b-\u00100J#\u00101\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b1\u00102J-\u00106\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u00104\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b6\u00107J%\u00108\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00170?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/system/EsiaAuthWebClient;", "Landroid/webkit/WebViewClient;", "Lru/rt/ebs/cryptosdk/core/verification/esia/system/IEsiaAuthWebClientListener;", "listener", "Lru/rt/ebs/cryptosdk/core/verification/esia/controllers/IEsiaController;", "esiaController", "Lru/rt/ebs/cryptosdk/core/verification/esia/system/FormDataRecorder;", FormDataRecorder.interfaceName, "<init>", "(Lru/rt/ebs/cryptosdk/core/verification/esia/system/IEsiaAuthWebClientListener;Lru/rt/ebs/cryptosdk/core/verification/esia/controllers/IEsiaController;Lru/rt/ebs/cryptosdk/core/verification/esia/system/FormDataRecorder;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "isSupportTlsHost", "(Landroid/net/Uri;)Z", "isIgnoreHost", "Landroid/webkit/WebResourceResponse;", "getEmptyWebResourceResponse", "()Landroid/webkit/WebResourceResponse;", "Landroid/webkit/WebResourceRequest;", "request", "executeRequest", "(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "body", "onProcessUrl", "(Landroid/webkit/WebResourceRequest;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "onSetErrorCode", "(ILjava/lang/String;)Z", "Landroid/webkit/WebView;", "view", "url", "Landroid/graphics/Bitmap;", "favicon", "Lzy11;", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onPageCommitVisible", "Landroid/webkit/WebResourceError;", "error", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "failingUrl", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "onReceivedSslError", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Lru/rt/ebs/cryptosdk/core/verification/esia/system/FormDataRecorder;", "Ljava/lang/ref/WeakReference;", "refListener", "Ljava/lang/ref/WeakReference;", "refEsiaController", "", "blackList", "Ljava/util/List;", "Companion", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EsiaAuthWebClient extends WebViewClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LOGGER_TAG = "ESIA--->";
    private final List<String> blackList = Collections.singletonList("af.gosuslugi.ru");
    private final FormDataRecorder formDataRecorder;
    private final WeakReference<IEsiaController> refEsiaController;
    private final WeakReference<IEsiaAuthWebClientListener> refListener;

    public EsiaAuthWebClient(IEsiaAuthWebClientListener iEsiaAuthWebClientListener, IEsiaController iEsiaController, FormDataRecorder formDataRecorder) {
        this.formDataRecorder = formDataRecorder;
        this.refListener = new WeakReference<>(iEsiaAuthWebClientListener);
        this.refEsiaController = new WeakReference<>(iEsiaController);
    }

    private final WebResourceResponse executeRequest(WebResourceRequest request) {
        String str;
        EbsLogger.INSTANCE.info(LOGGER_TAG, "intercept request " + request.getUrl());
        if (jl40.l(request.getMethod(), "POST")) {
            str = this.formDataRecorder.getAndClearData(request.getUrl().toString());
            String lastBodyAndClear = this.formDataRecorder.getLastBodyAndClear(request.getUrl().toString());
            if (lastBodyAndClear != null) {
                str = lastBodyAndClear;
            }
        } else {
            str = null;
        }
        return onProcessUrl(request, str);
    }

    private final WebResourceResponse getEmptyWebResourceResponse() {
        return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
    }

    private final boolean isIgnoreHost(Uri uri) {
        IEsiaController iEsiaController = this.refEsiaController.get();
        if (iEsiaController != null) {
            return iEsiaController.isIgnoreHost(uri != null ? uri.getHost() : null);
        }
        return false;
    }

    private final boolean isSupportTlsHost(Uri uri) {
        IEsiaController iEsiaController = this.refEsiaController.get();
        if (iEsiaController != null) {
            return iEsiaController.supportTlsHost(uri != null ? uri.getHost() : null);
        }
        return false;
    }

    private final WebResourceResponse onProcessUrl(WebResourceRequest request, String body) {
        IEsiaController iEsiaController = this.refEsiaController.get();
        EsiaInterceptResult processUrl = iEsiaController != null ? iEsiaController.processUrl(new EsiaInterceptRequest(request.getUrl().toString(), request.getMethod(), request.getRequestHeaders(), body)) : null;
        if (processUrl != null) {
            if (processUrl.getError() != null) {
                EsiaVerificationEbsException error = processUrl.getError();
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
                if (iEsiaAuthWebClientListener != null) {
                    iEsiaAuthWebClientListener.onProcessError(error);
                }
            } else if (processUrl.getEsiaErrorResult() != null) {
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener2 = this.refListener.get();
                if (iEsiaAuthWebClientListener2 != null) {
                    EsiaErrorResult esiaErrorResult = processUrl.getEsiaErrorResult();
                    iEsiaAuthWebClientListener2.onProcessError(new EsiaVerificationEbsException(esiaErrorResult.getError(), esiaErrorResult.getErrorDescription()));
                }
            } else if (processUrl.getRedirectUrl().length() > 0) {
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener3 = this.refListener.get();
                if (iEsiaAuthWebClientListener3 != null) {
                    iEsiaAuthWebClientListener3.onProcessRedirectUrl(processUrl.getRedirectUrl());
                }
            } else {
                if (processUrl.getRedirectFrom() == null || processUrl.getRedirectTo() == null) {
                    WebResourceResponse webResourceResponse = new WebResourceResponse(processUrl.getContentType(), processUrl.getEncoding(), processUrl.getInputStream());
                    webResourceResponse.setResponseHeaders(processUrl.getHeaders());
                    return webResourceResponse;
                }
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener4 = this.refListener.get();
                if (iEsiaAuthWebClientListener4 != null) {
                    iEsiaAuthWebClientListener4.onChangeUrlByRedirect(processUrl.getRedirectFrom(), processUrl.getRedirectTo());
                }
            }
        }
        return null;
    }

    private final boolean onSetErrorCode(int errorCode, String description) {
        IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
        if (iEsiaAuthWebClientListener != null) {
            return iEsiaAuthWebClientListener.onErrorLoadPage(errorCode, description);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView view, String url) {
        super.onPageCommitVisible(view, url);
        IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
        if (iEsiaAuthWebClientListener != null) {
            iEsiaAuthWebClientListener.onPageCommitVisible();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
        if (iEsiaAuthWebClientListener != null) {
            iEsiaAuthWebClientListener.onPageFinished();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
        if (iEsiaAuthWebClientListener != null) {
            iEsiaAuthWebClientListener.onPageStarted();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        CharSequence description;
        if (onSetErrorCode(error != null ? error.getErrorCode() : 0, (error == null || (description = error.getDescription()) == null) ? null : description.toString())) {
            return;
        }
        super.onReceivedError(view, request, error);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        String str;
        String url;
        EbsLogger ebsLogger = EbsLogger.INSTANCE;
        String str2 = null;
        String num = error != null ? Integer.valueOf(error.getPrimaryError()).toString() : null;
        if (num == null) {
            num = "";
        }
        ebsLogger.warning(LOGGER_TAG, "onReceivedSslError old: ".concat(num));
        IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
        if (iEsiaAuthWebClientListener == null) {
            if (handler != null) {
                handler.cancel();
                return;
            }
            return;
        }
        if (error == null || (str = Integer.valueOf(error.getPrimaryError()).toString()) == null) {
            str = "0";
        }
        if (error != null && (url = error.getUrl()) != null) {
            str2 = url;
        }
        iEsiaAuthWebClientListener.onSslError(new SslErrorEsiaVerificationEbsException(str, str2 != null ? str2 : ""));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        try {
            if (request == null) {
                return getEmptyWebResourceResponse();
            }
            if (a.G(this.blackList, request.getUrl().getHost())) {
                return null;
            }
            IEsiaController iEsiaController = this.refEsiaController.get();
            if (iEsiaController != null && iEsiaController.isRedirectUrl(request.getUrl())) {
                WebResourceResponse executeRequest = executeRequest(request);
                return executeRequest == null ? getEmptyWebResourceResponse() : executeRequest;
            }
            String method = request.getMethod();
            HttpsMethod[] values = HttpsMethod.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (HttpsMethod httpsMethod : values) {
                arrayList.add(httpsMethod.name());
            }
            if (!arrayList.contains(method)) {
                EbsLogger.INSTANCE.info(LOGGER_TAG, "Skipping url because method " + request.getMethod() + " is not supported: " + request.getUrl());
                return getEmptyWebResourceResponse();
            }
            if (isIgnoreHost(request.getUrl())) {
                EbsLogger.INSTANCE.info(LOGGER_TAG, "Ignore url: " + request.getUrl());
                return getEmptyWebResourceResponse();
            }
            if (isSupportTlsHost(request.getUrl())) {
                WebResourceResponse executeRequest2 = executeRequest(request);
                return executeRequest2 == null ? getEmptyWebResourceResponse() : executeRequest2;
            }
            EbsLogger.INSTANCE.info(LOGGER_TAG, "No TLS for url: " + request.getUrl());
            return super.shouldInterceptRequest(view, request);
        } catch (Exception unused) {
            EbsLogger.INSTANCE.warning(LOGGER_TAG, "Failed to get " + (request != null ? request.getUrl() : null));
            return getEmptyWebResourceResponse();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri url;
        IEsiaController iEsiaController = this.refEsiaController.get();
        String str = null;
        str = null;
        if (iEsiaController != null) {
            if (iEsiaController.isEsiaUrlWithoutPath(request != null ? request.getUrl() : null)) {
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener = this.refListener.get();
                if (iEsiaAuthWebClientListener != null) {
                    iEsiaAuthWebClientListener.onProcessEsiaUrlWithoutPath(request != null ? request.getUrl() : null);
                }
                return true;
            }
        }
        IEsiaController iEsiaController2 = this.refEsiaController.get();
        if (iEsiaController2 != null) {
            if (iEsiaController2.isBrowserUrl(request != null ? request.getUrl() : null)) {
                IEsiaAuthWebClientListener iEsiaAuthWebClientListener2 = this.refListener.get();
                if (iEsiaAuthWebClientListener2 != null) {
                    iEsiaAuthWebClientListener2.onProcessBrowserUrl(request != null ? request.getUrl() : null);
                }
                return true;
            }
        }
        List<String> list = this.blackList;
        if (request != null && (url = request.getUrl()) != null) {
            str = url.getHost();
        }
        a.G(list, str);
        return false;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/system/EsiaAuthWebClient$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/webkit/WebView;", "webView", "Lru/rt/ebs/cryptosdk/core/verification/esia/system/IEsiaAuthWebClientListener;", "listener", "Lru/rt/ebs/cryptosdk/core/verification/esia/controllers/IEsiaController;", "esiaController", "", "isNeededRemoveCookies", "Lzy11;", "initWebView", "(Landroid/content/Context;Landroid/webkit/WebView;Lru/rt/ebs/cryptosdk/core/verification/esia/system/IEsiaAuthWebClientListener;Lru/rt/ebs/cryptosdk/core/verification/esia/controllers/IEsiaController;Z)V", "clearCookies", "(Landroid/content/Context;)V", "", "LOGGER_TAG", "Ljava/lang/String;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void clearCookies$lambda$0(Boolean bool) {
        }

        public static /* synthetic */ void initWebView$default(Companion companion, Context context, WebView webView, IEsiaAuthWebClientListener iEsiaAuthWebClientListener, IEsiaController iEsiaController, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                z = true;
            }
            companion.initWebView(context, webView, iEsiaAuthWebClientListener, iEsiaController, z);
        }

        public final void clearCookies(Context context) {
            try {
                CookieManager.getInstance().removeAllCookies(new pme(1));
            } catch (Exception e) {
                EbsLogger.INSTANCE.error(EsiaAuthWebClient.LOGGER_TAG, e);
            }
        }

        public final void initWebView(Context context, WebView webView, IEsiaAuthWebClientListener listener, IEsiaController esiaController, boolean isNeededRemoveCookies) {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            if (isNeededRemoveCookies) {
                clearCookies(context);
            }
            settings.setDomStorageEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            FormDataRecorder formDataRecorder = new FormDataRecorder();
            webView.addJavascriptInterface(formDataRecorder, FormDataRecorder.interfaceName);
            webView.setWebViewClient(new EsiaAuthWebClient(listener, esiaController, formDataRecorder));
        }

        private Companion() {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        if (onSetErrorCode(errorCode, description)) {
            return;
        }
        super.onReceivedError(view, errorCode, description, failingUrl);
    }
}
