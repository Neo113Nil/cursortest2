package ru.yandex.taxi.masstransit.threadvariants;

import defpackage.d370;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000j\u0002`\u00040\u0000j\u0002`\u00052(\u0010\u0006\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000j\u0002`\u00040\u0000j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "", "Lw211;", "Lwy30;", "Lru/yandex/taxi/masstransit/model/MtTransportSchedules;", "Lru/yandex/taxi/masstransit/model/MtOnlineSchedule;", "acc", "Ld370;", "scheduleResponse", "<anonymous>", "(Ljava/util/Map;Ld370;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadvariants.MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1", f = "MtThreadVariantsUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1 mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1 = new MtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1(3, (Continuation) obj3);
        mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1.L$0 = (Map) obj;
        mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1.L$1 = (d370) obj2;
        return mtThreadVariantsUiStateInteractor$groundStateFlow$2$scheduleFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        d370 d370Var = (d370) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return kotlin.collections.b.o(map, new Pair(d370Var.a, d370Var.b));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
