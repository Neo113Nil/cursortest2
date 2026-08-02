package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import defpackage.ai30;
import defpackage.dms;
import defpackage.gwc;
import defpackage.ku30;
import defpackage.lm30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yt30;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lai30;", "uiState", "Lru/yandex/taxi/masstransit/ui/routeinfo/MtFloatingButtonState;", "buttonState", "Lgwc;", "compassState", "Llm30;", "paymentContainer", "<anonymous>", "(Lai30;Lru/yandex/taxi/masstransit/ui/routeinfo/MtFloatingButtonState;Lgwc;Llm30;)Lai30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.ui.v2.MtDetailedRouteUiStateInteractor$uiStateFlow$1", f = "MtDetailedRouteUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        MtDetailedRouteUiStateInteractor$uiStateFlow$1 mtDetailedRouteUiStateInteractor$uiStateFlow$1 = new MtDetailedRouteUiStateInteractor$uiStateFlow$1(5, (Continuation) obj5);
        mtDetailedRouteUiStateInteractor$uiStateFlow$1.L$0 = (ai30) obj;
        mtDetailedRouteUiStateInteractor$uiStateFlow$1.L$1 = (MtFloatingButtonState) obj2;
        mtDetailedRouteUiStateInteractor$uiStateFlow$1.L$2 = (gwc) obj3;
        mtDetailedRouteUiStateInteractor$uiStateFlow$1.L$3 = (lm30) obj4;
        return mtDetailedRouteUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ai30 ai30Var = (ai30) this.L$0;
        MtFloatingButtonState mtFloatingButtonState = (MtFloatingButtonState) this.L$1;
        gwc gwcVar = (gwc) this.L$2;
        lm30 lm30Var = (lm30) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = ai30Var.a;
        String str2 = ai30Var.b;
        List list = ai30Var.c;
        yt30 yt30Var = ai30Var.g;
        ku30 ku30Var = ai30Var.h;
        ai30Var.getClass();
        return new ai30(str, str2, list, mtFloatingButtonState, gwcVar, lm30Var, yt30Var, ku30Var);
    }
}
