package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import defpackage.czb0;
import defpackage.jzb0;
import defpackage.k8w0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lczb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorGo$computeSuperPinsOnly$2", f = "PinProcessorGo.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorGo$computeSuperPinsOnly$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<czb0> $defined;
    final /* synthetic */ Map<mwb0, PointF> $screenPoints;
    final /* synthetic */ List<czb0> $undefined;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorGo$computeSuperPinsOnly$2(List list, b bVar, List list2, Map map, Continuation continuation) {
        super(2, continuation);
        this.$undefined = list;
        this.this$0 = bVar;
        this.$defined = list2;
        this.$screenPoints = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorGo$computeSuperPinsOnly$2(this.$undefined, this.this$0, this.$defined, this.$screenPoints, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorGo$computeSuperPinsOnly$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<czb0> list = this.$undefined;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(czb0.a((czb0) it.next(), null, 15));
        }
        LinkedHashMap l = this.this$0.l(this.$defined);
        List x0 = kotlin.collections.a.x0(arrayList, new jzb0());
        b bVar = this.this$0;
        Map<mwb0, PointF> map = this.$screenPoints;
        Iterator it2 = x0.iterator();
        while (it2.hasNext()) {
            bVar.j((czb0) it2.next(), l, map, k8w0.a);
        }
        b bVar2 = this.this$0;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            czb0 czb0Var = (czb0) it3.next();
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
        return arrayList;
    }
}
