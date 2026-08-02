package defpackage;

import android.content.Context;
import android.webkit.WebView;
import com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment;
import com.yandex.go.account.api.superapp.CookieInjectionEvent;
import com.yandex.messaging.views.WaveformView;
import com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesView;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi$WebViewClientImpl;
import java.util.Arrays;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class r941 implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onProgressChanged$lambda$0;
        sm41 componentStore_delegate$lambda$1;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                onProgressChanged$lambda$0 = WaveformView.onProgressChanged$lambda$0(((Float) obj).floatValue());
                return onProgressChanged$lambda$0;
            case 1:
                bne bneVar = (bne) obj;
                return g8e.p(bneVar.a, "=", bneVar.b);
            case 2:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 3:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onGeolocationPermissionsHidePrompt$4((Result) obj);
            case 4:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onConsoleMessage$7((Result) obj);
            case 5:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onShowCustomView$1((Result) obj);
            case 6:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onGeolocationPermissionsShowPrompt$3((Result) obj);
            case 7:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onProgressChanged$0((Result) obj);
            case 8:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onPermissionRequest$6((Result) obj);
            case 9:
                return WebChromeClientProxyApi$WebChromeClientImpl.lambda$onHideCustomView$2((Result) obj);
            case 10:
                WebStoriesView webStoriesView = (WebStoriesView) obj;
                if (webStoriesView != null) {
                    webStoriesView.setAudioMuted();
                }
                return zy11Var;
            case 11:
                if (((CookieInjectionEvent) obj) == CookieInjectionEvent.UPDATE_FAILED) {
                    xby.l(jst.e, "WebViewAuthHeaderInteractor:AUTH:COOKIES", null, null, "Cookie inject update failed", 6);
                }
                return zy11Var;
            case 12:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onFormResubmission$14((Result) obj);
            case 13:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedHttpAuthRequest$12((Result) obj);
            case 14:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$shouldOverrideUrlLoading$8((Result) obj);
            case 15:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedLoginRequest$22((Result) obj);
            case 16:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onPageStarted$0((Result) obj);
            case 17:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onLoadResource$16((Result) obj);
            case 18:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedError$6((Result) obj);
            case 19:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$doUpdateVisitedHistory$10((Result) obj);
            case 20:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onPageCommitVisible$18((Result) obj);
            case 21:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onScaleChanged$26((Result) obj);
            case 22:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedHttpError$4((Result) obj);
            case 23:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedClientCertRequest$20((Result) obj);
            case 24:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onReceivedSslError$24((Result) obj);
            case 25:
                return WebViewClientProxyApi$WebViewClientImpl.lambda$onPageFinished$2((Result) obj);
            case 26:
                return zy11Var;
            case 27:
                return new WebView((Context) obj);
            case 28:
                componentStore_delegate$lambda$1 = WebViewFragment.componentStore_delegate$lambda$1((lo41) obj);
                return componentStore_delegate$lambda$1;
            default:
                return fs41.a;
        }
    }

    public /* synthetic */ r941(int i) {
        this.a = i;
    }
}
