package ru.yandex.taxi.walkroute;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import defpackage.el00;
import defpackage.kra0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zzs;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes10.dex */
public final class a {
    public final tt2 a;
    public final kra0 b;
    public final el00 c;
    public final TimeOptions d = new TimeOptions();

    public a(tt2 tt2Var, kra0 kra0Var, el00 el00Var) {
        this.a = tt2Var;
        this.b = kra0Var;
        this.c = el00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        WalkRouteRepository$getRequestPoints$1 walkRouteRepository$getRequestPoints$1;
        Object obj;
        int i;
        Object[] objArr;
        Object obj2;
        int i2;
        zzs zzsVar3;
        Object[] objArr2;
        Object m;
        Object[] objArr3;
        Object[] objArr4;
        aVar.getClass();
        el00 el00Var = aVar.c;
        if (continuationImpl instanceof WalkRouteRepository$getRequestPoints$1) {
            walkRouteRepository$getRequestPoints$1 = (WalkRouteRepository$getRequestPoints$1) continuationImpl;
            int i3 = walkRouteRepository$getRequestPoints$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walkRouteRepository$getRequestPoints$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = walkRouteRepository$getRequestPoints$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkRouteRepository$getRequestPoints$1.label;
                int i4 = 1;
                if (i != 0) {
                    b.b(obj3);
                    Object[] objArr5 = new RequestPoint[2];
                    RequestPointType requestPointType = RequestPointType.WAYPOINT;
                    walkRouteRepository$getRequestPoints$1.L$0 = null;
                    walkRouteRepository$getRequestPoints$1.L$1 = zzsVar2;
                    walkRouteRepository$getRequestPoints$1.L$2 = objArr5;
                    walkRouteRepository$getRequestPoints$1.L$3 = objArr5;
                    walkRouteRepository$getRequestPoints$1.I$0 = 0;
                    walkRouteRepository$getRequestPoints$1.label = 1;
                    Object m2 = k.m(el00Var, zzsVar, requestPointType, null, walkRouteRepository$getRequestPoints$1);
                    if (m2 != obj) {
                        objArr = objArr5;
                        obj2 = m2;
                        i2 = 0;
                        zzsVar3 = zzsVar2;
                        objArr2 = objArr;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = walkRouteRepository$getRequestPoints$1.I$0;
                    Object[] objArr6 = (RequestPoint[]) walkRouteRepository$getRequestPoints$1.L$3;
                    objArr3 = (RequestPoint[]) walkRouteRepository$getRequestPoints$1.L$2;
                    b.b(obj3);
                    m = ((Result) obj3).getValue();
                    objArr4 = objArr6;
                    b.b(m);
                    objArr4[i4] = m;
                    return scc.g(objArr3);
                }
                i2 = walkRouteRepository$getRequestPoints$1.I$0;
                Object[] objArr7 = (RequestPoint[]) walkRouteRepository$getRequestPoints$1.L$3;
                objArr = (RequestPoint[]) walkRouteRepository$getRequestPoints$1.L$2;
                zzsVar3 = (zzs) walkRouteRepository$getRequestPoints$1.L$1;
                b.b(obj3);
                obj2 = ((Result) obj3).getValue();
                objArr2 = objArr7;
                b.b(obj2);
                objArr2[i2] = obj2;
                RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
                walkRouteRepository$getRequestPoints$1.L$0 = null;
                walkRouteRepository$getRequestPoints$1.L$1 = null;
                walkRouteRepository$getRequestPoints$1.L$2 = objArr;
                walkRouteRepository$getRequestPoints$1.L$3 = objArr;
                walkRouteRepository$getRequestPoints$1.I$0 = 1;
                walkRouteRepository$getRequestPoints$1.label = 2;
                m = k.m(el00Var, zzsVar3, requestPointType2, null, walkRouteRepository$getRequestPoints$1);
                if (m != obj) {
                    Object[] objArr8 = objArr;
                    objArr3 = objArr8;
                    objArr4 = objArr8;
                    b.b(m);
                    objArr4[i4] = m;
                    return scc.g(objArr3);
                }
                return obj;
            }
        }
        walkRouteRepository$getRequestPoints$1 = new WalkRouteRepository$getRequestPoints$1(aVar, continuationImpl);
        Object obj32 = walkRouteRepository$getRequestPoints$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkRouteRepository$getRequestPoints$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        b.b(obj2);
        objArr2[i2] = obj2;
        RequestPointType requestPointType22 = RequestPointType.WAYPOINT;
        walkRouteRepository$getRequestPoints$1.L$0 = null;
        walkRouteRepository$getRequestPoints$1.L$1 = null;
        walkRouteRepository$getRequestPoints$1.L$2 = objArr;
        walkRouteRepository$getRequestPoints$1.L$3 = objArr;
        walkRouteRepository$getRequestPoints$1.I$0 = 1;
        walkRouteRepository$getRequestPoints$1.label = 2;
        m = k.m(el00Var, zzsVar3, requestPointType22, null, walkRouteRepository$getRequestPoints$1);
        if (m != obj) {
        }
        return obj;
    }

    public final Object b(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(o400.a, new WalkRouteRepository$getWalkRoute$2(this, zzsVar, zzsVar2, null), continuationImpl);
    }
}
