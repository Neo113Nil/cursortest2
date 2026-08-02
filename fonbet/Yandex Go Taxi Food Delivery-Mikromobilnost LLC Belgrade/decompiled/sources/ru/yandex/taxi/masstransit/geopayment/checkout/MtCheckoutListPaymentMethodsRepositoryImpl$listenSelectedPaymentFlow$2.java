package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.by90;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Llv90;", "selectedPayment", "", "Llea0;", "listPaymentMethodsResponse", "Lon30;", "<anonymous>", "(Llv90;Ljava/util/List;)Lon30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2", f = "MtCheckoutListPaymentMethodsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2(l lVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2 mtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2 = new MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2(this.this$0, (Continuation) obj3);
        mtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2.L$0 = (lv90) obj;
        mtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2.L$1 = (List) obj2;
        return mtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lv90 lv90Var = (lv90) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l lVar = this.this$0;
        List list2 = ((by90) lVar.c.getValue()).b().b("no_feature").a;
        if (list2.isEmpty()) {
            List list3 = list;
            if (list3 == null || list3.isEmpty()) {
                list = EmptyList.a;
            }
        } else {
            list = list2;
        }
        return lVar.a(list, lv90Var);
    }
}
