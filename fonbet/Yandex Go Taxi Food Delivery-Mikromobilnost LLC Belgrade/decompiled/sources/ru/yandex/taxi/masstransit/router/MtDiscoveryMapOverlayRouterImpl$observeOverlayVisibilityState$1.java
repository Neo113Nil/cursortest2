package ru.yandex.taxi.masstransit.router;

import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import defpackage.li30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/superapp/discovery/map/api/repositories/state/SuperAppDiscoveryMapOverlayState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.masstransit.router.MtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1", f = "MtDiscoveryMapOverlayRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1 mtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1 = new MtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1(2, continuation);
        mtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1.L$0 = obj;
        return mtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtDiscoveryMapOverlayRouterImpl$observeOverlayVisibilityState$1) create((SuperAppDiscoveryMapOverlayState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = (SuperAppDiscoveryMapOverlayState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        int i = li30.a[superAppDiscoveryMapOverlayState.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                w511.b();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
