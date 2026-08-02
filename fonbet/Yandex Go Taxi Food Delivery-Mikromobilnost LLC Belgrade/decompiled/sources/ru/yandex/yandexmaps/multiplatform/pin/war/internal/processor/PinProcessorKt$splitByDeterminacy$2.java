package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.czb0;
import defpackage.g8e;
import defpackage.lzb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Ltse;", "Lkotlin/Pair;", "", "Lczb0;", "", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorKt$splitByDeterminacy$2", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorKt$splitByDeterminacy$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<czb0> $descriptors;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorKt$splitByDeterminacy$2(List list, Continuation continuation) {
        super(2, continuation);
        this.$descriptors = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorKt$splitByDeterminacy$2(this.$descriptors, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorKt$splitByDeterminacy$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList t = g8e.t(obj);
        ArrayList arrayList = new ArrayList();
        for (czb0 czb0Var : this.$descriptors) {
            if (czb0Var.d == null) {
                arrayList.add(czb0Var);
            } else {
                t.add(czb0Var);
            }
        }
        return new Pair(t, kotlin.collections.a.x0(arrayList, new lzb0()));
    }
}
