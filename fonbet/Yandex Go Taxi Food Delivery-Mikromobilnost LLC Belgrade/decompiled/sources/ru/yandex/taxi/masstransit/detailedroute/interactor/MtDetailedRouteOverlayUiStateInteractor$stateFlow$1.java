package ru.yandex.taxi.masstransit.detailedroute.interactor;

import defpackage.dms;
import defpackage.fc30;
import defpackage.ig30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lfc30;", "icons", "Lig30;", "vehiclesData", "", "Lom30;", "hubPins", "Lkotlin/Triple;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lfc30;Lig30;Ljava/util/List;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.interactor.MtDetailedRouteOverlayUiStateInteractor$stateFlow$1", f = "MtDetailedRouteOverlayUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteOverlayUiStateInteractor$stateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MtDetailedRouteOverlayUiStateInteractor$stateFlow$1 mtDetailedRouteOverlayUiStateInteractor$stateFlow$1 = new MtDetailedRouteOverlayUiStateInteractor$stateFlow$1(5, (Continuation) obj5);
        mtDetailedRouteOverlayUiStateInteractor$stateFlow$1.L$0 = (fc30) obj2;
        mtDetailedRouteOverlayUiStateInteractor$stateFlow$1.L$1 = (ig30) obj3;
        mtDetailedRouteOverlayUiStateInteractor$stateFlow$1.L$2 = (List) obj4;
        return mtDetailedRouteOverlayUiStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fc30 fc30Var = (fc30) this.L$0;
        ig30 ig30Var = (ig30) this.L$1;
        List list = (List) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Triple(fc30Var, ig30Var, list);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
