package ru.yandex.taxi.web;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import defpackage.an8;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.i3y;
import defpackage.jst;
import defpackage.l7b;
import defpackage.og21;
import defpackage.ql60;
import defpackage.qv10;
import defpackage.rl60;
import defpackage.st41;
import defpackage.unr0;
import defpackage.v0w;
import defpackage.vng;
import defpackage.yp6;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.fragment.common.BaseWebViewClient;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010.J'\u00100\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b0\u00101J'\u00103\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0015¢\u0006\u0004\b\u0012\u00105J\u0017\u00106\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bH$¢\u0006\u0004\b8\u0010\u0016J\u001b\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b09H$¢\u0006\u0004\b:\u0010;J'\u0010<\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b<\u0010\u001eJ\u001f\u0010=\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010?R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u001d\u0010F\u001a\u0004\u0018\u00010A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lru/yandex/taxi/web/CommonWebViewClient;", "Lru/yandex/taxi/fragment/common/BaseWebViewClient;", "", "shouldIgnoreSslError", "useIntentForNonHttpUrls", "Lru/yandex/taxi/deeplinks/f;", "deeplinkUtils", "", "", "jsScripts", "<init>", "(ZZLru/yandex/taxi/deeplinks/f;Ljava/util/List;)V", "forMainFrame", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "failingUrl", "Lzy11;", "onError", "(ZILjava/lang/String;Ljava/lang/String;)V", "url", "openUrlByIntentAndCloseActivity", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "handleSslErrorNormally", "(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "getMessageForSslError", "(Landroid/net/http/SslError;)Ljava/lang/String;", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "response", "logHttpError", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "errorPrefix", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "favicon", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "onPageCommitVisible", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "Landroid/webkit/WebResourceError;", "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Ljava/lang/String;)Z", "openUrlByIntent", "", "headers", "()Ljava/util/Map;", "onReceivedSslError", "showSslError", "(Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V", "Z", "Ljava/util/List;", "Lst41;", "domesticSslErrorHandler$delegate", "Li3y;", "getDomesticSslErrorHandler", "()Lst41;", "domesticSslErrorHandler", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CommonWebViewClient extends BaseWebViewClient {

    /* renamed from: domesticSslErrorHandler$delegate, reason: from kotlin metadata */
    private final i3y domesticSslErrorHandler;
    private final List<String> jsScripts;
    private final boolean shouldIgnoreSslError;
    private final boolean useIntentForNonHttpUrls;

    public CommonWebViewClient(boolean z, boolean z2, f fVar, List<String> list) {
        super(fVar);
        this.shouldIgnoreSslError = z;
        this.useIntentForNonHttpUrls = z2;
        this.jsScripts = list;
        this.domesticSslErrorHandler = kotlin.a.a(new l7b(27, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final st41 domesticSslErrorHandler_delegate$lambda$0(CommonWebViewClient commonWebViewClient) {
        Activity activity = commonWebViewClient.getActivity();
        if (activity != null) {
            return st41.a(activity.getApplicationContext(), new rl60(activity.getApplicationContext()), new ql60());
        }
        return null;
    }

    private final st41 getDomesticSslErrorHandler() {
        return (st41) this.domesticSslErrorHandler.getValue();
    }

    private final String getMessageForSslError(SslError error) {
        StringBuilder sb = new StringBuilder();
        int primaryError = error.getPrimaryError();
        if (primaryError == 0) {
            sb.append("The certificate is not yet valid.");
        } else if (primaryError == 1) {
            sb.append("The certificate has expired.");
        } else if (primaryError == 2) {
            sb.append("The certificate Hostname mismatch.");
        } else if (primaryError == 3) {
            sb.append("The certificate authority is not trusted.");
        }
        jst.e.getClass();
        sb.append(" Do you want to continue anyway?");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSslErrorNormally(WebView view, SslErrorHandler handler, SslError error) {
        super.onReceivedSslError(view, handler, error);
    }

    private final void logHttpError(WebResourceRequest request, WebResourceResponse response) {
        String reasonPhrase;
        InputStream data = response.getData();
        if (data == null || !("application/json".equals(response.getMimeType()) || "text/plain".equals(response.getMimeType()))) {
            reasonPhrase = response.getReasonPhrase();
        } else {
            try {
                Charset forName = Charset.forName(response.getEncoding());
                v0w H = vng.H(data);
                yp6 yp6Var = new yp6();
                yp6Var.N1(H);
                reasonPhrase = yp6Var.T(yp6Var.b, forName);
            } catch (Exception e) {
                jst.e.k(e, "Failed to read WebView response error");
                reasonPhrase = null;
            }
        }
        jst.e.n(errorPrefix() + ".onReceivedHttpError: request -> " + request.getMethod() + " " + request.getUrl() + " with headers " + request.getRequestHeaders().keySet() + "\n response -> [" + response.getStatusCode() + "] " + reasonPhrase);
    }

    private final void openUrlByIntentAndCloseActivity(String url) {
        Activity activity;
        openUrlByIntent(url);
        String a = og21.a(Uri.parse(url), "dont_close_app");
        if ((a != null ? a.equals("1") : false) || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    public String errorPrefix() {
        return "WebViewClient";
    }

    public abstract Map<String, String> headers();

    public void onError(int errorCode, String description, String failingUrl) {
        String str;
        int length = failingUrl.length();
        Set<String> set = EmptySet.a;
        if (length > 0) {
            Uri parse = Uri.parse(failingUrl);
            str = unr0.o(parse.getScheme(), "://", parse.getHost(), parse.getPath());
            if (parse.isHierarchical()) {
                set = parse.getQueryParameterNames();
            }
        } else {
            str = "";
        }
        jst.e.g(description.length() == 0 ? qv10.h(errorCode, errorPrefix(), ".onError:") : g8e.p(errorPrefix(), ".onError:", description), null, String.format(Locale.US, "%s with query parameter names %s and headers keys %s load failed with %d error code", Arrays.copyOf(new Object[]{str, set, headers().keySet(), Integer.valueOf(errorCode)}, 4)), null);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView view, String url) {
        super.onPageCommitVisible(view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Iterator<String> it = this.jsScripts.iterator();
        while (it.hasNext()) {
            view.evaluateJavascript(it.next(), null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        onError(request.isForMainFrame(), error.getErrorCode(), error.getDescription().toString(), request.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse response) {
        super.onReceivedHttpError(view, request, response);
        onError(request.isForMainFrame(), response.getStatusCode(), response.getReasonPhrase(), request.getUrl().toString());
        logHttpError(request, response);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        st41 domesticSslErrorHandler = getDomesticSslErrorHandler();
        if (domesticSslErrorHandler == null) {
            handleSslErrorNormally(view, handler, error);
        } else {
            domesticSslErrorHandler.b(error, new an8(handler, this, view, error, 20));
        }
    }

    public abstract void openUrlByIntent(String url);

    @Override // ru.yandex.taxi.fragment.common.BaseWebViewClient
    public boolean shouldOverrideUrlLoading(String url) {
        if (super.shouldOverrideUrlLoading(url)) {
            return true;
        }
        String a = og21.a(Uri.parse(url), "use_external_browser");
        if (a != null ? a.equals("1") : false) {
            openUrlByIntentAndCloseActivity(url);
            return true;
        }
        if (!this.useIntentForNonHttpUrls || cvu0.x(url.toLowerCase(Locale.US), "http", false)) {
            return false;
        }
        openUrlByIntentAndCloseActivity(url);
        return true;
    }

    public void showSslError(SslErrorHandler handler, SslError error) {
        throw new IllegalStateException("Trying to mitigate ssl error handling not from TESTING build");
    }

    private final void onError(boolean forMainFrame, int errorCode, String description, String failingUrl) {
        jst.e.getClass();
        if (forMainFrame) {
            onError(errorCode, description, failingUrl);
        }
    }
}
