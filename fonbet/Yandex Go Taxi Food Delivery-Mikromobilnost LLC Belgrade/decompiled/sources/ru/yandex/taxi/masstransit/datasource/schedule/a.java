package ru.yandex.taxi.masstransit.datasource.schedule;

import com.yandex.mapkit.transport.masstransit.MasstransitInfoService;
import com.yandex.mapkit.transport.masstransit.StopScheduleMetadata;
import defpackage.az30;
import defpackage.b64;
import defpackage.cl7;
import defpackage.dvw;
import defpackage.e2r;
import defpackage.gw00;
import defpackage.h73;
import defpackage.j18;
import defpackage.j5y;
import defpackage.ny61;
import defpackage.o140;
import defpackage.o400;
import defpackage.s5r;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vj;
import defpackage.w211;
import defpackage.wj;
import defpackage.wy30;
import defpackage.x210;
import defpackage.yy30;
import defpackage.zy30;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class a {
    public final x210 a;
    public final tt2 b;
    public final yy30 c;
    public final b d;

    public a(x210 x210Var, tt2 tt2Var, yy30 yy30Var, b bVar) {
        this.a = x210Var;
        this.b = tt2Var;
        this.c = yy30Var;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, zy30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, long j, ContinuationImpl continuationImpl) {
        MtScheduleInfoService$scheduleRequest$1 mtScheduleInfoService$scheduleRequest$1;
        int i;
        long j2;
        String str2;
        cl7 cl7Var;
        aVar.getClass();
        if (continuationImpl instanceof MtScheduleInfoService$scheduleRequest$1) {
            mtScheduleInfoService$scheduleRequest$1 = (MtScheduleInfoService$scheduleRequest$1) continuationImpl;
            int i2 = mtScheduleInfoService$scheduleRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtScheduleInfoService$scheduleRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtScheduleInfoService$scheduleRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtScheduleInfoService$scheduleRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x210 x210Var = aVar.a;
                    mtScheduleInfoService$scheduleRequest$1.L$0 = str;
                    j2 = j;
                    mtScheduleInfoService$scheduleRequest$1.J$0 = j2;
                    mtScheduleInfoService$scheduleRequest$1.label = 1;
                    Object a = x210Var.a(mtScheduleInfoService$scheduleRequest$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        str2 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                j2 = mtScheduleInfoService$scheduleRequest$1.J$0;
                str2 = (String) mtScheduleInfoService$scheduleRequest$1.L$0;
                kotlin.b.b(obj);
                MasstransitInfoService masstransitInfoService = (MasstransitInfoService) obj;
                mtScheduleInfoService$scheduleRequest$1.L$0 = str2;
                mtScheduleInfoService$scheduleRequest$1.L$1 = masstransitInfoService;
                mtScheduleInfoService$scheduleRequest$1.J$0 = j2;
                mtScheduleInfoService$scheduleRequest$1.label = 2;
                j18 j18Var = new j18(1, dvw.b(mtScheduleInfoService$scheduleRequest$1));
                Ref$ObjectRef y = b64.y(j18Var);
                vj vjVar = new vj(25, y);
                cl7Var = new cl7(j18Var, vjVar);
                y.element = new zy30(masstransitInfoService.schedule(str2, new Long(j2), new az30(new MtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))), 1);
                if (cl7Var.c()) {
                    j18Var.w(new wj(cl7Var, 25));
                } else {
                    vjVar.invoke();
                }
                obj = j18Var.s();
            }
        }
        mtScheduleInfoService$scheduleRequest$1 = new MtScheduleInfoService$scheduleRequest$1(aVar, continuationImpl);
        Object obj2 = mtScheduleInfoService$scheduleRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtScheduleInfoService$scheduleRequest$1.label;
        if (i != 0) {
        }
        MasstransitInfoService masstransitInfoService2 = (MasstransitInfoService) obj2;
        mtScheduleInfoService$scheduleRequest$1.L$0 = str2;
        mtScheduleInfoService$scheduleRequest$1.L$1 = masstransitInfoService2;
        mtScheduleInfoService$scheduleRequest$1.J$0 = j2;
        mtScheduleInfoService$scheduleRequest$1.label = 2;
        j18 j18Var2 = new j18(1, dvw.b(mtScheduleInfoService$scheduleRequest$1));
        Ref$ObjectRef y2 = b64.y(j18Var2);
        vj vjVar2 = new vj(25, y2);
        cl7Var = new cl7(j18Var2, vjVar2);
        y2.element = new zy30(masstransitInfoService2.schedule(str2, new Long(j2), new az30(new MtScheduleInfoService$scheduleRequest0E7RQCE$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))), 1);
        if (cl7Var.c()) {
        }
        obj2 = j18Var2.s();
    }

    public final LinkedHashMap b(long j, List list) {
        e2r k = kotlin.sequences.b.k(new h73(1, list), new j5y(this, j, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s5r s5rVar = new s5r(k);
        while (s5rVar.hasNext()) {
            Object next = s5rVar.next();
            wy30 wy30Var = (wy30) next;
            linkedHashMap.put(new w211(wy30Var.a(), wy30Var.b()), next);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(long j, String str, ContinuationImpl continuationImpl) {
        MtScheduleInfoService$fullSchedules$1 mtScheduleInfoService$fullSchedules$1;
        int i;
        a aVar;
        long j2;
        StopScheduleMetadata stopScheduleMetadata;
        if (continuationImpl instanceof MtScheduleInfoService$fullSchedules$1) {
            mtScheduleInfoService$fullSchedules$1 = (MtScheduleInfoService$fullSchedules$1) continuationImpl;
            int i2 = mtScheduleInfoService$fullSchedules$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtScheduleInfoService$fullSchedules$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtScheduleInfoService$fullSchedules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtScheduleInfoService$fullSchedules$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtScheduleInfoService$fullSchedules$1.L$0 = null;
                    mtScheduleInfoService$fullSchedules$1.J$0 = j;
                    mtScheduleInfoService$fullSchedules$1.label = 1;
                    this.b.getClass();
                    sjh sjhVar = uyj.a;
                    aVar = this;
                    obj = tje.k0(o400.a, new MtScheduleInfoService$stopScheduleMetadata$2(aVar, str, j, null), mtScheduleInfoService$fullSchedules$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j2 = j;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = mtScheduleInfoService$fullSchedules$1.J$0;
                    kotlin.b.b(obj);
                    aVar = this;
                }
                stopScheduleMetadata = (StopScheduleMetadata) obj;
                if (stopScheduleMetadata != null) {
                    return null;
                }
                return aVar.b(j2, stopScheduleMetadata.getLinesAtStop());
            }
        }
        mtScheduleInfoService$fullSchedules$1 = new MtScheduleInfoService$fullSchedules$1(this, continuationImpl);
        Object obj2 = mtScheduleInfoService$fullSchedules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtScheduleInfoService$fullSchedules$1.label;
        if (i != 0) {
        }
        stopScheduleMetadata = (StopScheduleMetadata) obj2;
        if (stopScheduleMetadata != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(long j, String str, List list, ContinuationImpl continuationImpl) {
        MtScheduleInfoService$onlineSchedules$1 mtScheduleInfoService$onlineSchedules$1;
        int i;
        o140 o140Var;
        if (continuationImpl instanceof MtScheduleInfoService$onlineSchedules$1) {
            mtScheduleInfoService$onlineSchedules$1 = (MtScheduleInfoService$onlineSchedules$1) continuationImpl;
            int i2 = mtScheduleInfoService$onlineSchedules$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtScheduleInfoService$onlineSchedules$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtScheduleInfoService$onlineSchedules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtScheduleInfoService$onlineSchedules$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtScheduleInfoService$onlineSchedules$1.L$0 = null;
                    mtScheduleInfoService$onlineSchedules$1.L$1 = list;
                    mtScheduleInfoService$onlineSchedules$1.J$0 = j;
                    mtScheduleInfoService$onlineSchedules$1.label = 1;
                    obj = this.d.b(str, mtScheduleInfoService$onlineSchedules$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = mtScheduleInfoService$onlineSchedules$1.J$0;
                    list = (List) mtScheduleInfoService$onlineSchedules$1.L$1;
                    kotlin.b.b(obj);
                }
                o140Var = (o140) obj;
                if (o140Var == null) {
                    return b(j, o140Var.b);
                }
                List list2 = list;
                int d = gw00.d(tcc.n(list2, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Pair pair = new Pair((w211) it.next(), null);
                    linkedHashMap.put(pair.c(), pair.f());
                }
                return linkedHashMap;
            }
        }
        mtScheduleInfoService$onlineSchedules$1 = new MtScheduleInfoService$onlineSchedules$1(this, continuationImpl);
        Object obj2 = mtScheduleInfoService$onlineSchedules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtScheduleInfoService$onlineSchedules$1.label;
        if (i != 0) {
        }
        o140Var = (o140) obj2;
        if (o140Var == null) {
        }
    }
}
