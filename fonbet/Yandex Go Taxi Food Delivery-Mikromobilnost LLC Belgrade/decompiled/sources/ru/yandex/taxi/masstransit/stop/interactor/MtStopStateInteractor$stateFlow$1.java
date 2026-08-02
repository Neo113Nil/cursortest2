package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.bms;
import defpackage.cu30;
import defpackage.f440;
import defpackage.g140;
import defpackage.gwc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg140;", "contentState", "", "azimuth", "Lcu30;", "purchase", "Lf440;", "<anonymous>", "(Lg140;FLcu30;)Lf440;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$stateFlow$1", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$stateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj2).floatValue();
        MtStopStateInteractor$stateFlow$1 mtStopStateInteractor$stateFlow$1 = new MtStopStateInteractor$stateFlow$1(4, (Continuation) obj4);
        mtStopStateInteractor$stateFlow$1.L$0 = (g140) obj;
        mtStopStateInteractor$stateFlow$1.F$0 = floatValue;
        mtStopStateInteractor$stateFlow$1.L$1 = (cu30) obj3;
        return mtStopStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g140 g140Var = (g140) this.L$0;
        float f = this.F$0;
        cu30 cu30Var = (cu30) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new f440(g140Var, new gwc(!(f == 0.0f), f), cu30Var.a, cu30Var.b);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
