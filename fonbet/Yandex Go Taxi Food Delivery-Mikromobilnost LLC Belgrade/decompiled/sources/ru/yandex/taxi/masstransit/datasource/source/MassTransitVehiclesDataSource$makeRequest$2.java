package ru.yandex.taxi.masstransit.datasource.source;

import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vj;
import defpackage.w110;
import defpackage.wj;
import defpackage.wls;
import defpackage.x110;
import defpackage.x210;
import defpackage.y110;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/transport/masstransit/Vehicle;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/transport/masstransit/Vehicle;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.source.MassTransitVehiclesDataSource$makeRequest$2", f = "MassTransitVehiclesDataSource.kt", l = {28, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MassTransitVehiclesDataSource$makeRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ y110 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MassTransitVehiclesDataSource$makeRequest$2(y110 y110Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y110Var;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MassTransitVehiclesDataSource$makeRequest$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MassTransitVehiclesDataSource$makeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r14 == r0) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, w110] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x210 x210Var = this.this$0.a;
            this.label = 1;
            obj = x210Var.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        MasstransitInfoService masstransitInfoService = (MasstransitInfoService) obj;
        String str = this.$id;
        this.L$0 = masstransitInfoService;
        this.L$1 = str;
        this.label = 2;
        j18 j18Var = new j18(1, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(18, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        y.element = new w110(masstransitInfoService.vehicle(str, new x110(new MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MassTransitVehiclesDataSource$makeRequest$2$invokeSuspend$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 0);
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 18));
        }
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
