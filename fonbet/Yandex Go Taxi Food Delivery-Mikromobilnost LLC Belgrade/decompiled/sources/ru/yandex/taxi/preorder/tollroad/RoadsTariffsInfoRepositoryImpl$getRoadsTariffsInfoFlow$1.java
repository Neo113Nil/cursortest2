package ru.yandex.taxi.preorder.tollroad;

import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.quk0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lntj0;", "Lcwd;", "freeRoadTariffsInfo", "tollRoadTariffsInfo", "Lquk0;", "<anonymous>", "(Lntj0;Lntj0;)Lquk0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1", f = "RoadsTariffsInfoRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1 roadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1 = new RoadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1(3, (Continuation) obj3);
        roadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1.L$0 = (ntj0) obj;
        roadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1.L$1 = (ntj0) obj2;
        return roadsTariffsInfoRepositoryImpl$getRoadsTariffsInfoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ntj0 ntj0Var = (ntj0) this.L$0;
        ntj0 ntj0Var2 = (ntj0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new quk0(ntj0Var, ntj0Var2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
