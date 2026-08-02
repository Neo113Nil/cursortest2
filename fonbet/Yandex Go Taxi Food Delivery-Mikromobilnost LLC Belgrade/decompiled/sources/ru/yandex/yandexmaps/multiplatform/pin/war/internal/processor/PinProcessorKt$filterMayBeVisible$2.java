package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.czb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltse;", "", "Lqzb0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorKt$filterMayBeVisible$2", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorKt$filterMayBeVisible$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<czb0> $descriptors;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorKt$filterMayBeVisible$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$descriptors = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorKt$filterMayBeVisible$2(this.$descriptors, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorKt$filterMayBeVisible$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<czb0> list = this.$descriptors;
        ArrayList arrayList = new ArrayList();
        for (czb0 czb0Var : list) {
            qzb0 qzb0Var = czb0Var.a;
            if (czb0Var.c.compareTo(PinState.INVISIBLE) <= 0) {
                qzb0Var = null;
            }
            if (qzb0Var != null) {
                arrayList.add(qzb0Var);
            }
        }
        return arrayList;
    }
}
