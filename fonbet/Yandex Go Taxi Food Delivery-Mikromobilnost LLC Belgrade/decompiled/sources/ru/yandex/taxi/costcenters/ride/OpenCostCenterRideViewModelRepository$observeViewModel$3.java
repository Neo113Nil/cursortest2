package ru.yandex.taxi.costcenters.ride;

import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam;
import com.yandex.go.taxi.order.models.api.objects.OriginalRequest;
import defpackage.avj0;
import defpackage.bms;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.jve;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.n470;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o470;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.costcenters.api.CostCenterField;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "<unused var>", "", "Ljve;", "corpPayments", "Lzy11;", "Ln470;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/TaxiOrder;Ljava/util/List;V)Lru/yandex/taxi/costcenters/OpenCostCenterButtonViewModel;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.ride.OpenCostCenterRideViewModelRepository$observeViewModel$3", f = "OpenCostCenterRideViewModelRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class OpenCostCenterRideViewModelRepository$observeViewModel$3 extends SuspendLambda implements bms {
    final /* synthetic */ o2y0 $orderHolder;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCostCenterRideViewModelRepository$observeViewModel$3(c cVar, o2y0 o2y0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
        this.$orderHolder = o2y0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        OpenCostCenterRideViewModelRepository$observeViewModel$3 openCostCenterRideViewModelRepository$observeViewModel$3 = new OpenCostCenterRideViewModelRepository$observeViewModel$3(this.this$0, this.$orderHolder, (Continuation) obj4);
        openCostCenterRideViewModelRepository$observeViewModel$3.L$0 = (List) obj2;
        return openCostCenterRideViewModelRepository$observeViewModel$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        o2y0 o2y0Var = this.$orderHolder;
        cVar.getClass();
        String str = o2y0Var.b().q().b;
        if (str != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((jve) obj2).a, str)) {
                    break;
                }
            }
            jve jveVar = (jve) obj2;
            if (jveVar != null) {
                List list2 = jveVar.e;
                if (!list2.isEmpty()) {
                    OriginalRequest originalRequest = o2y0Var.b().V().f;
                    if ((originalRequest != null ? originalRequest.getG() : null) != null) {
                        String h = ((avj0) cVar.b).h(kyh0.summary_cost_center_item_title);
                        List h2 = o2y0Var.b().h();
                        List list3 = h2;
                        String str2 = "";
                        if (list3 != null && !list3.isEmpty()) {
                            Iterator it2 = kotlin.collections.a.x0(list2, new o470()).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                CostCenterField costCenterField = (CostCenterField) it2.next();
                                Iterator it3 = h2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it3.next();
                                    if (jl40.l(((CostCenterParam) obj3).a, costCenterField.a)) {
                                        break;
                                    }
                                }
                                CostCenterParam costCenterParam = (CostCenterParam) obj3;
                                String str3 = costCenterParam != null ? costCenterParam.c : null;
                                if (str3 != null && !evu0.J(str3)) {
                                    str2 = str3;
                                    break;
                                }
                            }
                        }
                        return new n470(h, str2);
                    }
                }
            }
        }
        return n470.c;
    }
}
