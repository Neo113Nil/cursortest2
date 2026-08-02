package ru.yandex.taxi.masstransit.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w211;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "", "Lw211;", "Lwy30;", "Lru/yandex/taxi/masstransit/model/MtTransportSchedules;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1", f = "MtOnlineScheduleInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $stopId;
    final /* synthetic */ long $timestamp;
    final /* synthetic */ List<w211> $transportIds;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1(q qVar, String str, List list, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$stopId = str;
        this.$transportIds = list;
        this.$timestamp = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1(this.this$0, this.$stopId, this.$transportIds, this.$timestamp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOnlineScheduleInteractor$combinedSchedules$2$onlineAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        ru.yandex.taxi.masstransit.datasource.schedule.a aVar = this.this$0.b;
        String str = this.$stopId;
        List<w211> list = this.$transportIds;
        long j = this.$timestamp;
        this.label = 1;
        Serializable d = aVar.d(j, str, list, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
