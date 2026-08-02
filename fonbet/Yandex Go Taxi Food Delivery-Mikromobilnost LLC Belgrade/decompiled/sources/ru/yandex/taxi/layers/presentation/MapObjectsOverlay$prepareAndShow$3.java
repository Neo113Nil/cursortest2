package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import defpackage.bn00;
import defpackage.dn00;
import defpackage.e2r;
import defpackage.evu0;
import defpackage.f4c0;
import defpackage.lcv;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pp60;
import defpackage.qz10;
import defpackage.s5r;
import defpackage.sd90;
import defpackage.sl6;
import defpackage.tse;
import defpackage.uyo0;
import defpackage.v35;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$prepareAndShow$3", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$prepareAndShow$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $intersectionsEnabled;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$prepareAndShow$3(f fVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$intersectionsEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$prepareAndShow$3(this.this$0, this.$intersectionsEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapObjectsOverlay$prepareAndShow$3 mapObjectsOverlay$prepareAndShow$3 = (MapObjectsOverlay$prepareAndShow$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$prepareAndShow$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EmptyList emptyList;
        List list;
        String i;
        ?? r3;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        EmptyList emptyList2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        Map map = fVar.N;
        Map map2 = fVar.J;
        d dVar = fVar.d0;
        boolean z = this.$intersectionsEnabled;
        Iterator it = map2.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            emptyList = EmptyList.a;
            if (!hasNext) {
                break;
            }
            ((bn00) ((Map.Entry) it.next()).getValue()).b = emptyList;
        }
        if (!map.values().isEmpty()) {
            Collection values = map.values();
            Iterator it2 = values.iterator();
            while (it2.hasNext()) {
                dVar.invoke((lm00) it2.next());
            }
            e2r c = dn00.c(values);
            if (z) {
                uyo0 uyo0Var = new uyo0(29, new qz10(15));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : c) {
                    uyo0Var.invoke(obj2);
                    MapObjectComponentType h = ((v35) ((ym00) obj2)).h();
                    Object obj3 = linkedHashMap.get(h);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(h, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ((bn00) kotlin.collections.b.g(sd90.a((MapObjectComponentType) entry.getKey()), map2)).b = (List) entry.getValue();
                }
                Participant participant = Participant.BUBBLES;
                bn00 bn00Var = (bn00) map2.get(participant);
                if (bn00Var != null) {
                    bn00 bn00Var2 = (bn00) map2.get(participant);
                    if (bn00Var2 == null || (list2 = bn00Var2.b) == null) {
                        r3 = 0;
                    } else {
                        r3 = new ArrayList();
                        for (Object obj4 : list2) {
                            ym00 ym00Var = (ym00) obj4;
                            sl6 sl6Var = ym00Var instanceof sl6 ? (sl6) ym00Var : null;
                            if (sl6Var == null || !sl6Var.l()) {
                                r3.add(obj4);
                            }
                        }
                    }
                    if (r3 == 0) {
                        r3 = emptyList;
                    }
                    bn00Var.b = r3;
                }
                Participant participant2 = Participant.IMAGE_OVERLAYS;
                bn00 bn00Var3 = (bn00) map2.get(participant2);
                if (bn00Var3 != null) {
                    bn00 bn00Var4 = (bn00) map2.get(participant2);
                    if (bn00Var4 != null && (list = bn00Var4.b) != null) {
                        ?? arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            ym00 ym00Var2 = (ym00) obj5;
                            lcv lcvVar = ym00Var2 instanceof lcv ? (lcv) ym00Var2 : null;
                            if (lcvVar == null || (i = lcvVar.i()) == null || !evu0.y(i, ":cluster_preview:", false)) {
                                arrayList.add(obj5);
                            }
                        }
                        emptyList2 = arrayList;
                    }
                    if (emptyList2 != null) {
                        emptyList = emptyList2;
                    }
                    bn00Var3.b = emptyList;
                }
            } else {
                s5r s5rVar = new s5r(c);
                while (s5rVar.hasNext()) {
                    ym00 ym00Var3 = (ym00) s5rVar.next();
                    f4c0 g = ym00Var3.g();
                    Object obj6 = g.d;
                    if (!(obj6 instanceof pp60)) {
                        obj6 = null;
                    }
                    pp60 pp60Var = (pp60) obj6;
                    if (pp60Var == null) {
                        pp60Var = oyr.c(g);
                    }
                    pp60Var.g(ym00Var3);
                }
            }
        }
        return zy11.a;
    }
}
