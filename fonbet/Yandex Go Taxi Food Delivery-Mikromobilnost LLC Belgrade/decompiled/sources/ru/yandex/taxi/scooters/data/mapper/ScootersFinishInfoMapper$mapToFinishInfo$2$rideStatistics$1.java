package ru.yandex.taxi.scooters.data.mapper;

import defpackage.bvf0;
import defpackage.fef;
import defpackage.gmn0;
import defpackage.kmu;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgmn0;", "<anonymous>", "(Ltse;)Lgmn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1", f = "ScootersFinishInfoMapper.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ kmu $historySession;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1(fef fefVar, kmu kmuVar, Continuation continuation, d dVar) {
        super(2, continuation);
        this.$historySession = kmuVar;
        this.this$0 = dVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1(this.$currencyRules, this.$historySession, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFinishInfoMapper$mapToFinishInfo$2$rideStatistics$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kmu.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kmu.b bVar = this.$historySession.a;
            if (bVar == null || (cVar = bVar.g) == null) {
                return null;
            }
            d dVar = this.this$0;
            fef fefVar = this.$currencyRules;
            this.label = 1;
            dVar.getClass();
            obj = bvf0.n(new ScootersFinishInfoMapper$mapToRideStatistics$2(dVar, cVar, fefVar, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (gmn0) obj;
    }
}
