package ru.yandex.taxi.eatskit.internal.nativeapi;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.bj7;
import defpackage.cj7;
import defpackage.ck7;
import defpackage.f8o;
import defpackage.gcn;
import defpackage.iti0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.l9;
import defpackage.ljo;
import defpackage.p250;
import defpackage.r250;
import defpackage.rme;
import defpackage.rnc;
import defpackage.rzd;
import defpackage.s250;
import defpackage.sc20;
import defpackage.sd30;
import defpackage.sls;
import defpackage.t240;
import defpackage.tls;
import defpackage.tx2;
import defpackage.ux2;
import defpackage.v250;
import defpackage.ve30;
import defpackage.vmx;
import defpackage.vs4;
import defpackage.w250;
import defpackage.w511;
import defpackage.wls;
import defpackage.x3;
import defpackage.xby;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.enums.a;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.eatskit.dto.ErrorSource;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001:\u0004\u0002\u000bMNB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0015¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u001a\u0010\u0010J)\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#JT\u0010+\u001a\u00020\u000e\"\n\b\u0000\u0010$\u0018\u0001*\u00020\u0001\"\f\b\u0001\u0010%\u0018\u0001*\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020&2 \b\b\u0010*\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)\u0012\u0004\u0012\u00020\u000e0(H\u0086\b¢\u0006\u0004\b+\u0010,JB\u0010+\u001a\u00020\u000e\"\f\b\u0000\u0010%\u0018\u0001*\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020&2\u001a\b\u0004\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\u0004\u0012\u00020\u000e0-H\u0086\b¢\u0006\u0004\b+\u0010.JH\u0010/\u001a\u00020\u000e\"\n\b\u0000\u0010$\u0018\u0001*\u00020\u0001\"\f\b\u0001\u0010%\u0018\u0001*\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020&2\u0014\b\u0004\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-H\u0086\b¢\u0006\u0004\b/\u0010.J@\u00102\u001a\u00020\u0001\"\u0006\b\u0000\u00100\u0018\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\u001b2\u0014\b\b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0-H\u0084\b¢\u0006\u0004\b2\u00103J%\u00105\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e04H\u0004¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u0010J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b8\u00109J9\u0010:\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010)\u0012\u0004\u0012\u00020\u000e0(H\u0002¢\u0006\u0004\b:\u0010;J+\u0010>\u001a\u00020\u000e\"\b\b\u0000\u00100*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e04H\u0002¢\u0006\u0004\b@\u00106J(\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0006\b\u0000\u00100\u0018\u00012\b\u00101\u001a\u0004\u0018\u00010\u001bH\u0082\b¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HRd\u0010K\u001aR\u0012\u0004\u0012\u00020\u001b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010)\u0012\u0004\u0012\u00020\u000e0(0Ij(\u0012\u0004\u0012\u00020\u001b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010)\u0012\u0004\u0012\u00020\u000e0(`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/NativeApi;", "", "Lr250;", "callback", "", "Lcj7;", "methods", "<init>", "(Lr250;Ljava/util/List;)V", "Lrzd;", ConfigConstants.CONFIG, "Ls250;", "handleConfig", "(Lrzd;)Ls250;", "Lzy11;", "handleOnWebViewReady", "()V", "Lf8o;", "params", "handleOnWebViewLoadError", "(Lf8o;)V", "Liti0;", "handleRequestReload", "(Liti0;)V", "handleRequestHideWebView", "handleDisableSwipe", "handleEnableSwipe", "", "methodName", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "call", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ltx2;", "signal", "registerAppSignal", "(Ltx2;)V", CA20Status.STATUS_REQUEST_P, "R", "Lbj7;", "method", "Lkotlin/Function2;", "Lgcn;", "handler", "addAsyncMethodImpl", "(Lbj7;Lwls;)V", "Lkotlin/Function1;", "(Lbj7;Ltls;)V", "addSyncMethodImpl", "T", "json", "parseAndRun", "(Ljava/lang/String;Ljava/lang/String;Ltls;)Ljava/lang/Object;", "Lkotlin/Function0;", "runMethod", "(Ljava/lang/String;Lsls;)V", "handleOnWebApiReady", "addExternalAsyncMethods", "(Lcj7;)V", "addAsyncMethod", "(Ljava/lang/String;Lwls;)V", "", "error", "onError", "(Lgcn;Ljava/lang/Throwable;)V", "executeMethodOnMainThread", "Lkotlin/Result;", "parseParams-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "parseParams", "Lr250;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "supportedMethods", "Ljava/util/HashMap;", "v250", "CommonCallMethod", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class NativeApi {
    private final r250 callback;
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private final HashMap<String, wls> supportedMethods = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/NativeApi$CommonCallMethod;", "Lbj7;", "", "", "methodName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", DefaultErrorCategoryProvider.CONFIG, "ON_WEB_VIEW_API_READY", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CommonCallMethod implements bj7 {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CommonCallMethod[] $VALUES;
        public static final CommonCallMethod CONFIG;
        public static final CommonCallMethod ON_WEB_VIEW_API_READY;
        private final String methodName;

        static {
            CommonCallMethod commonCallMethod = new CommonCallMethod(DefaultErrorCategoryProvider.CONFIG, 0, ConfigConstants.CONFIG);
            CONFIG = commonCallMethod;
            CommonCallMethod commonCallMethod2 = new CommonCallMethod("ON_WEB_VIEW_API_READY", 1, "onWebViewApiReady");
            ON_WEB_VIEW_API_READY = commonCallMethod2;
            CommonCallMethod[] commonCallMethodArr = {commonCallMethod, commonCallMethod2};
            $VALUES = commonCallMethodArr;
            $ENTRIES = a.a(commonCallMethodArr);
        }

        public CommonCallMethod(String str, int i, String str2) {
            this.methodName = str2;
        }

        public static CommonCallMethod valueOf(String str) {
            return (CommonCallMethod) Enum.valueOf(CommonCallMethod.class, str);
        }

        public static CommonCallMethod[] values() {
            return (CommonCallMethod[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }
    }

    public NativeApi(r250 r250Var, List<cj7> list) {
        this.callback = r250Var;
        addAsyncMethod(CommonCallMethod.CONFIG.getMethodName(), new vs4(27, new w250(this, 0)));
        addAsyncMethod(CommonCallMethod.ON_WEB_VIEW_API_READY.getMethodName(), new vs4(28, new w250(this, 1)));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addExternalAsyncMethods((cj7) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAsyncMethod(String methodName, wls handler) {
        this.supportedMethods.put(methodName, new t240(16, handler, this, methodName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addAsyncMethod$lambda$0(String str, wls wlsVar, NativeApi nativeApi, String str2, gcn gcnVar) {
        try {
            xby.d.getClass();
            wlsVar.invoke(str2, gcnVar);
        } catch (SerializationException e) {
            xby.d.k(e, "EatsKit/29.3.0 | Error during parse params for method " + str);
            nativeApi.onError(gcnVar, e);
        } catch (Throwable th) {
            xby.d.k(th, "EatsKit/29.3.0 | Unknown Error for method " + str);
            nativeApi.onError(gcnVar, th);
        }
        return zy11.a;
    }

    private final void addExternalAsyncMethods(cj7 method) {
        addAsyncMethod(method.a, new sc20(17, method));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addExternalAsyncMethods$lambda$0(cj7 cj7Var, String str, gcn gcnVar) {
        cj7Var.b.invoke(str, gcnVar);
        return zy11.a;
    }

    public static /* synthetic */ void call$default(NativeApi nativeApi, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: call");
            return;
        }
        if ((i & 4) != 0) {
            str3 = "{}";
        }
        nativeApi.call(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void call$lambda$0$0(wls wlsVar, String str, final NativeApi nativeApi, final String str2) {
        wlsVar.invoke(str, new gcn() { // from class: q250
            @Override // defpackage.gcn
            public final void a(ck7 ck7Var) {
                NativeApi.call$lambda$0$0$0(NativeApi.this, str2, ck7Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void call$lambda$0$0$0(NativeApi nativeApi, String str, ck7 ck7Var) {
        ((rme) ((x3) nativeApi.callback).b).e().g("response", str, ck7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeMethodOnMainThread(String methodName, sls callback) {
        this.uiHandler.post(new sd30(2, callback, methodName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeMethodOnMainThread$lambda$0(sls slsVar, String str) {
        try {
            slsVar.invoke();
        } catch (Exception e) {
            xby.d.k(e, "EatsKit/29.3.0 | Error during method " + str + " execution");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleDisableSwipe$lambda$0(NativeApi nativeApi) {
        nativeApi.callback.Bc();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleEnableSwipe$lambda$0(NativeApi nativeApi) {
        nativeApi.callback.a7();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnWebApiReady() {
        this.callback.ae();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleOnWebViewLoadError$lambda$0(NativeApi nativeApi, f8o f8oVar) {
        nativeApi.callback.b9(f8oVar, ErrorSource.EATSKIT);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleOnWebViewReady$lambda$0(NativeApi nativeApi) {
        nativeApi.callback.h();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleRequestHideWebView$lambda$0(NativeApi nativeApi) {
        ((rnc) ((rme) ((x3) nativeApi.callback).b).b.a).close();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleRequestReload$lambda$0(NativeApi nativeApi, iti0 iti0Var) {
        rme rmeVar = (rme) ((x3) nativeApi.callback).b;
        rmeVar.e = iti0Var != null ? iti0Var.c : null;
        rmeVar.r(iti0Var, false);
        return zy11.a;
    }

    private final <T> void onError(gcn gcnVar, Throwable th) {
        gcnVar.a(new ck7(th));
    }

    /* renamed from: parseParams-IoAF18A, reason: not valid java name */
    private final <T> Object m726parseParamsIoAF18A(String json2) {
        if (json2 == null || json2.length() == 0) {
            return new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        }
        try {
            vmx.a.a();
            jl40.P();
            throw null;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public final <P, R> void addAsyncMethodImpl(bj7 method, wls handler) {
        method.getClass();
        jl40.P();
        throw null;
    }

    public final <P, R> void addSyncMethodImpl(bj7 method, tls handler) {
        jl40.P();
        throw null;
    }

    @JavascriptInterface
    public final void call(String methodName, String token, String params) {
        wls wlsVar = this.supportedMethods.get(methodName);
        if (wlsVar != null) {
            this.uiHandler.post(new l9(wlsVar, params, this, token, 19));
        }
    }

    public s250 handleConfig(rzd config) {
        return new v250(kotlin.collections.a.J0(this.supportedMethods.keySet()));
    }

    public final void handleDisableSwipe() {
        runMethod("handleDisableSwipe", new p250(this, 0));
    }

    public final void handleEnableSwipe() {
        runMethod("handleEnableSwipe", new p250(this, 3));
    }

    public final void handleOnWebViewLoadError(f8o params) {
        runMethod("handleOnWebViewLoadError", new ve30(23, this, params));
    }

    public final void handleOnWebViewReady() {
        runMethod("handleOnWebViewReady", new p250(this, 1));
    }

    public final void handleRequestHideWebView() {
        runMethod("handleRequestHideWebView", new p250(this, 2));
    }

    public final void handleRequestReload(iti0 params) {
        runMethod("requestReload", new ve30(22, this, params));
    }

    public final <T> Object parseAndRun(String methodName, String json2, tls callback) {
        Result.Failure failure;
        xby.d.getClass();
        if (json2 == null || json2.length() == 0) {
            failure = new Result.Failure(new IllegalArgumentException("Non empty argument is required for method call"));
        } else {
            try {
                vmx.a.a();
                jl40.P();
                throw null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return zy11.a;
        }
        xby.d.k(a, "EatsKit/29.3.0 | Error during parse params for method " + methodName);
        return ljo.b(a);
    }

    public final void registerAppSignal(tx2 signal) {
        addAsyncMethod(((ux2) signal).a, ((ux2) signal).b);
    }

    public final void runMethod(String methodName, sls callback) {
        xby.d.getClass();
        executeMethodOnMainThread(methodName, callback);
    }

    public final <R> void addAsyncMethodImpl(bj7 method, tls handler) {
        jl40.P();
        throw null;
    }

    @JavascriptInterface
    public final void call(String str, String str2) {
        call$default(this, str, str2, null, 4, null);
    }
}
