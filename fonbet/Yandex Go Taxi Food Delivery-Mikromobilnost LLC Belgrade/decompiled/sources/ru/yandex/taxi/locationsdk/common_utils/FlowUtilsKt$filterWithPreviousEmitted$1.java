package ru.yandex.taxi.locationsdk.common_utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.common_utils.FlowUtilsKt$filterWithPreviousEmitted$1", f = "flowUtils.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class FlowUtilsKt$filterWithPreviousEmitted$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $predicate;
    final /* synthetic */ tpr $this_filterWithPreviousEmitted;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$filterWithPreviousEmitted$1(tpr tprVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_filterWithPreviousEmitted = tprVar;
        this.$predicate = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowUtilsKt$filterWithPreviousEmitted$1 flowUtilsKt$filterWithPreviousEmitted$1 = new FlowUtilsKt$filterWithPreviousEmitted$1(this.$this_filterWithPreviousEmitted, this.$predicate, continuation);
        flowUtilsKt$filterWithPreviousEmitted$1.L$0 = obj;
        return flowUtilsKt$filterWithPreviousEmitted$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$filterWithPreviousEmitted$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            tpr tprVar = this.$this_filterWithPreviousEmitted;
            ye yeVar = new ye(9, z, this.$predicate, vprVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
