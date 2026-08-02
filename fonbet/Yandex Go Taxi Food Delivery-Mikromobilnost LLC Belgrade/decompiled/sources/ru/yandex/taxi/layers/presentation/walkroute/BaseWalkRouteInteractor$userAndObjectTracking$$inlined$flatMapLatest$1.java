package ru.yandex.taxi.layers.presentation.walkroute;

import defpackage.d641;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1", f = "BaseWalkRouteInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1(Continuation continuation, e eVar) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1 baseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1 = new BaseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        baseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        baseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1.L$1 = obj2;
        return baseWalkRouteInteractor$userAndObjectTracking$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            zzs zzsVar = (zzs) pair.getFirst();
            rol0 rol0Var = new rol0(new BaseWalkRouteInteractor$userAndObjectTracking$5$1(this.this$0, zzsVar, (zzs) pair.getSecond(), null));
            e eVar = this.this$0;
            d641 d641Var = eVar.c;
            if (d641Var == null) {
                d641Var = null;
            }
            ru.yandex.taxi.layers.d b = d641Var.b();
            d641 d641Var2 = eVar.c;
            if (d641Var2 == null) {
                d641Var2 = null;
            }
            n nVar = new n(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{rol0Var, kotlinx.coroutines.flow.e.C(new m0(b, d641Var2.a.b.a(), new BaseWalkRouteInteractor$listenUserGeoParams$1(3, null)), new BaseWalkRouteInteractor$userAndObjectTracking$lambda$0$$inlined$flatMapMerge$1(2, null))}, 2)), new BaseWalkRouteInteractor$userAndObjectTracking$5$3(zzsVar, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(nVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
