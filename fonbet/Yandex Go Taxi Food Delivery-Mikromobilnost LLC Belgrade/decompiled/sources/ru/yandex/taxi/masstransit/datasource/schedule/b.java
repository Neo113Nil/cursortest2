package ru.yandex.taxi.masstransit.datasource.schedule;

import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.j18;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p140;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.wj;
import defpackage.x210;
import defpackage.zy30;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class b {
    public final tt2 a;
    public final x210 b;

    public b(tt2 tt2Var, x210 x210Var) {
        this.a = tt2Var;
        this.b = x210Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a4, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, zy30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        MtStopInfoRepository$stopRequest$1 mtStopInfoRepository$stopRequest$1;
        int i;
        cl7 cl7Var;
        bVar.getClass();
        if (continuationImpl instanceof MtStopInfoRepository$stopRequest$1) {
            mtStopInfoRepository$stopRequest$1 = (MtStopInfoRepository$stopRequest$1) continuationImpl;
            int i2 = mtStopInfoRepository$stopRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopInfoRepository$stopRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopInfoRepository$stopRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopInfoRepository$stopRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x210 x210Var = bVar.b;
                    mtStopInfoRepository$stopRequest$1.L$0 = str;
                    mtStopInfoRepository$stopRequest$1.label = 1;
                    obj = x210Var.a(mtStopInfoRepository$stopRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    str = (String) mtStopInfoRepository$stopRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                MasstransitInfoService masstransitInfoService = (MasstransitInfoService) obj;
                mtStopInfoRepository$stopRequest$1.L$0 = str;
                mtStopInfoRepository$stopRequest$1.L$1 = masstransitInfoService;
                mtStopInfoRepository$stopRequest$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtStopInfoRepository$stopRequest$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(26, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new zy30(masstransitInfoService.stop(str, new p140(new MtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2(cl7Var))), 3);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 26));
                } else {
                    vjVar.invoke();
                }
                obj = j18Var.s();
            }
        }
        mtStopInfoRepository$stopRequest$1 = new MtStopInfoRepository$stopRequest$1(bVar, continuationImpl);
        Object obj2 = mtStopInfoRepository$stopRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopInfoRepository$stopRequest$1.label;
        if (i != 0) {
        }
        MasstransitInfoService masstransitInfoService2 = (MasstransitInfoService) obj2;
        mtStopInfoRepository$stopRequest$1.L$0 = str;
        mtStopInfoRepository$stopRequest$1.L$1 = masstransitInfoService2;
        mtStopInfoRepository$stopRequest$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtStopInfoRepository$stopRequest$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(26, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new zy30(masstransitInfoService2.stop(str, new p140(new MtStopInfoRepository$stopRequestgIAlus$$inlined$suspendCallbackApi$2(cl7Var))), 3);
        if (cl7Var.c()) {
        }
        obj2 = j18Var2.s();
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new MtStopInfoRepository$stopInfo$2(this, str, null), continuationImpl);
    }
}
