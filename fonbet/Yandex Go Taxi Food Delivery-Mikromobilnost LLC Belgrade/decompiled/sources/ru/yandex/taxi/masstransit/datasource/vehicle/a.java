package ru.yandex.taxi.masstransit.datasource.vehicle;

import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qj40;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.w110;
import defpackage.wj;
import defpackage.x210;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final x210 b;

    public a(tt2 tt2Var, x210 x210Var) {
        this.a = tt2Var;
        this.b = x210Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, w110] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        MtVehicleRepository$mapKitRequest$1 mtVehicleRepository$mapKitRequest$1;
        int i;
        cl7 cl7Var;
        aVar.getClass();
        if (continuationImpl instanceof MtVehicleRepository$mapKitRequest$1) {
            mtVehicleRepository$mapKitRequest$1 = (MtVehicleRepository$mapKitRequest$1) continuationImpl;
            int i2 = mtVehicleRepository$mapKitRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtVehicleRepository$mapKitRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtVehicleRepository$mapKitRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtVehicleRepository$mapKitRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    x210 x210Var = aVar.b;
                    mtVehicleRepository$mapKitRequest$1.L$0 = str;
                    mtVehicleRepository$mapKitRequest$1.label = 1;
                    obj = x210Var.a(mtVehicleRepository$mapKitRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) mtVehicleRepository$mapKitRequest$1.L$0;
                    b.b(obj);
                }
                MasstransitInfoService masstransitInfoService = (MasstransitInfoService) obj;
                mtVehicleRepository$mapKitRequest$1.L$0 = str;
                mtVehicleRepository$mapKitRequest$1.L$1 = masstransitInfoService;
                mtVehicleRepository$mapKitRequest$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtVehicleRepository$mapKitRequest$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(28, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new w110(masstransitInfoService.vehicle(str, new qj40(new MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 2);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 28));
                } else {
                    vjVar.invoke();
                }
                Object s = j18Var.s();
                return s != coroutineSingletons ? coroutineSingletons : s;
            }
        }
        mtVehicleRepository$mapKitRequest$1 = new MtVehicleRepository$mapKitRequest$1(aVar, continuationImpl);
        Object obj2 = mtVehicleRepository$mapKitRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtVehicleRepository$mapKitRequest$1.label;
        if (i != 0) {
        }
        MasstransitInfoService masstransitInfoService2 = (MasstransitInfoService) obj2;
        mtVehicleRepository$mapKitRequest$1.L$0 = str;
        mtVehicleRepository$mapKitRequest$1.L$1 = masstransitInfoService2;
        mtVehicleRepository$mapKitRequest$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtVehicleRepository$mapKitRequest$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(28, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new w110(masstransitInfoService2.vehicle(str, new qj40(new MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MtVehicleRepository$mapKitRequest$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0))), 2);
        if (cl7Var.c()) {
        }
        Object s2 = j18Var2.s();
        if (s2 != coroutineSingletons2) {
        }
    }

    public final Object b(String str, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new MtVehicleRepository$getVehicle$2(this, str, null), suspendLambda);
    }
}
