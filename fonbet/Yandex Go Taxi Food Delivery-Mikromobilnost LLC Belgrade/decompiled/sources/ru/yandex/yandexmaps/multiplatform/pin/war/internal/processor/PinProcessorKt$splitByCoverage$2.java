package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.g8e;
import defpackage.j2c0;
import defpackage.mvg;
import defpackage.mwb0;
import defpackage.ny61;
import defpackage.qzb0;
import defpackage.tse;
import defpackage.w2t;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltse;", "Lkotlin/Pair;", "", "Lqzb0;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorKt$splitByCoverage$2", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorKt$splitByCoverage$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<qzb0> $all;
    final /* synthetic */ List<mwb0> $removedIds;
    final /* synthetic */ j2c0 $scanRegion;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorKt$splitByCoverage$2(List list, List list2, j2c0 j2c0Var, Continuation continuation) {
        super(2, continuation);
        this.$removedIds = list;
        this.$all = list2;
        this.$scanRegion = j2c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorKt$splitByCoverage$2(this.$removedIds, this.$all, this.$scanRegion, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorKt$splitByCoverage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        Set M0 = kotlin.collections.a.M0(this.$removedIds);
        List<qzb0> list = this.$all;
        j2c0 j2c0Var = this.$scanRegion;
        for (qzb0 qzb0Var : list) {
            if (!M0.isEmpty() && M0.contains(qzb0Var.a)) {
                M0.remove(qzb0Var.a);
            } else if (w2t.a(j2c0Var, qzb0Var.c)) {
                t.add(qzb0Var);
            } else {
                arrayList.add(qzb0Var);
            }
        }
        return new Pair(t, arrayList);
    }
}
