package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ate0;
import defpackage.d7;
import defpackage.dn00;
import defpackage.dsg;
import defpackage.e2r;
import defpackage.f4c0;
import defpackage.fx31;
import defpackage.g6u;
import defpackage.gx31;
import defpackage.h73;
import defpackage.if61;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.jqx;
import defpackage.jse;
import defpackage.lcv;
import defpackage.lm00;
import defpackage.lp00;
import defpackage.lz2;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.p0u;
import defpackage.pp60;
import defpackage.r76;
import defpackage.ro00;
import defpackage.s5r;
import defpackage.sd90;
import defpackage.sl6;
import defpackage.t5r;
import defpackage.tje;
import defpackage.tls;
import defpackage.v35;
import defpackage.w511;
import defpackage.wls;
import defpackage.wp31;
import defpackage.xm00;
import defpackage.ym00;
import defpackage.ym91;
import defpackage.yw01;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.model.BubbleType;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes9.dex */
public abstract class a {
    public static final lm00 a(Map map, float f, zzs zzsVar) {
        Object next;
        s5r s5rVar = new s5r(kotlin.sequences.b.g(new yw01(iw00.w(map), new dsg(29)), new p0u(0)));
        if (s5rVar.hasNext()) {
            next = s5rVar.next();
            if (s5rVar.hasNext()) {
                float j = ru.yandex.taxi.map.utils.a.j(((lm00) next).b, zzsVar);
                do {
                    Object next2 = s5rVar.next();
                    float j2 = ru.yandex.taxi.map.utils.a.j(((lm00) next2).b, zzsVar);
                    if (Float.compare(j, j2) > 0) {
                        next = next2;
                        j = j2;
                    }
                } while (s5rVar.hasNext());
            }
        } else {
            next = null;
        }
        lm00 lm00Var = (lm00) next;
        if (lm00Var == null || ru.yandex.taxi.map.utils.a.j(lm00Var.b, zzsVar) >= (((float) Math.pow(21.0f - f, 1.2000000476837158d)) * 6.0d) + 6.0d) {
            return null;
        }
        return lm00Var;
    }

    public static final void b(float f, Float f2, lm00 lm00Var, ym00 ym00Var, xm00 xm00Var) {
        Animation animation = dn00.a;
        if (ym00Var.g().b && ym00Var.g().f == null) {
            f4c0 g = ym00Var.g();
            xm00Var.getClass();
            g.b(xm00Var);
            lz2 a = dn00.a(f, ym00Var, lm00Var.d.e());
            if (!lm00Var.g && f2 != null) {
                lz2.a(a, f2.floatValue());
            }
            ym91.f(ym00Var.g(), a, lm00Var.g, null);
        }
    }

    public static final boolean c(int i, Map map, Map map2) {
        Integer c = sd90.c(map2, Participant.LABELS, map);
        boolean z = c != null && c.intValue() > i;
        Integer c2 = sd90.c(map2, Participant.BUBBLES, map);
        return z || (c2 != null && c2.intValue() > i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Map map, CameraPosition cameraPosition, jse jseVar, g6u g6uVar, ContinuationImpl continuationImpl) {
        GravityConvinienciesKt$resolveGravityWhileGesture$1 gravityConvinienciesKt$resolveGravityWhileGesture$1;
        int i;
        d7 d7Var;
        lm00 lm00Var;
        lm00 lm00Var2;
        if (continuationImpl instanceof GravityConvinienciesKt$resolveGravityWhileGesture$1) {
            gravityConvinienciesKt$resolveGravityWhileGesture$1 = (GravityConvinienciesKt$resolveGravityWhileGesture$1) continuationImpl;
            int i2 = gravityConvinienciesKt$resolveGravityWhileGesture$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gravityConvinienciesKt$resolveGravityWhileGesture$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gravityConvinienciesKt$resolveGravityWhileGesture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gravityConvinienciesKt$resolveGravityWhileGesture$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GravityConvinienciesKt$resolveGravityWhileGesture$2 gravityConvinienciesKt$resolveGravityWhileGesture$2 = new GravityConvinienciesKt$resolveGravityWhileGesture$2(map, cameraPosition, null);
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$0 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$1 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$2 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$3 = g6uVar;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.label = 1;
                    obj = tje.k0(jseVar, gravityConvinienciesKt$resolveGravityWhileGesture$2, gravityConvinienciesKt$resolveGravityWhileGesture$1);
                    d7Var = g6uVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    d7 d7Var2 = (jse) gravityConvinienciesKt$resolveGravityWhileGesture$1.L$3;
                    kotlin.b.b(obj);
                    d7Var = d7Var2;
                }
                Pair pair = (Pair) obj;
                lm00Var = (lm00) pair.getFirst();
                lm00Var2 = (lm00) pair.getSecond();
                if (!jl40.l(lm00Var == null ? lm00Var.a : null, lm00Var2 == null ? lm00Var2.a : null)) {
                    GravityConvinienciesKt$resolveGravityWhileGesture$3 gravityConvinienciesKt$resolveGravityWhileGesture$3 = new GravityConvinienciesKt$resolveGravityWhileGesture$3(lm00Var2, lm00Var, null);
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$0 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$1 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$2 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$3 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$4 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.L$5 = null;
                    gravityConvinienciesKt$resolveGravityWhileGesture$1.label = 2;
                    if (tje.k0(d7Var, gravityConvinienciesKt$resolveGravityWhileGesture$3, gravityConvinienciesKt$resolveGravityWhileGesture$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        gravityConvinienciesKt$resolveGravityWhileGesture$1 = new GravityConvinienciesKt$resolveGravityWhileGesture$1(continuationImpl);
        Object obj2 = gravityConvinienciesKt$resolveGravityWhileGesture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gravityConvinienciesKt$resolveGravityWhileGesture$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        lm00Var = (lm00) pair2.getFirst();
        lm00Var2 = (lm00) pair2.getSecond();
        if (!jl40.l(lm00Var == null ? lm00Var.a : null, lm00Var2 == null ? lm00Var2.a : null)) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0231, code lost:
    
        if (c(r0, r21, r24) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0260, code lost:
    
        if (c(r0, r21, r24) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x02ca, code lost:
    
        if (r7 != false) goto L160;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(if61 if61Var, float f, lm00 lm00Var, BoundingBox boundingBox, ym00 ym00Var, Map map, Map map2, boolean z, Map map3, boolean z2) {
        Object obj;
        boolean z3;
        Object obj2;
        Object obj3;
        String str = lm00Var.a;
        wp31 wp31Var = lm00Var.d;
        Set set = lm00Var.f;
        boolean z4 = false;
        if (str.equals("selected_organizations_pin") && !(ym00Var instanceof jqx)) {
            dn00.e(ym00Var, false);
            return;
        }
        if (lm00Var.g && (!(ym00Var instanceof sl6) || ((sl6) ym00Var).j() == BubbleType.PLAIN_TEXT)) {
            dn00.e(ym00Var, false);
            return;
        }
        if (!ru.yandex.taxi.layers.source.factory.a.d(if61Var == null ? ym00Var.c() : if61Var, f)) {
            dn00.e(ym00Var, true);
            return;
        }
        if (!ru.yandex.taxi.map.utils.a.t(boundingBox, (Point) ym00Var.g().m())) {
            dn00.e(ym00Var, true);
            return;
        }
        Object obj4 = null;
        if (map3.isEmpty() && ((ym00Var instanceof r76) || (ym00Var instanceof lcv))) {
            lz2 a = dn00.a(f, ym00Var, wp31Var.e());
            f4c0 g = ym00Var.g();
            Object obj5 = g.d;
            if (!(obj5 instanceof pp60)) {
                obj5 = null;
            }
            pp60 pp60Var = (pp60) obj5;
            if (pp60Var == null) {
                pp60Var = oyr.c(g);
            }
            if (a.b() != pp60Var.b()) {
                ym91.f(ym00Var.g(), a, lm00Var.g, null);
            }
        }
        if (!z) {
            dn00.e(ym00Var, false);
            return;
        }
        if ((ym00Var instanceof sl6) && ((sl6) ym00Var).i() == Bubble$BubbleKind.ADVERT) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (((ym00) obj3) instanceof r76) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            ym00 ym00Var2 = (ym00) obj3;
            if (ym00Var2 == null) {
                return;
            }
            Animation animation = dn00.a;
            if (!ym00Var2.g().b) {
                dn00.e(ym00Var, true);
                return;
            }
        }
        if (ym00Var instanceof lcv) {
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((ym00) obj2) instanceof r76) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (((ym00) obj2) == null) {
                return;
            }
            Animation animation2 = dn00.a;
            dn00.e(ym00Var, !r10.g().b);
        }
        int f2 = wp31Var.f();
        v35 v35Var = (v35) ym00Var;
        int i = fx31.a[v35Var.h().ordinal()];
        if (i == 1) {
            if (!map3.containsKey(Participant.SOURCE_POINT_PIN) && !map3.containsKey(Participant.CAR_ICON)) {
                boolean z5 = lm00Var.c == MapObjectType.ADVERT;
                Iterable<ro00> iterable = (List) map3.get(Participant.BODIES);
                if (iterable == null) {
                    iterable = EmptyList.a;
                }
                boolean z6 = false;
                for (ro00 ro00Var : iterable) {
                    lm00 lm00Var2 = (lm00) map.get(ro00Var.b());
                    if (lm00Var2 != null && lm00Var2.d.f() > f2) {
                        if (z5) {
                            String b = ro00Var.b();
                            Object obj6 = map2.get(b);
                            if (obj6 == null) {
                                obj6 = ConcurrentHashMap.newKeySet();
                                map2.put(b, obj6);
                            }
                            ((Set) obj6).add(str);
                        }
                        z6 = true;
                    }
                }
            }
            z4 = true;
        } else if (i == 2) {
            if (!map3.containsKey(Participant.DESTINATION_POINT_PIN)) {
                if (!str.equals("selected_organizations_pin")) {
                    if (!map3.containsKey(Participant.BODIES)) {
                        if (!map3.containsKey(Participant.SOURCE_POINT_PIN)) {
                            if (!map3.containsKey(Participant.CAR_ICON)) {
                            }
                        }
                    }
                }
            }
            z4 = true;
        } else if (i == 3) {
            sl6 sl6Var = v35Var instanceof sl6 ? (sl6) v35Var : null;
            if (sl6Var == null || !sl6Var.l()) {
                boolean z7 = z2 && map3.containsKey(Participant.PICKUP_POINT_LAST_LABEL);
                List list = (List) map3.get(Participant.BODIES);
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            lm00 lm00Var3 = (lm00) map.get(((ro00) it3.next()).b());
                            if (lm00Var3 != null) {
                                Iterator it4 = lm00Var3.f.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj = it4.next();
                                        if (((ym00) obj) instanceof r76) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                r76 r76Var = obj instanceof r76 ? (r76) obj : null;
                                if (r76Var != null) {
                                    Animation animation3 = dn00.a;
                                    if (r76Var.g().b) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (!map3.containsKey(Participant.PIN)) {
                    if (!map3.containsKey(Participant.CAR_ICON)) {
                        if (!map3.containsKey(Participant.SOURCE_POINT_PIN)) {
                            if (!map3.containsKey(Participant.DESTINATION_POINT_PIN)) {
                                if (!z7) {
                                }
                            }
                        }
                    }
                }
            } else {
                Iterator it5 = set.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (((ym00) next) instanceof r76) {
                        obj4 = next;
                        break;
                    }
                }
                ym00 ym00Var3 = (ym00) obj4;
                if (ym00Var3 != null) {
                    Animation animation4 = dn00.a;
                    z3 = ym00Var3.g().b;
                    z4 = !z3;
                }
            }
            z4 = true;
        } else {
            if (i != 4 && i != 5) {
                w511.b();
                return;
            }
            Iterator it6 = set.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next2 = it6.next();
                if (((ym00) next2) instanceof r76) {
                    obj4 = next2;
                    break;
                }
            }
            ym00 ym00Var4 = (ym00) obj4;
            if (ym00Var4 != null) {
                Animation animation5 = dn00.a;
                z3 = ym00Var4.g().b;
                z4 = !z3;
            }
            z4 = true;
        }
        dn00.e(v35Var, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x01ea -> B:10:0x01ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Map map, tls tlsVar, float f, tls tlsVar2, BoundingBox boundingBox, jse jseVar, boolean z, xm00 xm00Var, wls wlsVar, lp00 lp00Var, Map map2, boolean z2, ContinuationImpl continuationImpl) {
        VisibilityConvenienciesKt$resolveVisibility$1 visibilityConvenienciesKt$resolveVisibility$1;
        int i;
        Object obj;
        Map map3;
        BoundingBox boundingBox2;
        boolean z3;
        tls tlsVar3;
        float f2;
        xm00 xm00Var2;
        wls wlsVar2;
        tls tlsVar4;
        boolean z4;
        Map map4;
        Iterator it;
        jse jseVar2;
        if (continuationImpl instanceof VisibilityConvenienciesKt$resolveVisibility$1) {
            visibilityConvenienciesKt$resolveVisibility$1 = (VisibilityConvenienciesKt$resolveVisibility$1) continuationImpl;
            int i2 = visibilityConvenienciesKt$resolveVisibility$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                visibilityConvenienciesKt$resolveVisibility$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = visibilityConvenienciesKt$resolveVisibility$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = visibilityConvenienciesKt$resolveVisibility$1.label;
                if (i != 0) {
                    obj = null;
                    kotlin.b.b(obj2);
                    if (!z) {
                        s5r s5rVar = new s5r(dn00.c(map.values()));
                        while (s5rVar.hasNext()) {
                            ym00 ym00Var = (ym00) s5rVar.next();
                            lm00 lm00Var = (lm00) kotlin.collections.b.g(ym00Var.e(), map);
                            ym91.b(ym00Var.g(), wlsVar);
                            e((if61) tlsVar.invoke(lm00Var.c), f, lm00Var, boundingBox, ym00Var, map, map2, false, kotlin.collections.b.f(), z2);
                            b(f, (Float) tlsVar2.invoke(lm00Var.c), lm00Var, ym00Var, xm00Var);
                        }
                        return zy11.a;
                    }
                    e2r c = dn00.c(map.values());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    s5r s5rVar2 = new s5r(c);
                    while (s5rVar2.hasNext()) {
                        ym00 ym00Var2 = (ym00) s5rVar2.next();
                        t5r g = kotlin.sequences.b.g(new h73(1, ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).g(ym00Var2.e(), sd90.a(((v35) ym00Var2).h()))), new ate0(29, ym00Var2));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        s5r s5rVar3 = new s5r(g);
                        while (s5rVar3.hasNext()) {
                            Object next = s5rVar3.next();
                            Participant c2 = ((ro00) next).c();
                            Object obj3 = linkedHashMap2.get(c2);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap2.put(c2, obj3);
                            }
                            ((List) obj3).add(next);
                        }
                        linkedHashMap.put(ym00Var2, linkedHashMap2);
                    }
                    Iterator it2 = kotlin.collections.a.x0(iw00.x(linkedHashMap), new gx31()).iterator();
                    map3 = map;
                    boundingBox2 = boundingBox;
                    z3 = z2;
                    tlsVar3 = tlsVar2;
                    f2 = f;
                    xm00Var2 = xm00Var;
                    wlsVar2 = wlsVar;
                    tlsVar4 = tlsVar;
                    z4 = z;
                    map4 = map2;
                    it = it2;
                    jseVar2 = jseVar;
                    if (it.hasNext()) {
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = visibilityConvenienciesKt$resolveVisibility$1.Z$1;
                boolean z6 = visibilityConvenienciesKt$resolveVisibility$1.Z$0;
                float f3 = visibilityConvenienciesKt$resolveVisibility$1.F$0;
                Iterator it3 = (Iterator) visibilityConvenienciesKt$resolveVisibility$1.L$11;
                Map map5 = (Map) visibilityConvenienciesKt$resolveVisibility$1.L$8;
                wls wlsVar3 = (wls) visibilityConvenienciesKt$resolveVisibility$1.L$6;
                xm00 xm00Var3 = (xm00) visibilityConvenienciesKt$resolveVisibility$1.L$5;
                jse jseVar3 = (jse) visibilityConvenienciesKt$resolveVisibility$1.L$4;
                BoundingBox boundingBox3 = (BoundingBox) visibilityConvenienciesKt$resolveVisibility$1.L$3;
                tls tlsVar5 = (tls) visibilityConvenienciesKt$resolveVisibility$1.L$2;
                tls tlsVar6 = (tls) visibilityConvenienciesKt$resolveVisibility$1.L$1;
                Map map6 = (Map) visibilityConvenienciesKt$resolveVisibility$1.L$0;
                kotlin.b.b(obj2);
                xm00Var2 = xm00Var3;
                jseVar2 = jseVar3;
                boundingBox2 = boundingBox3;
                tlsVar3 = tlsVar5;
                z4 = z6;
                map4 = map5;
                tlsVar4 = tlsVar6;
                z3 = z5;
                map3 = map6;
                it = it3;
                wlsVar2 = wlsVar3;
                f2 = f3;
                obj = null;
                if (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    VisibilityConvenienciesKt$resolveVisibility$4$1 visibilityConvenienciesKt$resolveVisibility$4$1 = new VisibilityConvenienciesKt$resolveVisibility$4$1(map3, (ym00) pair.getFirst(), wlsVar2, tlsVar4, f2, boundingBox2, map4, z4, (Map) pair.getSecond(), z3, tlsVar3, xm00Var2, null);
                    tls tlsVar7 = tlsVar3;
                    xm00 xm00Var4 = xm00Var2;
                    visibilityConvenienciesKt$resolveVisibility$1.L$0 = map3;
                    visibilityConvenienciesKt$resolveVisibility$1.L$1 = tlsVar4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$2 = tlsVar7;
                    visibilityConvenienciesKt$resolveVisibility$1.L$3 = boundingBox2;
                    visibilityConvenienciesKt$resolveVisibility$1.L$4 = jseVar2;
                    visibilityConvenienciesKt$resolveVisibility$1.L$5 = xm00Var4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$6 = wlsVar2;
                    Object obj4 = obj;
                    visibilityConvenienciesKt$resolveVisibility$1.L$7 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$8 = map4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$9 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$10 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$11 = it;
                    visibilityConvenienciesKt$resolveVisibility$1.L$12 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$13 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.L$14 = obj4;
                    visibilityConvenienciesKt$resolveVisibility$1.F$0 = f2;
                    visibilityConvenienciesKt$resolveVisibility$1.Z$0 = z4;
                    visibilityConvenienciesKt$resolveVisibility$1.Z$1 = z3;
                    visibilityConvenienciesKt$resolveVisibility$1.label = 1;
                    if (tje.k0(jseVar2, visibilityConvenienciesKt$resolveVisibility$4$1, visibilityConvenienciesKt$resolveVisibility$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tlsVar3 = tlsVar7;
                    xm00Var2 = xm00Var4;
                    obj = null;
                    if (it.hasNext()) {
                    }
                }
                return zy11.a;
            }
        }
        visibilityConvenienciesKt$resolveVisibility$1 = new VisibilityConvenienciesKt$resolveVisibility$1(continuationImpl);
        Object obj22 = visibilityConvenienciesKt$resolveVisibility$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = visibilityConvenienciesKt$resolveVisibility$1.label;
        if (i != 0) {
        }
    }
}
