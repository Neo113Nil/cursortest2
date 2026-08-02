package ru.yandex.taxi.masstransit.trains.search;

import defpackage.cmt;
import defpackage.fmt;
import defpackage.lc01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wc01;
import defpackage.wls;
import defpackage.y510;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lwc01;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.search.TrainStationSearchRepository$searchStations$2", f = "TrainStationSearchRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainStationSearchRepository$searchStations$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $nextPoint;
    final /* synthetic */ String $prevPoint;
    final /* synthetic */ String $query;
    Object L$0;
    int label;
    final /* synthetic */ lc01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationSearchRepository$searchStations$2(String str, String str2, String str3, lc01 lc01Var, Continuation continuation) {
        super(2, continuation);
        this.$query = str;
        this.$prevPoint = str2;
        this.$nextPoint = str3;
        this.this$0 = lc01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainStationSearchRepository$searchStations$2(this.$query, this.$prevPoint, this.$nextPoint, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrainStationSearchRepository$searchStations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<wc01> a = ((TrainsStationSearchApi) this.this$0.c.getValue()).a(new y510(this.$query, this.$prevPoint, this.$nextPoint));
            this.L$0 = null;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.b(a, null, this);
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
        return (fmt) obj;
    }
}
