package ru.yandex.taxi.layers.presentation.walkroute;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lt641;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$userAndObjectTracking$5$1", f = "BaseWalkRouteInteractor.kt", l = {110, 110}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$userAndObjectTracking$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $objectLocation;
    final /* synthetic */ zzs $userLocation;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWalkRouteInteractor$userAndObjectTracking$5$1(e eVar, zzs zzsVar, zzs zzsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$userLocation = zzsVar;
        this.$objectLocation = zzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseWalkRouteInteractor$userAndObjectTracking$5$1 baseWalkRouteInteractor$userAndObjectTracking$5$1 = new BaseWalkRouteInteractor$userAndObjectTracking$5$1(this.this$0, this.$userLocation, this.$objectLocation, continuation);
        baseWalkRouteInteractor$userAndObjectTracking$5$1.L$0 = obj;
        return baseWalkRouteInteractor$userAndObjectTracking$5$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseWalkRouteInteractor$userAndObjectTracking$5$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            zzs zzsVar = this.$userLocation;
            zzs zzsVar2 = this.$objectLocation;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            obj = e.a(eVar, zzsVar, zzsVar2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
