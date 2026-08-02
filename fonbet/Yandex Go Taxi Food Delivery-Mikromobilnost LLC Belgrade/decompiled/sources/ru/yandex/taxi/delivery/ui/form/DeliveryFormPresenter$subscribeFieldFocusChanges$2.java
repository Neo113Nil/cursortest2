package ru.yandex.taxi.delivery.ui.form;

import defpackage.ivi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wai;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Livi;", "it", "Lzy11;", "<anonymous>", "(Livi;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$subscribeFieldFocusChanges$2", f = "DeliveryFormPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$subscribeFieldFocusChanges$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$subscribeFieldFocusChanges$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryFormPresenter$subscribeFieldFocusChanges$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryFormPresenter$subscribeFieldFocusChanges$2 deliveryFormPresenter$subscribeFieldFocusChanges$2 = (DeliveryFormPresenter$subscribeFieldFocusChanges$2) create((ivi) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryFormPresenter$subscribeFieldFocusChanges$2.invokeSuspend(zy11Var);
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
        ((wai) this.this$0.Dg()).hd();
        ((wai) this.this$0.Dg()).hideKeyboard();
        return zy11.a;
    }
}
