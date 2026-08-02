package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.mvg;
import defpackage.na11;
import defpackage.ny61;
import defpackage.pj40;
import defpackage.sg40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zg40;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectTransportType$1$onTransportTypeSelected$1", f = "MtTrainScheduleModalRouter.kt", l = {200}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectTransportType$1$onTransportTypeSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ na11 $selectedTransportType;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectTransportType$1$onTransportTypeSelected$1(e eVar, na11 na11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$selectedTransportType = na11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectTransportType$1$onTransportTypeSelected$1(this.this$0, this.$selectedTransportType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectTransportType$1$onTransportTypeSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.S;
            na11 na11Var = this.$selectedTransportType;
            this.label = 1;
            zg40 zg40Var = ((sg40) fVar.h.getValue()).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zg40Var.d);
            linkedHashMap.put(na11Var.a, Collections.singletonList(na11Var.b));
            if (fVar.d(zg40.a(zg40Var, null, null, null, linkedHashMap, 111), pj40.c, this) == coroutineSingletons) {
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
