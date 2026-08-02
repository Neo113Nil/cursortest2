package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import com.yandex.mapkit.maps.core.geometry.FloatPointKt;
import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.a8c;
import defpackage.czb0;
import defpackage.edc0;
import defpackage.evc;
import defpackage.ewi;
import defpackage.exb0;
import defpackage.fcj0;
import defpackage.fdc0;
import defpackage.fzb0;
import defpackage.g2c0;
import defpackage.g6u;
import defpackage.g8c;
import defpackage.gw00;
import defpackage.gzb0;
import defpackage.hzb0;
import defpackage.i2c0;
import defpackage.izb0;
import defpackage.j2c0;
import defpackage.jl40;
import defpackage.k2c0;
import defpackage.k4o;
import defpackage.k8c;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.p1c0;
import defpackage.qub0;
import defpackage.qzb0;
import defpackage.sjh;
import defpackage.sub0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tvb0;
import defpackage.u1c0;
import defpackage.uyj;
import defpackage.v1c0;
import defpackage.v4r0;
import defpackage.ve61;
import defpackage.w2t;
import defpackage.wub0;
import defpackage.y1c0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class b extends a {
    public final qub0 i;
    public final sub0 j;
    public final y1c0 k;
    public final fcj0 l;
    public final ve61 m;
    public final v1c0 n;
    public final float o;
    public Set p;
    public List q;
    public List r;
    public Map s;
    public Set t;

    public b(exb0 exb0Var, k8c k8cVar, y1c0 y1c0Var, fcj0 fcj0Var, fdc0 fdc0Var, ewi ewiVar, qub0 qub0Var, sub0 sub0Var, y1c0 y1c0Var2, fcj0 fcj0Var2, ve61 ve61Var, v1c0 v1c0Var, float f) {
        super(exb0Var, k8cVar, y1c0Var, fcj0Var, fdc0Var, ewiVar);
        this.i = qub0Var;
        this.j = sub0Var;
        this.k = y1c0Var2;
        this.l = fcj0Var2;
        this.m = ve61Var;
        this.n = v1c0Var;
        this.o = f;
        EmptySet emptySet = EmptySet.a;
        this.p = emptySet;
        EmptyList emptyList = EmptyList.a;
        this.q = emptyList;
        this.r = emptyList;
        this.s = kotlin.collections.b.f();
        this.t = emptySet;
    }

    public static List o(evc evcVar, int i, ArrayList arrayList, List list, Set set) {
        ArrayList m0 = kotlin.collections.a.m0(list, arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            PinState pinState = ((czb0) next).d;
            if (pinState != null ? evcVar.b(pinState) : false) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!set.contains(((czb0) next2).a.a)) {
                arrayList3.add(next2);
            }
        }
        return kotlin.collections.a.A0(kotlin.collections.a.x0(arrayList3, new izb0()), i);
    }

    public static Set s(mwb0 mwb0Var, List list, Map map, int i) {
        PointF pointF;
        PointF pointF2 = (PointF) map.get(mwb0Var);
        if (pointF2 == null) {
            return EmptySet.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            czb0 czb0Var = (czb0) it.next();
            if (!jl40.l(mwb0Var, czb0Var.a.a) && (pointF = (PointF) map.get(czb0Var.a.a)) != null) {
                float obtainX = FloatPointKt.obtainX(pointF2) - FloatPointKt.obtainX(pointF);
                float obtainY = FloatPointKt.obtainY(pointF2) - FloatPointKt.obtainY(pointF);
                if (((float) Math.sqrt((obtainY * obtainY) + (obtainX * obtainX))) < i) {
                    linkedHashSet.add(czb0Var);
                }
            }
        }
        return linkedHashSet;
    }

    public static boolean v(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return Math.max(f, f5) <= Math.min(f + f3, f5 + f7) && Math.max(f2, f6) <= Math.min(f2 + f4, f6 + f8);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final void a(czb0 czb0Var, PinState pinState, Map map) {
        if (pinState != PinState.INVISIBLE) {
            Object obj = map.get(pinState);
            if (obj == null) {
                obj = new LinkedHashSet();
                map.put(pinState, obj);
            }
            ((Set) obj).add(czb0Var.a.a);
        }
        czb0Var.d = pinState;
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean b(qzb0 qzb0Var, Map map, Map map2, PinState pinState) {
        int i = hzb0.a[pinState.ordinal()];
        return !(i == 1 || i == 2 || i == 3) || (p(qzb0Var, map, map2) && q(qzb0Var, map, map2));
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean c(qzb0 qzb0Var, Map map, Map map2) {
        return p(qzb0Var, map, map2) && q(qzb0Var, map, map2);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean d(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var) {
        gzb0 t;
        PointF pointF;
        if (super.d(qzb0Var, map, map2, p1c0Var)) {
            mwb0 mwb0Var = qzb0Var.a;
            PointF pointF2 = (PointF) map2.get(mwb0Var);
            if (pointF2 != null && (t = t(mwb0Var, pointF2)) != null) {
                k4o a = PinState.a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : a) {
                    PinState pinState = (PinState) obj;
                    PinState pinState2 = PinState.DUST;
                    if (pinState.compareTo(PinState.ICON_LABEL_M) <= 0 && pinState.compareTo(pinState2) >= 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    PinState pinState3 = (PinState) it.next();
                    boolean z = pinState3 == PinState.DUST;
                    Set<mwb0> set = (Set) map.get(pinState3);
                    if (set != null) {
                        for (mwb0 mwb0Var2 : set) {
                            if (!mwb0Var.equals(mwb0Var2) && (pointF = (PointF) map2.get(mwb0Var2)) != null) {
                                gzb0 t2 = z ? t(mwb0Var2, pointF) : u(mwb0Var2, pointF);
                                if (t2 != null) {
                                    if (v(t.a, t.b, t.c, t.d, t2.a, t2.b, t2.c, t2.d)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean e(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var) {
        return d(qzb0Var, map, map2, p1c0Var);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean f(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var) {
        PinState pinState = PinState.ICON;
        return a.h(map, new evc(pinState, pinState), p1c0Var.c()) && a.i(qzb0Var.a, new evc(pinState, PinState.ICON_LABEL_M), map, map2, p1c0Var.h()) && p(qzb0Var, map, map2) && q(qzb0Var, map, map2);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final boolean g(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var, PinState pinState) {
        mwb0 mwb0Var = qzb0Var.a;
        PinState pinState2 = PinState.ICON_LABEL_S;
        PinState pinState3 = PinState.ICON_LABEL_M;
        return a.h(map, new evc(pinState2, pinState3), p1c0Var.g()) && a.i(mwb0Var, new evc(pinState2, pinState3), map, map2, p1c0Var.d()) && p(qzb0Var, map, map2) && a.i(mwb0Var, new evc(PinState.ICON, pinState3), map, map2, p1c0Var.h()) && q(qzb0Var, map, map2);
    }

    @Override // ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a
    public final LinkedHashMap l(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            czb0 czb0Var = (czb0) it.next();
            PinState pinState = czb0Var.d;
            if (pinState != null) {
                Object obj = linkedHashMap.get(pinState);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    linkedHashMap.put(pinState, obj);
                }
                ((Set) obj).add(czb0Var.a.a);
            }
        }
        return linkedHashMap;
    }

    public final ArrayList n(List list, float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qzb0 qzb0Var = (qzb0) it.next();
            tvb0 tvb0Var = (tvb0) this.g.b.get(qzb0Var.a);
            if (tvb0Var != null) {
                arrayList.add(new czb0(qzb0Var, tvb0Var.a(f), tvb0Var.b(f).b, null));
            }
        }
        return arrayList;
    }

    public final boolean p(qzb0 qzb0Var, Map map, Map map2) {
        gzb0 u;
        PointF pointF;
        gzb0 u2;
        mwb0 mwb0Var = qzb0Var.a;
        PointF pointF2 = (PointF) map2.get(mwb0Var);
        if (pointF2 == null || (u = u(mwb0Var, pointF2)) == null) {
            return false;
        }
        k4o a = PinState.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            PinState pinState = (PinState) obj;
            PinState pinState2 = PinState.ICON;
            if (pinState.compareTo(PinState.ICON_LABEL_M) <= 0 && pinState.compareTo(pinState2) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Set<mwb0> set = (Set) map.get((PinState) it.next());
            if (set != null) {
                for (mwb0 mwb0Var2 : set) {
                    if (!mwb0Var.equals(mwb0Var2) && (pointF = (PointF) map2.get(mwb0Var2)) != null && (u2 = u(mwb0Var2, pointF)) != null && v(u.a, u.b, u.c, u.d, u2.a, u2.b, u2.c, u2.d)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean q(qzb0 qzb0Var, Map map, Map map2) {
        gzb0 u;
        PointF pointF;
        gzb0 t;
        mwb0 mwb0Var = qzb0Var.a;
        PointF pointF2 = (PointF) map2.get(mwb0Var);
        if (pointF2 == null || (u = u(mwb0Var, pointF2)) == null) {
            return false;
        }
        Set<mwb0> set = (Set) map.get(PinState.DUST);
        if (set == null) {
            return true;
        }
        for (mwb0 mwb0Var2 : set) {
            if (!mwb0Var.equals(mwb0Var2) && (pointF = (PointF) map2.get(mwb0Var2)) != null && (t = t(mwb0Var2, pointF)) != null && v(u.a, u.b, u.c, u.d, t.a, t.b, t.c, t.d)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /* JADX WARN: Type inference failed for: r5v40, types: [g2c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(List list, List list2, List list3, List list4, List list5, Continuation continuation) {
        PinProcessorGo$compute$1 pinProcessorGo$compute$1;
        int i;
        Set N0;
        List list6;
        List list7;
        k8c k8cVar;
        fdc0 fdc0Var;
        CoroutineSingletons coroutineSingletons;
        v1c0 v1c0Var;
        EmptyList emptyList;
        y1c0 y1c0Var;
        List list8;
        List list9;
        List<qzb0> list10;
        y1c0 y1c0Var2;
        Set set;
        k8c k8cVar2;
        boolean isEmpty;
        Continuation continuation2;
        Object k0;
        CoroutineSingletons coroutineSingletons2;
        Set set2;
        fdc0 fdc0Var2;
        List list11;
        g2c0 g2c0Var;
        k8c k8cVar3;
        List list12;
        Object k02;
        List list13;
        Set set3;
        fdc0 fdc0Var3;
        k8c k8cVar4;
        List list14;
        float a;
        CoroutineSingletons coroutineSingletons3;
        fzb0 fzb0Var;
        b bVar = this;
        List list15 = list4;
        if (continuation instanceof PinProcessorGo$compute$1) {
            pinProcessorGo$compute$1 = (PinProcessorGo$compute$1) continuation;
            int i2 = pinProcessorGo$compute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinProcessorGo$compute$1.label = i2 - Integer.MIN_VALUE;
                PinProcessorGo$compute$1 pinProcessorGo$compute$12 = pinProcessorGo$compute$1;
                Object obj = pinProcessorGo$compute$12.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinProcessorGo$compute$12.label;
                v1c0 v1c0Var2 = bVar.n;
                EmptyList emptyList2 = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list16 = list5;
                    ArrayList arrayList = new ArrayList(tcc.n(list16, 10));
                    Iterator it = list16.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((qzb0) it.next()).a);
                    }
                    N0 = kotlin.collections.a.N0(arrayList);
                    Set N02 = kotlin.collections.a.N0(list15);
                    bVar.p = N02;
                    bVar.q = emptyList2;
                    bVar.r = emptyList2;
                    LinkedHashSet h = v4r0.h(N02, N0);
                    if (h.isEmpty()) {
                        list6 = list;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list) {
                            if (!h.contains(((qzb0) obj2).a)) {
                                arrayList2.add(obj2);
                            }
                        }
                        list6 = arrayList2;
                    }
                    if (h.isEmpty()) {
                        list7 = list2;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (!h.contains(((qzb0) obj3).a)) {
                                arrayList3.add(obj3);
                            }
                        }
                        list7 = arrayList3;
                    }
                    boolean z = v1c0Var2 instanceof u1c0;
                    k8cVar = bVar.c;
                    y1c0 y1c0Var3 = bVar.d;
                    fdc0Var = bVar.e;
                    if (z) {
                        coroutineSingletons = coroutineSingletons4;
                        v1c0Var = v1c0Var2;
                        emptyList = emptyList2;
                        y1c0Var = y1c0Var3;
                        list8 = list3;
                        list9 = list;
                        list10 = list2;
                        isEmpty = N0.isEmpty();
                        wub0 wub0Var = bVar.g;
                        if (isEmpty) {
                            for (qzb0 qzb0Var : list10) {
                                mwb0 mwb0Var = qzb0Var.a;
                                tvb0 tvb0Var = (tvb0) wub0Var.b.get(mwb0Var);
                                wub0Var.b(mwb0Var, tvb0Var != null ? tvb0Var.e(qzb0Var) : new tvb0(qzb0Var));
                            }
                        } else {
                            for (qzb0 qzb0Var2 : list10) {
                                mwb0 mwb0Var2 = qzb0Var2.a;
                                if (N0.contains(mwb0Var2)) {
                                    wub0Var.b(mwb0Var2, new tvb0(qzb0Var2));
                                } else {
                                    tvb0 tvb0Var2 = (tvb0) wub0Var.b.get(mwb0Var2);
                                    wub0Var.b(mwb0Var2, tvb0Var2 != null ? tvb0Var2.e(qzb0Var2) : new tvb0(qzb0Var2));
                                }
                            }
                        }
                        double d = bVar.f;
                        int width = y1c0Var.getWidth();
                        int height = y1c0Var.getHeight();
                        PointF pointF = new PointF(0.0f, 0.0f);
                        float f = width;
                        PointF pointF2 = new PointF(f, 0.0f);
                        float f2 = height;
                        PointF pointF3 = new PointF(f, f2);
                        PointF pointF4 = new PointF(0.0f, f2);
                        j2c0 b = k8cVar.b();
                        Point point = ((k2c0) b).a;
                        k2c0 k2c0Var = (k2c0) b;
                        Point point2 = k2c0Var.b;
                        Point point3 = k2c0Var.d;
                        Point point4 = k2c0Var.c;
                        double c = d / w2t.c(pointF, pointF2);
                        double c2 = d / w2t.c(pointF2, pointF3);
                        double c3 = d / w2t.c(pointF3, pointF4);
                        double c4 = d / w2t.c(pointF4, pointF);
                        double lat = point.getLat();
                        double lon = point.getLon();
                        double lat2 = point2.getLat();
                        double lon2 = point2.getLon();
                        double lat3 = point3.getLat();
                        double lon3 = point3.getLon();
                        double lat4 = point4.getLat();
                        double lon4 = point4.getLon();
                        double d2 = (lat2 - lat) * c;
                        double d3 = (lon2 - lon) * c;
                        double d4 = (lat3 - lat2) * c2;
                        double d5 = (lon3 - lon2) * c2;
                        double d6 = (lat4 - lat3) * c3;
                        double d7 = (lon4 - lon3) * c3;
                        double d8 = (lat - lat4) * c4;
                        double d9 = (lon - lon4) * c4;
                        Point.Companion companion = Point.INSTANCE;
                        CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                        fdc0 fdc0Var4 = fdc0Var;
                        k2c0 k2c0Var2 = new k2c0(companion.invoke((lat + d8) - d2, (lon + d9) - d3), companion.invoke((lat2 + d2) - d4, (lon2 + d3) - d5), companion.invoke((lat4 + d6) - d8, (lon4 + d7) - d9), companion.invoke((lat3 + d4) - d6, (lon3 + d5) - d7));
                        continuation2 = null;
                        pinProcessorGo$compute$12.L$0 = null;
                        pinProcessorGo$compute$12.L$1 = null;
                        pinProcessorGo$compute$12.L$2 = null;
                        pinProcessorGo$compute$12.L$3 = list15;
                        pinProcessorGo$compute$12.L$4 = null;
                        pinProcessorGo$compute$12.L$5 = N0;
                        pinProcessorGo$compute$12.L$6 = k8cVar;
                        pinProcessorGo$compute$12.L$7 = y1c0Var;
                        pinProcessorGo$compute$12.L$8 = fdc0Var4;
                        pinProcessorGo$compute$12.L$9 = null;
                        pinProcessorGo$compute$12.L$10 = null;
                        pinProcessorGo$compute$12.L$11 = null;
                        pinProcessorGo$compute$12.L$12 = null;
                        pinProcessorGo$compute$12.label = 2;
                        k0 = tje.k0(uyj.a, new PinProcessorKt$splitByCoverage$2(list8, list9, k2c0Var2, null), pinProcessorGo$compute$12);
                        coroutineSingletons2 = coroutineSingletons5;
                        if (k0 != coroutineSingletons2) {
                            set2 = N0;
                            obj = k0;
                            fdc0Var2 = fdc0Var4;
                            list11 = list15;
                            g2c0Var = y1c0Var;
                            k8cVar3 = k8cVar;
                            Pair pair = (Pair) obj;
                            list12 = (List) pair.getFirst();
                            List list17 = (List) pair.getSecond();
                            pinProcessorGo$compute$12.L$0 = continuation2;
                            pinProcessorGo$compute$12.L$1 = continuation2;
                            pinProcessorGo$compute$12.L$2 = continuation2;
                            pinProcessorGo$compute$12.L$3 = continuation2;
                            pinProcessorGo$compute$12.L$4 = continuation2;
                            pinProcessorGo$compute$12.L$5 = set2;
                            pinProcessorGo$compute$12.L$6 = k8cVar3;
                            pinProcessorGo$compute$12.L$7 = g2c0Var;
                            pinProcessorGo$compute$12.L$8 = fdc0Var2;
                            pinProcessorGo$compute$12.L$9 = continuation2;
                            pinProcessorGo$compute$12.L$10 = continuation2;
                            pinProcessorGo$compute$12.L$11 = continuation2;
                            pinProcessorGo$compute$12.L$12 = list12;
                            pinProcessorGo$compute$12.L$13 = list17;
                            pinProcessorGo$compute$12.label = 3;
                            k02 = tje.k0(uyj.a, new PinProcessorKt$filterSelected$2(list11, list12, continuation2), pinProcessorGo$compute$12);
                            if (k02 != coroutineSingletons2) {
                            }
                        }
                        return coroutineSingletons2;
                    }
                    v1c0Var = v1c0Var2;
                    emptyList = emptyList2;
                    PinProcessorGo$compute$2 pinProcessorGo$compute$2 = new PinProcessorGo$compute$2(h, this, list6, list7, list3, null);
                    bVar = this;
                    sjh sjhVar = uyj.a;
                    pinProcessorGo$compute$12.L$0 = list;
                    pinProcessorGo$compute$12.L$1 = list2;
                    pinProcessorGo$compute$12.L$2 = list3;
                    pinProcessorGo$compute$12.L$3 = list15;
                    pinProcessorGo$compute$12.L$4 = null;
                    pinProcessorGo$compute$12.L$5 = N0;
                    pinProcessorGo$compute$12.L$6 = k8cVar;
                    pinProcessorGo$compute$12.L$7 = y1c0Var3;
                    pinProcessorGo$compute$12.L$8 = fdc0Var;
                    pinProcessorGo$compute$12.L$9 = null;
                    pinProcessorGo$compute$12.L$10 = null;
                    pinProcessorGo$compute$12.L$11 = null;
                    pinProcessorGo$compute$12.L$12 = null;
                    pinProcessorGo$compute$12.I$0 = 0;
                    pinProcessorGo$compute$12.label = 1;
                    Object k03 = tje.k0(sjhVar, pinProcessorGo$compute$2, pinProcessorGo$compute$12);
                    coroutineSingletons = coroutineSingletons4;
                    if (k03 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list8 = list3;
                    list9 = list;
                    list10 = list2;
                    y1c0Var2 = y1c0Var3;
                    set = N0;
                    k8cVar2 = k8cVar;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            fdc0 fdc0Var5 = (fdc0) pinProcessorGo$compute$12.L$8;
                            g2c0 g2c0Var2 = (g2c0) pinProcessorGo$compute$12.L$7;
                            k8c k8cVar5 = (k8c) pinProcessorGo$compute$12.L$6;
                            Set set4 = (Set) pinProcessorGo$compute$12.L$5;
                            list11 = (List) pinProcessorGo$compute$12.L$3;
                            kotlin.b.b(obj);
                            fdc0Var2 = fdc0Var5;
                            set2 = set4;
                            k8cVar3 = k8cVar5;
                            g2c0Var = g2c0Var2;
                            coroutineSingletons2 = coroutineSingletons4;
                            v1c0Var = v1c0Var2;
                            emptyList = emptyList2;
                            continuation2 = null;
                            Pair pair2 = (Pair) obj;
                            list12 = (List) pair2.getFirst();
                            List list172 = (List) pair2.getSecond();
                            pinProcessorGo$compute$12.L$0 = continuation2;
                            pinProcessorGo$compute$12.L$1 = continuation2;
                            pinProcessorGo$compute$12.L$2 = continuation2;
                            pinProcessorGo$compute$12.L$3 = continuation2;
                            pinProcessorGo$compute$12.L$4 = continuation2;
                            pinProcessorGo$compute$12.L$5 = set2;
                            pinProcessorGo$compute$12.L$6 = k8cVar3;
                            pinProcessorGo$compute$12.L$7 = g2c0Var;
                            pinProcessorGo$compute$12.L$8 = fdc0Var2;
                            pinProcessorGo$compute$12.L$9 = continuation2;
                            pinProcessorGo$compute$12.L$10 = continuation2;
                            pinProcessorGo$compute$12.L$11 = continuation2;
                            pinProcessorGo$compute$12.L$12 = list12;
                            pinProcessorGo$compute$12.L$13 = list172;
                            pinProcessorGo$compute$12.label = 3;
                            k02 = tje.k0(uyj.a, new PinProcessorKt$filterSelected$2(list11, list12, continuation2), pinProcessorGo$compute$12);
                            if (k02 != coroutineSingletons2) {
                                Set set5 = set2;
                                list13 = list172;
                                obj = k02;
                                set3 = set5;
                                k8c k8cVar6 = k8cVar3;
                                fdc0Var3 = fdc0Var2;
                                k8cVar4 = k8cVar6;
                                list14 = (List) obj;
                                a = k8cVar4.a().a();
                                if (v1c0Var instanceof u1c0) {
                                }
                                coroutineSingletons3 = coroutineSingletons2;
                                g2c0 g2c0Var3 = g2c0Var;
                                Set set6 = set3;
                                List list18 = list12;
                                bVar.r = kotlin.collections.a.J0(bVar.s.keySet());
                                bVar.s = kotlin.collections.b.f();
                                bVar.l.e = null;
                                pinProcessorGo$compute$12.L$0 = null;
                                pinProcessorGo$compute$12.L$1 = null;
                                pinProcessorGo$compute$12.L$2 = null;
                                pinProcessorGo$compute$12.L$3 = null;
                                pinProcessorGo$compute$12.L$4 = null;
                                pinProcessorGo$compute$12.L$5 = null;
                                pinProcessorGo$compute$12.L$6 = null;
                                pinProcessorGo$compute$12.L$7 = null;
                                pinProcessorGo$compute$12.L$8 = null;
                                pinProcessorGo$compute$12.L$9 = null;
                                pinProcessorGo$compute$12.L$10 = null;
                                pinProcessorGo$compute$12.L$11 = null;
                                pinProcessorGo$compute$12.L$12 = null;
                                pinProcessorGo$compute$12.L$13 = null;
                                pinProcessorGo$compute$12.L$14 = null;
                                pinProcessorGo$compute$12.F$0 = a;
                                pinProcessorGo$compute$12.label = 4;
                                obj = bVar.x(list18, list13, list14, a, set6, g2c0Var3, fdc0Var3, pinProcessorGo$compute$12);
                                if (obj == coroutineSingletons3) {
                                }
                                fzb0Var = (fzb0) obj;
                                List list19 = bVar.q;
                                List list20 = bVar.r;
                                EmptyList emptyList3 = emptyList;
                                bVar.q = emptyList3;
                                bVar.r = emptyList3;
                                bVar.p = EmptySet.a;
                                return new fzb0(fzb0Var.a, fzb0Var.b, fzb0Var.c, kotlin.collections.a.I(kotlin.collections.a.m0(list20, fzb0Var.d)), list19);
                            }
                            return coroutineSingletons2;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                kotlin.b.b(obj);
                                emptyList = emptyList2;
                                fzb0Var = (fzb0) obj;
                                List list192 = bVar.q;
                                List list202 = bVar.r;
                                EmptyList emptyList32 = emptyList;
                                bVar.q = emptyList32;
                                bVar.r = emptyList32;
                                bVar.p = EmptySet.a;
                                return new fzb0(fzb0Var.a, fzb0Var.b, fzb0Var.c, kotlin.collections.a.I(kotlin.collections.a.m0(list202, fzb0Var.d)), list192);
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            emptyList = emptyList2;
                            fzb0Var = (fzb0) obj;
                            List list1922 = bVar.q;
                            List list2022 = bVar.r;
                            EmptyList emptyList322 = emptyList;
                            bVar.q = emptyList322;
                            bVar.r = emptyList322;
                            bVar.p = EmptySet.a;
                            return new fzb0(fzb0Var.a, fzb0Var.b, fzb0Var.c, kotlin.collections.a.I(kotlin.collections.a.m0(list2022, fzb0Var.d)), list1922);
                        }
                        list13 = (List) pinProcessorGo$compute$12.L$13;
                        List list21 = (List) pinProcessorGo$compute$12.L$12;
                        fdc0 fdc0Var6 = (fdc0) pinProcessorGo$compute$12.L$8;
                        g2c0Var = (g2c0) pinProcessorGo$compute$12.L$7;
                        k8c k8cVar7 = (k8c) pinProcessorGo$compute$12.L$6;
                        set3 = (Set) pinProcessorGo$compute$12.L$5;
                        kotlin.b.b(obj);
                        fdc0Var3 = fdc0Var6;
                        k8cVar4 = k8cVar7;
                        list12 = list21;
                        coroutineSingletons2 = coroutineSingletons4;
                        v1c0Var = v1c0Var2;
                        emptyList = emptyList2;
                        list14 = (List) obj;
                        a = k8cVar4.a().a();
                        if ((v1c0Var instanceof u1c0) && a <= bVar.o) {
                            pinProcessorGo$compute$12.L$0 = null;
                            pinProcessorGo$compute$12.L$1 = null;
                            pinProcessorGo$compute$12.L$2 = null;
                            pinProcessorGo$compute$12.L$3 = null;
                            pinProcessorGo$compute$12.L$4 = null;
                            pinProcessorGo$compute$12.L$5 = null;
                            pinProcessorGo$compute$12.L$6 = null;
                            pinProcessorGo$compute$12.L$7 = null;
                            pinProcessorGo$compute$12.L$8 = null;
                            pinProcessorGo$compute$12.L$9 = null;
                            pinProcessorGo$compute$12.L$10 = null;
                            pinProcessorGo$compute$12.L$11 = null;
                            pinProcessorGo$compute$12.L$12 = null;
                            pinProcessorGo$compute$12.L$13 = null;
                            pinProcessorGo$compute$12.L$14 = null;
                            pinProcessorGo$compute$12.F$0 = a;
                            pinProcessorGo$compute$12.label = 5;
                            CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                            obj = bVar.w(list12, list13, list14, a, set3, pinProcessorGo$compute$12);
                            if (obj == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                            fzb0Var = (fzb0) obj;
                            List list19222 = bVar.q;
                            List list20222 = bVar.r;
                            EmptyList emptyList3222 = emptyList;
                            bVar.q = emptyList3222;
                            bVar.r = emptyList3222;
                            bVar.p = EmptySet.a;
                            return new fzb0(fzb0Var.a, fzb0Var.b, fzb0Var.c, kotlin.collections.a.I(kotlin.collections.a.m0(list20222, fzb0Var.d)), list19222);
                        }
                        coroutineSingletons3 = coroutineSingletons2;
                        g2c0 g2c0Var32 = g2c0Var;
                        Set set62 = set3;
                        List list182 = list12;
                        bVar.r = kotlin.collections.a.J0(bVar.s.keySet());
                        bVar.s = kotlin.collections.b.f();
                        bVar.l.e = null;
                        pinProcessorGo$compute$12.L$0 = null;
                        pinProcessorGo$compute$12.L$1 = null;
                        pinProcessorGo$compute$12.L$2 = null;
                        pinProcessorGo$compute$12.L$3 = null;
                        pinProcessorGo$compute$12.L$4 = null;
                        pinProcessorGo$compute$12.L$5 = null;
                        pinProcessorGo$compute$12.L$6 = null;
                        pinProcessorGo$compute$12.L$7 = null;
                        pinProcessorGo$compute$12.L$8 = null;
                        pinProcessorGo$compute$12.L$9 = null;
                        pinProcessorGo$compute$12.L$10 = null;
                        pinProcessorGo$compute$12.L$11 = null;
                        pinProcessorGo$compute$12.L$12 = null;
                        pinProcessorGo$compute$12.L$13 = null;
                        pinProcessorGo$compute$12.L$14 = null;
                        pinProcessorGo$compute$12.F$0 = a;
                        pinProcessorGo$compute$12.label = 4;
                        obj = bVar.x(list182, list13, list14, a, set62, g2c0Var32, fdc0Var3, pinProcessorGo$compute$12);
                        if (obj == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        fzb0Var = (fzb0) obj;
                        List list192222 = bVar.q;
                        List list202222 = bVar.r;
                        EmptyList emptyList32222 = emptyList;
                        bVar.q = emptyList32222;
                        bVar.r = emptyList32222;
                        bVar.p = EmptySet.a;
                        return new fzb0(fzb0Var.a, fzb0Var.b, fzb0Var.c, kotlin.collections.a.I(kotlin.collections.a.m0(list202222, fzb0Var.d)), list192222);
                    }
                    fdc0 fdc0Var7 = (fdc0) pinProcessorGo$compute$12.L$8;
                    ?? r5 = (g2c0) pinProcessorGo$compute$12.L$7;
                    k8cVar2 = (k8c) pinProcessorGo$compute$12.L$6;
                    set = (Set) pinProcessorGo$compute$12.L$5;
                    list15 = (List) pinProcessorGo$compute$12.L$3;
                    list8 = (List) pinProcessorGo$compute$12.L$2;
                    list10 = (List) pinProcessorGo$compute$12.L$1;
                    list9 = (List) pinProcessorGo$compute$12.L$0;
                    kotlin.b.b(obj);
                    fdc0Var = fdc0Var7;
                    coroutineSingletons = coroutineSingletons4;
                    v1c0Var = v1c0Var2;
                    emptyList = emptyList2;
                    y1c0Var2 = r5;
                }
                y1c0Var = y1c0Var2;
                k8cVar = k8cVar2;
                N0 = set;
                isEmpty = N0.isEmpty();
                wub0 wub0Var2 = bVar.g;
                if (isEmpty) {
                }
                double d10 = bVar.f;
                int width2 = y1c0Var.getWidth();
                int height2 = y1c0Var.getHeight();
                PointF pointF5 = new PointF(0.0f, 0.0f);
                float f3 = width2;
                PointF pointF22 = new PointF(f3, 0.0f);
                float f22 = height2;
                PointF pointF32 = new PointF(f3, f22);
                PointF pointF42 = new PointF(0.0f, f22);
                j2c0 b2 = k8cVar.b();
                Point point5 = ((k2c0) b2).a;
                k2c0 k2c0Var3 = (k2c0) b2;
                Point point22 = k2c0Var3.b;
                Point point32 = k2c0Var3.d;
                Point point42 = k2c0Var3.c;
                double c5 = d10 / w2t.c(pointF5, pointF22);
                double c22 = d10 / w2t.c(pointF22, pointF32);
                double c32 = d10 / w2t.c(pointF32, pointF42);
                double c42 = d10 / w2t.c(pointF42, pointF5);
                double lat5 = point5.getLat();
                double lon5 = point5.getLon();
                double lat22 = point22.getLat();
                double lon22 = point22.getLon();
                double lat32 = point32.getLat();
                double lon32 = point32.getLon();
                double lat42 = point42.getLat();
                double lon42 = point42.getLon();
                double d22 = (lat22 - lat5) * c5;
                double d32 = (lon22 - lon5) * c5;
                double d42 = (lat32 - lat22) * c22;
                double d52 = (lon32 - lon22) * c22;
                double d62 = (lat42 - lat32) * c32;
                double d72 = (lon42 - lon32) * c32;
                double d82 = (lat5 - lat42) * c42;
                double d92 = (lon5 - lon42) * c42;
                Point.Companion companion2 = Point.INSTANCE;
                CoroutineSingletons coroutineSingletons52 = coroutineSingletons;
                fdc0 fdc0Var42 = fdc0Var;
                k2c0 k2c0Var22 = new k2c0(companion2.invoke((lat5 + d82) - d22, (lon5 + d92) - d32), companion2.invoke((lat22 + d22) - d42, (lon22 + d32) - d52), companion2.invoke((lat42 + d62) - d82, (lon42 + d72) - d92), companion2.invoke((lat32 + d42) - d62, (lon32 + d52) - d72));
                continuation2 = null;
                pinProcessorGo$compute$12.L$0 = null;
                pinProcessorGo$compute$12.L$1 = null;
                pinProcessorGo$compute$12.L$2 = null;
                pinProcessorGo$compute$12.L$3 = list15;
                pinProcessorGo$compute$12.L$4 = null;
                pinProcessorGo$compute$12.L$5 = N0;
                pinProcessorGo$compute$12.L$6 = k8cVar;
                pinProcessorGo$compute$12.L$7 = y1c0Var;
                pinProcessorGo$compute$12.L$8 = fdc0Var42;
                pinProcessorGo$compute$12.L$9 = null;
                pinProcessorGo$compute$12.L$10 = null;
                pinProcessorGo$compute$12.L$11 = null;
                pinProcessorGo$compute$12.L$12 = null;
                pinProcessorGo$compute$12.label = 2;
                k0 = tje.k0(uyj.a, new PinProcessorKt$splitByCoverage$2(list8, list9, k2c0Var22, null), pinProcessorGo$compute$12);
                coroutineSingletons2 = coroutineSingletons52;
                if (k0 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
        }
        pinProcessorGo$compute$1 = new PinProcessorGo$compute$1(bVar, (ContinuationImpl) continuation);
        PinProcessorGo$compute$1 pinProcessorGo$compute$122 = pinProcessorGo$compute$1;
        Object obj4 = pinProcessorGo$compute$122.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinProcessorGo$compute$122.label;
        v1c0 v1c0Var22 = bVar.n;
        EmptyList emptyList22 = EmptyList.a;
        if (i != 0) {
        }
        y1c0Var = y1c0Var2;
        k8cVar = k8cVar2;
        N0 = set;
        isEmpty = N0.isEmpty();
        wub0 wub0Var22 = bVar.g;
        if (isEmpty) {
        }
        double d102 = bVar.f;
        int width22 = y1c0Var.getWidth();
        int height22 = y1c0Var.getHeight();
        PointF pointF52 = new PointF(0.0f, 0.0f);
        float f32 = width22;
        PointF pointF222 = new PointF(f32, 0.0f);
        float f222 = height22;
        PointF pointF322 = new PointF(f32, f222);
        PointF pointF422 = new PointF(0.0f, f222);
        j2c0 b22 = k8cVar.b();
        Point point52 = ((k2c0) b22).a;
        k2c0 k2c0Var32 = (k2c0) b22;
        Point point222 = k2c0Var32.b;
        Point point322 = k2c0Var32.d;
        Point point422 = k2c0Var32.c;
        double c52 = d102 / w2t.c(pointF52, pointF222);
        double c222 = d102 / w2t.c(pointF222, pointF322);
        double c322 = d102 / w2t.c(pointF322, pointF422);
        double c422 = d102 / w2t.c(pointF422, pointF52);
        double lat52 = point52.getLat();
        double lon52 = point52.getLon();
        double lat222 = point222.getLat();
        double lon222 = point222.getLon();
        double lat322 = point322.getLat();
        double lon322 = point322.getLon();
        double lat422 = point422.getLat();
        double lon422 = point422.getLon();
        double d222 = (lat222 - lat52) * c52;
        double d322 = (lon222 - lon52) * c52;
        double d422 = (lat322 - lat222) * c222;
        double d522 = (lon322 - lon222) * c222;
        double d622 = (lat422 - lat322) * c322;
        double d722 = (lon422 - lon322) * c322;
        double d822 = (lat52 - lat422) * c422;
        double d922 = (lon52 - lon422) * c422;
        Point.Companion companion22 = Point.INSTANCE;
        CoroutineSingletons coroutineSingletons522 = coroutineSingletons;
        fdc0 fdc0Var422 = fdc0Var;
        k2c0 k2c0Var222 = new k2c0(companion22.invoke((lat52 + d822) - d222, (lon52 + d922) - d322), companion22.invoke((lat222 + d222) - d422, (lon222 + d322) - d522), companion22.invoke((lat422 + d622) - d822, (lon422 + d722) - d922), companion22.invoke((lat322 + d422) - d622, (lon322 + d522) - d722));
        continuation2 = null;
        pinProcessorGo$compute$122.L$0 = null;
        pinProcessorGo$compute$122.L$1 = null;
        pinProcessorGo$compute$122.L$2 = null;
        pinProcessorGo$compute$122.L$3 = list15;
        pinProcessorGo$compute$122.L$4 = null;
        pinProcessorGo$compute$122.L$5 = N0;
        pinProcessorGo$compute$122.L$6 = k8cVar;
        pinProcessorGo$compute$122.L$7 = y1c0Var;
        pinProcessorGo$compute$122.L$8 = fdc0Var422;
        pinProcessorGo$compute$122.L$9 = null;
        pinProcessorGo$compute$122.L$10 = null;
        pinProcessorGo$compute$122.L$11 = null;
        pinProcessorGo$compute$122.L$12 = null;
        pinProcessorGo$compute$122.label = 2;
        k0 = tje.k0(uyj.a, new PinProcessorKt$splitByCoverage$2(list8, list9, k2c0Var222, null), pinProcessorGo$compute$122);
        coroutineSingletons2 = coroutineSingletons522;
        if (k0 != coroutineSingletons2) {
        }
        return coroutineSingletons2;
    }

    public final gzb0 t(mwb0 mwb0Var, PointF pointF) {
        PlacemarkType placemarkType = PlacemarkType.DUST;
        qub0 qub0Var = this.i;
        i2c0 c = qub0Var.c(mwb0Var, placemarkType, null);
        int i = c.a;
        int i2 = c.b;
        if (i == 0 || i2 == 0) {
            return null;
        }
        PointF a = qub0Var.a(mwb0Var, placemarkType, null);
        float f = i;
        float f2 = i2;
        return new gzb0(FloatPointKt.obtainX(pointF) - (FloatPointKt.obtainX(a) * f), FloatPointKt.obtainY(pointF) - (FloatPointKt.obtainY(a) * f2), f, f2);
    }

    public final gzb0 u(mwb0 mwb0Var, PointF pointF) {
        PlacemarkType placemarkType = PlacemarkType.ICON;
        qub0 qub0Var = this.i;
        i2c0 c = qub0Var.c(mwb0Var, placemarkType, null);
        int i = c.a;
        int i2 = c.b;
        if (i == 0 || i2 == 0) {
            return null;
        }
        PointF a = qub0Var.a(mwb0Var, placemarkType, null);
        float f = i;
        float f2 = i2;
        return new gzb0(FloatPointKt.obtainX(pointF) - (FloatPointKt.obtainX(a) * f), FloatPointKt.obtainY(pointF) - (FloatPointKt.obtainY(a) * f2), f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x040e A[LOOP:9: B:160:0x0408->B:162:0x040e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b5 A[LOOP:13: B:199:0x04af->B:201:0x04b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0528 A[LOOP:15: B:217:0x0522->B:219:0x0528, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0964 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0550 A[LOOP:16: B:222:0x054a->B:224:0x0550, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0965 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.a, ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(List list, List list2, List list3, float f, Set set, ContinuationImpl continuationImpl) {
        PinProcessorGo$runClusterFlow$1 pinProcessorGo$runClusterFlow$1;
        int i;
        ?? r1;
        Map linkedHashMap;
        float f2;
        List list4;
        List list5;
        List list6;
        List list7;
        Map map;
        List list8;
        List list9;
        Iterator it;
        Iterator it2;
        Iterator it3;
        int d;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Continuation continuation;
        ArrayList n;
        List list10;
        Map map2;
        List list11;
        Set set2;
        List list12;
        Object k0;
        List list13;
        Set set3;
        List list14;
        List list15;
        Map map3;
        List list16;
        Iterator it7;
        Object obj;
        Object k02;
        List list17;
        List list18;
        Set set4;
        Map map4;
        List list19;
        List list20;
        Iterator it8;
        czb0 czb0Var;
        List list21;
        List list22;
        Map map5;
        Set set5;
        List list23;
        List list24;
        Map map6;
        Map map7;
        List list25;
        List list26;
        EmptyList emptyList;
        Map map8;
        PointF pointF;
        gzb0 t;
        Map map9;
        EmptyList emptyList2;
        gzb0 gzb0Var;
        Object k03;
        Set set6 = set;
        if (continuationImpl instanceof PinProcessorGo$runClusterFlow$1) {
            pinProcessorGo$runClusterFlow$1 = (PinProcessorGo$runClusterFlow$1) continuationImpl;
            int i2 = pinProcessorGo$runClusterFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinProcessorGo$runClusterFlow$1.label = i2 - Integer.MIN_VALUE;
                PinProcessorGo$runClusterFlow$1 pinProcessorGo$runClusterFlow$12 = pinProcessorGo$runClusterFlow$1;
                Object obj2 = pinProcessorGo$runClusterFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinProcessorGo$runClusterFlow$12.label;
                EmptyList emptyList3 = EmptyList.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (this.p.contains(((qzb0) obj3).a)) {
                                arrayList.add(obj3);
                            } else {
                                arrayList2.add(obj3);
                            }
                        }
                        Pair pair = new Pair(arrayList, arrayList2);
                        List list27 = (List) pair.getFirst();
                        List list28 = (List) pair.getSecond();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list28) {
                            if (set6.contains(((qzb0) obj4).a)) {
                                arrayList3.add(obj4);
                            } else {
                                arrayList4.add(obj4);
                            }
                        }
                        Pair pair2 = new Pair(arrayList3, arrayList4);
                        List list29 = (List) pair2.getFirst();
                        List list30 = (List) pair2.getSecond();
                        ve61 ve61Var = this.m;
                        Integer c = ve61Var.c(f);
                        if (c == null || (list9 = (List) ve61Var.f.get(c)) == null) {
                            r1 = emptyList3;
                        } else {
                            List list31 = list9;
                            r1 = new ArrayList(tcc.n(list31, 10));
                            Iterator it9 = list31.iterator();
                            while (it9.hasNext()) {
                                r1.add(((a8c) it9.next()).a);
                            }
                        }
                        List list32 = list30;
                        ArrayList arrayList5 = new ArrayList(tcc.n(list32, 10));
                        Iterator it10 = list32.iterator();
                        while (it10.hasNext()) {
                            arrayList5.add(((qzb0) it10.next()).a);
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList5);
                        linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        PinProcessorGo$runClusterFlow$visibleTreeSeeds$1 pinProcessorGo$runClusterFlow$visibleTreeSeeds$1 = new PinProcessorGo$runClusterFlow$visibleTreeSeeds$1(r1, N0, this, linkedHashMap, linkedHashMap2, null);
                        pinProcessorGo$runClusterFlow$12.L$0 = null;
                        pinProcessorGo$runClusterFlow$12.L$1 = list2;
                        pinProcessorGo$runClusterFlow$12.L$2 = list3;
                        pinProcessorGo$runClusterFlow$12.L$3 = set6;
                        pinProcessorGo$runClusterFlow$12.L$4 = list27;
                        pinProcessorGo$runClusterFlow$12.L$5 = null;
                        pinProcessorGo$runClusterFlow$12.L$6 = list29;
                        pinProcessorGo$runClusterFlow$12.L$7 = list30;
                        pinProcessorGo$runClusterFlow$12.L$8 = null;
                        pinProcessorGo$runClusterFlow$12.L$9 = null;
                        pinProcessorGo$runClusterFlow$12.L$10 = linkedHashMap;
                        pinProcessorGo$runClusterFlow$12.L$11 = linkedHashMap2;
                        pinProcessorGo$runClusterFlow$12.F$0 = f;
                        pinProcessorGo$runClusterFlow$12.label = 1;
                        obj2 = tje.k0(g6uVar, pinProcessorGo$runClusterFlow$visibleTreeSeeds$1, pinProcessorGo$runClusterFlow$12);
                        if (obj2 != coroutineSingletons) {
                            f2 = f;
                            list4 = list27;
                            list5 = list3;
                            list6 = list29;
                            list7 = list2;
                            map = linkedHashMap2;
                            list8 = list30;
                            List list33 = (List) obj2;
                            this.l.e = linkedHashMap;
                            List list34 = list33;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : list34) {
                                List list35 = list34;
                                List list36 = list8;
                                if (!(((qzb0) obj5).a instanceof g8c)) {
                                    arrayList6.add(obj5);
                                }
                                list34 = list35;
                                list8 = list36;
                            }
                            List list37 = list34;
                            List list38 = list8;
                            ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                            it = arrayList6.iterator();
                            while (it.hasNext()) {
                                arrayList7.add(((qzb0) it.next()).a);
                            }
                            Set N02 = kotlin.collections.a.N0(arrayList7);
                            ArrayList arrayList8 = new ArrayList();
                            it2 = list38.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                Iterator it11 = it2;
                                if (!N02.contains(((qzb0) next).a)) {
                                    arrayList8.add(next);
                                }
                                it2 = it11;
                            }
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList9 = new ArrayList();
                            it3 = arrayList8.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                List list39 = list4;
                                if (hashSet.add(((qzb0) next2).a)) {
                                    arrayList9.add(next2);
                                }
                                list4 = list39;
                            }
                            List list40 = list4;
                            this.q = arrayList9;
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj6 : list37) {
                                if (((qzb0) obj6).a instanceof g8c) {
                                    arrayList10.add(obj6);
                                }
                            }
                            d = gw00.d(tcc.n(arrayList10, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(d);
                            it4 = arrayList10.iterator();
                            while (it4.hasNext()) {
                                Object next3 = it4.next();
                                linkedHashMap3.put(((qzb0) next3).a, next3);
                            }
                            Map map10 = this.s;
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            it5 = map10.entrySet().iterator();
                            while (it5.hasNext()) {
                                Map.Entry entry = (Map.Entry) it5.next();
                                Iterator it12 = it5;
                                if (linkedHashMap3.get((mwb0) entry.getKey()) == null) {
                                    linkedHashMap4.put(entry.getKey(), entry.getValue());
                                }
                                it5 = it12;
                            }
                            this.r = kotlin.collections.a.J0(linkedHashMap4.keySet());
                            int d2 = gw00.d(tcc.n(arrayList10, 10));
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                            it6 = arrayList10.iterator();
                            while (it6.hasNext()) {
                                Object next4 = it6.next();
                                linkedHashMap5.put(((qzb0) next4).a, next4);
                            }
                            this.s = linkedHashMap5;
                            List<qzb0> list41 = list40;
                            ArrayList arrayList11 = new ArrayList(tcc.n(list41, 10));
                            for (qzb0 qzb0Var : list41) {
                                PinState pinState = qzb0Var.e;
                                arrayList11.add(new czb0(qzb0Var, pinState, pinState, pinState));
                            }
                            continuation = null;
                            pinProcessorGo$runClusterFlow$12.L$0 = null;
                            pinProcessorGo$runClusterFlow$12.L$1 = list7;
                            pinProcessorGo$runClusterFlow$12.L$2 = list5;
                            pinProcessorGo$runClusterFlow$12.L$3 = set6;
                            pinProcessorGo$runClusterFlow$12.L$4 = null;
                            pinProcessorGo$runClusterFlow$12.L$5 = null;
                            pinProcessorGo$runClusterFlow$12.L$6 = null;
                            pinProcessorGo$runClusterFlow$12.L$7 = null;
                            pinProcessorGo$runClusterFlow$12.L$8 = null;
                            pinProcessorGo$runClusterFlow$12.L$9 = null;
                            pinProcessorGo$runClusterFlow$12.L$10 = null;
                            pinProcessorGo$runClusterFlow$12.L$11 = map;
                            pinProcessorGo$runClusterFlow$12.L$12 = list33;
                            pinProcessorGo$runClusterFlow$12.L$13 = null;
                            pinProcessorGo$runClusterFlow$12.L$14 = null;
                            pinProcessorGo$runClusterFlow$12.L$15 = null;
                            pinProcessorGo$runClusterFlow$12.L$16 = arrayList11;
                            pinProcessorGo$runClusterFlow$12.F$0 = f2;
                            pinProcessorGo$runClusterFlow$12.label = 2;
                            n = n(list6, f2);
                            if (n != coroutineSingletons) {
                                list10 = list33;
                                obj2 = n;
                                map2 = map;
                                list11 = arrayList11;
                                set2 = set6;
                                list12 = list7;
                                List list42 = (List) obj2;
                                pinProcessorGo$runClusterFlow$12.L$0 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$1 = list12;
                                pinProcessorGo$runClusterFlow$12.L$2 = list5;
                                pinProcessorGo$runClusterFlow$12.L$3 = set2;
                                pinProcessorGo$runClusterFlow$12.L$4 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$5 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$6 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$7 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$8 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$9 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$10 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$11 = map2;
                                pinProcessorGo$runClusterFlow$12.L$12 = list10;
                                pinProcessorGo$runClusterFlow$12.L$13 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$14 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$15 = continuation;
                                pinProcessorGo$runClusterFlow$12.L$16 = list11;
                                pinProcessorGo$runClusterFlow$12.L$17 = list42;
                                pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                pinProcessorGo$runClusterFlow$12.label = 3;
                                k0 = tje.k0(uyj.a, new PinProcessorKt$splitByDeterminacy$2(list42, continuation), pinProcessorGo$runClusterFlow$12);
                                if (k0 != coroutineSingletons) {
                                    list13 = list12;
                                    set3 = set2;
                                    list14 = list11;
                                    list15 = list42;
                                    obj2 = k0;
                                    map3 = map2;
                                    list16 = list10;
                                    Pair pair3 = (Pair) obj2;
                                    List list43 = (List) pair3.getFirst();
                                    List list44 = (List) pair3.getSecond();
                                    List list45 = list16;
                                    List list46 = list15;
                                    ArrayList arrayList12 = new ArrayList(tcc.n(list45, 10));
                                    it7 = list45.iterator();
                                    while (it7.hasNext()) {
                                        qzb0 qzb0Var2 = (qzb0) it7.next();
                                        if (qzb0Var2.a instanceof g8c) {
                                            it8 = it7;
                                            PinState pinState2 = qzb0Var2.e;
                                            czb0Var = new czb0(qzb0Var2, pinState2, pinState2, pinState2);
                                        } else {
                                            it8 = it7;
                                            PinState pinState3 = PinState.DUST;
                                            czb0Var = new czb0(qzb0Var2, pinState3, pinState3, pinState3);
                                        }
                                        arrayList12.add(czb0Var);
                                        it7 = it8;
                                    }
                                    ArrayList m0 = kotlin.collections.a.m0(arrayList12, kotlin.collections.a.m0(list46, list14));
                                    obj = null;
                                    pinProcessorGo$runClusterFlow$12.L$0 = null;
                                    pinProcessorGo$runClusterFlow$12.L$1 = list13;
                                    pinProcessorGo$runClusterFlow$12.L$2 = list5;
                                    pinProcessorGo$runClusterFlow$12.L$3 = set3;
                                    pinProcessorGo$runClusterFlow$12.L$4 = null;
                                    pinProcessorGo$runClusterFlow$12.L$5 = null;
                                    pinProcessorGo$runClusterFlow$12.L$6 = null;
                                    pinProcessorGo$runClusterFlow$12.L$7 = null;
                                    pinProcessorGo$runClusterFlow$12.L$8 = null;
                                    pinProcessorGo$runClusterFlow$12.L$9 = null;
                                    pinProcessorGo$runClusterFlow$12.L$10 = null;
                                    pinProcessorGo$runClusterFlow$12.L$11 = map3;
                                    pinProcessorGo$runClusterFlow$12.L$12 = null;
                                    pinProcessorGo$runClusterFlow$12.L$13 = null;
                                    pinProcessorGo$runClusterFlow$12.L$14 = null;
                                    pinProcessorGo$runClusterFlow$12.L$15 = null;
                                    pinProcessorGo$runClusterFlow$12.L$16 = list14;
                                    pinProcessorGo$runClusterFlow$12.L$17 = null;
                                    pinProcessorGo$runClusterFlow$12.L$18 = list43;
                                    pinProcessorGo$runClusterFlow$12.L$19 = list44;
                                    pinProcessorGo$runClusterFlow$12.L$20 = arrayList12;
                                    pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                    pinProcessorGo$runClusterFlow$12.label = 4;
                                    k02 = tje.k0(uyj.a, new PinProcessorKt$filterMayBeVisible$2(m0, null), pinProcessorGo$runClusterFlow$12);
                                    if (k02 != coroutineSingletons) {
                                        list17 = list44;
                                        obj2 = k02;
                                        list18 = arrayList12;
                                        set4 = set3;
                                        map4 = map3;
                                        list19 = list14;
                                        list20 = list43;
                                        pinProcessorGo$runClusterFlow$12.L$0 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$1 = list13;
                                        pinProcessorGo$runClusterFlow$12.L$2 = list5;
                                        pinProcessorGo$runClusterFlow$12.L$3 = set4;
                                        pinProcessorGo$runClusterFlow$12.L$4 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$5 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$6 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$7 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$8 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$9 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$10 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$11 = map4;
                                        pinProcessorGo$runClusterFlow$12.L$12 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$13 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$14 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$15 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$16 = list19;
                                        pinProcessorGo$runClusterFlow$12.L$17 = obj;
                                        pinProcessorGo$runClusterFlow$12.L$18 = list20;
                                        pinProcessorGo$runClusterFlow$12.L$19 = list17;
                                        pinProcessorGo$runClusterFlow$12.L$20 = list18;
                                        pinProcessorGo$runClusterFlow$12.L$21 = obj;
                                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                        pinProcessorGo$runClusterFlow$12.label = 5;
                                        obj2 = k((List) obj2, pinProcessorGo$runClusterFlow$12);
                                        if (obj2 != coroutineSingletons) {
                                            list21 = list20;
                                            list22 = list19;
                                            map5 = map4;
                                            set5 = set4;
                                            list23 = list13;
                                            list24 = list5;
                                            map6 = (Map) obj2;
                                            if (!list17.isEmpty()) {
                                                pinProcessorGo$runClusterFlow$12.L$0 = null;
                                                pinProcessorGo$runClusterFlow$12.L$1 = list23;
                                                pinProcessorGo$runClusterFlow$12.L$2 = list24;
                                                pinProcessorGo$runClusterFlow$12.L$3 = set5;
                                                pinProcessorGo$runClusterFlow$12.L$4 = null;
                                                pinProcessorGo$runClusterFlow$12.L$5 = null;
                                                pinProcessorGo$runClusterFlow$12.L$6 = null;
                                                pinProcessorGo$runClusterFlow$12.L$7 = null;
                                                pinProcessorGo$runClusterFlow$12.L$8 = null;
                                                pinProcessorGo$runClusterFlow$12.L$9 = null;
                                                pinProcessorGo$runClusterFlow$12.L$10 = null;
                                                pinProcessorGo$runClusterFlow$12.L$11 = map5;
                                                pinProcessorGo$runClusterFlow$12.L$12 = null;
                                                pinProcessorGo$runClusterFlow$12.L$13 = null;
                                                pinProcessorGo$runClusterFlow$12.L$14 = null;
                                                pinProcessorGo$runClusterFlow$12.L$15 = null;
                                                pinProcessorGo$runClusterFlow$12.L$16 = list22;
                                                pinProcessorGo$runClusterFlow$12.L$17 = null;
                                                pinProcessorGo$runClusterFlow$12.L$18 = list21;
                                                pinProcessorGo$runClusterFlow$12.L$19 = null;
                                                pinProcessorGo$runClusterFlow$12.L$20 = list18;
                                                pinProcessorGo$runClusterFlow$12.L$21 = null;
                                                pinProcessorGo$runClusterFlow$12.L$22 = map6;
                                                pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                                pinProcessorGo$runClusterFlow$12.label = 6;
                                                Object k04 = tje.k0(uyj.a, new PinProcessorGo$computeSuperPinsOnly$2(list17, this, list21, map6, null), pinProcessorGo$runClusterFlow$12);
                                                if (k04 != coroutineSingletons) {
                                                    List list47 = list18;
                                                    map7 = map6;
                                                    obj2 = k04;
                                                    list25 = list47;
                                                    list21 = kotlin.collections.a.m0(list21, (Collection) obj2);
                                                    map6 = map7;
                                                    list18 = list25;
                                                }
                                            }
                                            if (!set5.isEmpty()) {
                                                ArrayList arrayList13 = new ArrayList();
                                                for (Object obj7 : list21) {
                                                    List list48 = list18;
                                                    if (set5.contains(((czb0) obj7).a.a)) {
                                                        arrayList13.add(obj7);
                                                    }
                                                    list18 = list48;
                                                }
                                                List list49 = list18;
                                                ArrayList arrayList14 = new ArrayList();
                                                Iterator it13 = arrayList13.iterator();
                                                while (it13.hasNext()) {
                                                    Object next5 = it13.next();
                                                    PinState pinState4 = ((czb0) next5).d;
                                                    if (pinState4 == null) {
                                                        pinState4 = PinState.INVISIBLE;
                                                    }
                                                    if (pinState4.compareTo(PinState.ICON) >= 0) {
                                                        arrayList14.add(next5);
                                                    }
                                                }
                                                ArrayList arrayList15 = new ArrayList();
                                                Iterator it14 = arrayList14.iterator();
                                                while (it14.hasNext()) {
                                                    czb0 czb0Var2 = (czb0) it14.next();
                                                    PointF pointF2 = (PointF) map6.get(czb0Var2.a.a);
                                                    gzb0 u = pointF2 != null ? u(czb0Var2.a.a, pointF2) : null;
                                                    if (u != null) {
                                                        arrayList15.add(u);
                                                    }
                                                }
                                                if (arrayList15.isEmpty()) {
                                                    list18 = list49;
                                                } else {
                                                    ArrayList arrayList16 = new ArrayList();
                                                    List list50 = list49;
                                                    list26 = list22;
                                                    ArrayList arrayList17 = new ArrayList(tcc.n(list50, 10));
                                                    Iterator it15 = list50.iterator();
                                                    while (it15.hasNext()) {
                                                        czb0 czb0Var3 = (czb0) it15.next();
                                                        mwb0 mwb0Var = czb0Var3.a.a;
                                                        Iterator it16 = it15;
                                                        if ((mwb0Var instanceof g8c) && (gzb0Var = (gzb0) map5.get(mwb0Var)) != null) {
                                                            if (!arrayList15.isEmpty()) {
                                                                Iterator it17 = arrayList15.iterator();
                                                                while (it17.hasNext()) {
                                                                    map9 = map5;
                                                                    gzb0 gzb0Var2 = (gzb0) it17.next();
                                                                    emptyList2 = emptyList3;
                                                                    if (v(gzb0Var.a, gzb0Var.b, gzb0Var.c, gzb0Var.d, gzb0Var2.a, gzb0Var2.b, gzb0Var2.c, gzb0Var2.d)) {
                                                                        czb0Var3 = czb0.a(czb0Var3, PinState.INVISIBLE, 7);
                                                                    } else {
                                                                        map5 = map9;
                                                                        emptyList3 = emptyList2;
                                                                    }
                                                                }
                                                            }
                                                            map9 = map5;
                                                            emptyList2 = emptyList3;
                                                            arrayList16.add(gzb0Var);
                                                        } else {
                                                            map9 = map5;
                                                            emptyList2 = emptyList3;
                                                        }
                                                        arrayList17.add(czb0Var3);
                                                        it15 = it16;
                                                        map5 = map9;
                                                        emptyList3 = emptyList2;
                                                    }
                                                    emptyList = emptyList3;
                                                    ArrayList m02 = kotlin.collections.a.m0(arrayList16, arrayList15);
                                                    ArrayList arrayList18 = new ArrayList(tcc.n(arrayList17, 10));
                                                    Iterator it18 = arrayList17.iterator();
                                                    while (it18.hasNext()) {
                                                        czb0 czb0Var4 = (czb0) it18.next();
                                                        mwb0 mwb0Var2 = czb0Var4.a.a;
                                                        if (!(mwb0Var2 instanceof g8c) && czb0Var4.d == PinState.DUST && (pointF = (PointF) map6.get(mwb0Var2)) != null && (t = t(czb0Var4.a.a, pointF)) != null && !m02.isEmpty()) {
                                                            Iterator it19 = m02.iterator();
                                                            while (it19.hasNext()) {
                                                                gzb0 gzb0Var3 = (gzb0) it19.next();
                                                                map8 = map6;
                                                                if (v(t.a, t.b, t.c, t.d, gzb0Var3.a, gzb0Var3.b, gzb0Var3.c, gzb0Var3.d)) {
                                                                    czb0Var4 = czb0.a(czb0Var4, PinState.INVISIBLE, 7);
                                                                    arrayList18.add(czb0Var4);
                                                                    map6 = map8;
                                                                } else {
                                                                    map6 = map8;
                                                                }
                                                            }
                                                        }
                                                        map8 = map6;
                                                        arrayList18.add(czb0Var4);
                                                        map6 = map8;
                                                    }
                                                    list18 = arrayList18;
                                                    m(list21, f2);
                                                    ArrayList m03 = kotlin.collections.a.m0(list18, kotlin.collections.a.m0(list21, list26));
                                                    pinProcessorGo$runClusterFlow$12.L$0 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$1 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$2 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$3 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$4 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$5 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$6 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$7 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$8 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$9 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$10 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$11 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$12 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$13 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$14 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$15 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$16 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$17 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$18 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$19 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$20 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$21 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$22 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$23 = null;
                                                    pinProcessorGo$runClusterFlow$12.L$24 = null;
                                                    pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                                    pinProcessorGo$runClusterFlow$12.label = 7;
                                                    k03 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(m03, emptyList, list23, list24, null), pinProcessorGo$runClusterFlow$12);
                                                    if (k03 == coroutineSingletons) {
                                                        return k03;
                                                    }
                                                }
                                            }
                                            list26 = list22;
                                            emptyList = emptyList3;
                                            m(list21, f2);
                                            ArrayList m032 = kotlin.collections.a.m0(list18, kotlin.collections.a.m0(list21, list26));
                                            pinProcessorGo$runClusterFlow$12.L$0 = null;
                                            pinProcessorGo$runClusterFlow$12.L$1 = null;
                                            pinProcessorGo$runClusterFlow$12.L$2 = null;
                                            pinProcessorGo$runClusterFlow$12.L$3 = null;
                                            pinProcessorGo$runClusterFlow$12.L$4 = null;
                                            pinProcessorGo$runClusterFlow$12.L$5 = null;
                                            pinProcessorGo$runClusterFlow$12.L$6 = null;
                                            pinProcessorGo$runClusterFlow$12.L$7 = null;
                                            pinProcessorGo$runClusterFlow$12.L$8 = null;
                                            pinProcessorGo$runClusterFlow$12.L$9 = null;
                                            pinProcessorGo$runClusterFlow$12.L$10 = null;
                                            pinProcessorGo$runClusterFlow$12.L$11 = null;
                                            pinProcessorGo$runClusterFlow$12.L$12 = null;
                                            pinProcessorGo$runClusterFlow$12.L$13 = null;
                                            pinProcessorGo$runClusterFlow$12.L$14 = null;
                                            pinProcessorGo$runClusterFlow$12.L$15 = null;
                                            pinProcessorGo$runClusterFlow$12.L$16 = null;
                                            pinProcessorGo$runClusterFlow$12.L$17 = null;
                                            pinProcessorGo$runClusterFlow$12.L$18 = null;
                                            pinProcessorGo$runClusterFlow$12.L$19 = null;
                                            pinProcessorGo$runClusterFlow$12.L$20 = null;
                                            pinProcessorGo$runClusterFlow$12.L$21 = null;
                                            pinProcessorGo$runClusterFlow$12.L$22 = null;
                                            pinProcessorGo$runClusterFlow$12.L$23 = null;
                                            pinProcessorGo$runClusterFlow$12.L$24 = null;
                                            pinProcessorGo$runClusterFlow$12.F$0 = f2;
                                            pinProcessorGo$runClusterFlow$12.label = 7;
                                            k03 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(m032, emptyList, list23, list24, null), pinProcessorGo$runClusterFlow$12);
                                            if (k03 == coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        map = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        linkedHashMap = (Map) pinProcessorGo$runClusterFlow$12.L$10;
                        list8 = (List) pinProcessorGo$runClusterFlow$12.L$7;
                        list6 = (List) pinProcessorGo$runClusterFlow$12.L$6;
                        list4 = (List) pinProcessorGo$runClusterFlow$12.L$4;
                        set6 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        list5 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        list7 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        List list332 = (List) obj2;
                        this.l.e = linkedHashMap;
                        List list342 = list332;
                        ArrayList arrayList62 = new ArrayList();
                        while (r15.hasNext()) {
                        }
                        List list372 = list342;
                        List list382 = list8;
                        ArrayList arrayList72 = new ArrayList(tcc.n(arrayList62, 10));
                        it = arrayList62.iterator();
                        while (it.hasNext()) {
                        }
                        Set N022 = kotlin.collections.a.N0(arrayList72);
                        ArrayList arrayList82 = new ArrayList();
                        it2 = list382.iterator();
                        while (it2.hasNext()) {
                        }
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList92 = new ArrayList();
                        it3 = arrayList82.iterator();
                        while (it3.hasNext()) {
                        }
                        List list402 = list4;
                        this.q = arrayList92;
                        ArrayList arrayList102 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        d = gw00.d(tcc.n(arrayList102, 10));
                        if (d < 16) {
                        }
                        LinkedHashMap linkedHashMap32 = new LinkedHashMap(d);
                        it4 = arrayList102.iterator();
                        while (it4.hasNext()) {
                        }
                        Map map102 = this.s;
                        LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                        it5 = map102.entrySet().iterator();
                        while (it5.hasNext()) {
                        }
                        this.r = kotlin.collections.a.J0(linkedHashMap42.keySet());
                        int d22 = gw00.d(tcc.n(arrayList102, 10));
                        LinkedHashMap linkedHashMap52 = new LinkedHashMap(d22 >= 16 ? d22 : 16);
                        it6 = arrayList102.iterator();
                        while (it6.hasNext()) {
                        }
                        this.s = linkedHashMap52;
                        List<qzb0> list412 = list402;
                        ArrayList arrayList112 = new ArrayList(tcc.n(list412, 10));
                        while (r5.hasNext()) {
                        }
                        continuation = null;
                        pinProcessorGo$runClusterFlow$12.L$0 = null;
                        pinProcessorGo$runClusterFlow$12.L$1 = list7;
                        pinProcessorGo$runClusterFlow$12.L$2 = list5;
                        pinProcessorGo$runClusterFlow$12.L$3 = set6;
                        pinProcessorGo$runClusterFlow$12.L$4 = null;
                        pinProcessorGo$runClusterFlow$12.L$5 = null;
                        pinProcessorGo$runClusterFlow$12.L$6 = null;
                        pinProcessorGo$runClusterFlow$12.L$7 = null;
                        pinProcessorGo$runClusterFlow$12.L$8 = null;
                        pinProcessorGo$runClusterFlow$12.L$9 = null;
                        pinProcessorGo$runClusterFlow$12.L$10 = null;
                        pinProcessorGo$runClusterFlow$12.L$11 = map;
                        pinProcessorGo$runClusterFlow$12.L$12 = list332;
                        pinProcessorGo$runClusterFlow$12.L$13 = null;
                        pinProcessorGo$runClusterFlow$12.L$14 = null;
                        pinProcessorGo$runClusterFlow$12.L$15 = null;
                        pinProcessorGo$runClusterFlow$12.L$16 = arrayList112;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 2;
                        n = n(list6, f2);
                        if (n != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        list11 = (List) pinProcessorGo$runClusterFlow$12.L$16;
                        list10 = (List) pinProcessorGo$runClusterFlow$12.L$12;
                        map2 = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        set2 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        List list51 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        list12 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        list5 = list51;
                        continuation = null;
                        List list422 = (List) obj2;
                        pinProcessorGo$runClusterFlow$12.L$0 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$1 = list12;
                        pinProcessorGo$runClusterFlow$12.L$2 = list5;
                        pinProcessorGo$runClusterFlow$12.L$3 = set2;
                        pinProcessorGo$runClusterFlow$12.L$4 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$5 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$6 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$7 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$8 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$9 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$10 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$11 = map2;
                        pinProcessorGo$runClusterFlow$12.L$12 = list10;
                        pinProcessorGo$runClusterFlow$12.L$13 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$14 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$15 = continuation;
                        pinProcessorGo$runClusterFlow$12.L$16 = list11;
                        pinProcessorGo$runClusterFlow$12.L$17 = list422;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 3;
                        k0 = tje.k0(uyj.a, new PinProcessorKt$splitByDeterminacy$2(list422, continuation), pinProcessorGo$runClusterFlow$12);
                        if (k0 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        list15 = (List) pinProcessorGo$runClusterFlow$12.L$17;
                        List list52 = (List) pinProcessorGo$runClusterFlow$12.L$16;
                        list16 = (List) pinProcessorGo$runClusterFlow$12.L$12;
                        Map map11 = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        Set set7 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        List list53 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        List list54 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        list13 = list54;
                        list5 = list53;
                        set3 = set7;
                        map3 = map11;
                        list14 = list52;
                        Pair pair32 = (Pair) obj2;
                        List list432 = (List) pair32.getFirst();
                        List list442 = (List) pair32.getSecond();
                        List list452 = list16;
                        List list462 = list15;
                        ArrayList arrayList122 = new ArrayList(tcc.n(list452, 10));
                        it7 = list452.iterator();
                        while (it7.hasNext()) {
                        }
                        ArrayList m04 = kotlin.collections.a.m0(arrayList122, kotlin.collections.a.m0(list462, list14));
                        obj = null;
                        pinProcessorGo$runClusterFlow$12.L$0 = null;
                        pinProcessorGo$runClusterFlow$12.L$1 = list13;
                        pinProcessorGo$runClusterFlow$12.L$2 = list5;
                        pinProcessorGo$runClusterFlow$12.L$3 = set3;
                        pinProcessorGo$runClusterFlow$12.L$4 = null;
                        pinProcessorGo$runClusterFlow$12.L$5 = null;
                        pinProcessorGo$runClusterFlow$12.L$6 = null;
                        pinProcessorGo$runClusterFlow$12.L$7 = null;
                        pinProcessorGo$runClusterFlow$12.L$8 = null;
                        pinProcessorGo$runClusterFlow$12.L$9 = null;
                        pinProcessorGo$runClusterFlow$12.L$10 = null;
                        pinProcessorGo$runClusterFlow$12.L$11 = map3;
                        pinProcessorGo$runClusterFlow$12.L$12 = null;
                        pinProcessorGo$runClusterFlow$12.L$13 = null;
                        pinProcessorGo$runClusterFlow$12.L$14 = null;
                        pinProcessorGo$runClusterFlow$12.L$15 = null;
                        pinProcessorGo$runClusterFlow$12.L$16 = list14;
                        pinProcessorGo$runClusterFlow$12.L$17 = null;
                        pinProcessorGo$runClusterFlow$12.L$18 = list432;
                        pinProcessorGo$runClusterFlow$12.L$19 = list442;
                        pinProcessorGo$runClusterFlow$12.L$20 = arrayList122;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 4;
                        k02 = tje.k0(uyj.a, new PinProcessorKt$filterMayBeVisible$2(m04, null), pinProcessorGo$runClusterFlow$12);
                        if (k02 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        list18 = (List) pinProcessorGo$runClusterFlow$12.L$20;
                        list17 = (List) pinProcessorGo$runClusterFlow$12.L$19;
                        List list55 = (List) pinProcessorGo$runClusterFlow$12.L$18;
                        List list56 = (List) pinProcessorGo$runClusterFlow$12.L$16;
                        Map map12 = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        Set set8 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        list5 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        list13 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        set4 = set8;
                        map4 = map12;
                        list19 = list56;
                        list20 = list55;
                        obj = null;
                        pinProcessorGo$runClusterFlow$12.L$0 = obj;
                        pinProcessorGo$runClusterFlow$12.L$1 = list13;
                        pinProcessorGo$runClusterFlow$12.L$2 = list5;
                        pinProcessorGo$runClusterFlow$12.L$3 = set4;
                        pinProcessorGo$runClusterFlow$12.L$4 = obj;
                        pinProcessorGo$runClusterFlow$12.L$5 = obj;
                        pinProcessorGo$runClusterFlow$12.L$6 = obj;
                        pinProcessorGo$runClusterFlow$12.L$7 = obj;
                        pinProcessorGo$runClusterFlow$12.L$8 = obj;
                        pinProcessorGo$runClusterFlow$12.L$9 = obj;
                        pinProcessorGo$runClusterFlow$12.L$10 = obj;
                        pinProcessorGo$runClusterFlow$12.L$11 = map4;
                        pinProcessorGo$runClusterFlow$12.L$12 = obj;
                        pinProcessorGo$runClusterFlow$12.L$13 = obj;
                        pinProcessorGo$runClusterFlow$12.L$14 = obj;
                        pinProcessorGo$runClusterFlow$12.L$15 = obj;
                        pinProcessorGo$runClusterFlow$12.L$16 = list19;
                        pinProcessorGo$runClusterFlow$12.L$17 = obj;
                        pinProcessorGo$runClusterFlow$12.L$18 = list20;
                        pinProcessorGo$runClusterFlow$12.L$19 = list17;
                        pinProcessorGo$runClusterFlow$12.L$20 = list18;
                        pinProcessorGo$runClusterFlow$12.L$21 = obj;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 5;
                        obj2 = k((List) obj2, pinProcessorGo$runClusterFlow$12);
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        list18 = (List) pinProcessorGo$runClusterFlow$12.L$20;
                        list17 = (List) pinProcessorGo$runClusterFlow$12.L$19;
                        list21 = (List) pinProcessorGo$runClusterFlow$12.L$18;
                        list22 = (List) pinProcessorGo$runClusterFlow$12.L$16;
                        map5 = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        set5 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        list5 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        list13 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        list23 = list13;
                        list24 = list5;
                        map6 = (Map) obj2;
                        if (!list17.isEmpty()) {
                        }
                        if (!set5.isEmpty()) {
                        }
                        list26 = list22;
                        emptyList = emptyList3;
                        m(list21, f2);
                        ArrayList m0322 = kotlin.collections.a.m0(list18, kotlin.collections.a.m0(list21, list26));
                        pinProcessorGo$runClusterFlow$12.L$0 = null;
                        pinProcessorGo$runClusterFlow$12.L$1 = null;
                        pinProcessorGo$runClusterFlow$12.L$2 = null;
                        pinProcessorGo$runClusterFlow$12.L$3 = null;
                        pinProcessorGo$runClusterFlow$12.L$4 = null;
                        pinProcessorGo$runClusterFlow$12.L$5 = null;
                        pinProcessorGo$runClusterFlow$12.L$6 = null;
                        pinProcessorGo$runClusterFlow$12.L$7 = null;
                        pinProcessorGo$runClusterFlow$12.L$8 = null;
                        pinProcessorGo$runClusterFlow$12.L$9 = null;
                        pinProcessorGo$runClusterFlow$12.L$10 = null;
                        pinProcessorGo$runClusterFlow$12.L$11 = null;
                        pinProcessorGo$runClusterFlow$12.L$12 = null;
                        pinProcessorGo$runClusterFlow$12.L$13 = null;
                        pinProcessorGo$runClusterFlow$12.L$14 = null;
                        pinProcessorGo$runClusterFlow$12.L$15 = null;
                        pinProcessorGo$runClusterFlow$12.L$16 = null;
                        pinProcessorGo$runClusterFlow$12.L$17 = null;
                        pinProcessorGo$runClusterFlow$12.L$18 = null;
                        pinProcessorGo$runClusterFlow$12.L$19 = null;
                        pinProcessorGo$runClusterFlow$12.L$20 = null;
                        pinProcessorGo$runClusterFlow$12.L$21 = null;
                        pinProcessorGo$runClusterFlow$12.L$22 = null;
                        pinProcessorGo$runClusterFlow$12.L$23 = null;
                        pinProcessorGo$runClusterFlow$12.L$24 = null;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 7;
                        k03 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(m0322, emptyList, list23, list24, null), pinProcessorGo$runClusterFlow$12);
                        if (k03 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    case 6:
                        f2 = pinProcessorGo$runClusterFlow$12.F$0;
                        map7 = (Map) pinProcessorGo$runClusterFlow$12.L$22;
                        list25 = (List) pinProcessorGo$runClusterFlow$12.L$20;
                        list21 = (List) pinProcessorGo$runClusterFlow$12.L$18;
                        list22 = (List) pinProcessorGo$runClusterFlow$12.L$16;
                        map5 = (Map) pinProcessorGo$runClusterFlow$12.L$11;
                        set5 = (Set) pinProcessorGo$runClusterFlow$12.L$3;
                        list24 = (List) pinProcessorGo$runClusterFlow$12.L$2;
                        list23 = (List) pinProcessorGo$runClusterFlow$12.L$1;
                        kotlin.b.b(obj2);
                        list21 = kotlin.collections.a.m0(list21, (Collection) obj2);
                        map6 = map7;
                        list18 = list25;
                        if (!set5.isEmpty()) {
                        }
                        list26 = list22;
                        emptyList = emptyList3;
                        m(list21, f2);
                        ArrayList m03222 = kotlin.collections.a.m0(list18, kotlin.collections.a.m0(list21, list26));
                        pinProcessorGo$runClusterFlow$12.L$0 = null;
                        pinProcessorGo$runClusterFlow$12.L$1 = null;
                        pinProcessorGo$runClusterFlow$12.L$2 = null;
                        pinProcessorGo$runClusterFlow$12.L$3 = null;
                        pinProcessorGo$runClusterFlow$12.L$4 = null;
                        pinProcessorGo$runClusterFlow$12.L$5 = null;
                        pinProcessorGo$runClusterFlow$12.L$6 = null;
                        pinProcessorGo$runClusterFlow$12.L$7 = null;
                        pinProcessorGo$runClusterFlow$12.L$8 = null;
                        pinProcessorGo$runClusterFlow$12.L$9 = null;
                        pinProcessorGo$runClusterFlow$12.L$10 = null;
                        pinProcessorGo$runClusterFlow$12.L$11 = null;
                        pinProcessorGo$runClusterFlow$12.L$12 = null;
                        pinProcessorGo$runClusterFlow$12.L$13 = null;
                        pinProcessorGo$runClusterFlow$12.L$14 = null;
                        pinProcessorGo$runClusterFlow$12.L$15 = null;
                        pinProcessorGo$runClusterFlow$12.L$16 = null;
                        pinProcessorGo$runClusterFlow$12.L$17 = null;
                        pinProcessorGo$runClusterFlow$12.L$18 = null;
                        pinProcessorGo$runClusterFlow$12.L$19 = null;
                        pinProcessorGo$runClusterFlow$12.L$20 = null;
                        pinProcessorGo$runClusterFlow$12.L$21 = null;
                        pinProcessorGo$runClusterFlow$12.L$22 = null;
                        pinProcessorGo$runClusterFlow$12.L$23 = null;
                        pinProcessorGo$runClusterFlow$12.L$24 = null;
                        pinProcessorGo$runClusterFlow$12.F$0 = f2;
                        pinProcessorGo$runClusterFlow$12.label = 7;
                        k03 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(m03222, emptyList, list23, list24, null), pinProcessorGo$runClusterFlow$12);
                        if (k03 == coroutineSingletons) {
                        }
                        break;
                    case 7:
                        kotlin.b.b(obj2);
                        return obj2;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pinProcessorGo$runClusterFlow$1 = new PinProcessorGo$runClusterFlow$1(this, continuationImpl);
        PinProcessorGo$runClusterFlow$1 pinProcessorGo$runClusterFlow$122 = pinProcessorGo$runClusterFlow$1;
        Object obj22 = pinProcessorGo$runClusterFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinProcessorGo$runClusterFlow$122.label;
        EmptyList emptyList32 = EmptyList.a;
        switch (i) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05a2 A[LOOP:0: B:19:0x059c->B:21:0x05a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x061b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(List list, List list2, List list3, float f, Set set, g2c0 g2c0Var, fdc0 fdc0Var, ContinuationImpl continuationImpl) {
        PinProcessorGo$runStandardFlow$1 pinProcessorGo$runStandardFlow$1;
        int i;
        Set set2;
        List list4;
        float f2;
        fdc0 fdc0Var2;
        List list5;
        List list6;
        g2c0 g2c0Var2;
        Object k0;
        fdc0 fdc0Var3;
        List list7;
        List list8;
        List list9;
        List list10;
        Set set3;
        g2c0 g2c0Var3;
        List list11;
        List list12;
        List list13;
        List list14;
        Object k02;
        Set set4;
        List list15;
        g2c0 g2c0Var4;
        fdc0 fdc0Var4;
        List list16;
        b bVar;
        List list17;
        fdc0 fdc0Var5;
        List list18;
        List list19;
        Float f3;
        List list20;
        EmptyList emptyList;
        float height;
        p1c0 p1c0Var;
        b bVar2;
        Set set5;
        Object k03;
        Map map;
        List list21;
        List list22;
        List list23;
        List list24;
        List list25;
        CoroutineSingletons coroutineSingletons;
        ?? arrayList;
        Iterator it;
        Iterator it2;
        if (continuationImpl instanceof PinProcessorGo$runStandardFlow$1) {
            pinProcessorGo$runStandardFlow$1 = (PinProcessorGo$runStandardFlow$1) continuationImpl;
            int i2 = pinProcessorGo$runStandardFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinProcessorGo$runStandardFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinProcessorGo$runStandardFlow$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinProcessorGo$runStandardFlow$1.label;
                EmptyList emptyList2 = EmptyList.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        pinProcessorGo$runStandardFlow$1.L$0 = list;
                        pinProcessorGo$runStandardFlow$1.L$1 = list2;
                        pinProcessorGo$runStandardFlow$1.L$2 = list3;
                        set2 = set;
                        pinProcessorGo$runStandardFlow$1.L$3 = set2;
                        pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var;
                        pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var;
                        pinProcessorGo$runStandardFlow$1.F$0 = f;
                        pinProcessorGo$runStandardFlow$1.label = 1;
                        ArrayList n = n(list, f);
                        if (n != coroutineSingletons2) {
                            list4 = list;
                            f2 = f;
                            fdc0Var2 = fdc0Var;
                            list5 = list2;
                            obj = n;
                            list6 = list3;
                            g2c0Var2 = g2c0Var;
                            List list26 = (List) obj;
                            pinProcessorGo$runStandardFlow$1.L$0 = list4;
                            pinProcessorGo$runStandardFlow$1.L$1 = list5;
                            pinProcessorGo$runStandardFlow$1.L$2 = list6;
                            pinProcessorGo$runStandardFlow$1.L$3 = set2;
                            pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var2;
                            pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var2;
                            pinProcessorGo$runStandardFlow$1.L$6 = list26;
                            pinProcessorGo$runStandardFlow$1.F$0 = f2;
                            pinProcessorGo$runStandardFlow$1.label = 2;
                            k0 = tje.k0(uyj.a, new PinProcessorKt$splitByDeterminacy$2(list26, null), pinProcessorGo$runStandardFlow$1);
                            if (k0 != coroutineSingletons2) {
                                g2c0 g2c0Var5 = g2c0Var2;
                                fdc0Var3 = fdc0Var2;
                                list7 = list26;
                                obj = k0;
                                list8 = list4;
                                list9 = list5;
                                list10 = list6;
                                set3 = set2;
                                g2c0Var3 = g2c0Var5;
                                Pair pair = (Pair) obj;
                                List list27 = (List) pair.getFirst();
                                list11 = (List) pair.getSecond();
                                if (list11.isEmpty()) {
                                    list12 = list10;
                                    list13 = list9;
                                    list14 = list27;
                                    pinProcessorGo$runStandardFlow$1.L$0 = list8;
                                    pinProcessorGo$runStandardFlow$1.L$1 = list13;
                                    pinProcessorGo$runStandardFlow$1.L$2 = list12;
                                    pinProcessorGo$runStandardFlow$1.L$3 = set3;
                                    pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var3;
                                    pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var3;
                                    pinProcessorGo$runStandardFlow$1.L$6 = list7;
                                    pinProcessorGo$runStandardFlow$1.L$7 = list14;
                                    pinProcessorGo$runStandardFlow$1.L$8 = list11;
                                    pinProcessorGo$runStandardFlow$1.L$9 = this;
                                    pinProcessorGo$runStandardFlow$1.F$0 = f2;
                                    pinProcessorGo$runStandardFlow$1.label = 4;
                                    k02 = tje.k0(uyj.a, new PinProcessorKt$filterMayBeVisible$2(list7, null), pinProcessorGo$runStandardFlow$1);
                                    if (k02 != coroutineSingletons2) {
                                        set4 = set3;
                                        list15 = list8;
                                        g2c0Var4 = g2c0Var3;
                                        fdc0Var4 = fdc0Var3;
                                        list16 = list7;
                                        bVar = this;
                                        pinProcessorGo$runStandardFlow$1.L$0 = list15;
                                        pinProcessorGo$runStandardFlow$1.L$1 = list13;
                                        pinProcessorGo$runStandardFlow$1.L$2 = list12;
                                        pinProcessorGo$runStandardFlow$1.L$3 = set4;
                                        pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var4;
                                        pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var4;
                                        pinProcessorGo$runStandardFlow$1.L$6 = list16;
                                        pinProcessorGo$runStandardFlow$1.L$7 = list14;
                                        pinProcessorGo$runStandardFlow$1.L$8 = list11;
                                        List list28 = list11;
                                        pinProcessorGo$runStandardFlow$1.L$9 = null;
                                        pinProcessorGo$runStandardFlow$1.F$0 = f2;
                                        pinProcessorGo$runStandardFlow$1.label = 5;
                                        obj = bVar.k((List) k02, pinProcessorGo$runStandardFlow$1);
                                        if (obj != coroutineSingletons2) {
                                            list17 = list28;
                                            fdc0Var5 = fdc0Var4;
                                            list18 = list14;
                                            list19 = list16;
                                            Map map2 = (Map) obj;
                                            int size = list15.size();
                                            f3 = this.h;
                                            if (f3 == null) {
                                                height = f3.floatValue();
                                                list20 = list17;
                                                emptyList = emptyList2;
                                            } else {
                                                list20 = list17;
                                                float width = g2c0Var4.getWidth() + (this.f * 2);
                                                ewi ewiVar = this.b;
                                                emptyList = emptyList2;
                                                height = ((width / ewiVar.a) / 100.0f) * (((g2c0Var4.getHeight() + r2) / ewiVar.a) / 100.0f);
                                                this.h = Float.valueOf(height);
                                            }
                                            fdc0Var5.getClass();
                                            edc0 edc0Var = new edc0(size, height, fdc0Var5, f2);
                                            pinProcessorGo$runStandardFlow$1.L$0 = null;
                                            pinProcessorGo$runStandardFlow$1.L$1 = list13;
                                            pinProcessorGo$runStandardFlow$1.L$2 = list12;
                                            pinProcessorGo$runStandardFlow$1.L$3 = set4;
                                            pinProcessorGo$runStandardFlow$1.L$4 = null;
                                            pinProcessorGo$runStandardFlow$1.L$5 = null;
                                            pinProcessorGo$runStandardFlow$1.L$6 = null;
                                            pinProcessorGo$runStandardFlow$1.L$7 = list18;
                                            pinProcessorGo$runStandardFlow$1.L$8 = null;
                                            pinProcessorGo$runStandardFlow$1.L$9 = map2;
                                            pinProcessorGo$runStandardFlow$1.L$10 = edc0Var;
                                            pinProcessorGo$runStandardFlow$1.F$0 = f2;
                                            pinProcessorGo$runStandardFlow$1.label = 6;
                                            if (set4.isEmpty()) {
                                                p1c0Var = edc0Var;
                                                Set set6 = set4;
                                                PinProcessorGo$computeWithSuperPins$2 pinProcessorGo$computeWithSuperPins$2 = new PinProcessorGo$computeWithSuperPins$2(list20, this, list19, set6, map2, p1c0Var, null);
                                                bVar2 = this;
                                                set5 = set6;
                                                k03 = tje.k0(uyj.a, pinProcessorGo$computeWithSuperPins$2, pinProcessorGo$runStandardFlow$1);
                                            } else {
                                                p1c0Var = edc0Var;
                                                k03 = tje.k0(uyj.a, new PinProcessor$compute$3(list20, this, list19, map2, edc0Var, null), pinProcessorGo$runStandardFlow$1);
                                                set5 = set4;
                                                bVar2 = this;
                                            }
                                            if (k03 != coroutineSingletons2) {
                                                Object obj2 = k03;
                                                map = map2;
                                                obj = obj2;
                                                list21 = list12;
                                                list22 = list13;
                                                List list29 = (List) obj;
                                                if (set5.isEmpty()) {
                                                    List list30 = list29;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (Object obj3 : list30) {
                                                        if (set5.contains(((czb0) obj3).a.a)) {
                                                            arrayList2.add(obj3);
                                                        }
                                                    }
                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                    Iterator it3 = arrayList2.iterator();
                                                    while (it3.hasNext()) {
                                                        czb0 czb0Var = (czb0) it3.next();
                                                        PinState pinState = czb0Var.d;
                                                        mwb0 mwb0Var = czb0Var.a.a;
                                                        if (pinState == null) {
                                                            it = it3;
                                                        } else {
                                                            it = it3;
                                                            if (pinState.compareTo(PinState.ICON_LABEL_S) >= 0) {
                                                                ycc.r(s(mwb0Var, list18, map, p1c0Var.d()), linkedHashSet);
                                                            }
                                                            if (pinState.compareTo(PinState.ICON) >= 0) {
                                                                ycc.r(s(mwb0Var, list18, map, p1c0Var.h()), linkedHashSet);
                                                            }
                                                        }
                                                        it3 = it;
                                                    }
                                                    Iterator it4 = linkedHashSet.iterator();
                                                    while (true) {
                                                        boolean hasNext = it4.hasNext();
                                                        wub0 wub0Var = bVar2.g;
                                                        if (hasNext) {
                                                            qzb0 qzb0Var = ((czb0) it4.next()).a;
                                                            wub0Var.b(qzb0Var.a, new tvb0(qzb0Var));
                                                            it4 = it4;
                                                            list18 = list18;
                                                        } else {
                                                            list23 = list18;
                                                            List list31 = list23;
                                                            ArrayList arrayList3 = new ArrayList();
                                                            for (Object obj4 : list31) {
                                                                List list32 = list31;
                                                                List list33 = list21;
                                                                if (!linkedHashSet.contains((czb0) obj4)) {
                                                                    arrayList3.add(obj4);
                                                                }
                                                                list31 = list32;
                                                                list21 = list33;
                                                            }
                                                            List list34 = list31;
                                                            list24 = list21;
                                                            LinkedHashMap l = bVar2.l(kotlin.collections.a.m0(list30, arrayList3));
                                                            ArrayList arrayList4 = new ArrayList();
                                                            for (Object obj5 : list34) {
                                                                if (!linkedHashSet.contains((czb0) obj5)) {
                                                                    arrayList4.add(obj5);
                                                                }
                                                            }
                                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                            list25 = list22;
                                                            evc evcVar = new evc(PinState.ICON_LABEL_S, PinState.ICON_LABEL_M);
                                                            k4o a = PinState.a();
                                                            ArrayList arrayList5 = new ArrayList();
                                                            Iterator it5 = a.iterator();
                                                            while (it5.hasNext()) {
                                                                Iterator it6 = it5;
                                                                Object next = it6.next();
                                                                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                                                                if (evcVar.b((PinState) next)) {
                                                                    arrayList5.add(next);
                                                                }
                                                                it5 = it6;
                                                                coroutineSingletons2 = coroutineSingletons3;
                                                            }
                                                            coroutineSingletons = coroutineSingletons2;
                                                            ArrayList arrayList6 = new ArrayList();
                                                            Iterator it7 = arrayList5.iterator();
                                                            while (it7.hasNext()) {
                                                                Set set7 = (Set) l.get((PinState) it7.next());
                                                                Integer valueOf = set7 != null ? Integer.valueOf(set7.size()) : null;
                                                                if (valueOf != null) {
                                                                    arrayList6.add(valueOf);
                                                                }
                                                            }
                                                            int z0 = kotlin.collections.a.z0(arrayList6);
                                                            if (z0 > p1c0Var.g()) {
                                                                ycc.r(o(evcVar, z0 - p1c0Var.g(), arrayList4, list29, set5), linkedHashSet2);
                                                            }
                                                            PinState pinState2 = PinState.ICON;
                                                            evc evcVar2 = new evc(pinState2, pinState2);
                                                            k4o a2 = PinState.a();
                                                            ArrayList arrayList7 = new ArrayList();
                                                            Iterator it8 = a2.iterator();
                                                            while (it8.hasNext()) {
                                                                Object next2 = it8.next();
                                                                Iterator it9 = it8;
                                                                if (evcVar2.b((PinState) next2)) {
                                                                    arrayList7.add(next2);
                                                                }
                                                                it8 = it9;
                                                            }
                                                            ArrayList arrayList8 = new ArrayList();
                                                            Iterator it10 = arrayList7.iterator();
                                                            while (it10.hasNext()) {
                                                                Set set8 = (Set) l.get((PinState) it10.next());
                                                                Integer valueOf2 = set8 != null ? Integer.valueOf(set8.size()) : null;
                                                                if (valueOf2 != null) {
                                                                    arrayList8.add(valueOf2);
                                                                }
                                                            }
                                                            int z02 = kotlin.collections.a.z0(arrayList8);
                                                            if (z02 > p1c0Var.c()) {
                                                                ycc.r(o(evcVar2, z02 - p1c0Var.c(), arrayList4, list29, set5), linkedHashSet2);
                                                            }
                                                            Iterator it11 = linkedHashSet2.iterator();
                                                            while (it11.hasNext()) {
                                                                qzb0 qzb0Var2 = ((czb0) it11.next()).a;
                                                                wub0Var.b(qzb0Var2.a, new tvb0(qzb0Var2));
                                                            }
                                                            LinkedHashSet<czb0> h = v4r0.h(linkedHashSet, linkedHashSet2);
                                                            arrayList = new ArrayList();
                                                            for (czb0 czb0Var2 : h) {
                                                                tvb0 tvb0Var = (tvb0) wub0Var.b.get(czb0Var2.a.a);
                                                                czb0 czb0Var3 = tvb0Var == null ? null : new czb0(czb0Var2.a, tvb0Var.a(f2), tvb0Var.b(f2).b, null);
                                                                if (czb0Var3 != null) {
                                                                    arrayList.add(czb0Var3);
                                                                }
                                                            }
                                                            Iterator it12 = arrayList.iterator();
                                                            while (it12.hasNext()) {
                                                                bVar2.j((czb0) it12.next(), l, map, p1c0Var);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    coroutineSingletons = coroutineSingletons2;
                                                    list24 = list21;
                                                    list25 = list22;
                                                    arrayList = emptyList;
                                                    list23 = list18;
                                                }
                                                Iterable iterable = (Iterable) arrayList;
                                                ArrayList m0 = kotlin.collections.a.m0(iterable, list29);
                                                bVar2.m(m0, f2);
                                                ArrayList arrayList9 = new ArrayList(tcc.n(iterable, 10));
                                                it2 = iterable.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList9.add(((czb0) it2.next()).a.a);
                                                }
                                                Set N0 = kotlin.collections.a.N0(arrayList9);
                                                ArrayList arrayList10 = new ArrayList();
                                                for (Object obj6 : list23) {
                                                    if (!N0.contains(((czb0) obj6).a.a)) {
                                                        arrayList10.add(obj6);
                                                    }
                                                }
                                                pinProcessorGo$runStandardFlow$1.L$0 = null;
                                                pinProcessorGo$runStandardFlow$1.L$1 = null;
                                                pinProcessorGo$runStandardFlow$1.L$2 = null;
                                                pinProcessorGo$runStandardFlow$1.L$3 = null;
                                                pinProcessorGo$runStandardFlow$1.L$4 = null;
                                                pinProcessorGo$runStandardFlow$1.L$5 = null;
                                                pinProcessorGo$runStandardFlow$1.L$6 = null;
                                                pinProcessorGo$runStandardFlow$1.L$7 = null;
                                                pinProcessorGo$runStandardFlow$1.L$8 = null;
                                                pinProcessorGo$runStandardFlow$1.L$9 = null;
                                                pinProcessorGo$runStandardFlow$1.L$10 = null;
                                                pinProcessorGo$runStandardFlow$1.L$11 = null;
                                                pinProcessorGo$runStandardFlow$1.L$12 = null;
                                                pinProcessorGo$runStandardFlow$1.L$13 = null;
                                                pinProcessorGo$runStandardFlow$1.L$14 = null;
                                                pinProcessorGo$runStandardFlow$1.F$0 = f2;
                                                pinProcessorGo$runStandardFlow$1.label = 7;
                                                Object k04 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(arrayList10, m0, list25, list24, null), pinProcessorGo$runStandardFlow$1);
                                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                                                return k04 != coroutineSingletons4 ? coroutineSingletons4 : k04;
                                            }
                                        }
                                    }
                                } else {
                                    pinProcessorGo$runStandardFlow$1.L$0 = null;
                                    pinProcessorGo$runStandardFlow$1.L$1 = null;
                                    pinProcessorGo$runStandardFlow$1.L$2 = null;
                                    pinProcessorGo$runStandardFlow$1.L$3 = null;
                                    pinProcessorGo$runStandardFlow$1.L$4 = null;
                                    pinProcessorGo$runStandardFlow$1.L$5 = null;
                                    pinProcessorGo$runStandardFlow$1.L$6 = null;
                                    pinProcessorGo$runStandardFlow$1.L$7 = null;
                                    pinProcessorGo$runStandardFlow$1.L$8 = null;
                                    pinProcessorGo$runStandardFlow$1.F$0 = f2;
                                    pinProcessorGo$runStandardFlow$1.label = 3;
                                    Object k05 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(list27, emptyList2, list9, list10, null), pinProcessorGo$runStandardFlow$1);
                                    if (k05 != coroutineSingletons2) {
                                        return k05;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons2;
                    case 1:
                        f2 = pinProcessorGo$runStandardFlow$1.F$0;
                        fdc0Var2 = (fdc0) pinProcessorGo$runStandardFlow$1.L$5;
                        g2c0Var2 = (g2c0) pinProcessorGo$runStandardFlow$1.L$4;
                        set2 = (Set) pinProcessorGo$runStandardFlow$1.L$3;
                        list6 = (List) pinProcessorGo$runStandardFlow$1.L$2;
                        list5 = (List) pinProcessorGo$runStandardFlow$1.L$1;
                        list4 = (List) pinProcessorGo$runStandardFlow$1.L$0;
                        kotlin.b.b(obj);
                        List list262 = (List) obj;
                        pinProcessorGo$runStandardFlow$1.L$0 = list4;
                        pinProcessorGo$runStandardFlow$1.L$1 = list5;
                        pinProcessorGo$runStandardFlow$1.L$2 = list6;
                        pinProcessorGo$runStandardFlow$1.L$3 = set2;
                        pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var2;
                        pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var2;
                        pinProcessorGo$runStandardFlow$1.L$6 = list262;
                        pinProcessorGo$runStandardFlow$1.F$0 = f2;
                        pinProcessorGo$runStandardFlow$1.label = 2;
                        k0 = tje.k0(uyj.a, new PinProcessorKt$splitByDeterminacy$2(list262, null), pinProcessorGo$runStandardFlow$1);
                        if (k0 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 2:
                        f2 = pinProcessorGo$runStandardFlow$1.F$0;
                        list7 = (List) pinProcessorGo$runStandardFlow$1.L$6;
                        fdc0Var3 = (fdc0) pinProcessorGo$runStandardFlow$1.L$5;
                        g2c0Var3 = (g2c0) pinProcessorGo$runStandardFlow$1.L$4;
                        set3 = (Set) pinProcessorGo$runStandardFlow$1.L$3;
                        list10 = (List) pinProcessorGo$runStandardFlow$1.L$2;
                        list9 = (List) pinProcessorGo$runStandardFlow$1.L$1;
                        list8 = (List) pinProcessorGo$runStandardFlow$1.L$0;
                        kotlin.b.b(obj);
                        Pair pair2 = (Pair) obj;
                        List list272 = (List) pair2.getFirst();
                        list11 = (List) pair2.getSecond();
                        if (list11.isEmpty()) {
                        }
                        return coroutineSingletons2;
                    case 3:
                        kotlin.b.b(obj);
                        return obj;
                    case 4:
                        f2 = pinProcessorGo$runStandardFlow$1.F$0;
                        bVar = (b) pinProcessorGo$runStandardFlow$1.L$9;
                        List list35 = (List) pinProcessorGo$runStandardFlow$1.L$8;
                        List list36 = (List) pinProcessorGo$runStandardFlow$1.L$7;
                        List list37 = (List) pinProcessorGo$runStandardFlow$1.L$6;
                        fdc0 fdc0Var6 = (fdc0) pinProcessorGo$runStandardFlow$1.L$5;
                        g2c0Var4 = (g2c0) pinProcessorGo$runStandardFlow$1.L$4;
                        set4 = (Set) pinProcessorGo$runStandardFlow$1.L$3;
                        list12 = (List) pinProcessorGo$runStandardFlow$1.L$2;
                        list13 = (List) pinProcessorGo$runStandardFlow$1.L$1;
                        List list38 = (List) pinProcessorGo$runStandardFlow$1.L$0;
                        kotlin.b.b(obj);
                        k02 = obj;
                        list11 = list35;
                        list16 = list37;
                        list14 = list36;
                        list15 = list38;
                        fdc0Var4 = fdc0Var6;
                        pinProcessorGo$runStandardFlow$1.L$0 = list15;
                        pinProcessorGo$runStandardFlow$1.L$1 = list13;
                        pinProcessorGo$runStandardFlow$1.L$2 = list12;
                        pinProcessorGo$runStandardFlow$1.L$3 = set4;
                        pinProcessorGo$runStandardFlow$1.L$4 = g2c0Var4;
                        pinProcessorGo$runStandardFlow$1.L$5 = fdc0Var4;
                        pinProcessorGo$runStandardFlow$1.L$6 = list16;
                        pinProcessorGo$runStandardFlow$1.L$7 = list14;
                        pinProcessorGo$runStandardFlow$1.L$8 = list11;
                        List list282 = list11;
                        pinProcessorGo$runStandardFlow$1.L$9 = null;
                        pinProcessorGo$runStandardFlow$1.F$0 = f2;
                        pinProcessorGo$runStandardFlow$1.label = 5;
                        obj = bVar.k((List) k02, pinProcessorGo$runStandardFlow$1);
                        if (obj != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 5:
                        f2 = pinProcessorGo$runStandardFlow$1.F$0;
                        list17 = (List) pinProcessorGo$runStandardFlow$1.L$8;
                        List list39 = (List) pinProcessorGo$runStandardFlow$1.L$7;
                        list19 = (List) pinProcessorGo$runStandardFlow$1.L$6;
                        fdc0Var5 = (fdc0) pinProcessorGo$runStandardFlow$1.L$5;
                        g2c0Var4 = (g2c0) pinProcessorGo$runStandardFlow$1.L$4;
                        set4 = (Set) pinProcessorGo$runStandardFlow$1.L$3;
                        list12 = (List) pinProcessorGo$runStandardFlow$1.L$2;
                        list13 = (List) pinProcessorGo$runStandardFlow$1.L$1;
                        list15 = (List) pinProcessorGo$runStandardFlow$1.L$0;
                        kotlin.b.b(obj);
                        list18 = list39;
                        Map map22 = (Map) obj;
                        int size2 = list15.size();
                        f3 = this.h;
                        if (f3 == null) {
                        }
                        fdc0Var5.getClass();
                        edc0 edc0Var2 = new edc0(size2, height, fdc0Var5, f2);
                        pinProcessorGo$runStandardFlow$1.L$0 = null;
                        pinProcessorGo$runStandardFlow$1.L$1 = list13;
                        pinProcessorGo$runStandardFlow$1.L$2 = list12;
                        pinProcessorGo$runStandardFlow$1.L$3 = set4;
                        pinProcessorGo$runStandardFlow$1.L$4 = null;
                        pinProcessorGo$runStandardFlow$1.L$5 = null;
                        pinProcessorGo$runStandardFlow$1.L$6 = null;
                        pinProcessorGo$runStandardFlow$1.L$7 = list18;
                        pinProcessorGo$runStandardFlow$1.L$8 = null;
                        pinProcessorGo$runStandardFlow$1.L$9 = map22;
                        pinProcessorGo$runStandardFlow$1.L$10 = edc0Var2;
                        pinProcessorGo$runStandardFlow$1.F$0 = f2;
                        pinProcessorGo$runStandardFlow$1.label = 6;
                        if (set4.isEmpty()) {
                        }
                        if (k03 != coroutineSingletons2) {
                        }
                        return coroutineSingletons2;
                    case 6:
                        f2 = pinProcessorGo$runStandardFlow$1.F$0;
                        p1c0 p1c0Var2 = (p1c0) pinProcessorGo$runStandardFlow$1.L$10;
                        map = (Map) pinProcessorGo$runStandardFlow$1.L$9;
                        list18 = (List) pinProcessorGo$runStandardFlow$1.L$7;
                        set5 = (Set) pinProcessorGo$runStandardFlow$1.L$3;
                        list21 = (List) pinProcessorGo$runStandardFlow$1.L$2;
                        list22 = (List) pinProcessorGo$runStandardFlow$1.L$1;
                        kotlin.b.b(obj);
                        bVar2 = this;
                        p1c0Var = p1c0Var2;
                        emptyList = emptyList2;
                        List list292 = (List) obj;
                        if (set5.isEmpty()) {
                        }
                        Iterable iterable2 = (Iterable) arrayList;
                        ArrayList m02 = kotlin.collections.a.m0(iterable2, list292);
                        bVar2.m(m02, f2);
                        ArrayList arrayList92 = new ArrayList(tcc.n(iterable2, 10));
                        it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                        }
                        Set N02 = kotlin.collections.a.N0(arrayList92);
                        ArrayList arrayList102 = new ArrayList();
                        while (r5.hasNext()) {
                        }
                        pinProcessorGo$runStandardFlow$1.L$0 = null;
                        pinProcessorGo$runStandardFlow$1.L$1 = null;
                        pinProcessorGo$runStandardFlow$1.L$2 = null;
                        pinProcessorGo$runStandardFlow$1.L$3 = null;
                        pinProcessorGo$runStandardFlow$1.L$4 = null;
                        pinProcessorGo$runStandardFlow$1.L$5 = null;
                        pinProcessorGo$runStandardFlow$1.L$6 = null;
                        pinProcessorGo$runStandardFlow$1.L$7 = null;
                        pinProcessorGo$runStandardFlow$1.L$8 = null;
                        pinProcessorGo$runStandardFlow$1.L$9 = null;
                        pinProcessorGo$runStandardFlow$1.L$10 = null;
                        pinProcessorGo$runStandardFlow$1.L$11 = null;
                        pinProcessorGo$runStandardFlow$1.L$12 = null;
                        pinProcessorGo$runStandardFlow$1.L$13 = null;
                        pinProcessorGo$runStandardFlow$1.L$14 = null;
                        pinProcessorGo$runStandardFlow$1.F$0 = f2;
                        pinProcessorGo$runStandardFlow$1.label = 7;
                        Object k042 = tje.k0(uyj.a, new PinProcessorKt$buildOutput$2(arrayList102, m02, list25, list24, null), pinProcessorGo$runStandardFlow$1);
                        CoroutineSingletons coroutineSingletons42 = coroutineSingletons;
                        if (k042 != coroutineSingletons42) {
                        }
                        break;
                    case 7:
                        kotlin.b.b(obj);
                        return obj;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pinProcessorGo$runStandardFlow$1 = new PinProcessorGo$runStandardFlow$1(this, continuationImpl);
        Object obj7 = pinProcessorGo$runStandardFlow$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinProcessorGo$runStandardFlow$1.label;
        EmptyList emptyList22 = EmptyList.a;
        switch (i) {
        }
    }
}
