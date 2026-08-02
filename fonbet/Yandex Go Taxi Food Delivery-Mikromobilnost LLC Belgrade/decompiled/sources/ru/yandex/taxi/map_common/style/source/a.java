package ru.yandex.taxi.map_common.style.source;

import android.content.Context;
import defpackage.am2;
import defpackage.ceh;
import defpackage.cne0;
import defpackage.ct00;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.hs00;
import defpackage.jl40;
import defpackage.js00;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.qv00;
import defpackage.scc;
import defpackage.sd7;
import defpackage.swh0;
import defpackage.tcc;
import defpackage.td7;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1 mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1;
        int i;
        List g;
        if (continuation instanceof MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1) {
            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1 = (MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1) continuation;
            int i2 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.label;
                int i3 = 1;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e eVar = this.b;
                    td7 td7Var = eVar.e;
                    td7 td7Var2 = eVar.e;
                    qv00 qv00Var = eVar.d;
                    wnt wntVar = eVar.a;
                    am2 am2Var = td7Var.a.a;
                    ((cne0) am2Var.b).a();
                    ((cne0) am2Var.c).a();
                    List<kotlinx.serialization.json.c> list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (kotlinx.serialization.json.c cVar : list) {
                        arrayList.add(new Pair(cVar, qv00Var.a(((xnt) wntVar).d(cVar, hs00.Companion.serializer()))));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Optional) ((Pair) next).getSecond()).isPresent()) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Pair pair = (Pair) it2.next();
                        arrayList3.add(new Pair((kotlinx.serialization.json.c) pair.getFirst(), ((Optional) pair.getSecond()).get()));
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        int i4 = 2;
                        if (it3.hasNext()) {
                            Pair pair2 = (Pair) it3.next();
                            kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) pair2.getFirst();
                            js00 js00Var = (js00) pair2.getSecond();
                            String str = js00Var.a;
                            String cVar3 = cVar2.toString();
                            ThemeType themeType = js00Var.h;
                            am2 am2Var2 = td7Var2.a.a;
                            am2Var2.getClass();
                            int i5 = ceh.a[themeType.ordinal()];
                            if (i5 == 1) {
                                ((cne0) am2Var2.b).r(str, cVar3);
                            } else {
                                if (i5 != 2) {
                                    w511.b();
                                    return null;
                                }
                                ((cne0) am2Var2.c).r(str, cVar3);
                            }
                        } else {
                            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add((js00) ((Pair) it4.next()).getSecond());
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                ThemeType themeType2 = ((js00) next2).h;
                                Object obj4 = linkedHashMap.get(themeType2);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(themeType2, obj4);
                                }
                                ((List) obj4).add(next2);
                            }
                            k4o a = ThemeType.a();
                            int d = gw00.d(tcc.n(a, 10));
                            if (d < 16) {
                                d = 16;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                            Iterator it6 = a.iterator();
                            while (it6.hasNext()) {
                                Object next3 = it6.next();
                                ThemeType themeType3 = (ThemeType) next3;
                                Collection collection = (List) linkedHashMap.get(themeType3);
                                if (collection == null) {
                                    collection = EmptyList.a;
                                }
                                ct00 ct00Var = td7Var2.a;
                                int i6 = sd7.a[themeType3.ordinal()];
                                if (i6 == i3) {
                                    am2 am2Var3 = ct00Var.a;
                                    String w = gwk0.w(swh0.light_map_style, (Context) am2Var3.a);
                                    Context context = (Context) am2Var3.a;
                                    g = scc.g(w, gwk0.w(swh0.light_ultima_map_style, context), gwk0.w(swh0.pedestrian_light_style, context));
                                } else {
                                    if (i6 != i4) {
                                        w511.b();
                                        return obj3;
                                    }
                                    am2 am2Var4 = ct00Var.a;
                                    String w2 = gwk0.w(swh0.dark_map_style, (Context) am2Var4.a);
                                    Context context2 = (Context) am2Var4.a;
                                    g = scc.g(w2, gwk0.w(swh0.dark_ultima_map_style, context2), gwk0.w(swh0.pedestrian_dark_style, context2));
                                }
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it7 = g.iterator();
                                while (it7.hasNext()) {
                                    js00 js00Var2 = (js00) qv00Var.a(((xnt) wntVar).d((kotlinx.serialization.json.c) ((xnt) wntVar).c((String) it7.next(), kotlinx.serialization.json.c.Companion.serializer()), hs00.Companion.serializer())).orElse(null);
                                    if (js00Var2 != null) {
                                        arrayList5.add(js00Var2);
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it8 = arrayList5.iterator();
                                while (it8.hasNext()) {
                                    Object next4 = it8.next();
                                    js00 js00Var3 = (js00) next4;
                                    Collection collection2 = collection;
                                    Iterator it9 = it6;
                                    if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                                        Iterator it10 = collection2.iterator();
                                        while (it10.hasNext()) {
                                            Iterator it11 = it10;
                                            if (jl40.l(((js00) it10.next()).a, js00Var3.a)) {
                                                break;
                                            }
                                            it10 = it11;
                                        }
                                    }
                                    arrayList6.add(next4);
                                    it6 = it9;
                                }
                                Iterator it12 = it6;
                                ArrayList arrayList7 = new ArrayList(collection);
                                arrayList7.addAll(arrayList6);
                                linkedHashMap2.put(next3, arrayList7);
                                it6 = it12;
                                i3 = 1;
                                obj3 = null;
                                i4 = 2;
                            }
                            Object obj5 = obj3;
                            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.L$0 = obj5;
                            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.L$1 = obj5;
                            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.L$2 = obj5;
                            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.L$3 = obj5;
                            mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(linkedHashMap2, mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1 = new MapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapStylesRepositoryImpl$mapStyleAdmissionFlow$$inlined$map$1$2$1.label;
        int i32 = 1;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
