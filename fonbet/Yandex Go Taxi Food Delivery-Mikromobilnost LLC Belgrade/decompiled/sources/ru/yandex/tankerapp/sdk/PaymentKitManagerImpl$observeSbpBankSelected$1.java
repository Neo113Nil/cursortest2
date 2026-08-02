package ru.yandex.tankerapp.sdk;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.sdk.PaymentKitManagerImpl$observeSbpBankSelected$1", f = "PaymentKitManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class PaymentKitManagerImpl$observeSbpBankSelected$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentKitManagerImpl$observeSbpBankSelected$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentKitManagerImpl$observeSbpBankSelected$1 paymentKitManagerImpl$observeSbpBankSelected$1 = new PaymentKitManagerImpl$observeSbpBankSelected$1(this.this$0, continuation);
        paymentKitManagerImpl$observeSbpBankSelected$1.L$0 = obj;
        return paymentKitManagerImpl$observeSbpBankSelected$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentKitManagerImpl$observeSbpBankSelected$1 paymentKitManagerImpl$observeSbpBankSelected$1 = (PaymentKitManagerImpl$observeSbpBankSelected$1) create((String) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentKitManagerImpl$observeSbpBankSelected$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.y = str;
        return zy11.a;
    }
}
