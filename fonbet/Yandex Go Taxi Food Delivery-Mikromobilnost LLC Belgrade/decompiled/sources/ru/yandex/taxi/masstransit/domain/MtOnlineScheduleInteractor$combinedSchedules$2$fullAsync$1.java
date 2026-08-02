package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lw211;", "Lwy30;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1", f = "MtOnlineScheduleInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    final /* synthetic */ long $timestamp;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1(q qVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$stopId = str;
        this.$timestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1(this.this$0, this.$stopId, this.$timestamp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOnlineScheduleInteractor$combinedSchedules$2$fullAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.datasource.schedule.a aVar = this.this$0.b;
            String str = this.$stopId;
            long j = this.$timestamp;
            this.label = 1;
            obj = aVar.c(j, str, this);
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
        Map map = (Map) obj;
        return map == null ? kotlin.collections.b.f() : map;
    }
}
