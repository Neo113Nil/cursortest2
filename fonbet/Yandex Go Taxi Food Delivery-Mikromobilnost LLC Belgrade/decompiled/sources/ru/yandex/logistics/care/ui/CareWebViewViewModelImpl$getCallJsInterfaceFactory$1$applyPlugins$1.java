package ru.yandex.logistics.care.ui;

import defpackage.ei7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lei7;", "<anonymous>", "(Ljava/lang/String;)Lei7;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1", f = "CareWebViewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onHideWebViewRequest;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1(l lVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$onHideWebViewRequest = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1(this.this$0, this.$onHideWebViewRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$getCallJsInterfaceFactory$1$applyPlugins$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l lVar = this.this$0;
        lVar.E = c.a(lVar.E, CareWebViewViewModelImpl$SdkCloseType.JS_SIGNAL);
        try {
            this.$onHideWebViewRequest.invoke();
            return new ei7("{}", null);
        } catch (Exception e) {
            this.$onHideWebViewRequest.invoke();
            String message = e.getMessage();
            return new ei7(null, message != null ? message : "{}");
        }
    }
}
