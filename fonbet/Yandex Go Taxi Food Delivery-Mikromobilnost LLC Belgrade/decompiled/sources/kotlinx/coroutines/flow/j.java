package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ y6f0 a;

    public j(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$values$1$1$emit$1 flowKt__DelayKt$sample$2$values$1$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__DelayKt$sample$2$values$1$1$emit$1) {
            flowKt__DelayKt$sample$2$values$1$1$emit$1 = (FlowKt__DelayKt$sample$2$values$1$1$emit$1) continuation;
            int i2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__DelayKt$sample$2$values$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj == null) {
                        obj = vez0.b;
                    }
                    flowKt__DelayKt$sample$2$values$1$1$emit$1.L$0 = null;
                    flowKt__DelayKt$sample$2$values$1$1$emit$1.label = 1;
                    if (((x6f0) this.a).y.o(obj, flowKt__DelayKt$sample$2$values$1$1$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        flowKt__DelayKt$sample$2$values$1$1$emit$1 = new FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__DelayKt$sample$2$values$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__DelayKt$sample$2$values$1$1$emit$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
