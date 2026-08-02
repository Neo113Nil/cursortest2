package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.by90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutPresenter$attachView$3", f = "MtCheckoutPresenter.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutPresenter$attachView$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutPresenter$attachView$3(Continuation continuation, t tVar) {
        super(2, continuation);
        this.this$0 = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCheckoutPresenter$attachView$3(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k kVar = this.this$0.G;
            this.label = 1;
            l lVar = (l) kVar.k;
            if (new kotlinx.coroutines.flow.o(new m0(((by90) lVar.c.getValue()).b().j("transport_external"), lVar.e, new MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$2(lVar, null)), new MtCheckoutListPaymentMethodsRepositoryImpl$listenSelectedPaymentFlow$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new pi00(10, lVar), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
