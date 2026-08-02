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
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.nativeapi.JsNativeApi$handleApiMethodCall$1", f = "JsNativeApi.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class JsNativeApi$handleApiMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onError;
    final /* synthetic */ tls $onHandle;
    final /* synthetic */ String $promiseId;
    final /* synthetic */ KSerializer $serializer;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ JsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsNativeApi$handleApiMethodCall$1(JsNativeApi jsNativeApi, String str, KSerializer kSerializer, tls tlsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jsNativeApi;
        this.$promiseId = str;
        this.$serializer = kSerializer;
        this.$onHandle = tlsVar;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JsNativeApi$handleApiMethodCall$1(this.this$0, this.$promiseId, this.$serializer, this.$onHandle, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JsNativeApi$handleApiMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object th;
        JsNativeApi jsNativeApi;
        String str2;
        tls tlsVar;
        JsNativeApi jsNativeApi2;
        KSerializer kSerializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                JsNativeApi jsNativeApi3 = this.this$0;
                str = this.$promiseId;
                KSerializer kSerializer2 = this.$serializer;
                tls tlsVar2 = this.$onHandle;
                tls tlsVar3 = this.$onError;
                try {
                    this.L$0 = jsNativeApi3;
                    this.L$1 = str;
                    this.L$2 = tlsVar3;
                    this.L$3 = kSerializer2;
                    this.L$4 = str;
                    this.L$5 = jsNativeApi3;
                    this.label = 1;
                    Object invoke = tlsVar2.invoke(this);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    jsNativeApi2 = jsNativeApi3;
                    str2 = str;
                    kSerializer = kSerializer2;
                    tlsVar = tlsVar3;
                    obj = invoke;
                    jsNativeApi = jsNativeApi2;
                } catch (Throwable th2) {
                    th = th2;
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
                jsNativeApi2 = (JsNativeApi) this.L$5;
                str = (String) this.L$4;
                kSerializer = (KSerializer) this.L$3;
                tlsVar = (tls) this.L$2;
                str2 = (String) this.L$1;
                jsNativeApi = (JsNativeApi) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    jsNativeApi.postScriptEvaluation(xab1.c(str2, (String) tlsVar.invoke(th)));
                    return zy11.a;
                }
            }
            jsNativeApi2.callbackResult(str, kSerializer, obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
