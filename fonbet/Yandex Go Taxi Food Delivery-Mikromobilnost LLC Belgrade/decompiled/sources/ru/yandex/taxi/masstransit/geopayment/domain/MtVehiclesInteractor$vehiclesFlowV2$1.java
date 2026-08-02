package ru.yandex.taxi.masstransit.geopayment.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pn30;
import defpackage.rj40;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sl30;
import defpackage.tj40;
import defpackage.ul30;
import defpackage.w511;
import defpackage.wj40;
import defpackage.wl30;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltj40;", "vehicleInfo", "", "isNewBatchesLoading", "Lyl30;", "<anonymous>", "(Ltj40;Z)Lyl30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.domain.MtVehiclesInteractor$vehiclesFlowV2$1", f = "MtVehiclesInteractor.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtVehiclesInteractor$vehiclesFlowV2$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtVehiclesInteractor$vehiclesFlowV2$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MtVehiclesInteractor$vehiclesFlowV2$1 mtVehiclesInteractor$vehiclesFlowV2$1 = new MtVehiclesInteractor$vehiclesFlowV2$1(this.this$0, (Continuation) obj3);
        mtVehiclesInteractor$vehiclesFlowV2$1.L$0 = (tj40) obj;
        mtVehiclesInteractor$vehiclesFlowV2$1.Z$0 = booleanValue;
        return mtVehiclesInteractor$vehiclesFlowV2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tj40 tj40Var = (tj40) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        pn30 pn30Var = pn30.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = wj40.a[tj40Var.b.ordinal()];
            if (i2 == 1) {
                return new ul30(scc.g(pn30Var, pn30Var, pn30Var));
            }
            if (i2 == 2) {
                rj40 rj40Var = tj40Var.c;
                Throwable th = rj40Var != null ? rj40Var.a : null;
                return s8o.B(th) ? sl30.e : c.b(this.this$0, th);
            }
            if (i2 != 3) {
                w511.b();
                return null;
            }
            c cVar = this.this$0;
            MtVehiclesResponse mtVehiclesResponse = tj40Var.a;
            this.L$0 = null;
            this.Z$0 = z;
            this.label = 1;
            obj = c.a(cVar, mtVehiclesResponse, this);
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
        List list = (List) obj;
        if (z) {
            list = kotlin.collections.a.m0(scc.g(pn30Var, pn30Var), list);
        }
        return new wl30(list);
    }
}
