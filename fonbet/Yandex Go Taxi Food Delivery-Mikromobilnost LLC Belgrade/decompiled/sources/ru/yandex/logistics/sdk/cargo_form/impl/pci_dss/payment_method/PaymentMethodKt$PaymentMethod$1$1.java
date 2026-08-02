package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method;

import defpackage.h6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.PaymentMethodKt$PaymentMethod$1$1", f = "PaymentMethod.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PaymentMethodKt$PaymentMethod$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ h6a0 $model;
    final /* synthetic */ tls $onShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodKt$PaymentMethod$1$1(tls tlsVar, h6a0 h6a0Var, Continuation continuation) {
        super(2, continuation);
        this.$onShown = tlsVar;
        this.$model = h6a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodKt$PaymentMethod$1$1(this.$onShown, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentMethodKt$PaymentMethod$1$1 paymentMethodKt$PaymentMethod$1$1 = (PaymentMethodKt$PaymentMethod$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentMethodKt$PaymentMethod$1$1.invokeSuspend(zy11Var);
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
        this.$onShown.invoke(this.$model.j);
        return zy11.a;
    }
}
