package ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor;

import defpackage.czb0;
import defpackage.fzb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.om91;
import defpackage.qzb0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lfzb0;", "<anonymous>", "(Ltse;)Lfzb0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.internal.processor.PinProcessorKt$buildOutput$2", f = "PinProcessor.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinProcessorKt$buildOutput$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<czb0> $coveredA;
    final /* synthetic */ List<czb0> $coveredB;
    final /* synthetic */ List<qzb0> $selected;
    final /* synthetic */ List<qzb0> $uncovered;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinProcessorKt$buildOutput$2(List list, List list2, List list3, List list4, Continuation continuation) {
        super(2, continuation);
        this.$coveredA = list;
        this.$coveredB = list2;
        this.$uncovered = list3;
        this.$selected = list4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinProcessorKt$buildOutput$2(this.$coveredA, this.$coveredB, this.$uncovered, this.$selected, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinProcessorKt$buildOutput$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ArrayList m0 = kotlin.collections.a.m0(om91.d(this.$coveredB), om91.d(this.$coveredA));
        List<qzb0> list = this.$uncovered;
        List<qzb0> list2 = this.$selected;
        EmptyList emptyList = EmptyList.a;
        return new fzb0(m0, list, list2, emptyList, emptyList);
    }
}
