package ru.yandex.taxi.masstransit.stopbubble.interactor;

import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import defpackage.e2r;
import defpackage.evu0;
import defpackage.gl50;
import defpackage.gw00;
import defpackage.h73;
import defpackage.igu0;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.mth;
import defpackage.n940;
import defpackage.ny61;
import defpackage.o140;
import defpackage.p9t0;
import defpackage.pfu0;
import defpackage.s5r;
import defpackage.sy30;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.ty30;
import defpackage.tyx;
import defpackage.uy30;
import defpackage.vfu0;
import defpackage.vy30;
import defpackage.w211;
import defpackage.w511;
import defpackage.wy30;
import defpackage.yy30;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.masstransit.api.model.OpenReason;
import ru.yandex.taxi.masstransit.datasource.schedule.b;

/* loaded from: classes6.dex */
public final class a {
    public final b a;
    public final yy30 b;
    public final jtq0 c;
    public final tyx d;

    public a(b bVar, yy30 yy30Var, jtq0 jtq0Var, tyx tyxVar) {
        this.a = bVar;
        this.b = yy30Var;
        this.c = jtq0Var;
        this.d = tyxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, gl50 gl50Var, ContinuationImpl continuationImpl) {
        StopBubbleInteractor$bubbleState$1 stopBubbleInteractor$bubbleState$1;
        int i;
        o140 o140Var;
        Object next;
        wy30 wy30Var;
        wy30 wy30Var2;
        n940 n940Var;
        Object obj;
        Object next2;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof StopBubbleInteractor$bubbleState$1) {
            stopBubbleInteractor$bubbleState$1 = (StopBubbleInteractor$bubbleState$1) continuationImpl;
            int i2 = stopBubbleInteractor$bubbleState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopBubbleInteractor$bubbleState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stopBubbleInteractor$bubbleState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopBubbleInteractor$bubbleState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    b bVar = aVar.a;
                    String str2 = gl50Var.a;
                    stopBubbleInteractor$bubbleState$1.L$0 = gl50Var;
                    stopBubbleInteractor$bubbleState$1.label = 1;
                    obj2 = bVar.b(str2, stopBubbleInteractor$bubbleState$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gl50Var = (gl50) stopBubbleInteractor$bubbleState$1.L$0;
                    kotlin.b.b(obj2);
                }
                o140Var = (o140) obj2;
                if (o140Var != null) {
                    Stop stop = o140Var.a;
                    List list = o140Var.b;
                    e2r k = kotlin.sequences.b.k(new h73(1, list), new p9t0(11, aVar));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    s5r s5rVar = new s5r(k);
                    while (s5rVar.hasNext()) {
                        Object next3 = s5rVar.next();
                        wy30 wy30Var3 = (wy30) next3;
                        linkedHashMap.put(new w211(wy30Var3.a(), wy30Var3.b()), next3);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        wy30 wy30Var4 = (wy30) ((Map.Entry) it.next()).getValue();
                        if (wy30Var4 != null) {
                            arrayList.add(wy30Var4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next4 = it2.next();
                        if (next4 instanceof uy30) {
                            arrayList2.add(next4);
                        }
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                double d = ((uy30) next2).d;
                                do {
                                    Object next5 = it3.next();
                                    double d2 = ((uy30) next5).d;
                                    if (Double.compare(d, d2) > 0) {
                                        next2 = next5;
                                        d = d2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        uy30 uy30Var = (uy30) next2;
                        if (uy30Var == null || (str = uy30Var.c) == null || !(!evu0.J(str))) {
                            next2 = null;
                        }
                        wy30Var2 = (wy30) next2;
                    } else {
                        int d3 = gw00.d(tcc.n(arrayList, 10));
                        if (d3 < 16) {
                            d3 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d3);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            Object next6 = it4.next();
                            wy30 wy30Var5 = (wy30) next6;
                            if (wy30Var5 instanceof sy30) {
                                n940Var = (n940) kotlin.collections.a.R(((sy30) wy30Var5).c());
                            } else if (wy30Var5 instanceof ty30) {
                                n940Var = (n940) kotlin.collections.a.R(((ty30) wy30Var5).c);
                            } else if (wy30Var5 instanceof vy30) {
                                n940Var = (n940) kotlin.collections.a.R(((vy30) wy30Var5).c);
                            } else {
                                if (!(wy30Var5 instanceof uy30)) {
                                    w511.b();
                                    return null;
                                }
                                n940Var = null;
                            }
                            linkedHashMap2.put(n940Var, next6);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            if (((n940) entry.getKey()) != null) {
                                linkedHashMap3.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it5 = linkedHashMap3.entrySet().iterator();
                        if (it5.hasNext()) {
                            next = it5.next();
                            if (it5.hasNext()) {
                                n940 n940Var2 = (n940) ((Map.Entry) next).getKey();
                                long j = n940Var2 != null ? n940Var2.a : Long.MAX_VALUE;
                                do {
                                    Object next7 = it5.next();
                                    n940 n940Var3 = (n940) ((Map.Entry) next7).getKey();
                                    long j2 = n940Var3 != null ? n940Var3.a : Long.MAX_VALUE;
                                    if (j > j2) {
                                        next = next7;
                                        j = j2;
                                    }
                                } while (it5.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        if (entry2 != null) {
                            wy30Var2 = (wy30) entry2.getValue();
                        } else {
                            wy30Var = null;
                            if (wy30Var != null) {
                                Iterator it6 = list.iterator();
                                loop3: while (true) {
                                    if (!it6.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it6.next();
                                    List<ThreadAtStop> threadsAtStop = ((LineAtStop) obj).getThreadsAtStop();
                                    if (!(threadsAtStop instanceof Collection) || !threadsAtStop.isEmpty()) {
                                        Iterator<T> it7 = threadsAtStop.iterator();
                                        while (it7.hasNext()) {
                                            if (jl40.l(((ThreadAtStop) it7.next()).getThread().getId(), wy30Var.b())) {
                                                break loop3;
                                            }
                                        }
                                    }
                                }
                                LineAtStop lineAtStop = (LineAtStop) obj;
                                if (lineAtStop != null) {
                                    Float f = gl50Var.b;
                                    String id = stop.getId();
                                    zzs zzsVar = o140Var.c;
                                    return new pfu0(new igu0(id, zzsVar, stop.getName(), OpenReason.STOP_BUBBLE), lineAtStop, wy30Var, new vfu0(zzsVar), f);
                                }
                            }
                        }
                    }
                    wy30Var = wy30Var2;
                    if (wy30Var != null) {
                    }
                }
                return null;
            }
        }
        stopBubbleInteractor$bubbleState$1 = new StopBubbleInteractor$bubbleState$1(aVar, continuationImpl);
        Object obj22 = stopBubbleInteractor$bubbleState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopBubbleInteractor$bubbleState$1.label;
        if (i != 0) {
        }
        o140Var = (o140) obj22;
        if (o140Var != null) {
        }
        return null;
    }

    public final tpr b() {
        return e.t(e.X(e.I(new mth(this.d.c, 6), new StopBubbleInteractor$stateFlow$1(2, null)), new StopBubbleInteractor$stateFlow$$inlined$flatMapLatest$1(null, this)));
    }
}
