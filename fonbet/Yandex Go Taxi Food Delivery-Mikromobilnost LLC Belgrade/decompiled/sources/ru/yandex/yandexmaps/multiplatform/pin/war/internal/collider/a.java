package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import defpackage.ewi;
import defpackage.exb0;
import defpackage.ezb0;
import defpackage.fcj0;
import defpackage.fnb0;
import defpackage.jl40;
import defpackage.jvb0;
import defpackage.mvb0;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.pvb0;
import defpackage.qub0;
import defpackage.qvb0;
import defpackage.qzb0;
import defpackage.rvb0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.u1l;
import defpackage.ul91;
import defpackage.uyj;
import defpackage.wub0;
import defpackage.y1c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class a extends pvb0 {
    public final tls i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(exb0 exb0Var, fcj0 fcj0Var, qub0 qub0Var, y1c0 y1c0Var, ewi ewiVar) {
        super(exb0Var, fcj0Var, qub0Var, y1c0Var, ewiVar);
        fnb0 fnb0Var = new fnb0(4);
        this.i = fnb0Var;
    }

    public static boolean f(jvb0 jvb0Var, List list) {
        jvb0 jvb0Var2;
        boolean h;
        List<jvb0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (jvb0 jvb0Var3 : list2) {
                PlacemarkType l = ul91.l(jvb0Var3.f);
                if (l == null) {
                    jvb0Var2 = jvb0Var;
                    h = false;
                } else {
                    jvb0Var2 = jvb0Var;
                    h = ul91.h(jvb0Var2, PlacemarkType.DUST, null, jvb0Var3, l, jvb0Var3.g, 0);
                }
                if (h) {
                    return true;
                }
                jvb0Var = jvb0Var2;
            }
        }
        return false;
    }

    @Override // defpackage.pvb0
    public final void b(ArrayList arrayList, List list, Set set) {
        if (set == null || set.isEmpty()) {
            super.b(arrayList, list, null);
            return;
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            jvb0 jvb0Var = (jvb0) obj;
            if (jvb0Var.f == PinCollider$PlacedLabel.LABEL_S) {
                jvb0 jvb0Var2 = null;
                for (jvb0 jvb0Var3 : arrayList.subList(i2, arrayList.size())) {
                    if (jvb0Var3.f == PinCollider$PlacedLabel.LABEL_M && ul91.g(jvb0Var, PinCollider$PlacedLabel.LABEL_S, jvb0Var3)) {
                        if (jvb0Var2 != null || set.contains(jvb0Var3.a.a)) {
                            jvb0Var.f = PinCollider$PlacedLabel.NONE;
                            break;
                        }
                        jvb0Var2 = jvb0Var3;
                    }
                }
                if (jvb0Var2 != null) {
                    jvb0Var2.f = PinCollider$PlacedLabel.LABEL_S;
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.pvb0
    public final void c(ArrayList arrayList, List list, Set set) {
        if (set == null || set.isEmpty()) {
            super.c(arrayList, list, null);
            return;
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            jvb0 jvb0Var = (jvb0) obj;
            PinCollider$PlacedLabel pinCollider$PlacedLabel = jvb0Var.f;
            qzb0 qzb0Var = jvb0Var.a;
            if (pinCollider$PlacedLabel == PinCollider$PlacedLabel.LABEL_M) {
                for (jvb0 jvb0Var2 : arrayList.subList(i2, arrayList.size())) {
                    if (!set.contains(qzb0Var.a)) {
                        PlacemarkType l = ul91.l(jvb0Var.f);
                        if (l != null && (ul91.g(jvb0Var, PinCollider$PlacedLabel.LABEL_M, jvb0Var2) || ul91.h(jvb0Var, l, jvb0Var.g, jvb0Var2, PlacemarkType.ICON, null, 0))) {
                            jvb0Var.f = PinCollider$PlacedLabel.LABEL_S;
                            break;
                        }
                    } else {
                        PinCollider$PlacedLabel pinCollider$PlacedLabel2 = PinCollider$PlacedLabel.LABEL_M;
                        boolean g = ul91.g(jvb0Var, pinCollider$PlacedLabel2, jvb0Var2);
                        qzb0 qzb0Var2 = jvb0Var2.a;
                        if (g) {
                            if (set.contains(qzb0Var2.a) && qzb0Var.b <= qzb0Var2.b) {
                                jvb0Var.f = PinCollider$PlacedLabel.LABEL_S;
                            } else if (jvb0Var2.f == pinCollider$PlacedLabel2) {
                                jvb0Var2.f = PinCollider$PlacedLabel.LABEL_S;
                            }
                        }
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x07a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01f9 A[LOOP:17: B:292:0x01f3->B:294:0x01f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0213 A[LOOP:18: B:297:0x020d->B:299:0x0213, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0367 A[LOOP:1: B:42:0x0361->B:44:0x0367, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04ed A[LOOP:5: B:92:0x04e7->B:94:0x04ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference failed for: r7v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, List list2, List list3, List list4, float f, Continuation continuation) {
        PinColliderGo$clash$1 pinColliderGo$clash$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list5;
        List list6;
        float f2;
        List list7;
        Set set;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        int i2;
        Set set2;
        float f3;
        List list8;
        List list9;
        Iterator it5;
        ArrayList arrayList;
        Iterator it6;
        boolean isEmpty;
        ArrayList arrayList2;
        List list10;
        ezb0 ezb0Var;
        Iterator it7;
        Iterator it8;
        Iterator it9;
        Iterator it10;
        List list11;
        jvb0 a;
        Float f4;
        ezb0 ezb0Var2;
        jvb0 a2;
        jvb0 a3;
        PlacemarkType l;
        if (continuation instanceof PinColliderGo$clash$1) {
            pinColliderGo$clash$1 = (PinColliderGo$clash$1) continuation;
            int i3 = pinColliderGo$clash$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pinColliderGo$clash$1.label = i3 - Integer.MIN_VALUE;
                PinColliderGo$clash$1 pinColliderGo$clash$12 = pinColliderGo$clash$1;
                obj = pinColliderGo$clash$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinColliderGo$clash$12.label;
                wub0 wub0Var = this.g;
                if (i != 0) {
                    b.b(obj);
                    List list12 = list4;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list12, 10));
                    Iterator it11 = list12.iterator();
                    while (it11.hasNext()) {
                        arrayList3.add(((qzb0) it11.next()).a);
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list) {
                        if (list4.contains(((ezb0) obj2).a)) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                    Iterator it12 = arrayList4.iterator();
                    while (it12.hasNext()) {
                        arrayList5.add(((ezb0) it12.next()).a);
                    }
                    Iterator it13 = arrayList5.iterator();
                    while (it13.hasNext()) {
                        wub0Var.b(((qzb0) it13.next()).a, PinCollider$PlacedLabel.NONE);
                    }
                    pinColliderGo$clash$12.L$0 = list;
                    pinColliderGo$clash$12.L$1 = list2;
                    list5 = list3;
                    pinColliderGo$clash$12.L$2 = list5;
                    pinColliderGo$clash$12.L$3 = null;
                    pinColliderGo$clash$12.L$4 = N0;
                    pinColliderGo$clash$12.L$5 = null;
                    pinColliderGo$clash$12.F$0 = f;
                    pinColliderGo$clash$12.label = 1;
                    Object k0 = tje.k0(uyj.a, new PinColliderKt$splitByState$2(list, null), pinColliderGo$clash$12);
                    if (k0 != coroutineSingletons) {
                        list6 = list;
                        f2 = f;
                        list7 = list2;
                        set = N0;
                        obj = k0;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                f3 = pinColliderGo$clash$12.F$0;
                                list11 = (List) pinColliderGo$clash$12.L$14;
                                b.b(obj);
                                Pair pair = (Pair) obj;
                                List list13 = (List) pair.getFirst();
                                d((List) pair.getSecond());
                                pinColliderGo$clash$12.L$0 = null;
                                pinColliderGo$clash$12.L$1 = null;
                                pinColliderGo$clash$12.L$2 = null;
                                pinColliderGo$clash$12.L$3 = null;
                                pinColliderGo$clash$12.L$4 = null;
                                pinColliderGo$clash$12.L$5 = null;
                                pinColliderGo$clash$12.L$6 = null;
                                pinColliderGo$clash$12.L$7 = null;
                                pinColliderGo$clash$12.L$8 = null;
                                pinColliderGo$clash$12.L$9 = null;
                                pinColliderGo$clash$12.L$10 = null;
                                pinColliderGo$clash$12.L$11 = null;
                                pinColliderGo$clash$12.L$12 = null;
                                pinColliderGo$clash$12.L$13 = null;
                                pinColliderGo$clash$12.L$14 = null;
                                pinColliderGo$clash$12.L$15 = null;
                                pinColliderGo$clash$12.L$16 = null;
                                pinColliderGo$clash$12.F$0 = f3;
                                pinColliderGo$clash$12.label = 5;
                                Object k02 = tje.k0(uyj.a, new PinColliderKt$buildOutput$2(list13, list11, null), pinColliderGo$clash$12);
                                return k02 != coroutineSingletons ? coroutineSingletons : k02;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        b.b(obj);
                        return obj;
                    }
                    f3 = pinColliderGo$clash$12.F$0;
                    list9 = (List) pinColliderGo$clash$12.L$7;
                    set2 = (Set) pinColliderGo$clash$12.L$4;
                    list8 = (List) pinColliderGo$clash$12.L$2;
                    List list14 = (List) pinColliderGo$clash$12.L$0;
                    b.b(obj);
                    i2 = 10;
                    list6 = list14;
                    List<jvb0> list15 = (List) obj;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : list6) {
                        ezb0 ezb0Var3 = (ezb0) obj3;
                        if (set2.contains(ezb0Var3.a.a) && ezb0Var3.b.compareTo(PinState.ICON) >= 0) {
                            arrayList6.add(obj3);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, i2));
                    it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(((ezb0) it6.next()).a);
                    }
                    if (!set2.isEmpty()) {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it14 = arrayList7.iterator();
                        while (it14.hasNext()) {
                            jvb0 a4 = a((qzb0) it14.next(), false);
                            if (a4 != null) {
                                arrayList8.add(a4);
                            }
                        }
                        for (jvb0 jvb0Var : list15) {
                            if (set2.contains(jvb0Var.a.a) && (l = ul91.l(jvb0Var.f)) != null && !arrayList8.isEmpty()) {
                                Iterator it15 = arrayList8.iterator();
                                while (true) {
                                    if (it15.hasNext()) {
                                        jvb0 jvb0Var2 = (jvb0) it15.next();
                                        if (!jl40.l(jvb0Var2.a.a, jvb0Var.a.a) && ul91.h(jvb0Var, l, jvb0Var.g, jvb0Var2, PlacemarkType.ICON, null, 0)) {
                                            jvb0Var.f = PinCollider$PlacedLabel.NONE;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    d(list15);
                    isEmpty = set2.isEmpty();
                    Iterable iterable = EmptyList.a;
                    if (isEmpty) {
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj4 : list15) {
                            if (set2.contains(((jvb0) obj4).a.a)) {
                                arrayList9.add(obj4);
                            } else {
                                arrayList10.add(obj4);
                            }
                        }
                        Pair pair2 = new Pair(arrayList9, arrayList10);
                        List list16 = (List) pair2.getFirst();
                        List<jvb0> list17 = (List) pair2.getSecond();
                        arrayList2 = new ArrayList();
                        for (jvb0 jvb0Var3 : list17) {
                            if (jvb0Var3.f == PinCollider$PlacedLabel.NONE) {
                                List<jvb0> list18 = list16;
                                if (!(list18 instanceof Collection) || !list18.isEmpty()) {
                                    for (jvb0 jvb0Var4 : list18) {
                                        PlacemarkType l2 = ul91.l(jvb0Var4.f);
                                        if (l2 == null) {
                                            l2 = PlacemarkType.ICON;
                                        }
                                        list10 = list9;
                                        if (ul91.h(jvb0Var4, l2, jvb0Var4.g, jvb0Var3, PlacemarkType.ICON, null, this.c)) {
                                            ezb0Var = new ezb0(jvb0Var3.a, PinState.INVISIBLE);
                                            break;
                                        }
                                        list9 = list10;
                                    }
                                }
                            }
                            list10 = list9;
                            ezb0Var = null;
                            if (ezb0Var != null) {
                                arrayList2.add(ezb0Var);
                            }
                            list9 = list10;
                        }
                    } else {
                        arrayList2 = iterable;
                    }
                    List list19 = list9;
                    ArrayList arrayList11 = arrayList2;
                    ArrayList arrayList12 = new ArrayList(tcc.n(arrayList11, 10));
                    it7 = arrayList11.iterator();
                    while (it7.hasNext()) {
                        arrayList12.add(((ezb0) it7.next()).a);
                    }
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj5 : list15) {
                        if (!arrayList12.contains(((jvb0) obj5).a)) {
                            arrayList13.add(obj5);
                        }
                    }
                    ArrayList m0 = kotlin.collections.a.m0(arrayList11, list19);
                    ArrayList arrayList14 = new ArrayList();
                    it8 = arrayList13.iterator();
                    while (it8.hasNext()) {
                        Object next = it8.next();
                        if (((jvb0) next).f != PinCollider$PlacedLabel.NONE) {
                            arrayList14.add(next);
                        }
                    }
                    if (!set2.isEmpty()) {
                        iterable = new ArrayList();
                        Iterator it16 = arrayList14.iterator();
                        while (it16.hasNext()) {
                            Object next2 = it16.next();
                            if (set2.contains(((jvb0) next2).a.a)) {
                                iterable.add(next2);
                            }
                        }
                    }
                    ArrayList arrayList15 = new ArrayList();
                    it9 = arrayList14.iterator();
                    while (it9.hasNext()) {
                        Object next3 = it9.next();
                        if (!set2.contains(((jvb0) next3).a.a)) {
                            arrayList15.add(next3);
                        }
                    }
                    ArrayList arrayList16 = new ArrayList(tcc.n(m0, 10));
                    it10 = m0.iterator();
                    while (it10.hasNext()) {
                        ezb0 ezb0Var4 = (ezb0) it10.next();
                        qzb0 qzb0Var = ezb0Var4.a;
                        qzb0 qzb0Var2 = ezb0Var4.a;
                        if (!set2.contains(qzb0Var.a)) {
                            int i4 = qvb0.a[ezb0Var4.b.ordinal()];
                            if (i4 == 1) {
                                if (!((Boolean) this.i.invoke(qzb0Var)).booleanValue() && (a = a(qzb0Var, false)) != null) {
                                    if (f(a, arrayList15)) {
                                        ezb0Var2 = new ezb0(qzb0Var2, PinState.INVISIBLE);
                                    } else if (f(a, iterable) && ((f4 = qzb0Var.d) == null || f4.floatValue() > f3)) {
                                        ezb0Var2 = new ezb0(qzb0Var2, PinState.INVISIBLE);
                                    }
                                    ezb0Var4 = ezb0Var2;
                                    break;
                                    break;
                                }
                            } else if (i4 != 2) {
                                if ((i4 == 3 || i4 == 4) && !iterable.isEmpty() && (a3 = a(qzb0Var, false)) != null) {
                                    Iterable<jvb0> iterable2 = iterable;
                                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                        for (jvb0 jvb0Var5 : iterable2) {
                                            PlacemarkType l3 = ul91.l(jvb0Var5.f);
                                            if (l3 == null ? false : ul91.h(a3, PlacemarkType.ICON, null, jvb0Var5, l3, jvb0Var5.g, 0)) {
                                                ezb0Var2 = new ezb0(qzb0Var2, PinState.INVISIBLE);
                                                ezb0Var4 = ezb0Var2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else if (!iterable.isEmpty() && (a2 = a(qzb0Var, false)) != null) {
                                Iterable<jvb0> iterable3 = iterable;
                                if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                                    for (jvb0 jvb0Var6 : iterable3) {
                                        PlacemarkType l4 = ul91.l(jvb0Var6.f);
                                        if (l4 == null ? false : ul91.h(a2, PlacemarkType.ICON, null, jvb0Var6, l4, jvb0Var6.g, 0)) {
                                            ezb0Var2 = new ezb0(qzb0Var2, PinState.INVISIBLE);
                                            ezb0Var4 = ezb0Var2;
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        arrayList16.add(ezb0Var4);
                    }
                    if (list8.isEmpty()) {
                        ArrayList arrayList17 = new ArrayList();
                        Iterator it17 = list8.iterator();
                        while (it17.hasNext()) {
                            jvb0 a5 = a((qzb0) it17.next(), false);
                            if (a5 != null) {
                                arrayList17.add(a5);
                            }
                        }
                        pinColliderGo$clash$12.L$0 = null;
                        pinColliderGo$clash$12.L$1 = null;
                        pinColliderGo$clash$12.L$2 = null;
                        pinColliderGo$clash$12.L$3 = null;
                        pinColliderGo$clash$12.L$4 = null;
                        pinColliderGo$clash$12.L$5 = null;
                        pinColliderGo$clash$12.L$6 = null;
                        pinColliderGo$clash$12.L$7 = null;
                        pinColliderGo$clash$12.L$8 = null;
                        pinColliderGo$clash$12.L$9 = null;
                        pinColliderGo$clash$12.L$10 = null;
                        pinColliderGo$clash$12.L$11 = null;
                        pinColliderGo$clash$12.L$12 = null;
                        pinColliderGo$clash$12.L$13 = null;
                        pinColliderGo$clash$12.L$14 = arrayList16;
                        pinColliderGo$clash$12.F$0 = f3;
                        pinColliderGo$clash$12.label = 4;
                        Object k03 = tje.k0(uyj.a, new PinColliderKt$clash$2(arrayList13, arrayList17, null), pinColliderGo$clash$12);
                        if (k03 != coroutineSingletons) {
                            obj = k03;
                            list11 = arrayList16;
                            Pair pair3 = (Pair) obj;
                            List list132 = (List) pair3.getFirst();
                            d((List) pair3.getSecond());
                            pinColliderGo$clash$12.L$0 = null;
                            pinColliderGo$clash$12.L$1 = null;
                            pinColliderGo$clash$12.L$2 = null;
                            pinColliderGo$clash$12.L$3 = null;
                            pinColliderGo$clash$12.L$4 = null;
                            pinColliderGo$clash$12.L$5 = null;
                            pinColliderGo$clash$12.L$6 = null;
                            pinColliderGo$clash$12.L$7 = null;
                            pinColliderGo$clash$12.L$8 = null;
                            pinColliderGo$clash$12.L$9 = null;
                            pinColliderGo$clash$12.L$10 = null;
                            pinColliderGo$clash$12.L$11 = null;
                            pinColliderGo$clash$12.L$12 = null;
                            pinColliderGo$clash$12.L$13 = null;
                            pinColliderGo$clash$12.L$14 = null;
                            pinColliderGo$clash$12.L$15 = null;
                            pinColliderGo$clash$12.L$16 = null;
                            pinColliderGo$clash$12.F$0 = f3;
                            pinColliderGo$clash$12.label = 5;
                            Object k022 = tje.k0(uyj.a, new PinColliderKt$buildOutput$2(list132, list11, null), pinColliderGo$clash$12);
                            if (k022 != coroutineSingletons) {
                            }
                        }
                    } else {
                        pinColliderGo$clash$12.L$0 = null;
                        pinColliderGo$clash$12.L$1 = null;
                        pinColliderGo$clash$12.L$2 = null;
                        pinColliderGo$clash$12.L$3 = null;
                        pinColliderGo$clash$12.L$4 = null;
                        pinColliderGo$clash$12.L$5 = null;
                        pinColliderGo$clash$12.L$6 = null;
                        pinColliderGo$clash$12.L$7 = null;
                        pinColliderGo$clash$12.L$8 = null;
                        pinColliderGo$clash$12.L$9 = null;
                        pinColliderGo$clash$12.L$10 = null;
                        pinColliderGo$clash$12.L$11 = null;
                        pinColliderGo$clash$12.L$12 = null;
                        pinColliderGo$clash$12.L$13 = null;
                        pinColliderGo$clash$12.L$14 = null;
                        pinColliderGo$clash$12.F$0 = f3;
                        pinColliderGo$clash$12.label = 3;
                        Object k04 = tje.k0(uyj.a, new PinColliderKt$buildOutput$2(arrayList13, arrayList16, null), pinColliderGo$clash$12);
                        if (k04 != coroutineSingletons) {
                            return k04;
                        }
                    }
                }
                f2 = pinColliderGo$clash$12.F$0;
                set = (Set) pinColliderGo$clash$12.L$4;
                list5 = (List) pinColliderGo$clash$12.L$2;
                list7 = (List) pinColliderGo$clash$12.L$1;
                list6 = (List) pinColliderGo$clash$12.L$0;
                b.b(obj);
                List list20 = list5;
                Pair pair4 = (Pair) obj;
                List list21 = (List) pair4.getFirst();
                List list22 = (List) pair4.getSecond();
                List list23 = list7;
                List list24 = list22;
                ArrayList arrayList18 = new ArrayList(tcc.n(list24, 10));
                it = list24.iterator();
                while (it.hasNext()) {
                    arrayList18.add(((ezb0) it.next()).a);
                }
                it2 = kotlin.collections.a.m0(arrayList18, list23).iterator();
                while (it2.hasNext()) {
                    wub0Var.b(((qzb0) it2.next()).a, PinCollider$PlacedLabel.NONE);
                }
                ArrayList arrayList19 = new ArrayList();
                for (Object obj6 : list6) {
                    if (((ezb0) obj6).b.compareTo(PinState.CLUSTER) >= 0) {
                        arrayList19.add(obj6);
                    }
                }
                ArrayList arrayList20 = new ArrayList();
                it3 = arrayList19.iterator();
                while (it3.hasNext()) {
                    jvb0 a6 = a(((ezb0) it3.next()).a, false);
                    if (a6 != null) {
                        arrayList20.add(a6);
                    }
                }
                List x0 = kotlin.collections.a.x0(new u1l(2, list21), new mvb0());
                ArrayList arrayList21 = new ArrayList();
                it4 = x0.iterator();
                while (it4.hasNext()) {
                    ezb0 ezb0Var5 = (ezb0) it4.next();
                    qzb0 qzb0Var3 = ezb0Var5.a;
                    PinState pinState = ezb0Var5.b;
                    mwb0 mwb0Var = qzb0Var3.a;
                    PinCollider$PlacedLabel pinCollider$PlacedLabel = (PinCollider$PlacedLabel) wub0Var.b.get(mwb0Var);
                    if (pinCollider$PlacedLabel != null) {
                        it5 = it4;
                        int i5 = rvb0.b[pinState.ordinal()];
                        arrayList = arrayList20;
                        PinCollider$PlacedLabel pinCollider$PlacedLabel2 = i5 != 1 ? i5 != 2 ? PinCollider$PlacedLabel.NONE : PinCollider$PlacedLabel.LABEL_M : PinCollider$PlacedLabel.LABEL_S;
                        if (pinCollider$PlacedLabel.compareTo(pinCollider$PlacedLabel2) > 0) {
                            pinCollider$PlacedLabel = pinCollider$PlacedLabel2;
                        }
                    } else {
                        it5 = it4;
                        arrayList = arrayList20;
                        pinCollider$PlacedLabel = PinCollider$PlacedLabel.NONE;
                    }
                    wub0Var.b(mwb0Var, pinCollider$PlacedLabel);
                    jvb0 a7 = a(qzb0Var3, pinState == PinState.ICON_LABEL_M);
                    if (a7 != null) {
                        arrayList21.add(a7);
                    }
                    it4 = it5;
                    arrayList20 = arrayList;
                }
                ArrayList arrayList22 = arrayList20;
                pinColliderGo$clash$12.L$0 = list6;
                pinColliderGo$clash$12.L$1 = null;
                pinColliderGo$clash$12.L$2 = list20;
                pinColliderGo$clash$12.L$3 = null;
                pinColliderGo$clash$12.L$4 = set;
                pinColliderGo$clash$12.L$5 = null;
                pinColliderGo$clash$12.L$6 = null;
                pinColliderGo$clash$12.L$7 = list22;
                pinColliderGo$clash$12.L$8 = null;
                pinColliderGo$clash$12.F$0 = f2;
                pinColliderGo$clash$12.label = 2;
                float f5 = f2;
                Set set3 = set;
                i2 = 10;
                obj = tje.k0(uyj.a, new PinCollider$clash$5(arrayList21, this, this.h, this.c, arrayList22, set3, null), pinColliderGo$clash$12);
                if (obj != coroutineSingletons) {
                    set2 = set3;
                    f3 = f5;
                    list8 = list20;
                    list9 = list22;
                    List<jvb0> list152 = (List) obj;
                    ArrayList arrayList62 = new ArrayList();
                    while (r7.hasNext()) {
                    }
                    ArrayList arrayList72 = new ArrayList(tcc.n(arrayList62, i2));
                    it6 = arrayList62.iterator();
                    while (it6.hasNext()) {
                    }
                    if (!set2.isEmpty()) {
                    }
                    d(list152);
                    isEmpty = set2.isEmpty();
                    Iterable iterable4 = EmptyList.a;
                    if (isEmpty) {
                    }
                    List list192 = list9;
                    ArrayList arrayList112 = arrayList2;
                    ArrayList arrayList122 = new ArrayList(tcc.n(arrayList112, 10));
                    it7 = arrayList112.iterator();
                    while (it7.hasNext()) {
                    }
                    ArrayList arrayList132 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    ArrayList m02 = kotlin.collections.a.m0(arrayList112, list192);
                    ArrayList arrayList142 = new ArrayList();
                    it8 = arrayList132.iterator();
                    while (it8.hasNext()) {
                    }
                    if (!set2.isEmpty()) {
                    }
                    ArrayList arrayList152 = new ArrayList();
                    it9 = arrayList142.iterator();
                    while (it9.hasNext()) {
                    }
                    ArrayList arrayList162 = new ArrayList(tcc.n(m02, 10));
                    it10 = m02.iterator();
                    while (it10.hasNext()) {
                    }
                    if (list8.isEmpty()) {
                    }
                }
            }
        }
        pinColliderGo$clash$1 = new PinColliderGo$clash$1(this, (ContinuationImpl) continuation);
        PinColliderGo$clash$1 pinColliderGo$clash$122 = pinColliderGo$clash$1;
        obj = pinColliderGo$clash$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinColliderGo$clash$122.label;
        wub0 wub0Var2 = this.g;
        if (i != 0) {
        }
        List list202 = list5;
        Pair pair42 = (Pair) obj;
        List list212 = (List) pair42.getFirst();
        List list222 = (List) pair42.getSecond();
        List list232 = list7;
        List list242 = list222;
        ArrayList arrayList182 = new ArrayList(tcc.n(list242, 10));
        it = list242.iterator();
        while (it.hasNext()) {
        }
        it2 = kotlin.collections.a.m0(arrayList182, list232).iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList192 = new ArrayList();
        while (r7.hasNext()) {
        }
        ArrayList arrayList202 = new ArrayList();
        it3 = arrayList192.iterator();
        while (it3.hasNext()) {
        }
        List x02 = kotlin.collections.a.x0(new u1l(2, list212), new mvb0());
        ArrayList arrayList212 = new ArrayList();
        it4 = x02.iterator();
        while (it4.hasNext()) {
        }
        ArrayList arrayList222 = arrayList202;
        pinColliderGo$clash$122.L$0 = list6;
        pinColliderGo$clash$122.L$1 = null;
        pinColliderGo$clash$122.L$2 = list202;
        pinColliderGo$clash$122.L$3 = null;
        pinColliderGo$clash$122.L$4 = set;
        pinColliderGo$clash$122.L$5 = null;
        pinColliderGo$clash$122.L$6 = null;
        pinColliderGo$clash$122.L$7 = list222;
        pinColliderGo$clash$122.L$8 = null;
        pinColliderGo$clash$122.F$0 = f2;
        pinColliderGo$clash$122.label = 2;
        float f52 = f2;
        Set set32 = set;
        i2 = 10;
        obj = tje.k0(uyj.a, new PinCollider$clash$5(arrayList212, this, this.h, this.c, arrayList222, set32, null), pinColliderGo$clash$122);
        if (obj != coroutineSingletons) {
        }
    }
}
