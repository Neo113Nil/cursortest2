package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.payment_button;

import defpackage.cx90;
import defpackage.j4z;
import defpackage.mea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz0;
import defpackage.uzh0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmea0;", "selectedPayment", "Lpgz0;", "tipsPaymentData", "Lcx90;", "<anonymous>", "(Lmea0;Lpgz0;)Lcx90;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.payment_button.PaymentButtonStateHolder$widgetModelFlow$1", f = "PaymentButtonStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PaymentButtonStateHolder$widgetModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentButtonStateHolder$widgetModelFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentButtonStateHolder$widgetModelFlow$1 paymentButtonStateHolder$widgetModelFlow$1 = new PaymentButtonStateHolder$widgetModelFlow$1(this.this$0, (Continuation) obj3);
        paymentButtonStateHolder$widgetModelFlow$1.L$0 = (mea0) obj;
        paymentButtonStateHolder$widgetModelFlow$1.L$1 = (pgz0) obj2;
        return paymentButtonStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mea0 mea0Var = (mea0) this.L$0;
        pgz0 pgz0Var = (pgz0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (pgz0Var == null || mea0Var == null) {
            return null;
        }
        return new cx90(mea0Var.c, this.this$0.a.a(uzh0.delivery_tips_payment_subtitle, new Object[0]), new j4z(mea0Var.f, null, 30), pgz0Var.a);
    }
}
