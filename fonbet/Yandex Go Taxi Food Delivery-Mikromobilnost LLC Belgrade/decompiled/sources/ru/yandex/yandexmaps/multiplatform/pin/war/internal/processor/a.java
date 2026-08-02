package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import defpackage.czb0;
import defpackage.evc;
import defpackage.ewi;
import defpackage.exb0;
import defpackage.fcj0;
import defpackage.fdc0;
import defpackage.k4o;
import defpackage.k8c;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.p1c0;
import defpackage.qzb0;
import defpackage.svb0;
import defpackage.tls;
import defpackage.tvb0;
import defpackage.ua91;
import defpackage.w2t;
import defpackage.wub0;
import defpackage.y1c0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.ConcurrencyKt$throttle$1;

/* loaded from: classes7.dex */
public abstract class a {
    public final fcj0 a;
    public final ewi b;
    public final k8c c;
    public final y1c0 d;
    public final fdc0 e;
    public final int f;
    public final wub0 g;
    public Float h;

    public a(exb0 exb0Var, k8c k8cVar, y1c0 y1c0Var, fcj0 fcj0Var, fdc0 fdc0Var, ewi ewiVar) {
        this.a = fcj0Var;
        this.b = ewiVar;
        this.c = k8cVar;
        this.d = y1c0Var;
        this.e = fdc0Var;
        this.f = ua91.a(100, ewiVar);
        this.g = exb0Var.a(PinCacheMode.PERMANENT);
    }

    public static boolean h(Map map, evc evcVar, int i) {
        k4o a = PinState.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (evcVar.b((PinState) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Set set = (Set) map.get((PinState) it.next());
            Integer valueOf = set != null ? Integer.valueOf(set.size()) : null;
            if (valueOf != null) {
                arrayList2.add(valueOf);
            }
        }
        return kotlin.collections.a.z0(arrayList2) < i;
    }

    public static boolean i(mwb0 mwb0Var, evc evcVar, Map map, Map map2, int i) {
        PointF pointF;
        PointF pointF2 = (PointF) map2.get(mwb0Var);
        if (pointF2 == null) {
            return false;
        }
        k4o a = PinState.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (evcVar.b((PinState) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Set<mwb0> set = (Set) map.get((PinState) it.next());
            if (set != null) {
                for (mwb0 mwb0Var2 : set) {
                    if (!mwb0Var.equals(mwb0Var2) && (pointF = (PointF) map2.get(mwb0Var2)) != null && w2t.c(pointF2, pointF) < i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public abstract void a(czb0 czb0Var, PinState pinState, Map map);

    public abstract boolean b(qzb0 qzb0Var, Map map, Map map2, PinState pinState);

    public abstract boolean c(qzb0 qzb0Var, Map map, Map map2);

    public boolean d(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var) {
        PinState pinState = PinState.DUST;
        return h(map, new evc(pinState, pinState), p1c0Var.b()) && i(qzb0Var.a, new evc(pinState, PinState.ICON_LABEL_M), map, map2, p1c0Var.f());
    }

    public abstract boolean e(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var);

    public abstract boolean f(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var);

    public abstract boolean g(qzb0 qzb0Var, Map map, Map map2, p1c0 p1c0Var, PinState pinState);

    public final void j(czb0 czb0Var, Map map, Map map2, p1c0 p1c0Var) {
        a aVar;
        Map map3;
        Map map4;
        p1c0 p1c0Var2;
        qzb0 qzb0Var = czb0Var.a;
        PinState pinState = czb0Var.b;
        PinState pinState2 = czb0Var.c;
        if (pinState2 == PinState.CLUSTER || pinState2 == PinState.SUPERCLUSTER) {
            if (c(qzb0Var, map, map2)) {
                a(czb0Var, pinState2, map);
                return;
            } else {
                a(czb0Var, PinState.INVISIBLE, map);
                return;
            }
        }
        PinState pinState3 = PinState.ICON_LABEL_M;
        if (pinState2.compareTo(pinState3) >= 0) {
            if (p1c0Var.e()) {
                aVar = this;
                map3 = map;
                map4 = map2;
                p1c0Var2 = p1c0Var;
                if (aVar.g(qzb0Var, map3, map4, p1c0Var2, pinState) && aVar.b(qzb0Var, map3, map4, pinState3)) {
                    aVar.a(czb0Var, pinState3, map3);
                    return;
                }
            } else {
                aVar = this;
                map3 = map;
                map4 = map2;
                p1c0Var2 = p1c0Var;
            }
            PinState pinState4 = PinState.ICON_LABEL_S;
            if (pinState.compareTo(pinState4) >= 0 && aVar.b(qzb0Var, map3, map4, pinState4)) {
                aVar.a(czb0Var, pinState4, map3);
                return;
            }
        } else {
            aVar = this;
            map3 = map;
            map4 = map2;
            p1c0Var2 = p1c0Var;
        }
        PinState pinState5 = PinState.ICON_LABEL_S;
        if (pinState2.compareTo(pinState5) >= 0) {
            if (p1c0Var2.i() && aVar.g(qzb0Var, map3, map4, p1c0Var2, pinState) && aVar.b(qzb0Var, map3, map4, pinState5)) {
                aVar.a(czb0Var, pinState5, map3);
                return;
            }
            PinState pinState6 = PinState.ICON;
            if (pinState.compareTo(pinState6) >= 0 && aVar.b(qzb0Var, map3, map4, pinState6)) {
                aVar.a(czb0Var, pinState6, map3);
                return;
            }
        }
        PinState pinState7 = PinState.ICON;
        if (pinState2.compareTo(pinState7) >= 0) {
            if (p1c0Var2.a() && aVar.f(qzb0Var, map3, map4, p1c0Var2) && aVar.b(qzb0Var, map3, map4, pinState7)) {
                aVar.a(czb0Var, pinState7, map3);
                return;
            }
            PinState pinState8 = PinState.DUST;
            if (pinState.compareTo(pinState8) >= 0) {
                if (aVar.e(qzb0Var, map3, map4, p1c0Var2)) {
                    aVar.a(czb0Var, pinState8, map3);
                    return;
                } else {
                    aVar.a(czb0Var, PinState.INVISIBLE, map3);
                    return;
                }
            }
        }
        if (aVar.d(qzb0Var, map3, map4, p1c0Var2)) {
            aVar.a(czb0Var, PinState.DUST, map3);
        } else {
            aVar.a(czb0Var, PinState.INVISIBLE, map3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c9 -> B:10:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(List list, ContinuationImpl continuationImpl) {
        PinProcessor$screenPoints$1 pinProcessor$screenPoints$1;
        int i;
        LinkedHashMap linkedHashMap;
        Object obj;
        Iterator it;
        tls tlsVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Map map;
        if (continuationImpl instanceof PinProcessor$screenPoints$1) {
            pinProcessor$screenPoints$1 = (PinProcessor$screenPoints$1) continuationImpl;
            int i7 = pinProcessor$screenPoints$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                pinProcessor$screenPoints$1.label = i7 - Integer.MIN_VALUE;
                Object obj2 = pinProcessor$screenPoints$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinProcessor$screenPoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    linkedHashMap = new LinkedHashMap();
                    obj = null;
                    ConcurrencyKt$throttle$1 concurrencyKt$throttle$1 = new ConcurrencyKt$throttle$1(new Ref$IntRef(), 10, null);
                    it = list.iterator();
                    tlsVar = concurrencyKt$throttle$1;
                    i2 = 10;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = pinProcessor$screenPoints$1.I$4;
                    i4 = pinProcessor$screenPoints$1.I$3;
                    i5 = pinProcessor$screenPoints$1.I$2;
                    i2 = pinProcessor$screenPoints$1.I$1;
                    i6 = pinProcessor$screenPoints$1.I$0;
                    PointF d = (PointF) pinProcessor$screenPoints$1.L$9;
                    qzb0 qzb0Var = (qzb0) pinProcessor$screenPoints$1.L$8;
                    it = (Iterator) pinProcessor$screenPoints$1.L$6;
                    tlsVar = (tls) pinProcessor$screenPoints$1.L$4;
                    map = (Map) pinProcessor$screenPoints$1.L$2;
                    ?? r7 = (Map) pinProcessor$screenPoints$1.L$1;
                    kotlin.b.b(obj2);
                    linkedHashMap = r7;
                    obj = null;
                    mwb0 mwb0Var = qzb0Var.a;
                    if (d != null) {
                        map.put(mwb0Var, d);
                    }
                    if (it.hasNext()) {
                        qzb0Var = (qzb0) it.next();
                        d = this.a.d(qzb0Var);
                        pinProcessor$screenPoints$1.L$0 = obj;
                        pinProcessor$screenPoints$1.L$1 = linkedHashMap;
                        pinProcessor$screenPoints$1.L$2 = map;
                        pinProcessor$screenPoints$1.L$3 = obj;
                        pinProcessor$screenPoints$1.L$4 = tlsVar;
                        pinProcessor$screenPoints$1.L$5 = obj;
                        pinProcessor$screenPoints$1.L$6 = it;
                        pinProcessor$screenPoints$1.L$7 = obj;
                        pinProcessor$screenPoints$1.L$8 = qzb0Var;
                        pinProcessor$screenPoints$1.L$9 = d;
                        pinProcessor$screenPoints$1.I$0 = i6;
                        pinProcessor$screenPoints$1.I$1 = i2;
                        pinProcessor$screenPoints$1.I$2 = i5;
                        pinProcessor$screenPoints$1.I$3 = i4;
                        pinProcessor$screenPoints$1.I$4 = i3;
                        pinProcessor$screenPoints$1.I$5 = 0;
                        pinProcessor$screenPoints$1.label = 1;
                        if (tlsVar.invoke(pinProcessor$screenPoints$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        mwb0 mwb0Var2 = qzb0Var.a;
                        if (d != null) {
                        }
                        if (it.hasNext()) {
                            return linkedHashMap;
                        }
                    }
                }
            }
        }
        pinProcessor$screenPoints$1 = new PinProcessor$screenPoints$1(this, continuationImpl);
        Object obj22 = pinProcessor$screenPoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinProcessor$screenPoints$1.label;
        if (i != 0) {
        }
    }

    public abstract LinkedHashMap l(List list);

    public final void m(List list, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            czb0 czb0Var = (czb0) it.next();
            mwb0 mwb0Var = czb0Var.a.a;
            wub0 wub0Var = this.g;
            tvb0 tvb0Var = (tvb0) wub0Var.b.get(mwb0Var);
            PinState pinState = czb0Var.d;
            if (tvb0Var != null) {
                Float f2 = tvb0Var.a;
                if (pinState != null) {
                    mwb0 mwb0Var2 = czb0Var.a.a;
                    List list2 = tvb0Var.b;
                    if (f2 != null && f >= f2.floatValue()) {
                        pinState = (PinState) y6i0.a(pinState, PinState.DUST);
                    }
                    svb0 d = tvb0Var.d(f);
                    svb0 b = tvb0Var.b(f);
                    PinState pinState2 = d.b;
                    if (pinState2 != b.b && pinState.compareTo(pinState2) >= 0 && pinState.compareTo(b.b) <= 0) {
                        ArrayList arrayList = new ArrayList(list2);
                        arrayList.add(list2.indexOf(b), new svb0(f, pinState));
                        tvb0Var = new tvb0(f2, arrayList).c();
                    }
                    wub0Var.b(mwb0Var2, tvb0Var);
                }
            }
        }
    }
}
