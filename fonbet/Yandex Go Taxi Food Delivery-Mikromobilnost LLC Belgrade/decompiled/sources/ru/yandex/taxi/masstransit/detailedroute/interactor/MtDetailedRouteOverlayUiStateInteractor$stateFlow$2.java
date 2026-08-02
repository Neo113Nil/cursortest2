package ru.yandex.taxi.masstransit.detailedroute.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fay0;
import defpackage.fc30;
import defpackage.ig30;
import defpackage.jf30;
import defpackage.m2j;
import defpackage.mvg;
import defpackage.n2j;
import defpackage.ny61;
import defpackage.su30;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Triple;", "Lfc30;", "Lig30;", "", "Lom30;", "<destruct>", "Ln2j;", "<anonymous>", "(Lkotlin/Triple;)Ln2j;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.interactor.MtDetailedRouteOverlayUiStateInteractor$stateFlow$2", f = "MtDetailedRouteOverlayUiStateInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayUiStateInteractor$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ su30 $route;
    final /* synthetic */ fay0 $taxiSectionData;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteOverlayUiStateInteractor$stateFlow$2(a aVar, su30 su30Var, fay0 fay0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$route = su30Var;
        this.$taxiSectionData = fay0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDetailedRouteOverlayUiStateInteractor$stateFlow$2 mtDetailedRouteOverlayUiStateInteractor$stateFlow$2 = new MtDetailedRouteOverlayUiStateInteractor$stateFlow$2(this.this$0, this.$route, this.$taxiSectionData, continuation);
        mtDetailedRouteOverlayUiStateInteractor$stateFlow$2.L$0 = obj;
        return mtDetailedRouteOverlayUiStateInteractor$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDetailedRouteOverlayUiStateInteractor$stateFlow$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        ig30 ig30Var;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            fc30 fc30Var = (fc30) triple.getFirst();
            ig30 ig30Var2 = (ig30) triple.getSecond();
            list = (List) triple.getThird();
            ru.yandex.taxi.masstransit.detailedroute.mapper.a aVar = this.this$0.d;
            su30 su30Var = this.$route;
            jf30 jf30Var = ig30Var2.a;
            fay0 fay0Var = this.$taxiSectionData;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ig30Var2;
            this.L$3 = list;
            this.label = 1;
            Object a = aVar.a(su30Var, jf30Var, fc30Var, fay0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ig30Var = ig30Var2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = (List) this.L$3;
            ig30Var = (ig30) this.L$2;
            b.b(obj);
        }
        return new n2j((m2j) obj, ig30Var.b, ig30Var.c, ig30Var.a, list);
    }
}
