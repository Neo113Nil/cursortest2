package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now;

import defpackage.mvg;
import defpackage.nt90;
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
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.PayNowKt$PayNow$3$1", f = "PayNow.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayNowKt$PayNow$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ nt90 $model;
    final /* synthetic */ tls $onButtonShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayNowKt$PayNow$3$1(tls tlsVar, nt90 nt90Var, Continuation continuation) {
        super(2, continuation);
        this.$onButtonShown = tlsVar;
        this.$model = nt90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PayNowKt$PayNow$3$1(this.$onButtonShown, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PayNowKt$PayNow$3$1 payNowKt$PayNow$3$1 = (PayNowKt$PayNow$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        payNowKt$PayNow$3$1.invokeSuspend(zy11Var);
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
        this.$onButtonShown.invoke(this.$model.d.g.c);
        return zy11.a;
    }
}
