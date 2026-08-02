package ru.yandex.taxi.scooters.domain;

import defpackage.ea90;
import defpackage.g92;
import defpackage.jl40;
import defpackage.lrj0;
import defpackage.mvg;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.p641;
import defpackage.se90;
import defpackage.sqm0;
import defpackage.tpr;
import defpackage.uh6;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1", f = "ScootersWalkRouteOnOrderInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ zzs $actualScooterPosition$inlined;
    final /* synthetic */ String $objectId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1(zzs zzsVar, String str, Continuation continuation, s sVar) {
        super(3, continuation);
        this.this$0 = sVar;
        this.$objectId$inlined = str;
        this.$actualScooterPosition$inlined = zzsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar = this.this$0;
        String str = this.$objectId$inlined;
        ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1 scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1 = new ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1(this.$actualScooterPosition$inlined, str, (Continuation) obj3, sVar);
        scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1.L$1 = obj2;
        return scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        tpr K;
        vpr vprVar = (vpr) this.L$0;
        Object obj3 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = this.this$0;
            String str = this.$objectId$inlined;
            zzs zzsVar = this.$actualScooterPosition$inlined;
            Iterator it = uh6.C((sqm0) obj3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((zuo0) obj2).getNumber().a, this.$objectId$inlined)) {
                    break;
                }
            }
            zuo0 zuo0Var = (zuo0) obj2;
            sVar.getClass();
            if (zuo0Var == null) {
                K = new g92(2, p641.a);
            } else if ((zuo0Var instanceof ea90) || (zuo0Var instanceof se90) || (zuo0Var instanceof lrj0)) {
                K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{sVar.g(zzsVar, str), sVar.f(str, zzsVar, sVar.f)}, 2));
            } else {
                if (!(zuo0Var instanceof nrk0)) {
                    w511.b();
                    return null;
                }
                K = sVar.e(str);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(K, vprVar, this) == coroutineSingletons) {
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
