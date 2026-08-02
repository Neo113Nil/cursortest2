package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import android.graphics.PointF;
import defpackage.czb0;
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
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lczb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessor$compute$3", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessor$compute$3 extends SuspendLambda implements wls {
    final /* synthetic */ p1c0 $appearance;
    final /* synthetic */ List<czb0> $covered;
    final /* synthetic */ Map<mwb0, PointF> $screenPoints;
    final /* synthetic */ List<czb0> $undefinedImmutable;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessor$compute$3(List list, a aVar, List list2, Map map, p1c0 p1c0Var, Continuation continuation) {
        super(2, continuation);
        this.$undefinedImmutable = list;
        this.this$0 = aVar;
        this.$covered = list2;
        this.$screenPoints = map;
        this.$appearance = p1c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessor$compute$3(this.$undefinedImmutable, this.this$0, this.$covered, this.$screenPoints, this.$appearance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessor$compute$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        a aVar = this.this$0;
        Map<mwb0, PointF> map = this.$screenPoints;
        p1c0 p1c0Var = this.$appearance;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.j((czb0) it2.next(), l, map, p1c0Var);
        }
        return arrayList;
    }
}
