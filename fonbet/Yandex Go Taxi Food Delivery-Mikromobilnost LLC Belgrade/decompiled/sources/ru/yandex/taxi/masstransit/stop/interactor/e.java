package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.mapkit.transport.masstransit.EssentialStop;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import defpackage.avj0;
import defpackage.d140;
import defpackage.d6z;
import defpackage.e140;
import defpackage.f140;
import defpackage.f69;
import defpackage.g140;
import defpackage.g440;
import defpackage.gd30;
import defpackage.h440;
import defpackage.i440;
import defpackage.k110;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lyy0;
import defpackage.myy0;
import defpackage.ny61;
import defpackage.o140;
import defpackage.oob1;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tdu;
import defpackage.thu0;
import defpackage.tis0;
import defpackage.up2;
import defpackage.v340;
import defpackage.vpr;
import defpackage.w211;
import defpackage.w340;
import defpackage.w511;
import defpackage.wy30;
import defpackage.x340;
import defpackage.y340;
import defpackage.ycc;
import defpackage.z340;
import defpackage.zpb1;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.StopModalDto;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ z340 c;
    public final /* synthetic */ i440 w;

    public e(vpr vprVar, g gVar, z340 z340Var, i440 i440Var) {
        this.a = vprVar;
        this.b = gVar;
        this.c = z340Var;
        this.w = i440Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0313 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1 mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        g140 g140Var;
        Object obj2;
        f69 f69Var;
        ArrayList arrayList;
        StopModalDto stopModalDto;
        List<StopModalDto.a> list;
        f140 d140Var;
        gd30 gd30Var;
        String str;
        Stop stop;
        StopModalDto stopModalDto2;
        String str2;
        if (continuation instanceof MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1) {
            mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1 = (MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label;
                Object obj4 = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Set set = (Set) obj;
                    h440 h440Var = this.b.l;
                    zuj0 zuj0Var = h440Var.b;
                    z340 z340Var = this.c;
                    boolean z = z340Var instanceof v340;
                    EmptyList emptyList = EmptyList.a;
                    if (z) {
                        v340 v340Var = (v340) z340Var;
                        String str3 = v340Var.a;
                        avj0 avj0Var = (avj0) zuj0Var;
                        g140Var = new g140(new tdu(avj0Var.h(kyh0.mt_stop_loading_error), avj0Var.i(kyh0.mt_short_stop, str3), null, avj0Var.i(kyh0.mt_stop, str3), 4), emptyList, new f69(Collections.singletonList(h440Var.b(v340Var)), false));
                    } else {
                        if (z340Var instanceof x340) {
                            x340 x340Var = (x340) z340Var;
                            o140 o140Var = x340Var.a;
                            tdu a = h440Var.a(o140Var.a.getName(), this.w);
                            Map map = x340Var.b;
                            k110 k110Var = x340Var.c;
                            int i3 = k110Var != null ? k110Var.l : 0;
                            String Y = (k110Var == null || (stopModalDto2 = k110Var.k) == null || (str2 = stopModalDto2.c) == null) ? null : d6z.Y(k110Var, str2);
                            List list2 = o140Var.b;
                            Stop stop2 = o140Var.a;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                LineAtStop lineAtStop = (LineAtStop) it.next();
                                List<ThreadAtStop> threadsAtStop = lineAtStop.getThreadsAtStop();
                                Stop stop3 = stop2;
                                ArrayList arrayList3 = new ArrayList(tcc.n(threadsAtStop, 10));
                                Iterator it2 = threadsAtStop.iterator();
                                while (it2.hasNext()) {
                                    ThreadAtStop threadAtStop = (ThreadAtStop) it2.next();
                                    Iterator it3 = it2;
                                    Iterator it4 = it;
                                    w211 w211Var = new w211(lineAtStop.getLine().getId(), threadAtStop.getThread().getId());
                                    wy30 wy30Var = (wy30) map.get(w211Var);
                                    tis0 t = wy30Var != null ? h440Var.c.t(wy30Var, i3, Y) : null;
                                    MtTransportType mtTransportType = zpb1.a(lineAtStop.getLine().getVehicleTypes()).b;
                                    String name = lineAtStop.getLine().getName();
                                    EssentialStop essentialStop = (EssentialStop) kotlin.collections.a.b0(threadAtStop.getThread().getEssentialStops());
                                    String name2 = (essentialStop == null || (stop = essentialStop.getStop()) == null) ? null : stop.getName();
                                    String str4 = name2 == null ? "" : name2;
                                    Map map2 = map;
                                    String str5 = t != null ? (String) t.c : "";
                                    String str6 = (t == null || (str = (String) t.w) == null) ? "" : str;
                                    kdc c = h440Var.c(mtTransportType, k110Var);
                                    int i4 = i3;
                                    String str7 = Y;
                                    long d = rzo.d(s8o.m(h440Var.c(mtTransportType, k110Var), h440Var.a));
                                    int i5 = up2.c;
                                    arrayList3.add(new lyy0(mtTransportType, name, str4, str5, str6, t != null && t.b, c, new up2(d), new thu0(stop3.getId(), w211Var), threadAtStop.getThread().getId(), lineAtStop.getLine().getId()));
                                    it2 = it3;
                                    map = map2;
                                    it = it4;
                                    i3 = i4;
                                    Y = str7;
                                }
                                ycc.r(arrayList3, arrayList2);
                                stop2 = stop3;
                            }
                            oob1.c(stop2.getId(), arrayList2);
                            if (x340Var.d) {
                                if (k110Var == null || (stopModalDto = k110Var.k) == null || (list = stopModalDto.a) == null) {
                                    arrayList = null;
                                } else {
                                    String str8 = x340Var.e;
                                    zzs zzsVar = x340Var.f;
                                    arrayList = new ArrayList();
                                    for (StopModalDto.a aVar : list) {
                                        String Y2 = d6z.Y(k110Var, aVar.b);
                                        String str9 = Y2.length() != 0 ? Y2 : null;
                                        if (str9 == null) {
                                            gd30Var = null;
                                        } else {
                                            int i6 = g440.a[aVar.a.ordinal()];
                                            if (i6 == 1) {
                                                d140Var = new d140(zzsVar, str8);
                                            } else if (i6 == 2) {
                                                d140Var = e140.a;
                                            } else {
                                                if (i6 != 3) {
                                                    w511.b();
                                                    return null;
                                                }
                                                d140Var = null;
                                            }
                                            boolean z2 = d140Var != null && set.contains(d140Var);
                                            gd30Var = new gd30(str9, d140Var, !z2, z2, ButtonSize.M, ButtonStyle.Minor, 64);
                                        }
                                        if (gd30Var != null) {
                                            arrayList.add(gd30Var);
                                        }
                                    }
                                }
                                if (arrayList != null) {
                                    f69Var = new f69(arrayList, false);
                                    g140Var = new g140(a, arrayList2, f69Var);
                                    obj2 = null;
                                }
                            }
                            f69Var = null;
                            g140Var = new g140(a, arrayList2, f69Var);
                            obj2 = null;
                        } else if (z340Var instanceof y340) {
                            tdu a2 = h440Var.a(((y340) z340Var).a, null);
                            ArrayList arrayList4 = new ArrayList(4);
                            for (int i7 = 0; i7 < 4; i7++) {
                                arrayList4.add(myy0.a);
                            }
                            obj4 = null;
                            g140Var = new g140(a2, arrayList4, null);
                        } else {
                            if (!(z340Var instanceof w340)) {
                                w511.b();
                                return null;
                            }
                            w340 w340Var = (w340) z340Var;
                            String str10 = w340Var.a;
                            avj0 avj0Var2 = (avj0) zuj0Var;
                            g140Var = new g140(new tdu(avj0Var2.h(kyh0.mt_stop_loading_error), avj0Var2.i(kyh0.mt_short_stop, str10), null, avj0Var2.i(kyh0.mt_stop, str10), 4), emptyList, new f69(Collections.singletonList(h440Var.b(w340Var)), false));
                            obj2 = null;
                        }
                        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$0 = obj2;
                        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$1 = obj2;
                        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$2 = obj2;
                        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$3 = obj2;
                        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(g140Var, mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    obj2 = obj4;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$0 = obj2;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$1 = obj2;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$2 = obj2;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.L$3 = obj2;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(g140Var, mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1 = new MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj32 = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$2$1.label;
        Object obj42 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
