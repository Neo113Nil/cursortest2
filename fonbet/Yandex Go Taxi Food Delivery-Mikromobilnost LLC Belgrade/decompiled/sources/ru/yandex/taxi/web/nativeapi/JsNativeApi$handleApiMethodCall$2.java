package ru.yandex.taxi.web.nativeapi;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
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
@mvg(c = "ru.yandex.taxi.web.nativeapi.JsNativeApi$handleApiMethodCall$2", f = "JsNativeApi.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class JsNativeApi$handleApiMethodCall$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onError;
    final /* synthetic */ tls $onHandle;
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$handleApiMethodCall$2(tls tlsVar, JsNativeApi jsNativeApi, String str, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$onHandle = tlsVar;
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$handleApiMethodCall$2(this.$onHandle, this.this$0, this.$promiseId, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$handleApiMethodCall$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        JsNativeApi jsNativeApi;
        String str2;
        tls tlsVar;
        JsNativeApi jsNativeApi2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                tls tlsVar2 = this.$onHandle;
                JsNativeApi jsNativeApi3 = this.this$0;
                str = this.$promiseId;
                tls tlsVar3 = this.$onError;
                try {
                    this.L$0 = jsNativeApi3;
                    this.L$1 = str;
                    this.L$2 = jsNativeApi3;
                    this.L$3 = str;
                    this.L$4 = tlsVar3;
                    this.label = 1;
                    if (tlsVar2.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jsNativeApi2 = jsNativeApi3;
                    jsNativeApi = jsNativeApi2;
                    str2 = str;
                    tlsVar = tlsVar3;
                } catch (Throwable th) {
                    th = th;
                    jsNativeApi = jsNativeApi3;
                    str2 = str;
                    tlsVar = tlsVar3;
                    jsNativeApi.postScriptEvaluation(xab1.c(str2, (String) tlsVar.invoke(th)));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$4;
                str2 = (String) this.L$3;
                jsNativeApi = (JsNativeApi) this.L$2;
                str = (String) this.L$1;
                jsNativeApi2 = (JsNativeApi) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jsNativeApi.postScriptEvaluation(xab1.c(str2, (String) tlsVar.invoke(th)));
                    return zy11.a;
                }
            }
            jsNativeApi2.callbackResult(str);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
