package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.b4l0;
import defpackage.c4l0;
import defpackage.d4l0;
import defpackage.e4l0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.x3l0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "it", "Lx3l0;", "<anonymous>", "(V)Lru/yandex/taxi/masstransit/stoproute/model/RouteInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stoproute.interactor.MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3", f = "MtStopRouteInfoInteractor.kt", l = {43, 44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ e4l0 $routeInfoParams;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3(e4l0 e4l0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$routeInfoParams = e4l0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3(this.$routeInfoParams, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopRouteInfoInteractor$requestPollingRouteInfoFlow$3) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r7 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r7 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (x3l0) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (x3l0) obj;
            }
            if (i == 3) {
                kotlin.b.b(obj);
                return (x3l0) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e4l0 e4l0Var = this.$routeInfoParams;
        if (e4l0Var instanceof c4l0) {
            a aVar = this.this$0;
            this.label = 1;
            aVar.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new MtStopRouteInfoInteractor$requestRouteInfo$2(aVar, (c4l0) e4l0Var, null), this);
        } else if (e4l0Var instanceof d4l0) {
            a aVar2 = this.this$0;
            this.label = 2;
            aVar2.a.getClass();
            sjh sjhVar2 = uyj.a;
            obj = tje.k0(mdh.b, new MtStopRouteInfoInteractor$requestRouteInfo$4(aVar2, (d4l0) e4l0Var, null), this);
        } else {
            if (!(e4l0Var instanceof b4l0)) {
                w511.b();
                return null;
            }
            a aVar3 = this.this$0;
            String str = ((b4l0) e4l0Var).a;
            this.label = 3;
            aVar3.a.getClass();
            sjh sjhVar3 = uyj.a;
            obj = tje.k0(mdh.b, new MtStopRouteInfoInteractor$routeInfoByLine$2(aVar3, str, null, null), this);
        }
        return coroutineSingletons;
    }
}
