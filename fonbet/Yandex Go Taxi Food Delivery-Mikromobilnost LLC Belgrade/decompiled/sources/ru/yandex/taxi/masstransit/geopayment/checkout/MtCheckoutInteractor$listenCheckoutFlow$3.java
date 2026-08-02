package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.od30;
import defpackage.qd30;
import defpackage.wls;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/go/address/models/Address;", "Lzjb;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenCheckoutFlow$3", f = "MtCheckoutInteractor.kt", l = {183}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutInteractor$listenCheckoutFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutInteractor$listenCheckoutFlow$3(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtCheckoutInteractor$listenCheckoutFlow$3 mtCheckoutInteractor$listenCheckoutFlow$3 = new MtCheckoutInteractor$listenCheckoutFlow$3(continuation, this.this$0);
        mtCheckoutInteractor$listenCheckoutFlow$3.L$0 = obj;
        return mtCheckoutInteractor$listenCheckoutFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCheckoutInteractor$listenCheckoutFlow$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Address address = (Address) pair.getFirst();
            zjb zjbVar = (zjb) pair.getSecond();
            if (zjbVar instanceof yjb) {
                CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods = ((yjb) zjbVar).a.n;
                CheckoutResponse.CheckoutPaymentMethods.Source source = checkoutPaymentMethods != null ? checkoutPaymentMethods.a : null;
                if ((source == null ? -1 : od30.a[source.ordinal()]) == 1) {
                    qd30 qd30Var = this.this$0.k;
                    zzs B = address.B();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    if (((l) qd30Var).b(B, "no_feature", this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
