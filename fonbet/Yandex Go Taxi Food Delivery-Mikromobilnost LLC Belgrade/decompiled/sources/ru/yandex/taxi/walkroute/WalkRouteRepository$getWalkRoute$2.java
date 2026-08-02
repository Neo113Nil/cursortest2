package ru.yandex.taxi.walkroute;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.j18;
import defpackage.k641;
import defpackage.kra0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pw30;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/mapkit/transport/masstransit/Route;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.walkroute.WalkRouteRepository$getWalkRoute$2", f = "WalkRouteRepository.kt", l = {35, 36, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WalkRouteRepository$getWalkRoute$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $end;
    final /* synthetic */ zzs $start;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkRouteRepository$getWalkRoute$2(a aVar, zzs zzsVar, zzs zzsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$start = zzsVar;
        this.$end = zzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkRouteRepository$getWalkRoute$2(this.this$0, this.$start, this.$end, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkRouteRepository$getWalkRoute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (r14 == r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, pw30] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PedestrianRouter pedestrianRouter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            kra0 kra0Var = this.this$0.b;
            this.label = 1;
            obj = kra0Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                pedestrianRouter = (PedestrianRouter) this.L$0;
                b.b(obj);
                List<RequestPoint> list = (List) obj;
                a aVar = this.this$0;
                this.L$0 = pedestrianRouter;
                this.L$1 = list;
                this.L$2 = aVar;
                this.label = 3;
                j18 j18Var = new j18(1, dvw.b(this));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(14, y);
                cl7 cl7Var = new cl7(j18Var, cx60Var);
                y.element = new pw30(pedestrianRouter.requestRoutes(list, aVar.d, new RouteOptions(new FitnessOptions(), false), new k641(new WalkRouteRepository$getWalkRoute$2$invokeSuspend$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))), 12);
                if (cl7Var.c()) {
                    cx60Var.invoke();
                } else {
                    j18Var.w(new dx60(cl7Var, 15));
                }
                Object s = j18Var.s();
                return s == coroutineSingletons ? coroutineSingletons : s;
            }
            b.b(obj);
        }
        pedestrianRouter = (PedestrianRouter) obj;
        a aVar2 = this.this$0;
        zzs zzsVar = this.$start;
        zzs zzsVar2 = this.$end;
        this.L$0 = pedestrianRouter;
        this.label = 2;
        obj = a.a(aVar2, zzsVar, zzsVar2, this);
    }
}
