package ru.yandex.taxi.logistics.common;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnv0;
import defpackage.ynv0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.common.DeliverySummaryRouterImpl$openPaymentMethodsAsync$1", f = "DeliverySummaryRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySummaryRouterImpl$openPaymentMethodsAsync$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySummaryRouterImpl$openPaymentMethodsAsync$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliverySummaryRouterImpl$openPaymentMethodsAsync$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliverySummaryRouterImpl$openPaymentMethodsAsync$1 deliverySummaryRouterImpl$openPaymentMethodsAsync$1 = (DeliverySummaryRouterImpl$openPaymentMethodsAsync$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliverySummaryRouterImpl$openPaymentMethodsAsync$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ynv0 b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        try {
            b = aVar.n.b(null, null);
            aVar.b(b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.r("Unexpected exception thrown", th);
            aVar.b(xnv0.a);
        }
        return zy11.a;
    }
}
