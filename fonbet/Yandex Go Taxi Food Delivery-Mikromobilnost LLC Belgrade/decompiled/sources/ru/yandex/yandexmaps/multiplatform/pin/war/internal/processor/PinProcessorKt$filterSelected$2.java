package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lqzb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorKt$filterSelected$2", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorKt$filterSelected$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<qzb0> $covered;
    final /* synthetic */ List<mwb0> $selectedIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorKt$filterSelected$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.$selectedIds = list;
        this.$covered = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorKt$filterSelected$2(this.$selectedIds, this.$covered, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorKt$filterSelected$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<mwb0> list = this.$selectedIds;
        List<qzb0> list2 = this.$covered;
        ArrayList arrayList = new ArrayList();
        for (mwb0 mwb0Var : list) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((qzb0) obj2).a, mwb0Var)) {
                    break;
                }
            }
            qzb0 qzb0Var = (qzb0) obj2;
            if (qzb0Var != null) {
                arrayList.add(qzb0Var);
            }
        }
        return arrayList;
    }
}
