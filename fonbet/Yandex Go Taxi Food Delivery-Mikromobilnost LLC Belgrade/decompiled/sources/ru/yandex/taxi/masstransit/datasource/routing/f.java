package ru.yandex.taxi.masstransit.datasource.routing;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.geometry.Point;
import defpackage.b0x0;
import defpackage.bvf0;
import defpackage.cta1;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ow30;
import defpackage.py30;
import defpackage.sjh;
import defpackage.sk91;
import defpackage.su30;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.uu30;
import defpackage.uyj;
import defpackage.yw30;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.masstransit.experiment.d0;

/* loaded from: classes6.dex */
public final class f {
    public final ow30 a;
    public final a b;
    public final tt2 c;
    public final yw30 d;
    public final d0 e;
    public final ru.yandex.taxi.masstransit.trains.config.a f;
    public final tu30 g;
    public final b0x0 h;
    public final r0 i = bvf0.c(py30.h);

    public f(ow30 ow30Var, a aVar, tt2 tt2Var, yw30 yw30Var, d0 d0Var, ru.yandex.taxi.masstransit.trains.config.a aVar2, tu30 tu30Var, b0x0 b0x0Var) {
        this.a = ow30Var;
        this.b = aVar;
        this.c = tt2Var;
        this.d = yw30Var;
        this.e = d0Var;
        this.f = aVar2;
        this.g = tu30Var;
        this.h = b0x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:12:0x003d, B:18:0x0051, B:19:0x0067, B:21:0x006b, B:23:0x006f, B:25:0x0075, B:27:0x0082, B:28:0x008a, B:29:0x0097, B:31:0x009d, B:34:0x00bc, B:40:0x00c2, B:41:0x00ce, B:43:0x00d4, B:45:0x00df, B:47:0x00e5, B:51:0x00fb, B:57:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:12:0x003d, B:18:0x0051, B:19:0x0067, B:21:0x006b, B:23:0x006f, B:25:0x0075, B:27:0x0082, B:28:0x008a, B:29:0x0097, B:31:0x009d, B:34:0x00bc, B:40:0x00c2, B:41:0x00ce, B:43:0x00d4, B:45:0x00df, B:47:0x00e5, B:51:0x00fb, B:57:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:12:0x003d, B:18:0x0051, B:19:0x0067, B:21:0x006b, B:23:0x006f, B:25:0x0075, B:27:0x0082, B:28:0x008a, B:29:0x0097, B:31:0x009d, B:34:0x00bc, B:40:0x00c2, B:41:0x00ce, B:43:0x00d4, B:45:0x00df, B:47:0x00e5, B:51:0x00fb, B:57:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:12:0x003d, B:18:0x0051, B:19:0x0067, B:21:0x006b, B:23:0x006f, B:25:0x0075, B:27:0x0082, B:28:0x008a, B:29:0x0097, B:31:0x009d, B:34:0x00bc, B:40:0x00c2, B:41:0x00ce, B:43:0x00d4, B:45:0x00df, B:47:0x00e5, B:51:0x00fb, B:57:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:12:0x003d, B:18:0x0051, B:19:0x0067, B:21:0x006b, B:23:0x006f, B:25:0x0075, B:27:0x0082, B:28:0x008a, B:29:0x0097, B:31:0x009d, B:34:0x00bc, B:40:0x00c2, B:41:0x00ce, B:43:0x00d4, B:45:0x00df, B:47:0x00e5, B:51:0x00fb, B:57:0x0058), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, uu30 uu30Var, ContinuationImpl continuationImpl) {
        MtRoutesRepository$requestRoutes$1 mtRoutesRepository$requestRoutes$1;
        int i;
        ArrayList arrayList;
        Address address;
        zzs B;
        ow30 ow30Var = fVar.a;
        try {
            if (continuationImpl instanceof MtRoutesRepository$requestRoutes$1) {
                mtRoutesRepository$requestRoutes$1 = (MtRoutesRepository$requestRoutes$1) continuationImpl;
                int i2 = mtRoutesRepository$requestRoutes$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtRoutesRepository$requestRoutes$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtRoutesRepository$requestRoutes$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtRoutesRepository$requestRoutes$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mtRoutesRepository$requestRoutes$1.L$0 = uu30Var;
                        mtRoutesRepository$requestRoutes$1.label = 1;
                        if (((b) ow30Var).b(mtRoutesRepository$requestRoutes$1) == coroutineSingletons) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        uu30Var = (uu30) mtRoutesRepository$requestRoutes$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ZoneAddress zoneAddress = uu30Var.a;
                    Point point = (zoneAddress != null || (address = zoneAddress.a) == null || (B = address.B()) == null) ? null : new Point(B.a, B.b);
                    RequestPoint o = point == null ? k.o(point, RequestPointType.WAYPOINT, null) : null;
                    List<Address> list = uu30Var.b;
                    arrayList = new ArrayList();
                    for (Address address2 : list) {
                        RequestPoint o2 = k.o(new Point(address2.B().a, address2.B().b), RequestPointType.WAYPOINT, null);
                        if (o2 != null) {
                            arrayList.add(o2);
                        }
                    }
                    ArrayList m0 = o == null ? kotlin.collections.a.m0(arrayList, Collections.singletonList(o)) : arrayList;
                    if (!arrayList.isEmpty()) {
                        return new Result.Failure(new HasNoDestinationPointException());
                    }
                    if (m0.size() <= 1) {
                        return new Result.Failure(new Exception());
                    }
                    mtRoutesRepository$requestRoutes$1.L$0 = null;
                    mtRoutesRepository$requestRoutes$1.L$1 = null;
                    mtRoutesRepository$requestRoutes$1.L$2 = null;
                    mtRoutesRepository$requestRoutes$1.L$3 = null;
                    mtRoutesRepository$requestRoutes$1.L$4 = null;
                    mtRoutesRepository$requestRoutes$1.label = 2;
                    Object c = ((b) ow30Var).c(m0, mtRoutesRepository$requestRoutes$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
            }
            if (i != 0) {
            }
            ZoneAddress zoneAddress2 = uu30Var.a;
            if (zoneAddress2 != null) {
            }
            if (point == null) {
            }
            List<Address> list2 = uu30Var.b;
            arrayList = new ArrayList();
            while (r13.hasNext()) {
            }
            if (o == null) {
            }
            if (!arrayList.isEmpty()) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        mtRoutesRepository$requestRoutes$1 = new MtRoutesRepository$requestRoutes$1(fVar, continuationImpl);
        Object obj2 = mtRoutesRepository$requestRoutes$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRoutesRepository$requestRoutes$1.label;
    }

    public static ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (cta1.e((su30) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!cta1.e((su30) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return kotlin.collections.a.m0(arrayList3, arrayList2);
    }

    public static ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!sk91.a((su30) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object b(Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new MtRoutesRepository$collectRoutes$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final su30 d() {
        return ((py30) this.i.getValue()).b;
    }
}
