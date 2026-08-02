package ru.yandex.taxi.masstransit.domain;

import defpackage.bms;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.su30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsu30;", "route", "", "iconTag", "Lru/yandex/taxi/masstransit/experiment/f;", ConfigConstants.CONFIG, "Lwv30;", "<anonymous>", "(Lsu30;Ljava/lang/String;Lru/yandex/taxi/masstransit/experiment/f;)Lwv30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtRouteInfoInteractor$stateFlow$1", f = "MtRouteInfoInteractor.kt", l = {44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteInfoInteractor$stateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteInfoInteractor$stateFlow$1(f0 f0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = f0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        MtRouteInfoInteractor$stateFlow$1 mtRouteInfoInteractor$stateFlow$1 = new MtRouteInfoInteractor$stateFlow$1(this.this$0, (Continuation) obj4);
        mtRouteInfoInteractor$stateFlow$1.L$0 = (su30) obj;
        mtRouteInfoInteractor$stateFlow$1.L$1 = (String) obj2;
        mtRouteInfoInteractor$stateFlow$1.L$2 = (ru.yandex.taxi.masstransit.experiment.f) obj3;
        return mtRouteInfoInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        su30 su30Var = (su30) this.L$0;
        String str = (String) this.L$1;
        ru.yandex.taxi.masstransit.experiment.f fVar = (ru.yandex.taxi.masstransit.experiment.f) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f0 f0Var = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        f0Var.getClass();
        Object n = bvf0.n(new MtRouteInfoInteractor$mapUiState$2(f0Var, su30Var, fVar, str, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
