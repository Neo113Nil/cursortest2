package ru.yandex.taxi.delivery.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ubi;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lwbi;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.interactors.DeliveryGooglePayInteractor$selectGooglePayCard$3", f = "DeliveryGooglePayInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryGooglePayInteractor$selectGooglePayCard$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryGooglePayInteractor$selectGooglePayCard$3 deliveryGooglePayInteractor$selectGooglePayCard$3 = new DeliveryGooglePayInteractor$selectGooglePayCard$3(3, (Continuation) obj3);
        deliveryGooglePayInteractor$selectGooglePayCard$3.L$0 = (vpr) obj;
        deliveryGooglePayInteractor$selectGooglePayCard$3.L$1 = (Throwable) obj2;
        return deliveryGooglePayInteractor$selectGooglePayCard$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!(th instanceof CancellationException)) {
                ubi ubiVar = new ubi(th);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(ubiVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
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
