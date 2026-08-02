package ru.yandex.taxi.logistics.payment_method_selector;

import defpackage.e4a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vt90;
import defpackage.zjz0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le4a0;", "paymentMethod", "", "alternative", "Lvt90;", "<anonymous>", "(Le4a0;Ljava/lang/String;)Lvt90;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.payment_method_selector.PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1", f = "PayOnDeliveryProhibitedInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1(Continuation continuation, c cVar) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1 payOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1 = new PayOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1((Continuation) obj3, this.this$0);
        payOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1.L$0 = (e4a0) obj;
        payOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1.L$1 = (String) obj2;
        return payOnDeliveryProhibitedInteractorImpl$isProhibitedFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean contains;
        e4a0 e4a0Var = (e4a0) this.L$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean a = c.a(this.this$0, e4a0Var);
        c cVar = this.this$0;
        if (str == null) {
            cVar.getClass();
            contains = false;
        } else {
            contains = cVar.e.b().i.contains(str);
        }
        zjz0 e = this.this$0.e.e();
        boolean z = a || contains;
        if (a) {
            str2 = e.d;
        } else if (contains) {
            str2 = e.e;
        }
        return new vt90(z, str2);
    }
}
