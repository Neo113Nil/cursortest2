package ru.yandex.taxi.logistics.ndd_map.walkroute;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o641;
import defpackage.p641;
import defpackage.pvn;
import defpackage.q641;
import defpackage.t641;
import defpackage.tpr;
import defpackage.u641;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.walkroute.SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1", f = "SimpleWalkToDeliveryInteractor.kt", l = {216, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ zzs $objectPosition$inlined;
    final /* synthetic */ zzs $suggestLocation$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1(Continuation continuation, zzs zzsVar, a aVar, zzs zzsVar2) {
        super(3, continuation);
        this.$suggestLocation$inlined = zzsVar;
        this.this$0 = aVar;
        this.$objectPosition$inlined = zzsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1 simpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1 = new SimpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1((Continuation) obj3, this.$suggestLocation$inlined, this.this$0, this.$objectPosition$inlined);
        simpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        simpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1.L$1 = obj2;
        return simpleWalkToDeliveryInteractor$listenToWalkRoutes$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r0, r8) != r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r9 == r2) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr tprVar;
        t641 q641Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zzs zzsVar = (zzs) obj2;
            zzs zzsVar2 = this.$suggestLocation$inlined;
            if (zzsVar2 == null || zzsVar2.equals(zzsVar)) {
                tprVar = pvn.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            } else {
                a aVar = this.this$0;
                zzs zzsVar3 = this.$suggestLocation$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                obj = aVar.c(zzsVar3, zzsVar, this);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        Route route = (Route) obj;
        if (route == null) {
            q641Var = p641.a;
        } else {
            u641.a(this.this$0.d, null, route.getGeometry().getPoints(), 1);
            q641Var = new q641(route);
        }
        List list = this.this$0.d.b;
        if (list == null) {
            list = EmptyList.a;
        }
        tprVar = new h(new t641[]{q641Var, new o641(list)});
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
