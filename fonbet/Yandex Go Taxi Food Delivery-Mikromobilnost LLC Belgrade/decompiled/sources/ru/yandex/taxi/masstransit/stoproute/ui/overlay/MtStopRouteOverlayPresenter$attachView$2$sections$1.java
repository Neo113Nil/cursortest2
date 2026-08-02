package ru.yandex.taxi.masstransit.stoproute.ui.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ler30;", "it", "", "<anonymous>", "(Ljava/util/List;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.ui.overlay.MtStopRouteOverlayPresenter$attachView$2$sections$1", f = "MtStopRouteOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteOverlayPresenter$attachView$2$sections$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtStopRouteOverlayPresenter$attachView$2$sections$1 mtStopRouteOverlayPresenter$attachView$2$sections$1 = new MtStopRouteOverlayPresenter$attachView$2$sections$1(2, continuation);
        mtStopRouteOverlayPresenter$attachView$2$sections$1.L$0 = obj;
        return mtStopRouteOverlayPresenter$attachView$2$sections$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteOverlayPresenter$attachView$2$sections$1) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(!list.isEmpty());
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
