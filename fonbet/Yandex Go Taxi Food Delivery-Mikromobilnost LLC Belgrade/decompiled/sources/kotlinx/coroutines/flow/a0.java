package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a0 implements vpr {
    public final /* synthetic */ vpr a;

    public a0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(tpr tprVar, Continuation continuation) {
        FlowKt__MergeKt$flattenConcat$1$1$emit$1 flowKt__MergeKt$flattenConcat$1$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__MergeKt$flattenConcat$1$1$emit$1) {
            flowKt__MergeKt$flattenConcat$1$1$emit$1 = (FlowKt__MergeKt$flattenConcat$1$1$emit$1) continuation;
            int i2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__MergeKt$flattenConcat$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.L$0 = null;
                    flowKt__MergeKt$flattenConcat$1$1$emit$1.label = 1;
                    if (e.u(tprVar, this.a, flowKt__MergeKt$flattenConcat$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        flowKt__MergeKt$flattenConcat$1$1$emit$1 = new FlowKt__MergeKt$flattenConcat$1$1$emit$1(this, continuation);
        Object obj2 = flowKt__MergeKt$flattenConcat$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__MergeKt$flattenConcat$1$1$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
