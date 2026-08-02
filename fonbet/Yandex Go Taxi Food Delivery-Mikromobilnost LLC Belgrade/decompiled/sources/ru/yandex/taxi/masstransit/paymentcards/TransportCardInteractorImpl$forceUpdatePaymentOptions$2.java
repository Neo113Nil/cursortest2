package ru.yandex.taxi.masstransit.paymentcards;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q111;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq111;", ConfigConstants.CONFIG, "Lcom/yandex/go/address/models/Address;", "address", "Lkotlin/Pair;", "<anonymous>", "(Lq111;Lcom/yandex/go/address/models/Address;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.paymentcards.TransportCardInteractorImpl$forceUpdatePaymentOptions$2", f = "TransportCardInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransportCardInteractorImpl$forceUpdatePaymentOptions$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportCardInteractorImpl$forceUpdatePaymentOptions$2 transportCardInteractorImpl$forceUpdatePaymentOptions$2 = new TransportCardInteractorImpl$forceUpdatePaymentOptions$2(3, (Continuation) obj3);
        transportCardInteractorImpl$forceUpdatePaymentOptions$2.L$0 = (q111) obj;
        transportCardInteractorImpl$forceUpdatePaymentOptions$2.L$1 = (Address) obj2;
        return transportCardInteractorImpl$forceUpdatePaymentOptions$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q111 q111Var = (q111) this.L$0;
        Address address = (Address) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(address, q111Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
