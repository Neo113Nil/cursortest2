package ru.yandex.taxi.masstransit.router;

import defpackage.bms;
import defpackage.cu30;
import defpackage.ms30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u540;
import defpackage.x540;
import defpackage.z540;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz540;", "modalContent", "", "azimuth", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "tickets", "Lu540;", "<anonymous>", "(Lz540;FLru/yandex/taxi/masstransit/geopayment/tickets/model/a;)Lu540;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtThreadScheduleRouter$content$1$2", f = "MtThreadScheduleRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadScheduleRouter$content$1$2 extends SuspendLambda implements bms {
    final /* synthetic */ ms30 $config;
    final /* synthetic */ List<MtTransportType> $transportTypes;
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ x540 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadScheduleRouter$content$1$2(x540 x540Var, ms30 ms30Var, List list, Continuation continuation) {
        super(4, continuation);
        this.this$0 = x540Var;
        this.$config = ms30Var;
        this.$transportTypes = list;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj2).floatValue();
        MtThreadScheduleRouter$content$1$2 mtThreadScheduleRouter$content$1$2 = new MtThreadScheduleRouter$content$1$2(this.this$0, this.$config, this.$transportTypes, (Continuation) obj4);
        mtThreadScheduleRouter$content$1$2.L$0 = (z540) obj;
        mtThreadScheduleRouter$content$1$2.F$0 = floatValue;
        mtThreadScheduleRouter$content$1$2.L$1 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj3;
        return mtThreadScheduleRouter$content$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z540 z540Var = (z540) this.L$0;
        float f = this.F$0;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        cu30 d = MtPurchaseMapper.d(this.this$0.L, this.$config, this.$transportTypes, aVar);
        return new u540(z540Var, f, d.a, d.b);
    }
}
