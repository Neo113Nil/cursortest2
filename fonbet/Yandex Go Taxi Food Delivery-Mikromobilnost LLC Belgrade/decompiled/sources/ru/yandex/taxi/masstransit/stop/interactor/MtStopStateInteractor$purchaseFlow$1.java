package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.mapkit.transport.masstransit.LineAtStop;
import defpackage.ms30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.x340;
import defpackage.z340;
import defpackage.zls;
import defpackage.zpb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz340;", ClidProvider.STATE, "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "tickets", "Lcu30;", "<anonymous>", "(Lz340;Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;)Lcu30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$purchaseFlow$1", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$purchaseFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ ms30 $config;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$purchaseFlow$1(g gVar, ms30 ms30Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$config = ms30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtStopStateInteractor$purchaseFlow$1 mtStopStateInteractor$purchaseFlow$1 = new MtStopStateInteractor$purchaseFlow$1(this.this$0, this.$config, (Continuation) obj3);
        mtStopStateInteractor$purchaseFlow$1.L$0 = (z340) obj;
        mtStopStateInteractor$purchaseFlow$1.L$1 = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) obj2;
        return mtStopStateInteractor$purchaseFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        z340 z340Var = (z340) this.L$0;
        ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = (ru.yandex.taxi.masstransit.geopayment.tickets.model.a) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        MtPurchaseMapper mtPurchaseMapper = this.this$0.n;
        ms30 ms30Var = this.$config;
        if (z340Var instanceof x340) {
            List list2 = ((x340) z340Var).a.b;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(zpb1.a(((LineAtStop) it.next()).getLine().getVehicleTypes()).b);
            }
            list = kotlin.collections.a.I(arrayList);
        } else {
            list = EmptyList.a;
        }
        return MtPurchaseMapper.d(mtPurchaseMapper, ms30Var, list, aVar);
    }
}
