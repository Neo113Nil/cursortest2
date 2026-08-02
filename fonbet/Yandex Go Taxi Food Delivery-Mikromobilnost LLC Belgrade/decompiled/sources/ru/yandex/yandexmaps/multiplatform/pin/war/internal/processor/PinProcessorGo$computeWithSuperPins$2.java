package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import defpackage.czb0;
import defpackage.k8w0;
import defpackage.kzb0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.p1c0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lczb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorGo$computeWithSuperPins$2", f = "PinProcessorGo.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorGo$computeWithSuperPins$2 extends SuspendLambda implements wls {
    final /* synthetic */ p1c0 $appearance;
    final /* synthetic */ List<czb0> $covered;
    final /* synthetic */ Map<mwb0, PointF> $screenPoints;
    final /* synthetic */ Set<mwb0> $superPinIds;
    final /* synthetic */ List<czb0> $undefinedImmutable;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorGo$computeWithSuperPins$2(List list, b bVar, List list2, Set set, Map map, p1c0 p1c0Var, Continuation continuation) {
        super(2, continuation);
        this.$undefinedImmutable = list;
        this.this$0 = bVar;
        this.$covered = list2;
        this.$superPinIds = set;
        this.$screenPoints = map;
        this.$appearance = p1c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorGo$computeWithSuperPins$2(this.$undefinedImmutable, this.this$0, this.$covered, this.$superPinIds, this.$screenPoints, this.$appearance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorGo$computeWithSuperPins$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<mwb0> set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<czb0> list = this.$undefinedImmutable;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(czb0.a((czb0) it.next(), null, 15));
        }
        LinkedHashMap l = this.this$0.l(this.$covered);
        Set<mwb0> set2 = this.$superPinIds;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (set2.contains(((czb0) next).a.a)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        LinkedHashMap l2 = this.this$0.l(list2);
        List<czb0> list4 = list2;
        List x0 = kotlin.collections.a.x0(list4, new kzb0());
        b bVar = this.this$0;
        Map<mwb0, PointF> map = this.$screenPoints;
        Iterator it3 = x0.iterator();
        while (it3.hasNext()) {
            bVar.j((czb0) it3.next(), l2, map, k8w0.a);
        }
        b bVar2 = this.this$0;
        for (czb0 czb0Var : list4) {
            bVar2.getClass();
            PinState pinState = czb0Var.d;
            if (pinState == null) {
                pinState = PinState.INVISIBLE;
            }
            PinState pinState2 = PinState.DUST;
            if (pinState.compareTo(pinState2) < 0) {
                czb0Var.d = pinState2;
            }
        }
        this.this$0.getClass();
        for (PinState pinState3 : l2.keySet()) {
            if (pinState3 != PinState.INVISIBLE && (set = (Set) l2.get(pinState3)) != null) {
                for (mwb0 mwb0Var : set) {
                    Object obj2 = l.get(pinState3);
                    if (obj2 == null) {
                        obj2 = new LinkedHashSet();
                        l.put(pinState3, obj2);
                    }
                    ((Set) obj2).add(mwb0Var);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list3) {
            if (((czb0) obj3).b.compareTo(PinState.DUST) > 0) {
                arrayList4.add(obj3);
            } else {
                arrayList5.add(obj3);
            }
        }
        Pair pair2 = new Pair(arrayList4, arrayList5);
        List list5 = (List) pair2.getFirst();
        List list6 = (List) pair2.getSecond();
        b bVar3 = this.this$0;
        Map<mwb0, PointF> map2 = this.$screenPoints;
        p1c0 p1c0Var = this.$appearance;
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            bVar3.j((czb0) it4.next(), l, map2, p1c0Var);
        }
        b bVar4 = this.this$0;
        Map<mwb0, PointF> map3 = this.$screenPoints;
        p1c0 p1c0Var2 = this.$appearance;
        Iterator it5 = list6.iterator();
        while (it5.hasNext()) {
            bVar4.j((czb0) it5.next(), l, map3, p1c0Var2);
        }
        return arrayList;
    }
}
