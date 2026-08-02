package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui;

import defpackage.ip00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lip00;", "it", "Lzy11;", "<anonymous>", "(Lip00;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui.ModalViewViewModel$startDrawRouteSubscription$2", f = "ModalViewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ModalViewViewModel$startDrawRouteSubscription$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewViewModel$startDrawRouteSubscription$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModalViewViewModel$startDrawRouteSubscription$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ModalViewViewModel$startDrawRouteSubscription$2 modalViewViewModel$startDrawRouteSubscription$2 = (ModalViewViewModel$startDrawRouteSubscription$2) create((ip00) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        modalViewViewModel$startDrawRouteSubscription$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.b.q4();
        return zy11.a;
    }
}
