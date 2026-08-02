package ru.yandex.taxi.masstransit.datasource.line;

import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.en30;
import defpackage.fn30;
import defpackage.gn30;
import defpackage.j18;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.wj;
import defpackage.x210;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class a implements en30 {
    public final tt2 a;
    public final x210 b;

    public a(tt2 tt2Var, x210 x210Var) {
        this.a = tt2Var;
        this.b = x210Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r14 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v5, types: [T, fn30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        MtLineRepositoryImpl$mapKitRequest$1 mtLineRepositoryImpl$mapKitRequest$1;
        int i;
        cl7 cl7Var;
        aVar.getClass();
        if (continuationImpl instanceof MtLineRepositoryImpl$mapKitRequest$1) {
            mtLineRepositoryImpl$mapKitRequest$1 = (MtLineRepositoryImpl$mapKitRequest$1) continuationImpl;
            int i2 = mtLineRepositoryImpl$mapKitRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtLineRepositoryImpl$mapKitRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtLineRepositoryImpl$mapKitRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtLineRepositoryImpl$mapKitRequest$1.label;
                if (i != 0) {
                    b.b(obj);
                    x210 x210Var = aVar.b;
                    mtLineRepositoryImpl$mapKitRequest$1.L$0 = str;
                    mtLineRepositoryImpl$mapKitRequest$1.label = 1;
                    obj = x210Var.a(mtLineRepositoryImpl$mapKitRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    str = (String) mtLineRepositoryImpl$mapKitRequest$1.L$0;
                    b.b(obj);
                }
                MasstransitInfoService masstransitInfoService = (MasstransitInfoService) obj;
                mtLineRepositoryImpl$mapKitRequest$1.L$0 = str;
                mtLineRepositoryImpl$mapKitRequest$1.L$1 = masstransitInfoService;
                mtLineRepositoryImpl$mapKitRequest$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtLineRepositoryImpl$mapKitRequest$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(21, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new fn30(masstransitInfoService.line(str, new gn30(new MtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))), 1);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 21));
                } else {
                    vjVar.invoke();
                }
                obj = j18Var.s();
            }
        }
        mtLineRepositoryImpl$mapKitRequest$1 = new MtLineRepositoryImpl$mapKitRequest$1(aVar, continuationImpl);
        Object obj2 = mtLineRepositoryImpl$mapKitRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtLineRepositoryImpl$mapKitRequest$1.label;
        if (i != 0) {
        }
        MasstransitInfoService masstransitInfoService2 = (MasstransitInfoService) obj2;
        mtLineRepositoryImpl$mapKitRequest$1.L$0 = str;
        mtLineRepositoryImpl$mapKitRequest$1.L$1 = masstransitInfoService2;
        mtLineRepositoryImpl$mapKitRequest$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtLineRepositoryImpl$mapKitRequest$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(21, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new fn30(masstransitInfoService2.line(str, new gn30(new MtLineRepositoryImpl$mapKitRequestgIAlus$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))), 1);
        if (cl7Var.c()) {
        }
        obj2 = j18Var2.s();
    }

    public final Object b(String str, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new MtLineRepositoryImpl$getLine$2(this, str, null), suspendLambda);
    }
}
