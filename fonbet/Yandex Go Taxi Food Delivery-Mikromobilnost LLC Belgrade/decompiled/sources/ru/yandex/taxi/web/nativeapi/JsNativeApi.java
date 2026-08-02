package ru.yandex.taxi.web.nativeapi;

import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.aax;
import defpackage.czo0;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.hm91;
import defpackage.hyw;
import defpackage.ij91;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kax;
import defpackage.m790;
import defpackage.mtw;
import defpackage.oyr;
import defpackage.qoi0;
import defpackage.r7v;
import defpackage.rm41;
import defpackage.sq41;
import defpackage.tje;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xab1;
import defpackage.xnt;
import defpackage.yax;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0019\u0010\u0018J;\u0010\u0019\u001a\u00020\f\"\b\b\u0000\u0010\u001b*\u00020\u001a2\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0004¢\u0006\u0004\b\u0019\u0010\u001fJ \u0010!\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0084\b¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0007H\u0004¢\u0006\u0004\b$\u0010\u0018Ji\u0010*\u001a\u00020\f\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0006\u0010\t\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u001c2\u001e\b\u0004\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0006\u0012\u0004\u0018\u00010\u001a0%2\u0014\b\u0004\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070%H\u0084\bø\u0001\u0000¢\u0006\u0004\b*\u0010+JN\u0010*\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u001e\b\u0004\u0010'\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0&\u0012\u0006\u0012\u0004\u0018\u00010\u001a0%2\u0014\b\u0004\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070%H\u0084\b¢\u0006\u0004\b*\u0010,J/\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\u0006\u0010-\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0004¢\u0006\u0004\b.\u0010/J1\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\u0006\u0010-\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0004¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010AR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u000f8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010ER\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b7\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020I8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\u0082\u0002\u0004\n\u0002\b9¨\u0006N"}, d2 = {"Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lyax;", "Landroid/view/View$OnAttachStateChangeListener;", "Lwnt;", "goJson", "<init>", "(Lwnt;)V", "", "function", "promiseId", "param1", "param2", "Lzy11;", "invokeCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "webView", "setupWebView", "(Landroid/webkit/WebView;)V", "Lsq41;", "provideWebViewJsInterface", "()Lsq41;", "url", "onPageStarted", "(Ljava/lang/String;)V", "callbackResult", "", "T", "Lkotlinx/serialization/KSerializer;", "serializer", TarifficatorScenarioActivity.RESULT_KEY, "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V", ErrorResponseData.JSON_ERROR_MESSAGE, "callbackError", "(Ljava/lang/String;Ljava/lang/String;)V", "script", "postScriptEvaluation", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onHandle", "", "onError", "handleApiMethodCall", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Ltls;Ltls;)V", "(Ljava/lang/String;Ltls;Ltls;)V", "jsonValue", "deserialize", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;", "safeDeserialize", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lkax;", "document", "injectScriptIfNeed", "(Lkax;)V", "buildScriptForInjection", "(Lkax;)Ljava/lang/String;", "", "isInjectionFeatureSupported", "()Z", "Lwnt;", "getGoJson", "()Lwnt;", "value", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lkax;", "getDocument", "()Lkax;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "getScopeDelegate", "()Lhbp0;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class JsNativeApi implements yax, View.OnAttachStateChangeListener {
    private final kax document = new kax(0);
    private final wnt goJson;
    private final hbp0 scopeDelegate;
    private WebView webView;

    public JsNativeApi(wnt wntVar) {
        this.goJson = wntVar;
        String d = qoi0.a(JsNativeApi.class).d();
        this.scopeDelegate = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    private final String buildScriptForInjection(kax document) {
        StringBuilder sb = new StringBuilder("\nwindow.taxiNativeApiPromises = {}\nfunction handlePromiseResult(promiseId, data, error) {\n    var pair = window.taxiNativeApiPromises[promiseId]\n    if (pair) {\n        if (error) { \n            pair.reject(error) \n        } else { \n            pair.resolve(data) \n        }\n    }\n    delete window.taxiNativeApiPromises[promiseId]\n}\n\nfunction createPromiseId(functionName) {\n    return functionName + (\"000000\").replace(/[018]/g, c =>\n        (crypto.getRandomValues(new Uint8Array(1))[0]).toString(16));\n}\n\nfunction generateError(errorMessage) {\n    return new Error(errorMessage);\n}\n");
        String[] strArr = {"param1", "param2"};
        sb.append(unr0.p("\nfunction stringifyParam(param) {\n  try {\n    if (param === undefined || param === null) return null\n    if (typeof param === \"string\") return param\n    return JSON.stringify(param);\n  } catch (e) {\n    console.log(e)\n    return \"\"\n  }\n}\nfunction createPromise(functionName", j73.L(strArr, Extension.FIX_SPACE, Extension.FIX_SPACE, null, 60), ") {\n    var promiseId = createPromiseId(functionName);\n    var promise = new Promise(function (resolve, reject) {\n        this.window.taxiNativeApiPromises[promiseId] = { resolve, reject };\n    });\n    taxiNativeApi.invokeCode(functionName, promiseId", j73.L(strArr, Extension.FIX_SPACE, Extension.FIX_SPACE, new mtw(8), 28), ")\n    return promise\n}\n"));
        sb.append(document.a());
        return sb.toString();
    }

    public static /* synthetic */ void callbackResult$default(JsNativeApi jsNativeApi, String str, KSerializer kSerializer, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            w511.x("Super calls with default arguments not supported in this target, function: callbackResult");
            return;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        jsNativeApi.callbackResult(str, kSerializer, obj);
    }

    private final void injectScriptIfNeed(final kax document) {
        final WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript("window.taxiNativeApiPromises", new ValueCallback() { // from class: sax
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    JsNativeApi.injectScriptIfNeed$lambda$0$0(JsNativeApi.this, document, webView, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void injectScriptIfNeed$lambda$0$0(JsNativeApi jsNativeApi, kax kaxVar, WebView webView, String str) {
        if (!jl40.l(str, "null")) {
            jst.e.getClass();
        } else {
            webView.evaluateJavascript(jsNativeApi.buildScriptForInjection(kaxVar), null);
            jst.e.getClass();
        }
    }

    public static /* synthetic */ void invokeCode$default(JsNativeApi jsNativeApi, String str, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: invokeCode");
            return;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        jsNativeApi.invokeCode(str, str2, str3, str4);
    }

    private final boolean isInjectionFeatureSupported() {
        return hm91.d("DOCUMENT_START_SCRIPT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postScriptEvaluation$lambda$0(JsNativeApi jsNativeApi, String str) {
        WebView webView = jsNativeApi.webView;
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
        jst.e.getClass();
    }

    public final void callbackError(String promiseId, String errorMessage) {
        postScriptEvaluation(xab1.c(promiseId, errorMessage));
    }

    public final <T> void callbackResult(String promiseId, KSerializer serializer, T result) {
        String p;
        if (result != null) {
            p = unr0.p("handlePromiseResult(\"", promiseId, "\", ", ((xnt) this.goJson).e(result, serializer), Extension.C_BRAKE);
            jst.e.getClass();
        } else {
            p = oyr.p("handlePromiseResult(\"", promiseId, "\")");
            jst.e.getClass();
        }
        postScriptEvaluation(p);
    }

    public final <T> T deserialize(String jsonValue, KSerializer serializer) {
        return (T) ((xnt) this.goJson).c(jsonValue, serializer);
    }

    public final kax getDocument() {
        return this.document;
    }

    public final wnt getGoJson() {
        return this.goJson;
    }

    public final hbp0 getScopeDelegate() {
        return this.scopeDelegate;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final /* synthetic */ <T> void handleApiMethodCall(String promiseId, KSerializer serializer, tls onHandle, tls onError) {
        tje.N(this.scopeDelegate.c(), null, null, new JsNativeApi$handleApiMethodCall$1(this, promiseId, serializer, onHandle, onError, null), 3);
    }

    @JavascriptInterface
    public final void invokeCode(String function, String promiseId, String param1, String param2) {
        List W;
        String[] strArr;
        aax aaxVar;
        jst.e.getClass();
        kax kaxVar = this.document;
        kaxVar.getClass();
        W = evu0.W(function, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        boolean isEmpty = W.isEmpty();
        hyw hywVar = ij91.a;
        if (!isEmpty && (aaxVar = (aax) kaxVar.a.get(W.get(0))) != null) {
            hywVar = aaxVar.b(W.subList(1, W.size()));
        }
        if (param2 != null) {
            if (param1 == null) {
                param1 = "";
            }
            strArr = new String[]{param1, param2};
        } else {
            strArr = param1 != null ? new String[]{param1} : new String[0];
        }
        hywVar.a(promiseId, strArr);
    }

    @Override // defpackage.bi41
    public /* bridge */ void onPageCommitVisible(String str) {
    }

    @Override // defpackage.bi41
    public /* bridge */ void onPageFinished(String str) {
    }

    @Override // defpackage.bi41
    public /* bridge */ void onPageLoadingError(m790 m790Var) {
    }

    @Override // defpackage.bi41
    public void onPageStarted(String url) {
        if (isInjectionFeatureSupported()) {
            return;
        }
        injectScriptIfNeed(this.document);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.scopeDelegate.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.scopeDelegate.b();
    }

    public final void postScriptEvaluation(String script) {
        WebView webView = this.webView;
        if (webView != null) {
            webView.post(new r7v(16, this, script));
        }
    }

    @Override // defpackage.yax
    public sq41 provideWebViewJsInterface() {
        return new sq41(this, "taxiNativeApi");
    }

    public final <T> T safeDeserialize(String jsonValue, KSerializer serializer) {
        try {
            return (T) deserialize(jsonValue, serializer);
        } catch (SerializationException unused) {
            return null;
        }
    }

    @Override // defpackage.yax
    public void setupWebView(WebView webView) {
        this.webView = webView;
        if (isInjectionFeatureSupported()) {
            rm41.a(webView, buildScriptForInjection(this.document), Collections.singleton("*"));
            jst.e.getClass();
        }
        webView.addOnAttachStateChangeListener(this);
    }

    public final void handleApiMethodCall(String promiseId, tls onHandle, tls onError) {
        tje.N(this.scopeDelegate.c(), null, null, new JsNativeApi$handleApiMethodCall$2(onHandle, this, promiseId, onError, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void callbackResult(String promiseId) {
        String p = oyr.p("handlePromiseResult(\"", promiseId, "\")");
        jst.e.getClass();
        postScriptEvaluation(p);
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2, String str3) {
        invokeCode$default(this, str, str2, str3, null, 8, null);
    }

    @JavascriptInterface
    public final void invokeCode(String str, String str2) {
        invokeCode$default(this, str, str2, null, null, 12, null);
    }
}
