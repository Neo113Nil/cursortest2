package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zjb;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/go/address/models/Address;", "source", "Lzjb;", "checkout", "Lkotlin/Pair;", "<anonymous>", "(Lcom/yandex/go/address/models/Address;Lzjb;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenCheckoutFlow$2", f = "MtCheckoutInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCheckoutInteractor$listenCheckoutFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtCheckoutInteractor$listenCheckoutFlow$2 mtCheckoutInteractor$listenCheckoutFlow$2 = new MtCheckoutInteractor$listenCheckoutFlow$2(3, (Continuation) obj3);
        mtCheckoutInteractor$listenCheckoutFlow$2.L$0 = (Address) obj;
        mtCheckoutInteractor$listenCheckoutFlow$2.L$1 = (zjb) obj2;
        return mtCheckoutInteractor$listenCheckoutFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address = (Address) this.L$0;
        zjb zjbVar = (zjb) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(address, zjbVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
