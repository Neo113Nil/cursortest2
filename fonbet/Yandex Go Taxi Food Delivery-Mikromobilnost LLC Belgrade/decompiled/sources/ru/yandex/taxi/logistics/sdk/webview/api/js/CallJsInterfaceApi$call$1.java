package ru.yandex.taxi.logistics.sdk.webview.api.js;

import defpackage.ei7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.webview.api.js.CallJsInterfaceApi$call$1", f = "CallJsInterfaceApi.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class CallJsInterfaceApi$call$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $methodName;
    final /* synthetic */ String $params;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ CallJsInterfaceApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallJsInterfaceApi$call$1(CallJsInterfaceApi callJsInterfaceApi, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = callJsInterfaceApi;
        this.$methodName = str;
        this.$params = str2;
        this.$token = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallJsInterfaceApi$call$1(this.this$0, this.$methodName, this.$params, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallJsInterfaceApi$call$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            map = this.this$0.methods;
            wls wlsVar = (wls) map.get(this.$methodName);
            if (wlsVar != null) {
                String str = this.$params;
                this.L$0 = null;
                this.label = 1;
                obj = wlsVar.invoke(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ei7 ei7Var = (ei7) obj;
        CallJsInterfaceApi callJsInterfaceApi = this.this$0;
        String str2 = this.$token;
        String str3 = ei7Var.a;
        if (str3 != null) {
            callJsInterfaceApi.responseSuccess(str2, str3);
        }
        CallJsInterfaceApi callJsInterfaceApi2 = this.this$0;
        String str4 = this.$token;
        String str5 = ei7Var.b;
        if (str5 != null) {
            callJsInterfaceApi2.responseError(str4, str5);
        }
        return zy11Var;
    }
}
