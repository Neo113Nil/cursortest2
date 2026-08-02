package ru.yandex.taxi.map.overlay.pickup.intersections;

import defpackage.erx;
import defpackage.f4c0;
import defpackage.lp00;
import defpackage.lyx;
import defpackage.ny61;
import defpackage.ro00;
import defpackage.tdp;
import defpackage.tje;
import defpackage.tse;
import defpackage.wpb0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes6.dex */
public final class b {
    public final lp00 a;
    public final ru.yandex.taxi.favorites.address.api.experiment.a b;
    public final tse c;

    public b(lp00 lp00Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar, tse tseVar) {
        this.a = lp00Var;
        this.b = aVar;
        this.c = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, Set set, Set set2, ContinuationImpl continuationImpl) {
        LayersIntersectionsResolver$isBubbleShouldBeMuted$1 layersIntersectionsResolver$isBubbleShouldBeMuted$1;
        Object obj;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof LayersIntersectionsResolver$isBubbleShouldBeMuted$1) {
            layersIntersectionsResolver$isBubbleShouldBeMuted$1 = (LayersIntersectionsResolver$isBubbleShouldBeMuted$1) continuationImpl;
            int i2 = layersIntersectionsResolver$isBubbleShouldBeMuted$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersIntersectionsResolver$isBubbleShouldBeMuted$1.label = i2 - Integer.MIN_VALUE;
                obj = layersIntersectionsResolver$isBubbleShouldBeMuted$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersIntersectionsResolver$isBubbleShouldBeMuted$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (((ro00) it.next()).b == Participant.CLARIFY_POINT_BUBBLE) {
                            break;
                        }
                    }
                    layersIntersectionsResolver$isBubbleShouldBeMuted$1.L$0 = set;
                    layersIntersectionsResolver$isBubbleShouldBeMuted$1.L$1 = set2;
                    layersIntersectionsResolver$isBubbleShouldBeMuted$1.label = 1;
                    obj = bVar.b(set2, layersIntersectionsResolver$isBubbleShouldBeMuted$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set2 = (Set) layersIntersectionsResolver$isBubbleShouldBeMuted$1.L$1;
                    set = (Set) layersIntersectionsResolver$isBubbleShouldBeMuted$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Iterator it2 = set2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        if (set.contains(((ro00) it2.next()).a)) {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        layersIntersectionsResolver$isBubbleShouldBeMuted$1 = new LayersIntersectionsResolver$isBubbleShouldBeMuted$1(bVar, continuationImpl);
        obj = layersIntersectionsResolver$isBubbleShouldBeMuted$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersIntersectionsResolver$isBubbleShouldBeMuted$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Set set, ContinuationImpl continuationImpl) {
        LayersIntersectionsResolver$hasLayersBubbleIntersection$1 layersIntersectionsResolver$hasLayersBubbleIntersection$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LayersIntersectionsResolver$hasLayersBubbleIntersection$1) {
            layersIntersectionsResolver$hasLayersBubbleIntersection$1 = (LayersIntersectionsResolver$hasLayersBubbleIntersection$1) continuationImpl;
            int i2 = layersIntersectionsResolver$hasLayersBubbleIntersection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersIntersectionsResolver$hasLayersBubbleIntersection$1.label = i2 - Integer.MIN_VALUE;
                obj = layersIntersectionsResolver$hasLayersBubbleIntersection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersIntersectionsResolver$hasLayersBubbleIntersection$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    layersIntersectionsResolver$hasLayersBubbleIntersection$1.L$0 = set;
                    layersIntersectionsResolver$hasLayersBubbleIntersection$1.label = 1;
                    obj = this.b.a.b(layersIntersectionsResolver$hasLayersBubbleIntersection$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) layersIntersectionsResolver$hasLayersBubbleIntersection$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((tdp) obj).b) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            if (((ro00) it.next()).b == Participant.BUBBLES) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        layersIntersectionsResolver$hasLayersBubbleIntersection$1 = new LayersIntersectionsResolver$hasLayersBubbleIntersection$1(this, continuationImpl);
        obj = layersIntersectionsResolver$hasLayersBubbleIntersection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersIntersectionsResolver$hasLayersBubbleIntersection$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((tdp) obj).b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(HashMap hashMap, erx erxVar) {
        Iterator it;
        boolean z;
        int i;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            wpb0 wpb0Var = (wpb0) entry.getKey();
            if (((Boolean) ((ru.yandex.taxi.map.overlay.pickup.a) entry.getValue()).h.o.getValue()).booleanValue()) {
                linkedHashSet.add(wpb0Var.a);
            }
        }
        for (Iterator it2 = hashMap.entrySet().iterator(); it2.hasNext(); it2 = it) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            wpb0 wpb0Var2 = (wpb0) entry2.getKey();
            ru.yandex.taxi.map.overlay.pickup.a aVar = (ru.yandex.taxi.map.overlay.pickup.a) entry2.getValue();
            String str = wpb0Var2.a;
            boolean z3 = wpb0Var2.l;
            Participant participant = Participant.PICKUP_POINT_DOTS_COLLECTION;
            ru.yandex.taxi.map_common.map.intersection.a aVar2 = (ru.yandex.taxi.map_common.map.intersection.a) this.a;
            Set g = aVar2.g(str, participant);
            Set g2 = aVar2.g(str, z3 ? Participant.PICKUP_POINT_LAST_LABEL : Participant.PICKUP_POINT_LABELS_COLLECTION);
            ru.yandex.taxi.layers.presentation.pickup.b bVar = aVar.h;
            f4c0 f4c0Var = aVar.i;
            f4c0 f4c0Var2 = aVar.j;
            if (((Boolean) bVar.o.getValue()).booleanValue()) {
                String str2 = wpb0Var2.a;
                Set g3 = aVar2.g(str2, Participant.PICKUP_POINT_BUBBLES_COLLECTION);
                if (g3.isEmpty()) {
                    r0 r0Var = aVar.h.p;
                    Boolean bool = Boolean.FALSE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                } else {
                    it = it2;
                    i = 3;
                    z = z3;
                    tje.N(this.c, null, null, new LayersIntersectionsResolver$resolveBubbleIntersections$1(this, linkedHashSet, g3, str2, aVar, null), 3);
                    if (!wpb0Var2.m) {
                        boolean isEmpty = aVar2.g(str, Participant.PICKUP_POINT_MULTIEXIT_LABELS_COLLECTION).isEmpty();
                        f4c0 f4c0Var3 = aVar.l;
                        if (isEmpty) {
                            if (f4c0Var3 != null) {
                                aVar.e(f4c0Var3, true);
                            }
                        } else if (f4c0Var3 != null) {
                            aVar.e(f4c0Var3, false);
                        }
                        aVar.e(f4c0Var2, true);
                        aVar.e(f4c0Var, true);
                        aVar.c.q = true;
                    } else if (g2.isEmpty() || !z) {
                        Iterator it3 = g.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((ro00) it3.next()).b == Participant.BODIES) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                z2 = false;
                                break;
                            }
                        }
                        Iterator it4 = g2.iterator();
                        boolean z4 = false;
                        while (it4.hasNext()) {
                            int i2 = lyx.a[((ro00) it4.next()).b.ordinal()];
                            if (i2 == 1 || i2 == 2 || i2 == i || i2 == 4) {
                                z4 = true;
                            }
                        }
                        if (z2) {
                            aVar.e(f4c0Var2, false);
                            aVar.e(f4c0Var, false);
                            aVar.c.q = false;
                            f4c0 f4c0Var4 = aVar.l;
                            if (f4c0Var4 != null) {
                                aVar.e(f4c0Var4, false);
                            }
                        } else if (z4) {
                            aVar.e(f4c0Var2, true);
                            aVar.e(f4c0Var, true);
                            aVar.c.q = true;
                            f4c0 f4c0Var5 = aVar.l;
                            if (f4c0Var5 != null) {
                                aVar.e(f4c0Var5, false);
                            }
                        } else {
                            f4c0 f4c0Var6 = aVar.l;
                            if (f4c0Var6 != null) {
                                aVar.e(f4c0Var6, true);
                            }
                            aVar.e(f4c0Var2, true);
                            aVar.e(f4c0Var, true);
                            aVar.c.q = true;
                        }
                    } else {
                        erxVar.a(hashMap);
                    }
                }
            }
            it = it2;
            z = z3;
            i = 3;
            if (!wpb0Var2.m) {
            }
        }
    }
}
