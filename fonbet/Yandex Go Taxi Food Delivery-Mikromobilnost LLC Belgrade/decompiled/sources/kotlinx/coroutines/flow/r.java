package kotlinx.coroutines.flow;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public final class r implements vpr {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ vpr b;

    public r(vpr vprVar, Ref$IntRef ref$IntRef) {
        this.a = ref$IntRef;
        this.b = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        int i;
        if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
            flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$drop$2$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$drop$2$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$drop$2$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$drop$2$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj2);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                Ref$IntRef ref$IntRef = this.a;
                int i3 = ref$IntRef.element;
                if (i3 < 1) {
                    ref$IntRef.element = i3 + 1;
                    return zy11Var;
                }
                flowKt__LimitKt$drop$2$1$emit$1.L$0 = null;
                flowKt__LimitKt$drop$2$1$emit$1.label = 1;
                return this.b.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$drop$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$drop$2$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
