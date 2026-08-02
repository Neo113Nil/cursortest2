package ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider;

import com.yandex.mapkit.maps.core.utils.SizeInt;
import defpackage.c3c0;
import defpackage.jvb0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.nvb0;
import defpackage.ny61;
import defpackage.ovb0;
import defpackage.pvb0;
import defpackage.scc;
import defpackage.t2k0;
import defpackage.tse;
import defpackage.u1l;
import defpackage.ul91;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Ljvb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinCollider$clash$5", f = "PinCollider.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinCollider$clash$5 extends SuspendLambda implements wls {
    final /* synthetic */ List<jvb0> $icons;
    final /* synthetic */ int $labelOffset;
    final /* synthetic */ List<jvb0> $labelsImmutable;
    final /* synthetic */ SizeInt $mapSize;
    final /* synthetic */ Set<mwb0> $superPinIds;
    int label;
    final /* synthetic */ pvb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCollider$clash$5(List list, pvb0 pvb0Var, SizeInt sizeInt, int i, List list2, Set set, Continuation continuation) {
        super(2, continuation);
        this.$labelsImmutable = list;
        this.this$0 = pvb0Var;
        this.$mapSize = sizeInt;
        this.$labelOffset = i;
        this.$icons = list2;
        this.$superPinIds = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinCollider$clash$5(this.$labelsImmutable, this.this$0, this.$mapSize, this.$labelOffset, this.$icons, this.$superPinIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinCollider$clash$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        c3c0 c3c0Var;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ArrayList e = ul91.e(this.$labelsImmutable);
        pvb0 pvb0Var = this.this$0;
        SizeInt sizeInt = this.$mapSize;
        int i = this.$labelOffset;
        List<jvb0> list = this.$icons;
        Set<mwb0> set = this.$superPinIds;
        pvb0Var.getClass();
        Set<mwb0> set2 = set;
        if (set2 != null && !set2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = e.iterator();
            while (it.hasNext()) {
                Object next3 = it.next();
                if (set.contains(((jvb0) next3).a.a)) {
                    arrayList.add(next3);
                }
            }
            for (jvb0 jvb0Var : kotlin.collections.a.x0(arrayList, new nvb0())) {
                if (jvb0Var.g == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (c3c0 c3c0Var2 : jvb0Var.h.d(jvb0Var.a.a)) {
                        float m = ul91.m(jvb0Var, c3c0Var2, pvb0Var.h);
                        if (m >= 0.1f) {
                            linkedHashMap.put(c3c0Var2, Float.valueOf(m));
                        }
                    }
                    Iterator it2 = kotlin.collections.a.x0(linkedHashMap.entrySet(), new ovb0()).iterator();
                    while (it2.hasNext()) {
                        c3c0 c3c0Var3 = (c3c0) ((Map.Entry) it2.next()).getKey();
                        PinCollider$PlacedLabel pinCollider$PlacedLabel = PinCollider$PlacedLabel.LABEL_M;
                        if (!ul91.j(jvb0Var, pinCollider$PlacedLabel, c3c0Var3, e, i)) {
                            jvb0Var.g = c3c0Var3;
                            jvb0Var.f = pinCollider$PlacedLabel;
                        }
                    }
                    if (jvb0Var.g == null) {
                        Iterator it3 = linkedHashMap.entrySet().iterator();
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (it3.hasNext()) {
                                float floatValue = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                                do {
                                    Object next4 = it3.next();
                                    float floatValue2 = ((Number) ((Map.Entry) next4).getValue()).floatValue();
                                    if (Float.compare(floatValue, floatValue2) < 0) {
                                        next2 = next4;
                                        floatValue = floatValue2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        Map.Entry entry = (Map.Entry) next2;
                        if (entry != null) {
                            jvb0Var.g = (c3c0) entry.getKey();
                            jvb0Var.f = PinCollider$PlacedLabel.LABEL_M;
                        }
                    }
                } else {
                    jvb0Var.f = PinCollider$PlacedLabel.LABEL_M;
                }
            }
        }
        pvb0Var.c(e, list, set);
        pvb0Var.b(e, list, set);
        Iterator it4 = e.iterator();
        int i2 = 0;
        while (it4.hasNext()) {
            Object next5 = it4.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            jvb0 jvb0Var2 = (jvb0) next5;
            if (jvb0Var2.f == PinCollider$PlacedLabel.LABEL_S) {
                List<jvb0> subList = e.subList(i3, e.size());
                if (!(subList instanceof Collection) || !subList.isEmpty()) {
                    for (jvb0 jvb0Var3 : subList) {
                        PinCollider$PlacedLabel pinCollider$PlacedLabel2 = jvb0Var3.f;
                        PinCollider$PlacedLabel pinCollider$PlacedLabel3 = PinCollider$PlacedLabel.LABEL_S;
                        if (pinCollider$PlacedLabel2 == pinCollider$PlacedLabel3 && ul91.g(jvb0Var2, pinCollider$PlacedLabel3, jvb0Var3)) {
                            break;
                        }
                    }
                }
                if (!ul91.i(jvb0Var2, PinCollider$PlacedLabel.LABEL_S, jvb0Var2.g, list)) {
                }
                jvb0Var2.f = PinCollider$PlacedLabel.NONE;
            }
            i2 = i3;
        }
        Iterator it5 = new u1l(2, e).iterator();
        while (true) {
            ListIterator listIterator = ((t2k0) it5).a;
            if (!listIterator.hasPrevious()) {
                break;
            }
            jvb0 jvb0Var4 = (jvb0) listIterator.previous();
            if (jvb0Var4.f == PinCollider$PlacedLabel.NONE && (c3c0Var = jvb0Var4.g) != null) {
                PinCollider$PlacedLabel pinCollider$PlacedLabel4 = PinCollider$PlacedLabel.LABEL_S;
                if (!ul91.j(jvb0Var4, pinCollider$PlacedLabel4, c3c0Var, e, i) && !ul91.i(jvb0Var4, pinCollider$PlacedLabel4, jvb0Var4.g, list)) {
                    jvb0Var4.f = pinCollider$PlacedLabel4;
                }
            }
        }
        Iterator it6 = new u1l(2, e).iterator();
        while (true) {
            ListIterator listIterator2 = ((t2k0) it6).a;
            if (!listIterator2.hasPrevious()) {
                break;
            }
            jvb0 jvb0Var5 = (jvb0) listIterator2.previous();
            if (jvb0Var5.f == PinCollider$PlacedLabel.NONE && jvb0Var5.g == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it7 = jvb0Var5.h.d(jvb0Var5.a.a).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        c3c0 c3c0Var4 = (c3c0) it7.next();
                        PinCollider$PlacedLabel pinCollider$PlacedLabel5 = PinCollider$PlacedLabel.LABEL_S;
                        if (!ul91.j(jvb0Var5, pinCollider$PlacedLabel5, c3c0Var4, e, i) && !ul91.i(jvb0Var5, pinCollider$PlacedLabel5, c3c0Var4, list)) {
                            float m2 = ul91.m(jvb0Var5, c3c0Var4, sizeInt);
                            if (m2 > 0.8f) {
                                jvb0Var5.g = c3c0Var4;
                                jvb0Var5.f = pinCollider$PlacedLabel5;
                                break;
                            }
                            if (m2 >= 0.1f) {
                                linkedHashMap2.put(c3c0Var4, Float.valueOf(m2));
                            }
                        }
                    } else {
                        Iterator it8 = linkedHashMap2.entrySet().iterator();
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (it8.hasNext()) {
                                float floatValue3 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                                do {
                                    Object next6 = it8.next();
                                    float floatValue4 = ((Number) ((Map.Entry) next6).getValue()).floatValue();
                                    if (Float.compare(floatValue3, floatValue4) < 0) {
                                        next = next6;
                                        floatValue3 = floatValue4;
                                    }
                                } while (it8.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Map.Entry entry2 = (Map.Entry) next;
                        if (entry2 != null) {
                            jvb0Var5.g = (c3c0) entry2.getKey();
                            jvb0Var5.f = PinCollider$PlacedLabel.LABEL_S;
                        }
                    }
                }
            }
        }
        Iterator it9 = new u1l(2, e).iterator();
        while (true) {
            ListIterator listIterator3 = ((t2k0) it9).a;
            if (!listIterator3.hasPrevious()) {
                return e;
            }
            jvb0 jvb0Var6 = (jvb0) listIterator3.previous();
            if (jvb0Var6.f == PinCollider$PlacedLabel.LABEL_S && jvb0Var6.d) {
                PinCollider$PlacedLabel pinCollider$PlacedLabel6 = PinCollider$PlacedLabel.LABEL_M;
                if (!ul91.j(jvb0Var6, pinCollider$PlacedLabel6, jvb0Var6.g, e, i) && !ul91.i(jvb0Var6, pinCollider$PlacedLabel6, jvb0Var6.g, list)) {
                    jvb0Var6.f = pinCollider$PlacedLabel6;
                }
            }
        }
    }
}
