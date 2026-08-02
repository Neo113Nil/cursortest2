package ru.yandex.taxi.polling;

import android.location.Location;
import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import com.yandex.go.g;
import defpackage.adz;
import defpackage.g050;
import defpackage.g9z;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.h941;
import defpackage.jqr;
import defpackage.kbn;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yne;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.k;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class e {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final g9z f;
    public final tt2 g;
    public final ru.yandex.taxi.preorder.source.userposition.a h;
    public final h941 i;
    public final kotlinx.coroutines.sync.a j = gtq0.a();
    public final LinkedHashMap k = new LinkedHashMap();

    public e(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, g9z g9zVar, tt2 tt2Var, ru.yandex.taxi.preorder.source.userposition.a aVar, h941 h941Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = g9zVar;
        this.g = tt2Var;
        this.h = aVar;
        this.i = h941Var;
    }

    public static final k a(e eVar, jqr jqrVar, CoordinateProvider$Source coordinateProvider$Source) {
        eVar.getClass();
        return new k(jqrVar, new LocationsFlowRepository$addSendErrorOnCompletion$1(eVar, coordinateProvider$Source, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r15 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, tse tseVar, kbn kbnVar, Long l, ContinuationImpl continuationImpl) {
        LocationsFlowRepository$internalStartCollect$1 locationsFlowRepository$internalStartCollect$1;
        Object obj;
        int i;
        tse tseVar2;
        Long l2;
        g9z g9zVar = eVar.f;
        h3y h3yVar = eVar.d;
        if (continuationImpl instanceof LocationsFlowRepository$internalStartCollect$1) {
            locationsFlowRepository$internalStartCollect$1 = (LocationsFlowRepository$internalStartCollect$1) continuationImpl;
            int i2 = locationsFlowRepository$internalStartCollect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationsFlowRepository$internalStartCollect$1.label = i2 - Integer.MIN_VALUE;
                obj = locationsFlowRepository$internalStartCollect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationsFlowRepository$internalStartCollect$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = (adz) h3yVar.get();
                    locationsFlowRepository$internalStartCollect$1.L$0 = tseVar;
                    locationsFlowRepository$internalStartCollect$1.L$1 = kbnVar;
                    locationsFlowRepository$internalStartCollect$1.L$2 = l;
                    locationsFlowRepository$internalStartCollect$1.label = 1;
                    obj = ((g) adzVar).i(locationsFlowRepository$internalStartCollect$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l2 = (Long) locationsFlowRepository$internalStartCollect$1.L$2;
                        kbnVar = (kbn) locationsFlowRepository$internalStartCollect$1.L$1;
                        tseVar2 = (tse) locationsFlowRepository$internalStartCollect$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return zy11Var;
                        }
                        tse tseVar3 = tseVar2;
                        l = l2;
                        tseVar = tseVar3;
                        g9zVar.getClass();
                        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$3(eVar, kbnVar, l, null), 3);
                        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$4(eVar, kbnVar, l, null), 3);
                        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$5(eVar, kbnVar, l, null), 3);
                        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$6(eVar, kbnVar, l, null), 3);
                        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$7(eVar, kbnVar, l, null), 3);
                        return zy11Var;
                    }
                    l = (Long) locationsFlowRepository$internalStartCollect$1.L$2;
                    kbnVar = (kbn) locationsFlowRepository$internalStartCollect$1.L$1;
                    tseVar = (tse) locationsFlowRepository$internalStartCollect$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    g9zVar.getClass();
                    tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$2(eVar, kbnVar, l, null), 3);
                    adz adzVar2 = (adz) h3yVar.get();
                    locationsFlowRepository$internalStartCollect$1.L$0 = tseVar;
                    locationsFlowRepository$internalStartCollect$1.L$1 = kbnVar;
                    locationsFlowRepository$internalStartCollect$1.L$2 = l;
                    locationsFlowRepository$internalStartCollect$1.label = 2;
                    LocationSdkAndroidGoExperiment.GoConfig b = ((g) adzVar2).e.b();
                    obj = Boolean.valueOf(b != null ? b.i : true);
                    if (obj != coroutineSingletons) {
                        Long l3 = l;
                        tseVar2 = tseVar;
                        l2 = l3;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
                g9zVar.getClass();
                tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$3(eVar, kbnVar, l, null), 3);
                tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$4(eVar, kbnVar, l, null), 3);
                tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$5(eVar, kbnVar, l, null), 3);
                tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$6(eVar, kbnVar, l, null), 3);
                tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$7(eVar, kbnVar, l, null), 3);
                return zy11Var;
            }
        }
        locationsFlowRepository$internalStartCollect$1 = new LocationsFlowRepository$internalStartCollect$1(eVar, continuationImpl);
        obj = locationsFlowRepository$internalStartCollect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationsFlowRepository$internalStartCollect$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        g9zVar.getClass();
        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$3(eVar, kbnVar, l, null), 3);
        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$4(eVar, kbnVar, l, null), 3);
        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$5(eVar, kbnVar, l, null), 3);
        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$6(eVar, kbnVar, l, null), 3);
        tje.N(tseVar, null, null, new LocationsFlowRepository$internalStartCollect$7(eVar, kbnVar, l, null), 3);
        return zy11Var2;
    }

    public static final void c(e eVar, CoordinateProvider$Source coordinateProvider$Source, Location location, kbn kbnVar) {
        eVar.getClass();
        if (kbnVar.c) {
            g9z g9zVar = eVar.f;
            Objects.toString(location);
            g9zVar.getClass();
            eVar.i.a.put(coordinateProvider$Source, location);
        }
    }

    public static final Object d(e eVar, CoordinateProvider$Source coordinateProvider$Source, Location location, Long l, Continuation continuation) {
        Object f;
        eVar.getClass();
        if (l != null) {
            if ((l.longValue() > 0 ? l : null) != null && (f = eVar.f(coordinateProvider$Source, s8o.g(location, coordinateProvider$Source, null), l.longValue(), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return f;
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[LOOP:0: B:24:0x006a->B:26:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(ContinuationImpl continuationImpl) {
        LocationsFlowRepository$getCurrentState$1 locationsFlowRepository$getCurrentState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Collection collection;
        if (continuationImpl instanceof LocationsFlowRepository$getCurrentState$1) {
            locationsFlowRepository$getCurrentState$1 = (LocationsFlowRepository$getCurrentState$1) continuationImpl;
            int i2 = locationsFlowRepository$getCurrentState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationsFlowRepository$getCurrentState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationsFlowRepository$getCurrentState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationsFlowRepository$getCurrentState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar = (adz) this.d.get();
                    locationsFlowRepository$getCurrentState$1.label = 1;
                    obj = ((g) adzVar).f(locationsFlowRepository$getCurrentState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) locationsFlowRepository$getCurrentState$1.L$2;
                        Collection collection2 = (List) locationsFlowRepository$getCurrentState$1.L$1;
                        kotlin.b.b(obj);
                        collection = collection2;
                        try {
                            return kotlin.collections.b.n(this.k, kotlin.collections.b.l(new Pair(CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION, collection)));
                        } finally {
                            g050Var.d(null);
                        }
                    }
                    kotlin.b.b(obj);
                }
                List<o9z> list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (o9z o9zVar : list) {
                    arrayList.add(rzo.N(s8o.g(o9zVar.a, CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION, o9zVar.b)));
                }
                locationsFlowRepository$getCurrentState$1.L$0 = null;
                locationsFlowRepository$getCurrentState$1.L$1 = arrayList;
                aVar = this.j;
                locationsFlowRepository$getCurrentState$1.L$2 = aVar;
                locationsFlowRepository$getCurrentState$1.label = 2;
                if (aVar.a(locationsFlowRepository$getCurrentState$1) != coroutineSingletons) {
                    g050Var = aVar;
                    collection = arrayList;
                    return kotlin.collections.b.n(this.k, kotlin.collections.b.l(new Pair(CoordinateProvider$Source.RIDETECH_LOCATION_SDK_LAST_LOCATION, collection)));
                }
                return coroutineSingletons;
            }
        }
        locationsFlowRepository$getCurrentState$1 = new LocationsFlowRepository$getCurrentState$1(this, continuationImpl);
        Object obj2 = locationsFlowRepository$getCurrentState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationsFlowRepository$getCurrentState$1.label;
        if (i != 0) {
        }
        List<o9z> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        while (r9.hasNext()) {
        }
        locationsFlowRepository$getCurrentState$1.L$0 = null;
        locationsFlowRepository$getCurrentState$1.L$1 = arrayList2;
        aVar = this.j;
        locationsFlowRepository$getCurrentState$1.L$2 = aVar;
        locationsFlowRepository$getCurrentState$1.label = 2;
        if (aVar.a(locationsFlowRepository$getCurrentState$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r1v11, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(CoordinateProvider$Source coordinateProvider$Source, yne yneVar, long j, Continuation continuation) {
        LocationsFlowRepository$saveCoordinateProvider$1 locationsFlowRepository$saveCoordinateProvider$1;
        LocationsFlowRepository$saveCoordinateProvider$1 locationsFlowRepository$saveCoordinateProvider$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        CoordinateProvider$Source coordinateProvider$Source2;
        yne yneVar2;
        kotlinx.coroutines.sync.a aVar;
        long j2;
        g050 g050Var;
        sjh sjhVar;
        LocationsFlowRepository$saveCoordinateProvider$2$1 locationsFlowRepository$saveCoordinateProvider$2$1;
        try {
            if (continuation instanceof LocationsFlowRepository$saveCoordinateProvider$1) {
                locationsFlowRepository$saveCoordinateProvider$1 = (LocationsFlowRepository$saveCoordinateProvider$1) continuation;
                int i2 = locationsFlowRepository$saveCoordinateProvider$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    locationsFlowRepository$saveCoordinateProvider$1.label = i2 - Integer.MIN_VALUE;
                    locationsFlowRepository$saveCoordinateProvider$12 = locationsFlowRepository$saveCoordinateProvider$1;
                    Object obj = locationsFlowRepository$saveCoordinateProvider$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = locationsFlowRepository$saveCoordinateProvider$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        locationsFlowRepository$saveCoordinateProvider$12.L$0 = coordinateProvider$Source;
                        locationsFlowRepository$saveCoordinateProvider$12.L$1 = yneVar;
                        kotlinx.coroutines.sync.a aVar2 = this.j;
                        locationsFlowRepository$saveCoordinateProvider$12.L$2 = aVar2;
                        locationsFlowRepository$saveCoordinateProvider$12.J$0 = j;
                        locationsFlowRepository$saveCoordinateProvider$12.label = 1;
                        if (aVar2.a(locationsFlowRepository$saveCoordinateProvider$12) != coroutineSingletons) {
                            coordinateProvider$Source2 = coordinateProvider$Source;
                            yneVar2 = yneVar;
                            aVar = aVar2;
                            j2 = j;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) locationsFlowRepository$saveCoordinateProvider$12.L$2;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    long j3 = locationsFlowRepository$saveCoordinateProvider$12.J$0;
                    ?? r1 = (g050) locationsFlowRepository$saveCoordinateProvider$12.L$2;
                    yne yneVar3 = (yne) locationsFlowRepository$saveCoordinateProvider$12.L$1;
                    CoordinateProvider$Source coordinateProvider$Source3 = (CoordinateProvider$Source) locationsFlowRepository$saveCoordinateProvider$12.L$0;
                    kotlin.b.b(obj);
                    aVar = r1;
                    yneVar2 = yneVar3;
                    j2 = j3;
                    coordinateProvider$Source2 = coordinateProvider$Source3;
                    this.g.getClass();
                    sjhVar = uyj.a;
                    locationsFlowRepository$saveCoordinateProvider$2$1 = new LocationsFlowRepository$saveCoordinateProvider$2$1(yneVar2, this, coordinateProvider$Source2, j2, null);
                    locationsFlowRepository$saveCoordinateProvider$12.L$0 = null;
                    locationsFlowRepository$saveCoordinateProvider$12.L$1 = null;
                    locationsFlowRepository$saveCoordinateProvider$12.L$2 = aVar;
                    locationsFlowRepository$saveCoordinateProvider$12.J$0 = j2;
                    locationsFlowRepository$saveCoordinateProvider$12.label = 2;
                    if (tje.k0(sjhVar, locationsFlowRepository$saveCoordinateProvider$2$1, locationsFlowRepository$saveCoordinateProvider$12) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            this.g.getClass();
            sjhVar = uyj.a;
            locationsFlowRepository$saveCoordinateProvider$2$1 = new LocationsFlowRepository$saveCoordinateProvider$2$1(yneVar2, this, coordinateProvider$Source2, j2, null);
            locationsFlowRepository$saveCoordinateProvider$12.L$0 = null;
            locationsFlowRepository$saveCoordinateProvider$12.L$1 = null;
            locationsFlowRepository$saveCoordinateProvider$12.L$2 = aVar;
            locationsFlowRepository$saveCoordinateProvider$12.J$0 = j2;
            locationsFlowRepository$saveCoordinateProvider$12.label = 2;
            if (tje.k0(sjhVar, locationsFlowRepository$saveCoordinateProvider$2$1, locationsFlowRepository$saveCoordinateProvider$12) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        locationsFlowRepository$saveCoordinateProvider$1 = new LocationsFlowRepository$saveCoordinateProvider$1(this, continuation);
        locationsFlowRepository$saveCoordinateProvider$12 = locationsFlowRepository$saveCoordinateProvider$1;
        Object obj2 = locationsFlowRepository$saveCoordinateProvider$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationsFlowRepository$saveCoordinateProvider$12.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, ContinuationImpl continuationImpl) {
        LocationsFlowRepository$saveInitLocations$1 locationsFlowRepository$saveInitLocations$1;
        int i;
        long j2;
        Iterator it;
        if (continuationImpl instanceof LocationsFlowRepository$saveInitLocations$1) {
            locationsFlowRepository$saveInitLocations$1 = (LocationsFlowRepository$saveInitLocations$1) continuationImpl;
            int i2 = locationsFlowRepository$saveInitLocations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationsFlowRepository$saveInitLocations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationsFlowRepository$saveInitLocations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationsFlowRepository$saveInitLocations$1.label;
                g9z g9zVar = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g9zVar.getClass();
                    locationsFlowRepository$saveInitLocations$1.J$0 = j;
                    locationsFlowRepository$saveInitLocations$1.label = 1;
                    obj = this.h.g(locationsFlowRepository$saveInitLocations$1);
                    if (obj != obj2) {
                        j2 = j;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = locationsFlowRepository$saveInitLocations$1.J$0;
                    Iterator it2 = (Iterator) locationsFlowRepository$saveInitLocations$1.L$1;
                    kotlin.b.b(obj);
                    it = it2;
                    LocationsFlowRepository$saveInitLocations$1 locationsFlowRepository$saveInitLocations$12 = locationsFlowRepository$saveInitLocations$1;
                    while (it.hasNext()) {
                        yne yneVar = (yne) it.next();
                        CoordinateProvider$Source coordinateProvider$Source = yneVar.c;
                        locationsFlowRepository$saveInitLocations$12.L$0 = null;
                        locationsFlowRepository$saveInitLocations$12.L$1 = it;
                        locationsFlowRepository$saveInitLocations$12.L$2 = null;
                        locationsFlowRepository$saveInitLocations$12.L$3 = null;
                        locationsFlowRepository$saveInitLocations$12.J$0 = j2;
                        locationsFlowRepository$saveInitLocations$12.label = 2;
                        if (f(coordinateProvider$Source, yneVar, j2, locationsFlowRepository$saveInitLocations$12) == obj2) {
                            return obj2;
                        }
                    }
                    g9zVar.getClass();
                    return zy11.a;
                }
                j2 = locationsFlowRepository$saveInitLocations$1.J$0;
                kotlin.b.b(obj);
                it = ((Iterable) obj).iterator();
                LocationsFlowRepository$saveInitLocations$1 locationsFlowRepository$saveInitLocations$122 = locationsFlowRepository$saveInitLocations$1;
                while (it.hasNext()) {
                }
                g9zVar.getClass();
                return zy11.a;
            }
        }
        locationsFlowRepository$saveInitLocations$1 = new LocationsFlowRepository$saveInitLocations$1(this, continuationImpl);
        Object obj3 = locationsFlowRepository$saveInitLocations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationsFlowRepository$saveInitLocations$1.label;
        g9z g9zVar2 = this.f;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        LocationsFlowRepository$saveInitLocations$1 locationsFlowRepository$saveInitLocations$1222 = locationsFlowRepository$saveInitLocations$1;
        while (it.hasNext()) {
        }
        g9zVar2.getClass();
        return zy11.a;
    }
}
