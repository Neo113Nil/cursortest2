package ru.yandex.tankerapp.sdk;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.csa0;
import defpackage.k3a0;
import defpackage.mvg;
import defpackage.n3a0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yeo;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.tankerapp.models.results.PaymentKitSelectMethodResult;
import ru.yandex.tankerapp.models.results.PaymentKitStatusResult;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "method", "Lzy11;", "<anonymous>", "(Lcom/yandex/payment/sdk/core/data/PaymentMethod;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.sdk.PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1", f = "PaymentKitManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1 paymentKitManagerImpl$observePreselectPaymentMethodFlow$1 = new PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1(this.this$0, continuation);
        paymentKitManagerImpl$observePreselectPaymentMethodFlow$1.L$0 = obj;
        return paymentKitManagerImpl$observePreselectPaymentMethodFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1 paymentKitManagerImpl$observePreselectPaymentMethodFlow$1 = (PaymentKitManagerImpl$observePreselectPaymentMethodFlow$1) create((PaymentMethod) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentKitManagerImpl$observePreselectPaymentMethodFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentMethod paymentMethod = (PaymentMethod) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        csa0 csa0Var = bVar.b;
        k3a0 k3a0Var = bVar.x;
        PaymentKitSelectMethodResult paymentKitSelectMethodResult = new PaymentKitSelectMethodResult(PaymentKitStatusResult.Success, null, n3a0.a(paymentMethod), 2, null);
        k3a0Var.getClass();
        Map b = k3a0.b(paymentKitSelectMethodResult);
        yeo yeoVar = csa0Var.b;
        if (yeoVar != null) {
            yeoVar.success(b);
        } else {
            csa0Var.a = b;
        }
        return zy11.a;
    }
}
