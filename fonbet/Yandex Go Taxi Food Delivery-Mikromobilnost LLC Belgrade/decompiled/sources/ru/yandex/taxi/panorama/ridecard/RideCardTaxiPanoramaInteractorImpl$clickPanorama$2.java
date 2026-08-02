package ru.yandex.taxi.panorama.ridecard;

import defpackage.a9y0;
import defpackage.hxx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.s8y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.panorama.ridecard.RideCardTaxiPanoramaInteractorImpl$clickPanorama$2", f = "RideCardTaxiPanoramaInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RideCardTaxiPanoramaInteractorImpl$clickPanorama$2 extends SuspendLambda implements wls {
    final /* synthetic */ s8y0 $payload;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTaxiPanoramaInteractorImpl$clickPanorama$2(d dVar, s8y0 s8y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = s8y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardTaxiPanoramaInteractorImpl$clickPanorama$2(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardTaxiPanoramaInteractorImpl$clickPanorama$2 rideCardTaxiPanoramaInteractorImpl$clickPanorama$2 = (RideCardTaxiPanoramaInteractorImpl$clickPanorama$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardTaxiPanoramaInteractorImpl$clickPanorama$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        ((pep0) dVar.h).f((a9y0) dVar.l.getValue(), this.$payload, hxx.a);
        return zy11.a;
    }
}
