package ru.yandex.taxi.proxy;

import com.yandex.go.proxyprovision.GoEndpointDescriptionResult;
import defpackage.fxf0;
import defpackage.g8a1;
import defpackage.iq20;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pot;
import defpackage.tse;
import defpackage.wls;
import defpackage.xab1;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.proxy.ProxyProvisionNativeApi$handleGetEndpointDescription$1", f = "ProxyProvisionNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ProxyProvisionNativeApi$handleGetEndpointDescription$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ ProxyProvisionNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyProvisionNativeApi$handleGetEndpointDescription$1(String[] strArr, ProxyProvisionNativeApi proxyProvisionNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.$params = strArr;
        this.this$0 = proxyProvisionNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProxyProvisionNativeApi$handleGetEndpointDescription$1(this.$params, this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProxyProvisionNativeApi$handleGetEndpointDescription$1 proxyProvisionNativeApi$handleGetEndpointDescription$1 = (ProxyProvisionNativeApi$handleGetEndpointDescription$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        proxyProvisionNativeApi$handleGetEndpointDescription$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        fxf0 fxf0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String[] strArr = this.$params;
        ProxyProvisionNativeApi proxyProvisionNativeApi = this.this$0;
        String str2 = this.$promiseId;
        try {
            str = (String) j73.C(strArr);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            proxyProvisionNativeApi.postScriptEvaluation(xab1.c(str2, message));
        }
        if (str == null) {
            throw new IllegalArgumentException(ProxyProvisionNativeApi.INCORRECT_PARAMS_DESCRIPTION);
        }
        fxf0Var = proxyProvisionNativeApi.dynamicApiNameProvider;
        iq20 b = ((pot) fxf0Var).a.b(str);
        if (b == null) {
            throw new IllegalArgumentException(ProxyProvisionNativeApi.NOT_FOUND_PROXIES_DESCRIPTION.concat(str).toString());
        }
        proxyProvisionNativeApi.callbackResult(str2, GoEndpointDescriptionResult.Companion.serializer(), g8a1.c(b));
        return zy11.a;
    }
}
